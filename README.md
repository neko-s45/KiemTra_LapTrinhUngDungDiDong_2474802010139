# BÀI THI THỰC HÀNH - CÂU 1 + CÂU 2

- Họ và tên: `[Điền họ tên sinh viên]`
- MSSV: `[Điền MSSV]`

## Câu 1 - Login và Validation
- `LoginActivity` dùng `findViewById` để ánh xạ View.
- Kiểm tra Email trống, mật khẩu trống, Email bằng `Patterns.EMAIL_ADDRESS` và mật khẩu tối thiểu 6 ký tự.
- Hiển thị kết quả/lỗi lên `tvStatus`.

## Minh chứng Câu 1
Ảnh chụp thực tế cần có trong `screenshots/`:
- `cau1_validation_error.png`
- `cau1_validation_success.png`

Sau khi có ảnh thật, nhúng chúng bằng Markdown:

```markdown
![Validation Error](screenshots/cau1_validation_error.png)
![Validation Success](screenshots/cau1_validation_success.png)
```

## Câu 2 - Intent và Profile
- Khi Email/mật khẩu hợp lệ, `LoginActivity` tạo Explicit Intent và truyền Email bằng `putExtra()`.
- `ProfileActivity` nhận Email và hiển thị lên TextView.
- Nút Đăng xuất gọi `finish()` để quay lại LoginActivity.

## Minh chứng Câu 2
Ảnh chụp thực tế cần có: `screenshots/cau2_profile_intent.png`.

Sau khi có ảnh thật, nhúng bằng Markdown:

```markdown
![Profile Intent](screenshots/cau2_profile_intent.png)
```

> Ảnh minh chứng phải được chụp từ ứng dụng đang chạy trên emulator/điện thoại thật.
