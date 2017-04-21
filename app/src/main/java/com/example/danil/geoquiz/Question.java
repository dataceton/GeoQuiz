package com.example.danil.geoquiz;

/**
 * Created by danil on 15.04.17.
 */

public class Question {
    private int mTextResid;
    private boolean mAnswerTrue;

    public Question(int textResid, boolean answerTrue) {
        mTextResid = textResid;
        mAnswerTrue = answerTrue;
    }

    public int getTextResid() {
        return mTextResid;
    }

    public void setTextResid(int textResid) {
        mTextResid = textResid;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
