package com.co.dafiti.ObjectPage;

import org.openqa.selenium.By;

public class MainObjectPage {

    private static By txtSearchBar = By.xpath("//input[@id='searchInput']");

    private static By btnSearch = By.xpath("//button[contains(@class, 'sel-search-button')]");

    private static By lblSuggestions = By.xpath("//div[@id='searchSuggestResult']");

    public static By getTxtSearchBar() {
        return txtSearchBar;
    }

    public static By getBtnSearch() {
        return btnSearch;
    }

    public static By getLblSuggestions() {
        return lblSuggestions;
    }

}