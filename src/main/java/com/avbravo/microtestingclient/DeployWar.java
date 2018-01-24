/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microtestingclient;

import fish.payara.micro.BootstrapException;
import fish.payara.micro.PayaraMicro;

/**
 *
 * @author avbravo
 */
public class DeployWar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws BootstrapException {
        // TODO code application logic here
        PayaraMicro instance = PayaraMicro.getInstance();
        instance.setHttpPort(9090);
       instance.addDeployment("/home/avbravo/NetBeansProjects/testing/microtesting/target/microtesting.war");
        instance.bootStrap();
    }
    
}
