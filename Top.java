import javax.swing.JFrame;

public class Top extends JFrame {
    /**
     * アプリケーションの起動
     */
    public static void main(String[] args){
        Top frame = new Top("Task Mamager");
        farme.setVisible(true);
    }

    Top(String title){
        setTitle(title);
        setBound(100, 100, 1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //アプリケーションの終了

        setLayout(new FlowLayout());

        //TODOタスクの表示
        makeTaskPanel("TODO");

        //DOINGタスク表示
        makeTaskPanel("DOING");

        //DONEタスク表示領域
        makeTaskPanel("DONE");

        //ボタンの配置
        JPanel buttonPanel = new JPanel();
        TaskResister TaskResisterPanel = new TaskResister();
        this.add(TaskResisterPanel);
        TaskResisterPanel.setVisible(false);
        JButton createButton = new JButton("新規作成");

        buttonPanel.add(createButton);

        
    }
}