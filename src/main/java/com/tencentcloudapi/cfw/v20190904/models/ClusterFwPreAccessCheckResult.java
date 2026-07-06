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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterFwPreAccessCheckResult extends AbstractModel {

    /**
    * 检查状态，0：进行中，1：通过，2：失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 当前/最后所处检查项。Status=1（通过）时为 done，Status=2（失败）时为失败的检查项 key，Status=0（进行中）时为正在执行的检查项 key
    */
    @SerializedName("CurrentStage")
    @Expose
    private String CurrentStage;

    /**
    * 逐条检查项结果列表，按执行顺序追加
    */
    @SerializedName("Stages")
    @Expose
    private ClusterFwPreAccessCheckStage [] Stages;

    /**
    * 策略路由配额核算报告，仅在 Status=1（通过）时非空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyRouteReport")
    @Expose
    private PolicyRoutePreCheckReport PolicyRouteReport;

    /**
    * 最近一次更新时间，格式：YYYY-MM-DD HH:MM:SS
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 检查状态，0：进行中，1：通过，2：失败 
     * @return Status 检查状态，0：进行中，1：通过，2：失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 检查状态，0：进行中，1：通过，2：失败
     * @param Status 检查状态，0：进行中，1：通过，2：失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 当前/最后所处检查项。Status=1（通过）时为 done，Status=2（失败）时为失败的检查项 key，Status=0（进行中）时为正在执行的检查项 key 
     * @return CurrentStage 当前/最后所处检查项。Status=1（通过）时为 done，Status=2（失败）时为失败的检查项 key，Status=0（进行中）时为正在执行的检查项 key
     */
    public String getCurrentStage() {
        return this.CurrentStage;
    }

    /**
     * Set 当前/最后所处检查项。Status=1（通过）时为 done，Status=2（失败）时为失败的检查项 key，Status=0（进行中）时为正在执行的检查项 key
     * @param CurrentStage 当前/最后所处检查项。Status=1（通过）时为 done，Status=2（失败）时为失败的检查项 key，Status=0（进行中）时为正在执行的检查项 key
     */
    public void setCurrentStage(String CurrentStage) {
        this.CurrentStage = CurrentStage;
    }

    /**
     * Get 逐条检查项结果列表，按执行顺序追加 
     * @return Stages 逐条检查项结果列表，按执行顺序追加
     */
    public ClusterFwPreAccessCheckStage [] getStages() {
        return this.Stages;
    }

    /**
     * Set 逐条检查项结果列表，按执行顺序追加
     * @param Stages 逐条检查项结果列表，按执行顺序追加
     */
    public void setStages(ClusterFwPreAccessCheckStage [] Stages) {
        this.Stages = Stages;
    }

    /**
     * Get 策略路由配额核算报告，仅在 Status=1（通过）时非空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyRouteReport 策略路由配额核算报告，仅在 Status=1（通过）时非空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PolicyRoutePreCheckReport getPolicyRouteReport() {
        return this.PolicyRouteReport;
    }

    /**
     * Set 策略路由配额核算报告，仅在 Status=1（通过）时非空
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyRouteReport 策略路由配额核算报告，仅在 Status=1（通过）时非空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyRouteReport(PolicyRoutePreCheckReport PolicyRouteReport) {
        this.PolicyRouteReport = PolicyRouteReport;
    }

    /**
     * Get 最近一次更新时间，格式：YYYY-MM-DD HH:MM:SS 
     * @return UpdateTime 最近一次更新时间，格式：YYYY-MM-DD HH:MM:SS
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最近一次更新时间，格式：YYYY-MM-DD HH:MM:SS
     * @param UpdateTime 最近一次更新时间，格式：YYYY-MM-DD HH:MM:SS
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ClusterFwPreAccessCheckResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterFwPreAccessCheckResult(ClusterFwPreAccessCheckResult source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CurrentStage != null) {
            this.CurrentStage = new String(source.CurrentStage);
        }
        if (source.Stages != null) {
            this.Stages = new ClusterFwPreAccessCheckStage[source.Stages.length];
            for (int i = 0; i < source.Stages.length; i++) {
                this.Stages[i] = new ClusterFwPreAccessCheckStage(source.Stages[i]);
            }
        }
        if (source.PolicyRouteReport != null) {
            this.PolicyRouteReport = new PolicyRoutePreCheckReport(source.PolicyRouteReport);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CurrentStage", this.CurrentStage);
        this.setParamArrayObj(map, prefix + "Stages.", this.Stages);
        this.setParamObj(map, prefix + "PolicyRouteReport.", this.PolicyRouteReport);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

