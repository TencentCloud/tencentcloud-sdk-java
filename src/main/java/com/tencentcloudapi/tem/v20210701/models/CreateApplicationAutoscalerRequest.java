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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApplicationAutoscalerRequest extends AbstractModel {

    /**
    * 服务id
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 环境ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 弹性伸缩策略
    */
    @SerializedName("Autoscaler")
    @Expose
    private Autoscaler Autoscaler;

    /**
    * 来源渠道
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
     * Get 服务id 
     * @return ApplicationId 服务id
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 服务id
     * @param ApplicationId 服务id
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 环境ID 
     * @return EnvironmentId 环境ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境ID
     * @param EnvironmentId 环境ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 弹性伸缩策略 
     * @return Autoscaler 弹性伸缩策略
     */
    public Autoscaler getAutoscaler() {
        return this.Autoscaler;
    }

    /**
     * Set 弹性伸缩策略
     * @param Autoscaler 弹性伸缩策略
     */
    public void setAutoscaler(Autoscaler Autoscaler) {
        this.Autoscaler = Autoscaler;
    }

    /**
     * Get 来源渠道 
     * @return SourceChannel 来源渠道
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set 来源渠道
     * @param SourceChannel 来源渠道
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    public CreateApplicationAutoscalerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApplicationAutoscalerRequest(CreateApplicationAutoscalerRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Autoscaler != null) {
            this.Autoscaler = new Autoscaler(source.Autoscaler);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamObj(map, prefix + "Autoscaler.", this.Autoscaler);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);

    }
}

