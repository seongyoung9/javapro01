package java17.st2product;

import java.util.Scanner;

public class TestProduct 
{

    static Scanner key = new Scanner(System.in);
    
    static int roomnum = 0;
    
    public static void main(String[] args) 
    {
        
        Product[] list = new Product[10];
        
        
        for ( ; true ; )
        {
            
            System.out.println("상품추가(1), 상품조회(2), 종료(3)");
            
            int 메뉴 = key.nextInt();
            
            if ( 메뉴  == 1 ) // 상품입력
            {
                상품입력(list);
            }
            else if ( 메뉴 == 2 ) // 상품출력
            {
                상품출력(list);
            }
            else if ( 메뉴 == 3 )  // 종료
            {
                break;
            }
            else
            {
                System.out.println("잘못된 입력입니다.");
            }
        }
        
    }

//상품종류 입력 코드 배열로 추가
    private static void 상품입력(Product[] list) 
    {
        
        System.out.println("상품종류 책(1), 회화책(2), 음악(3)");
        
        int 메뉴 = key.nextInt();
        
        if ( 메뉴  == 1 )
        {
            Book book = new Book();
            
            System.out.print("상품 설명 >> ");
                                book.set상품설명 ( key.next());
            System.out.print("생산자 >> ");
                                book.set상품설명 ( key.next());
            System.out.print("가격 >> ");
                                book.set가격     ( key.next());
            System.out.print("ISBN번호 >> ");
                                book.setISBN번호 ( key.next());
            System.out.print("저자번호 >> ");
                                book.set저자     ( key.next());
            System.out.print("책제목 >> ");
                                book.set책제목   ( key.next());
                                
            list[roomnum] = book;
            roomnum += 1;
        }
        else if ( 메뉴 == 2 )
        {
            CompatDisc cd = new CompatDisc();
            System.out.print("상품 설명 >> ");
                                cd.set상품설명 ( key.next());
            System.out.print("생산자 >> ");
                                cd.set생산자   ( key.next());
            System.out.print("가격 >> ");
                                cd.set가격     ( key.next());
            System.out.print("앨범 제목 >> ");
                                cd.set앨범제목 ( key.next());
            System.out.print("언어 >> ");
                                cd.set가수이름 ( key.next());
            
            list[roomnum] = cd;
            roomnum += 1;
        }
        else if ( 메뉴 == 3 )
        {
            CoversationBook cb = new CoversationBook();
            
            System.out.print("상품 설명 >> ");
                                cb.set상품설명 ( key.next());
            System.out.print("생산자 >> ");
                                cb.set생산자   ( key.next());
            System.out.print("가격 >> ");
                                cb.set가격     ( key.next());
            System.out.print("ISBN번호 >> ");
                                cb.setISBN번호 ( key.next());
            System.out.print("저자번호 >> ");
                                cb.set저자     ( key.next());
            System.out.print("책제목 >> ");
                                cb.set책제목   ( key.next());
            System.out.print("언어 >> ");
                                cb.set언어     ( key.next()); 
                                 
            list[roomnum] = cb;
            roomnum += 1;
        }
        else
        {
            System.out.println("1,2,3,만 가능합니다!!!!!!!!!!!");
        }
      
        
    }
    private static void 상품출력(Product[] list) 
    {
        
            System.out.print("상품 아이디를 입력해 주세요 : ");
            int i = key.nextInt();
            System.out.println(list[i].toString());
        
        
    }
}
