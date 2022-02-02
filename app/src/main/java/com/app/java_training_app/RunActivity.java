package com.app.java_training_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Size;

import com.app.java_training_app.fragments.ProgramEight_Fragment;
import com.app.java_training_app.fragments.ProgramEighteen_Fragment;
import com.app.java_training_app.fragments.ProgramEleven_Fragment;
import com.app.java_training_app.fragments.ProgramFifteen_Fragment;
import com.app.java_training_app.fragments.ProgramFive_Fragment;
import com.app.java_training_app.fragments.ProgramFour_Fragment;
import com.app.java_training_app.fragments.ProgramFourteen_Fragment;
import com.app.java_training_app.fragments.ProgramNine_Fragment;
import com.app.java_training_app.fragments.ProgramNineteen_Fragment;
import com.app.java_training_app.fragments.ProgramOne_Fragment;
import com.app.java_training_app.fragments.ProgramSeven_Fragment;
import com.app.java_training_app.fragments.ProgramSeventeen_Fragment;
import com.app.java_training_app.fragments.ProgramSixteen_Fragment;
import com.app.java_training_app.fragments.ProgramSiz_Fragment;
import com.app.java_training_app.fragments.ProgramTen_Fragment;
import com.app.java_training_app.fragments.ProgramThirteen_Fragment;
import com.app.java_training_app.fragments.ProgramThree_Fragment;
import com.app.java_training_app.fragments.ProgramTweEight_Fragment;
import com.app.java_training_app.fragments.ProgramTweFive_Fragment;
import com.app.java_training_app.fragments.ProgramTweFour_Fragment;
import com.app.java_training_app.fragments.ProgramTweOne_Fragment;
import com.app.java_training_app.fragments.ProgramTweSeven_Fragment;
import com.app.java_training_app.fragments.ProgramTweSeven_LCM_Fragment;
import com.app.java_training_app.fragments.ProgramTweSix_Fragment;
import com.app.java_training_app.fragments.ProgramTweThree_Fragment;
import com.app.java_training_app.fragments.ProgramTweTwo_Fragment;
import com.app.java_training_app.fragments.ProgramTwelve_Fragment;
import com.app.java_training_app.fragments.ProgramTwenty_Fragment;
import com.app.java_training_app.fragments.ProgramTwo_Fragment;

public class RunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run);

        String question = getIntent().getStringExtra("question");
        if (question.equals("PROGRAM 1")) {
            openFragment(new ProgramOne_Fragment());
        }
        if (question.equals("PROGRAM 2")) {
            openFragment(new ProgramTwo_Fragment());
        }
        if (question.equals("PROGRAM 3")) {
            openFragment(new ProgramThree_Fragment());
        }
        if (question.equals("PROGRAM 4")) {
            openFragment(new ProgramFour_Fragment());
        }
        if (question.equals("PROGRAM 5")) {
            openFragment(new ProgramFive_Fragment());
        }
        if (question.equals("PROGRAM 6")) {
            openFragment(new ProgramSiz_Fragment());
        }
        if (question.equals("PROGRAM 7")) {
            openFragment(new ProgramSeven_Fragment());
        }
        if (question.equals("PROGRAM 8")) {
            openFragment(new ProgramEight_Fragment());
        }
        if (question.equals("PROGRAM 9")) {
            openFragment(new ProgramNine_Fragment());
        }
        if (question.equals("PROGRAM 10")) {
            openFragment(new ProgramTen_Fragment());
        }
        if (question.equals("PROGRAM 11")) {
            openFragment(new ProgramEleven_Fragment());
        }
        if (question.equals("PROGRAM 12")) {
            openFragment(new ProgramTwelve_Fragment());
        }
        if (question.equals("PROGRAM 13")) {
            openFragment(new ProgramThirteen_Fragment());
        }
        if (question.equals("PROGRAM 14")) {
            openFragment(new ProgramFourteen_Fragment());
        }
        if (question.equals("PROGRAM 15")) {
            openFragment(new ProgramFifteen_Fragment());
        }
        if (question.equals("PROGRAM 16")) {
            openFragment(new ProgramSixteen_Fragment());
        }
        if (question.equals("PROGRAM 17")) {
            openFragment(new ProgramSeventeen_Fragment());
        }
        if (question.equals("PROGRAM 18")) {
            openFragment(new ProgramEighteen_Fragment());
        }
        if (question.equals("PROGRAM 19")) {
            openFragment(new ProgramNineteen_Fragment());
        }
        if (question.equals("PROGRAM 20")) {
            openFragment(new ProgramTwenty_Fragment());
        }
        if (question.equals("PROGRAM 21")) {
            openFragment(new ProgramTweOne_Fragment());
        }
        if (question.equals("PROGRAM 22")) {
            openFragment(new ProgramTweTwo_Fragment());
        }
        if (question.equals("PROGRAM 23")) {
            openFragment(new ProgramTweThree_Fragment());
        }
        if (question.equals("PROGRAM 24")) {
            openFragment(new ProgramTweFour_Fragment());
        }
        if (question.equals("PROGRAM 25")) {
            openFragment(new ProgramTweFive_Fragment());
        }
        if (question.equals("PROGRAM 26")) {
            openFragment(new ProgramTweSix_Fragment());
        }
        if (question.equals("PROGRAM 27_GCD")) {
            openFragment(new ProgramTweSeven_Fragment());
        }
        if (question.equals("PROGRAM 27_LCM")) {
            openFragment(new ProgramTweSeven_LCM_Fragment());
        }
        if (question.equals("PROGRAM 28")) {
            openFragment(new ProgramTweEight_Fragment());
        }

    }

    public void openFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}