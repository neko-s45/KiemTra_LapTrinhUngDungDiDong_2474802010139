
# BÀI THI THỰC HÀNH - CÂU 1, CÂU 2, CÂU 3

- Họ và tên: `[Nguyễn Đỗ Minh Huy]`
- MSSV: `[2474802010139]`

## Câu 1 - Login và Validation
- `LoginActivity` dùng `findViewById`.
- Kiểm tra Email trống, mật khẩu trống, định dạng Email bằng `Patterns.EMAIL_ADDRESS` và mật khẩu tối thiểu 6 ký tự.
- Hiển thị thông báo lỗi/thành công trên `tvStatus`.

### Minh chứng Câu 1
Ảnh chụp thực tế cần có trong `screenshots/`:
- `cau1_validation_error.png`
- `cau1_validation_success.png`
<img width="334" height="685" alt="cau1_validation_success png" src="https://github.com/user-attachments/assets/57f54c35-ec21-45d5-a11a-a2713d629cc8" />
<img width="334" height="696" alt="cau1_validation_error png" src="https://github.com/user-attachments/assets/5210bbf9-c7ea-4904-869b-434ac714adc0" />


## Câu 2 - Intent và Profile
- Dùng Explicit Intent để mở `ProfileActivity`.
- Truyền Email bằng `putExtra()` và nhận bằng `getStringExtra()`.
- Nút Đăng xuất gọi `finish()` để quay về LoginActivity.

### Minh chứng Câu 2
Ảnh chụp thực tế cần có: <img width="326" height="694" alt="screenshotscau2_profile_intent png" src="https://github.com/user-attachments/assets/f6766655-a506-42f3-a1c2-94f02203eb30" />


## Câu 3 - ListView và ArrayAdapter
- `ProfileActivity` hiển thị danh sách ít nhất 5 môn học/kỹ năng mẫu.
- Sử dụng `ArrayAdapter` với `android.R.layout.simple_list_item_1`.
- `setOnItemClickListener` hiển thị Toast đúng tên item được chọn.

### Minh chứng Câu 3
Ảnh chụp thực tế cần có:
<img width="404" height="866" alt="screenshotscau3_item_click_toast png" src="https://github.com/user-attachments/assets/4846a1fe-8547-4aff-bbed-58996927cb99" />
<img width="326" height="694" alt="screenshotscau3_listview_display png" src="https://github.com/user-attachments/assets/9b0a5c5a-41d5-4451-81ee-2d5697a71b54" />

