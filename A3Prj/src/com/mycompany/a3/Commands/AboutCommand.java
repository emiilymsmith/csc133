package com.mycompany.a3.Commands;

import com.codename1.ui.Command;
import com.codename1.ui.Dialog;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a3.GameWorld;

public class AboutCommand extends Command{
	private GameWorld gw;
	private String describe = "";
	
	public AboutCommand(){
		super("About");
		describe = "Emily Smith CSC 133 A2";
	}
	/**
	 * Calls the turnLeft method in GameWorld
	 */
	@Override
	public void actionPerformed(ActionEvent ev) {
		if(ev.getKeyEvent() != -1) {
			Dialog.show("About",describe,"Done","Exit");
		}
	}
}
