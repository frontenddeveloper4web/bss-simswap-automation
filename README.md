# BSS SIM Swap & Billing Automation Framework

A production-grade test automation framework built to demonstrate **QA leadership** in telecom BSS systems.  
Simulates real-world workflows like **SIM swap requests**, **identity verification**, and **billing event validation** — just like in enterprise environments.

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
📥 [VAS-API-Test-Suite.postman_collection](https://docs.google.com/document/d/1yDsueFRde3_lQyC2d5VxZg73gmupORQ5kn4g1APAEHY/edit?usp=sharing)

---

## 📊 Project 4: QA Dashboard & Reporting

Demonstrates ability to report test progress, defects, and risks to stakeholders — a core responsibility of a QA Team Lead.

### 📈 Live Dashboard
🔗 [View QA Dashboard (Google Sheets)](https://docs.google.com/spreadsheets/d/e/2PACX-1vQQ39QTlNiHmWVPZKgb1eHqbT7ZJCkxyKJDeiphP0eYoZfKBL3Jp4kuiPcSNT-TQptXfkxjFGwRPTRB/pubchart?oid=1935601737&format=interactive)
### 🧠 Features
- Test execution trends over 3 sprints
- Defect tracking by severity and status
- SLA compliance monitoring
- Visual charts for stakeholder reporting
- Realistic telecom testing data

Used to simulate reporting to Product Owners, Dev Leads, and Compliance Officers.

---

## 💡 Project 5: Thought Leadership

Demonstrates ability to communicate QA value to stakeholders and industry peers.

### 📝 Article: "Why QA in Nigerian Telecom Isn’t Just About Finding Bugs"
> "In enterprise systems like BSS/OSS, ERP, and VAS, QA isn’t about test cases — it’s about **business impact**. As a QA Team Lead, your job isn’t just to run regression suites. It’s to align testing with SLAs, predict risks, and turn data into insights."

🔗 [Read full post on LinkedIn](https://www.linkedin.com/your-post-link)

Used to show strategic thinking, communication skills, and domain expertise in Nigerian telecom systems.

---


## ▶️ How to Run

### 1. Start the Mock API Server
```bash
npx json-server --watch db.json --port 3000






