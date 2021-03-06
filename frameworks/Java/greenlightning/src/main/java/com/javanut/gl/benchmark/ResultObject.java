package com.javanut.gl.benchmark;

public class ResultObject {

	private long connectionId; 
	private long sequenceId;
	private int status;
	private int id;
	private int result;
	private int groupSize;
	
	public int getGroupSize() {
		return groupSize;
	}


	public void setGroupSize(int groupSize) {
		this.groupSize = groupSize;
	}


	public long getConnectionId() {
		return connectionId;
	}


	public void setConnectionId(long connectionId) {
		this.connectionId = connectionId;
	}


	public long getSequenceId() {
		return sequenceId;
	}


	public void setSequenceId(long sequenceId) {
		this.sequenceId = sequenceId;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getResult() {
		return result;
	}


	public void setResult(int result) {
		this.result = result;
	}

	
	public ResultObject(int id, int result) {
		this.id = id;
		this.result = result;
		this.groupSize = 0;
		this.status = -1;
	}
	
	public ResultObject() {
		this.status = -1;
		this.groupSize = 0;
	}
	
}
