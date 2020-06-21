package com.example.physioapp;

import androidx.appcompat.app.AppCompatActivity;

import com.monkeylearn.MonkeyLearn;
import com.monkeylearn.MonkeyLearnResponse;
import com.monkeylearn.MonkeyLearnException;

public class MonkeyLearn_Activity {
    public static void main( String[] args ) throws MonkeyLearnException {
        MonkeyLearn ml = new MonkeyLearn("63410313264dee2e51399192c9d46821767568a6");
        String modelId = "cl_oLZN2B3K";
        String[] textList = {"My back is hurting"};
        MonkeyLearnResponse res = ml.classifiers.classify(modelId, textList, true);
        System.out.println( res.arrayResult );
    }
}
//    API KEY = 63410313264dee2e51399192c9d46821767568a6
//        MODEL ID = cl_oLZN2B3K