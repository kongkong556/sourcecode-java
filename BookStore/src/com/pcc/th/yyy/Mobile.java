package com.pcc.th.yyy;

public interface Mobile {
	void call();
	void playMusic();
}

interface Mobile2018{
	void takePhoto();
}

class IPhone implements Mobile,Mobile2018{

	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		
	}
	
}


class Samsung implements Mobile{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		
	}
	
}