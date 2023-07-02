import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import enigma.core.Enigma;

public class project {
	public static enigma.console.Console cn = Enigma.getConsole("Who Wants to Be a Millionaire");
	
	public static String blank(int j, int length) // integration is needed length starting point
	{
		String blank = " ";
		for(int i = 0; i + length < j; i++)
		{
			blank = blank + " ";
		}
		return blank;
	}
	
	public static int[] ifelse (int s,int e, String temparr[][])
	{
		Random rnd = new Random();
		int [] qarr = new int[4];
		int marked = 0, rating, sum = 0;
		for(int i = 0; i < temparr.length; i++)
		{
			if(temparr[i][1].equalsIgnoreCase("T"))marked = i;
			else 
			{
				rating = rnd.nextInt(s, e);
				qarr[i] = rating;
				sum = sum + rating;
			}
		}
		qarr[marked] = 100 - sum;
		return qarr;
	}
	public static int [] audience(int a, String temparr[][])
	{
		int [] qarrnew = new int[4];
		switch(a) 
		{
		  case 1:
		  {
			  int []  qarr = ifelse(0,9,temparr);
			  for(int s = 0; s < qarrnew.length; s++) qarrnew[s] = qarr[s];
			  break;
		  }
		  case 2:
		  {
			  int []  qarr = ifelse(2,13,temparr);
			  for(int s = 0; s < qarrnew.length; s++) qarrnew[s] = qarr[s];
			  break;
		  }
		  case 3:
		  {
			  int []  qarr = ifelse(5,17,temparr);
			  for(int s = 0; s < qarrnew.length; s++) qarrnew[s] = qarr[s];
			  break;
		  }
		  case 4:
		  {
			  int []  qarr = ifelse(8,21,temparr);
			  for(int s = 0; s < qarrnew.length; s++) qarrnew[s] = qarr[s];
			  break;
		  }
		  case 5:
		  {
			  int []  qarr = ifelse(13,25,temparr);
			  for(int s = 0; s < qarrnew.length; s++) qarrnew[s] = qarr[s];
			  break;
		  }
		}
		return qarrnew;
	}
	

