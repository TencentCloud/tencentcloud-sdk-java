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

public class StrategyInfo extends AbstractModel {

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
    * 是否已下线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Deactived")
    @Expose
    private Long Deactived;

    /**
    * 已下线产品列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeactivedDetail")
    @Expose
    private String [] DeactivedDetail;

    /**
    * 是否是服务相关角色策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsServiceLinkedPolicy")
    @Expose
    private Long IsServiceLinkedPolicy;

    /**
    * 关联策略实体数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachEntityCount")
    @Expose
    private Long AttachEntityCount;

    /**
    * 关联权限边界实体数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachEntityBoundaryCount")
    @Expose
    private Long AttachEntityBoundaryCount;

    /**
    * 最后编辑时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 策略ID。 
     * @return PolicyId 策略ID。
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略ID。
     * @param PolicyId 策略ID。
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 策略名称。 
     * @return PolicyName 策略名称。
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名称。
     * @param PolicyName 策略名称。
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 策略创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddTime 策略创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 策略创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddTime 策略创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 策略类型。1 表示自定义策略，2 表示预设策略。 
     * @return Type 策略类型。1 表示自定义策略，2 表示预设策略。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 策略类型。1 表示自定义策略，2 表示预设策略。
     * @param Type 策略类型。1 表示自定义策略，2 表示预设策略。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 策略描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 策略描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 策略描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 策略描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建来源，1 通过控制台创建, 2 通过策略语法创建。 
     * @return CreateMode 创建来源，1 通过控制台创建, 2 通过策略语法创建。
     */
    public Long getCreateMode() {
        return this.CreateMode;
    }

    /**
     * Set 创建来源，1 通过控制台创建, 2 通过策略语法创建。
     * @param CreateMode 创建来源，1 通过控制台创建, 2 通过策略语法创建。
     */
    public void setCreateMode(Long CreateMode) {
        this.CreateMode = CreateMode;
    }

    /**
     * Get 关联的用户数 
     * @return Attachments 关联的用户数
     */
    public Long getAttachments() {
        return this.Attachments;
    }

    /**
     * Set 关联的用户数
     * @param Attachments 关联的用户数
     */
    public void setAttachments(Long Attachments) {
        this.Attachments = Attachments;
    }

    /**
     * Get 策略关联的产品
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceType 策略关联的产品
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 策略关联的产品
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceType 策略关联的产品
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 当需要查询标记实体是否已经关联策略时不为null。0表示未关联策略，1表示已关联策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAttached 当需要查询标记实体是否已经关联策略时不为null。0表示未关联策略，1表示已关联策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsAttached() {
        return this.IsAttached;
    }

    /**
     * Set 当需要查询标记实体是否已经关联策略时不为null。0表示未关联策略，1表示已关联策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAttached 当需要查询标记实体是否已经关联策略时不为null。0表示未关联策略，1表示已关联策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAttached(Long IsAttached) {
        this.IsAttached = IsAttached;
    }

    /**
     * Get 是否已下线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Deactived 是否已下线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeactived() {
        return this.Deactived;
    }

    /**
     * Set 是否已下线
注意：此字段可能返回 null，表示取不到有效值。
     * @param Deactived 是否已下线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeactived(Long Deactived) {
        this.Deactived = Deactived;
    }

    /**
     * Get 已下线产品列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeactivedDetail 已下线产品列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDeactivedDetail() {
        return this.DeactivedDetail;
    }

    /**
     * Set 已下线产品列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeactivedDetail 已下线产品列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeactivedDetail(String [] DeactivedDetail) {
        this.DeactivedDetail = DeactivedDetail;
    }

    /**
     * Get 是否是服务相关角色策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsServiceLinkedPolicy 是否是服务相关角色策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsServiceLinkedPolicy() {
        return this.IsServiceLinkedPolicy;
    }

    /**
     * Set 是否是服务相关角色策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsServiceLinkedPolicy 是否是服务相关角色策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsServiceLinkedPolicy(Long IsServiceLinkedPolicy) {
        this.IsServiceLinkedPolicy = IsServiceLinkedPolicy;
    }

    /**
     * Get 关联策略实体数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachEntityCount 关联策略实体数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttachEntityCount() {
        return this.AttachEntityCount;
    }

    /**
     * Set 关联策略实体数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachEntityCount 关联策略实体数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachEntityCount(Long AttachEntityCount) {
        this.AttachEntityCount = AttachEntityCount;
    }

    /**
     * Get 关联权限边界实体数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachEntityBoundaryCount 关联权限边界实体数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttachEntityBoundaryCount() {
        return this.AttachEntityBoundaryCount;
    }

    /**
     * Set 关联权限边界实体数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachEntityBoundaryCount 关联权限边界实体数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachEntityBoundaryCount(Long AttachEntityBoundaryCount) {
        this.AttachEntityBoundaryCount = AttachEntityBoundaryCount;
    }

    /**
     * Get 最后编辑时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 最后编辑时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后编辑时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 最后编辑时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public StrategyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StrategyInfo(StrategyInfo source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateMode != null) {
            this.CreateMode = new Long(source.CreateMode);
        }
        if (source.Attachments != null) {
            this.Attachments = new Long(source.Attachments);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.IsAttached != null) {
            this.IsAttached = new Long(source.IsAttached);
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
        if (source.IsServiceLinkedPolicy != null) {
            this.IsServiceLinkedPolicy = new Long(source.IsServiceLinkedPolicy);
        }
        if (source.AttachEntityCount != null) {
            this.AttachEntityCount = new Long(source.AttachEntityCount);
        }
        if (source.AttachEntityBoundaryCount != null) {
            this.AttachEntityBoundaryCount = new Long(source.AttachEntityBoundaryCount);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
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
        this.setParamSimple(map, prefix + "Deactived", this.Deactived);
        this.setParamArraySimple(map, prefix + "DeactivedDetail.", this.DeactivedDetail);
        this.setParamSimple(map, prefix + "IsServiceLinkedPolicy", this.IsServiceLinkedPolicy);
        this.setParamSimple(map, prefix + "AttachEntityCount", this.AttachEntityCount);
        this.setParamSimple(map, prefix + "AttachEntityBoundaryCount", this.AttachEntityBoundaryCount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

