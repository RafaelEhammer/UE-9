package main;

import java.util.ArrayList;
import java.util.Random;

public class MainModel
{
    final private ArrayList<String> negative_answers = new ArrayList<>();
    final private ArrayList<String> positive_answers = new ArrayList<>();
    final private ArrayList<String> neutral_answers = new ArrayList<>();

    public MainModel ()
    {
        positive_answers.add("It is certain.");
        positive_answers.add("It is decidedly so.");
        positive_answers.add("Without a doubt.");
        positive_answers.add("Yes - definitely.");
        positive_answers.add("You may rely on it.");
        positive_answers.add("As I see it, yes.");
        positive_answers.add("Most likely.");
        positive_answers.add("Outlook good.");
        positive_answers.add("Yes.");
        positive_answers.add("Signs point to yes.");

        neutral_answers.add("Reply hazy, try again.");
        neutral_answers.add("Ask again later.");
        neutral_answers.add("Better not tell you now.");
        neutral_answers.add("Cannot predict now.");
        neutral_answers.add("Concentrate and ask again.");

        negative_answers.add("Don't count on it.");
        negative_answers.add("My reply is no.");
        negative_answers.add("My sources say no.");
        negative_answers.add("Outlook not so good.");
        negative_answers.add("Very doubtful");
    }

    public String getAnswer (String a)
    {
        if (a.equals(""))
        {
            return "Please write something";
        }
        else if (a.contains("?"))
        {
            return getNeutral_answer();
        }
        else if (a.contains("SEW"))
        {
            return getPositive_answer();
        }
        else if (a.contains("MEDT"))
        {
            return getNegative_answer();
        }
        return a;
    }

    public String getNeutral_answer()
    {
        Random rd = new Random();
        return neutral_answers.get(rd.nextInt(neutral_answers.size()));
    }
    public String getPositive_answer()
    {
        Random rd = new Random();
        return positive_answers.get(rd.nextInt(positive_answers.size()));
    }
    public String getNegative_answer()
    {
        Random rd = new Random();
        return negative_answers.get(rd.nextInt(negative_answers.size()));
    }
}
