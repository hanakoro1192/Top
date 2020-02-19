import javax.swing.JFrame;
import java.awt.SystemTray;


public class Top extends JFrame{
    /**
    * アプリケーションの起動
    */
    public static void main(String[] args) {
        Top frame = new Top("Task Manager");
        frame.setVisible(true);
    }

    Top(String title){
        setTitle(title);
        setBounds(100, 100, 1000, 800);
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

        JButton editButton = new JButton("タスクを編集");
        editButton.setPreferredSize(new Dimenstion(100, 50));
        buttonPanel.add(buttonPanel);
    }

    public void makeTaskPanel(String panelTitle){
        //titleに指定したテキストタイトルをつけてタスクパネルを作ります
        JPanel mainPanel = new JPanel();
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel(panelTitle);
        LineBorder border = new LineBorder(Color.BLACK, 2, true);

        //タスク表示領域配置
        mainPanel.setPreferredSize(new Dimenstion(300, 600));
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));

        //タイトルを置く用のパネル
        titlePanel.setPreferredSize(new Dimenstion(300, 60));
        titlePanel.setBackground(Color.WHITE);
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
        titlePanel.setAlignmentY(0.0f);
        mainPanel.add(titlePanel);

        //タイトル配置
        titleLabel.setFont(new Font("MS ゴシック", Font.BOLD, 32));
        titleLabel.setAlignmentX(0.5f);
        titlePanel.add(titleLabel);

        //枠線
        mainPanel.setBorder(border);

        Container contentPane = getContentPane();
        contentPane.add(mainPanel);
    }
}