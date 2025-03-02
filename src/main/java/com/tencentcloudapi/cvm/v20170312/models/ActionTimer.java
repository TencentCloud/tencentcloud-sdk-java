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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActionTimer extends AbstractModel {

    /**
    * 定时器动作，目前仅支持销毁一个值：TerminateInstances。
    */
    @SerializedName("TimerAction")
    @Expose
    private String TimerAction;

    /**
    * 执行时间，按照ISO8601标准表示，并且使用UTC时间。格式为 YYYY-MM-DDThh:mm:ssZ。例如 2018-05-29T11:26:40Z，执行时间必须大于当前时间5分钟。
    */
    @SerializedName("ActionTime")
    @Expose
    private String ActionTime;

    /**
    * 扩展数据
    */
    @SerializedName("Externals")
    @Expose
    private Externals Externals;

    /**
    * 定时器ID。
    */
    @SerializedName("ActionTimerId")
    @Expose
    private String ActionTimerId;

    /**
    * 定时器状态，取值范围：

UNDO：未触发
DOING：触发中
DONE：已经触发

    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 定时器对应的实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 定时器动作，目前仅支持销毁一个值：TerminateInstances。 
     * @return TimerAction 定时器动作，目前仅支持销毁一个值：TerminateInstances。
     */
    public String getTimerAction() {
        return this.TimerAction;
    }

    /**
     * Set 定时器动作，目前仅支持销毁一个值：TerminateInstances。
     * @param TimerAction 定时器动作，目前仅支持销毁一个值：TerminateInstances。
     */
    public void setTimerAction(String TimerAction) {
        this.TimerAction = TimerAction;
    }

    /**
     * Get 执行时间，按照ISO8601标准表示，并且使用UTC时间。格式为 YYYY-MM-DDThh:mm:ssZ。例如 2018-05-29T11:26:40Z，执行时间必须大于当前时间5分钟。 
     * @return ActionTime 执行时间，按照ISO8601标准表示，并且使用UTC时间。格式为 YYYY-MM-DDThh:mm:ssZ。例如 2018-05-29T11:26:40Z，执行时间必须大于当前时间5分钟。
     */
    public String getActionTime() {
        return this.ActionTime;
    }

    /**
     * Set 执行时间，按照ISO8601标准表示，并且使用UTC时间。格式为 YYYY-MM-DDThh:mm:ssZ。例如 2018-05-29T11:26:40Z，执行时间必须大于当前时间5分钟。
     * @param ActionTime 执行时间，按照ISO8601标准表示，并且使用UTC时间。格式为 YYYY-MM-DDThh:mm:ssZ。例如 2018-05-29T11:26:40Z，执行时间必须大于当前时间5分钟。
     */
    public void setActionTime(String ActionTime) {
        this.ActionTime = ActionTime;
    }

    /**
     * Get 扩展数据 
     * @return Externals 扩展数据
     */
    public Externals getExternals() {
        return this.Externals;
    }

    /**
     * Set 扩展数据
     * @param Externals 扩展数据
     */
    public void setExternals(Externals Externals) {
        this.Externals = Externals;
    }

    /**
     * Get 定时器ID。 
     * @return ActionTimerId 定时器ID。
     */
    public String getActionTimerId() {
        return this.ActionTimerId;
    }

    /**
     * Set 定时器ID。
     * @param ActionTimerId 定时器ID。
     */
    public void setActionTimerId(String ActionTimerId) {
        this.ActionTimerId = ActionTimerId;
    }

    /**
     * Get 定时器状态，取值范围：

UNDO：未触发
DOING：触发中
DONE：已经触发
 
     * @return Status 定时器状态，取值范围：

UNDO：未触发
DOING：触发中
DONE：已经触发

     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 定时器状态，取值范围：

UNDO：未触发
DOING：触发中
DONE：已经触发

     * @param Status 定时器状态，取值范围：

UNDO：未触发
DOING：触发中
DONE：已经触发

     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 定时器对应的实例ID。 
     * @return InstanceId 定时器对应的实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 定时器对应的实例ID。
     * @param InstanceId 定时器对应的实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public ActionTimer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActionTimer(ActionTimer source) {
        if (source.TimerAction != null) {
            this.TimerAction = new String(source.TimerAction);
        }
        if (source.ActionTime != null) {
            this.ActionTime = new String(source.ActionTime);
        }
        if (source.Externals != null) {
            this.Externals = new Externals(source.Externals);
        }
        if (source.ActionTimerId != null) {
            this.ActionTimerId = new String(source.ActionTimerId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimerAction", this.TimerAction);
        this.setParamSimple(map, prefix + "ActionTime", this.ActionTime);
        this.setParamObj(map, prefix + "Externals.", this.Externals);
        this.setParamSimple(map, prefix + "ActionTimerId", this.ActionTimerId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

