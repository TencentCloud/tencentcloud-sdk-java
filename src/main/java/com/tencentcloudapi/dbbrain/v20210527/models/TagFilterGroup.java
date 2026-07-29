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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagFilterGroup extends AbstractModel {

    /**
    * <p>过滤条件-标签组</p>
    */
    @SerializedName("TagPairs")
    @Expose
    private TagPair [] TagPairs;

    /**
     * Get <p>过滤条件-标签组</p> 
     * @return TagPairs <p>过滤条件-标签组</p>
     */
    public TagPair [] getTagPairs() {
        return this.TagPairs;
    }

    /**
     * Set <p>过滤条件-标签组</p>
     * @param TagPairs <p>过滤条件-标签组</p>
     */
    public void setTagPairs(TagPair [] TagPairs) {
        this.TagPairs = TagPairs;
    }

    public TagFilterGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagFilterGroup(TagFilterGroup source) {
        if (source.TagPairs != null) {
            this.TagPairs = new TagPair[source.TagPairs.length];
            for (int i = 0; i < source.TagPairs.length; i++) {
                this.TagPairs[i] = new TagPair(source.TagPairs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TagPairs.", this.TagPairs);

    }
}

