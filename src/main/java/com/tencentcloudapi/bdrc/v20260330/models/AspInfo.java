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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AspInfo extends AbstractModel {

    /**
    * 备份策略ID
    */
    @SerializedName("AspId")
    @Expose
    private String AspId;

    /**
    * 备份策略名称
    */
    @SerializedName("AspName")
    @Expose
    private String AspName;

    /**
    * 备份策略状态
    */
    @SerializedName("AspState")
    @Expose
    private String AspState;

    /**
    * 备份策略执行详情
    */
    @SerializedName("Policy")
    @Expose
    private Policy [] Policy;

    /**
    * 备份策略是否使能
    */
    @SerializedName("IsActivated")
    @Expose
    private Boolean IsActivated;

    /**
    * 是否永久保留
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * 保留时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetentionDays")
    @Expose
    private Long RetentionDays;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 备份策略ID 
     * @return AspId 备份策略ID
     */
    public String getAspId() {
        return this.AspId;
    }

    /**
     * Set 备份策略ID
     * @param AspId 备份策略ID
     */
    public void setAspId(String AspId) {
        this.AspId = AspId;
    }

    /**
     * Get 备份策略名称 
     * @return AspName 备份策略名称
     */
    public String getAspName() {
        return this.AspName;
    }

    /**
     * Set 备份策略名称
     * @param AspName 备份策略名称
     */
    public void setAspName(String AspName) {
        this.AspName = AspName;
    }

    /**
     * Get 备份策略状态 
     * @return AspState 备份策略状态
     */
    public String getAspState() {
        return this.AspState;
    }

    /**
     * Set 备份策略状态
     * @param AspState 备份策略状态
     */
    public void setAspState(String AspState) {
        this.AspState = AspState;
    }

    /**
     * Get 备份策略执行详情 
     * @return Policy 备份策略执行详情
     */
    public Policy [] getPolicy() {
        return this.Policy;
    }

    /**
     * Set 备份策略执行详情
     * @param Policy 备份策略执行详情
     */
    public void setPolicy(Policy [] Policy) {
        this.Policy = Policy;
    }

    /**
     * Get 备份策略是否使能 
     * @return IsActivated 备份策略是否使能
     */
    public Boolean getIsActivated() {
        return this.IsActivated;
    }

    /**
     * Set 备份策略是否使能
     * @param IsActivated 备份策略是否使能
     */
    public void setIsActivated(Boolean IsActivated) {
        this.IsActivated = IsActivated;
    }

    /**
     * Get 是否永久保留 
     * @return IsPermanent 是否永久保留
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set 是否永久保留
     * @param IsPermanent 是否永久保留
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get 保留时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetentionDays 保留时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetentionDays() {
        return this.RetentionDays;
    }

    /**
     * Set 保留时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetentionDays 保留时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetentionDays(Long RetentionDays) {
        this.RetentionDays = RetentionDays;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public AspInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AspInfo(AspInfo source) {
        if (source.AspId != null) {
            this.AspId = new String(source.AspId);
        }
        if (source.AspName != null) {
            this.AspName = new String(source.AspName);
        }
        if (source.AspState != null) {
            this.AspState = new String(source.AspState);
        }
        if (source.Policy != null) {
            this.Policy = new Policy[source.Policy.length];
            for (int i = 0; i < source.Policy.length; i++) {
                this.Policy[i] = new Policy(source.Policy[i]);
            }
        }
        if (source.IsActivated != null) {
            this.IsActivated = new Boolean(source.IsActivated);
        }
        if (source.IsPermanent != null) {
            this.IsPermanent = new Boolean(source.IsPermanent);
        }
        if (source.RetentionDays != null) {
            this.RetentionDays = new Long(source.RetentionDays);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AspId", this.AspId);
        this.setParamSimple(map, prefix + "AspName", this.AspName);
        this.setParamSimple(map, prefix + "AspState", this.AspState);
        this.setParamArrayObj(map, prefix + "Policy.", this.Policy);
        this.setParamSimple(map, prefix + "IsActivated", this.IsActivated);
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);
        this.setParamSimple(map, prefix + "RetentionDays", this.RetentionDays);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

