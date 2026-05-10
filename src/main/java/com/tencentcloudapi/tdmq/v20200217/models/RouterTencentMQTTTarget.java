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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RouterTencentMQTTTarget extends AbstractModel {

    /**
    * <p>MQTT 集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>主题名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceRegion")
    @Expose
    private String SourceRegion;

    /**
    * <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>用户密码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>消费者并发数，0 ～ 100</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetProduceConcurrentThreadCount")
    @Expose
    private Long TargetProduceConcurrentThreadCount;

    /**
    * <p>过滤时间，毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterFromTimestampMs")
    @Expose
    private Long FilterFromTimestampMs;

    /**
    * <p>MQTT集群接入点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
     * Get <p>MQTT 集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId <p>MQTT 集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>MQTT 集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId <p>MQTT 集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>主题名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topic <p>主题名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>主题名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topic <p>主题名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceRegion <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceRegion() {
        return this.SourceRegion;
    }

    /**
     * Set <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceRegion <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceRegion(String SourceRegion) {
        this.SourceRegion = SourceRegion;
    }

    /**
     * Get <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>用户密码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password <p>用户密码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>用户密码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password <p>用户密码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>消费者并发数，0 ～ 100</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetProduceConcurrentThreadCount <p>消费者并发数，0 ～ 100</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetProduceConcurrentThreadCount() {
        return this.TargetProduceConcurrentThreadCount;
    }

    /**
     * Set <p>消费者并发数，0 ～ 100</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetProduceConcurrentThreadCount <p>消费者并发数，0 ～ 100</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetProduceConcurrentThreadCount(Long TargetProduceConcurrentThreadCount) {
        this.TargetProduceConcurrentThreadCount = TargetProduceConcurrentThreadCount;
    }

    /**
     * Get <p>过滤时间，毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterFromTimestampMs <p>过滤时间，毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFilterFromTimestampMs() {
        return this.FilterFromTimestampMs;
    }

    /**
     * Set <p>过滤时间，毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterFromTimestampMs <p>过滤时间，毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterFromTimestampMs(Long FilterFromTimestampMs) {
        this.FilterFromTimestampMs = FilterFromTimestampMs;
    }

    /**
     * Get <p>MQTT集群接入点信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Endpoint <p>MQTT集群接入点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set <p>MQTT集群接入点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Endpoint <p>MQTT集群接入点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    public RouterTencentMQTTTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouterTencentMQTTTarget(RouterTencentMQTTTarget source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.SourceRegion != null) {
            this.SourceRegion = new String(source.SourceRegion);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.TargetProduceConcurrentThreadCount != null) {
            this.TargetProduceConcurrentThreadCount = new Long(source.TargetProduceConcurrentThreadCount);
        }
        if (source.FilterFromTimestampMs != null) {
            this.FilterFromTimestampMs = new Long(source.FilterFromTimestampMs);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "SourceRegion", this.SourceRegion);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "TargetProduceConcurrentThreadCount", this.TargetProduceConcurrentThreadCount);
        this.setParamSimple(map, prefix + "FilterFromTimestampMs", this.FilterFromTimestampMs);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);

    }
}

