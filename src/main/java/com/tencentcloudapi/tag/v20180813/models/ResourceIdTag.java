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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceIdTag extends AbstractModel {

    /**
    * 资源唯一标识
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 标签键值对
    */
    @SerializedName("TagKeyValues")
    @Expose
    private Tag [] TagKeyValues;

    /**
     * Get 资源唯一标识 
     * @return ResourceId 资源唯一标识
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源唯一标识
     * @param ResourceId 资源唯一标识
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 标签键值对 
     * @return TagKeyValues 标签键值对
     */
    public Tag [] getTagKeyValues() {
        return this.TagKeyValues;
    }

    /**
     * Set 标签键值对
     * @param TagKeyValues 标签键值对
     */
    public void setTagKeyValues(Tag [] TagKeyValues) {
        this.TagKeyValues = TagKeyValues;
    }

    public ResourceIdTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceIdTag(ResourceIdTag source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.TagKeyValues != null) {
            this.TagKeyValues = new Tag[source.TagKeyValues.length];
            for (int i = 0; i < source.TagKeyValues.length; i++) {
                this.TagKeyValues[i] = new Tag(source.TagKeyValues[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArrayObj(map, prefix + "TagKeyValues.", this.TagKeyValues);

    }
}

