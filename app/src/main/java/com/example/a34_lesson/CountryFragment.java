package com.example.a34_lesson;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a34_lesson.databinding.FragmentCountryBinding;

import java.util.ArrayList;

public class CountryFragment extends Fragment {

    private FragmentCountryBinding binding;
    private  CountryAdapter countryAdapter;

    private ArrayList<Country> countryList;
    private int position;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("key");

        checkPosition(position);
        countryAdapter = new CountryAdapter(countryList);
        binding.rvCountry.setAdapter(countryAdapter);

    }

    private void checkPosition(int position){
        if (position == 0){
            loadNorthAmerica();
        }else if (position == 1){
            loadSouthAmerica();
        }else if (position == 2){
            loadEurasia();
        }else if (position == 3){
            loadAfrica();
        }else if (position == 4){
            loadAustralia();
        }else if (position == 5){
            loadAntarktida();
        }
    }

    public void loadAfrica(){
        countryList = new ArrayList<>();
        countryList.add(new Country("https://st2.depositphotos.com/2012425/11246/i/600/depositphotos_112466462-stock-photo-nigeria-flag-real-fabric.jpg","Нигерия"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Flag_of_Kenya.svg/500px-Flag_of_Kenya.svg.png","Кения"));
        countryList.add(new Country("https://www.free-wallpapers.su/data/media/418/big/fl0053.jpg","Марокко"));
        countryList.add(new Country("https://flags-world.com/wp-content/uploads/2021/01/flag-sudana-8.png","Судан"));
        countryList.add(new Country("https://static3.depositphotos.com/1003857/242/i/600/depositphotos_2428722-stock-photo-national-flag-ghana.jpg","Гана"));
    }
    public void loadEurasia(){
        countryList = new ArrayList<>();
        countryList.add(new Country("https://img.freepik.com/premium-photo/kyrgyzstan-flag-waving-closeup-3d-rendering-with-high-quality-image-with-fabric-texture_216217-99.jpg","Кыргызстан"));
        countryList.add(new Country("https://img.freepik.com/free-vector/illustration-of-russia-flag_53876-27016.jpg","Россия"));
        countryList.add(new Country("https://img.freepik.com/free-vector/illustration-of-german-flag_53876-27101.jpg","Германия"));
        countryList.add(new Country("https://img.freepik.com/premium-vector/french-flag-symbol-of-a-nation_395514-32.jpg","Франция"));
        countryList.add(new Country("https://img.freepik.com/premium-photo/national-flag-of-south-korea-background-with-flag-of-south-korea_659987-358.jpg","Южная Корея"));
    }
    public void loadNorthAmerica(){
        countryList = new ArrayList<>();
        countryList.add(new Country("https://img.freepik.com/free-vector/illustration-of-usa-flag_53876-18165.jpg","США"));
        countryList.add(new Country("https://img.freepik.com/premium-vector/flag-of-canada-vector-illustration_514344-266.jpg","Канада"));
        countryList.add(new Country("https://cdn.pixabay.com/photo/2012/04/23/16/37/saint-martin-38928_1280.png","Сен-Мартен"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Flag_of_Costa_Rica.svg/250px-Flag_of_Costa_Rica.svg.png","Коста-Рика"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/2/28/Flag_of_Puerto_Rico.svg/250px-Flag_of_Puerto_Rico.svg.png","Пуэрто-Рико"));
    }
    public void loadSouthAmerica(){
        countryList = new ArrayList<>();
        countryList.add(new Country("https://img.freepik.com/free-vector/illustration-of-brazil-flag_53876-27017.jpg","Бразилия"));
        countryList.add(new Country("https://img.freepik.com/free-vector/illustration-of-argentina-flag_53876-27120.jpg","Аргентина"));
        countryList.add(new Country("https://img.freepik.com/premium-photo/flag-of-uruguay-as-the-background_454892-1411.jpg","Уругвай"));
        countryList.add(new Country("https://img.freepik.com/premium-vector/flag-of-suriname-background_19426-631.jpg","Суринам"));
        countryList.add(new Country("https://flagof.ru/wp-content/uploads/2018/10/chili-1024x576.jpg","Чили"));
    }
    public void loadAntarktida(){
        countryList = new ArrayList<>();
        countryList.add(new Country("","Нету стран"));
    }
    public void loadAustralia(){
        countryList = new ArrayList<>();
        countryList.add(new Country("https://flagof.ru/wp-content/uploads/2018/10/WAL.jpg","Уэльс"));
        countryList.add(new Country("https://img.freepik.com/premium-photo/queensland-state-flag-australia-waving-banner-collection-3d-illustration_118047-8624.jpg","Квисленд"));
        countryList.add(new Country("https://img.freepik.com/premium-photo/victoria-state-flag-australia-waving-banner-collection-3d-illustration_118047-9948.jpg","Виктория"));
        countryList.add(new Country("https://img.freepik.com/premium-photo/adelaide-city-flag-australia-waving-banner-collection-3d-illustration_118047-9018.jpg","Аделаида"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Flag_of_the_Governor_of_Tasmania.svg/600px-Flag_of_the_Governor_of_Tasmania.svg.png","Перт"));
    }
}