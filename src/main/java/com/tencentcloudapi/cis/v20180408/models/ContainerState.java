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
package com.tencentcloudapi.cis.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerState  extends AbstractModel{

    /**
    * 容器运行开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 容器状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 状态详情
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 容器运行结束时间
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 容器运行退出码
    */
    @SerializedName("ExitCode")
    @Expose
    private Integer ExitCode;

    /**
     * 获取容器运行开始时间
     * @return StartTime 容器运行开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置容器运行开始时间
     * @param StartTime 容器运行开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取容器状态
     * @return State 容器状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * 设置容器状态
     * @param State 容器状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * 获取状态详情
     * @return Reason 状态详情
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * 设置状态详情
     * @param Reason 状态详情
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * 获取容器运行结束时间
     * @return FinishTime 容器运行结束时间
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * 设置容器运行结束时间
     * @param FinishTime 容器运行结束时间
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * 获取容器运行退出码
     * @return ExitCode 容器运行退出码
     */
    public Integer getExitCode() {
        return this.ExitCode;
    }

    /**
     * 设置容器运行退出码
     * @param ExitCode 容器运行退出码
     */
    public void setExitCode(Integer ExitCode) {
        this.ExitCode = ExitCode;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "ExitCode", this.ExitCode);

    }
}

