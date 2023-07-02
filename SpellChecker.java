public class SpellChecker {

	public static void check(Question[] questionsArray) {
		String[] dictionary = FileReader.getDictionary("dictionary.txt");
		String line = "";
		//We get a string by concatenating the questions' text parts
		for (int i = 0; i < questionsArray.length; i++) {
			line = questionsArray[i].text;

			int counter2 = 0;
			String tempDict = "", tempWord = "";
			Boolean flag = false;
			//We split the string in order to get an array which contains the words of the text parts all combined
			String[] words = line.split(" ");
			for (int j = 0; j < words.length; j++) {
				//We check if the word that got picked includes any special characters
				if(words[j].matches("[a-zA-Z]+")) {
					flag = false;
					for (int k = 0; k < dictionary.length; k++) {
						//We check if the word already exists in the dictionary
						if (words[j].equalsIgnoreCase(dictionary[k])) {
							flag = true;
							break;
						}
					}
					//If the  word does not exist in the dictionary or includes special characters then it will get inside
					if (!flag) {
						for (int k = 0; k < dictionary.length; k++) {
							//This counter counts the amount of different letters 
							counter2 = 0;
							if (words[j].length() == dictionary[k].length()) {
								for (int l = 0; l < words[j].length(); l++) {
									//If there is a differency between the picked two indexes the counter increases
									if (words[j].toLowerCase().charAt(l) != dictionary[k].toLowerCase().charAt(l)) {
										counter2++;
										//We keep the different letters in these variables
										tempWord += words[j].toLowerCase().charAt(l);
										tempDict += dictionary[k].toLowerCase().charAt(l);
									}
									//If there happens to be more then 2 differencies then we do not try to correct it anymore
									if (counter2 > 2) {
										tempDict = "";
										tempWord = "";
										break;
									}
								}
							}
							//We check if the reversed variables are the same, if they are then the letters are reversed
							if (counter2 == 1 || (counter2 == 2 && tempWord.charAt(0) == tempDict.charAt(1)
									&& tempWord.charAt(1) == tempDict.charAt(0))) {
								questionsArray[i].text = questionsArray[i].text.replace(words[j], dictionary[k]);
								break;
							}
						}
					}
				}
			}
		}
	}
}