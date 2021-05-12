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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmMetricsRequest extends AbstractModel{

    /**
    * 固定值，为"monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 监控类型过滤 "MT_QCE"=云产品监控
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * 告警策略类型，由 DescribeAllNamespaces 获得，例如 cvm_device
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * Get 固定值，为"monitor" 
     * @return Module 固定值，为"monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 固定值，为"monitor"
     * @param Module 固定值，为"monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 监控类型过滤 "MT_QCE"=云产品监控 
     * @return MonitorType 监控类型过滤 "MT_QCE"=云产品监控
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set 监控类型过滤 "MT_QCE"=云产品监控
     * @param MonitorType 监控类型过滤 "MT_QCE"=云产品监控
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get 告警策略类型，由 DescribeAllNamespaces 获得，例如 cvm_device 
     * @return Namespace 告警策略类型，由 DescribeAllNamespaces 获得，例如 cvm_device
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 告警策略类型，由 DescribeAllNamespaces 获得，例如 cvm_device
     * @param Namespace 告警策略类型，由 DescribeAllNamespaces 获得，例如 cvm_device
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    public DescribeAlarmMetricsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmMetricsRequest(DescribeAlarmMetricsRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new String(source.MonitorType);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

