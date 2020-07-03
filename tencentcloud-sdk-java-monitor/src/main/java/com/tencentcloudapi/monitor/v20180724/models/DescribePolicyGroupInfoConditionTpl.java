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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyGroupInfoConditionTpl extends AbstractModel{

    /**
    * 策略组id
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 策略组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 策略类型
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * 策略组说明
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 最后编辑的用户uin
    */
    @SerializedName("LastEditUin")
    @Expose
    private String LastEditUin;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InsertTime")
    @Expose
    private Long InsertTime;

    /**
    * 是否且规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

    /**
     * Get 策略组id 
     * @return GroupId 策略组id
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 策略组id
     * @param GroupId 策略组id
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 策略组名称 
     * @return GroupName 策略组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 策略组名称
     * @param GroupName 策略组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 策略类型 
     * @return ViewName 策略类型
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set 策略类型
     * @param ViewName 策略类型
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get 策略组说明 
     * @return Remark 策略组说明
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 策略组说明
     * @param Remark 策略组说明
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 最后编辑的用户uin 
     * @return LastEditUin 最后编辑的用户uin
     */
    public String getLastEditUin() {
        return this.LastEditUin;
    }

    /**
     * Set 最后编辑的用户uin
     * @param LastEditUin 最后编辑的用户uin
     */
    public void setLastEditUin(String LastEditUin) {
        this.LastEditUin = LastEditUin;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InsertTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param InsertTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInsertTime(Long InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get 是否且规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsUnionRule 是否且规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set 是否且规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsUnionRule 是否且规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsUnionRule(Long IsUnionRule) {
        this.IsUnionRule = IsUnionRule;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "LastEditUin", this.LastEditUin);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "IsUnionRule", this.IsUnionRule);

    }
}

