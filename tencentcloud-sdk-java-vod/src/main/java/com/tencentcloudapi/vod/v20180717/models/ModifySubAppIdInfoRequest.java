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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySubAppIdInfoRequest extends AbstractModel{

    /**
    * 子应用 ID。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 子应用名称，长度限制：40个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 子应用简介，长度限制： 300个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 子应用 ID。 
     * @return SubAppId 子应用 ID。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 子应用 ID。
     * @param SubAppId 子应用 ID。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 子应用名称，长度限制：40个字符。 
     * @return Name 子应用名称，长度限制：40个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 子应用名称，长度限制：40个字符。
     * @param Name 子应用名称，长度限制：40个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 子应用简介，长度限制： 300个字符。 
     * @return Description 子应用简介，长度限制： 300个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 子应用简介，长度限制： 300个字符。
     * @param Description 子应用简介，长度限制： 300个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

