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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateOIDCConfigRequest extends AbstractModel{

    /**
    * 身份提供商URL
    */
    @SerializedName("IdentityUrl")
    @Expose
    private String IdentityUrl;

    /**
    * 签名公钥，需要base64
    */
    @SerializedName("IdentityKey")
    @Expose
    private String IdentityKey;

    /**
    * 客户端ID
    */
    @SerializedName("ClientId")
    @Expose
    private String [] ClientId;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 身份提供商URL 
     * @return IdentityUrl 身份提供商URL
     */
    public String getIdentityUrl() {
        return this.IdentityUrl;
    }

    /**
     * Set 身份提供商URL
     * @param IdentityUrl 身份提供商URL
     */
    public void setIdentityUrl(String IdentityUrl) {
        this.IdentityUrl = IdentityUrl;
    }

    /**
     * Get 签名公钥，需要base64 
     * @return IdentityKey 签名公钥，需要base64
     */
    public String getIdentityKey() {
        return this.IdentityKey;
    }

    /**
     * Set 签名公钥，需要base64
     * @param IdentityKey 签名公钥，需要base64
     */
    public void setIdentityKey(String IdentityKey) {
        this.IdentityKey = IdentityKey;
    }

    /**
     * Get 客户端ID 
     * @return ClientId 客户端ID
     */
    public String [] getClientId() {
        return this.ClientId;
    }

    /**
     * Set 客户端ID
     * @param ClientId 客户端ID
     */
    public void setClientId(String [] ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public UpdateOIDCConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateOIDCConfigRequest(UpdateOIDCConfigRequest source) {
        if (source.IdentityUrl != null) {
            this.IdentityUrl = new String(source.IdentityUrl);
        }
        if (source.IdentityKey != null) {
            this.IdentityKey = new String(source.IdentityKey);
        }
        if (source.ClientId != null) {
            this.ClientId = new String[source.ClientId.length];
            for (int i = 0; i < source.ClientId.length; i++) {
                this.ClientId[i] = new String(source.ClientId[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentityUrl", this.IdentityUrl);
        this.setParamSimple(map, prefix + "IdentityKey", this.IdentityKey);
        this.setParamArraySimple(map, prefix + "ClientId.", this.ClientId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

