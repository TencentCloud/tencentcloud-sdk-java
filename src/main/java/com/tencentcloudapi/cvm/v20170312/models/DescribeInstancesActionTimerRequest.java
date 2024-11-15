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

public class DescribeInstancesActionTimerRequest extends AbstractModel {

    /**
    * 定时任务ID列表。
    */
    @SerializedName("ActionTimerIds")
    @Expose
    private String [] ActionTimerIds;

    /**
    * 按照一个或者多个实例ID查询。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 定时器动作，目前仅支持销毁一个值：TerminateInstances。
    */
    @SerializedName("TimerAction")
    @Expose
    private String TimerAction;

    /**
    * 执行时间的结束范围，用于条件筛选，格式如2018-05-01 19:00:00。
    */
    @SerializedName("EndActionTime")
    @Expose
    private String EndActionTime;

    /**
    * 执行时间的开始范围，用于条件筛选，格式如2018-05-01 19:00:00。
    */
    @SerializedName("StartActionTime")
    @Expose
    private String StartActionTime;

    /**
    * 定时任务状态列表。<br><li>UNDO：未执行</li> <br><li>DOING：正在执行</li><br><li>DONE：执行完成。</li>
    */
    @SerializedName("StatusList")
    @Expose
    private String [] StatusList;

    /**
     * Get 定时任务ID列表。 
     * @return ActionTimerIds 定时任务ID列表。
     */
    public String [] getActionTimerIds() {
        return this.ActionTimerIds;
    }

    /**
     * Set 定时任务ID列表。
     * @param ActionTimerIds 定时任务ID列表。
     */
    public void setActionTimerIds(String [] ActionTimerIds) {
        this.ActionTimerIds = ActionTimerIds;
    }

    /**
     * Get 按照一个或者多个实例ID查询。 
     * @return InstanceIds 按照一个或者多个实例ID查询。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 按照一个或者多个实例ID查询。
     * @param InstanceIds 按照一个或者多个实例ID查询。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

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
     * Get 执行时间的结束范围，用于条件筛选，格式如2018-05-01 19:00:00。 
     * @return EndActionTime 执行时间的结束范围，用于条件筛选，格式如2018-05-01 19:00:00。
     */
    public String getEndActionTime() {
        return this.EndActionTime;
    }

    /**
     * Set 执行时间的结束范围，用于条件筛选，格式如2018-05-01 19:00:00。
     * @param EndActionTime 执行时间的结束范围，用于条件筛选，格式如2018-05-01 19:00:00。
     */
    public void setEndActionTime(String EndActionTime) {
        this.EndActionTime = EndActionTime;
    }

    /**
     * Get 执行时间的开始范围，用于条件筛选，格式如2018-05-01 19:00:00。 
     * @return StartActionTime 执行时间的开始范围，用于条件筛选，格式如2018-05-01 19:00:00。
     */
    public String getStartActionTime() {
        return this.StartActionTime;
    }

    /**
     * Set 执行时间的开始范围，用于条件筛选，格式如2018-05-01 19:00:00。
     * @param StartActionTime 执行时间的开始范围，用于条件筛选，格式如2018-05-01 19:00:00。
     */
    public void setStartActionTime(String StartActionTime) {
        this.StartActionTime = StartActionTime;
    }

    /**
     * Get 定时任务状态列表。<br><li>UNDO：未执行</li> <br><li>DOING：正在执行</li><br><li>DONE：执行完成。</li> 
     * @return StatusList 定时任务状态列表。<br><li>UNDO：未执行</li> <br><li>DOING：正在执行</li><br><li>DONE：执行完成。</li>
     */
    public String [] getStatusList() {
        return this.StatusList;
    }

    /**
     * Set 定时任务状态列表。<br><li>UNDO：未执行</li> <br><li>DOING：正在执行</li><br><li>DONE：执行完成。</li>
     * @param StatusList 定时任务状态列表。<br><li>UNDO：未执行</li> <br><li>DOING：正在执行</li><br><li>DONE：执行完成。</li>
     */
    public void setStatusList(String [] StatusList) {
        this.StatusList = StatusList;
    }

    public DescribeInstancesActionTimerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesActionTimerRequest(DescribeInstancesActionTimerRequest source) {
        if (source.ActionTimerIds != null) {
            this.ActionTimerIds = new String[source.ActionTimerIds.length];
            for (int i = 0; i < source.ActionTimerIds.length; i++) {
                this.ActionTimerIds[i] = new String(source.ActionTimerIds[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.TimerAction != null) {
            this.TimerAction = new String(source.TimerAction);
        }
        if (source.EndActionTime != null) {
            this.EndActionTime = new String(source.EndActionTime);
        }
        if (source.StartActionTime != null) {
            this.StartActionTime = new String(source.StartActionTime);
        }
        if (source.StatusList != null) {
            this.StatusList = new String[source.StatusList.length];
            for (int i = 0; i < source.StatusList.length; i++) {
                this.StatusList[i] = new String(source.StatusList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ActionTimerIds.", this.ActionTimerIds);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "TimerAction", this.TimerAction);
        this.setParamSimple(map, prefix + "EndActionTime", this.EndActionTime);
        this.setParamSimple(map, prefix + "StartActionTime", this.StartActionTime);
        this.setParamArraySimple(map, prefix + "StatusList.", this.StatusList);

    }
}

