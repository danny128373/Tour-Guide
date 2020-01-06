package com.example.android.tourguidecopy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of malls.
 */
public class MallFragment extends Fragment {


    public MallFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of malls along with information and a photo.
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.oaks_info, R.string.oaks,
                R.drawable.oaks));
        places.add(new Place(R.string.cool_springs_info, R.string.cool_springs,
                R.drawable.cool_springs));
        places.add(new Place(R.string.opry_mills_info, R.string.opry_mills,
                R.drawable.opry_mills));
        places.add(new Place(R.string.lebanon_info, R.string.lebanon,
                R.drawable.lebanon));
        places.add(new Place(R.string.providence_info, R.string.providence,
                R.drawable.providence));
        places.add(new Place(R.string.rivergate_info, R.string.rivergate,
                R.drawable.rivergate));
        places.add(new Place(R.string.stones_info, R.string.stones,
                R.drawable.stones));
        places.add(new Place(R.string.arcade_info, R.string.arcade,
                R.drawable.arcade));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_mall);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}