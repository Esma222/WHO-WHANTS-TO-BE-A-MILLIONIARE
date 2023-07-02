import java.util.Random;

public class Cloud {
	public static int Debugging(String[] temparr) 
    {
        int check = 0;
        for(int i = 0; i < temparr.length; i++) 
        {
            if(temparr[i].length() > 2)
            {
                check = 1;
                break;
            }
        }
        return check;

        // this question will not have cloud word if stopwords contains all of the words of the question.
    }
    public static void getWords(Question[] questionsArray) {
        String[] stopWords = FileReader.getStopWords("stop_words.txt");

        String alphabet = "abcdefghijklmnopqrstuvwxyz'";
        String blank = " ";
        String blank2 = "  ";
        int counter =0 ;
        for (int i = 0; i < questionsArray.length; i++) {
            String tempStr = questionsArray[i].text;

            for (int j = 0; j < questionsArray[i].text.length(); j++) {

                String tempChar = questionsArray[i].text.substring(j, j + 1);
                if (!alphabet.contains(tempChar.toLowerCase())) {
                    tempStr = tempStr.replace(tempChar, blank);
                }
            }
            while (tempStr.contains(blank2)) {
                tempStr = tempStr.replaceAll(blank2, blank);
            }

            String[] tempArray = tempStr.split(" ");

            for (int j = 0; j < tempArray.length; j++) {
                for (int k = 0; k < stopWords.length; k++) {
                    if (tempArray[j].equalsIgnoreCase(stopWords[k])) {
                        tempArray[j] = "";
                        break;
                    }
                }
            }

            String cloudStr = "";
            Random r = new Random();
            int rand = 0;
            while (cloudStr.equals("")) {
                rand = r.nextInt(tempArray.length);
                cloudStr = tempArray[rand];
                rand = r.nextInt(tempArray.length);
                cloudStr = tempArray[rand];
				counter++;
                if(counter > 30) 
                {
                    int check = Debugging(tempArray);
                    if(check == 0) break;
                }
            }
            questionsArray[i].setCloud(cloudStr.toLowerCase());
        }
    }
}