package bd.edu.seu.app.controller;

public class Details {
    private String name;
    private String password;
    private String program;
    private String gender;
    private String text;
    private boolean check;

    public Details(String name, String password, String program, String gender, String text, boolean check) {
        this.name = name;
        this.password = password;
        this.program = program;
        this.gender = gender;
        this.text = text;
        this.check = check;
    }


    public boolean isCheck() {
        return check;
    }

    public String getText() {
        return text;
    }

    public String getGender() {
        return gender;
    }

    public String getProgram() {
        return program;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
