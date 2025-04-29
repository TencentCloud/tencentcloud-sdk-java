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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNotebookTagsRequest extends AbstractModel {

    /**
    * Notebook Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Notebook修改标签集合
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Notebook Id 
     * @return Id Notebook Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Notebook Id
     * @param Id Notebook Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Notebook修改标签集合 
     * @return Tags Notebook修改标签集合
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Notebook修改标签集合
     * @param Tags Notebook修改标签集合
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public ModifyNotebookTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNotebookTagsRequest(ModifyNotebookTagsRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

