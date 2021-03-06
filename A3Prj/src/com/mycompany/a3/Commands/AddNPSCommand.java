package com.mycompany.a3.Commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a3.GameWorld;

public class AddNPSCommand extends Command{
	private GameWorld gw;

	public AddNPSCommand(GameWorld gw) {
		super("Add NonPlayerShip");
		this.gw = gw;
	}
	
	/**
	 * Calls the addNPS method in GameWorld
	 */
	@Override
	public void actionPerformed(ActionEvent ev) {
		if (ev.getKeyEvent() != -1) {
			gw.addNPS();
		}
	}
}
