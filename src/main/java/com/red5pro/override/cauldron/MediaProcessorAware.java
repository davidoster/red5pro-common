/*
 * Red5 Professional - http://www.infrared5.com Copyright (c) 2014-2017 by respective authors (see below). 
 * All rights reserved.
 */
package com.red5pro.override.cauldron;

import com.red5pro.override.IProStream;

/**
 * Processor handlers which are configuring the native components implement this interface.
 * <br>
 * @author Andy Shaules
 *
 */
public interface MediaProcessorAware {
    /**
     * Called when the native library is initiate.
     */
    void cauldronLibStarted();

    /**
     * Called when a native processor is about to be created.
     * <pre>
     * streamProcessorStart(IProStream stream){
     *     Potion p = new Potion("face");
     *     p.add(new Ingredient("background",0xFFFFFFFF));
     *     p.add(new Ingredient("maskShape","rect"));
     *     stream.setPotion(p);
     * }
     * </pre>
     * 
     * @param stream ProStream instance
     */
    void streamProcessorStart(IProStream stream);

    /**
     * Stream broadcast was closed. Processor was stopped.
     * 
     * @param stream ProStream instance
     */
    void streamProcessorStop(IProStream stream);

    /**
     * There was an error during the process life cycle.
     * 
     * @param stream ProStream instance
     * @param error Exception
     */
    void streamProcessorError(IProStream stream, Exception error);
}
