### VTMC exam task 
# Launch instructions

Before you do any of the following steps, make sure you have git, node.js with npm and maven installed.

1. Clone repository using gitbash or any git GUI
2. Open/cd directory Egazminas/examFront
3. Open Cmd/PowerShell or any other command line shell and copy/paste following commands:
  npm install
  npx json-server -p 3500 -w data/db.json
4. Open another Cmd/PowerShell or any other command line shell in the same directory and enter following command:
  npm start
5. Open/cd directory Egzaminas/examBack
6. Enter following command into Cmd/PowerShell or any other command line shell:
  mvn spring-boot:run
