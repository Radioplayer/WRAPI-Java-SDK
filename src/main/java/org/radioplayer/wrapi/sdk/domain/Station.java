package org.radioplayer.wrapi.sdk.domain;


public class Station {

	private Long rpuid;
	private String name;
	private String description;
	private Text[] longNames;
	public Text[] getLongNames() {
		return longNames;
	}

	public void setLongNames(Text[] longNames) {
		this.longNames = longNames;
	}

	private Text[] longDescriptions;
	private Text[] mediumNames;
	public Text[] getMediumNames() {
		return mediumNames;
	}

	public void setMediumNames(Text[] mediumNames) {
		this.mediumNames = mediumNames;
	}

	private String country;
	private MultiMedia[] multimedia;
	private LiveStreams[] liveStreams;
	private Bearer[] bearers;
	private SocialId[] socialIds;
	private String[] epgLanguages;
	private String alphanumericKey;
	private Genre[] genres;
	private Location location;
	private OnDemandStreams[] onDemandStreams;
	private Series series;
	private String href;
	private PhoneticInput[] phoneticInputs;
	private PhoneticOutput[] phoneticOutputs;

	public Long getRpuid() {
		return rpuid;
	}

	public void setRpuid(Long rpuid) {
		this.rpuid = rpuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Text[] getLongDescriptions() {
		return this.longDescriptions;
	}

	public void setLongDescriptions(Text[] longDescriptions) {
		this.longDescriptions = longDescriptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public MultiMedia[] getMultimedia() {
		return multimedia;
	}

	public void setMultimedia(MultiMedia[] multiMedias) {
		this.multimedia = multiMedias;
	}

	public Bearer[] getBearers() {
		return bearers;
	}

	public void setBearers(Bearer[] bearers) {
		this.bearers = bearers;
	}

	public SocialId[] getSocialIds() {
		return socialIds;
	}

	public void setSocialIds(SocialId[] socialIds) {
		this.socialIds = socialIds;
	}

	public String[] getEpgLanguages() {
		return epgLanguages;
	}

	public void setEpgLanguages(String[] epgLanguages) {
		this.epgLanguages = epgLanguages;
	}

	public String getAlphanumericKey() {
		return alphanumericKey;
	}

	public void setAlphanumericKey(String alphanumericKey) {
		this.alphanumericKey = alphanumericKey;
	}

	public Genre[] getGenres() {
		return genres;
	}

	public void setGenres(Genre[] genres) {
		this.genres = genres;
	}

	public LiveStreams[] getLiveStreams() {
		return liveStreams;
	}

	public void setLiveStreams(LiveStreams[] liveStreams) {
		this.liveStreams = liveStreams;
	}

	public PhoneticInput[] getPhoneticInputs() {
		return phoneticInputs;
	}

	public void setPhoneticInputs(PhoneticInput[] phoneticInputs) {
		this.phoneticInputs = phoneticInputs;
	}

	public PhoneticOutput[] getPhoneticOutputs() {
		return phoneticOutputs;
	}

	public void setPhoneticOutputs(PhoneticOutput[] phoneticOutputs) {
		this.phoneticOutputs = phoneticOutputs;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public OnDemandStreams[] getOnDemandStreams() {
		return onDemandStreams;
	}

	public void setOnDemandStreams(OnDemandStreams[] onDemandStreams) {
		this.onDemandStreams = onDemandStreams;
	}

	public Series getSeries() {
		return series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

}
