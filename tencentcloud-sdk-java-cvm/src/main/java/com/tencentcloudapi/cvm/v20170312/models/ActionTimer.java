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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActionTimer extends AbstractModel{

    /**
    * 扩展数据
    */
    @SerializedName("Externals")
    @Expose
    private Externals Externals;

    /**
    * 定时器名称，目前仅支持销毁一个值：TerminateInstances。
    */
    @SerializedName("TimerAction")
    @Expose
    private String TimerAction;

    /**
    * 执行时间，格式形如：2018-5-29 11:26:40,执行时间必须大于当前时间5分钟。
    */
    @SerializedName("ActionTime")
    @Expose
    private String ActionTime;

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
     * Get 定时器名称，目前仅支持销毁一个值：TerminateInstances。 
     * @return TimerAction 定时器名称，目前仅支持销毁一个值：TerminateInstances。
     */
    public String getTimerAction() {
        return this.TimerAction;
    }

    /**
     * Set 定时器名称，目前仅支持销毁一个值：TerminateInstances。
     * @param TimerAction 定时器名称，目前仅支持销毁一个值：TerminateInstances。
     */
    public void setTimerAction(String TimerAction) {
        this.TimerAction = TimerAction;
    }

    /**
     * Get 执行时间，格式形如：2018-5-29 11:26:40,执行时间必须大于当前时间5分钟。 
     * @return ActionTime 执行时间，格式形如：2018-5-29 11:26:40,执行时间必须大于当前时间5分钟。
     */
    public String getActionTime() {
        return this.ActionTime;
    }

    /**
     * Set 执行时间，格式形如：2018-5-29 11:26:40,执行时间必须大于当前时间5分钟。
     * @param ActionTime 执行时间，格式形如：2018-5-29 11:26:40,执行时间必须大于当前时间5分钟。
     */
    public void setActionTime(String ActionTime) {
        this.ActionTime = ActionTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Externals.", this.Externals);
        this.setParamSimple(map, prefix + "TimerAction", this.TimerAction);
        this.setParamSimple(map, prefix + "ActionTime", this.ActionTime);

    }
}

