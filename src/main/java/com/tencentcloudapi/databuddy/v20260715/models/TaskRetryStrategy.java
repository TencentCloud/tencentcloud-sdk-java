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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskRetryStrategy extends AbstractModel {

    /**
    * 最多重试次数，默认3
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRetryTimes")
    @Expose
    private Long MaxRetryTimes;

    /**
    * 重试之间等待时间，默认5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryBetweenWaitTime")
    @Expose
    private Long RetryBetweenWaitTime;

    /**
    * 重试之间等待时间单位
毫秒：MILLISECOND秒：SECOND分钟（默认）：MINUTE小时：HOUR
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryBetweenWaitTimeUnit")
    @Expose
    private String RetryBetweenWaitTimeUnit;

    /**
    * 任务运行失败时重试开关，默认为true
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskRunFailureRetrySwitch")
    @Expose
    private Boolean TaskRunFailureRetrySwitch;

    /**
    * 任务运行超时时重试开关，默认为false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskRunTimeoutRetrySwitch")
    @Expose
    private Boolean TaskRunTimeoutRetrySwitch;

    /**
     * Get 最多重试次数，默认3
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRetryTimes 最多重试次数，默认3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxRetryTimes() {
        return this.MaxRetryTimes;
    }

    /**
     * Set 最多重试次数，默认3
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRetryTimes 最多重试次数，默认3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxRetryTimes(Long MaxRetryTimes) {
        this.MaxRetryTimes = MaxRetryTimes;
    }

    /**
     * Get 重试之间等待时间，默认5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryBetweenWaitTime 重试之间等待时间，默认5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryBetweenWaitTime() {
        return this.RetryBetweenWaitTime;
    }

    /**
     * Set 重试之间等待时间，默认5
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryBetweenWaitTime 重试之间等待时间，默认5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryBetweenWaitTime(Long RetryBetweenWaitTime) {
        this.RetryBetweenWaitTime = RetryBetweenWaitTime;
    }

    /**
     * Get 重试之间等待时间单位
毫秒：MILLISECOND秒：SECOND分钟（默认）：MINUTE小时：HOUR
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryBetweenWaitTimeUnit 重试之间等待时间单位
毫秒：MILLISECOND秒：SECOND分钟（默认）：MINUTE小时：HOUR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRetryBetweenWaitTimeUnit() {
        return this.RetryBetweenWaitTimeUnit;
    }

    /**
     * Set 重试之间等待时间单位
毫秒：MILLISECOND秒：SECOND分钟（默认）：MINUTE小时：HOUR
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryBetweenWaitTimeUnit 重试之间等待时间单位
毫秒：MILLISECOND秒：SECOND分钟（默认）：MINUTE小时：HOUR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryBetweenWaitTimeUnit(String RetryBetweenWaitTimeUnit) {
        this.RetryBetweenWaitTimeUnit = RetryBetweenWaitTimeUnit;
    }

    /**
     * Get 任务运行失败时重试开关，默认为true
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskRunFailureRetrySwitch 任务运行失败时重试开关，默认为true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTaskRunFailureRetrySwitch() {
        return this.TaskRunFailureRetrySwitch;
    }

    /**
     * Set 任务运行失败时重试开关，默认为true
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskRunFailureRetrySwitch 任务运行失败时重试开关，默认为true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskRunFailureRetrySwitch(Boolean TaskRunFailureRetrySwitch) {
        this.TaskRunFailureRetrySwitch = TaskRunFailureRetrySwitch;
    }

    /**
     * Get 任务运行超时时重试开关，默认为false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskRunTimeoutRetrySwitch 任务运行超时时重试开关，默认为false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTaskRunTimeoutRetrySwitch() {
        return this.TaskRunTimeoutRetrySwitch;
    }

    /**
     * Set 任务运行超时时重试开关，默认为false
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskRunTimeoutRetrySwitch 任务运行超时时重试开关，默认为false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskRunTimeoutRetrySwitch(Boolean TaskRunTimeoutRetrySwitch) {
        this.TaskRunTimeoutRetrySwitch = TaskRunTimeoutRetrySwitch;
    }

    public TaskRetryStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskRetryStrategy(TaskRetryStrategy source) {
        if (source.MaxRetryTimes != null) {
            this.MaxRetryTimes = new Long(source.MaxRetryTimes);
        }
        if (source.RetryBetweenWaitTime != null) {
            this.RetryBetweenWaitTime = new Long(source.RetryBetweenWaitTime);
        }
        if (source.RetryBetweenWaitTimeUnit != null) {
            this.RetryBetweenWaitTimeUnit = new String(source.RetryBetweenWaitTimeUnit);
        }
        if (source.TaskRunFailureRetrySwitch != null) {
            this.TaskRunFailureRetrySwitch = new Boolean(source.TaskRunFailureRetrySwitch);
        }
        if (source.TaskRunTimeoutRetrySwitch != null) {
            this.TaskRunTimeoutRetrySwitch = new Boolean(source.TaskRunTimeoutRetrySwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxRetryTimes", this.MaxRetryTimes);
        this.setParamSimple(map, prefix + "RetryBetweenWaitTime", this.RetryBetweenWaitTime);
        this.setParamSimple(map, prefix + "RetryBetweenWaitTimeUnit", this.RetryBetweenWaitTimeUnit);
        this.setParamSimple(map, prefix + "TaskRunFailureRetrySwitch", this.TaskRunFailureRetrySwitch);
        this.setParamSimple(map, prefix + "TaskRunTimeoutRetrySwitch", this.TaskRunTimeoutRetrySwitch);

    }
}

