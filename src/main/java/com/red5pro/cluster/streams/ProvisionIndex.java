package com.red5pro.cluster.streams;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Provision services and config handlers implement this interface.
 * @author Andy Shaules
 */
public interface ProvisionIndex {
	/**
	 * Add data sources to this list. 
	 */
	public static List<ProvisionIndex> Providers = new CopyOnWriteArrayList<>();
	/**
	 * Returns publisher perspective. 
	 * @param context path of stream
	 * @param name name of stream
	 * @return provision with ingest
	 */
	public Provision getProvisionForPublisher(String context, String name);
	/**
	 * Returns server node perspective. This interface is used to create the topography of the cluster. 
	 * @param host host of server needing the provision.
	 * @param port port of server needing the provision.
	 * @param context context in question.
	 * @param name stream name in question.
	 * @return Provision if it exists
	 */
	public Provision getProvisionForNode( String host, int port,String context, String name);

}
