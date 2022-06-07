/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagFilter extends AbstractModel{

    /**
    * 标签键
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * 多个标签值
    */
    @SerializedName("TagValues")
    @Expose
    private String [] TagValues;

    /**
     * Get 标签键 
     * @return TagKey 标签键
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set 标签键
     * @param TagKey 标签键
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get 多个标签值 
     * @return TagValues 多个标签值
     */
    public String [] getTagValues() {
        return this.TagValues;
    }

    /**
     * Set 多个标签值
     * @param TagValues 多个标签值
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

