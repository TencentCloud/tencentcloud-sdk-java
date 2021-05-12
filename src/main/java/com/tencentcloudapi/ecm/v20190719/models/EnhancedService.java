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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnhancedService extends AbstractModel{

    /**
    * 是否开启云镜服务。
    */
    @SerializedName("SecurityService")
    @Expose
    private RunSecurityServiceEnabled SecurityService;

    /**
    * 是否开启云监控服务。
    */
    @SerializedName("MonitorService")
    @Expose
    private RunMonitorServiceEnabled MonitorService;

    /**
    * 是否开通IP直通。若不指定该参数，则Linux镜像默认开通，windows镜像暂不支持IP直通。
    */
    @SerializedName("EIPDirectService")
    @Expose
    private RunEIPDirectServiceEnabled EIPDirectService;

    /**
     * Get 是否开启云镜服务。 
     * @return SecurityService 是否开启云镜服务。
     */
    public RunSecurityServiceEnabled getSecurityService() {
        return this.SecurityService;
    }

    /**
     * Set 是否开启云镜服务。
     * @param SecurityService 是否开启云镜服务。
     */
    public void setSecurityService(RunSecurityServiceEnabled SecurityService) {
        this.SecurityService = SecurityService;
    }

    /**
     * Get 是否开启云监控服务。 
     * @return MonitorService 是否开启云监控服务。
     */
    public RunMonitorServiceEnabled getMonitorService() {
        return this.MonitorService;
    }

    /**
     * Set 是否开启云监控服务。
     * @param MonitorService 是否开启云监控服务。
     */
    public void setMonitorService(RunMonitorServiceEnabled MonitorService) {
        this.MonitorService = MonitorService;
    }

    /**
     * Get 是否开通IP直通。若不指定该参数，则Linux镜像默认开通，windows镜像暂不支持IP直通。 
     * @return EIPDirectService 是否开通IP直通。若不指定该参数，则Linux镜像默认开通，windows镜像暂不支持IP直通。
     */
    public RunEIPDirectServiceEnabled getEIPDirectService() {
        return this.EIPDirectService;
    }

    /**
     * Set 是否开通IP直通。若不指定该参数，则Linux镜像默认开通，windows镜像暂不支持IP直通。
     * @param EIPDirectService 是否开通IP直通。若不指定该参数，则Linux镜像默认开通，windows镜像暂不支持IP直通。
     */
    public void setEIPDirectService(RunEIPDirectServiceEnabled EIPDirectService) {
        this.EIPDirectService = EIPDirectService;
    }

    public EnhancedService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnhancedService(EnhancedService source) {
        if (source.SecurityService != null) {
            this.SecurityService = new RunSecurityServiceEnabled(source.SecurityService);
        }
        if (source.MonitorService != null) {
            this.MonitorService = new RunMonitorServiceEnabled(source.MonitorService);
        }
        if (source.EIPDirectService != null) {
            this.EIPDirectService = new RunEIPDirectServiceEnabled(source.EIPDirectService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SecurityService.", this.SecurityService);
        this.setParamObj(map, prefix + "MonitorService.", this.MonitorService);
        this.setParamObj(map, prefix + "EIPDirectService.", this.EIPDirectService);

    }
}