	public static void ascii(int Diffuculty) {
        
		switch(Diffuculty) {
		  case 1:
		  { cn.getTextWindow().output("         \n");
	        cn.getTextWindow().output("         \n");
	        cn.getTextWindow().output("         \n");
	        cn.getTextWindow().output("         \n");
	        cn.getTextWindow().output("         \n");
	        cn.getTextWindow().output("         \n");
	        cn.getTextWindow().output("   _     \n");
	        cn.getTextWindow().output("  (_)    \n");
	        cn.getTextWindow().output(" (___)   \n");
	        cn.getTextWindow().output(" _|_|_   \n");
	        cn.getTextWindow().output("(_____)  \n");
	        cn.getTextWindow().output("//____\\\\ \n");
			  break;
		  }
		  case 2:
		  {        cn.getTextWindow().output("|            |\n");
	        cn.getTextWindow().output("|            |\n");
	        cn.getTextWindow().output("|            |\n");
	        cn.getTextWindow().output("|  _  _  _   |\n");
	        cn.getTextWindow().output("| | || || |  |\n");
	        cn.getTextWindow().output("| |_______|  |\n");
	        cn.getTextWindow().output("| \\__ _ //  |\n");
	        cn.getTextWindow().output("|  |___|_|   |\n");
	        cn.getTextWindow().output("|  |_|___|   |\n");
	        cn.getTextWindow().output("|  |___|_|   |\n");
	        cn.getTextWindow().output("| (_______)  |\n");
	        cn.getTextWindow().output("| //_____ \\\\ |\n");
			  break;
		  }
		  case 3:
		  {        cn.getTextWindow().output("|            |\n");
	        cn.getTextWindow().output("|            |\n");
	        cn.getTextWindow().output("|            |\n");
	        cn.getTextWindow().output("|   ^^__     |\n");
	        cn.getTextWindow().output("| //  - \\_  |\n");
	        cn.getTextWindow().output("|<|    __<    |\n");
	        cn.getTextWindow().output("|<|    \\    |\n");
	        cn.getTextWindow().output("|<|     \\    |\n");
	        cn.getTextWindow().output("|<|______\\   |\n");
	        cn.getTextWindow().output("| _|____|_    |\n");
	        cn.getTextWindow().output("|(________)  |\n");
	        cn.getTextWindow().output("|//______\\   |\n");
			  break;
		  }
		  case 4:
		  {        cn.getTextWindow().output("|            |\n");
	        cn.getTextWindow().output("|   _()_     |\n");
	        cn.getTextWindow().output("| //____\\\\_  |\n");
	        cn.getTextWindow().output("|\\\\      //  |\n");
	        cn.getTextWindow().output("| \\\\____//   |\n");
	        cn.getTextWindow().output("|  (____)    |\n");
	        cn.getTextWindow().output("|   |  |     |\n");
	        cn.getTextWindow().output("|   |__|     |\n");
	        cn.getTextWindow().output("| //    \\\\   |\n");
	        cn.getTextWindow().output("| (______)   |\n");
	        cn.getTextWindow().output("|(________)  |\n");
	        cn.getTextWindow().output("| //_____\\\\  |\n");
	        

			  break;
		  }
		  case 5:
		  {	        cn.getTextWindow().output("|   .::.\n");
	        cn.getTextWindow().output("|   _::_\n");
	        cn.getTextWindow().output("|_//____\\_\n");
	        cn.getTextWindow().output("|\\\\      //\n");
	        cn.getTextWindow().output("| \\\\____//\n");
	        cn.getTextWindow().output("|  (____)\n");
	        cn.getTextWindow().output("|   |  |\n");
	        cn.getTextWindow().output("|   |__|\n");
	        cn.getTextWindow().output("|  //  \\\\  \n");
	        cn.getTextWindow().output("| (______)\n");
	        cn.getTextWindow().output("|(________)\n");
	        cn.getTextWindow().output("|//_______\\\\\n");
			  break;
		  }
		  case 6:   // winning
		  {
			  cn.getTextWindow().output("    .-''''''-.\n");
		        cn.getTextWindow().output("  .'          '.\n");
		        cn.getTextWindow().output(" //   O      O   \\\n");
		        cn.getTextWindow().output(":           `      :\\\n");
		        cn.getTextWindow().output("|                  |\n");
		        cn.getTextWindow().output(":    .------.     :\n");
		        cn.getTextWindow().output(" \\  '        '  //\n");
		        cn.getTextWindow().output("   '.          .'\n");
		        cn.getTextWindow().output("     '-......-'\n");
			  break;
		  }
		}
	}
	
	
	public static String[][] choicearr(Question[] questionsArray, int j)
	{
		String [][] temparr = new String[4][3];  // 2 > answer check 3 > edited check	
		temparr[0][0] = questionsArray[j].choice1;
		temparr[1][0] = questionsArray[j].choice2;
		temparr[2][0] = questionsArray[j].choice3;
		temparr[3][0] = questionsArray[j].choice4;
		temparr[0][1] = " ";
		temparr[1][1] = " ";
		temparr[2][1] = " ";
		temparr[3][1] = " ";	
		if("a".equalsIgnoreCase(Character.toString(questionsArray[j].answer))) temparr[0][1] = "T";
		else if("b".equalsIgnoreCase(Character.toString(questionsArray[j].answer))) temparr[1][1] = "T";
		else if("c".equalsIgnoreCase(Character.toString(questionsArray[j].answer))) temparr[2][1] = "T";
		else temparr[3][1] = "T";
		return temparr;
	}
	
	public static void questionwriter(String str1, String str2, String str3, String str4)
	{
		System.out.println("A)" + str1 + "   " + "B)" + str2);
		System.out.println("C)" + str3 + "   " + "D)" + str4);
	}
	
