package ru.mirea.sichinskiy.mireaproject.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import org.jetbrains.annotations.Nullable;

import ru.mirea.sichinskiy.mireaproject.R;
import ru.mirea.sichinskiy.mireaproject.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NavController navController = Navigation.findNavController(view);

        binding.profileButton.setOnClickListener(v ->
                navController.navigate(R.id.nav_profile));

        binding.browserButton.setOnClickListener(v ->
                navController.navigate(R.id.nav_web_view));

        binding.infoButton.setOnClickListener(v ->
                navController.navigate(R.id.nav_data));
    }
}