/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shellinglam.mathutil.main;

import com.shellinglam.mathutil.MathUtility;

/**
 *
 * @author NHULT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Tui muốn test %! có bằng 120 hay hok
    int n=5; //5! coi bằng nhiu
    long expected = 120; //Tui kì vọng nó ra 120 á
    long actual = MathUtility.getFactorial(n);
        System.out.println("5! expected: "+expected+" ; actual: "+actual);
        
    //Xét trường hợp 2: 0! bằng mấy
    n=1; //0! coi bằng nhiu
    expected = 1; //Tui kì vọng nó ra 1 á
     actual = MathUtility.getFactorial(n);
        System.out.println("0! expected: "+expected+" ; actual: "+actual);
    }
    

}

//Trong quy trình làm phần mềm, dân dev phải có trách nhiệm test từng hàm,
//từng class mà mình viết ra, trước khi đóng gói gửi cho bên QA/QC Test độc lập
//Từng hàm, từng class phải được test cẩn thận trước khi chúng được dùng để phối
//hợp với các class khác, chưa bàn về UI, thì mức độ test sớm này gọi là 
//UNIT TEST LEVEL - Test từng đơn thể, đơn vị code

//Vậy làm sao để test từng hàm, từng class
//Có nhiều các dể test từng hàm, từng class
//Cách 1: Dùng sout (Gọi-hàm-cần-test()) để in ra giá trị xử lý của hàm -- OOP
//Cách 2: Dùng JOptionPane -- PRJ311 để popup 1 cửa sổ in kq xử lý của hàm để ktra coi hàm chạy đúng sai
//Cách 3: Dùng LOG FILE, trng web in ra kq xử lý của hàm --PRJ301
//Dù là cách nào thì ta cũng cần ơhair in ra giá trị hàm để xử lý
//Gọi là ACTUAL VALUE
//Rồi ta đi so sánh cái giá trị trả về của hàm có giống như ta tính toán trước đó hay không
//Cái ta hy vọng hàm sẽ trả về - gọi là EXPECTED VALUE
//Nếu ACTUAL VALUE == EXPECTED VALUE --> Hàm chạy ngon
//                              Khác --> Hàm chạy sai
//Nguyên tắc của việc test: So sánh ACTUAL và EXPECTED
//3 cách này đều cugf 1 nguyên tắc:
//GỌI HÀM ĐỂ XỬ LÝ RA KẾT QUẢ MẤY
//SAU ĐÓ DÙNG MẮT ĐỂ SO SÁNH ACTUAL VÀ EXPECTED RỒI TA TỰ KẾT LUẬN
//CÁCH NÀY TIỀM ẨN SAI SÓT KHI TA PHẢI XEM XÉT QUÁ NHIỀU CẶP VALUE
//Ví dụ hàm giai-thua() phải test trường hợp n<0, = 1, 18, 19, 20 (bound), 21, 30
//Mỗi n để test ta gọi là 1 tình huống xài hàm, 1 tình huống test - TEST CASE

//Cách 4: Không thèm nhìn bằng mắt từng trường hợp EXPECTED VS ACTUAL
//--> Nhờ máy nhìn luôn, nó dư sức biết cách do sánh
// Máy quét hết tết cả các cặp EXPECTED VS ACTUAL
//Nếu tất cả đều khớp, báo MÀU XANH - CODE TỐT
//Nếu có xuất hiện ít nhất 1 thằng không khớp ACTUAL VS EXPECTED
//Báo MÀU ĐỎ, đường kẹt, do code có trục trặc tính toán
//Muốn làm được điều này, ta cần thư viện phụ trợ
//Java: JUnit, TestNG
//C#: NUnit, MSTest, xUnit
//PHP: PHPUnit
//Mọi ngôn ngữ đều có thư viện XANH ĐỎ giúp cảnh báo hàm tốt hay không

