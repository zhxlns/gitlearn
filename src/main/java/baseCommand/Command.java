package baseCommand;

/**
 * @author zhx
 * @date 2019/8/29
 */
public class Command {
    //将工作区的目录初始化为git管理的项目
    public static final String command0 = "git init";
    //将工作区的修改添加到暂存区
    public static final String command1 = "git add";
    //将暂存区的数据提交到本地仓库
    public static final String command2 = "git commit";
    //将本地仓库推送到远程仓库
    public static final String command3 = "git push";
}
