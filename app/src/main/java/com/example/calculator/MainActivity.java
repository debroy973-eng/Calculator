package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int firstNumber,secondNumber;
    double res;
    String str;
    char operator;
    public void one(View v)
    {
        if(str==null)
            str="1";
        else
            str+="1";
        displayInput();
    }
    public void two(View v)
    {
        if(str==null)
            str="2";
        else
            str+="2";
        displayInput();
    }
    public void three(View v)
    {
        if(str==null)
            str="3";
        else
            str+="3";
        displayInput();
    }
    public void four(View v)
    {
        if(str==null)
            str="4";
        else
            str+="4";
        displayInput();
    }
    public void five(View v)
    {
        if(str==null)
            str="5";
        else
            str+="5";
        displayInput();
    }
    public void six(View v)
    {
        if(str==null)
            str="6";
        else
            str+="6";
        displayInput();
    }
    public void seven(View v)
    {
        if(str==null)
            str="7";
        else
            str+="7";
        displayInput();
    }
    public void eight(View v)
    {
        if(str==null)
            str="8";
        else
            str+="8";
        displayInput();
    }
    public void nine(View v)
    {
        if(str==null)
            str="9";
        else
            str+="9";
        displayInput();
    }
    public void zero(View v)
    {
        if(str==null)
            str="0";
        else
            str+="0";
        displayInput();
    }
    /*public void point(View v)
    {
        if(str==null)
            str="0.";
        else
            str+=".";
        displayInput();
    }*/
    public void clear(View v)
    {
        TextView t=findViewById(R.id.input_view);
        t.setText("0");
        str=null;
        t=findViewById(R.id.result_view);
        t.setText("0");
        res=0;
    }
    public void plusSign(View v)
    {
        str+="+";
        displayInput();
    }
    public void minusSign(View v)
    {
        str+="-";
        displayInput();
    }
    public void multiplicationSign(View v)
    {
        str+="*";
        displayInput();
    }
    public void divitionSign(View v)
    {
        str+="/";
        displayInput();
    }
    private void displayInput()
    {
        TextView t=findViewById(R.id.input_view);
        t.setText(str);
    }
    public void twoNumbers(View v)
    {
        char s;
        int num=0,i;
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)>=48&&str.charAt(i)<=58)
            {
                s=str.charAt(i);
                num=num*10+Integer.parseInt(String.valueOf(s));
            }
            else
            {
                firstNumber=num;
                s='0';
                operator=str.charAt(i);
                num=0;
            }
        }
        secondNumber=num;
        operation(operator);
    }
    public void operation(char c)
    {
        switch (c)
        {
            case '+':plus();
                     break;
            case '-':minus();
                    break;
            case '*':multiplication();
                    break;
            case '/':divide();
                     break;
            default:break;
        }
    }
    public void plus()
    {
        res=firstNumber+secondNumber;
        displayResult();
    }
    public void minus()
    {
        res=firstNumber-secondNumber;
        displayResult();
    }
    public void multiplication()
    {
        res=firstNumber*secondNumber;
        displayResult();
    }
    public void divide()
    {
        res= firstNumber/secondNumber;
        displayResult();
    }
    public void displayResult()
    {
        TextView t=findViewById(R.id.result_view);
        t.setText(String.valueOf(res));
    }
    public void root(View v)
    {
        firstNumber=Integer.parseInt(str);
        res=Math.sqrt(firstNumber);
        displayResult();
    }
    public void power(View v)
    {
        int i,num;
        for(num=0,i=0;i<str.length();i++)
        {
            if(str.charAt(i)==44)
            {
                firstNumber=num;
                num=0;
                continue;
            }
            num=num*10+Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        res=(int)Math.pow(firstNumber,num);
        displayResult();
    }
    public void comma(View v)
    {
        str+=",";
        displayInput();
    }
    public void sin(View v)
    {
        firstNumber=Integer.parseInt(str);
        res=Math.sin(firstNumber);
        displayResult();
    }
    public void cos(View v)
    {
        firstNumber=Integer.parseInt(str);
        res=Math.cos(firstNumber);
        displayResult();
    }
    public void tan(View v)
    {
        firstNumber=Integer.parseInt(str);
        res=Math.tan(firstNumber);
        displayResult();
    }
    public void inverse(View v)
    {
        firstNumber=Integer.parseInt(str);
        res=(double)1/ firstNumber;
        displayResult();
    }
    public void naturalLogarithm(View v)
    {
        firstNumber=Integer.parseInt(str);
        res=Math.log(firstNumber);
        displayResult();
    }
    public void logBase10(View v)
    {
        firstNumber=Integer.parseInt(str);
        res=Math.log10(firstNumber);
        displayResult();
    }
    public void exponential(View v)
    {
        firstNumber=Integer.parseInt(str);
        res=Math.exp(firstNumber);
        displayResult();
    }
    public void asin(View v)
    {
        firstNumber=Integer.parseInt(str);
        res=Math.asin(firstNumber);
        displayResult();
    }
    public void acos(View v)
    {
        firstNumber=Integer.parseInt(str);
        res=Math.acos(firstNumber);
        displayResult();
    }
    public void atan(View v)
    {
        firstNumber=Integer.parseInt(str);
        res=Math.atan(firstNumber);
        displayResult();
    }
    public void sinh(View v)
    {
        firstNumber=Integer.parseInt(str);
        res=Math.sinh(firstNumber);
        displayResult();
    }
    public void cosh(View v)
    {
        firstNumber=Integer.parseInt(str);
        res=Math.cosh(firstNumber);
        displayResult();
    }
    public void tanh(View v)
    {
        firstNumber=Integer.parseInt(str);
        res=Math.tanh(firstNumber);
        displayResult();
    }
}