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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAlarmPloicyRequest extends AbstractModel{

    /**
    * 正整数。拨测任务id
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 持续周期。值为任务的Period 乘以0、1、2、3、4。单位：分钟
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 目前取值仅支持 lt (小于)。
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
    * 门限百分比。比如：80，表示80%。成功率低于80%时告警。
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * 告警接收组的id。参见： DescribeAlarmGroups 接口。从返回结果里的GroupId 中选取一个。
    */
    @SerializedName("ReceiverGroupId")
    @Expose
    private Long ReceiverGroupId;

    /**
     * Get 正整数。拨测任务id 
     * @return TaskId 正整数。拨测任务id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 正整数。拨测任务id
     * @param TaskId 正整数。拨测任务id
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 持续周期。值为任务的Period 乘以0、1、2、3、4。单位：分钟 
     * @return Interval 持续周期。值为任务的Period 乘以0、1、2、3、4。单位：分钟
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 持续周期。值为任务的Period 乘以0、1、2、3、4。单位：分钟
     * @param Interval 持续周期。值为任务的Period 乘以0、1、2、3、4。单位：分钟
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 目前取值仅支持 lt (小于)。 
     * @return Operate 目前取值仅支持 lt (小于)。
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set 目前取值仅支持 lt (小于)。
     * @param Operate 目前取值仅支持 lt (小于)。
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * Get 门限百分比。比如：80，表示80%。成功率低于80%时告警。 
     * @return Threshold 门限百分比。比如：80，表示80%。成功率低于80%时告警。
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 门限百分比。比如：80，表示80%。成功率低于80%时告警。
     * @param Threshold 门限百分比。比如：80，表示80%。成功率低于80%时告警。
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get 告警接收组的id。参见： DescribeAlarmGroups 接口。从返回结果里的GroupId 中选取一个。 
     * @return ReceiverGroupId 告警接收组的id。参见： DescribeAlarmGroups 接口。从返回结果里的GroupId 中选取一个。
     */
    public Long getReceiverGroupId() {
        return this.ReceiverGroupId;
    }

    /**
     * Set 告警接收组的id。参见： DescribeAlarmGroups 接口。从返回结果里的GroupId 中选取一个。
     * @param ReceiverGroupId 告警接收组的id。参见： DescribeAlarmGroups 接口。从返回结果里的GroupId 中选取一个。
     */
    public void setReceiverGroupId(Long ReceiverGroupId) {
        this.ReceiverGroupId = ReceiverGroupId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "ReceiverGroupId", this.ReceiverGroupId);

    }
}

