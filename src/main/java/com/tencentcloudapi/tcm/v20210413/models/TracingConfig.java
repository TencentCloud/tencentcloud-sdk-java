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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TracingConfig extends AbstractModel{

    /**
    * 调用链采样率，百分比
    */
    @SerializedName("Sampling")
    @Expose
    private Float Sampling;

    /**
    * 是否启用调用跟踪
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 腾讯云 APM 服务相关参数
    */
    @SerializedName("APM")
    @Expose
    private APM APM;

    /**
    * 启动第三方服务器的地址
    */
    @SerializedName("Zipkin")
    @Expose
    private TracingZipkin Zipkin;

    /**
     * Get 调用链采样率，百分比 
     * @return Sampling 调用链采样率，百分比
     */
    public Float getSampling() {
        return this.Sampling;
    }

    /**
     * Set 调用链采样率，百分比
     * @param Sampling 调用链采样率，百分比
     */
    public void setSampling(Float Sampling) {
        this.Sampling = Sampling;
    }

    /**
     * Get 是否启用调用跟踪 
     * @return Enable 是否启用调用跟踪
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用调用跟踪
     * @param Enable 是否启用调用跟踪
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 腾讯云 APM 服务相关参数 
     * @return APM 腾讯云 APM 服务相关参数
     */
    public APM getAPM() {
        return this.APM;
    }

    /**
     * Set 腾讯云 APM 服务相关参数
     * @param APM 腾讯云 APM 服务相关参数
     */
    public void setAPM(APM APM) {
        this.APM = APM;
    }

    /**
     * Get 启动第三方服务器的地址 
     * @return Zipkin 启动第三方服务器的地址
     */
    public TracingZipkin getZipkin() {
        return this.Zipkin;
    }

    /**
     * Set 启动第三方服务器的地址
     * @param Zipkin 启动第三方服务器的地址
     */
    public void setZipkin(TracingZipkin Zipkin) {
        this.Zipkin = Zipkin;
    }

    public TracingConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TracingConfig(TracingConfig source) {
        if (source.Sampling != null) {
            this.Sampling = new Float(source.Sampling);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.APM != null) {
            this.APM = new APM(source.APM);
        }
        if (source.Zipkin != null) {
            this.Zipkin = new TracingZipkin(source.Zipkin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sampling", this.Sampling);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamObj(map, prefix + "APM.", this.APM);
        this.setParamObj(map, prefix + "Zipkin.", this.Zipkin);

    }
}

