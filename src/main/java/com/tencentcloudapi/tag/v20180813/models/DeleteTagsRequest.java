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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteTagsRequest extends AbstractModel{

    /**
    * 标签列表。
N取值范围：0~9
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 标签列表。
N取值范围：0~9 
     * @return Tags 标签列表。
N取值范围：0~9
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表。
N取值范围：0~9
     * @param Tags 标签列表。
N取值范围：0~9
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public DeleteTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTagsRequest(DeleteTagsRequest source) {
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

