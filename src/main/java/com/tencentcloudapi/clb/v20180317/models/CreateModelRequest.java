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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateModelRequest extends AbstractModel {

    /**
    * <p>接入类型：PublicBYOK/PublicCustom/PrivateCustom</p>
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * <p>模型提供商</p>
    */
    @SerializedName("ModelProvider")
    @Expose
    private String ModelProvider;

    /**
    * <p>通用模型标识列表</p>
    */
    @SerializedName("ModelIds")
    @Expose
    private ModelItem [] ModelIds;

    /**
    * <p>Key 列表</p>
    */
    @SerializedName("Keys")
    @Expose
    private KeyItem [] Keys;

    /**
    * <p>BYOK ID(在自定义模型时在部署网络后必须填写)</p>
    */
    @SerializedName("ServiceProviderId")
    @Expose
    private String ServiceProviderId;

    /**
    * <p>服务供应商(创建BYOK自定义名称)。</p>
    */
    @SerializedName("ServiceProviderName")
    @Expose
    private String ServiceProviderName;

    /**
    * <p>模型协议</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>API Base URL</p>
    */
    @SerializedName("ApiBase")
    @Expose
    private String ApiBase;

    /**
    * <p>VPC ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网 ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>转发请求时添加的Host请求头</p>
    */
    @SerializedName("HostHeader")
    @Expose
    private String HostHeader;

    /**
    * <p>标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>是否校验服务提供商的SSL证书</p>
    */
    @SerializedName("VerifySSL")
    @Expose
    private Boolean VerifySSL;

    /**
     * Get <p>接入类型：PublicBYOK/PublicCustom/PrivateCustom</p> 
     * @return AccessType <p>接入类型：PublicBYOK/PublicCustom/PrivateCustom</p>
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <p>接入类型：PublicBYOK/PublicCustom/PrivateCustom</p>
     * @param AccessType <p>接入类型：PublicBYOK/PublicCustom/PrivateCustom</p>
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <p>模型提供商</p> 
     * @return ModelProvider <p>模型提供商</p>
     */
    public String getModelProvider() {
        return this.ModelProvider;
    }

    /**
     * Set <p>模型提供商</p>
     * @param ModelProvider <p>模型提供商</p>
     */
    public void setModelProvider(String ModelProvider) {
        this.ModelProvider = ModelProvider;
    }

    /**
     * Get <p>通用模型标识列表</p> 
     * @return ModelIds <p>通用模型标识列表</p>
     */
    public ModelItem [] getModelIds() {
        return this.ModelIds;
    }

    /**
     * Set <p>通用模型标识列表</p>
     * @param ModelIds <p>通用模型标识列表</p>
     */
    public void setModelIds(ModelItem [] ModelIds) {
        this.ModelIds = ModelIds;
    }

    /**
     * Get <p>Key 列表</p> 
     * @return Keys <p>Key 列表</p>
     */
    public KeyItem [] getKeys() {
        return this.Keys;
    }

    /**
     * Set <p>Key 列表</p>
     * @param Keys <p>Key 列表</p>
     */
    public void setKeys(KeyItem [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get <p>BYOK ID(在自定义模型时在部署网络后必须填写)</p> 
     * @return ServiceProviderId <p>BYOK ID(在自定义模型时在部署网络后必须填写)</p>
     */
    public String getServiceProviderId() {
        return this.ServiceProviderId;
    }

    /**
     * Set <p>BYOK ID(在自定义模型时在部署网络后必须填写)</p>
     * @param ServiceProviderId <p>BYOK ID(在自定义模型时在部署网络后必须填写)</p>
     */
    public void setServiceProviderId(String ServiceProviderId) {
        this.ServiceProviderId = ServiceProviderId;
    }

    /**
     * Get <p>服务供应商(创建BYOK自定义名称)。</p> 
     * @return ServiceProviderName <p>服务供应商(创建BYOK自定义名称)。</p>
     */
    public String getServiceProviderName() {
        return this.ServiceProviderName;
    }

    /**
     * Set <p>服务供应商(创建BYOK自定义名称)。</p>
     * @param ServiceProviderName <p>服务供应商(创建BYOK自定义名称)。</p>
     */
    public void setServiceProviderName(String ServiceProviderName) {
        this.ServiceProviderName = ServiceProviderName;
    }

    /**
     * Get <p>模型协议</p> 
     * @return Protocol <p>模型协议</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>模型协议</p>
     * @param Protocol <p>模型协议</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>API Base URL</p> 
     * @return ApiBase <p>API Base URL</p>
     */
    public String getApiBase() {
        return this.ApiBase;
    }

    /**
     * Set <p>API Base URL</p>
     * @param ApiBase <p>API Base URL</p>
     */
    public void setApiBase(String ApiBase) {
        this.ApiBase = ApiBase;
    }

    /**
     * Get <p>VPC ID</p> 
     * @return VpcId <p>VPC ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID</p>
     * @param VpcId <p>VPC ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网 ID</p> 
     * @return SubnetId <p>子网 ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网 ID</p>
     * @param SubnetId <p>子网 ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>转发请求时添加的Host请求头</p> 
     * @return HostHeader <p>转发请求时添加的Host请求头</p>
     */
    public String getHostHeader() {
        return this.HostHeader;
    }

    /**
     * Set <p>转发请求时添加的Host请求头</p>
     * @param HostHeader <p>转发请求时添加的Host请求头</p>
     */
    public void setHostHeader(String HostHeader) {
        this.HostHeader = HostHeader;
    }

    /**
     * Get <p>标签信息</p> 
     * @return Tags <p>标签信息</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签信息</p>
     * @param Tags <p>标签信息</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>是否校验服务提供商的SSL证书</p> 
     * @return VerifySSL <p>是否校验服务提供商的SSL证书</p>
     */
    public Boolean getVerifySSL() {
        return this.VerifySSL;
    }

    /**
     * Set <p>是否校验服务提供商的SSL证书</p>
     * @param VerifySSL <p>是否校验服务提供商的SSL证书</p>
     */
    public void setVerifySSL(Boolean VerifySSL) {
        this.VerifySSL = VerifySSL;
    }

    public CreateModelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateModelRequest(CreateModelRequest source) {
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.ModelProvider != null) {
            this.ModelProvider = new String(source.ModelProvider);
        }
        if (source.ModelIds != null) {
            this.ModelIds = new ModelItem[source.ModelIds.length];
            for (int i = 0; i < source.ModelIds.length; i++) {
                this.ModelIds[i] = new ModelItem(source.ModelIds[i]);
            }
        }
        if (source.Keys != null) {
            this.Keys = new KeyItem[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new KeyItem(source.Keys[i]);
            }
        }
        if (source.ServiceProviderId != null) {
            this.ServiceProviderId = new String(source.ServiceProviderId);
        }
        if (source.ServiceProviderName != null) {
            this.ServiceProviderName = new String(source.ServiceProviderName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ApiBase != null) {
            this.ApiBase = new String(source.ApiBase);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.HostHeader != null) {
            this.HostHeader = new String(source.HostHeader);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.VerifySSL != null) {
            this.VerifySSL = new Boolean(source.VerifySSL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "ModelProvider", this.ModelProvider);
        this.setParamArrayObj(map, prefix + "ModelIds.", this.ModelIds);
        this.setParamArrayObj(map, prefix + "Keys.", this.Keys);
        this.setParamSimple(map, prefix + "ServiceProviderId", this.ServiceProviderId);
        this.setParamSimple(map, prefix + "ServiceProviderName", this.ServiceProviderName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ApiBase", this.ApiBase);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "HostHeader", this.HostHeader);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "VerifySSL", this.VerifySSL);

    }
}

