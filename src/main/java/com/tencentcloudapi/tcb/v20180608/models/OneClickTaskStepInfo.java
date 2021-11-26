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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OneClickTaskStepInfo extends AbstractModel{

    /**
    * 未启动："todo"
运行中："running"
失败："failed"
成功结束："finished"
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 耗时：秒
    */
    @SerializedName("CostTime")
    @Expose
    private Long CostTime;

    /**
    * 失败原因
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * 步骤名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 未启动："todo"
运行中："running"
失败："failed"
成功结束："finished" 
     * @return Status 未启动："todo"
运行中："running"
失败："failed"
成功结束："finished"
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 未启动："todo"
运行中："running"
失败："failed"
成功结束："finished"
     * @param Status 未启动："todo"
运行中："running"
失败："failed"
成功结束："finished"
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 耗时：秒 
     * @return CostTime 耗时：秒
     */
    public Long getCostTime() {
        return this.CostTime;
    }

    /**
     * Set 耗时：秒
     * @param CostTime 耗时：秒
     */
    public void setCostTime(Long CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get 失败原因 
     * @return FailReason 失败原因
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 失败原因
     * @param FailReason 失败原因
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get 步骤名 
     * @return Name 步骤名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 步骤名
     * @param Name 步骤名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public OneClickTaskStepInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OneClickTaskStepInfo(OneClickTaskStepInfo source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CostTime != null) {
            this.CostTime = new Long(source.CostTime);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

