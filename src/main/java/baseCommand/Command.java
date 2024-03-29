package baseCommand;

/**
 * @author zhx
 * @date 2019/8/29
 */
public class Command {
    //将工作区的目录初始化为git管理的项目 第一行这里模拟主干上的修改已经合并分支上的修改了
    public static final String command0 = "git init";
    //将工作区的修改添加到暂存区
    public static final String command1 = "git add";
    //将暂存区的数据提交到本地仓库
    public static final String command2 = "git commit";
    //将本地仓库推送到远程仓库
    public static final String command3 = "git push";

    //是一个具有多种用法的命令，实际上是用版本库中的文件替代工作区的文件
    public static final String command4 = "git checkout";

    //git对于分支有很强大的功能支持1
    //从git上checkout下来生成新项目
    //修改后提交

    //竟然没有提交？
}
