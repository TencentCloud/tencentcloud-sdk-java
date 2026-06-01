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

public class DescribeAgentCredentialResp extends AbstractModel {

    /**
    * <p>租户应用ID</p>
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
    * <p>凭据ID</p>
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>凭据名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>关联应用数</p>
    */
    @SerializedName("RelateAgentAppNum")
    @Expose
    private Long RelateAgentAppNum;

    /**
    * <p>关联mcp数</p>
    */
    @SerializedName("RelateMcpServerNum")
    @Expose
    private Long RelateMcpServerNum;

    /**
    * <p>关联模型数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelateModelNum")
    @Expose
    private Long RelateModelNum;

    /**
    * <p>关联服务数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelateServiceNum")
    @Expose
    private Long RelateServiceNum;

    /**
    * <p>凭据内容</p>
    */
    @SerializedName("Content")
    @Expose
    private AgentCredentialContentDTO Content;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>修改时间</p>
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * <p>类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>租户应用ID</p> 
     * @return AppID <p>租户应用ID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>租户应用ID</p>
     * @param AppID <p>租户应用ID</p>
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
     * Get <p>凭据ID</p> 
     * @return ID <p>凭据ID</p>
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>凭据ID</p>
     * @param ID <p>凭据ID</p>
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>凭据名称</p> 
     * @return Name <p>凭据名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>凭据名称</p>
     * @param Name <p>凭据名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get <p>关联应用数</p> 
     * @return RelateAgentAppNum <p>关联应用数</p>
     * @deprecated
     */
    @Deprecated
    public Long getRelateAgentAppNum() {
        return this.RelateAgentAppNum;
    }

    /**
     * Set <p>关联应用数</p>
     * @param RelateAgentAppNum <p>关联应用数</p>
     * @deprecated
     */
    @Deprecated
    public void setRelateAgentAppNum(Long RelateAgentAppNum) {
        this.RelateAgentAppNum = RelateAgentAppNum;
    }

    /**
     * Get <p>关联mcp数</p> 
     * @return RelateMcpServerNum <p>关联mcp数</p>
     */
    public Long getRelateMcpServerNum() {
        return this.RelateMcpServerNum;
    }

    /**
     * Set <p>关联mcp数</p>
     * @param RelateMcpServerNum <p>关联mcp数</p>
     */
    public void setRelateMcpServerNum(Long RelateMcpServerNum) {
        this.RelateMcpServerNum = RelateMcpServerNum;
    }

    /**
     * Get <p>关联模型数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelateModelNum <p>关联模型数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRelateModelNum() {
        return this.RelateModelNum;
    }

    /**
     * Set <p>关联模型数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelateModelNum <p>关联模型数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelateModelNum(Long RelateModelNum) {
        this.RelateModelNum = RelateModelNum;
    }

    /**
     * Get <p>关联服务数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelateServiceNum <p>关联服务数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRelateServiceNum() {
        return this.RelateServiceNum;
    }

    /**
     * Set <p>关联服务数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelateServiceNum <p>关联服务数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelateServiceNum(Long RelateServiceNum) {
        this.RelateServiceNum = RelateServiceNum;
    }

    /**
     * Get <p>凭据内容</p> 
     * @return Content <p>凭据内容</p>
     */
    public AgentCredentialContentDTO getContent() {
        return this.Content;
    }

    /**
     * Set <p>凭据内容</p>
     * @param Content <p>凭据内容</p>
     */
    public void setContent(AgentCredentialContentDTO Content) {
        this.Content = Content;
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
     * @return LastUpdateTime <p>修改时间</p>
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param LastUpdateTime <p>修改时间</p>
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get <p>类型</p> 
     * @return Type <p>类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>类型</p>
     * @param Type <p>类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeAgentCredentialResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentCredentialResp(DescribeAgentCredentialResp source) {
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RelateAgentAppNum != null) {
            this.RelateAgentAppNum = new Long(source.RelateAgentAppNum);
        }
        if (source.RelateMcpServerNum != null) {
            this.RelateMcpServerNum = new Long(source.RelateMcpServerNum);
        }
        if (source.RelateModelNum != null) {
            this.RelateModelNum = new Long(source.RelateModelNum);
        }
        if (source.RelateServiceNum != null) {
            this.RelateServiceNum = new Long(source.RelateServiceNum);
        }
        if (source.Content != null) {
            this.Content = new AgentCredentialContentDTO(source.Content);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RelateAgentAppNum", this.RelateAgentAppNum);
        this.setParamSimple(map, prefix + "RelateMcpServerNum", this.RelateMcpServerNum);
        this.setParamSimple(map, prefix + "RelateModelNum", this.RelateModelNum);
        this.setParamSimple(map, prefix + "RelateServiceNum", this.RelateServiceNum);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

