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

public class ListPolicyNode extends AbstractModel {

    /**
    * 策略创建时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 策略绑定次数
    */
    @SerializedName("AttachedTimes")
    @Expose
    private Long AttachedTimes;

    /**
    * 策略描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 策略名称
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 策略Id
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 策略更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 策略类型 1-自定义 2-预设
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

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
     * Get 策略绑定次数 
     * @return AttachedTimes 策略绑定次数
     */
    public Long getAttachedTimes() {
        return this.AttachedTimes;
    }

    /**
     * Set 策略绑定次数
     * @param AttachedTimes 策略绑定次数
     */
    public void setAttachedTimes(Long AttachedTimes) {
        this.AttachedTimes = AttachedTimes;
    }

    /**
     * Get 策略描述信息 
     * @return Description 策略描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 策略描述信息
     * @param Description 策略描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get 策略Id 
     * @return PolicyId 策略Id
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略Id
     * @param PolicyId 策略Id
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
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
     * Get 策略类型 1-自定义 2-预设 
     * @return Type 策略类型 1-自定义 2-预设
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 策略类型 1-自定义 2-预设
     * @param Type 策略类型 1-自定义 2-预设
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public ListPolicyNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListPolicyNode(ListPolicyNode source) {
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.AttachedTimes != null) {
            this.AttachedTimes = new Long(source.AttachedTimes);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "AttachedTimes", this.AttachedTimes);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

