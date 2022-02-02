package com.app.java_training_app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.app.java_training_app.R;
import com.app.java_training_app.databinding.FragmentProgramTweThreeBinding;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramTweThree_Fragment extends Fragment {


    FragmentProgramTweThreeBinding binding;
    String area,zone;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProgramTweThreeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        HashMap<String, Integer> kat= new HashMap<>();
        HashMap<String, Integer> var = new HashMap<>();


        binding.btnPush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvResult.setText("");
                binding.tvZoneName.setText("");
                String regex_area = "K|V";
                area =binding.etArea.getText().toString();


                Pattern p1 = Pattern.compile(regex_area);
                Matcher m1 = p1.matcher(area);

                if (!m1.matches()) {
                    binding.etArea.setError("Invalid Choice");
                } else {
                    if (area.equals("K")) {
                        binding.tvResult.setText("");
                        Toast.makeText(getActivity(), "You Choose Katargam!!!", Toast.LENGTH_SHORT).show();

                        kat.put("DABHOLI", 100);
                        kat.put("PANDOL", 10);
                        kat.put("AMBATALAVADI", 150);

                        System.out.println("There are Three Zone:");
                        for (Map.Entry map : kat.entrySet()) {
                            binding.tvZoneName.append(String.valueOf(map.getKey()) + "\n");
                        }
                    }
                }
                if (area.equals("V")) {
                    binding.tvResult.setText("");
                    Toast.makeText(getActivity(), "You Choose Varachha!!!", Toast.LENGTH_SHORT).show();

                    var.put("MINIBAZAR", 200);
                    var.put("KAPODRA", 20);
                    var.put("HIRABAG", 10);

                    System.out.println("There are Three Zone:");
                    for (Map.Entry map : var.entrySet()) {
                        binding.tvZoneName.append(String.valueOf(map.getKey())+"\n");

                    }
                }
            }
        });
        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvResult.setText("");
                zone =binding.etZone.getText().toString();
                Integer k1, k2, k3;
                k1 = kat.get("DABHOLI");
                k2 = kat.get("PANDOL");
                k3 = kat.get("AMBATALAVADI");

                System.out.println("Enter Zone:");

                Log.i("TAG", "onClick: "+zone);
                if (zone.equals("DABHOLI"))
                    binding.tvResult.append("Red Zone Because Total Case is:" + k1 + "\n");
                else if (zone.equals("PANDOL"))
                    binding.tvResult.append("Green Zone Because Total Case is:" + k2 + "\n");
                else if (zone.equals("AMBATALAVADI"))
                    binding.tvResult.append("Red Zone Because Total Case is:" + k3 + "\n");
                else {
                    binding.etZone.setError("Wrong Input");

                    Integer v1, v2, v3;
                    v1 = var.get("MINIBAZAR");//200
                    v2 = var.get("KAPODRA");
                    v3 = var.get("HIRABAG");

                    System.out.println("Enter Zone:");

                    if (zone.equals("MINIBAZAR"))
                        binding.tvResult.append("Red Zone Because Total Case is:" + v1 + "\n");
                    else if (zone.equals("KAPODRA"))
                        binding.tvResult.append("Green Zone Because Total Case is:" + v2 + "\n");
                    else if (zone.equals("HIRABAG"))
                        binding.tvResult.append("Green Zone Because Total Case is:" + v3 + "\n");
                    else
                        binding.etZone.setError("Wrong Input");
                }
            }

        });

    }
}