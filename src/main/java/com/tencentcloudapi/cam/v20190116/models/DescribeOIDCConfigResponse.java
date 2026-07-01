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

public class DescribeOIDCConfigResponse extends AbstractModel {

    /**
    * <p>身份提供商类型 11角色身份提供商</p>
    */
    @SerializedName("ProviderType")
    @Expose
    private Long ProviderType;

    /**
    * <p>身份提供商URL</p>
    */
    @SerializedName("IdentityUrl")
    @Expose
    private String IdentityUrl;

    /**
    * <p>签名公钥</p>
    */
    @SerializedName("IdentityKey")
    @Expose
    private String IdentityKey;

    /**
    * <p>客户端id</p>
    */
    @SerializedName("ClientId")
    @Expose
    private String [] ClientId;

    /**
    * <p>状态：0:未设置，11:已开启，2:已禁用</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>OIDC公钥自动轮转开关</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul><p>默认值：0</p>
    */
    @SerializedName("AutoRotateKey")
    @Expose
    private Long AutoRotateKey;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>身份提供商类型 11角色身份提供商</p> 
     * @return ProviderType <p>身份提供商类型 11角色身份提供商</p>
     */
    public Long getProviderType() {
        return this.ProviderType;
    }

    /**
     * Set <p>身份提供商类型 11角色身份提供商</p>
     * @param ProviderType <p>身份提供商类型 11角色身份提供商</p>
     */
    public void setProviderType(Long ProviderType) {
        this.ProviderType = ProviderType;
    }

    /**
     * Get <p>身份提供商URL</p> 
     * @return IdentityUrl <p>身份提供商URL</p>
     */
    public String getIdentityUrl() {
        return this.IdentityUrl;
    }

    /**
     * Set <p>身份提供商URL</p>
     * @param IdentityUrl <p>身份提供商URL</p>
     */
    public void setIdentityUrl(String IdentityUrl) {
        this.IdentityUrl = IdentityUrl;
    }

    /**
     * Get <p>签名公钥</p> 
     * @return IdentityKey <p>签名公钥</p>
     */
    public String getIdentityKey() {
        return this.IdentityKey;
    }

    /**
     * Set <p>签名公钥</p>
     * @param IdentityKey <p>签名公钥</p>
     */
    public void setIdentityKey(String IdentityKey) {
        this.IdentityKey = IdentityKey;
    }

    /**
     * Get <p>客户端id</p> 
     * @return ClientId <p>客户端id</p>
     */
    public String [] getClientId() {
        return this.ClientId;
    }

    /**
     * Set <p>客户端id</p>
     * @param ClientId <p>客户端id</p>
     */
    public void setClientId(String [] ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get <p>状态：0:未设置，11:已开启，2:已禁用</p> 
     * @return Status <p>状态：0:未设置，11:已开启，2:已禁用</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态：0:未设置，11:已开启，2:已禁用</p>
     * @param Status <p>状态：0:未设置，11:已开启，2:已禁用</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>名称</p> 
     * @return Name <p>名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
     * @param Name <p>名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>OIDC公钥自动轮转开关</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul><p>默认值：0</p> 
     * @return AutoRotateKey <p>OIDC公钥自动轮转开关</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul><p>默认值：0</p>
     */
    public Long getAutoRotateKey() {
        return this.AutoRotateKey;
    }

    /**
     * Set <p>OIDC公钥自动轮转开关</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul><p>默认值：0</p>
     * @param AutoRotateKey <p>OIDC公钥自动轮转开关</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul><p>默认值：0</p>
     */
    public void setAutoRotateKey(Long AutoRotateKey) {
        this.AutoRotateKey = AutoRotateKey;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeOIDCConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOIDCConfigResponse(DescribeOIDCConfigResponse source) {
        if (source.ProviderType != null) {
            this.ProviderType = new Long(source.ProviderType);
        }
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
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AutoRotateKey != null) {
            this.AutoRotateKey = new Long(source.AutoRotateKey);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProviderType", this.ProviderType);
        this.setParamSimple(map, prefix + "IdentityUrl", this.IdentityUrl);
        this.setParamSimple(map, prefix + "IdentityKey", this.IdentityKey);
        this.setParamArraySimple(map, prefix + "ClientId.", this.ClientId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AutoRotateKey", this.AutoRotateKey);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

