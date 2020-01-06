package com.example.android.tourguidecopy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of bars.
 */
public class BarFragment extends Fragment {

    public BarFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of bars along with information and a photo.
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.pine_info, R.string.pine,
                R.drawable.pinewood_social));
        places.add(new Place(R.string.southern_info, R.string.southern,
                R.drawable.southern_steak));
        places.add(new Place(R.string.rosemary_info, R.string.rosemary,
                R.drawable.rosemary));
        places.add(new Place(R.string.husk_info, R.string.husk,
                R.drawable.husk));
        places.add(new Place(R.string.fat_bottom_info, R.string.fat_bottom,
                R.drawable.fat_bottom_brewing));
        places.add(new Place(R.string.skull_info, R.string.skull,
                R.drawable.skull));
        places.add(new Place(R.string.acme_info, R.string.acme,
                R.drawable.acme));
        places.add(new Place(R.string.gray_and_dudley_info, R.string.gray_and_dudley,
                R.drawable.gray_and_dudley));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_bar);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}