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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceUpgradeProgressItem extends AbstractModel{

    /**
    * 节点instanceID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 任务生命周期
process 运行中
paused 已停止
pauing 正在停止
done  已完成
timeout 已超时
aborted 已取消
pending 还未开始
    */
    @SerializedName("LifeState")
    @Expose
    private String LifeState;

    /**
    * 升级开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartAt")
    @Expose
    private String StartAt;

    /**
    * 升级结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndAt")
    @Expose
    private String EndAt;

    /**
    * 升级前检查结果
    */
    @SerializedName("CheckResult")
    @Expose
    private InstanceUpgradePreCheckResult CheckResult;

    /**
    * 升级步骤详情
    */
    @SerializedName("Detail")
    @Expose
    private TaskStepInfo [] Detail;

    /**
     * Get 节点instanceID 
     * @return InstanceID 节点instanceID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 节点instanceID
     * @param InstanceID 节点instanceID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 任务生命周期
process 运行中
paused 已停止
pauing 正在停止
done  已完成
timeout 已超时
aborted 已取消
pending 还未开始 
     * @return LifeState 任务生命周期
process 运行中
paused 已停止
pauing 正在停止
done  已完成
timeout 已超时
aborted 已取消
pending 还未开始
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set 任务生命周期
process 运行中
paused 已停止
pauing 正在停止
done  已完成
timeout 已超时
aborted 已取消
pending 还未开始
     * @param LifeState 任务生命周期
process 运行中
paused 已停止
pauing 正在停止
done  已完成
timeout 已超时
aborted 已取消
pending 还未开始
     */
    public void setLifeState(String LifeState) {
        this.LifeState = LifeState;
    }

    /**
     * Get 升级开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartAt 升级开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartAt() {
        return this.StartAt;
    }

    /**
     * Set 升级开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartAt 升级开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartAt(String StartAt) {
        this.StartAt = StartAt;
    }

    /**
     * Get 升级结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndAt 升级结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndAt() {
        return this.EndAt;
    }

    /**
     * Set 升级结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndAt 升级结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndAt(String EndAt) {
        this.EndAt = EndAt;
    }

    /**
     * Get 升级前检查结果 
     * @return CheckResult 升级前检查结果
     */
    public InstanceUpgradePreCheckResult getCheckResult() {
        return this.CheckResult;
    }

    /**
     * Set 升级前检查结果
     * @param CheckResult 升级前检查结果
     */
    public void setCheckResult(InstanceUpgradePreCheckResult CheckResult) {
        this.CheckResult = CheckResult;
    }

    /**
     * Get 升级步骤详情 
     * @return Detail 升级步骤详情
     */
    public TaskStepInfo [] getDetail() {
        return this.Detail;
    }

    /**
     * Set 升级步骤详情
     * @param Detail 升级步骤详情
     */
    public void setDetail(TaskStepInfo [] Detail) {
        this.Detail = Detail;
    }

    public InstanceUpgradeProgressItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceUpgradeProgressItem(InstanceUpgradeProgressItem source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.LifeState != null) {
            this.LifeState = new String(source.LifeState);
        }
        if (source.StartAt != null) {
            this.StartAt = new String(source.StartAt);
        }
        if (source.EndAt != null) {
            this.EndAt = new String(source.EndAt);
        }
        if (source.CheckResult != null) {
            this.CheckResult = new InstanceUpgradePreCheckResult(source.CheckResult);
        }
        if (source.Detail != null) {
            this.Detail = new TaskStepInfo[source.Detail.length];
            for (int i = 0; i < source.Detail.length; i++) {
                this.Detail[i] = new TaskStepInfo(source.Detail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "LifeState", this.LifeState);
        this.setParamSimple(map, prefix + "StartAt", this.StartAt);
        this.setParamSimple(map, prefix + "EndAt", this.EndAt);
        this.setParamObj(map, prefix + "CheckResult.", this.CheckResult);
        this.setParamArrayObj(map, prefix + "Detail.", this.Detail);

    }
}

