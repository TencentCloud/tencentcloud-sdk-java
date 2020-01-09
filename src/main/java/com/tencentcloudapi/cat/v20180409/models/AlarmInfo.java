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

public class AlarmInfo extends AbstractModel{

    /**
    * 告警对象的名称
    */
    @SerializedName("ObjName")
    @Expose
    private String ObjName;

    /**
    * 告警发生的时间
    */
    @SerializedName("FirstOccurTime")
    @Expose
    private String FirstOccurTime;

    /**
    * 告警结束的时间
    */
    @SerializedName("LastOccurTime")
    @Expose
    private String LastOccurTime;

    /**
    * 告警状态。1 表示已恢复，0 表示未恢复，2表示数据不足
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 告警的内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 拨测任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 特征项名字
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 特征项数值
    */
    @SerializedName("MetricValue")
    @Expose
    private String MetricValue;

    /**
    * 告警对象的ID
    */
    @SerializedName("ObjId")
    @Expose
    private String ObjId;

    /**
     * Get 告警对象的名称 
     * @return ObjName 告警对象的名称
     */
    public String getObjName() {
        return this.ObjName;
    }

    /**
     * Set 告警对象的名称
     * @param ObjName 告警对象的名称
     */
    public void setObjName(String ObjName) {
        this.ObjName = ObjName;
    }

    /**
     * Get 告警发生的时间 
     * @return FirstOccurTime 告警发生的时间
     */
    public String getFirstOccurTime() {
        return this.FirstOccurTime;
    }

    /**
     * Set 告警发生的时间
     * @param FirstOccurTime 告警发生的时间
     */
    public void setFirstOccurTime(String FirstOccurTime) {
        this.FirstOccurTime = FirstOccurTime;
    }

    /**
     * Get 告警结束的时间 
     * @return LastOccurTime 告警结束的时间
     */
    public String getLastOccurTime() {
        return this.LastOccurTime;
    }

    /**
     * Set 告警结束的时间
     * @param LastOccurTime 告警结束的时间
     */
    public void setLastOccurTime(String LastOccurTime) {
        this.LastOccurTime = LastOccurTime;
    }

    /**
     * Get 告警状态。1 表示已恢复，0 表示未恢复，2表示数据不足 
     * @return Status 告警状态。1 表示已恢复，0 表示未恢复，2表示数据不足
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 告警状态。1 表示已恢复，0 表示未恢复，2表示数据不足
     * @param Status 告警状态。1 表示已恢复，0 表示未恢复，2表示数据不足
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 告警的内容 
     * @return Content 告警的内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 告警的内容
     * @param Content 告警的内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 拨测任务ID 
     * @return TaskId 拨测任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 拨测任务ID
     * @param TaskId 拨测任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 特征项名字 
     * @return MetricName 特征项名字
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 特征项名字
     * @param MetricName 特征项名字
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 特征项数值 
     * @return MetricValue 特征项数值
     */
    public String getMetricValue() {
        return this.MetricValue;
    }

    /**
     * Set 特征项数值
     * @param MetricValue 特征项数值
     */
    public void setMetricValue(String MetricValue) {
        this.MetricValue = MetricValue;
    }

    /**
     * Get 告警对象的ID 
     * @return ObjId 告警对象的ID
     */
    public String getObjId() {
        return this.ObjId;
    }

    /**
     * Set 告警对象的ID
     * @param ObjId 告警对象的ID
     */
    public void setObjId(String ObjId) {
        this.ObjId = ObjId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjName", this.ObjName);
        this.setParamSimple(map, prefix + "FirstOccurTime", this.FirstOccurTime);
        this.setParamSimple(map, prefix + "LastOccurTime", this.LastOccurTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "MetricValue", this.MetricValue);
        this.setParamSimple(map, prefix + "ObjId", this.ObjId);

    }
}

