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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FenceBindDeviceItem extends AbstractModel{

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 告警条件(In，进围栏报警；Out，出围栏报警；InOrOut，进围栏或者出围栏均报警)
    */
    @SerializedName("AlertCondition")
    @Expose
    private String AlertCondition;

    /**
    * 是否使能围栏(true，使能；false，禁用)
    */
    @SerializedName("FenceEnable")
    @Expose
    private Boolean FenceEnable;

    /**
    * 告警处理方法
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 告警条件(In，进围栏报警；Out，出围栏报警；InOrOut，进围栏或者出围栏均报警) 
     * @return AlertCondition 告警条件(In，进围栏报警；Out，出围栏报警；InOrOut，进围栏或者出围栏均报警)
     */
    public String getAlertCondition() {
        return this.AlertCondition;
    }

    /**
     * Set 告警条件(In，进围栏报警；Out，出围栏报警；InOrOut，进围栏或者出围栏均报警)
     * @param AlertCondition 告警条件(In，进围栏报警；Out，出围栏报警；InOrOut，进围栏或者出围栏均报警)
     */
    public void setAlertCondition(String AlertCondition) {
        this.AlertCondition = AlertCondition;
    }

    /**
     * Get 是否使能围栏(true，使能；false，禁用) 
     * @return FenceEnable 是否使能围栏(true，使能；false，禁用)
     */
    public Boolean getFenceEnable() {
        return this.FenceEnable;
    }

    /**
     * Set 是否使能围栏(true，使能；false，禁用)
     * @param FenceEnable 是否使能围栏(true，使能；false，禁用)
     */
    public void setFenceEnable(Boolean FenceEnable) {
        this.FenceEnable = FenceEnable;
    }

    /**
     * Get 告警处理方法 
     * @return Method 告警处理方法
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 告警处理方法
     * @param Method 告警处理方法
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    public FenceBindDeviceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FenceBindDeviceItem(FenceBindDeviceItem source) {
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.AlertCondition != null) {
            this.AlertCondition = new String(source.AlertCondition);
        }
        if (source.FenceEnable != null) {
            this.FenceEnable = new Boolean(source.FenceEnable);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "AlertCondition", this.AlertCondition);
        this.setParamSimple(map, prefix + "FenceEnable", this.FenceEnable);
        this.setParamSimple(map, prefix + "Method", this.Method);

    }
}

