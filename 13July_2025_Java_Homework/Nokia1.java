import java.util.Scanner;
public class Nokia1 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
    String menu = """ 
        1. Phonebook 
        2. Messages 
        3. Chat 
        4. Call register 
        5. Tones 
        6. Settings 
        7. Call divert 
        8. Games 
        9. Calculator 
        10. Remainders 
        11. Clock 
        12. Profiles 
        13. SIM services
        14. Exit
        """ ;
        System.out.println(menu); 
     
        System.out.println("Which of the Menu functions do you want?"); 
        int menuSelect = input.nextInt();
	   
	   if(menuSelect == 1) {
	       String phoneBook = """
	       1. Search
	       2. Service Nos.
	       3. Add name
	       4. Erase
	       5. Edit
	       6. Assign tone
	       7. Send b'card
	       8. Options
	       9. Speed dials
	      10. Voice tags
	       """ ;
	    System.out.println(phoneBook); 
	    int menuPhonebookSelect = input.nextInt();
	    
	    switch(menuPhonebookSelect) {
		 case 1:
	         System.out.println("Search for contacts here"); break;
	      case 2: 
	         System.out.println("Get Service Nos here"); break;
	      case 3:          
	         System.out.println("Add contact's name here "); break;
	      case 4: 
	         System.out.println("Erase a contact here"); break;
	      case 5: 
	         System.out.println("Edit a contact here"); break;
	      case 6: 
	         System.out.println("Assign tone here"); break;
	      case 7: 
	         System.out.println("Send b'card here"); break;
	      case 8:
	         System.out.println("Options"); 
	         System.out.println("1. Type of view" + "\n" + "2. Memory Status "); 
	           System.out.println("Which of the Options do you need"); 
	           int optionsSelect = input.nextInt(); 
	              if(optionsSelect == 1) {
	                 System.out.println("Select View Types Here");
	              } else if(optionsSelect == 2) {
	                 System.out.println("See Memory Status");
	                 }
	                 break;
	      case 9: 
	         System.out.println("Make your speed dials here"); break;
	      case 10: 
	         System.out.println("Do your voice tags here"); break;
	      default:
	         System.out.println("Invalid Input");

	    }

	   } else if(menuSelect == 2) {
	       System.out.println("""
	       1. Write messages
	       2. Inbox
	       3. Outbox
	       4. Picture messages
	       5. Templates
	       6. Smileys
	       7. Message settings
	       8. Info service
	       9. Voice mailbox number
	      10. Service command editor
	       """);
	      System.out.println("Select a Message function?"); 
	      int menuMessageSelect = input.nextInt();
	      
	      switch(menuMessageSelect) {
	      case 1: 
	         System.out.println("Write messages here"); break;
	      case 2: 
	         System.out.println("See received messages here"); break;
	      case 3:          
	         System.out.println("See sent messages here"); break;
	      case 4: 
	         System.out.println("See picture messages here"); break;
	      case 5: 
	         System.out.println("Select message templates of your choice here"); break;
	      case 6: 
	         System.out.println("Select Smileys to use for your message here"); break;
	      case 7: 
	         System.out.println("Message settings"); 
	         System.out.println("1. Set 1" + "\n" + "2. Common "); 
	           System.out.println("Which of the Message settings do you need"); 
	           int messageSettingsSelect = input.nextInt(); 
	              if(messageSettingsSelect == 1) {
	                 System.out.println("1. Message centre number" + "\n" + "2. Messages sent as" + "\n" + "3. Message validity");
	              } else {
	                 System.out.println("1. Delivery reports" + "\n" + "2. Reply via same centre" + "\n" + "3. Character Support");
	                 }
	                 break;
	      case 8:
	         System.out.println("Welcome to Info service"); break;
	      case 9: 
	         System.out.println("Welcome to mailbox number"); break;
	      case 10: 
	         System.out.println("Welcome to Service command editor"); break;
	      default:
	         System.out.println("Invalid Input");
	     }
	     
	     } else if(menuSelect == 3) {
	          System.out.println("Chat");
	       
	    
	    
	     } else if(menuSelect == 4) {
	         boolean back = false;
	         while (!back) {
              	  System.out.println("""
		          1. Missed calls
		          2. Received calls
		          3. Dialled numbers
		          4. Erase recent call lists
		          5. Show call duration
		          6. Show call costs
		          7. Call cost settings
		          8. Prepaid credit
		          9. Back
		          """);
		      System.out.println("Select a Call Register function?"); 
		      int menuCallRegisterSelect = input.nextInt();
		      
		      switch(menuCallRegisterSelect) {
		      case 1: 
		         System.out.println("See Missed calls here"); break;
		      case 2: 
		         System.out.println("See Received calls here"); break;
		      case 3:          
		         System.out.println("See numbers you have dialled"); break;
		      case 4: 
		         System.out.println("Erase recent call lists here"); break;
		      case 5: 
		         System.out.println("Navigate Call duration here"); 
		            System.out.println(""" 
		            1. Last call duration
		            2. All calls' duration
		            3. Received calls' duration
		            4. Dialled calls' duration
		            5. Clear timers
		            """); 
		         System.out.println("Which of the Call duration do you need"); 
		         int callDurationSelect = input.nextInt(); 
		            if(callDurationSelect == 1) {
		               System.out.println("See Last call duration here");
		            } else if (callDurationSelect == 2) {
		               System.out.println("See All calls' duration");
		            } else if (callDurationSelect == 3) {
		               System.out.println("See Received calls' duration");
				 } else if (callDurationSelect == 4) {
		               System.out.println("See Dialled calls' duration");
				 } else if (callDurationSelect == 5) {
		               System.out.println(" Clear timers here");
		              }
		       break;
		      case 6: 
		         System.out.println("Navigate your call costs here");   
		            System.out.println("1. Last call cost" + "\n" + "2. All calls' cost" + "\n" + "3. Clear counters"); 
		         System.out.println("Which of the Show calls costs do you need"); 
		         int showCallsCostsSelect = input.nextInt(); 
		            if(showCallsCostsSelect == 1) {
		               System.out.println("See Last call cost Here");
		            } else if(showCallsCostsSelect == 2) {
		               System.out.println("See All calls' cost");
		            } else if(showCallsCostsSelect == 3) {
		               System.out.println("Clear timers here");
		              }
		       break;
		      case 7: 
		         System.out.println("Navigate cost settings here");
		            System.out.println("1. Call cost limit" + "\n" + "2. Show costs in");
		         System.out.println("Which of the Call cost settings do you need");
		         int callCostSettingsSelect = input.nextInt();
		            if(callCostSettingsSelect == 1) 
		               System.out.println("Set Call cost limit here"); 
		            else
		               System.out.println("See Show costs in here");
		        break;
			case 8:
				System.out.println("Displays Prepaid credit"); break;
			default:
		         System.out.println("Invalid Input");
		      }

		   }	
	    
	    } else if(menuSelect == 5) {
	         System.out.println("""
	         1. Ringing tone
	         2. Ringing volume
	         3. Incoming call alert
	         4. Composer
	         5. Message alert tone
	         6. Keypad tones
	         7. Warning and game tones
	         8. Vibrating alert
	         9. Screen saver
	         """);
	      System.out.println("Select a Tone function?"); 
	      int tonesSelect = input.nextInt();
	      
	      switch(tonesSelect) {
	      case 1: 
	         System.out.println("See several Ringing tones here"); break;
	      case 2: 
	         System.out.println("Increase or Decrease Ringing volume here"); break;
	      case 3:          
	         System.out.println("Set Incoming call alert here"); break;
	      case 4: 
	         System.out.println("Compose your own tone here"); break;
	      case 5: 
	         System.out.println("Set Message alert tone"); break;
	      case 6: 
	         System.out.println("Set Keypad tones here"); break;
	      case 7: 
	         System.out.println("Set Warning and Games tones here");
	      case 8:
	         System.out.println("Set Vibrating alert here"); break;
	      case 9:
	         System.out.println("Set Screen saver for calls here"); break;
	      default:
	         System.out.println("Invalid Input");

		      }
	
	
	    } else if(menuSelect == 6) {
	         String settings = """
	         1. Call settings
	         2. Phone settings
	         3. Security settings
	         """ ;
	      
	      System.out.println(settings); 
	      System.out.println("Select a Settings function?"); 
	      int settingsSelect = input.nextInt();
	      
	         	      switch(settingsSelect) {
			      case 1: 
			         System.out.println("Call settings");
			         String callSettings = """
			         1. Automatic redial
			         2. Speed dialling
			         3. Call waiting options
			         4. Own number sending
			         5. Phone line in use
			         6. Automatic answer
			      """ ;  
			      System.out.println(callSettings);
			      int callSettingsSelect = input.nextInt();
			         if(callSettingsSelect == 1)
			           System.out.print("Do Automatic redial here");
			         else if(callSettingsSelect == 2)
					System.out.print("Do Speed dialling here");
				    else if(callSettingsSelect == 3)
					System.out.print("Navigate Call waiting options ");
				    else if(callSettingsSelect == 4)
					System.out.print("Do Own number sending");
				    else if(callSettingsSelect == 5)
					System.out.print("Set Phone line in use here");
				    else if(callSettingsSelect == 6)
					System.out.print("Set Automatic answer here");
     				    break;
	
			       case 2: 
			         System.out.println("Phone setting"); 
			            System.out.println("""
			            1. Language
			            2. Cell info display
			            3. Welcome note
			            4. Network selection
			            5. Lights
			            6. Confirm SIM service Actions
			            """);
			         System.out.println("Which of these Phone settings do you need");
			         int phoneSettingSelect = input.nextInt();
			           if(phoneSettingSelect == 1)
			              System.out.println("Navigate Languages here");
				      else if (phoneSettingSelect == 2)
			              System.out.println("See Cell info display here");
			           else if (phoneSettingSelect == 3)
			              System.out.println("Displays Welcome Note");
			           else if (phoneSettingSelect == 4)
			              System.out.println("Navigate Network selection here");
				      else if (phoneSettingSelect == 5)
			              System.out.println("Set phone lights here");
					 else if (phoneSettingSelect == 6)
			              System.out.println("Confirm SIM service Actions here");   
				 break;
	
			       case 3:
			         System.out.println("Security settings");
			         System.out.println("""
			         1. PIN code request
			         2. Call barring service
			         3. Fixed dialling
			         4. Closed user group
			         5. Phone security
			         6. Change access codes
			         """);
			         System.out.println("Which of these Security settings do you need");
			         int securitySettingSelect = input.nextInt();
			         if(securitySettingSelect == 1) {
			            System.out.println("Set Pin code request here");
				    } else if  (securitySettingSelect == 2) {
			              System.out.println("See Call barring service here");
			         } else if  (securitySettingSelect == 3) {
			              System.out.println("Do Fixed dialling here");
				    } else if  (securitySettingSelect == 4) {
			              System.out.println("Closed user group");
				    } else if  (securitySettingSelect == 5) {
			              System.out.println("Set Phone security here");
				    } else if  (securitySettingSelect == 6) {
			              System.out.println("Change access codes here");  
			         } else {
			           System.out.println("Invalid Input" + "\n" + "Which of these Security settings do you need");
			           securitySettingSelect = input.nextInt();
			         }
			       break;          	      
			       default:
			         System.out.println("Invalid Input");
				 }
		    	
			      
	         
	    } else if(menuSelect == 7) {
	      System.out.println("Call Divert"); 
	    } else if(menuSelect == 8) {
	      System.out.println("Games"); 
	    } else if(menuSelect == 9) {
	      System.out.println("Calculator"); 
	    } else if(menuSelect == 10) {
	      System.out.println("Reminders"); 
	    } else if(menuSelect == 11) {
	      System.out.println("Clock");
	         System.out.println("""
	         1. Alarm clock
	         2. Clock settings
	         3. Date setting
	         4. Stopwatch
	         5. Countdown timer
	         6. Auto update of date and time
	         """);
	      System.out.println("Which of the Clock options do you need?");
	      int clockSettings = input.nextInt();
	      
	      switch(clockSettings) {
	      case 1: 
	         System.out.println("Alarm clock"); break;
	      case 2: 
	         System.out.println("Clock settings"); break;
	      case 3:          
	         System.out.println("Date setting"); break;
	      case 4: 
	         System.out.println("Stopwatch"); break;
	      case 5: 
	         System.out.println("Countdown timer"); break;
	      case 6: 
	         System.out.println("Auto update of date and time"); break;
	      default:
	         System.out.println("Invalid Input");
	      }
	
	    } else if(menuSelect == 12) {
	      System.out.println("Profiles");
	    } else if(menuSelect == 13) {
	      System.out.println("Sim Services"); 
	   } else
	         System.out.println("Invalid input");

}
}

 

   






