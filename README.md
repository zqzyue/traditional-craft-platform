# 传统工艺文化传承与交流平台（毕设）

## 快速启动
`ash
# 1. 数据库（稍后补）
# mysql -uroot -p < doc/sql/craft.sql

# 2. 后端
cd backend && mvn spring-boot:run   # port 8080

# 3. 前端
cd frontend && npm run dev          # port 5173
## 技术栈
- 后端：Spring Boot 3 + MyBatis + MySQL 8
- 前端：Vue 3 + Vite + ElementPlus
- 部署：Docker + GitHub Actions（筹备中）

## 许可证
MIT
