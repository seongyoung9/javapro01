package phone;

import java.util.Scanner;

public class ShowPhoneInfo {
    
    public static void main(String[] args) {

        
        Scanner key = new Scanner(System.in);
        
        PhoneInfo[] 저장고 = new PhoneInfo[100];
        int roomnumber = 0;
        for (;true;)
        {
            System.out.print("선택 : ");
            int 입력 = key.nextInt();
            
            if (입력 == 1)
            {
                PhoneInfo phone = new PhoneInfo();
                
                System.out.print("이름을 입력해 주세요 : " );
                phone.set이름(key.next());
                System.out.print("전화번호를 입력해 주세요 : ");                
                phone.set전화번호(key.next());
                
                저장고[roomnumber] = phone;
                roomnumber++;
            }
            else if (입력 == 2)
            {
                System.out.println("데이터를 검색합니다..");
                System.out.print("이름 : ");
                String 검색이름 = key.next();
                for (int i = 0; i <= roomnumber-1;i++)
                {
                    if (검색이름.equals(저장고[i].get이름()))
                    {
                        System.out.println("이름 : "+저장고[i].get이름());
                        System.out.println("전화번호 : "+저장고[i].get전화번호());
                    }                    
                }
                System.out.println("검색완료!!!");
            }
            else if (입력 == 3)
            {
                System.out.println("데이터를 삭제합니다..");
                System.out.print("이름 : ");
                String 삭제이름 = key.next();
                for (int i = 0; i <= roomnumber-1;i++)
                {
                    if (삭제이름 .equals(저장고[i].get이름()))
                    {
                        저장고[i] = 저장고[i+1];
                    }
                }
                System.out.println("삭제되었습니다..");
            }
            else if (입력 == 4)
            {
                break;
            }
            else if (입력 == 5)
            {
                System.out.println("방번호 검색");
                int 방번호 = key.nextInt();
                System.out.println(저장고[방번호].get이름());
                System.out.println(저장고[방번호].get전화번호());
            }
            else
            {
                System.out.println("잘못 입력 하셨습니다..");
            }
            
        }
        
    }
    
}
