package com.xsonsui.maxball.nuts;

import com.xsonsui.maxball.nuts.model.NetAddress;
import com.xsonsui.maxball.nuts.model.NutsMessage;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by alim on 9/11/14.
 */
public class NormalClientMain {

    public static void main(String args[]) throws UnknownHostException {
        new NutsNormalClient(InetAddress.getByName(args[0]), Integer.parseInt(args[1]), new NutsClientListener() {
            @Override
            public void onConnected(InetAddress publicAddress, int publicPort) {

            }

            @Override
            public void onDisconnected() {

            }

            @Override
            public void onResponse(NutsMessage response, NetAddress address, boolean b) {

            }
        }).start();
    }
}
