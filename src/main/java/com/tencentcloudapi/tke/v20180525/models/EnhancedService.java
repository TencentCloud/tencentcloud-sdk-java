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

public class EnhancedService extends AbstractModel{

    /**
    * 开启云安全服务。若不指定该参数，则默认开启云安全服务。
    */
    @SerializedName("SecurityService")
    @Expose
    private RunSecurityServiceEnabled SecurityService;

    /**
    * 开启云监控服务。若不指定该参数，则默认开启云监控服务。
    */
    @SerializedName("MonitorService")
    @Expose
    private RunMonitorServiceEnabled MonitorService;

    /**
    * 开启云自动化助手服务。若不指定该参数，则默认不开启云自动化助手服务。
    */
    @SerializedName("AutomationService")
    @Expose
    private RunAutomationServiceEnabled AutomationService;

    /**
     * Get 开启云安全服务。若不指定该参数，则默认开启云安全服务。 
     * @return SecurityService 开启云安全服务。若不指定该参数，则默认开启云安全服务。
     */
    public RunSecurityServiceEnabled getSecurityService() {
        return this.SecurityService;
    }

    /**
     * Set 开启云安全服务。若不指定该参数，则默认开启云安全服务。
     * @param SecurityService 开启云安全服务。若不指定该参数，则默认开启云安全服务。
     */
    public void setSecurityService(RunSecurityServiceEnabled SecurityService) {
        this.SecurityService = SecurityService;
    }

    /**
     * Get 开启云监控服务。若不指定该参数，则默认开启云监控服务。 
     * @return MonitorService 开启云监控服务。若不指定该参数，则默认开启云监控服务。
     */
    public RunMonitorServiceEnabled getMonitorService() {
        return this.MonitorService;
    }

    /**
     * Set 开启云监控服务。若不指定该参数，则默认开启云监控服务。
     * @param MonitorService 开启云监控服务。若不指定该参数，则默认开启云监控服务。
     */
    public void setMonitorService(RunMonitorServiceEnabled MonitorService) {
        this.MonitorService = MonitorService;
    }

    /**
     * Get 开启云自动化助手服务。若不指定该参数，则默认不开启云自动化助手服务。 
     * @return AutomationService 开启云自动化助手服务。若不指定该参数，则默认不开启云自动化助手服务。
     */
    public RunAutomationServiceEnabled getAutomationService() {
        return this.AutomationService;
    }

    /**
     * Set 开启云自动化助手服务。若不指定该参数，则默认不开启云自动化助手服务。
     * @param AutomationService 开启云自动化助手服务。若不指定该参数，则默认不开启云自动化助手服务。
     */
    public void setAutomationService(RunAutomationServiceEnabled AutomationService) {
        this.AutomationService = AutomationService;
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
        if (source.AutomationService != null) {
            this.AutomationService = new RunAutomationServiceEnabled(source.AutomationService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SecurityService.", this.SecurityService);
        this.setParamObj(map, prefix + "MonitorService.", this.MonitorService);
        this.setParamObj(map, prefix + "AutomationService.", this.AutomationService);

    }
}

