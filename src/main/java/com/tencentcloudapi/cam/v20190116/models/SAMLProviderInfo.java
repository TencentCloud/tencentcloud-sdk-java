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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SAMLProviderInfo extends AbstractModel {

    /**
    * SAML身份提供商名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * SAML身份提供商描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * SAML身份提供商创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * SAML身份提供商上次修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get SAML身份提供商名称 
     * @return Name SAML身份提供商名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set SAML身份提供商名称
     * @param Name SAML身份提供商名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get SAML身份提供商描述 
     * @return Description SAML身份提供商描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set SAML身份提供商描述
     * @param Description SAML身份提供商描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get SAML身份提供商创建时间 
     * @return CreateTime SAML身份提供商创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set SAML身份提供商创建时间
     * @param CreateTime SAML身份提供商创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get SAML身份提供商上次修改时间 
     * @return ModifyTime SAML身份提供商上次修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set SAML身份提供商上次修改时间
     * @param ModifyTime SAML身份提供商上次修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public SAMLProviderInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SAMLProviderInfo(SAMLProviderInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

