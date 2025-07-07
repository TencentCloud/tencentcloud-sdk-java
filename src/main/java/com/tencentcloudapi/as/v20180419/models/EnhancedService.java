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
package com.tencentcloudapi.as.v20180419.models;

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
    private RunMonitorServiceEnabled MonitorService;

    /**
    * 该参数已废弃，查询时会返回空值，请勿使用。
    */
    @SerializedName("AutomationService")
    @Expose
    private RunAutomationServiceEnabled [] AutomationService;

    /**
    * 开启自动化助手服务。若不指定该参数，则默认逻辑与CVM保持一致。注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutomationToolsService")
    @Expose
    private RunAutomationServiceEnabled AutomationToolsService;

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
     * Get 该参数已废弃，查询时会返回空值，请勿使用。 
     * @return AutomationService 该参数已废弃，查询时会返回空值，请勿使用。
     * @deprecated
     */
    @Deprecated
    public RunAutomationServiceEnabled [] getAutomationService() {
        return this.AutomationService;
    }

    /**
     * Set 该参数已废弃，查询时会返回空值，请勿使用。
     * @param AutomationService 该参数已废弃，查询时会返回空值，请勿使用。
     * @deprecated
     */
    @Deprecated
    public void setAutomationService(RunAutomationServiceEnabled [] AutomationService) {
        this.AutomationService = AutomationService;
    }

    /**
     * Get 开启自动化助手服务。若不指定该参数，则默认逻辑与CVM保持一致。注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutomationToolsService 开启自动化助手服务。若不指定该参数，则默认逻辑与CVM保持一致。注意：此字段可能返回 null，表示取不到有效值。
     */
    public RunAutomationServiceEnabled getAutomationToolsService() {
        return this.AutomationToolsService;
    }

    /**
     * Set 开启自动化助手服务。若不指定该参数，则默认逻辑与CVM保持一致。注意：此字段可能返回 null，表示取不到有效值。
     * @param AutomationToolsService 开启自动化助手服务。若不指定该参数，则默认逻辑与CVM保持一致。注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutomationToolsService(RunAutomationServiceEnabled AutomationToolsService) {
        this.AutomationToolsService = AutomationToolsService;
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
            this.AutomationService = new RunAutomationServiceEnabled[source.AutomationService.length];
            for (int i = 0; i < source.AutomationService.length; i++) {
                this.AutomationService[i] = new RunAutomationServiceEnabled(source.AutomationService[i]);
            }
        }
        if (source.AutomationToolsService != null) {
            this.AutomationToolsService = new RunAutomationServiceEnabled(source.AutomationToolsService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SecurityService.", this.SecurityService);
        this.setParamObj(map, prefix + "MonitorService.", this.MonitorService);
        this.setParamArrayObj(map, prefix + "AutomationService.", this.AutomationService);
        this.setParamObj(map, prefix + "AutomationToolsService.", this.AutomationToolsService);

    }
}

