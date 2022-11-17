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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Authority extends AbstractModel{

    /**
    * 权威机构ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Did的ID
    */
    @SerializedName("DidId")
    @Expose
    private Long DidId;

    /**
    * DID具体信息
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
    * 机构名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 权威认证 1:已认证，2:未认证
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * DID服务ID
    */
    @SerializedName("DidServiceId")
    @Expose
    private Long DidServiceId;

    /**
    * 应用ID
    */
    @SerializedName("ContractAppId")
    @Expose
    private Long ContractAppId;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 注册时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegisterTime")
    @Expose
    private String RegisterTime;

    /**
    * 认证时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecognizeTime")
    @Expose
    private String RecognizeTime;

    /**
    * 生成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 网络ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 群组ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 合约名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 链上标签
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
     * Get 权威机构ID 
     * @return Id 权威机构ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 权威机构ID
     * @param Id 权威机构ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Did的ID 
     * @return DidId Did的ID
     */
    public Long getDidId() {
        return this.DidId;
    }

    /**
     * Set Did的ID
     * @param DidId Did的ID
     */
    public void setDidId(Long DidId) {
        this.DidId = DidId;
    }

    /**
     * Get DID具体信息 
     * @return Did DID具体信息
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set DID具体信息
     * @param Did DID具体信息
     */
    public void setDid(String Did) {
        this.Did = Did;
    }

    /**
     * Get 机构名称 
     * @return Name 机构名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 机构名称
     * @param Name 机构名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 权威认证 1:已认证，2:未认证 
     * @return Status 权威认证 1:已认证，2:未认证
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 权威认证 1:已认证，2:未认证
     * @param Status 权威认证 1:已认证，2:未认证
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get DID服务ID 
     * @return DidServiceId DID服务ID
     */
    public Long getDidServiceId() {
        return this.DidServiceId;
    }

    /**
     * Set DID服务ID
     * @param DidServiceId DID服务ID
     */
    public void setDidServiceId(Long DidServiceId) {
        this.DidServiceId = DidServiceId;
    }

    /**
     * Get 应用ID 
     * @return ContractAppId 应用ID
     */
    public Long getContractAppId() {
        return this.ContractAppId;
    }

    /**
     * Set 应用ID
     * @param ContractAppId 应用ID
     */
    public void setContractAppId(Long ContractAppId) {
        this.ContractAppId = ContractAppId;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 注册时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegisterTime 注册时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegisterTime() {
        return this.RegisterTime;
    }

    /**
     * Set 注册时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegisterTime 注册时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegisterTime(String RegisterTime) {
        this.RegisterTime = RegisterTime;
    }

    /**
     * Get 认证时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecognizeTime 认证时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecognizeTime() {
        return this.RecognizeTime;
    }

    /**
     * Set 认证时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecognizeTime 认证时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecognizeTime(String RecognizeTime) {
        this.RecognizeTime = RecognizeTime;
    }

    /**
     * Get 生成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 生成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 生成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 生成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 网络ID 
     * @return ClusterId 网络ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 网络ID
     * @param ClusterId 网络ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 群组ID 
     * @return GroupId 群组ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 群组ID
     * @param GroupId 群组ID
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 合约名称 
     * @return AppName 合约名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 合约名称
     * @param AppName 合约名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 链上标签 
     * @return LabelName 链上标签
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set 链上标签
     * @param LabelName 链上标签
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    public Authority() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Authority(Authority source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DidId != null) {
            this.DidId = new Long(source.DidId);
        }
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DidServiceId != null) {
            this.DidServiceId = new Long(source.DidServiceId);
        }
        if (source.ContractAppId != null) {
            this.ContractAppId = new Long(source.ContractAppId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.RegisterTime != null) {
            this.RegisterTime = new String(source.RegisterTime);
        }
        if (source.RecognizeTime != null) {
            this.RecognizeTime = new String(source.RecognizeTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "DidId", this.DidId);
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DidServiceId", this.DidServiceId);
        this.setParamSimple(map, prefix + "ContractAppId", this.ContractAppId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "RegisterTime", this.RegisterTime);
        this.setParamSimple(map, prefix + "RecognizeTime", this.RecognizeTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);

    }
}

