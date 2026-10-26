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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudNativeAPIGatewaySecretKeyListRequest extends AbstractModel {

    /**
    * <p>实例 ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>每页数量，最大20个</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>起始值</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>资源类型：</p><ul><li>Consumer: 消费者</li><li>LLM: 模型服务</li></ul>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>资源id</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>是否展示可以用于绑定信息,true/false</p>
    */
    @SerializedName("UseToBind")
    @Expose
    private Boolean UseToBind;

    /**
    * <p>Key 可选：</p><ul><li>SecretType:  密钥类型 ApiKey</li><li>GenerateType:  生成方式，例如 KMS</li><li>Status: 状态 Enable/Disable</li></ul>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>检索关键字</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>可选 Boolean，默认 false。仅传 true 且返回记录 ResourceType=Consumer 时，额外返回 CredentialGenerateType、CreationSource、BatchId；省略或 false 时不返回这三个字段，原字段和返回结构保持不变。此参数只控制展示字段，不控制 Filters 是否生效。</p>
    */
    @SerializedName("IncludeCreationInfo")
    @Expose
    private Boolean IncludeCreationInfo;

    /**
     * Get <p>实例 ID</p> 
     * @return GatewayId <p>实例 ID</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>实例 ID</p>
     * @param GatewayId <p>实例 ID</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>每页数量，最大20个</p> 
     * @return Limit <p>每页数量，最大20个</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页数量，最大20个</p>
     * @param Limit <p>每页数量，最大20个</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>起始值</p> 
     * @return Offset <p>起始值</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>起始值</p>
     * @param Offset <p>起始值</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>资源类型：</p><ul><li>Consumer: 消费者</li><li>LLM: 模型服务</li></ul> 
     * @return ResourceType <p>资源类型：</p><ul><li>Consumer: 消费者</li><li>LLM: 模型服务</li></ul>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型：</p><ul><li>Consumer: 消费者</li><li>LLM: 模型服务</li></ul>
     * @param ResourceType <p>资源类型：</p><ul><li>Consumer: 消费者</li><li>LLM: 模型服务</li></ul>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>资源id</p> 
     * @return ResourceId <p>资源id</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源id</p>
     * @param ResourceId <p>资源id</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>是否展示可以用于绑定信息,true/false</p> 
     * @return UseToBind <p>是否展示可以用于绑定信息,true/false</p>
     */
    public Boolean getUseToBind() {
        return this.UseToBind;
    }

    /**
     * Set <p>是否展示可以用于绑定信息,true/false</p>
     * @param UseToBind <p>是否展示可以用于绑定信息,true/false</p>
     */
    public void setUseToBind(Boolean UseToBind) {
        this.UseToBind = UseToBind;
    }

    /**
     * Get <p>Key 可选：</p><ul><li>SecretType:  密钥类型 ApiKey</li><li>GenerateType:  生成方式，例如 KMS</li><li>Status: 状态 Enable/Disable</li></ul> 
     * @return Filters <p>Key 可选：</p><ul><li>SecretType:  密钥类型 ApiKey</li><li>GenerateType:  生成方式，例如 KMS</li><li>Status: 状态 Enable/Disable</li></ul>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Key 可选：</p><ul><li>SecretType:  密钥类型 ApiKey</li><li>GenerateType:  生成方式，例如 KMS</li><li>Status: 状态 Enable/Disable</li></ul>
     * @param Filters <p>Key 可选：</p><ul><li>SecretType:  密钥类型 ApiKey</li><li>GenerateType:  生成方式，例如 KMS</li><li>Status: 状态 Enable/Disable</li></ul>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>检索关键字</p> 
     * @return Keyword <p>检索关键字</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>检索关键字</p>
     * @param Keyword <p>检索关键字</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>可选 Boolean，默认 false。仅传 true 且返回记录 ResourceType=Consumer 时，额外返回 CredentialGenerateType、CreationSource、BatchId；省略或 false 时不返回这三个字段，原字段和返回结构保持不变。此参数只控制展示字段，不控制 Filters 是否生效。</p> 
     * @return IncludeCreationInfo <p>可选 Boolean，默认 false。仅传 true 且返回记录 ResourceType=Consumer 时，额外返回 CredentialGenerateType、CreationSource、BatchId；省略或 false 时不返回这三个字段，原字段和返回结构保持不变。此参数只控制展示字段，不控制 Filters 是否生效。</p>
     */
    public Boolean getIncludeCreationInfo() {
        return this.IncludeCreationInfo;
    }

    /**
     * Set <p>可选 Boolean，默认 false。仅传 true 且返回记录 ResourceType=Consumer 时，额外返回 CredentialGenerateType、CreationSource、BatchId；省略或 false 时不返回这三个字段，原字段和返回结构保持不变。此参数只控制展示字段，不控制 Filters 是否生效。</p>
     * @param IncludeCreationInfo <p>可选 Boolean，默认 false。仅传 true 且返回记录 ResourceType=Consumer 时，额外返回 CredentialGenerateType、CreationSource、BatchId；省略或 false 时不返回这三个字段，原字段和返回结构保持不变。此参数只控制展示字段，不控制 Filters 是否生效。</p>
     */
    public void setIncludeCreationInfo(Boolean IncludeCreationInfo) {
        this.IncludeCreationInfo = IncludeCreationInfo;
    }

    public DescribeCloudNativeAPIGatewaySecretKeyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewaySecretKeyListRequest(DescribeCloudNativeAPIGatewaySecretKeyListRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.UseToBind != null) {
            this.UseToBind = new Boolean(source.UseToBind);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.IncludeCreationInfo != null) {
            this.IncludeCreationInfo = new Boolean(source.IncludeCreationInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "UseToBind", this.UseToBind);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "IncludeCreationInfo", this.IncludeCreationInfo);

    }
}

