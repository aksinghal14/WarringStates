Name- Akshat Singhal
ID- U6322388
Review Code- Shunyu Yao (Task 10)

char goallocation;
        char result = '\0';

        for(goallocation = 'A';goallocation<='Z';goallocation++){
            if(isMoveLegal(placement,goallocation)){
                result = goallocation;
                break;
            }
        }

        for(goallocation = '0';goallocation<='9';goallocation++){
            if(isMoveLegal(placement,goallocation)){
                result = goallocation;
                break;
            }
        }

        if(result != '\0'){
            return result;
        }else
        {
            return '\0';
        }
    }
}

I reviewed task 10 completed by Shunyu Yao.

There is sufficient documentation given for this code by Shunyu Yao. The code is simple and to the point which is the best part of it.

The structure of the code is adequate and simple and doesn't need more documentation to explain. Each step is properly written for anyone to understand.

Each step presented in the written in the method is well written which is how the task is achieved and runs smoothly.

Java conventions have been followed and the style has been consistent throughout.

Also, in the last part, it has ben written to understand easily which is "if there is no legal move available, \0 will be displayed or else the result will be the output."

Name- Akshat Singhal
ID- U6322388
Review Code- Ruiyi Sun(Half Task 4) Lines 453-550

String takeCharacter(String p){
        String a = "";
        if(p.charAt(0)=='a'){
            // qin
            if(p.charAt(1)=='0'){
                a = "Lady Zhao";
            }else if(p.charAt(1)=='1'){
                a = "King Hui";
            }else if(p.charAt(1)=='2'){
                a = "Lady Mi";
            }else if(p.charAt(1)=='3'){
                a = "King Zhaoxiang";
            }else if(p.charAt(1)=='4'){
                a = "Duke Xiao";
            }else if(p.charAt(1)=='5'){
                a = "King Zhen";
            }else if(p.charAt(1)=='6'){
                a = "Bai Qi";
            }else if(p.charAt(1)=='7'){
                a = "Shang Yang";
            }
        }else if(p.charAt(0)=='b'){
            // qi
            if(p.charAt(1)=='0'){
                a = "King Xuan";
            }else if(p.charAt(1)=='1'){
                a = "King Xian";
            }else if(p.charAt(1)=='2'){
                a = "Queen Junwang";
            }else if(p.charAt(1)=='3'){
                a = "King Jian";
            }else if(p.charAt(1)=='4'){
                a = "Zhong Wuyan";
            }else if(p.charAt(1)=='5'){
                a = "Lord Menchang";
            }else if(p.charAt(1)=='6'){
                a = "Sun Bin";
            }
        }
        else if(p.charAt(0)=='c'){
            // chu
            if(p.charAt(1)=='0'){
                a = "King Kaolie";
            }else if(p.charAt(1)=='1'){
                a = "King Ai";
            }else if(p.charAt(1)=='2'){
                a = "Fu Chu";
            }else if(p.charAt(1)=='3'){
                a = "King You";
            }else if(p.charAt(1)=='4'){
                a = "Wu Qi";
            }else if(p.charAt(1)=='5'){
                a = "Lord Chunshen";
            }
        }else if(p.charAt(0)=='d'){
            // zhao
            if(p.charAt(1)=='0'){
                a = "King Xiaocheng";
            }else if(p.charAt(1)=='1'){
                a = "King Wuling";
            }else if(p.charAt(1)=='2'){
                a = "Lord Pingyuan";
            }else if(p.charAt(1)=='3'){
                a = "Li Mu";
            }else if(p.charAt(1)=='4'){
                a = "Lian Po";
            }
        }else if(p.charAt(0)=='e'){
            // han
            if(p.charAt(1)=='0'){
                a = "King Huanhui";
            }else if(p.charAt(1)=='1'){
                a = "King An";
            }else if(p.charAt(1)=='2'){
                a = "Marquess Ai";
            }else if(p.charAt(1)=='3'){
                a = "Han Fei";
            }
        }else if(p.charAt(0)=='f'){
            //wei
            if(p.charAt(1)=='0'){
                a = "King Anxi";
            }else if(p.charAt(1)=='1'){
                a = "Lord Xinling";
            }else if(p.charAt(1)=='2'){
                a = "Marquess Wei";
            }
        }else if(p.charAt(0)=='g'){
            // yan
            if(p.charAt(1)=='0'){
                a = "King Xi";
            }else if(p.charAt(1)=='1'){
                a = "Prince Dan";
            }
        }else{
            a = "Zhang Yi";

        }

I reviewed some part of Task 4 completed by Ruiyi Sun.

The best part of the code is structure and the methods used.

The code written is well structured with proper methods used.

The code reviewed above is to put in the names of the people in their respective kingdoms kingdoms. Sufficient documentation with the code is provided for an individual to understand.

Java conventions are used properly and the style is consistent throughout.

It is displayed step by step, different people of their kingdoms such as 'Yan contains King Xi and Prince Dan'.

The lines reviewed above basically displays 7 different kingdoms named "qin qi chu zhao han wei and yan" with Zhang Yi as the ruler and the main part of the game.
