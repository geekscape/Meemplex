/*
 * @(#)ObjectRunner.java
 *
 * Copyright 2003 by EkoLiving Pty Ltd.  All Rights Reserved.
 *
 * This software is the proprietary information of EkoLiving Pty Ltd.
 * Use is subject to license terms.
 */
package org.openmaji.implementation.server.manager.thread;

public class TaskAtRunner extends Thread
{
	private long taskCount;

	TaskAtRunner()
	{}

	void queue(Runnable runnable, long absoluteTime)
	{
		taskCount++;

		Thread thread = new DelayedThread(runnable, absoluteTime);
		thread.start();
	}

	public long getTaskCount()
	{
		return taskCount;
	}
}
