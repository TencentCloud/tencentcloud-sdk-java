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

public class AttachedPolicyOfRole extends AbstractModel{

    /**
    * 策略ID
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
    * 绑定时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 策略类型，User表示自定义策略，QCS表示预设策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 策略创建方式，1表示按产品功能或项目权限创建，其他表示按策略语法创建
    */
    @SerializedName("CreateMode")
    @Expose
    private Long CreateMode;

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
    * 策略描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 策略ID 
     * @return PolicyId 策略ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略ID
     * @param PolicyId 策略ID
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
     * Get 绑定时间 
     * @return AddTime 绑定时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 绑定时间
     * @param AddTime 绑定时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 策略类型，User表示自定义策略，QCS表示预设策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyType 策略类型，User表示自定义策略，QCS表示预设策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 策略类型，User表示自定义策略，QCS表示预设策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyType 策略类型，User表示自定义策略，QCS表示预设策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 策略创建方式，1表示按产品功能或项目权限创建，其他表示按策略语法创建 
     * @return CreateMode 策略创建方式，1表示按产品功能或项目权限创建，其他表示按策略语法创建
     */
    public Long getCreateMode() {
        return this.CreateMode;
    }

    /**
     * Set 策略创建方式，1表示按产品功能或项目权限创建，其他表示按策略语法创建
     * @param CreateMode 策略创建方式，1表示按产品功能或项目权限创建，其他表示按策略语法创建
     */
    public void setCreateMode(Long CreateMode) {
        this.CreateMode = CreateMode;
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

    /**
     * Get 策略描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "CreateMode", this.CreateMode);
        this.setParamSimple(map, prefix + "Deactived", this.Deactived);
        this.setParamArraySimple(map, prefix + "DeactivedDetail.", this.DeactivedDetail);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

