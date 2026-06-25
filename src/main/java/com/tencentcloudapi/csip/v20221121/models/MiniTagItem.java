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
    * <p>标签颜色</p>
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>标签ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>标签键</p>
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * <p>标签值</p>
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * <p>标签键英文</p>
    */
    @SerializedName("TagKeyEn")
    @Expose
    private String TagKeyEn;

    /**
    * <p>标签值英文</p>
    */
    @SerializedName("TagValueEn")
    @Expose
    private String TagValueEn;

    /**
     * Get <p>标签颜色</p> 
     * @return Color <p>标签颜色</p>
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set <p>标签颜色</p>
     * @param Color <p>标签颜色</p>
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>标签ID</p> 
     * @return ID <p>标签ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>标签ID</p>
     * @param ID <p>标签ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>标签键</p> 
     * @return TagKey <p>标签键</p>
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set <p>标签键</p>
     * @param TagKey <p>标签键</p>
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get <p>标签值</p> 
     * @return TagValue <p>标签值</p>
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set <p>标签值</p>
     * @param TagValue <p>标签值</p>
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get <p>标签键英文</p> 
     * @return TagKeyEn <p>标签键英文</p>
     */
    public String getTagKeyEn() {
        return this.TagKeyEn;
    }

    /**
     * Set <p>标签键英文</p>
     * @param TagKeyEn <p>标签键英文</p>
     */
    public void setTagKeyEn(String TagKeyEn) {
        this.TagKeyEn = TagKeyEn;
    }

    /**
     * Get <p>标签值英文</p> 
     * @return TagValueEn <p>标签值英文</p>
     */
    public String getTagValueEn() {
        return this.TagValueEn;
    }

    /**
     * Set <p>标签值英文</p>
     * @param TagValueEn <p>标签值英文</p>
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

