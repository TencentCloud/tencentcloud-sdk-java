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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSubAppIdRequest extends AbstractModel {

    /**
    * 应用名称，长度限制：40个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 应用简介，长度限制： 300个字符。不填则应用简介默认为空。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 应用类型， 取值有：<li>AllInOne：一体化；</li><li>Professional：专业版。</li>默认值为 AllInOne。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 应用名称，长度限制：40个字符。 
     * @return Name 应用名称，长度限制：40个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 应用名称，长度限制：40个字符。
     * @param Name 应用名称，长度限制：40个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 应用简介，长度限制： 300个字符。不填则应用简介默认为空。 
     * @return Description 应用简介，长度限制： 300个字符。不填则应用简介默认为空。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 应用简介，长度限制： 300个字符。不填则应用简介默认为空。
     * @param Description 应用简介，长度限制： 300个字符。不填则应用简介默认为空。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 应用类型， 取值有：<li>AllInOne：一体化；</li><li>Professional：专业版。</li>默认值为 AllInOne。 
     * @return Type 应用类型， 取值有：<li>AllInOne：一体化；</li><li>Professional：专业版。</li>默认值为 AllInOne。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 应用类型， 取值有：<li>AllInOne：一体化；</li><li>Professional：专业版。</li>默认值为 AllInOne。
     * @param Type 应用类型， 取值有：<li>AllInOne：一体化；</li><li>Professional：专业版。</li>默认值为 AllInOne。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public CreateSubAppIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSubAppIdRequest(CreateSubAppIdRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

