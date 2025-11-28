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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradePlan extends AbstractModel {

    /**
    * 升级计划ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 集群ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 预计开始时间
    */
    @SerializedName("PlanedStartAt")
    @Expose
    private String PlanedStartAt;

    /**
    * 升级开始时间
    */
    @SerializedName("UpgradeStartAt")
    @Expose
    private String UpgradeStartAt;

    /**
    * 升级结束时间
    */
    @SerializedName("UpgradeEndAt")
    @Expose
    private String UpgradeEndAt;

    /**
    * 升级状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 升级计划ID 
     * @return ID 升级计划ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 升级计划ID
     * @param ID 升级计划ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 集群ID 
     * @return ClusterID 集群ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 集群ID
     * @param ClusterID 集群ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 预计开始时间 
     * @return PlanedStartAt 预计开始时间
     */
    public String getPlanedStartAt() {
        return this.PlanedStartAt;
    }

    /**
     * Set 预计开始时间
     * @param PlanedStartAt 预计开始时间
     */
    public void setPlanedStartAt(String PlanedStartAt) {
        this.PlanedStartAt = PlanedStartAt;
    }

    /**
     * Get 升级开始时间 
     * @return UpgradeStartAt 升级开始时间
     */
    public String getUpgradeStartAt() {
        return this.UpgradeStartAt;
    }

    /**
     * Set 升级开始时间
     * @param UpgradeStartAt 升级开始时间
     */
    public void setUpgradeStartAt(String UpgradeStartAt) {
        this.UpgradeStartAt = UpgradeStartAt;
    }

    /**
     * Get 升级结束时间 
     * @return UpgradeEndAt 升级结束时间
     */
    public String getUpgradeEndAt() {
        return this.UpgradeEndAt;
    }

    /**
     * Set 升级结束时间
     * @param UpgradeEndAt 升级结束时间
     */
    public void setUpgradeEndAt(String UpgradeEndAt) {
        this.UpgradeEndAt = UpgradeEndAt;
    }

    /**
     * Get 升级状态 
     * @return Status 升级状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 升级状态
     * @param Status 升级状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 原因 
     * @return Reason 原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 原因
     * @param Reason 原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public UpgradePlan() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradePlan(UpgradePlan source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.PlanedStartAt != null) {
            this.PlanedStartAt = new String(source.PlanedStartAt);
        }
        if (source.UpgradeStartAt != null) {
            this.UpgradeStartAt = new String(source.UpgradeStartAt);
        }
        if (source.UpgradeEndAt != null) {
            this.UpgradeEndAt = new String(source.UpgradeEndAt);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "PlanedStartAt", this.PlanedStartAt);
        this.setParamSimple(map, prefix + "UpgradeStartAt", this.UpgradeStartAt);
        this.setParamSimple(map, prefix + "UpgradeEndAt", this.UpgradeEndAt);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

