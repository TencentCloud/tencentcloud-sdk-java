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
    * <p>策略ID。</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * <p>策略名称。</p>
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * <p>策略创建时间。</p>
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * <p>策略类型。1 表示自定义策略，2 表示预设策略。</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>策略描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>创建来源，1 通过控制台创建, 2 通过策略语法创建。</p>
    */
    @SerializedName("CreateMode")
    @Expose
    private Long CreateMode;

    /**
    * <p>关联的用户数</p>
    */
    @SerializedName("Attachments")
    @Expose
    private Long Attachments;

    /**
    * <p>策略关联的产品</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>当需要查询标记实体是否已经关联策略时不为null。0表示未关联策略，1表示已关联策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAttached")
    @Expose
    private Long IsAttached;

    /**
    * <p>是否已下线</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Deactived")
    @Expose
    private Long Deactived;

    /**
    * <p>已下线产品列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeactivedDetail")
    @Expose
    private String [] DeactivedDetail;

    /**
    * <p>是否是服务相关角色策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsServiceLinkedPolicy")
    @Expose
    private Long IsServiceLinkedPolicy;

    /**
    * <p>关联策略实体数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachEntityCount")
    @Expose
    private Long AttachEntityCount;

    /**
    * <p>关联权限边界实体数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachEntityBoundaryCount")
    @Expose
    private Long AttachEntityBoundaryCount;

    /**
    * <p>最后编辑时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>权限级别</p><p>枚举值：</p><ul><li>Global： 全局权限</li><li>Finance： 财务权限</li><li>CloudProduct： 云产品权限</li></ul>
    */
    @SerializedName("PermissionLevel")
    @Expose
    private String PermissionLevel;

    /**
     * Get <p>策略ID。</p> 
     * @return PolicyId <p>策略ID。</p>
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>策略ID。</p>
     * @param PolicyId <p>策略ID。</p>
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>策略名称。</p> 
     * @return PolicyName <p>策略名称。</p>
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set <p>策略名称。</p>
     * @param PolicyName <p>策略名称。</p>
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get <p>策略创建时间。</p> 
     * @return AddTime <p>策略创建时间。</p>
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set <p>策略创建时间。</p>
     * @param AddTime <p>策略创建时间。</p>
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get <p>策略类型。1 表示自定义策略，2 表示预设策略。</p> 
     * @return Type <p>策略类型。1 表示自定义策略，2 表示预设策略。</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>策略类型。1 表示自定义策略，2 表示预设策略。</p>
     * @param Type <p>策略类型。1 表示自定义策略，2 表示预设策略。</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>策略描述。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>策略描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>策略描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>策略描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>创建来源，1 通过控制台创建, 2 通过策略语法创建。</p> 
     * @return CreateMode <p>创建来源，1 通过控制台创建, 2 通过策略语法创建。</p>
     */
    public Long getCreateMode() {
        return this.CreateMode;
    }

    /**
     * Set <p>创建来源，1 通过控制台创建, 2 通过策略语法创建。</p>
     * @param CreateMode <p>创建来源，1 通过控制台创建, 2 通过策略语法创建。</p>
     */
    public void setCreateMode(Long CreateMode) {
        this.CreateMode = CreateMode;
    }

    /**
     * Get <p>关联的用户数</p> 
     * @return Attachments <p>关联的用户数</p>
     */
    public Long getAttachments() {
        return this.Attachments;
    }

    /**
     * Set <p>关联的用户数</p>
     * @param Attachments <p>关联的用户数</p>
     */
    public void setAttachments(Long Attachments) {
        this.Attachments = Attachments;
    }

    /**
     * Get <p>策略关联的产品</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceType <p>策略关联的产品</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>策略关联的产品</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceType <p>策略关联的产品</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>当需要查询标记实体是否已经关联策略时不为null。0表示未关联策略，1表示已关联策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAttached <p>当需要查询标记实体是否已经关联策略时不为null。0表示未关联策略，1表示已关联策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsAttached() {
        return this.IsAttached;
    }

    /**
     * Set <p>当需要查询标记实体是否已经关联策略时不为null。0表示未关联策略，1表示已关联策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAttached <p>当需要查询标记实体是否已经关联策略时不为null。0表示未关联策略，1表示已关联策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAttached(Long IsAttached) {
        this.IsAttached = IsAttached;
    }

    /**
     * Get <p>是否已下线</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Deactived <p>是否已下线</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeactived() {
        return this.Deactived;
    }

    /**
     * Set <p>是否已下线</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Deactived <p>是否已下线</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeactived(Long Deactived) {
        this.Deactived = Deactived;
    }

    /**
     * Get <p>已下线产品列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeactivedDetail <p>已下线产品列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDeactivedDetail() {
        return this.DeactivedDetail;
    }

    /**
     * Set <p>已下线产品列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeactivedDetail <p>已下线产品列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeactivedDetail(String [] DeactivedDetail) {
        this.DeactivedDetail = DeactivedDetail;
    }

    /**
     * Get <p>是否是服务相关角色策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsServiceLinkedPolicy <p>是否是服务相关角色策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsServiceLinkedPolicy() {
        return this.IsServiceLinkedPolicy;
    }

    /**
     * Set <p>是否是服务相关角色策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsServiceLinkedPolicy <p>是否是服务相关角色策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsServiceLinkedPolicy(Long IsServiceLinkedPolicy) {
        this.IsServiceLinkedPolicy = IsServiceLinkedPolicy;
    }

    /**
     * Get <p>关联策略实体数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachEntityCount <p>关联策略实体数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttachEntityCount() {
        return this.AttachEntityCount;
    }

    /**
     * Set <p>关联策略实体数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachEntityCount <p>关联策略实体数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachEntityCount(Long AttachEntityCount) {
        this.AttachEntityCount = AttachEntityCount;
    }

    /**
     * Get <p>关联权限边界实体数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachEntityBoundaryCount <p>关联权限边界实体数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttachEntityBoundaryCount() {
        return this.AttachEntityBoundaryCount;
    }

    /**
     * Set <p>关联权限边界实体数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachEntityBoundaryCount <p>关联权限边界实体数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachEntityBoundaryCount(Long AttachEntityBoundaryCount) {
        this.AttachEntityBoundaryCount = AttachEntityBoundaryCount;
    }

    /**
     * Get <p>最后编辑时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>最后编辑时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>最后编辑时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>最后编辑时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>标签列表</p> 
     * @return Tags <p>标签列表</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
     * @param Tags <p>标签列表</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>权限级别</p><p>枚举值：</p><ul><li>Global： 全局权限</li><li>Finance： 财务权限</li><li>CloudProduct： 云产品权限</li></ul> 
     * @return PermissionLevel <p>权限级别</p><p>枚举值：</p><ul><li>Global： 全局权限</li><li>Finance： 财务权限</li><li>CloudProduct： 云产品权限</li></ul>
     */
    public String getPermissionLevel() {
        return this.PermissionLevel;
    }

    /**
     * Set <p>权限级别</p><p>枚举值：</p><ul><li>Global： 全局权限</li><li>Finance： 财务权限</li><li>CloudProduct： 云产品权限</li></ul>
     * @param PermissionLevel <p>权限级别</p><p>枚举值：</p><ul><li>Global： 全局权限</li><li>Finance： 财务权限</li><li>CloudProduct： 云产品权限</li></ul>
     */
    public void setPermissionLevel(String PermissionLevel) {
        this.PermissionLevel = PermissionLevel;
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.PermissionLevel != null) {
            this.PermissionLevel = new String(source.PermissionLevel);
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
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "PermissionLevel", this.PermissionLevel);

    }
}

