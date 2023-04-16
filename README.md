ToolGenTestCase
Mô tả: Tool được thiết kế để hỗ trợ quá trình tạo và quản lý các test case

Các chức năng chính của tool gồm.
- Tạo test case từ quan điểm test.
- Định nghĩa quan điểm  để tool có thể gen testcase.
- Export log khi tạo test case.

Các bước thực hiện

Tại class TestCaseService
1) get list test case from file input (done)
3) create testcase bằng quan điểm test
5) insert quan diem  into template từ step 4
6) export testcase

Tại class ViewPointTest
2) get list quan điểm test from file excel

Các chức năng của TeamplatesTestCase
4) create template from teamplate co san
	+ create header
	+ create footer


Hướng dẫn sử dụng
Tạo test case:
 
Yêu cầu hệ thống
Tool yêu cầu hệ thống có cài đặt các phần mềm sau:

Hệ điều hành: Windows, Linux hoặc MacOS.
Microsoft Excel.
Hỗ trợ và đóng góp
Nếu bạn gặp bất kỳ vấn đề nào khi sử dụng tool, hoặc có đóng góp để cải thiện chức năng của tool, vui lòng liên hệ với chúng tôi qua email: [địa chỉ email].
