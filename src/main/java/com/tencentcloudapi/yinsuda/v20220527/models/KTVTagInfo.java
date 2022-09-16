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
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KTVTagInfo extends AbstractModel{

    /**
    * 标签 Id。
    */
    @SerializedName("TagId")
    @Expose
    private String TagId;

    /**
    * 标签名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 标签 Id。 
     * @return TagId 标签 Id。
     */
    public String getTagId() {
        return this.TagId;
    }

    /**
     * Set 标签 Id。
     * @param TagId 标签 Id。
     */
    public void setTagId(String TagId) {
        this.TagId = TagId;
    }

    /**
     * Get 标签名称。 
     * @return Name 标签名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 标签名称。
     * @param Name 标签名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public KTVTagInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KTVTagInfo(KTVTagInfo source) {
        if (source.TagId != null) {
            this.TagId = new String(source.TagId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagId", this.TagId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

