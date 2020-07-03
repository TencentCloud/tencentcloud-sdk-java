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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBasicDDoSAlarmThresholdRequest extends AbstractModel{

    /**
    * 大禹子产品代号（basic表示DDoS基础防护）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * =get表示读取告警阈值；=set表示设置告警阈值；
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 可选，告警阈值类型，1-入流量，2-清洗流量；当Method为set时必须填写；
    */
    @SerializedName("AlarmType")
    @Expose
    private Long AlarmType;

    /**
    * 可选，告警阈值，当Method为set时必须填写；当设置阈值为0时表示清除告警阈值配置；
    */
    @SerializedName("AlarmThreshold")
    @Expose
    private Long AlarmThreshold;

    /**
     * Get 大禹子产品代号（basic表示DDoS基础防护） 
     * @return Business 大禹子产品代号（basic表示DDoS基础防护）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（basic表示DDoS基础防护）
     * @param Business 大禹子产品代号（basic表示DDoS基础防护）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get =get表示读取告警阈值；=set表示设置告警阈值； 
     * @return Method =get表示读取告警阈值；=set表示设置告警阈值；
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set =get表示读取告警阈值；=set表示设置告警阈值；
     * @param Method =get表示读取告警阈值；=set表示设置告警阈值；
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 可选，告警阈值类型，1-入流量，2-清洗流量；当Method为set时必须填写； 
     * @return AlarmType 可选，告警阈值类型，1-入流量，2-清洗流量；当Method为set时必须填写；
     */
    public Long getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set 可选，告警阈值类型，1-入流量，2-清洗流量；当Method为set时必须填写；
     * @param AlarmType 可选，告警阈值类型，1-入流量，2-清洗流量；当Method为set时必须填写；
     */
    public void setAlarmType(Long AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get 可选，告警阈值，当Method为set时必须填写；当设置阈值为0时表示清除告警阈值配置； 
     * @return AlarmThreshold 可选，告警阈值，当Method为set时必须填写；当设置阈值为0时表示清除告警阈值配置；
     */
    public Long getAlarmThreshold() {
        return this.AlarmThreshold;
    }

    /**
     * Set 可选，告警阈值，当Method为set时必须填写；当设置阈值为0时表示清除告警阈值配置；
     * @param AlarmThreshold 可选，告警阈值，当Method为set时必须填写；当设置阈值为0时表示清除告警阈值配置；
     */
    public void setAlarmThreshold(Long AlarmThreshold) {
        this.AlarmThreshold = AlarmThreshold;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "AlarmThreshold", this.AlarmThreshold);

    }
}

