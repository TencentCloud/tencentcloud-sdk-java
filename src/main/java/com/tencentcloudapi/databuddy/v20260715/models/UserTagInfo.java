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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserTagInfo extends AbstractModel {

    /**
    * <p>标签维度ID</p>
    */
    @SerializedName("TagId")
    @Expose
    private String TagId;

    /**
    * <p>标签名称，查询时填充，写入时不传</p>
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * <p>该维度下绑定的所有标签值</p>
    */
    @SerializedName("Values")
    @Expose
    private TagValueInfo [] Values;

    /**
     * Get <p>标签维度ID</p> 
     * @return TagId <p>标签维度ID</p>
     */
    public String getTagId() {
        return this.TagId;
    }

    /**
     * Set <p>标签维度ID</p>
     * @param TagId <p>标签维度ID</p>
     */
    public void setTagId(String TagId) {
        this.TagId = TagId;
    }

    /**
     * Get <p>标签名称，查询时填充，写入时不传</p> 
     * @return TagName <p>标签名称，查询时填充，写入时不传</p>
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set <p>标签名称，查询时填充，写入时不传</p>
     * @param TagName <p>标签名称，查询时填充，写入时不传</p>
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get <p>该维度下绑定的所有标签值</p> 
     * @return Values <p>该维度下绑定的所有标签值</p>
     */
    public TagValueInfo [] getValues() {
        return this.Values;
    }

    /**
     * Set <p>该维度下绑定的所有标签值</p>
     * @param Values <p>该维度下绑定的所有标签值</p>
     */
    public void setValues(TagValueInfo [] Values) {
        this.Values = Values;
    }

    public UserTagInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserTagInfo(UserTagInfo source) {
        if (source.TagId != null) {
            this.TagId = new String(source.TagId);
        }
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
        }
        if (source.Values != null) {
            this.Values = new TagValueInfo[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new TagValueInfo(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagId", this.TagId);
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamArrayObj(map, prefix + "Values.", this.Values);

    }
}

