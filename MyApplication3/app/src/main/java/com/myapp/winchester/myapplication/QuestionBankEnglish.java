package com.myapp.winchester.myapplication;


// This class contains a list of questions
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class QuestionBankEnglish {

    // declare list of Question objects
    List <Question> list = new ArrayList<>();
    MyDataBaseHelperEnglish myDataBaseHelperEnglish;

    // method returns number of questions in list
    public int getLength(){
        return list.size();
    }

    // method returns question from list based on list index
    public String getQuestion(int a) {
        return list.get(a).getQuestion();
    }

    // method return a single multiple choice item for question based on list index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4
    // as an argument
    public String getChoice(int index, int num) {
        return list.get(index).getChoice(num-1);
    }

    //  method returns correct answer for the question based on list index
    public String getCorrectAnswer(int a) {
        return list.get(a).getAnswer();
    }



    public void initQuestions(Context context) {
        myDataBaseHelperEnglish = new MyDataBaseHelperEnglish(context);
        list = myDataBaseHelperEnglish.getAllQuestionsList();//get questions/choices/answers from database

        //if list is empty, populate database with default questions/choices/answers
            if (list.isEmpty()) {//if list is empty, populate database with default questions/choices/answers
                myDataBaseHelperEnglish.addInitialQuestion(new Question("ADDITION",
                        new String[]{"PANAGNAYON", "PANAGKISSAY", "PANAGGUDDWA", "AGDAGUP"}, "PANAGNAYON"));
                myDataBaseHelperEnglish.addInitialQuestion(new Question("TWICE",
                        new String[]{"MAMINSAN", "MAMINDUA", "MAMINTALLO", "DUA"}, "MAMINDUA"));
                myDataBaseHelperEnglish.addInitialQuestion(new Question(" SUM",
                        new String[]{"AGKISSAY", "DAGUP", "AGDOBLE", "PAMINDUA"}, "DAGUP"));
                myDataBaseHelperEnglish.addInitialQuestion(new Question("CALCULATE",
                        new String[]{"PANAGKONTAR", "RUKOD", "TAYAG", "KAAKABA"}, "PANAGKONTAR"));
                myDataBaseHelperEnglish.addInitialQuestion(new Question("WIDTH",
                        new String[]{"PANAGKOTAR", "RUKOD", "KAAKABA", "TAYAG"}, "KAAKABA"));
                myDataBaseHelperEnglish.addInitialQuestion(new Question(" NUMBER",
                        new String[]{"INNEM", "NUMERO", "LIMA", "METRO"}, "NUMERO"));
                myDataBaseHelperEnglish.addInitialQuestion(new Question(" ONE-HALF",
                        new String[]{"DUA", "MAMINDUA", "DAGUP", "KAGGUDUA"}, "KAGGUDUA"));
                myDataBaseHelperEnglish.addInitialQuestion(new Question(" DIVIDE",
                        new String[]{"GUDUA", "KAGUDDUA", "DUA", "PANANGBINGAY"}, "PANANGBINGAY"));
                myDataBaseHelperEnglish.addInitialQuestion(new Question(" MEASURE",
                        new String[]{"PANAGKONTAR", "TAYAG", "KAAKABA", "RUKOD"}, "RUKOD"));
                myDataBaseHelperEnglish.addInitialQuestion(new Question("HEIGTH",
                        new String[]{"DAGUP", "RUKOD", "TAYAG", "KAAKABA"}, "TAYAG"));

                list = myDataBaseHelperEnglish.getAllQuestionsList();
        }
    }}

