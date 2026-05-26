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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplacePrometheusAlertmanagerConfigRequest extends AbstractModel {

    /**
    * <p>Prometheus 实例 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Alertmanager 配置</p>
    */
    @SerializedName("AlertmanagerConfig")
    @Expose
    private PrometheusAlertmanagerConfigV2 AlertmanagerConfig;

    /**
     * Get <p>Prometheus 实例 ID</p> 
     * @return InstanceId <p>Prometheus 实例 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Prometheus 实例 ID</p>
     * @param InstanceId <p>Prometheus 实例 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Alertmanager 配置</p> 
     * @return AlertmanagerConfig <p>Alertmanager 配置</p>
     */
    public PrometheusAlertmanagerConfigV2 getAlertmanagerConfig() {
        return this.AlertmanagerConfig;
    }

    /**
     * Set <p>Alertmanager 配置</p>
     * @param AlertmanagerConfig <p>Alertmanager 配置</p>
     */
    public void setAlertmanagerConfig(PrometheusAlertmanagerConfigV2 AlertmanagerConfig) {
        this.AlertmanagerConfig = AlertmanagerConfig;
    }

    public ReplacePrometheusAlertmanagerConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplacePrometheusAlertmanagerConfigRequest(ReplacePrometheusAlertmanagerConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AlertmanagerConfig != null) {
            this.AlertmanagerConfig = new PrometheusAlertmanagerConfigV2(source.AlertmanagerConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "AlertmanagerConfig.", this.AlertmanagerConfig);

    }
}

