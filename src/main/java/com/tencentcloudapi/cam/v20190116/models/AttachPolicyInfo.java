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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachPolicyInfo  extends AbstractModel{

    /**
    * 策略id
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 策略名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 创建来源，1 通过控制台创建, 2 通过策略语法创建。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateMode")
    @Expose
    private Long CreateMode;

    /**
    * 取值为user和QCS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 策略备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 策略关联操作者主张号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateOwnerUin")
    @Expose
    private String OperateOwnerUin;

    /**
    * 策略关联操作者ID，如果UinType为0表示子帐号Uin，如果UinType为1表示角色ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * UinType为0表示OperateUin字段是子帐号Uin，如果UinType为1表示OperateUin字段是角色ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateUinType")
    @Expose
    private Long OperateUinType;

    /**
     * 获取策略id
     * @return PolicyId 策略id
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * 设置策略id
     * @param PolicyId 策略id
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * 获取策略名称
注意：此字段可能返回 null，表示取不到有效值。
     * @return PolicyName 策略名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * 设置策略名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyName 策略名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * 获取创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @return AddTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * 设置创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * 获取创建来源，1 通过控制台创建, 2 通过策略语法创建。
注意：此字段可能返回 null，表示取不到有效值。
     * @return CreateMode 创建来源，1 通过控制台创建, 2 通过策略语法创建。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateMode() {
        return this.CreateMode;
    }

    /**
     * 设置创建来源，1 通过控制台创建, 2 通过策略语法创建。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateMode 创建来源，1 通过控制台创建, 2 通过策略语法创建。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateMode(Long CreateMode) {
        this.CreateMode = CreateMode;
    }

    /**
     * 获取取值为user和QCS
注意：此字段可能返回 null，表示取不到有效值。
     * @return PolicyType 取值为user和QCS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * 设置取值为user和QCS
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyType 取值为user和QCS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * 获取策略备注
注意：此字段可能返回 null，表示取不到有效值。
     * @return Remark 策略备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * 设置策略备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 策略备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * 获取策略关联操作者主张号
注意：此字段可能返回 null，表示取不到有效值。
     * @return OperateOwnerUin 策略关联操作者主张号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperateOwnerUin() {
        return this.OperateOwnerUin;
    }

    /**
     * 设置策略关联操作者主张号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateOwnerUin 策略关联操作者主张号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateOwnerUin(String OperateOwnerUin) {
        this.OperateOwnerUin = OperateOwnerUin;
    }

    /**
     * 获取策略关联操作者ID，如果UinType为0表示子帐号Uin，如果UinType为1表示角色ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return OperateUin 策略关联操作者ID，如果UinType为0表示子帐号Uin，如果UinType为1表示角色ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * 设置策略关联操作者ID，如果UinType为0表示子帐号Uin，如果UinType为1表示角色ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateUin 策略关联操作者ID，如果UinType为0表示子帐号Uin，如果UinType为1表示角色ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * 获取UinType为0表示OperateUin字段是子帐号Uin，如果UinType为1表示OperateUin字段是角色ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return OperateUinType UinType为0表示OperateUin字段是子帐号Uin，如果UinType为1表示OperateUin字段是角色ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOperateUinType() {
        return this.OperateUinType;
    }

    /**
     * 设置UinType为0表示OperateUin字段是子帐号Uin，如果UinType为1表示OperateUin字段是角色ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateUinType UinType为0表示OperateUin字段是子帐号Uin，如果UinType为1表示OperateUin字段是角色ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateUinType(Long OperateUinType) {
        this.OperateUinType = OperateUinType;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

