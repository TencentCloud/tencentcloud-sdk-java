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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ECMEnhancedService extends AbstractModel{

    /**
    * 是否开启云监控服务
    */
    @SerializedName("SecurityService")
    @Expose
    private ECMRunMonitorServiceEnabled SecurityService;

    /**
    * 是否开启云镜服务
    */
    @SerializedName("MonitorService")
    @Expose
    private ECMRunSecurityServiceEnabled MonitorService;

    /**
     * Get 是否开启云监控服务 
     * @return SecurityService 是否开启云监控服务
     */
    public ECMRunMonitorServiceEnabled getSecurityService() {
        return this.SecurityService;
    }

    /**
     * Set 是否开启云监控服务
     * @param SecurityService 是否开启云监控服务
     */
    public void setSecurityService(ECMRunMonitorServiceEnabled SecurityService) {
        this.SecurityService = SecurityService;
    }

    /**
     * Get 是否开启云镜服务 
     * @return MonitorService 是否开启云镜服务
     */
    public ECMRunSecurityServiceEnabled getMonitorService() {
        return this.MonitorService;
    }

    /**
     * Set 是否开启云镜服务
     * @param MonitorService 是否开启云镜服务
     */
    public void setMonitorService(ECMRunSecurityServiceEnabled MonitorService) {
        this.MonitorService = MonitorService;
    }

    public ECMEnhancedService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ECMEnhancedService(ECMEnhancedService source) {
        if (source.SecurityService != null) {
            this.SecurityService = new ECMRunMonitorServiceEnabled(source.SecurityService);
        }
        if (source.MonitorService != null) {
            this.MonitorService = new ECMRunSecurityServiceEnabled(source.MonitorService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SecurityService.", this.SecurityService);
        this.setParamObj(map, prefix + "MonitorService.", this.MonitorService);

    }
}

