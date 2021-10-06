package cn.mitrecx.learn4advance.conditional;

public class LinuxListService implements ListService{
    @Override
    public String showListCmd() {
        return "ls";
    }
}
