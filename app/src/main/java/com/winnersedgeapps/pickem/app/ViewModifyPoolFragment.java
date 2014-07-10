package com.winnersedgeapps.pickem.app;



import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.winningedgeapps.pickem.app.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ViewModifyPoolFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class ViewModifyPoolFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
/*    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";*/

    // TODO: Rename and change types of parameters
    /*private String mParam1;
    private String mParam2;*/


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment ViewModifyPoolFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ViewModifyPoolFragment newInstance() {
        ViewModifyPoolFragment fragment = new ViewModifyPoolFragment();
        Bundle args = new Bundle();
        /*args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);*/
        fragment.setArguments(args);
        return fragment;
    }
    public ViewModifyPoolFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }*/
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view_modify_pool, container, false);
        Spinner poolSpinner = (Spinner) view.findViewById(R.id.poolSpinner);
        ArrayList<String> poolList = new ArrayList<String>();
        poolList.add("pool1");
        poolList.add("pool2");
        poolList.add("pool3");
        poolList.add("pool4");
        poolList.add("pool5");
        ArrayAdapter<String> poolAdapter = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_spinner_item, poolList);
        poolSpinner.setAdapter(poolAdapter);
        return view;
    }


}
