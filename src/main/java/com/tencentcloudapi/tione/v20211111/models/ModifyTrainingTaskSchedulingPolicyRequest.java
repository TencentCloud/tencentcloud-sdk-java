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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTrainingTaskSchedulingPolicyRequest extends AbstractModel {

    /**
    * <p>训练任务 id</p>
    */
    @SerializedName("TrainingTaskId")
    @Expose
    private String TrainingTaskId;

    /**
    * <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
    * <p>是否开启跨资源组调度。缺省为 false，仅改优先级时若任务已开启需显式传 true，否则会被关闭。</p>
    */
    @SerializedName("CrossResourceGroupScheduling")
    @Expose
    private Boolean CrossResourceGroupScheduling;

    /**
    * <p>调度策略</p>
    */
    @SerializedName("SchedulePolicy")
    @Expose
    private SchedulePolicy SchedulePolicy;

    /**
     * Get <p>训练任务 id</p> 
     * @return TrainingTaskId <p>训练任务 id</p>
     */
    public String getTrainingTaskId() {
        return this.TrainingTaskId;
    }

    /**
     * Set <p>训练任务 id</p>
     * @param TrainingTaskId <p>训练任务 id</p>
     */
    public void setTrainingTaskId(String TrainingTaskId) {
        this.TrainingTaskId = TrainingTaskId;
    }

    /**
     * Get <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p> 
     * @return TiProjectId <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     * @param TiProjectId <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    /**
     * Get <p>是否开启跨资源组调度。缺省为 false，仅改优先级时若任务已开启需显式传 true，否则会被关闭。</p> 
     * @return CrossResourceGroupScheduling <p>是否开启跨资源组调度。缺省为 false，仅改优先级时若任务已开启需显式传 true，否则会被关闭。</p>
     */
    public Boolean getCrossResourceGroupScheduling() {
        return this.CrossResourceGroupScheduling;
    }

    /**
     * Set <p>是否开启跨资源组调度。缺省为 false，仅改优先级时若任务已开启需显式传 true，否则会被关闭。</p>
     * @param CrossResourceGroupScheduling <p>是否开启跨资源组调度。缺省为 false，仅改优先级时若任务已开启需显式传 true，否则会被关闭。</p>
     */
    public void setCrossResourceGroupScheduling(Boolean CrossResourceGroupScheduling) {
        this.CrossResourceGroupScheduling = CrossResourceGroupScheduling;
    }

    /**
     * Get <p>调度策略</p> 
     * @return SchedulePolicy <p>调度策略</p>
     */
    public SchedulePolicy getSchedulePolicy() {
        return this.SchedulePolicy;
    }

    /**
     * Set <p>调度策略</p>
     * @param SchedulePolicy <p>调度策略</p>
     */
    public void setSchedulePolicy(SchedulePolicy SchedulePolicy) {
        this.SchedulePolicy = SchedulePolicy;
    }

    public ModifyTrainingTaskSchedulingPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTrainingTaskSchedulingPolicyRequest(ModifyTrainingTaskSchedulingPolicyRequest source) {
        if (source.TrainingTaskId != null) {
            this.TrainingTaskId = new String(source.TrainingTaskId);
        }
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
        }
        if (source.CrossResourceGroupScheduling != null) {
            this.CrossResourceGroupScheduling = new Boolean(source.CrossResourceGroupScheduling);
        }
        if (source.SchedulePolicy != null) {
            this.SchedulePolicy = new SchedulePolicy(source.SchedulePolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrainingTaskId", this.TrainingTaskId);
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);
        this.setParamSimple(map, prefix + "CrossResourceGroupScheduling", this.CrossResourceGroupScheduling);
        this.setParamObj(map, prefix + "SchedulePolicy.", this.SchedulePolicy);

    }
}

