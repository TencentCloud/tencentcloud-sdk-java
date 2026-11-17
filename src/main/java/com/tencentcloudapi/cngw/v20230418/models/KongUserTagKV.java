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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KongUserTagKV extends AbstractModel {

    /**
    * <p>标签 ID</p>
    */
    @SerializedName("TagId")
    @Expose
    private Long TagId;

    /**
    * <p>标签 Key</p>
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * <p>标签 Value</p>
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
     * Get <p>标签 ID</p> 
     * @return TagId <p>标签 ID</p>
     */
    public Long getTagId() {
        return this.TagId;
    }

    /**
     * Set <p>标签 ID</p>
     * @param TagId <p>标签 ID</p>
     */
    public void setTagId(Long TagId) {
        this.TagId = TagId;
    }

    /**
     * Get <p>标签 Key</p> 
     * @return TagKey <p>标签 Key</p>
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set <p>标签 Key</p>
     * @param TagKey <p>标签 Key</p>
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get <p>标签 Value</p> 
     * @return TagValue <p>标签 Value</p>
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set <p>标签 Value</p>
     * @param TagValue <p>标签 Value</p>
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    public KongUserTagKV() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongUserTagKV(KongUserTagKV source) {
        if (source.TagId != null) {
            this.TagId = new Long(source.TagId);
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
        this.setParamSimple(map, prefix + "TagId", this.TagId);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);

    }
}

