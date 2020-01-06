package com.example.android.tourguidecopy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of restaurants.
 */
public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of restaurants along with information and a photo.
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.princes_info, R.string.princes_hot_chicken_shack,
                R.drawable.princes_hot_chicken_shack));
        places.add(new Place(R.string.margot_info, R.string.margot_cafe,
                R.drawable.margot_cafe));
        places.add(new Place(R.string.rolf_info, R.string.rolf_and_daughters,
                R.drawable.rolf_and_daughters));
        places.add(new Place(R.string.city_info, R.string.city_house,
                R.drawable.city_house));
        places.add(new Place(R.string.henrietta_info, R.string.henrietta_red,
                R.drawable.henrietta_red));
        places.add(new Place(R.string.butcher_info, R.string.butcher_and_bee,
                R.drawable.butcher_and_bee));
        places.add(new Place(R.string.chauhan_info, R.string.chauhan,
                R.drawable.chauhan));
        places.add(new Place(R.string.martins_info, R.string.martins_bbq,
                R.drawable.martins_bbq));



        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_restaurant);

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
