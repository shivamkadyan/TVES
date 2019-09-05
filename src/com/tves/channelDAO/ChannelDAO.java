package com.tves.channelDAO;

import java.util.List;

import com.tves.models.Channel;

public interface ChannelDAO {
	public String Add(Channel c);
	public String Delete(Channel c);
	public String Update(Channel c);
	public List<Channel> getAll();
	public Channel find(String name);
	public List<Channel> findByCategory(String category);
	

}
