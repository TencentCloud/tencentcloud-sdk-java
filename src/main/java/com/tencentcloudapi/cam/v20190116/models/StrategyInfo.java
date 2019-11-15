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

public class StrategyInfo  extends AbstractModel{

    /**
    * 策略ID。
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 策略名称。
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 策略创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 策略类型。1 表示自定义策略，2 表示预设策略。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 策略描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建来源，1 通过控制台创建, 2 通过策略语法创建。
    */
    @SerializedName("CreateMode")
    @Expose
    private Long CreateMode;

    /**
    * 关联的用户数
    */
    @SerializedName("Attachments")
    @Expose
    private Long Attachments;

    /**
    * 策略关联的产品
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 当需要查询标记实体是否已经关联策略时不为null。0表示未关联策略，1表示已关联策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAttached")
    @Expose
    private Long IsAttached;

    /**
     * 获取策略ID。
     * @return PolicyId 策略ID。
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * 设置策略ID。
     * @param PolicyId 策略ID。
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * 获取策略名称。
     * @return PolicyName 策略名称。
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * 设置策略名称。
     * @param PolicyName 策略名称。
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * 获取策略创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AddTime 策略创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * 设置策略创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddTime 策略创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * 获取策略类型。1 表示自定义策略，2 表示预设策略。
     * @return Type 策略类型。1 表示自定义策略，2 表示预设策略。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * 设置策略类型。1 表示自定义策略，2 表示预设策略。
     * @param Type 策略类型。1 表示自定义策略，2 表示预设策略。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * 获取策略描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Description 策略描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置策略描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 策略描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取创建来源，1 通过控制台创建, 2 通过策略语法创建。
     * @return CreateMode 创建来源，1 通过控制台创建, 2 通过策略语法创建。
     */
    public Long getCreateMode() {
        return this.CreateMode;
    }

    /**
     * 设置创建来源，1 通过控制台创建, 2 通过策略语法创建。
     * @param CreateMode 创建来源，1 通过控制台创建, 2 通过策略语法创建。
     */
    public void setCreateMode(Long CreateMode) {
        this.CreateMode = CreateMode;
    }

    /**
     * 获取关联的用户数
     * @return Attachments 关联的用户数
     */
    public Long getAttachments() {
        return this.Attachments;
    }

    /**
     * 设置关联的用户数
     * @param Attachments 关联的用户数
     */
    public void setAttachments(Long Attachments) {
        this.Attachments = Attachments;
    }

    /**
     * 获取策略关联的产品
注意：此字段可能返回 null，表示取不到有效值。
     * @return ServiceType 策略关联的产品
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * 设置策略关联的产品
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceType 策略关联的产品
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * 获取当需要查询标记实体是否已经关联策略时不为null。0表示未关联策略，1表示已关联策略
注意：此字段可能返回 null，表示取不到有效值。
     * @return IsAttached 当需要查询标记实体是否已经关联策略时不为null。0表示未关联策略，1表示已关联策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsAttached() {
        return this.IsAttached;
    }

    /**
     * 设置当需要查询标记实体是否已经关联策略时不为null。0表示未关联策略，1表示已关联策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAttached 当需要查询标记实体是否已经关联策略时不为null。0表示未关联策略，1表示已关联策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAttached(Long IsAttached) {
        this.IsAttached = IsAttached;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateMode", this.CreateMode);
        this.setParamSimple(map, prefix + "Attachments", this.Attachments);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "IsAttached", this.IsAttached);

    }
}

