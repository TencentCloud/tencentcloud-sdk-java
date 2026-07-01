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

public class CSIPTag extends AbstractModel {

    /**
    * <p>标签颜色</p>
    */
    @SerializedName("TagColor")
    @Expose
    private String TagColor;

    /**
    * <p>标签ID</p>
    */
    @SerializedName("TagID")
    @Expose
    private Long TagID;

    /**
    * <p>标签键（根据语言环境返回中文或英文）</p>
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * <p>标签值（根据语言环境返回中文或英文）</p>
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
     * Get <p>标签颜色</p> 
     * @return TagColor <p>标签颜色</p>
     */
    public String getTagColor() {
        return this.TagColor;
    }

    /**
     * Set <p>标签颜色</p>
     * @param TagColor <p>标签颜色</p>
     */
    public void setTagColor(String TagColor) {
        this.TagColor = TagColor;
    }

    /**
     * Get <p>标签ID</p> 
     * @return TagID <p>标签ID</p>
     */
    public Long getTagID() {
        return this.TagID;
    }

    /**
     * Set <p>标签ID</p>
     * @param TagID <p>标签ID</p>
     */
    public void setTagID(Long TagID) {
        this.TagID = TagID;
    }

    /**
     * Get <p>标签键（根据语言环境返回中文或英文）</p> 
     * @return TagKey <p>标签键（根据语言环境返回中文或英文）</p>
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set <p>标签键（根据语言环境返回中文或英文）</p>
     * @param TagKey <p>标签键（根据语言环境返回中文或英文）</p>
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get <p>标签值（根据语言环境返回中文或英文）</p> 
     * @return TagValue <p>标签值（根据语言环境返回中文或英文）</p>
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set <p>标签值（根据语言环境返回中文或英文）</p>
     * @param TagValue <p>标签值（根据语言环境返回中文或英文）</p>
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    public CSIPTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CSIPTag(CSIPTag source) {
        if (source.TagColor != null) {
            this.TagColor = new String(source.TagColor);
        }
        if (source.TagID != null) {
            this.TagID = new Long(source.TagID);
        }
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagColor", this.TagColor);
        this.setParamSimple(map, prefix + "TagID", this.TagID);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);

    }
}

