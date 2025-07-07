/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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

public class ModifyApplicationServiceRequest extends AbstractModel {

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
    * 来源渠道
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * 全量访问方式设置
    */
    @SerializedName("Service")
    @Expose
    private EksService Service;

    /**
    * 单条访问方式设置
    */
    @SerializedName("Data")
    @Expose
    private ServicePortMapping Data;

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

    /**
     * Get 全量访问方式设置 
     * @return Service 全量访问方式设置
     */
    public EksService getService() {
        return this.Service;
    }

    /**
     * Set 全量访问方式设置
     * @param Service 全量访问方式设置
     */
    public void setService(EksService Service) {
        this.Service = Service;
    }

    /**
     * Get 单条访问方式设置 
     * @return Data 单条访问方式设置
     */
    public ServicePortMapping getData() {
        return this.Data;
    }

    /**
     * Set 单条访问方式设置
     * @param Data 单条访问方式设置
     */
    public void setData(ServicePortMapping Data) {
        this.Data = Data;
    }

    public ModifyApplicationServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApplicationServiceRequest(ModifyApplicationServiceRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.Service != null) {
            this.Service = new EksService(source.Service);
        }
        if (source.Data != null) {
            this.Data = new ServicePortMapping(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamObj(map, prefix + "Service.", this.Service);
        this.setParamObj(map, prefix + "Data.", this.Data);

    }
}

