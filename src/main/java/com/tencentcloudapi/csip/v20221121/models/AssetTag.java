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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetTag extends AbstractModel {

    /**
    * 标签的key值,可以是字母、数字、下划线
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * 标签的vale值,可以是字母、数字、下划线
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
     * Get 标签的key值,可以是字母、数字、下划线 
     * @return TagKey 标签的key值,可以是字母、数字、下划线
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set 标签的key值,可以是字母、数字、下划线
     * @param TagKey 标签的key值,可以是字母、数字、下划线
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get 标签的vale值,可以是字母、数字、下划线 
     * @return TagValue 标签的vale值,可以是字母、数字、下划线
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set 标签的vale值,可以是字母、数字、下划线
     * @param TagValue 标签的vale值,可以是字母、数字、下划线
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    public AssetTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetTag(AssetTag source) {
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
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);

    }
}

