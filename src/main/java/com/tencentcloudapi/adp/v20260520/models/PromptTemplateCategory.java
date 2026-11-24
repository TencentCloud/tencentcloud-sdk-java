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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PromptTemplateCategory extends AbstractModel {

    /**
    * 分类标识
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 分类名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 分类标识 
     * @return Key 分类标识
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 分类标识
     * @param Key 分类标识
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 分类名称 
     * @return Name 分类名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分类名称
     * @param Name 分类名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public PromptTemplateCategory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PromptTemplateCategory(PromptTemplateCategory source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

