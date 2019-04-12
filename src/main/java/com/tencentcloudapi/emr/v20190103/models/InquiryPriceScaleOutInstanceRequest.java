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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceScaleOutInstanceRequest  extends AbstractModel{

    /**
    * 时间单位。s:按量用例单位。m:包年包月用例单位
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 时间长度。按量用例长度为3600。
    */
    @SerializedName("TimeSpan")
    @Expose
    private Integer TimeSpan;

    /**
    * Zone ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Integer ZoneId;

    /**
    * 计费类型
    */
    @SerializedName("PayMode")
    @Expose
    private Integer PayMode;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 扩容Core节点个数
    */
    @SerializedName("CoreCount")
    @Expose
    private Integer CoreCount;

    /**
    * 扩容Task节点个数
    */
    @SerializedName("TaskCount")
    @Expose
    private Integer TaskCount;

    /**
    * 货币种类
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
     * 获取时间单位。s:按量用例单位。m:包年包月用例单位
     * @return TimeUnit 时间单位。s:按量用例单位。m:包年包月用例单位
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * 设置时间单位。s:按量用例单位。m:包年包月用例单位
     * @param TimeUnit 时间单位。s:按量用例单位。m:包年包月用例单位
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * 获取时间长度。按量用例长度为3600。
     * @return TimeSpan 时间长度。按量用例长度为3600。
     */
    public Integer getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * 设置时间长度。按量用例长度为3600。
     * @param TimeSpan 时间长度。按量用例长度为3600。
     */
    public void setTimeSpan(Integer TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * 获取Zone ID
     * @return ZoneId Zone ID
     */
    public Integer getZoneId() {
        return this.ZoneId;
    }

    /**
     * 设置Zone ID
     * @param ZoneId Zone ID
     */
    public void setZoneId(Integer ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * 获取计费类型
     * @return PayMode 计费类型
     */
    public Integer getPayMode() {
        return this.PayMode;
    }

    /**
     * 设置计费类型
     * @param PayMode 计费类型
     */
    public void setPayMode(Integer PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * 获取实例ID
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取扩容Core节点个数
     * @return CoreCount 扩容Core节点个数
     */
    public Integer getCoreCount() {
        return this.CoreCount;
    }

    /**
     * 设置扩容Core节点个数
     * @param CoreCount 扩容Core节点个数
     */
    public void setCoreCount(Integer CoreCount) {
        this.CoreCount = CoreCount;
    }

    /**
     * 获取扩容Task节点个数
     * @return TaskCount 扩容Task节点个数
     */
    public Integer getTaskCount() {
        return this.TaskCount;
    }

    /**
     * 设置扩容Task节点个数
     * @param TaskCount 扩容Task节点个数
     */
    public void setTaskCount(Integer TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * 获取货币种类
     * @return Currency 货币种类
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * 设置货币种类
     * @param Currency 货币种类
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CoreCount", this.CoreCount);
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "Currency", this.Currency);

    }
}

