# Hướng dẫn mở project và hoàn thiện bài nộp

## 1. Trước khi nộp
- Giải nén project; mở thư mục `KiemTra_LapTrinhUngDungDiDong_MSSV` bằng Android Studio.
- Trong Android Studio, đổi `MSSV` thành mã số sinh viên thật. Phải đổi tên project/repository, `rootProject.name`, `app_name`, `namespace`, `applicationId` và package Kotlin cho trùng nhau.
- Dùng template **Empty Views Activity**, Kotlin, XML. Project này không bật ViewBinding.
- Chờ Gradle Sync hoàn tất rồi chạy ứng dụng trên emulator/điện thoại.

## 2. Các nhánh đã tạo sẵn
- `main`: project nền.
- `cau-1`: LoginActivity + kiểm tra dữ liệu.
- `cau-2`: kế thừa Câu 1, thêm ProfileActivity và Intent.
- `cau-3`: kế thừa Câu 2, thêm ListView + ArrayAdapter + Toast.

Các nhánh đã có sẵn trong `.git` của project này. Sau khi tạo một repository GitHub Public trống và thay URL, có thể đẩy từng nhánh lên.

## 3. Minh chứng bắt buộc (phải tự chụp từ app chạy thật)
- `cau-1`: lưu `cau1_validation_error.png` và `cau1_validation_success.png` vào `screenshots/`.
- `cau-2`: lưu `cau2_profile_intent.png` vào `screenshots/`.
- `cau-3`: lưu `cau3_listview_display.png` và `cau3_item_click_toast.png` vào `screenshots/`.

README của từng nhánh có danh sách tên ảnh và dòng Markdown mẫu để nhúng ảnh. Ảnh thật chưa được tạo sẵn trong mẫu này.

## 4. Quy trình ảnh/Git đề xuất
1. `git checkout cau-1`, chạy app và chụp hai ảnh Câu 1; cập nhật README để nhúng ảnh; commit và push nhánh.
2. `git checkout cau-2`, chạy app và chụp ảnh Profile. Nếu bạn đã commit ảnh/README mới ở `cau-1`, chạy `git merge cau-1` để nhánh `cau-2` cũng kế thừa minh chứng Câu 1. Cập nhật README, commit và push.
3. `git checkout cau-3`, chạy app và chụp ảnh ListView/Toast. Nếu bạn đã có commit minh chứng mới trên `cau-2`, chạy `git merge cau-2` để nhánh `cau-3` kế thừa các minh chứng. Cập nhật README, commit và push.

## 5. Đẩy GitHub
Tạo repository **Public** có đúng tên `KiemTra_LapTrinhUngDungDiDong_MSSV` (thay MSSV thật), rồi chạy trong Terminal của Android Studio:

```bash
git remote add origin https://github.com/<tai_khoan_github>/KiemTra_LapTrinhUngDungDiDong_MSSV.git
git push -u origin main
git push -u origin cau-1
git push -u origin cau-2
git push -u origin cau-3
```

Không nộp ZIP/RAR lên hệ thống môn học. Nộp URL repository GitHub Public.