	public static void categoryDifficultyLevel(String[] categoryDifficulty, int questionLineNumber,
			String categoryOrdifficulty) {
		int[] printNumberOfQuestion = new int[questionLineNumber];
		String[] printCategory = new String[questionLineNumber];
		int counter, counter_same_words, index, type_counter = 0;
		for (int i = 0; i < questionLineNumber; i++) {
			counter = 0;
			for (int j = 0; j < questionLineNumber; j++) {
				if (categoryDifficulty[i].equals(categoryDifficulty[j])) {
					counter++;
				}
			}
			counter_same_words = 0;
			index = 0;
			while (index < i && counter_same_words < 2) {
				if (categoryDifficulty[index].equals(categoryDifficulty[i])) {
					counter_same_words++;
				}
				index++;
			}
			if (counter_same_words == 1) {
				printCategory[type_counter] = categoryDifficulty[i];
				printNumberOfQuestion[type_counter] = counter;
				type_counter++;
			}
		}
		String edit = "     ";
		System.out.println(" " + categoryOrdifficulty + "  -  The number of questions");
		System.out.println("__________________________________________________");
		for (int i = 0; i < type_counter; i++) {
			String temp = blank(20, printCategory[i].length());
			if (categoryOrdifficulty.length() > 10)
				temp = temp + edit;
			System.out.println(" " + printCategory[i] + temp + printNumberOfQuestion[i]);
		}
	}
	
