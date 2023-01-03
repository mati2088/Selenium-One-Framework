package com.selenium.GuruPages;

import com.selenium.GuruPages.pagesTest.SingIn_Test;
import com.selenium.GuruPages.pagesTest.register_Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({register_Test.class, SingIn_Test.class})
public class GuruTest {
}
