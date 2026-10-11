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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecutionPlan extends AbstractModel {

    /**
    * <p>执行类型</p><p>枚举值：</p><ul><li>scheduled： 指定时间执行</li><li>periodic： 周期执行</li></ul>
    */
    @SerializedName("ExecuteMode")
    @Expose
    private String ExecuteMode;

    /**
    * <p>任务执行时间</p><p>参数格式：2026-07-23 08:30</p><p>入参限制：只有立即执行或者指定时间执行时设置，周期执行不需要设置</p><p>默认值：当前时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteAt")
    @Expose
    private String ExecuteAt;

    /**
    * <p>周期执行的时间设置</p><p>入参限制：选择周期执行时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutePeriod")
    @Expose
    private ExecutePeriodAttribute ExecutePeriod;

    /**
    * <p>任务等待时间</p><p>取值范围：[1, 500]</p><p>单位：H</p><p>默认值：12</p><p>任务执行的等待时间，超过时间任务未启动，自动取消</p>
    */
    @SerializedName("WaitTime")
    @Expose
    private Long WaitTime;

    /**
     * Get <p>执行类型</p><p>枚举值：</p><ul><li>scheduled： 指定时间执行</li><li>periodic： 周期执行</li></ul> 
     * @return ExecuteMode <p>执行类型</p><p>枚举值：</p><ul><li>scheduled： 指定时间执行</li><li>periodic： 周期执行</li></ul>
     */
    public String getExecuteMode() {
        return this.ExecuteMode;
    }

    /**
     * Set <p>执行类型</p><p>枚举值：</p><ul><li>scheduled： 指定时间执行</li><li>periodic： 周期执行</li></ul>
     * @param ExecuteMode <p>执行类型</p><p>枚举值：</p><ul><li>scheduled： 指定时间执行</li><li>periodic： 周期执行</li></ul>
     */
    public void setExecuteMode(String ExecuteMode) {
        this.ExecuteMode = ExecuteMode;
    }

    /**
     * Get <p>任务执行时间</p><p>参数格式：2026-07-23 08:30</p><p>入参限制：只有立即执行或者指定时间执行时设置，周期执行不需要设置</p><p>默认值：当前时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecuteAt <p>任务执行时间</p><p>参数格式：2026-07-23 08:30</p><p>入参限制：只有立即执行或者指定时间执行时设置，周期执行不需要设置</p><p>默认值：当前时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecuteAt() {
        return this.ExecuteAt;
    }

    /**
     * Set <p>任务执行时间</p><p>参数格式：2026-07-23 08:30</p><p>入参限制：只有立即执行或者指定时间执行时设置，周期执行不需要设置</p><p>默认值：当前时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecuteAt <p>任务执行时间</p><p>参数格式：2026-07-23 08:30</p><p>入参限制：只有立即执行或者指定时间执行时设置，周期执行不需要设置</p><p>默认值：当前时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecuteAt(String ExecuteAt) {
        this.ExecuteAt = ExecuteAt;
    }

    /**
     * Get <p>周期执行的时间设置</p><p>入参限制：选择周期执行时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutePeriod <p>周期执行的时间设置</p><p>入参限制：选择周期执行时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExecutePeriodAttribute getExecutePeriod() {
        return this.ExecutePeriod;
    }

    /**
     * Set <p>周期执行的时间设置</p><p>入参限制：选择周期执行时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutePeriod <p>周期执行的时间设置</p><p>入参限制：选择周期执行时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutePeriod(ExecutePeriodAttribute ExecutePeriod) {
        this.ExecutePeriod = ExecutePeriod;
    }

    /**
     * Get <p>任务等待时间</p><p>取值范围：[1, 500]</p><p>单位：H</p><p>默认值：12</p><p>任务执行的等待时间，超过时间任务未启动，自动取消</p> 
     * @return WaitTime <p>任务等待时间</p><p>取值范围：[1, 500]</p><p>单位：H</p><p>默认值：12</p><p>任务执行的等待时间，超过时间任务未启动，自动取消</p>
     */
    public Long getWaitTime() {
        return this.WaitTime;
    }

    /**
     * Set <p>任务等待时间</p><p>取值范围：[1, 500]</p><p>单位：H</p><p>默认值：12</p><p>任务执行的等待时间，超过时间任务未启动，自动取消</p>
     * @param WaitTime <p>任务等待时间</p><p>取值范围：[1, 500]</p><p>单位：H</p><p>默认值：12</p><p>任务执行的等待时间，超过时间任务未启动，自动取消</p>
     */
    public void setWaitTime(Long WaitTime) {
        this.WaitTime = WaitTime;
    }

    public ExecutionPlan() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecutionPlan(ExecutionPlan source) {
        if (source.ExecuteMode != null) {
            this.ExecuteMode = new String(source.ExecuteMode);
        }
        if (source.ExecuteAt != null) {
            this.ExecuteAt = new String(source.ExecuteAt);
        }
        if (source.ExecutePeriod != null) {
            this.ExecutePeriod = new ExecutePeriodAttribute(source.ExecutePeriod);
        }
        if (source.WaitTime != null) {
            this.WaitTime = new Long(source.WaitTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecuteMode", this.ExecuteMode);
        this.setParamSimple(map, prefix + "ExecuteAt", this.ExecuteAt);
        this.setParamObj(map, prefix + "ExecutePeriod.", this.ExecutePeriod);
        this.setParamSimple(map, prefix + "WaitTime", this.WaitTime);

    }
}

