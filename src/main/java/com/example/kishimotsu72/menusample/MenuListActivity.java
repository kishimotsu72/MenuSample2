package com.example.kishimotsu72.menusample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class MenuListActivity extends AppCompatActivity {

    private ListView _lvMenu;

    private List<Map<String, Object>> _menuList;

    private static final String[] FROM = {"name", "price"};

    private static final int[] TO = {R.id.tvMenuName, R.id.tvMenuPrice};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);




        private List<Map<String, Object>> createTeishokuList() {
            List<Map<String, Object>> menuList = new ArrayList<>();

            Map<String, Object> menu = new HashMap<>();
            menu.put("name", "から揚げ定食");
            menu.put("price", 800);
            menu.put("desc", "若鳥のから揚げにサラダ、ご飯とお味噌汁が付きます。");
            menuList.add(menu);

            menu = new HashMap<>();
            menu.put("name", "ハンバーグ定食");
            menu.put("price", 850);
            menu.put("desc", "手ごねハンバーグにサラダ、ご飯とお味噌汁が付きます。");
            menuList.add(menu);

            menu = new HashMap<>();
            menu.put("name", "生姜焼き定食");
            menu.put("price", 850);
            menu.put("desc", "すりおろし生姜を使った生姜焼きにサラダ、ご飯とお味噌汁が付きます。");
            menuList.add(menu);

            menu = new HashMap<>();
            menu.put("name", "ステーキ定食");
            menu.put("price", 1000);
            menu.put("desc", "国産牛のステーキにサラダ、ご飯とお味噌汁が付きます。");
            menuList.add(menu);

            menu = new HashMap<>();
            menu.put("name", "野菜炒め定食");
            menu.put("price", 750);
            menu.put("desc", "季節の野菜炒めにサラダ、ご飯とお味噌汁が付きます。");
            menuList.add(menu);

            menu = new HashMap<>();
            menu.put("name", "とんかつ定食");
            menu.put("price", 900);
            menu.put("desc", "ロースとんかつにサラダ、ご飯とお味噌汁が付きます。");
            menuList.add(menu);

            return menuList;
        }


        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Map<String, Object> item = (Map<String, Object>) parent.getItemAtPosition(position);
            String menuName = (String) item.get("name");
            Integer menuPrice = (Integer) item.get("price");


            Intent intent = new Intent(MenuListActivity.this, MenuThanksActivity.class);

            intent.putExtra("menuName", menuName);

            intent.putExtra("menuPrice", menuPrice + "円");

            startActivity(intent);
        }

    }

}