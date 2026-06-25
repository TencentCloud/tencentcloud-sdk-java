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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnableSparkAppMonitorInfo extends AbstractModel {

    /**
    * <p>实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrometheusInstanceId")
    @Expose
    private String PrometheusInstanceId;

    /**
    * <p>grafana实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GrafanaInstanceId")
    @Expose
    private String GrafanaInstanceId;

    /**
    * <p>开启关闭状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableMonitor")
    @Expose
    private Boolean EnableMonitor;

    /**
    * <p>grafana访问地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GrafanaURL")
    @Expose
    private String GrafanaURL;

    /**
     * Get <p>实例id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrometheusInstanceId <p>实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrometheusInstanceId() {
        return this.PrometheusInstanceId;
    }

    /**
     * Set <p>实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrometheusInstanceId <p>实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrometheusInstanceId(String PrometheusInstanceId) {
        this.PrometheusInstanceId = PrometheusInstanceId;
    }

    /**
     * Get <p>grafana实例id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GrafanaInstanceId <p>grafana实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGrafanaInstanceId() {
        return this.GrafanaInstanceId;
    }

    /**
     * Set <p>grafana实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GrafanaInstanceId <p>grafana实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrafanaInstanceId(String GrafanaInstanceId) {
        this.GrafanaInstanceId = GrafanaInstanceId;
    }

    /**
     * Get <p>开启关闭状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableMonitor <p>开启关闭状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableMonitor() {
        return this.EnableMonitor;
    }

    /**
     * Set <p>开启关闭状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableMonitor <p>开启关闭状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableMonitor(Boolean EnableMonitor) {
        this.EnableMonitor = EnableMonitor;
    }

    /**
     * Get <p>grafana访问地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GrafanaURL <p>grafana访问地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGrafanaURL() {
        return this.GrafanaURL;
    }

    /**
     * Set <p>grafana访问地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GrafanaURL <p>grafana访问地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrafanaURL(String GrafanaURL) {
        this.GrafanaURL = GrafanaURL;
    }

    public EnableSparkAppMonitorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableSparkAppMonitorInfo(EnableSparkAppMonitorInfo source) {
        if (source.PrometheusInstanceId != null) {
            this.PrometheusInstanceId = new String(source.PrometheusInstanceId);
        }
        if (source.GrafanaInstanceId != null) {
            this.GrafanaInstanceId = new String(source.GrafanaInstanceId);
        }
        if (source.EnableMonitor != null) {
            this.EnableMonitor = new Boolean(source.EnableMonitor);
        }
        if (source.GrafanaURL != null) {
            this.GrafanaURL = new String(source.GrafanaURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrometheusInstanceId", this.PrometheusInstanceId);
        this.setParamSimple(map, prefix + "GrafanaInstanceId", this.GrafanaInstanceId);
        this.setParamSimple(map, prefix + "EnableMonitor", this.EnableMonitor);
        this.setParamSimple(map, prefix + "GrafanaURL", this.GrafanaURL);

    }
}

