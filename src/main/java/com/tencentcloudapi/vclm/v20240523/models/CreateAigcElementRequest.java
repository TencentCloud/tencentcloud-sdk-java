/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAigcElementRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
    * 
    */
    @SerializedName("ElementImageList")
    @Expose
    private ElementImageList ElementImageList;

    /**
    * 
    */
    @SerializedName("VideoList")
    @Expose
    private String [] VideoList;

    /**
    * 
    */
    @SerializedName("Provider")
    @Expose
    private String [] Provider;

    /**
    * 
    */
    @SerializedName("TagList")
    @Expose
    private TagList [] TagList;

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return Description 
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 
     * @param Description 
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get  
     * @return ReferenceType 
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set 
     * @param ReferenceType 
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get  
     * @return ElementImageList 
     */
    public ElementImageList getElementImageList() {
        return this.ElementImageList;
    }

    /**
     * Set 
     * @param ElementImageList 
     */
    public void setElementImageList(ElementImageList ElementImageList) {
        this.ElementImageList = ElementImageList;
    }

    /**
     * Get  
     * @return VideoList 
     */
    public String [] getVideoList() {
        return this.VideoList;
    }

    /**
     * Set 
     * @param VideoList 
     */
    public void setVideoList(String [] VideoList) {
        this.VideoList = VideoList;
    }

    /**
     * Get  
     * @return Provider 
     */
    public String [] getProvider() {
        return this.Provider;
    }

    /**
     * Set 
     * @param Provider 
     */
    public void setProvider(String [] Provider) {
        this.Provider = Provider;
    }

    /**
     * Get  
     * @return TagList 
     */
    public TagList [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 
     * @param TagList 
     */
    public void setTagList(TagList [] TagList) {
        this.TagList = TagList;
    }

    public CreateAigcElementRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcElementRequest(CreateAigcElementRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ReferenceType != null) {
            this.ReferenceType = new String(source.ReferenceType);
        }
        if (source.ElementImageList != null) {
            this.ElementImageList = new ElementImageList(source.ElementImageList);
        }
        if (source.VideoList != null) {
            this.VideoList = new String[source.VideoList.length];
            for (int i = 0; i < source.VideoList.length; i++) {
                this.VideoList[i] = new String(source.VideoList[i]);
            }
        }
        if (source.Provider != null) {
            this.Provider = new String[source.Provider.length];
            for (int i = 0; i < source.Provider.length; i++) {
                this.Provider[i] = new String(source.Provider[i]);
            }
        }
        if (source.TagList != null) {
            this.TagList = new TagList[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagList(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);
        this.setParamObj(map, prefix + "ElementImageList.", this.ElementImageList);
        this.setParamArraySimple(map, prefix + "VideoList.", this.VideoList);
        this.setParamArraySimple(map, prefix + "Provider.", this.Provider);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

