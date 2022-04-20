package br.com.cod3r.adapter.tvPort;

import br.com.cod3r.adapter.tvPort.adapters.HDMIToOldMonitorAdapter;
import br.com.cod3r.adapter.tvPort.adapters.HDMIToVGAAdapter;
import br.com.cod3r.adapter.tvPort.devices.Computer;
import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.devices.TV;

public class Client {

	public static void main(String[] args) {
		Computer pc = new Computer();
		TV tv = new TV();
		pc.connectPort(tv);
		pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");
		
		System.out.println("------ Monitor ----------");
		Computer pc2 = new Computer();
		OldMonitor monitor = new OldMonitor();
		pc2.connectPort(new HDMIToVGAAdapter(monitor));
		pc2.sendImageAndSound("Cat and Rainbow", "Nyan cat song");


		System.out.println("------ Monitor Class Adapter ----------");
		Computer pc3 = new Computer();
		HDMIToOldMonitorAdapter monitorAdapter = new HDMIToOldMonitorAdapter();
		pc3.connectPort(monitorAdapter);
		pc3.sendImageAndSound("Cat and rainbow", "Nyan cat song");

	}
}
