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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagFilter extends AbstractModel {

    /**
    * 标签键名称
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * 标签值列表
    */
    @SerializedName("TagValues")
    @Expose
    private String [] TagValues;

    /**
     * Get 标签键名称 
     * @return TagKey 标签键名称
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set 标签键名称
     * @param TagKey 标签键名称
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get 标签值列表 
     * @return TagValues 标签值列表
     */
    public String [] getTagValues() {
        return this.TagValues;
    }

    /**
     * Set 标签值列表
     * @param TagValues 标签值列表
     */
    public void setTagValues(String [] TagValues) {
        this.TagValues = TagValues;
    }

    public TagFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagFilter(TagFilter source) {
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValues != null) {
            this.TagValues = new String[source.TagValues.length];
            for (int i = 0; i < source.TagValues.length; i++) {
                this.TagValues[i] = new String(source.TagValues[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamArraySimple(map, prefix + "TagValues.", this.TagValues);

    }
}

