package io.github.herobrine2nether.netherLauncher.backend.Util;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Network {
    public static boolean isInet() {
        if(testInet("herobrine2nether.github.io") || testInet("mojang.com") || testInet("google.com")) {
            return true;
        }
        return false;
    }

    public static boolean testInet(String site) {
        Socket sock = new Socket();
        InetSocketAddress addr = new InetSocketAddress(site,80);
        try {
            sock.connect(addr,3000);
            Logging.Log("Connected to " + site, 0);
            return true;
        } catch (IOException e) {
            Logging.Log("Cannot connect to " + site, 2);
            return false;
        } finally {
            try {sock.close();}
            catch (IOException e) {}
        }
    }
}
