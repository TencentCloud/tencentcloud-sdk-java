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

public class CreateFileBackupPlanRequest extends AbstractModel {

    /**
    * 备份策略ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 备份库ID
    */
    @SerializedName("BackupStorageId")
    @Expose
    private String BackupStorageId;

    /**
    * 计划名称
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * 实例配置列表，[1,20]
    */
    @SerializedName("Resources")
    @Expose
    private ResourcePlan [] Resources;

    /**
     * Get 备份策略ID 
     * @return PolicyId 备份策略ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 备份策略ID
     * @param PolicyId 备份策略ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 备份库ID 
     * @return BackupStorageId 备份库ID
     */
    public String getBackupStorageId() {
        return this.BackupStorageId;
    }

    /**
     * Set 备份库ID
     * @param BackupStorageId 备份库ID
     */
    public void setBackupStorageId(String BackupStorageId) {
        this.BackupStorageId = BackupStorageId;
    }

    /**
     * Get 计划名称 
     * @return PlanName 计划名称
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set 计划名称
     * @param PlanName 计划名称
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get 实例配置列表，[1,20] 
     * @return Resources 实例配置列表，[1,20]
     */
    public ResourcePlan [] getResources() {
        return this.Resources;
    }

    /**
     * Set 实例配置列表，[1,20]
     * @param Resources 实例配置列表，[1,20]
     */
    public void setResources(ResourcePlan [] Resources) {
        this.Resources = Resources;
    }

    public CreateFileBackupPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFileBackupPlanRequest(CreateFileBackupPlanRequest source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.BackupStorageId != null) {
            this.BackupStorageId = new String(source.BackupStorageId);
        }
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.Resources != null) {
            this.Resources = new ResourcePlan[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new ResourcePlan(source.Resources[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "BackupStorageId", this.BackupStorageId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);

    }
}

