public class Statistics {

    public static String getBestContestant(Participant[] participants) {
        int higestScore = 0;
        String bestContestant = "";
        for (int i = 0; i < participants.length; i++) {
            if (participants[i].getCorrect() > higestScore) {
                higestScore = participants[i].getCorrect();
                bestContestant = participants[i].getName();
            }
        }
        return bestContestant;
    }

    public static double getUnderTF(Participant[] participants) {
        int sumCorrect = 0, numParticipants = 0;
        for (int i = 0; i < participants.length; i++) {
            if (participants[i].getAge() <= 25) {
                sumCorrect += participants[i].getCorrect();
                numParticipants++;
            }
        }
        if (numParticipants == 0)
            return 0;
        else
            return (double) (sumCorrect / numParticipants);
    }

    public static double getbetweenTFF(Participant[] participants) {
        int sumCorrect = 0, numParticipants = 0;
        for (int i = 0; i < participants.length; i++) {
            if (participants[i].getAge() > 25 && participants[i].getAge() < 50) {
                sumCorrect += participants[i].getCorrect();
                numParticipants++;
            }
        }
        if (numParticipants == 0)
            return 0;
        else
            return (double) (sumCorrect / numParticipants);
    }

    public static double getAboveF(Participant[] participants) {
        int sumCorrect = 0, numParticipants = 0;
        for (int i = 0; i < participants.length; i++) {
            if (participants[i].getAge() >= 50) {
                sumCorrect += participants[i].getCorrect();
                numParticipants++;
            }
        }
        if (numParticipants == 0)
            return 0;
        else
            return (double) (sumCorrect / numParticipants);
    }

    public static String getMostAnsCategory(Question[] questions) {
        String[] categoryArr = getCategories(questions);
        int[] correctAnsArr = getCorrAns(questions, categoryArr);

        int higest = 0, index = 0;
        for (int i = 0; i < correctAnsArr.length; i++) {
            if (correctAnsArr[i] > higest) {
                higest = correctAnsArr[i];
                index = i;
            }
        }
        return categoryArr[index];
    }

    public static String getLeastAnsCategory(Question[] questions) {
        String[] categoryArr = getCategories(questions);
        int[] correctAnsArr = getCorrAns(questions, categoryArr);

        int lowest = correctAnsArr[0], index = 0;
        for (int i = 0; i < correctAnsArr.length; i++) {
            if (correctAnsArr[i] < lowest) {
                lowest = correctAnsArr[i];
                index = i;
            }
        }
        return categoryArr[index];
    }

    private static String[] getCategories(Question[] questions) {
        String categories = "";
        for (int i = 0; i < questions.length; i++) {
            if (!categories.contains(questions[i].category)) {
                categories += questions[i].category + " ";
            }
        }
        String[] categoryArr = categories.split(" ");
        return categoryArr;
    }

    private static int[] getCorrAns(Question[] questions, String[] categoryArr) {
        int[] correctAnsArr = new int[categoryArr.length];
        for (int i = 0; i < categoryArr.length; i++) {
            correctAnsArr[i] = 0;
            for (int j = 0; j < questions.length; j++) {
                if (categoryArr[i].equalsIgnoreCase(questions[j].category)) {
                    correctAnsArr[i] += questions[j].answered;
                }
            }
        }

        return correctAnsArr;
    }
    public static String getCity(Participant[] participants) {
        String city = "";
        for (int i = 0; i < participants.length; i++) {
            if (!city.contains(participants[i].getCity())) {
                city += participants[i].getCity() + " ";
            }
        }
        String[] cityArr = city.split(" ");

        int[] numberOfCityArr = new int[cityArr.length];
        for (int i = 0; i < cityArr.length; i++) {
            numberOfCityArr[i] = 0;
            for (int j = 0; j < participants.length; j++) {
                if (cityArr[i].equalsIgnoreCase(participants[j].getCity())) {
                    numberOfCityArr[i]++;
                }
            }
        }

        int higest = 0, index = 0;
        for (int i = 0; i < numberOfCityArr.length; i++) {
            if (numberOfCityArr[i] > higest) {
                higest = numberOfCityArr[i];
                index = i;
            }
        }
        return cityArr[index];
    }
}
