package id.xaxxis.exploreplace;

public class Place {
    private String id, placeName, location, photo, generalDesc, type, longlat, since;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getGeneralDesc() {
        return generalDesc;
    }

    public void setGeneralDesc(String generalDesc) {
        this.generalDesc = generalDesc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLonglat() {
        return longlat;
    }

    public void setLonglat(String longlat) {
        this.longlat = longlat;
    }

    public String getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = since;
    }

    public Place() {
    }

    public Place(String id, String placeName, String location, String photo, String generalDesc, String type, String longlat, String since) {
        this.id = id;
        this.placeName = placeName;
        this.location = location;
        this.photo = photo;
        this.generalDesc = generalDesc;
        this.type = type;
        this.longlat = longlat;
        this.since = since;
    }
}
