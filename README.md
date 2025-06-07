🚀 TestNG Automation Framework
This repository contains a TestNG-based automation framework with comprehensive test configurations and examples.
🧰 Technologies Used
Java 8+
TestNG 7.0+
Selenium WebDriver
Maven for dependency management
Eclipse IDE (with .classpath and .project included)
✨ Key Features
Test Configurations
✅ Parallel Test Execution (parallel4.xml, parallelall3.xml)
🔧 Parameterized Testing (parameter.xml, parameterexample1.xml)
🏷️ Test Grouping (groupall3.xml)
🔊 Test Listeners (listenerEx1.xml)
Framework Capabilities
📊 Multiple test suite configurations
🧩 Modular test organization
📝 Data-driven testing support
📈 Custom reporting through listeners
📦 Setup Instructions
git clone https://github.com/ankurmishra48/TestNg.git
Import into Eclipse:
File → Import → Existing Maven Project
Select the cloned directory
Install dependencies:
mvn clean install
Run tests:
Run all tests:
mvn test
Run specific test suite:
mvn test -DsuiteXmlFile=testing.xml
🗂️ Test Suite Configurations
File	Purpose
testing.xml	Main test suite configuration
parallel*.xml	Parallel test execution examples
parameter*.xml	Parameterized test examples
groupall3.xml	Test grouping demonstration
listenerEx1.xml	Test listener configuration
📊 Test Reports
After execution, view reports in:
text
test-output/
  ├── emailable-report.html
  ├── index.html
  └── testng-results.xml
💡 Best Practices
Keep test data separate from test logic
Use descriptive names for test groups
Leverage parameters for data-driven tests
Regularly review test-output reports
🤝 Contribution
Feel free to:
Report issues
Suggest enhancements
Submit pull requests
Happy Testing! 🧪🔍
This version:
Maintains your clean, emoji-enhanced style
Highlights TestNG-specific features
Provides clear setup instructions
Includes a quick reference table for XML files
Keeps the professional yet approachable tone

 
