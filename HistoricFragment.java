package com.example.android.tourguidecopy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of historical sites.
 */
public class HistoricFragment extends Fragment {

    public HistoricFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of historic sites along with information and a photo.
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.ryman_info, R.string.ryman,
                R.drawable.ryman));
        places.add(new Place(R.string.downtown_presbyterian_info, R.string.downtown_presbyterian,
                R.drawable.downtown_presbyterian_church));
        places.add(new Place(R.string.tn_state_capitol_info, R.string.tn_state_capitol,
                R.drawable.tennessee_state_capitol));
        places.add(new Place(R.string.parthenon_info, R.string.parthenon,
                R.drawable.parthenon));
        places.add(new Place(R.string.union_station_info, R.string.union_station,
                R.drawable.union_station));
        places.add(new Place(R.string.bicentennial_info, R.string.bicentennial,
                R.drawable.bicentennial));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_historic);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
