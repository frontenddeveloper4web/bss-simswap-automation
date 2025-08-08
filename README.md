# BSS SIM Swap & Billing Automation Framework

A production-grade test automation framework built to demonstrate **QA leadership** in telecom BSS systems.  
Simulates real-world workflows like **SIM swap requests**, **identity verification**, and **billing event validation** — just like in enterprise environments.

🎯 Used to apply for **QA Team Lead** roles in telecom, ERP, and VAS platforms.

---

## 🎯 Key Features
- End-to-end automation of SIM swap process
- Integration testing with REST APIs
- Mock backend using JSON Server
- Built with industry-standard tools
- Designed for CI/CD and enterprise scalability

---

## 🛠️ Tech Stack
| Category | Tool |
|--------|------|
| Language | Java 11 |
| Test Framework | TestNG |
| Automation | Selenium WebDriver |
| API Testing | REST Assured |
| Build Tool | Maven |
| CI/CD | GitHub Actions |
| Reporting | Allure Reports |
| Mocking | JSON Server |

---

## 🧪 Test Scenarios Covered
1. ✅ Customer initiates SIM swap via self-service portal
2. ✅ Identity verification via API
3. ✅ Backend subscriber update
4. ✅ Audit log in billing system
5. ✅ Error handling & negative flows

---

## 🌐 Project 3: VAS API Test Suite

Validates core telecom Value-Added Services (VAS) such as airtime purchase, balance check, and transaction history via USSD.

### ✅ Features
- Automated REST API testing for `*556#` balance check and airtime top-up
- Built with REST Assured (Java) for enterprise-grade validation
- Simulates real Nigerian telecom workflows
- Ready for CI/CD integration

### 🧪 Test Coverage
| Test Case | Status |
|----------|--------|
| Check Balance (`GET /balance`) | ✅ Automated |
| Buy Airtime (`POST /airtime`) | ✅ Automated |
| View Transaction History | ✅ Automated |
| Admin Recharge | 🟡 Manual (Postman)

### 📎 Download Postman Collection
📥 [VAS-API-Test-Suite.postman_collection.json](postman/VAS-API-Test-Suite.postman_collection.json)

---


## ▶️ How to Run

### 1. Start the Mock API Server
```bash
npx json-server --watch db.json --port 3000

---




