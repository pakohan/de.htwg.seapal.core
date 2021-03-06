package de.htwg.seapal.controller.impl;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.htwg.seapal.controller.IAccountController;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public final class AccountControllerTest {

    private Injector injector;
    private IAccountController controller;

    private static final String SCRIPT = "/Users/mogli/Code/Seapal-Web/setupDB/";

    @Before
    public void setUp() throws Exception {
        injector = Guice.createInjector(new TestModule());
        controller = injector.getInstance(IAccountController.class);
        ProcessBuilder pb = new ProcessBuilder("/bin/bash", "setupDB.sh");
        pb.directory(new File(SCRIPT));
        Process p = pb.start();
        p.waitFor();
    }

    @After
    public void tearDown() throws Exception {
        System.gc();
    }

    @Test
    public void testInjector() throws  Exception {
        assert(controller!= null);
    }

    @Test
    public void testCloseDB() throws Exception {

    }

    @Test
    public void testDeleteAccount() throws Exception {

    }

    @Test
    public void testGetAccounts() throws Exception {

    }

    @Test
    public void testNewAccount() throws Exception {

    }

    @Test
    public void testGetAccount() throws Exception {

    }

    @Test
    public void testGetAllAccounts() throws Exception {

    }

    @Test
    public void testSaveAccount() throws Exception {

    }

    @Test
    public void testQueryView() throws Exception {

    }

    @Test
    public void testAuthenticate() throws Exception {

    }

    @Test
    public void testAccountExists() throws Exception {

    }

    @Test
    public void testGetByMail() throws Exception {

    }

    @Test
    public void testGoogleLogin() throws Exception {

    }

    @Test
    public void testGetPerson() throws Exception {

    }

    @Test
    public void testGetInternalInfo() throws Exception {

    }
}
