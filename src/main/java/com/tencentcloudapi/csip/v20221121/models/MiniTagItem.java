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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MiniTagItem extends AbstractModel {

    /**
    * 标签展示颜色。
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * 标签描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 标签 ID。
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 标签键（中文）。
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * 标签值（中文）。
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * 标签键（英文）。
    */
    @SerializedName("TagKeyEn")
    @Expose
    private String TagKeyEn;

    /**
    * 标签值（英文）。
    */
    @SerializedName("TagValueEn")
    @Expose
    private String TagValueEn;

    /**
     * Get 标签展示颜色。 
     * @return Color 标签展示颜色。
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set 标签展示颜色。
     * @param Color 标签展示颜色。
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get 标签描述。 
     * @return Description 标签描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 标签描述。
     * @param Description 标签描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 标签 ID。 
     * @return ID 标签 ID。
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 标签 ID。
     * @param ID 标签 ID。
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 标签键（中文）。 
     * @return TagKey 标签键（中文）。
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set 标签键（中文）。
     * @param TagKey 标签键（中文）。
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get 标签值（中文）。 
     * @return TagValue 标签值（中文）。
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set 标签值（中文）。
     * @param TagValue 标签值（中文）。
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get 标签键（英文）。 
     * @return TagKeyEn 标签键（英文）。
     */
    public String getTagKeyEn() {
        return this.TagKeyEn;
    }

    /**
     * Set 标签键（英文）。
     * @param TagKeyEn 标签键（英文）。
     */
    public void setTagKeyEn(String TagKeyEn) {
        this.TagKeyEn = TagKeyEn;
    }

    /**
     * Get 标签值（英文）。 
     * @return TagValueEn 标签值（英文）。
     */
    public String getTagValueEn() {
        return this.TagValueEn;
    }

    /**
     * Set 标签值（英文）。
     * @param TagValueEn 标签值（英文）。
     */
    public void setTagValueEn(String TagValueEn) {
        this.TagValueEn = TagValueEn;
    }

    public MiniTagItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MiniTagItem(MiniTagItem source) {
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.TagKeyEn != null) {
            this.TagKeyEn = new String(source.TagKeyEn);
        }
        if (source.TagValueEn != null) {
            this.TagValueEn = new String(source.TagValueEn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "TagKeyEn", this.TagKeyEn);
        this.setParamSimple(map, prefix + "TagValueEn", this.TagValueEn);

    }
}

