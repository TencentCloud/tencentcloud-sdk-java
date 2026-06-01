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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentAppResp extends AbstractModel {

    /**
    * <p>租户appID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>租户ID</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>应用ID</p>
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>修改时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>认证类型</p>
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * <p>apiKeys列表，脱敏</p>
    */
    @SerializedName("ApiKeys")
    @Expose
    private String [] ApiKeys;

    /**
    * <p>secretKey列表，脱敏</p>
    */
    @SerializedName("SecretKeys")
    @Expose
    private AgentAppSecretKeyVO [] SecretKeys;

    /**
    * <p>OAuth2 Resource Server ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OAuth2ResourceServerID")
    @Expose
    private String OAuth2ResourceServerID;

    /**
    * <p>绑定mcpServer数量</p>
    */
    @SerializedName("McpServersNum")
    @Expose
    private Long McpServersNum;

    /**
    * <p>绑定的模型服务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelServicesNum")
    @Expose
    private Long ModelServicesNum;

    /**
    * <p>API认证列表</p>
    */
    @SerializedName("ConnectorIDs")
    @Expose
    private String [] ConnectorIDs;

    /**
    * <p>关联API数量</p>
    */
    @SerializedName("ServicesNum")
    @Expose
    private Long ServicesNum;

    /**
     * Get <p>租户appID</p> 
     * @return AppID <p>租户appID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>租户appID</p>
     * @param AppID <p>租户appID</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>租户ID</p> 
     * @return Uin <p>租户ID</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>租户ID</p>
     * @param Uin <p>租户ID</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceID <p>实例ID</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceID <p>实例ID</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>应用ID</p> 
     * @return ID <p>应用ID</p>
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>应用ID</p>
     * @param ID <p>应用ID</p>
     */
    public void setID(String ID) {
        this.ID = ID;
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
     * Get <p>状态</p> 
     * @return Status <p>状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
     * @param Status <p>状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>修改时间</p> 
     * @return UpdateTime <p>修改时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param UpdateTime <p>修改时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>认证类型</p> 
     * @return AuthType <p>认证类型</p>
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>认证类型</p>
     * @param AuthType <p>认证类型</p>
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>apiKeys列表，脱敏</p> 
     * @return ApiKeys <p>apiKeys列表，脱敏</p>
     */
    public String [] getApiKeys() {
        return this.ApiKeys;
    }

    /**
     * Set <p>apiKeys列表，脱敏</p>
     * @param ApiKeys <p>apiKeys列表，脱敏</p>
     */
    public void setApiKeys(String [] ApiKeys) {
        this.ApiKeys = ApiKeys;
    }

    /**
     * Get <p>secretKey列表，脱敏</p> 
     * @return SecretKeys <p>secretKey列表，脱敏</p>
     */
    public AgentAppSecretKeyVO [] getSecretKeys() {
        return this.SecretKeys;
    }

    /**
     * Set <p>secretKey列表，脱敏</p>
     * @param SecretKeys <p>secretKey列表，脱敏</p>
     */
    public void setSecretKeys(AgentAppSecretKeyVO [] SecretKeys) {
        this.SecretKeys = SecretKeys;
    }

    /**
     * Get <p>OAuth2 Resource Server ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OAuth2ResourceServerID <p>OAuth2 Resource Server ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOAuth2ResourceServerID() {
        return this.OAuth2ResourceServerID;
    }

    /**
     * Set <p>OAuth2 Resource Server ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OAuth2ResourceServerID <p>OAuth2 Resource Server ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOAuth2ResourceServerID(String OAuth2ResourceServerID) {
        this.OAuth2ResourceServerID = OAuth2ResourceServerID;
    }

    /**
     * Get <p>绑定mcpServer数量</p> 
     * @return McpServersNum <p>绑定mcpServer数量</p>
     */
    public Long getMcpServersNum() {
        return this.McpServersNum;
    }

    /**
     * Set <p>绑定mcpServer数量</p>
     * @param McpServersNum <p>绑定mcpServer数量</p>
     */
    public void setMcpServersNum(Long McpServersNum) {
        this.McpServersNum = McpServersNum;
    }

    /**
     * Get <p>绑定的模型服务数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelServicesNum <p>绑定的模型服务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getModelServicesNum() {
        return this.ModelServicesNum;
    }

    /**
     * Set <p>绑定的模型服务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelServicesNum <p>绑定的模型服务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelServicesNum(Long ModelServicesNum) {
        this.ModelServicesNum = ModelServicesNum;
    }

    /**
     * Get <p>API认证列表</p> 
     * @return ConnectorIDs <p>API认证列表</p>
     */
    public String [] getConnectorIDs() {
        return this.ConnectorIDs;
    }

    /**
     * Set <p>API认证列表</p>
     * @param ConnectorIDs <p>API认证列表</p>
     */
    public void setConnectorIDs(String [] ConnectorIDs) {
        this.ConnectorIDs = ConnectorIDs;
    }

    /**
     * Get <p>关联API数量</p> 
     * @return ServicesNum <p>关联API数量</p>
     */
    public Long getServicesNum() {
        return this.ServicesNum;
    }

    /**
     * Set <p>关联API数量</p>
     * @param ServicesNum <p>关联API数量</p>
     */
    public void setServicesNum(Long ServicesNum) {
        this.ServicesNum = ServicesNum;
    }

    public DescribeAgentAppResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentAppResp(DescribeAgentAppResp source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.ApiKeys != null) {
            this.ApiKeys = new String[source.ApiKeys.length];
            for (int i = 0; i < source.ApiKeys.length; i++) {
                this.ApiKeys[i] = new String(source.ApiKeys[i]);
            }
        }
        if (source.SecretKeys != null) {
            this.SecretKeys = new AgentAppSecretKeyVO[source.SecretKeys.length];
            for (int i = 0; i < source.SecretKeys.length; i++) {
                this.SecretKeys[i] = new AgentAppSecretKeyVO(source.SecretKeys[i]);
            }
        }
        if (source.OAuth2ResourceServerID != null) {
            this.OAuth2ResourceServerID = new String(source.OAuth2ResourceServerID);
        }
        if (source.McpServersNum != null) {
            this.McpServersNum = new Long(source.McpServersNum);
        }
        if (source.ModelServicesNum != null) {
            this.ModelServicesNum = new Long(source.ModelServicesNum);
        }
        if (source.ConnectorIDs != null) {
            this.ConnectorIDs = new String[source.ConnectorIDs.length];
            for (int i = 0; i < source.ConnectorIDs.length; i++) {
                this.ConnectorIDs[i] = new String(source.ConnectorIDs[i]);
            }
        }
        if (source.ServicesNum != null) {
            this.ServicesNum = new Long(source.ServicesNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamArraySimple(map, prefix + "ApiKeys.", this.ApiKeys);
        this.setParamArrayObj(map, prefix + "SecretKeys.", this.SecretKeys);
        this.setParamSimple(map, prefix + "OAuth2ResourceServerID", this.OAuth2ResourceServerID);
        this.setParamSimple(map, prefix + "McpServersNum", this.McpServersNum);
        this.setParamSimple(map, prefix + "ModelServicesNum", this.ModelServicesNum);
        this.setParamArraySimple(map, prefix + "ConnectorIDs.", this.ConnectorIDs);
        this.setParamSimple(map, prefix + "ServicesNum", this.ServicesNum);

    }
}

