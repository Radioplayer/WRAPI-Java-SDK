package org.radioplayer.wrapi.sdk.domain;

import java.util.Date;


public class OnDemandStreams {

	private String player;
	private BitRate bitRate;
	private StreamSource streamSource;
	private Date availableStart;
	private Date availableStop;

	private OnDemandStream[] audioStreams;

	public BitRate getBitRate() {
		return bitRate;
	}

	public void setBitRate(BitRate bitRate) {
		this.bitRate = bitRate;
	}

	public StreamSource getStreamSource() {
		return streamSource;
	}

	public void setStreamSource(StreamSource streamSource) {
		this.streamSource = streamSource;
	}

	public OnDemandStream[] getAudioStreams() {
		return audioStreams;
	}

	public void setAudioStreams(OnDemandStream[] audioStreams) {
		this.audioStreams = audioStreams;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public Date getAvailableStart() {
		return availableStart;
	}

	public void setAvailableStart(Date availableStart) {
		this.availableStart = availableStart;
	}

	public Date getAvailableStop() {
		return availableStop;
	}

	public void setAvailableStop(Date availableStop) {
		this.availableStop = availableStop;
	}

}
