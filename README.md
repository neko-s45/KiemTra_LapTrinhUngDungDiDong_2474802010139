# BÀI THI THỰC HÀNH - CÂU 1, CÂU 2, CÂU 3

- Họ và tên: `[Điền họ tên sinh viên]`
- MSSV: `[Điền MSSV]`

## Câu 1 - Login và Validation
- `LoginActivity` dùng `findViewById`.
- Kiểm tra Email trống, mật khẩu trống, định dạng Email bằng `Patterns.EMAIL_ADDRESS` và mật khẩu tối thiểu 6 ký tự.
- Hiển thị thông báo lỗi/thành công trên `tvStatus`.

### Minh chứng Câu 1
Ảnh chụp thực tế cần có trong `screenshots/`:
- `cau1_validation_error.png`
- `cau1_validation_success.png`

Thêm hai dòng sau vào phần minh chứng sau khi đã chụp ảnh thật:

```markdown
![Validation Error](screenshots/cau1_validation_error.png)
![Validation Success](screenshots/cau1_validation_success.png)
```

## Câu 2 - Intent và Profile
- Dùng Explicit Intent để mở `ProfileActivity`.
- Truyền Email bằng `putExtra()` và nhận bằng `getStringExtra()`.
- Nút Đăng xuất gọi `finish()` để quay về LoginActivity.

### Minh chứng Câu 2
Ảnh chụp thực tế cần có: `screenshots/cau2_profile_intent.png`.

```markdown
![Profile Intent](screenshots/cau2_profile_intent.png)
```

## Câu 3 - ListView và ArrayAdapter
- `ProfileActivity` hiển thị danh sách ít nhất 5 môn học/kỹ năng mẫu.
- Sử dụng `ArrayAdapter` với `android.R.layout.simple_list_item_1`.
- `setOnItemClickListener` hiển thị Toast đúng tên item được chọn.

### Minh chứng Câu 3
Ảnh chụp thực tế cần có:
- `screenshots/cau3_listview_display.png`
- `screenshots/cau3_item_click_toast.png`

```markdown
![ListView Display](screenshots/cau3_listview_display.png)
![Item Click Toast](screenshots/cau3_item_click_toast.png)
```

> Lưu ý: Các dòng Markdown trên cần được đưa ra ngoài code block sau khi ảnh thật đã được chụp và lưu đúng tên. Không dùng ảnh giả làm minh chứng chạy app.
