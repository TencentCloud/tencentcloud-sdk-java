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

public class ModifyTracingConfigRequest extends AbstractModel{

    /**
    * mesh名字
    */
    @SerializedName("MeshId")
    @Expose
    private String MeshId;

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
    * 调用跟踪采样值
    */
    @SerializedName("Sampling")
    @Expose
    private Float Sampling;

    /**
    * 调用追踪Zipkin相关配置
    */
    @SerializedName("Zipkin")
    @Expose
    private TracingZipkin Zipkin;

    /**
     * Get mesh名字 
     * @return MeshId mesh名字
     */
    public String getMeshId() {
        return this.MeshId;
    }

    /**
     * Set mesh名字
     * @param MeshId mesh名字
     */
    public void setMeshId(String MeshId) {
        this.MeshId = MeshId;
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
     * Get 调用跟踪采样值 
     * @return Sampling 调用跟踪采样值
     */
    public Float getSampling() {
        return this.Sampling;
    }

    /**
     * Set 调用跟踪采样值
     * @param Sampling 调用跟踪采样值
     */
    public void setSampling(Float Sampling) {
        this.Sampling = Sampling;
    }

    /**
     * Get 调用追踪Zipkin相关配置 
     * @return Zipkin 调用追踪Zipkin相关配置
     */
    public TracingZipkin getZipkin() {
        return this.Zipkin;
    }

    /**
     * Set 调用追踪Zipkin相关配置
     * @param Zipkin 调用追踪Zipkin相关配置
     */
    public void setZipkin(TracingZipkin Zipkin) {
        this.Zipkin = Zipkin;
    }

    public ModifyTracingConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTracingConfigRequest(ModifyTracingConfigRequest source) {
        if (source.MeshId != null) {
            this.MeshId = new String(source.MeshId);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.APM != null) {
            this.APM = new APM(source.APM);
        }
        if (source.Sampling != null) {
            this.Sampling = new Float(source.Sampling);
        }
        if (source.Zipkin != null) {
            this.Zipkin = new TracingZipkin(source.Zipkin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MeshId", this.MeshId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamObj(map, prefix + "APM.", this.APM);
        this.setParamSimple(map, prefix + "Sampling", this.Sampling);
        this.setParamObj(map, prefix + "Zipkin.", this.Zipkin);

    }
}

