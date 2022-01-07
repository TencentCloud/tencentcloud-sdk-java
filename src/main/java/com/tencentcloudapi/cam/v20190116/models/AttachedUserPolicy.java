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

public class AttachedUserPolicy extends AbstractModel{

    /**
    * 策略ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 策略名
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 策略描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 策略类型(1表示自定义策略，2表示预设策略)
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * 创建模式(1表示按产品或项目权限创建的策略，其他表示策略语法创建的策略)
    */
    @SerializedName("CreateMode")
    @Expose
    private String CreateMode;

    /**
    * 随组关联信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Groups")
    @Expose
    private AttachedUserPolicyGroupInfo [] Groups;

    /**
    * 是否已下线(0:否 1:是)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Deactived")
    @Expose
    private Long Deactived;

    /**
    * 已下线的产品列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeactivedDetail")
    @Expose
    private String [] DeactivedDetail;

    /**
     * Get 策略ID 
     * @return PolicyId 策略ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略ID
     * @param PolicyId 策略ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 策略名 
     * @return PolicyName 策略名
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名
     * @param PolicyName 策略名
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 策略描述 
     * @return Description 策略描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 策略描述
     * @param Description 策略描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get 策略类型(1表示自定义策略，2表示预设策略) 
     * @return StrategyType 策略类型(1表示自定义策略，2表示预设策略)
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 策略类型(1表示自定义策略，2表示预设策略)
     * @param StrategyType 策略类型(1表示自定义策略，2表示预设策略)
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get 创建模式(1表示按产品或项目权限创建的策略，其他表示策略语法创建的策略) 
     * @return CreateMode 创建模式(1表示按产品或项目权限创建的策略，其他表示策略语法创建的策略)
     */
    public String getCreateMode() {
        return this.CreateMode;
    }

    /**
     * Set 创建模式(1表示按产品或项目权限创建的策略，其他表示策略语法创建的策略)
     * @param CreateMode 创建模式(1表示按产品或项目权限创建的策略，其他表示策略语法创建的策略)
     */
    public void setCreateMode(String CreateMode) {
        this.CreateMode = CreateMode;
    }

    /**
     * Get 随组关联信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Groups 随组关联信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AttachedUserPolicyGroupInfo [] getGroups() {
        return this.Groups;
    }

    /**
     * Set 随组关联信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Groups 随组关联信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroups(AttachedUserPolicyGroupInfo [] Groups) {
        this.Groups = Groups;
    }

    /**
     * Get 是否已下线(0:否 1:是)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Deactived 是否已下线(0:否 1:是)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeactived() {
        return this.Deactived;
    }

    /**
     * Set 是否已下线(0:否 1:是)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Deactived 是否已下线(0:否 1:是)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeactived(Long Deactived) {
        this.Deactived = Deactived;
    }

    /**
     * Get 已下线的产品列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeactivedDetail 已下线的产品列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDeactivedDetail() {
        return this.DeactivedDetail;
    }

    /**
     * Set 已下线的产品列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeactivedDetail 已下线的产品列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeactivedDetail(String [] DeactivedDetail) {
        this.DeactivedDetail = DeactivedDetail;
    }

    public AttachedUserPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachedUserPolicy(AttachedUserPolicy source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.CreateMode != null) {
            this.CreateMode = new String(source.CreateMode);
        }
        if (source.Groups != null) {
            this.Groups = new AttachedUserPolicyGroupInfo[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new AttachedUserPolicyGroupInfo(source.Groups[i]);
            }
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
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "CreateMode", this.CreateMode);
        this.setParamArrayObj(map, prefix + "Groups.", this.Groups);
        this.setParamSimple(map, prefix + "Deactived", this.Deactived);
        this.setParamArraySimple(map, prefix + "DeactivedDetail.", this.DeactivedDetail);

    }
}

