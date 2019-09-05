package com.tves.channelDAO;

import java.util.List;

import com.tves.models.Programmes;

public interface ProgrammesDAO {
	public List<Programmes> getAll();
	public List<Programmes> getByChannel(String channel);
	
	}
