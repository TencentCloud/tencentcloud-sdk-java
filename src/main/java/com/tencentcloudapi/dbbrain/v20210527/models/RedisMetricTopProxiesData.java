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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedisMetricTopProxiesData extends AbstractModel {

    /**
    * host
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Proxy Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceProxyId")
    @Expose
    private String InstanceProxyId;

    /**
    * 端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 最新的值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
    * 时间（秒）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long [] Timestamp;

    /**
    * 序列数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Series")
    @Expose
    private MonitorFloatMetric [] Series;

    /**
     * Get host
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Host host
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set host
注意：此字段可能返回 null，表示取不到有效值。
     * @param Host host
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Proxy Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceProxyId Proxy Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceProxyId() {
        return this.InstanceProxyId;
    }

    /**
     * Set Proxy Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceProxyId Proxy Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceProxyId(String InstanceProxyId) {
        this.InstanceProxyId = InstanceProxyId;
    }

    /**
     * Get 端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 最新的值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 最新的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set 最新的值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 最新的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    /**
     * Get 时间（秒）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp 时间（秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间（秒）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp 时间（秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(Long [] Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 序列数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Series 序列数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MonitorFloatMetric [] getSeries() {
        return this.Series;
    }

    /**
     * Set 序列数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Series 序列数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeries(MonitorFloatMetric [] Series) {
        this.Series = Series;
    }

    public RedisMetricTopProxiesData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedisMetricTopProxiesData(RedisMetricTopProxiesData source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.InstanceProxyId != null) {
            this.InstanceProxyId = new String(source.InstanceProxyId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long[source.Timestamp.length];
            for (int i = 0; i < source.Timestamp.length; i++) {
                this.Timestamp[i] = new Long(source.Timestamp[i]);
            }
        }
        if (source.Series != null) {
            this.Series = new MonitorFloatMetric[source.Series.length];
            for (int i = 0; i < source.Series.length; i++) {
                this.Series[i] = new MonitorFloatMetric(source.Series[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "InstanceProxyId", this.InstanceProxyId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArraySimple(map, prefix + "Timestamp.", this.Timestamp);
        this.setParamArrayObj(map, prefix + "Series.", this.Series);

    }
}

