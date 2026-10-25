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
    * <p>连接器 ID</p>
    */
    @SerializedName("ConnectorId")
    @Expose
    private String ConnectorId;

    /**
    * <p>连接器短标识（终身不变，跨版本稳定）</p>
    */
    @SerializedName("ConnectorSlug")
    @Expose
    private String ConnectorSlug;

    /**
    * <p>版本级连接器密钥</p>
    */
    @SerializedName("ConnectorKey")
    @Expose
    private String ConnectorKey;

    /**
    * <p>连接器名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>连接器描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>头像 URL</p>
    */
    @SerializedName("AvatarUrl")
    @Expose
    private String AvatarUrl;

    /**
    * <p>连接器来源：ENTERPRISE_AGENT / ASSISTANT</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>归属企业 ID</p>
    */
    @SerializedName("EnterpriseId")
    @Expose
    private String EnterpriseId;

    /**
    * <p>连接器类型：MCP_SERVER / A2A / API_SERVICE</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>上游服务地址</p>
    */
    @SerializedName("ServiceUrl")
    @Expose
    private String ServiceUrl;

    /**
    * <p>授权方式列表：NONE / ONEID / OAUTH2_IDP / API_KEY / DYNAMIC_API_KEY。DYNAMIC_API_KEY 表示按每轮请求提供的动态字段，通过 HeaderMappings 注入出站 HTTP Header。</p>
    */
    @SerializedName("AuthModes")
    @Expose
    private String [] AuthModes;

    /**
    * <p>最新版本号</p>
    */
    @SerializedName("LatestVersionNo")
    @Expose
    private Long LatestVersionNo;

    /**
    * <p>连接器状态：ACTIVE / DISABLED</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>创建人 ID</p>
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * <p>创建时间（ISO8601，UTC）</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>最后修改时间（ISO8601，UTC）</p>
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * <p>VPC 网络配置 ID。为空表示该连接器通过公网访问 ServiceUrl。仅绑定 VPC 网络配置时本字段有值。</p>
    */
    @SerializedName("VpcConfigId")
    @Expose
    private String VpcConfigId;

    /**
    * <p>展示名：console 老连接器目录（DescribeConsoleConnectorList）下发，取 registry data.display_name，老数据缺失时回落 Name；云上目录无独立展示名，省略不返回。Name 是存储名/选型回写键（含 scope 前缀），不承担展示职责。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
     * Get <p>连接器 ID</p> 
     * @return ConnectorId <p>连接器 ID</p>
     */
    public String getConnectorId() {
        return this.ConnectorId;
    }

    /**
     * Set <p>连接器 ID</p>
     * @param ConnectorId <p>连接器 ID</p>
     */
    public void setConnectorId(String ConnectorId) {
        this.ConnectorId = ConnectorId;
    }

    /**
     * Get <p>连接器短标识（终身不变，跨版本稳定）</p> 
     * @return ConnectorSlug <p>连接器短标识（终身不变，跨版本稳定）</p>
     */
    public String getConnectorSlug() {
        return this.ConnectorSlug;
    }

    /**
     * Set <p>连接器短标识（终身不变，跨版本稳定）</p>
     * @param ConnectorSlug <p>连接器短标识（终身不变，跨版本稳定）</p>
     */
    public void setConnectorSlug(String ConnectorSlug) {
        this.ConnectorSlug = ConnectorSlug;
    }

    /**
     * Get <p>版本级连接器密钥</p> 
     * @return ConnectorKey <p>版本级连接器密钥</p>
     */
    public String getConnectorKey() {
        return this.ConnectorKey;
    }

    /**
     * Set <p>版本级连接器密钥</p>
     * @param ConnectorKey <p>版本级连接器密钥</p>
     */
    public void setConnectorKey(String ConnectorKey) {
        this.ConnectorKey = ConnectorKey;
    }

    /**
     * Get <p>连接器名称</p> 
     * @return Name <p>连接器名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>连接器名称</p>
     * @param Name <p>连接器名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>连接器描述</p> 
     * @return Description <p>连接器描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>连接器描述</p>
     * @param Description <p>连接器描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>头像 URL</p> 
     * @return AvatarUrl <p>头像 URL</p>
     */
    public String getAvatarUrl() {
        return this.AvatarUrl;
    }

    /**
     * Set <p>头像 URL</p>
     * @param AvatarUrl <p>头像 URL</p>
     */
    public void setAvatarUrl(String AvatarUrl) {
        this.AvatarUrl = AvatarUrl;
    }

    /**
     * Get <p>连接器来源：ENTERPRISE_AGENT / ASSISTANT</p> 
     * @return Source <p>连接器来源：ENTERPRISE_AGENT / ASSISTANT</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>连接器来源：ENTERPRISE_AGENT / ASSISTANT</p>
     * @param Source <p>连接器来源：ENTERPRISE_AGENT / ASSISTANT</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>归属企业 ID</p> 
     * @return EnterpriseId <p>归属企业 ID</p>
     */
    public String getEnterpriseId() {
        return this.EnterpriseId;
    }

    /**
     * Set <p>归属企业 ID</p>
     * @param EnterpriseId <p>归属企业 ID</p>
     */
    public void setEnterpriseId(String EnterpriseId) {
        this.EnterpriseId = EnterpriseId;
    }

    /**
     * Get <p>连接器类型：MCP_SERVER / A2A / API_SERVICE</p> 
     * @return Type <p>连接器类型：MCP_SERVER / A2A / API_SERVICE</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>连接器类型：MCP_SERVER / A2A / API_SERVICE</p>
     * @param Type <p>连接器类型：MCP_SERVER / A2A / API_SERVICE</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>上游服务地址</p> 
     * @return ServiceUrl <p>上游服务地址</p>
     */
    public String getServiceUrl() {
        return this.ServiceUrl;
    }

    /**
     * Set <p>上游服务地址</p>
     * @param ServiceUrl <p>上游服务地址</p>
     */
    public void setServiceUrl(String ServiceUrl) {
        this.ServiceUrl = ServiceUrl;
    }

    /**
     * Get <p>授权方式列表：NONE / ONEID / OAUTH2_IDP / API_KEY / DYNAMIC_API_KEY。DYNAMIC_API_KEY 表示按每轮请求提供的动态字段，通过 HeaderMappings 注入出站 HTTP Header。</p> 
     * @return AuthModes <p>授权方式列表：NONE / ONEID / OAUTH2_IDP / API_KEY / DYNAMIC_API_KEY。DYNAMIC_API_KEY 表示按每轮请求提供的动态字段，通过 HeaderMappings 注入出站 HTTP Header。</p>
     */
    public String [] getAuthModes() {
        return this.AuthModes;
    }

    /**
     * Set <p>授权方式列表：NONE / ONEID / OAUTH2_IDP / API_KEY / DYNAMIC_API_KEY。DYNAMIC_API_KEY 表示按每轮请求提供的动态字段，通过 HeaderMappings 注入出站 HTTP Header。</p>
     * @param AuthModes <p>授权方式列表：NONE / ONEID / OAUTH2_IDP / API_KEY / DYNAMIC_API_KEY。DYNAMIC_API_KEY 表示按每轮请求提供的动态字段，通过 HeaderMappings 注入出站 HTTP Header。</p>
     */
    public void setAuthModes(String [] AuthModes) {
        this.AuthModes = AuthModes;
    }

    /**
     * Get <p>最新版本号</p> 
     * @return LatestVersionNo <p>最新版本号</p>
     */
    public Long getLatestVersionNo() {
        return this.LatestVersionNo;
    }

    /**
     * Set <p>最新版本号</p>
     * @param LatestVersionNo <p>最新版本号</p>
     */
    public void setLatestVersionNo(Long LatestVersionNo) {
        this.LatestVersionNo = LatestVersionNo;
    }

    /**
     * Get <p>连接器状态：ACTIVE / DISABLED</p> 
     * @return Status <p>连接器状态：ACTIVE / DISABLED</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>连接器状态：ACTIVE / DISABLED</p>
     * @param Status <p>连接器状态：ACTIVE / DISABLED</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建人 ID</p> 
     * @return CreatorId <p>创建人 ID</p>
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set <p>创建人 ID</p>
     * @param CreatorId <p>创建人 ID</p>
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }

    /**
     * Get <p>创建时间（ISO8601，UTC）</p> 
     * @return CreatedTime <p>创建时间（ISO8601，UTC）</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间（ISO8601，UTC）</p>
     * @param CreatedTime <p>创建时间（ISO8601，UTC）</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>最后修改时间（ISO8601，UTC）</p> 
     * @return ModifiedTime <p>最后修改时间（ISO8601，UTC）</p>
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set <p>最后修改时间（ISO8601，UTC）</p>
     * @param ModifiedTime <p>最后修改时间（ISO8601，UTC）</p>
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get <p>VPC 网络配置 ID。为空表示该连接器通过公网访问 ServiceUrl。仅绑定 VPC 网络配置时本字段有值。</p> 
     * @return VpcConfigId <p>VPC 网络配置 ID。为空表示该连接器通过公网访问 ServiceUrl。仅绑定 VPC 网络配置时本字段有值。</p>
     */
    public String getVpcConfigId() {
        return this.VpcConfigId;
    }

    /**
     * Set <p>VPC 网络配置 ID。为空表示该连接器通过公网访问 ServiceUrl。仅绑定 VPC 网络配置时本字段有值。</p>
     * @param VpcConfigId <p>VPC 网络配置 ID。为空表示该连接器通过公网访问 ServiceUrl。仅绑定 VPC 网络配置时本字段有值。</p>
     */
    public void setVpcConfigId(String VpcConfigId) {
        this.VpcConfigId = VpcConfigId;
    }

    /**
     * Get <p>展示名：console 老连接器目录（DescribeConsoleConnectorList）下发，取 registry data.display_name，老数据缺失时回落 Name；云上目录无独立展示名，省略不返回。Name 是存储名/选型回写键（含 scope 前缀），不承担展示职责。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName <p>展示名：console 老连接器目录（DescribeConsoleConnectorList）下发，取 registry data.display_name，老数据缺失时回落 Name；云上目录无独立展示名，省略不返回。Name 是存储名/选型回写键（含 scope 前缀），不承担展示职责。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>展示名：console 老连接器目录（DescribeConsoleConnectorList）下发，取 registry data.display_name，老数据缺失时回落 Name；云上目录无独立展示名，省略不返回。Name 是存储名/选型回写键（含 scope 前缀），不承担展示职责。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName <p>展示名：console 老连接器目录（DescribeConsoleConnectorList）下发，取 registry data.display_name，老数据缺失时回落 Name；云上目录无独立展示名，省略不返回。Name 是存储名/选型回写键（含 scope 前缀），不承担展示职责。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
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
        if (source.VpcConfigId != null) {
            this.VpcConfigId = new String(source.VpcConfigId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
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
        this.setParamSimple(map, prefix + "VpcConfigId", this.VpcConfigId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);

    }
}

