package me.whiteship.refactoring._02_duplicated_code._06_pull_up_method;

import java.io.IOException;

public class ReviewerDashboard extends Dashboard {

    public void printUsernames() throws IOException {
        super.printUsernames(30);
    }
}
