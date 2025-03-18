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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListPoliciesForTarget extends AbstractModel {

    /**
    * 策略Id
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * 策略名称
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 关联的账号或节点
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 关联类型 1-节点 2-用户
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 策略创建时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 策略更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 部门名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 策略绑定时间
    */
    @SerializedName("AttachTime")
    @Expose
    private String AttachTime;

    /**
     * Get 策略Id 
     * @return StrategyId 策略Id
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略Id
     * @param StrategyId 策略Id
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 策略名称 
     * @return StrategyName 策略名称
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 策略名称
     * @param StrategyName 策略名称
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 关联的账号或节点 
     * @return Uin 关联的账号或节点
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 关联的账号或节点
     * @param Uin 关联的账号或节点
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 关联类型 1-节点 2-用户 
     * @return Type 关联类型 1-节点 2-用户
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 关联类型 1-节点 2-用户
     * @param Type 关联类型 1-节点 2-用户
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 策略创建时间 
     * @return AddTime 策略创建时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 策略创建时间
     * @param AddTime 策略创建时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 策略更新时间 
     * @return UpdateTime 策略更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 策略更新时间
     * @param UpdateTime 策略更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 部门名称 
     * @return Name 部门名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 部门名称
     * @param Name 部门名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 策略绑定时间 
     * @return AttachTime 策略绑定时间
     */
    public String getAttachTime() {
        return this.AttachTime;
    }

    /**
     * Set 策略绑定时间
     * @param AttachTime 策略绑定时间
     */
    public void setAttachTime(String AttachTime) {
        this.AttachTime = AttachTime;
    }

    public ListPoliciesForTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListPoliciesForTarget(ListPoliciesForTarget source) {
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AttachTime != null) {
            this.AttachTime = new String(source.AttachTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AttachTime", this.AttachTime);

    }
}

