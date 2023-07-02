import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileReader {

    public static Question[] getQuestions(String fileName) {
        try {
            File questionFile = new File(fileName);
            Scanner questionLineReader = new Scanner(questionFile);
            int questionsAmount = 0;
            while (questionLineReader.hasNextLine()) {
                questionsAmount++;
                questionLineReader.nextLine();
            }
            questionLineReader.close();
            Question[] questionsArray = new Question[questionsAmount];

            Scanner questionReader = new Scanner(questionFile);
            int questionLineNumber = 0;
            while (questionReader.hasNextLine()) {
                String[] line = questionReader.nextLine().split("#");
                if (line.length != 8) {
                    System.out.println("  File not found! Try again.");
                    questionReader.close();
                    return null;
                }
                Question temp = new Question(line[0], line[1], line[2], line[3], line[4], line[5], line[6].charAt(0),
                        Character.getNumericValue(line[7].charAt(0)));
                questionsArray[questionLineNumber] = temp;
                questionLineNumber++;
            }
            questionReader.close();

            return questionsArray;

        } catch (FileNotFoundException e) {
        	System.out.println("  File not found! Try again.");
        }
        return null;
    }


    public static Participant[] getParticipants(String fileName) {
        try {
            File participantFile = new File(fileName);
            Scanner participantLineReader = new Scanner(participantFile);
            int participantAmount = 0;
            while (participantLineReader.hasNextLine()) {
                participantAmount++;
                participantLineReader.nextLine();
            }
            participantLineReader.close();
            Participant[] participantArray = new Participant[participantAmount];

            Scanner participantReader = new Scanner(participantFile);
            int participantLineNumber = 0;
            while (participantReader.hasNextLine()) {
                String[] line = participantReader.nextLine().split("#");
                if (line.length != 4) {
                    System.out.println("  File not found! Try again.");
                    participantReader.close();
                    return null;
                }
                Participant temp = new Participant(line[0], line[1], line[2], line[3]);
                participantArray[participantLineNumber] = temp;
                participantLineNumber++;
            }
            participantReader.close();

            return participantArray;
        } catch (FileNotFoundException e) {
        	System.out.println("  File not found! Try again.");
        }
        return null;
    }

    public static String[] getDictionary(String fileName) {
        try {
            File dict = new File(fileName);
            Scanner scan3 = new Scanner(dict);
            int lineCounter = 0;
            while (scan3.hasNextLine()) {
                scan3.nextLine();
                lineCounter++;
            }
            scan3.close();

            Scanner scan2 = new Scanner(dict);

            String[] dictionary = new String[lineCounter];
            int counter = 0;
            while (scan2.hasNextLine()) {
                dictionary[counter] = scan2.nextLine();
                counter++;
            }
            scan2.close();
            return dictionary;
        } catch (FileNotFoundException e) {
        	System.out.println("  File not found! Try again.");
        }
        return null;
    }

    public static String[] getStopWords(String fileName) {
        try {
            File stopWordsFile = new File(fileName);
            Scanner stopLineReader = new Scanner(stopWordsFile);
            int stopLineCounter = 0;
            while (stopLineReader.hasNextLine()) {
                stopLineCounter++;
                stopLineReader.nextLine();
            }
            stopLineReader.close();
            String[] stopWords = new String[stopLineCounter];

            Scanner stopReader = new Scanner(stopWordsFile);
            int arrCounter = 0;
            while (stopReader.hasNextLine()) {
                stopWords[arrCounter] = stopReader.nextLine();
                arrCounter++;
            }
            stopReader.close();

            return stopWords;
        } catch (FileNotFoundException e) {
        	System.out.println("  File not found! Try again.");
        }
        return null;
    }
}
