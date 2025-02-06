package com.tbc.QuizApplication;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Quiz {
	List<Question> ques;
	Scanner sc=new Scanner(System.in);
	
	Quiz(){
		ques=Arrays.asList(
	            new Question("What is the capital of Japan?", new String[]{"Beijing", "Seoul", "Tokyo", "Bangkok"}, 2),
	            new Question("Who invented the telephone?", new String[]{"Alexander Graham Bell", "Thomas Edison", "Nikola Tesla", "James Watt"}, 0),
	            new Question("Which planet is known as the Morning Star?", new String[]{"Mars", "Venus", "Jupiter", "Mercury"}, 1),
	            new Question("What is the hardest natural substance on Earth?", new String[]{"Iron", "Gold", "Diamond", "Platinum"}, 2),
	            new Question("Which is the smallest country in the world?", new String[]{"Monaco", "Vatican City", "Liechtenstein", "San Marino"}, 1),
	            new Question("Who discovered gravity?", new String[]{"Galileo Galilei", "Isaac Newton", "Albert Einstein", "Stephen Hawking"}, 1),
	            new Question("What is the capital of Canada?", new String[]{"Toronto", "Ottawa", "Vancouver", "Montreal"}, 1),
	            new Question("What is 12 * 8?", new String[]{"96", "88", "104", "92"}, 0),
	            new Question("Which ocean is the largest?", new String[]{"Atlantic", "Indian", "Pacific", "Arctic"}, 2),
	            new Question("What is the main gas in Earth's atmosphere?", new String[]{"Oxygen", "Carbon Dioxide", "Nitrogen", "Helium"}, 2),
	            new Question("Which is the longest river in the world?", new String[]{"Amazon", "Nile", "Yangtze", "Mississippi"}, 1),
	            new Question("What does CPU stand for?", new String[]{"Central Processing Unit", "Computer Processing Unit", "Central Power Unit", "Core Processing Unit"}, 0),
	            new Question("Who developed Java?", new String[]{"Microsoft", "Sun Microsystems", "Google", "IBM"}, 1),
	            new Question("Which gas do plants absorb?", new String[]{"Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen"}, 1),
	            new Question("What is the boiling point of water?", new String[]{"90°C", "100°C", "110°C", "120°C"}, 1),
	            new Question("Who wrote 'Romeo and Juliet'?", new String[]{"Charles Dickens", "William Shakespeare", "Leo Tolstoy", "Mark Twain"}, 1),
	            new Question("What is the largest mammal?", new String[]{"Elephant", "Blue Whale", "Giraffe", "Hippopotamus"}, 1),
	            new Question("Which planet is known as the Red Planet?", new String[]{"Earth", "Mars", "Jupiter", "Venus"}, 1),
	            new Question("How many continents are there?", new String[]{"5", "6", "7", "8"}, 2),
	            new Question("Which is the fastest land animal?", new String[]{"Cheetah", "Leopard", "Tiger", "Horse"}, 0),
	            new Question("Who painted the Mona Lisa?", new String[]{"Vincent van Gogh", "Leonardo da Vinci", "Pablo Picasso", "Michelangelo"}, 1),
	            new Question("Which metal is liquid at room temperature?", new String[]{"Iron", "Mercury", "Lead", "Silver"}, 1),
	            new Question("What is the square root of 81?", new String[]{"7", "8", "9", "10"}, 2),
	            new Question("Who was the first President of the United States?", new String[]{"Abraham Lincoln", "Thomas Jefferson", "George Washington", "John Adams"}, 2),
	            new Question("What does HTTP stand for?", new String[]{"HyperText Transfer Protocol", "Hyperlink Text Process", "High Transmission Text Protocol", "Hyper Transfer Text Program"}, 0),
	            new Question("Which element has the chemical symbol 'O'?", new String[]{"Oxygen", "Osmium", "Ozone", "Oxalate"}, 0),
	            new Question("Which country has won the most FIFA World Cups?", new String[]{"Brazil", "Germany", "Argentina", "France"}, 0),
	            new Question("What is the largest planet in our Solar System?", new String[]{"Earth", "Saturn", "Jupiter", "Neptune"}, 2),
	            new Question("Who developed the theory of relativity?", new String[]{"Isaac Newton", "Nikola Tesla", "Albert Einstein", "Galileo Galilei"}, 2),
	            new Question("What is 15 * 6?", new String[]{"80", "85", "90", "95"}, 2),
	            new Question("How many bones are in the adult human body?", new String[]{"202", "206", "210", "215"}, 1),
	            new Question("What year did World War II end?", new String[]{"1943", "1944", "1945", "1946"}, 2),
	            new Question("Which country is the Taj Mahal in?", new String[]{"Pakistan", "India", "Bangladesh", "Nepal"}, 1),
	            new Question("Which bird is known for its ability to mimic human speech?", new String[]{"Eagle", "Parrot", "Hawk", "Crow"}, 1),
	            new Question("What is the primary language spoken in Brazil?", new String[]{"Spanish", "Portuguese", "French", "Italian"}, 1),
	            new Question("Which is the highest mountain in the world?", new String[]{"K2", "Mount Everest", "Kangchenjunga", "Makalu"}, 1),
	            new Question("Who was the first person to walk on the moon?", new String[]{"Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "John Glenn"}, 1),
	            new Question("What is the chemical symbol for sodium?", new String[]{"So", "Sa", "Na", "N"}, 2),
	            new Question("How many sides does a hexagon have?", new String[]{"4", "5", "6", "7"}, 2),
	            new Question("What is the longest bone in the human body?", new String[]{"Femur", "Tibia", "Fibula", "Humerus"}, 0),
	            new Question("Which country is famous for the Great Wall?", new String[]{"Japan", "India", "China", "Korea"}, 2),
	            new Question("Which blood type is the universal donor?", new String[]{"A", "B", "O", "AB"}, 2),
	            new Question("What is 144 ÷ 12?", new String[]{"10", "11", "12", "13"}, 2),
	            new Question("Which is the most spoken language in the world?", new String[]{"English", "Spanish", "Mandarin", "Hindi"}, 2),
	            new Question("Which desert is the largest in the world?", new String[]{"Sahara", "Gobi", "Kalahari", "Arabian"}, 0),
	            new Question("Which programming language is primarily used for Android development?", new String[]{"Python", "Swift", "Kotlin", "Java"}, 3)
	        );
	}
	
	void takeQuiz() {
		Collections.shuffle(ques);
		List<Question> questions=ques.subList(0,20);
		
		int score=0;
		
		for(int i=0;i<20;i++) {
			Question q=questions.get(i);
			
			System.out.println("Question "+(i+1)+" :"+q.question);
			
			for(int j=0;j<q.options.length;j++) {
				System.out.println("Option "+(j+1)+" :"+q.options[j]);
			}
			System.out.print("Enter Your Answer (1-4): ");
			int option=sc.nextInt()-1;
			
			if(option==q.answer) {
				score++;
			}
			
			System.out.println();
		}
		
		System.out.println("You Got "+score+" marks...!");
	}
}
