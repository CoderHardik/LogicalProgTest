import java.util.HashSet;
import java.util.Set;

/* Given a string, reduce it in such a way that all of it's substrings are distinct. 
 * To so so, you may delete any character at any index. What is minimum number of deletion needed. 
 * 
 */

public class Workday_hackerrank_RahulTeam_round {

	public static int getMinDeletions(String s) {

		Set<Character> uniqueChar = new HashSet<Character>();

		for(int i=0; i<s.length(); i++) {
		uniqueChar.add(s.charAt(i));
		}

		int min = s.length() - uniqueChar.size();

		return min;
		}
	
	
	public static void main(String[] args) {
		String input = "abab";
		System.out.println("Min Deletions: " + getMinDeletions(input));

	}

}


/*
SQL

Check  photos in google drive.

In short I had to
1. Find which product are not in invoide_item
2. which customer id is not in invoice table

select 'customer' as category, c.id as id, customer_name as name
     from customer c
     left join invoice i on c.id = i.customer_id
     where i.id is null 
union
select 'product' as category, p.id as id, product_name as name 
from product p left join invoice_item ii o
n p.id = ii.product_id 
where ii.id is null;





3. 
Selenium question

Here Whole package was given,

I had to just implement fillDateOfBirth and answerQuestions



package com.hackerrank.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OnlineSurvey {

    public static void fillDateOfBirth(WebDriver driver, String pageUrl) {
        driver.get(pageUrl);
        Select month = new Select(driver.findElement(By.id("month")));
        Select day = new Select(driver.findElement(By.id("day")));
        Select year = new Select(driver.findElement(By.id("year")));
        month.selectByValue("January");
        day.selectByValue("10");
        year.selectByValue("2020");
    }

    public static void answerQuestions(WebDriver driver, String pageUrl) {

        driver.get(pageUrl);

        List<WebElement> language = driver.findElements(By.name("favorite_language"));
        for(int i=0; i<language.size(); i++) {
            String val = language.get(i).getAttribute("value");
            if (val.equalsIgnoreCase("Java")){
                language.get(i).click();
                break;
            }
        }

        List<WebElement> os = driver.findElements(By.name("favorite_os"));
        for(int i=0; i<os.size(); i++) {
            String val = os.get(i).getAttribute("value");
            if (val.equalsIgnoreCase("Windows")){
                os.get(i).click();
                break;
            }
        }

        List<WebElement> ide = driver.findElements(By.name("favorite_language"));
        for(int i=0; i<ide.size(); i++) {
            String val = ide.get(i).getAttribute("value");
            if (val.equalsIgnoreCase("Eclipse IDE")){
                ide.get(i).click();
                break;
            }
        }


    }
}



*/
