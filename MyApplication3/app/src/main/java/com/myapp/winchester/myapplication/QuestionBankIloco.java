package com.myapp.winchester.myapplication;


// This class contains a list of questions
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class QuestionBankIloco {

    // declare list of Question objects
    List <Question> list = new ArrayList<>();
    MyDataBaseHelper myDataBaseHelper;

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
        myDataBaseHelper = new MyDataBaseHelper(context);
        list = myDataBaseHelper.getAllQuestionsList();//get questions/choices/answers from database

        if (list.isEmpty()) {//if list is empty, populate database with default questions/choices/answers
            myDataBaseHelper.addInitialQuestion(new Question(" PANAGNAYON",
                    new String[]{"ADDITION", "SUBTRACTION", "MULTIPLICATION", "DIVISION"}, "ADDITION"));
            myDataBaseHelper.addInitialQuestion(new Question(" MAMINDUA",
                    new String[]{"SUM", "TWICE", "THRICE", "ONCE"}, "TWICE"));
            myDataBaseHelper.addInitialQuestion(new Question(" DAGUP",
                    new String[]{"SUBTRACT", "MINUEND", "REMAINDER", "SUM"}, "SUM"));
            myDataBaseHelper.addInitialQuestion(new Question(" PANAGKONTAR",
                    new String[]{"MULTIPLICATION", "CIRCUMFERENCE", "CALCULATE", "DIVISION"}, "CALCULATE"));
            myDataBaseHelper.addInitialQuestion(new Question(" KAAKABA",
                    new String[]{"WIDTH", "LENGTH", "SIZE", "REMAINDER"}, "WIDTH"));
            myDataBaseHelper.addInitialQuestion(new Question(" NUMERO",
                    new String[]{"METER", "NUMBER", "SIZE", "OPERATION"}, "NUMBER"));
            myDataBaseHelper.addInitialQuestion(new Question(" KAGUDDUA",
                    new String[]{"TWO", "ONE-HALF", "MINUED", "DIVISION"}, "ONE-HALF"));
            myDataBaseHelper.addInitialQuestion(new Question(" PANAGBINGAY",
                    new String[]{"DIVIDE", "ONE-HALF", "MINUED", "DIVISION"}, "DIVIDE"));
            myDataBaseHelper.addInitialQuestion(new Question(" RUKOD",
                    new String[]{"MEASURE", "ONE-HALF", "LENGTH", "WIDTH"}, "MEASURE"));
            myDataBaseHelper.addInitialQuestion(new Question("TAYAG",
                    new String[]{"MEASURE", "HEIGTH", "LENGTH", "WIDTH"}, "HEIGTH"));

            //get list from database again
            list = myDataBaseHelper.getAllQuestionsList();

        }

    }}
