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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CarrierPrivilegeNumberApplicant extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 申请单Id
    */
    @SerializedName("ApplicantId")
    @Expose
    private Long ApplicantId;

    /**
    * 主叫号码列表
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * 被叫号码列表
    */
    @SerializedName("Callees")
    @Expose
    private String [] Callees;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 审批状态:1 待审核、2 通过、3 拒绝
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 创建时间，unix时间戳(秒)
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间，unix时间戳(秒)
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 实例Id 
     * @return SdkAppId 实例Id
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 实例Id
     * @param SdkAppId 实例Id
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 申请单Id 
     * @return ApplicantId 申请单Id
     */
    public Long getApplicantId() {
        return this.ApplicantId;
    }

    /**
     * Set 申请单Id
     * @param ApplicantId 申请单Id
     */
    public void setApplicantId(Long ApplicantId) {
        this.ApplicantId = ApplicantId;
    }

    /**
     * Get 主叫号码列表 
     * @return Callers 主叫号码列表
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set 主叫号码列表
     * @param Callers 主叫号码列表
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get 被叫号码列表 
     * @return Callees 被叫号码列表
     */
    public String [] getCallees() {
        return this.Callees;
    }

    /**
     * Set 被叫号码列表
     * @param Callees 被叫号码列表
     */
    public void setCallees(String [] Callees) {
        this.Callees = Callees;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 审批状态:1 待审核、2 通过、3 拒绝 
     * @return State 审批状态:1 待审核、2 通过、3 拒绝
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 审批状态:1 待审核、2 通过、3 拒绝
     * @param State 审批状态:1 待审核、2 通过、3 拒绝
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 创建时间，unix时间戳(秒) 
     * @return CreateTime 创建时间，unix时间戳(秒)
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，unix时间戳(秒)
     * @param CreateTime 创建时间，unix时间戳(秒)
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间，unix时间戳(秒) 
     * @return UpdateTime 更新时间，unix时间戳(秒)
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间，unix时间戳(秒)
     * @param UpdateTime 更新时间，unix时间戳(秒)
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public CarrierPrivilegeNumberApplicant() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CarrierPrivilegeNumberApplicant(CarrierPrivilegeNumberApplicant source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.ApplicantId != null) {
            this.ApplicantId = new Long(source.ApplicantId);
        }
        if (source.Callers != null) {
            this.Callers = new String[source.Callers.length];
            for (int i = 0; i < source.Callers.length; i++) {
                this.Callers[i] = new String(source.Callers[i]);
            }
        }
        if (source.Callees != null) {
            this.Callees = new String[source.Callees.length];
            for (int i = 0; i < source.Callees.length; i++) {
                this.Callees[i] = new String(source.Callees[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "ApplicantId", this.ApplicantId);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamArraySimple(map, prefix + "Callees.", this.Callees);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

