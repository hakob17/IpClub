package ipclub.com.ipclub._5_docsSection.docsItem;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by HP on 8/27/2016.
 */
public class docsItemContentFiles {

    @JsonProperty("id")
    public int id;

    @JsonProperty("title")
    public String title;

    @JsonProperty("type")
    public String type;
}
