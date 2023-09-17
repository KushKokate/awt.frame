import java.awt.*;
class ButtonDemo extends Frame{
    ButtonDemo(){
        Button b = new Button("Press");
        b.setBounds(120,120,80,30);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]){
        ButtonDemo b = new ButtonDemo();
    }

}