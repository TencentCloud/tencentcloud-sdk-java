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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConnectorInfo extends AbstractModel {

    /**
    * 连接器 ID
    */
    @SerializedName("ConnectorId")
    @Expose
    private String ConnectorId;

    /**
    * 连接器短标识（终身不变，跨版本稳定）
    */
    @SerializedName("ConnectorSlug")
    @Expose
    private String ConnectorSlug;

    /**
    * 版本级连接器密钥
    */
    @SerializedName("ConnectorKey")
    @Expose
    private String ConnectorKey;

    /**
    * 连接器名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 连接器描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 头像 URL
    */
    @SerializedName("AvatarUrl")
    @Expose
    private String AvatarUrl;

    /**
    * 连接器来源：ENTERPRISE_AGENT / ASSISTANT
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 归属企业 ID
    */
    @SerializedName("EnterpriseId")
    @Expose
    private String EnterpriseId;

    /**
    * 连接器类型：MCP_SERVER / A2A / API_SERVICE
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 上游服务地址
    */
    @SerializedName("ServiceUrl")
    @Expose
    private String ServiceUrl;

    /**
    * 授权方式列表：NONE / ONEID / OAUTH2_IDP
    */
    @SerializedName("AuthModes")
    @Expose
    private String [] AuthModes;

    /**
    * 最新版本号
    */
    @SerializedName("LatestVersionNo")
    @Expose
    private Long LatestVersionNo;

    /**
    * 连接器状态：ACTIVE / DISABLED
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建人 ID
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * 创建时间（ISO8601，UTC）
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 最后修改时间（ISO8601，UTC）
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
     * Get 连接器 ID 
     * @return ConnectorId 连接器 ID
     */
    public String getConnectorId() {
        return this.ConnectorId;
    }

    /**
     * Set 连接器 ID
     * @param ConnectorId 连接器 ID
     */
    public void setConnectorId(String ConnectorId) {
        this.ConnectorId = ConnectorId;
    }

    /**
     * Get 连接器短标识（终身不变，跨版本稳定） 
     * @return ConnectorSlug 连接器短标识（终身不变，跨版本稳定）
     */
    public String getConnectorSlug() {
        return this.ConnectorSlug;
    }

    /**
     * Set 连接器短标识（终身不变，跨版本稳定）
     * @param ConnectorSlug 连接器短标识（终身不变，跨版本稳定）
     */
    public void setConnectorSlug(String ConnectorSlug) {
        this.ConnectorSlug = ConnectorSlug;
    }

    /**
     * Get 版本级连接器密钥 
     * @return ConnectorKey 版本级连接器密钥
     */
    public String getConnectorKey() {
        return this.ConnectorKey;
    }

    /**
     * Set 版本级连接器密钥
     * @param ConnectorKey 版本级连接器密钥
     */
    public void setConnectorKey(String ConnectorKey) {
        this.ConnectorKey = ConnectorKey;
    }

    /**
     * Get 连接器名称 
     * @return Name 连接器名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 连接器名称
     * @param Name 连接器名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 连接器描述 
     * @return Description 连接器描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 连接器描述
     * @param Description 连接器描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 头像 URL 
     * @return AvatarUrl 头像 URL
     */
    public String getAvatarUrl() {
        return this.AvatarUrl;
    }

    /**
     * Set 头像 URL
     * @param AvatarUrl 头像 URL
     */
    public void setAvatarUrl(String AvatarUrl) {
        this.AvatarUrl = AvatarUrl;
    }

    /**
     * Get 连接器来源：ENTERPRISE_AGENT / ASSISTANT 
     * @return Source 连接器来源：ENTERPRISE_AGENT / ASSISTANT
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 连接器来源：ENTERPRISE_AGENT / ASSISTANT
     * @param Source 连接器来源：ENTERPRISE_AGENT / ASSISTANT
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 归属企业 ID 
     * @return EnterpriseId 归属企业 ID
     */
    public String getEnterpriseId() {
        return this.EnterpriseId;
    }

    /**
     * Set 归属企业 ID
     * @param EnterpriseId 归属企业 ID
     */
    public void setEnterpriseId(String EnterpriseId) {
        this.EnterpriseId = EnterpriseId;
    }

    /**
     * Get 连接器类型：MCP_SERVER / A2A / API_SERVICE 
     * @return Type 连接器类型：MCP_SERVER / A2A / API_SERVICE
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 连接器类型：MCP_SERVER / A2A / API_SERVICE
     * @param Type 连接器类型：MCP_SERVER / A2A / API_SERVICE
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 上游服务地址 
     * @return ServiceUrl 上游服务地址
     */
    public String getServiceUrl() {
        return this.ServiceUrl;
    }

    /**
     * Set 上游服务地址
     * @param ServiceUrl 上游服务地址
     */
    public void setServiceUrl(String ServiceUrl) {
        this.ServiceUrl = ServiceUrl;
    }

    /**
     * Get 授权方式列表：NONE / ONEID / OAUTH2_IDP 
     * @return AuthModes 授权方式列表：NONE / ONEID / OAUTH2_IDP
     */
    public String [] getAuthModes() {
        return this.AuthModes;
    }

    /**
     * Set 授权方式列表：NONE / ONEID / OAUTH2_IDP
     * @param AuthModes 授权方式列表：NONE / ONEID / OAUTH2_IDP
     */
    public void setAuthModes(String [] AuthModes) {
        this.AuthModes = AuthModes;
    }

    /**
     * Get 最新版本号 
     * @return LatestVersionNo 最新版本号
     */
    public Long getLatestVersionNo() {
        return this.LatestVersionNo;
    }

    /**
     * Set 最新版本号
     * @param LatestVersionNo 最新版本号
     */
    public void setLatestVersionNo(Long LatestVersionNo) {
        this.LatestVersionNo = LatestVersionNo;
    }

    /**
     * Get 连接器状态：ACTIVE / DISABLED 
     * @return Status 连接器状态：ACTIVE / DISABLED
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 连接器状态：ACTIVE / DISABLED
     * @param Status 连接器状态：ACTIVE / DISABLED
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建人 ID 
     * @return CreatorId 创建人 ID
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set 创建人 ID
     * @param CreatorId 创建人 ID
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }

    /**
     * Get 创建时间（ISO8601，UTC） 
     * @return CreatedTime 创建时间（ISO8601，UTC）
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间（ISO8601，UTC）
     * @param CreatedTime 创建时间（ISO8601，UTC）
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 最后修改时间（ISO8601，UTC） 
     * @return ModifiedTime 最后修改时间（ISO8601，UTC）
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 最后修改时间（ISO8601，UTC）
     * @param ModifiedTime 最后修改时间（ISO8601，UTC）
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    public ConnectorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConnectorInfo(ConnectorInfo source) {
        if (source.ConnectorId != null) {
            this.ConnectorId = new String(source.ConnectorId);
        }
        if (source.ConnectorSlug != null) {
            this.ConnectorSlug = new String(source.ConnectorSlug);
        }
        if (source.ConnectorKey != null) {
            this.ConnectorKey = new String(source.ConnectorKey);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AvatarUrl != null) {
            this.AvatarUrl = new String(source.AvatarUrl);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.EnterpriseId != null) {
            this.EnterpriseId = new String(source.EnterpriseId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ServiceUrl != null) {
            this.ServiceUrl = new String(source.ServiceUrl);
        }
        if (source.AuthModes != null) {
            this.AuthModes = new String[source.AuthModes.length];
            for (int i = 0; i < source.AuthModes.length; i++) {
                this.AuthModes[i] = new String(source.AuthModes[i]);
            }
        }
        if (source.LatestVersionNo != null) {
            this.LatestVersionNo = new Long(source.LatestVersionNo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatorId != null) {
            this.CreatorId = new String(source.CreatorId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnectorId", this.ConnectorId);
        this.setParamSimple(map, prefix + "ConnectorSlug", this.ConnectorSlug);
        this.setParamSimple(map, prefix + "ConnectorKey", this.ConnectorKey);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AvatarUrl", this.AvatarUrl);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "EnterpriseId", this.EnterpriseId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ServiceUrl", this.ServiceUrl);
        this.setParamArraySimple(map, prefix + "AuthModes.", this.AuthModes);
        this.setParamSimple(map, prefix + "LatestVersionNo", this.LatestVersionNo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatorId", this.CreatorId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);

    }
}

