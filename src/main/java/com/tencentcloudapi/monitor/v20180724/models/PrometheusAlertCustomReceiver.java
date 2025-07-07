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

public class PrometheusAlertCustomReceiver extends AbstractModel {

    /**
    * 自定义通知类型
alertmanager -- vpc内自建alertmanager
webhook -- vpc内webhook地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * alertmanager/webhook地址。（prometheus实例同vpc内ip）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 允许发送告警的时间范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowedTimeRanges")
    @Expose
    private PrometheusAlertAllowTimeRange [] AllowedTimeRanges;

    /**
    * alertmanager所在的内网集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * alertmanager所在的内网集群类型(tke/eks/tdcc)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
     * Get 自定义通知类型
alertmanager -- vpc内自建alertmanager
webhook -- vpc内webhook地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 自定义通知类型
alertmanager -- vpc内自建alertmanager
webhook -- vpc内webhook地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 自定义通知类型
alertmanager -- vpc内自建alertmanager
webhook -- vpc内webhook地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 自定义通知类型
alertmanager -- vpc内自建alertmanager
webhook -- vpc内webhook地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get alertmanager/webhook地址。（prometheus实例同vpc内ip）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url alertmanager/webhook地址。（prometheus实例同vpc内ip）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set alertmanager/webhook地址。（prometheus实例同vpc内ip）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url alertmanager/webhook地址。（prometheus实例同vpc内ip）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 允许发送告警的时间范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowedTimeRanges 允许发送告警的时间范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusAlertAllowTimeRange [] getAllowedTimeRanges() {
        return this.AllowedTimeRanges;
    }

    /**
     * Set 允许发送告警的时间范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowedTimeRanges 允许发送告警的时间范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowedTimeRanges(PrometheusAlertAllowTimeRange [] AllowedTimeRanges) {
        this.AllowedTimeRanges = AllowedTimeRanges;
    }

    /**
     * Get alertmanager所在的内网集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId alertmanager所在的内网集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set alertmanager所在的内网集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId alertmanager所在的内网集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get alertmanager所在的内网集群类型(tke/eks/tdcc)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterType alertmanager所在的内网集群类型(tke/eks/tdcc)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set alertmanager所在的内网集群类型(tke/eks/tdcc)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterType alertmanager所在的内网集群类型(tke/eks/tdcc)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    public PrometheusAlertCustomReceiver() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusAlertCustomReceiver(PrometheusAlertCustomReceiver source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.AllowedTimeRanges != null) {
            this.AllowedTimeRanges = new PrometheusAlertAllowTimeRange[source.AllowedTimeRanges.length];
            for (int i = 0; i < source.AllowedTimeRanges.length; i++) {
                this.AllowedTimeRanges[i] = new PrometheusAlertAllowTimeRange(source.AllowedTimeRanges[i]);
            }
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArrayObj(map, prefix + "AllowedTimeRanges.", this.AllowedTimeRanges);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

