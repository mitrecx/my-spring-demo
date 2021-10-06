package cn.mitrecx.learn4advance.conditional;

public class WindowsListService implements ListService{
    @Override
    public String showListCmd() {
        return "dir";
    }
}
