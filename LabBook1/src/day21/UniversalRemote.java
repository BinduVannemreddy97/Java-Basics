package day21;

public class UniversalRemote {
	public static void main(String[] args) {
		System.out.println("Tv Remote.........");
		Tv tv=new Tv();
		SetTopBox setTopBox=new SetTopBox();
		NetFlix netFlix=new NetFlix();
		SoundSystem soundSystem=new SoundSystem();
		
		FatherNewsChannelCommand fncc=new FatherNewsChannelCommand
				(tv, setTopBox, soundSystem, netFlix);
		MotherOldMovieCommand momc=new MotherOldMovieCommand
				(tv, setTopBox, soundSystem, netFlix);
		MotherSerialCommand msc=new MotherSerialCommand
				(tv, setTopBox, soundSystem, netFlix);
		
		Remote universalremote=new Remote();
		universalremote.executeCommand(0);
		universalremote.setCommand(fncc, 0);
		universalremote.setCommand(msc, 1);
		universalremote.setCommand(momc, 2);
		
		universalremote.executeCommand(2);

		
	}

}

class Tv{
	public void av1(){
		System.out.println("TV switched to av1 mode");
	}
	public void tvOn() {
		System.out.println("Tv switched ON");
	}
}
	
class SetTopBox{
	public void newsChannel() {
		System.out.println("News channel started.......");
	}
	public void serialChannel() {
		System.out.println("Serial channel staeted.......");
	}
}
	
class NetFlix{
	public void oldMovie() {
		System.out.println("old movie started..............");
	}
}	
class SoundSystem{
	public void lowSound() {
		System.out.println("Vlume is decreased...........");
	}
}	
interface Command{
	public void execute();
}
class FatherNewsChannelCommand implements Command{
	Tv tv;SetTopBox setTopBox; SoundSystem soundSystem;NetFlix netFlix;
	public FatherNewsChannelCommand(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, NetFlix netFlix) {
		this.tv = tv;
		this.setTopBox = setTopBox;
		this.soundSystem = soundSystem;
		this.netFlix = netFlix;
	}

	@Override
	public void execute() {
		System.out.println("Father News channel Started");
		tv.tvOn();
		tv.av1();
		setTopBox.newsChannel();
		soundSystem.lowSound();
		System.out.println("Dad enjoy your news Channels");
		}
	}
class MotherOldMovieCommand implements Command{
	Tv tv;SetTopBox setTopBox; SoundSystem soundSystem;NetFlix netFlix;
	public MotherOldMovieCommand(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, NetFlix netFlix) {
		this.tv = tv;
		this.setTopBox = setTopBox;
		this.soundSystem = soundSystem;
		this.netFlix = netFlix;
	}

	@Override
	public void execute() {
		tv.tvOn();
		tv.av1();
		netFlix.oldMovie();
		System.out.println("Enjoy the old moveie mom..........");
		}
	}
class MotherSerialCommand implements Command{
	Tv tv;SetTopBox setTopBox; SoundSystem soundSystem;NetFlix netFlix;
	public MotherSerialCommand(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, NetFlix netFlix) {
		this.tv = tv;
		this.setTopBox = setTopBox;
		this.soundSystem = soundSystem;
		this.netFlix = netFlix;
	}

	@Override
	public void execute() {
		tv.tvOn();
		tv.av1();
		setTopBox.serialChannel();
		System.out.println("Mom enjoy Serial Channels.............");	
	}
}
class DummyCommand implements Command{
	@Override
	public void execute() {
		System.out.println("I'm a Dummy button");
		}
}
class Remote{
	Command command[]=new Command[3];
	public Remote() {
		for(int i=0;i<command.length;i++) {
			command[i]=new DummyCommand();
		}
	}
	public void setCommand(Command command,int slot) {
		this.command[slot]=command;
	}
	public void executeCommand(int slot) {
		command[slot].execute();
	}

}


