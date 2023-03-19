package org.radioplayer.wrapi.sdk.domain;


public class OnDemandStream {
	private StreamSource streamSource;
    private BitRate bitRate;
	private String audioFormat;
    private StreamRestriction streamRestriction;

    public StreamSource getStreamSource() {
        return streamSource;
    }
    public void setStreamSource(StreamSource streamSource) {
        this.streamSource = streamSource;
    }
    public void setBitRate(BitRate bitRate) {
        this.bitRate = bitRate;
    }
    public BitRate getBitRate() {
        return bitRate;
    }
	public String getAudioFormat() {
        return audioFormat;
    }
    public void setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
    }
    public StreamRestriction getStreamRestriction() {
        return streamRestriction;
    }
    public void setStreamRestriction(StreamRestriction streamRestriction) {
        this.streamRestriction = streamRestriction;
    }
}
