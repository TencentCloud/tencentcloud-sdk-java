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
    * 租户应用ID
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * 租户ID
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 实例ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 凭据ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 凭据名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 关联应用数
    */
    @SerializedName("RelateAgentAppNum")
    @Expose
    private Long RelateAgentAppNum;

    /**
    * 关联mcp数
    */
    @SerializedName("RelateMcpServerNum")
    @Expose
    private Long RelateMcpServerNum;

    /**
    * 关联模型数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelateModelNum")
    @Expose
    private Long RelateModelNum;

    /**
    * 凭据内容
    */
    @SerializedName("Content")
    @Expose
    private AgentCredentialContentDTO Content;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 租户应用ID 
     * @return AppID 租户应用ID
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set 租户应用ID
     * @param AppID 租户应用ID
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 租户ID 
     * @return Uin 租户ID
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 租户ID
     * @param Uin 租户ID
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 实例ID 
     * @return InstanceID 实例ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例ID
     * @param InstanceID 实例ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 凭据ID 
     * @return ID 凭据ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 凭据ID
     * @param ID 凭据ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 凭据名称 
     * @return Name 凭据名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 凭据名称
     * @param Name 凭据名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 关联应用数 
     * @return RelateAgentAppNum 关联应用数
     */
    public Long getRelateAgentAppNum() {
        return this.RelateAgentAppNum;
    }

    /**
     * Set 关联应用数
     * @param RelateAgentAppNum 关联应用数
     */
    public void setRelateAgentAppNum(Long RelateAgentAppNum) {
        this.RelateAgentAppNum = RelateAgentAppNum;
    }

    /**
     * Get 关联mcp数 
     * @return RelateMcpServerNum 关联mcp数
     */
    public Long getRelateMcpServerNum() {
        return this.RelateMcpServerNum;
    }

    /**
     * Set 关联mcp数
     * @param RelateMcpServerNum 关联mcp数
     */
    public void setRelateMcpServerNum(Long RelateMcpServerNum) {
        this.RelateMcpServerNum = RelateMcpServerNum;
    }

    /**
     * Get 关联模型数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelateModelNum 关联模型数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRelateModelNum() {
        return this.RelateModelNum;
    }

    /**
     * Set 关联模型数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelateModelNum 关联模型数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelateModelNum(Long RelateModelNum) {
        this.RelateModelNum = RelateModelNum;
    }

    /**
     * Get 凭据内容 
     * @return Content 凭据内容
     */
    public AgentCredentialContentDTO getContent() {
        return this.Content;
    }

    /**
     * Set 凭据内容
     * @param Content 凭据内容
     */
    public void setContent(AgentCredentialContentDTO Content) {
        this.Content = Content;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return LastUpdateTime 修改时间
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 修改时间
     * @param LastUpdateTime 修改时间
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
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
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