	public static void Clear() {
		for (int i = 0; i < 40; i++) {
			cn.getTextWindow().output("                                                         ");
		}
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		Question[] questionsArray = {};
		Participant[] participantArray = {};
		boolean flag1 = false, flag2 = false, flagYes = false;
		String choice, file_load_question = " ", file_load_participant = " ";
		while (true) {
			cn.getTextWindow().setCursorPosition(0, 0);
			cn.getTextWindow().output("       ___________________________________________   \n");
			cn.getTextWindow().output("      |    _ __ ___    _____  _______  __   __    |\n");
			cn.getTextWindow().output("      |   | '__ _ \\  / ___\\\\ |'____ | | |  | |    |\n");
			cn.getTextWindow().output("      |   | |  | | | || __// | |  | | | |__| |    |\n");
			cn.getTextWindow().output("      |   |_|  |_| |_|\\____| |_|  |_|,|______|    |\n");
			cn.getTextWindow().output("      |___________________________________________|  \n");

			cn.getTextWindow().output("          ____________________________________  \n");
			cn.getTextWindow().output("         |                                    |  \n");
			cn.getTextWindow().output("         |       1 - Load questions           |  \n");
			cn.getTextWindow().output("         |____________________________________|  \n");
			cn.getTextWindow().output("          ____________________________________  \n");
			cn.getTextWindow().output("         |                                    |  \n");
			cn.getTextWindow().output("         |       2 - Load participants        |  \n");
			cn.getTextWindow().output("         |____________________________________|  \n");
			cn.getTextWindow().output("          ____________________________________  \n");
			cn.getTextWindow().output("         |                                    |  \n");
			cn.getTextWindow().output("         |       3 - Start competition        |  \n");
			cn.getTextWindow().output("         |____________________________________|  \n");
			cn.getTextWindow().output("          ____________________________________  \n");
			cn.getTextWindow().output("         |                                    |  \n");
			cn.getTextWindow().output("         |       4 - Show statics             |  \n");
			cn.getTextWindow().output("         |____________________________________|  \n");
			cn.getTextWindow().output("          ____________________________________  \n");
			cn.getTextWindow().output("         |                                    |  \n");
			cn.getTextWindow().output("         |       5 - Exit                     |  \n");
			cn.getTextWindow().output("         |____________________________________|  \n");

			cn.getTextWindow().output(" \n ");
			cn.getTextWindow().output("  Enter your choice : ");
		
			File filename = new File("answers_history.txt");
			FileWriter fw = new FileWriter(filename,true);
			if(flagYes==true) {
				choice = "3";
			}
			else{
				choice = cn.readLine();
			}
			switch (choice) {
				case "1":
					flag1 = true;
					cn.getTextWindow().setCursorPosition(0, 0);
					Clear();
					cn.getTextWindow().setCursorPosition(0, 0);
					cn.getTextWindow().output("                    LOAD QUESTIONS             \n");
					cn.getTextWindow().output("             ___________________________  \n");
					cn.getTextWindow().setCursorPosition(0, 3);

					boolean flagFileFound = false;
					while (!flagFileFound) {
						System.out.print("  Enter the name of the file to load it: ");
						file_load_question = cn.readLine();

						questionsArray = FileReader.getQuestions(file_load_question);
						if (questionsArray != null)
							flagFileFound = true;
					}
					SpellChecker.check(questionsArray);
					Cloud.getWords(questionsArray);
					String[] categoryword = new String[questionsArray.length];
					String[] difficultLevelArray = new String[questionsArray.length];
					for (int i = 0; i < questionsArray.length; i++) {
						categoryword[i] = questionsArray[i].category;
						difficultLevelArray[i] = Integer.toString(questionsArray[i].difficulty);
					}
					System.out.println(" ");
					categoryDifficultyLevel(categoryword, questionsArray.length, "Category");
					System.out.println(" ");
					categoryDifficultyLevel(difficultLevelArray, questionsArray.length,
							"Difficulty Level ");
					System.out.println("Pleas press any key to return to menu...");
					cn.readLine();
					Clear();
					break;
				case "2":
					if (flag1) {
						cn.getTextWindow().setCursorPosition(0, 0);
						Clear();
						cn.getTextWindow().setCursorPosition(0, 0);
						cn.getTextWindow().output("                    LOAD PARTICIPANTS             \n");
						cn.getTextWindow().output("             ______________________________  \n");
						cn.getTextWindow().setCursorPosition(0, 3);

						boolean flagFileFound2 = false;
						while (!flagFileFound2) {
							System.out.print("  Enter the name of the file to load it: ");
							file_load_participant = cn.readLine();

							participantArray = FileReader.getParticipants(file_load_participant);
							if (participantArray != null)
								flagFileFound2 = true;
						}
						cn.getTextWindow().setCursorPosition(0, 0);
						Clear();
						flag2 = true;
					}
					break;
				case "3":
				    flagYes=false;
					if (flag1 && flag2) {
						cn.getTextWindow().setCursorPosition(0, 0);
						Clear();
						boolean flagDoubleDip = false, flagFiftyFifty = false, flagWrongAnswer = false,
								flagFirstWrongAnswer = false, flagAsktheaudience = false;

						cn.getTextWindow().setCursorPosition(0, 0);
						Random rContestant = new Random();
						int contestant;
						while (true) {
							contestant = rContestant.nextInt(participantArray.length);
							if (!participantArray[contestant].isParticipated()) {
								System.out.println(" Contestant : " + participantArray[contestant].getName());
								participantArray[contestant].setParticipated(true);
								break;
							}
						}
						int questCounter = 0;
						int balance = 0;
						for (int i = 0; i < questionsArray.length; i++) {
							questionsArray[i].setShowed(false);
						}
						while (questCounter < 5) {
							cn.getTextWindow().setCursorPosition(0, 2);
							questCounter++;
							System.out.println(
									"_________________________________________________________________________\n |            |_______\n | Word Cloud |       |");
							System.out.println(
									" |____________|      \\ /\n_____________________________________________________________________________ ");

							Random rnd = new Random();
							for (int j = 0; j < 10; j++) {
								int num = rnd.nextInt(questionsArray.length);
								if (!questionsArray[num].isShowed() && questionsArray[num].difficulty == questCounter) {
									System.out.print(questionsArray[num].cloud + "   ");
									questionsArray[num].setShowed(true);
								} else
									j--;
							}
							boolean flag3 = false;
							int questionNo = 0;
							int time =20;
							String stage1, stage2, stage3;
							if (!flagDoubleDip) stage1 = "Double Dip(dd)";
							else stage1 = "-";
							if (!flagFiftyFifty) stage2 = "50%(f)";
							else stage2 = "-";
							if (!flagAsktheaudience) stage3 = "Ask The Audience(l)";
							else stage3 = "-";
							int tempint = Integer.toString(balance + 1).length();
							tempint = tempint + 7;
							String blankk1 = blank(20,tempint);
							System.out.println(" ");
							System.out.println("       ______________________");
							System.out.println("      |                      |");
							System.out.println("      | Money:$" + balance + blankk1 +"|");
							System.out.println("      |                      |");
							System.out.println("      | Remaining Time: "+time+"sec|");
							System.out.println("      |                      |");
							System.out.println("      | " + stage3 + blank(21,stage3.length() + 1)+"|");
							System.out.println("      | " + stage1 + blank(21,stage1.length() + 1) + "|");
							System.out.println("      | " + stage2 + blank(21,stage2.length() + 1) + "|");
							System.out.println("      |______________________|");
							do {
								System.out.print(
										"\n_____________________________________________________________________________\n>Enter your selection: ");
								String cloudChoice = cn.readLine();

								for (int i = 0; i < questionsArray.length; i++) {
									if (questionsArray[i].cloud.toString().equalsIgnoreCase(cloudChoice)) {
										questionNo = i;
										flag3 = true;
										break;
									}
								}
							} while (!flag3);
							String ansChoice;
							String[][] temp_array = choicearr(questionsArray, questionNo);
							do {
								System.out.println("Q" + questCounter + "-" + questionsArray[questionNo].text);
								questionwriter(temp_array[0][0], temp_array[1][0], temp_array[2][0], temp_array[3][0]);
								System.out.print("\n>Enter your choice (E:Exit):");
								
								ansChoice = cn.readLine();
								if (ansChoice.equalsIgnoreCase("dd") && flagDoubleDip == false) {
									flagDoubleDip = true;
									flagFirstWrongAnswer = false;
									System.out
											.println("You have used your Double Dip lifeline, now choose your answer.");

								} else if (ansChoice.equalsIgnoreCase("f") && flagFiftyFifty == false) {
									flagFiftyFifty = true;
									System.out
											.println("You have used your 50% lifeline, now choose your answer.");
									Random r = new Random();
						            int rand = 0;
						            int counter = 0;
						            while (counter != 2) 
						            {
						                rand = r.nextInt(temp_array.length);
						                if(!(temp_array[rand][1].equalsIgnoreCase("T")) && temp_array[rand][2] != "Y")
						                {
						                	temp_array[rand][0] = blank(temp_array[rand][0].length() , 0);
						                	temp_array[rand][2] = "Y";
						                	counter ++;
						                }
						            }
								}
								else if (ansChoice.equalsIgnoreCase("L") && flagAsktheaudience == false)
								{
									flagAsktheaudience = true;
									System.out.println(" ");
									System.out.println("You have used your 'Ask to Audience' lifeline!");
									System.out.println("         The rating according the answers of Audience ");
									System.out.println("               ______________________________         ");
									int [] qarr = audience(questCounter, temp_array);
									
									for(int x = 0; x < qarr.length; x++)
									{
										String temp = " "; 
										if(x == 0) temp = "  A -  % ";
										else if(x == 1) temp = "  B -  % ";
										else if(x == 2) temp = "  C -  % ";
										else if(x == 3) temp = "  D -  % ";
										System.out.println(temp + qarr[x]);
									}
									System.out.println(" ");
									
								}
								else if(time==0) {
									flagWrongAnswer=true;
								}
								else if (ansChoice
										.equalsIgnoreCase(Character.toString(questionsArray[questionNo].answer))) {
									System.out.println("Correct answer!");
									ascii(questCounter);
									participantArray[contestant].isCorrect();
									questionsArray[questionNo].setAnswered();
									if (flagDoubleDip == true) {
										flagFirstWrongAnswer = true;
									}
									if (questCounter == 1) {
										balance = 20000;
									} else if (questCounter == 2) {
										balance = 100000;
									} else if (questCounter == 3) {
										balance = 250000;
									} else if (questCounter == 4) {
										balance = 500000;
									} else if (questCounter == 5) {
										balance = 1000000;
										System.out.println("Congratulations, you have won $1,000,000!");
										String yesorNo=" ";
										while(!(yesorNo.equalsIgnoreCase("y") || yesorNo.equalsIgnoreCase("n"))) {
											System.out.print(">Would you like to continue with the next contestant? (Y/N): ");  
											yesorNo=cn.readLine();
										}
										if(yesorNo.equalsIgnoreCase("y")) {
											flagYes=true;
											flagWrongAnswer = true;
										}
										break;		
									}
								} else if (ansChoice.equalsIgnoreCase(Character.toString('e'))) {
									flagWrongAnswer = true;
									System.out.println("Congratulations! You have at least won $" + balance);
								} else {
									if (flagDoubleDip == true && flagFirstWrongAnswer == false) {
										flagFirstWrongAnswer = true;
										System.out.println("Wrong answer!Please Make Your Second Choice!");
                                        if (ansChoice.equalsIgnoreCase("a")) {
                                            temp_array[0][0] = blank(questionsArray[questionNo].choice1.length(),0);
                                        } else if (ansChoice.equalsIgnoreCase("b")) {
                                            temp_array[1][0] = blank(questionsArray[questionNo].choice2.length(),0);
                                        } else if (ansChoice.equalsIgnoreCase("c")) {
                                            temp_array[2][0] = blank(questionsArray[questionNo].choice3.length(),0);
                                        } else if (ansChoice.equalsIgnoreCase("d")) {
                                            temp_array[3][0] = blank(questionsArray[questionNo].choice4.length(),0);
                                        }
										ansChoice = "dd";
									} else {
										flagWrongAnswer = true;
										System.out.println("Wrong answer!");
										if (questCounter == 5) {
											System.out.println("Congratulations, you have won $500,000!");
										} else if (questCounter == 4 || questCounter == 3) {
											System.out.println("Congratulations, you have won $100,000!");
										} else {
											System.out.println("You have won $0");
											questCounter = 6;
											ascii(questCounter);
										}
										fw.write((questionNo+1) + "#" + (contestant+1) + "#" + !flagWrongAnswer + "\n");
										String yesorNo=" ";
										while(!(yesorNo.equalsIgnoreCase("y") || yesorNo.equalsIgnoreCase("n"))) {
											System.out.print(">Would you like to continue with the next contestant? (Y/N): ");  
											yesorNo=cn.readLine();
										}
										if(yesorNo.equalsIgnoreCase("y")) {
											flagYes=true;
											flagWrongAnswer = true;
										}
										break;				
									}
								}
							} while (ansChoice.equalsIgnoreCase("f") || ansChoice.equalsIgnoreCase("dd")|| ansChoice.equalsIgnoreCase("L"));
							if (flagWrongAnswer)
								break;
							cn.readLine();
							cn.getTextWindow().setCursorPosition(0, 0);
							Clear();
							fw.write((questionNo+1) + "#" + (contestant+1) + "#" + !flagWrongAnswer + "\n");
						}
						System.out.println("Please press any key to continue...");
						cn.readLine();
						cn.getTextWindow().setCursorPosition(0, 0);
						Clear();
					}
					fw.close();
					break;
				case "4":
					Clear();
					cn.getTextWindow().setCursorPosition(0, 0);
					System.out.println("                    STATISTICS             \n");
					System.out.println("             ___________________________  \n\n");
					System.out.println(
							"The most successful contestant: " + Statistics.getBestContestant(participantArray));
					System.out.println("The category with the most correctly answered: "
							+ Statistics.getMostAnsCategory(questionsArray));
					System.out.println("The category with the most badly  answered: "
							+ Statistics.getLeastAnsCategory(questionsArray));
					System.out.println("Age<=25" + " -> " + Statistics.getUnderTF(participantArray) + "  " + "25<Age<50"
							+ " -> " + Statistics.getbetweenTFF(participantArray) + "  " + "Age=>50"
							+ " -> " + Statistics.getAboveF(participantArray));
					System.out.println(
                            "The city with the highest number of participants: "
                                    + Statistics.getCity(participantArray));
					System.out.println("Please press any key to return to menu...");
					cn.readLine();
					cn.getTextWindow().setCursorPosition(0, 3);
					Clear();
					break;
				case "5":
					Clear();
					cn.getTextWindow().setCursorPosition(0, 0);
					System.out.println("   _________________________ ");
					System.out.println("  |                         |");
					System.out.println("  |         EXITING...      |");
					System.out.println("  |_________________________|");
					Thread.sleep(1000);
					System.exit(0);
					break;
				default:
					cn.getTextWindow().setCursorPosition(0, 0);
					Clear();
					cn.getTextWindow().setCursorPosition(0, 0);
					System.out.println("   _________________________ ");
					System.out.println("  |                         |");
					System.out.println("  |         ERROR           |");
					System.out.println("  |_________________________|");
					cn.readLine();
					cn.getTextWindow().setCursorPosition(0, 0);
					Clear();
					break;
			}
		}
	}
}