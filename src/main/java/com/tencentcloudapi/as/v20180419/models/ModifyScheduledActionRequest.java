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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyScheduledActionRequest  extends AbstractModel{

    /**
    * 待修改的定时任务ID
    */
    @SerializedName("ScheduledActionId")
    @Expose
    private String ScheduledActionId;

    /**
    * 定时任务名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。同一伸缩组下必须唯一。
    */
    @SerializedName("ScheduledActionName")
    @Expose
    private String ScheduledActionName;

    /**
    * 当定时任务触发时，设置的伸缩组最大实例数。
    */
    @SerializedName("MaxSize")
    @Expose
    private Integer MaxSize;

    /**
    * 当定时任务触发时，设置的伸缩组最小实例数。
    */
    @SerializedName("MinSize")
    @Expose
    private Integer MinSize;

    /**
    * 当定时任务触发时，设置的伸缩组期望实例数。
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Integer DesiredCapacity;

    /**
    * 定时任务的首次触发时间，取值为`北京时间`（UTC+8），按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ss+08:00`。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 定时任务的结束时间，取值为`北京时间`（UTC+8），按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ss+08:00`。<br>此参数与`Recurrence`需要同时指定，到达结束时间之后，定时任务将不再生效。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 定时任务的重复方式。为标准 Cron 格式<br>此参数与`EndTime`需要同时指定。
    */
    @SerializedName("Recurrence")
    @Expose
    private String Recurrence;

    /**
     * 获取待修改的定时任务ID
     * @return ScheduledActionId 待修改的定时任务ID
     */
    public String getScheduledActionId() {
        return this.ScheduledActionId;
    }

    /**
     * 设置待修改的定时任务ID
     * @param ScheduledActionId 待修改的定时任务ID
     */
    public void setScheduledActionId(String ScheduledActionId) {
        this.ScheduledActionId = ScheduledActionId;
    }

    /**
     * 获取定时任务名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。同一伸缩组下必须唯一。
     * @return ScheduledActionName 定时任务名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。同一伸缩组下必须唯一。
     */
    public String getScheduledActionName() {
        return this.ScheduledActionName;
    }

    /**
     * 设置定时任务名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。同一伸缩组下必须唯一。
     * @param ScheduledActionName 定时任务名称。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超60个字节。同一伸缩组下必须唯一。
     */
    public void setScheduledActionName(String ScheduledActionName) {
        this.ScheduledActionName = ScheduledActionName;
    }

    /**
     * 获取当定时任务触发时，设置的伸缩组最大实例数。
     * @return MaxSize 当定时任务触发时，设置的伸缩组最大实例数。
     */
    public Integer getMaxSize() {
        return this.MaxSize;
    }

    /**
     * 设置当定时任务触发时，设置的伸缩组最大实例数。
     * @param MaxSize 当定时任务触发时，设置的伸缩组最大实例数。
     */
    public void setMaxSize(Integer MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * 获取当定时任务触发时，设置的伸缩组最小实例数。
     * @return MinSize 当定时任务触发时，设置的伸缩组最小实例数。
     */
    public Integer getMinSize() {
        return this.MinSize;
    }

    /**
     * 设置当定时任务触发时，设置的伸缩组最小实例数。
     * @param MinSize 当定时任务触发时，设置的伸缩组最小实例数。
     */
    public void setMinSize(Integer MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * 获取当定时任务触发时，设置的伸缩组期望实例数。
     * @return DesiredCapacity 当定时任务触发时，设置的伸缩组期望实例数。
     */
    public Integer getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * 设置当定时任务触发时，设置的伸缩组期望实例数。
     * @param DesiredCapacity 当定时任务触发时，设置的伸缩组期望实例数。
     */
    public void setDesiredCapacity(Integer DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * 获取定时任务的首次触发时间，取值为`北京时间`（UTC+8），按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ss+08:00`。
     * @return StartTime 定时任务的首次触发时间，取值为`北京时间`（UTC+8），按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ss+08:00`。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置定时任务的首次触发时间，取值为`北京时间`（UTC+8），按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ss+08:00`。
     * @param StartTime 定时任务的首次触发时间，取值为`北京时间`（UTC+8），按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ss+08:00`。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取定时任务的结束时间，取值为`北京时间`（UTC+8），按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ss+08:00`。<br>此参数与`Recurrence`需要同时指定，到达结束时间之后，定时任务将不再生效。
     * @return EndTime 定时任务的结束时间，取值为`北京时间`（UTC+8），按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ss+08:00`。<br>此参数与`Recurrence`需要同时指定，到达结束时间之后，定时任务将不再生效。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置定时任务的结束时间，取值为`北京时间`（UTC+8），按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ss+08:00`。<br>此参数与`Recurrence`需要同时指定，到达结束时间之后，定时任务将不再生效。
     * @param EndTime 定时任务的结束时间，取值为`北京时间`（UTC+8），按照`ISO8601`标准，格式：`YYYY-MM-DDThh:mm:ss+08:00`。<br>此参数与`Recurrence`需要同时指定，到达结束时间之后，定时任务将不再生效。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取定时任务的重复方式。为标准 Cron 格式<br>此参数与`EndTime`需要同时指定。
     * @return Recurrence 定时任务的重复方式。为标准 Cron 格式<br>此参数与`EndTime`需要同时指定。
     */
    public String getRecurrence() {
        return this.Recurrence;
    }

    /**
     * 设置定时任务的重复方式。为标准 Cron 格式<br>此参数与`EndTime`需要同时指定。
     * @param Recurrence 定时任务的重复方式。为标准 Cron 格式<br>此参数与`EndTime`需要同时指定。
     */
    public void setRecurrence(String Recurrence) {
        this.Recurrence = Recurrence;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduledActionId", this.ScheduledActionId);
        this.setParamSimple(map, prefix + "ScheduledActionName", this.ScheduledActionName);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Recurrence", this.Recurrence);

    }
}

