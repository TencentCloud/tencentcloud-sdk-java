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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ToolRepoTag extends AbstractModel {

    /**
    * <p>应用分类标签ID</p>
    */
    @SerializedName("TagId")
    @Expose
    private String TagId;

    /**
    * <p>应用分类标签名称</p>
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
     * Get <p>应用分类标签ID</p> 
     * @return TagId <p>应用分类标签ID</p>
     */
    public String getTagId() {
        return this.TagId;
    }

    /**
     * Set <p>应用分类标签ID</p>
     * @param TagId <p>应用分类标签ID</p>
     */
    public void setTagId(String TagId) {
        this.TagId = TagId;
    }

    /**
     * Get <p>应用分类标签名称</p> 
     * @return TagName <p>应用分类标签名称</p>
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set <p>应用分类标签名称</p>
     * @param TagName <p>应用分类标签名称</p>
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    public ToolRepoTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ToolRepoTag(ToolRepoTag source) {
        if (source.TagId != null) {
            this.TagId = new String(source.TagId);
        }
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagId", this.TagId);
        this.setParamSimple(map, prefix + "TagName", this.TagName);

    }
}

