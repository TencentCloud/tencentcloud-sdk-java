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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceRenewDBInstanceRequest  extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 续费周期。按月续费最多48个月。默认查询续费一个月的价格
    */
    @SerializedName("Period")
    @Expose
    private Integer Period;

    /**
    * 续费周期单位。month表示按月续费，当前只支持按月付费查询价格
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

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
     * 获取续费周期。按月续费最多48个月。默认查询续费一个月的价格
     * @return Period 续费周期。按月续费最多48个月。默认查询续费一个月的价格
     */
    public Integer getPeriod() {
        return this.Period;
    }

    /**
     * 设置续费周期。按月续费最多48个月。默认查询续费一个月的价格
     * @param Period 续费周期。按月续费最多48个月。默认查询续费一个月的价格
     */
    public void setPeriod(Integer Period) {
        this.Period = Period;
    }

    /**
     * 获取续费周期单位。month表示按月续费，当前只支持按月付费查询价格
     * @return TimeUnit 续费周期单位。month表示按月续费，当前只支持按月付费查询价格
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * 设置续费周期单位。month表示按月续费，当前只支持按月付费查询价格
     * @param TimeUnit 续费周期单位。month表示按月续费，当前只支持按月付费查询价格
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);

    }
}

