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

public class AttachPolicyInfo extends AbstractModel {

    /**
    * 策略id
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 策略名称
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 创建时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 创建来源，1 通过控制台创建, 2 通过策略语法创建
    */
    @SerializedName("CreateMode")
    @Expose
    private Long CreateMode;

    /**
    * 取值为User和QCS。User代表自定义策略，QCS代表系统策略
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 策略备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 策略关联操作者主账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateOwnerUin")
    @Expose
    private String OperateOwnerUin;

    /**
    * 策略关联操作者ID，如果UinType为0表示子账号Uin，如果UinType为1表示角色ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * 取值为0和1。OperateUinType为0表示OperateUin字段是子账号Uin。如果OperateUinType为1表示OperateUin字段是角色ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateUinType")
    @Expose
    private Long OperateUinType;

    /**
    * 是否已下线，1代表已下线，0代表未下线
    */
    @SerializedName("Deactived")
    @Expose
    private Long Deactived;

    /**
    * 已下线的产品列表
    */
    @SerializedName("DeactivedDetail")
    @Expose
    private String [] DeactivedDetail;

    /**
     * Get 策略id 
     * @return PolicyId 策略id
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略id
     * @param PolicyId 策略id
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 策略名称 
     * @return PolicyName 策略名称
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名称
     * @param PolicyName 策略名称
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 创建时间 
     * @return AddTime 创建时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 创建时间
     * @param AddTime 创建时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 创建来源，1 通过控制台创建, 2 通过策略语法创建 
     * @return CreateMode 创建来源，1 通过控制台创建, 2 通过策略语法创建
     */
    public Long getCreateMode() {
        return this.CreateMode;
    }

    /**
     * Set 创建来源，1 通过控制台创建, 2 通过策略语法创建
     * @param CreateMode 创建来源，1 通过控制台创建, 2 通过策略语法创建
     */
    public void setCreateMode(Long CreateMode) {
        this.CreateMode = CreateMode;
    }

    /**
     * Get 取值为User和QCS。User代表自定义策略，QCS代表系统策略 
     * @return PolicyType 取值为User和QCS。User代表自定义策略，QCS代表系统策略
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 取值为User和QCS。User代表自定义策略，QCS代表系统策略
     * @param PolicyType 取值为User和QCS。User代表自定义策略，QCS代表系统策略
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 策略备注 
     * @return Remark 策略备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 策略备注
     * @param Remark 策略备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 策略关联操作者主账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateOwnerUin 策略关联操作者主账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperateOwnerUin() {
        return this.OperateOwnerUin;
    }

    /**
     * Set 策略关联操作者主账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateOwnerUin 策略关联操作者主账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateOwnerUin(String OperateOwnerUin) {
        this.OperateOwnerUin = OperateOwnerUin;
    }

    /**
     * Get 策略关联操作者ID，如果UinType为0表示子账号Uin，如果UinType为1表示角色ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateUin 策略关联操作者ID，如果UinType为0表示子账号Uin，如果UinType为1表示角色ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set 策略关联操作者ID，如果UinType为0表示子账号Uin，如果UinType为1表示角色ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateUin 策略关联操作者ID，如果UinType为0表示子账号Uin，如果UinType为1表示角色ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get 取值为0和1。OperateUinType为0表示OperateUin字段是子账号Uin。如果OperateUinType为1表示OperateUin字段是角色ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateUinType 取值为0和1。OperateUinType为0表示OperateUin字段是子账号Uin。如果OperateUinType为1表示OperateUin字段是角色ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOperateUinType() {
        return this.OperateUinType;
    }

    /**
     * Set 取值为0和1。OperateUinType为0表示OperateUin字段是子账号Uin。如果OperateUinType为1表示OperateUin字段是角色ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateUinType 取值为0和1。OperateUinType为0表示OperateUin字段是子账号Uin。如果OperateUinType为1表示OperateUin字段是角色ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateUinType(Long OperateUinType) {
        this.OperateUinType = OperateUinType;
    }

    /**
     * Get 是否已下线，1代表已下线，0代表未下线 
     * @return Deactived 是否已下线，1代表已下线，0代表未下线
     */
    public Long getDeactived() {
        return this.Deactived;
    }

    /**
     * Set 是否已下线，1代表已下线，0代表未下线
     * @param Deactived 是否已下线，1代表已下线，0代表未下线
     */
    public void setDeactived(Long Deactived) {
        this.Deactived = Deactived;
    }

    /**
     * Get 已下线的产品列表 
     * @return DeactivedDetail 已下线的产品列表
     */
    public String [] getDeactivedDetail() {
        return this.DeactivedDetail;
    }

    /**
     * Set 已下线的产品列表
     * @param DeactivedDetail 已下线的产品列表
     */
    public void setDeactivedDetail(String [] DeactivedDetail) {
        this.DeactivedDetail = DeactivedDetail;
    }

    public AttachPolicyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachPolicyInfo(AttachPolicyInfo source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.CreateMode != null) {
            this.CreateMode = new Long(source.CreateMode);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.OperateOwnerUin != null) {
            this.OperateOwnerUin = new String(source.OperateOwnerUin);
        }
        if (source.OperateUin != null) {
            this.OperateUin = new String(source.OperateUin);
        }
        if (source.OperateUinType != null) {
            this.OperateUinType = new Long(source.OperateUinType);
        }
        if (source.Deactived != null) {
            this.Deactived = new Long(source.Deactived);
        }
        if (source.DeactivedDetail != null) {
            this.DeactivedDetail = new String[source.DeactivedDetail.length];
            for (int i = 0; i < source.DeactivedDetail.length; i++) {
                this.DeactivedDetail[i] = new String(source.DeactivedDetail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "CreateMode", this.CreateMode);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "OperateOwnerUin", this.OperateOwnerUin);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "OperateUinType", this.OperateUinType);
        this.setParamSimple(map, prefix + "Deactived", this.Deactived);
        this.setParamArraySimple(map, prefix + "DeactivedDetail.", this.DeactivedDetail);

    }
}

