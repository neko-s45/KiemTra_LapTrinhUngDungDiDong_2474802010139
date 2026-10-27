package com.example.kiemtra_laptrinhungdungdidong_mssv

import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 1. Ánh xạ View từ XML sang Kotlin bằng findViewById
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvStatus = findViewById<TextView>(R.id.tvStatus)

        // 2. Bắt sự kiện click nút Đăng nhập
        btnLogin.setOnClickListener {
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString()

            when {
                email.isEmpty() -> hienThiThongBao(tvStatus, "Vui lòng nhập Email!", false)
                password.isEmpty() -> hienThiThongBao(tvStatus, "Vui lòng nhập mật khẩu!", false)
                !Patterns.EMAIL_ADDRESS.matcher(email).matches() ->
                    hienThiThongBao(tvStatus, "Email không đúng định dạng!", false)
                password.length < 6 ->
                    hienThiThongBao(tvStatus, "Mật khẩu phải có ít nhất 6 ký tự!", false)
                else -> hienThiThongBao(tvStatus, "Xác thực thành công!", true)
            }
        }
    }

    private fun hienThiThongBao(tvStatus: TextView, noiDung: String, thanhCong: Boolean) {
        tvStatus.text = noiDung
        val mau = if (thanhCong) R.color.success else R.color.error
        tvStatus.setTextColor(ContextCompat.getColor(this, mau))
    }
}
