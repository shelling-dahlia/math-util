/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shellinglam.mathutil.test;

import com.shellinglam.mathutil.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NHULT
 */

public class MathUtilityTest {
@Test //Biến hàm này thành main(), Shifft + F6 để chạy
    //Đặt tên hàm theo chuẩn dân Test phần mềm, QA/QC
    public void testFactorialGivenRightArgumentReturnsGoodResult(){
        int n=5;
        long expected = 120;
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual);
        assertEquals(720, MathUtility.getFactorial(6)); //6! có đúng bằng 720?
        assertEquals(24, MathUtility.getFactorial(4)); 
        assertEquals(6, MathUtility.getFactorial(3)); 
        assertEquals(2, MathUtility.getFactorial(2)); 
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0)); 
        //màu đỏ đến theo 2 nghĩa:
        //Hàm tính đúng, kì vọng sai
        //Hàm tính sai, kì vọng đúng
        //Mỗi lời gọi hàm ở trên được gọi là 1 TEST CASE
        //1 tình huống test hàm, với 1 đầu vào, và nhận đầu ra
    }

    //Test ngoại lệ thì test như thế nào? :>
    //Vì khi ngoại lệ xảy ra, app dừng liền --> màu dỏ vì có điều không ổn đã diễn ra
    //thêm nữa ngoại lệ không phải là 1 value để so sánh, không biết nó là số mấy
    //chuỗi gì, ngoại lệ chỉ có thể ước lượng nó, chạm nó khi nó xảy ra
    //Test ngoại lệ nên được đọc/diễn giả như sau:
    //Tui đưa vào các tình huống dữ liệu cà chớn, ví dụ -5, ví dụ 22, 40
    //Tui muốn nhìn xem ngoại lệ có xảy ra trong tình huống này hay không
    //nếu có xảy ra, thì mừng lắm luôn, vì app/hàm chạy đúng như thiết lế
    //tức là nếu getFactorial(-5) mà ném ra ngoại lệ
    //IllegalArgumentException, có nghĩa là hàm đúng
    //có nghĩa là MÀU XANH (đừng bối rối khi có EXCEPTION mà lại XANH
    //XANH vì thiết kế nói rằng tình huống -5 phải có ngoại lệ
    //và nếu ngoại lệ xuất hiện, thì hàm đúng
    
    @Test (expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactorial(-5); //chạy hàm thoy. chưa có test
        MathUtility.getFactorial(21); //biết thừa hàm ném ra Exception
        MathUtility.getFactorial(-1); //ta phải túm Exeption
        MathUtility.getFactorial(40); //nếu có thật, hàm đúng. XANH
    }
    
}
//Việc test dùng màu sắc, dùng thư viện Unit Test có quy ước
//Nếu tất cả các cặp expected và actual khớp nhau (equals)
//thì coi như hàm chạy đúng mọi tình huống ta đã test --> XANH

//Nếu trong tất cả các cặp mà ta đã test, có ít nhất 1 cặp
//không khớp nhau - ít nhất 1 màu đỏ, coi như hàm không ổn --> ĐỎ CHUNG
//Điều này đảm bảo rằng, phàm hàm mà đã test các tình huống thì phải đúng hết các tình huống đã test
//Nói cách khác, những gì ta chủ động liệt kê là những gì ta đã test
