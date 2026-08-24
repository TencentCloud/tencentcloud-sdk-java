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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnhancedService extends AbstractModel {

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
    private RunSecurityServiceEnabled MonitorService;

    /**
    * 安装 tat-agent。若不指定该参数，则默认逻辑与 CVM 控制台一致：境外地域不安装、境内非 GPU 机型默认安装、境内 GPU 机型默认不安装。
    */
    @SerializedName("AutomationService")
    @Expose
    private AutomationServiceEnabled AutomationService;

    /**
    * 开启基础服务。
    */
    @SerializedName("BasicService")
    @Expose
    private BasicServicesSettings BasicService;

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
    public RunSecurityServiceEnabled getMonitorService() {
        return this.MonitorService;
    }

    /**
     * Set 开启云监控服务。若不指定该参数，则默认开启云监控服务。
     * @param MonitorService 开启云监控服务。若不指定该参数，则默认开启云监控服务。
     */
    public void setMonitorService(RunSecurityServiceEnabled MonitorService) {
        this.MonitorService = MonitorService;
    }

    /**
     * Get 安装 tat-agent。若不指定该参数，则默认逻辑与 CVM 控制台一致：境外地域不安装、境内非 GPU 机型默认安装、境内 GPU 机型默认不安装。 
     * @return AutomationService 安装 tat-agent。若不指定该参数，则默认逻辑与 CVM 控制台一致：境外地域不安装、境内非 GPU 机型默认安装、境内 GPU 机型默认不安装。
     */
    public AutomationServiceEnabled getAutomationService() {
        return this.AutomationService;
    }

    /**
     * Set 安装 tat-agent。若不指定该参数，则默认逻辑与 CVM 控制台一致：境外地域不安装、境内非 GPU 机型默认安装、境内 GPU 机型默认不安装。
     * @param AutomationService 安装 tat-agent。若不指定该参数，则默认逻辑与 CVM 控制台一致：境外地域不安装、境内非 GPU 机型默认安装、境内 GPU 机型默认不安装。
     */
    public void setAutomationService(AutomationServiceEnabled AutomationService) {
        this.AutomationService = AutomationService;
    }

    /**
     * Get 开启基础服务。 
     * @return BasicService 开启基础服务。
     */
    public BasicServicesSettings getBasicService() {
        return this.BasicService;
    }

    /**
     * Set 开启基础服务。
     * @param BasicService 开启基础服务。
     */
    public void setBasicService(BasicServicesSettings BasicService) {
        this.BasicService = BasicService;
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
            this.MonitorService = new RunSecurityServiceEnabled(source.MonitorService);
        }
        if (source.AutomationService != null) {
            this.AutomationService = new AutomationServiceEnabled(source.AutomationService);
        }
        if (source.BasicService != null) {
            this.BasicService = new BasicServicesSettings(source.BasicService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SecurityService.", this.SecurityService);
        this.setParamObj(map, prefix + "MonitorService.", this.MonitorService);
        this.setParamObj(map, prefix + "AutomationService.", this.AutomationService);
        this.setParamObj(map, prefix + "BasicService.", this.BasicService);

    }
}

