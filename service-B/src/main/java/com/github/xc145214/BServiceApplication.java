/*************************************************************************
 *                  HONGLING CAPITAL CONFIDENTIAL AND PROPRIETARY
 *
 *                COPYRIGHT (C) HONGLING CAPITAL CORPORATION 2012
 *    ALL RIGHTS RESERVED BY HONGLING CAPITAL CORPORATION. THIS PROGRAM
 * MUST BE USED  SOLELY FOR THE PURPOSE FOR WHICH IT WAS FURNISHED BY
 * HONGLING CAPITAL CORPORATION. NO PART OF THIS PROGRAM MAY BE REPRODUCED
 * OR DISCLOSED TO OTHERS,IN ANY FORM, WITHOUT THE PRIOR WRITTEN
 * PERMISSION OF HONGLING CAPITAL CORPORATION. USE OF COPYRIGHT NOTICE
 * DOES NOT EVIDENCE PUBLICATION OF THE PROGRAM.
 *                  HONGLING CAPITAL CONFIDENTIAL AND PROPRIETARY
 *************************************************************************/
package com.github.xc145214;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * @author xiachuan at 2017/5/17 18:04。
 */
@EnableDiscoveryClient
@SpringBootApplication
public class BServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(BServiceApplication.class).web(true).run(args);
    }
}

