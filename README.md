
# Run Guide
First use the following command to get the project:
```bash
git clone https://github.com/gordon518/merchant-mix.git
```

## Run back-end app
1. Install java-v8-update291
2. Open a command window, and run the following commands to start the back-end app:

```bash
cd [Project_Root]/back-end/target
java -jar merchant-0.0.1-SNAPSHOT.jar
```

## Run frond-end app
1. Install node-v12
2. Open another command window, and run the following commands to start the frond-end app: 

```bash
cd [Project_Root]/front-end
npm install # install node modules
npm start # start frond app with winpack server
```

3. Open a web browser(such as Chrome,Firefox), access the URL of `http://localhost:3000` . The web page of this app will be shown up.

# Project Description
1. This is a full-stack app，Java Spring Boot + Mybatis at back-end, React as front-end. 
2. The back-end project was built by Java-v8-update291 and eclipse-jee-2019-09-R at https://www.eclipse.org/downloads/packages/release/2019-09/r, the folder of "[Project_Root]/back-end/target" was created by eclipse.
3. Data model is at [Project_Root]/back-end/src/main/resources/db/dataModel.txt, we use sqlite as database for this demo.



