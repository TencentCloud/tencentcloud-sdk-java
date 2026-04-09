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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyApmAssociationRequest extends AbstractModel {

    /**
    * <p>关联的产品名，当前只支持Prometheus、CKafka</p>
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * <p>关联关系的状态：// 关联关系状态：1（启用）、2（不启用）</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>业务系统ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>关联的产品实例ID</p>
    */
    @SerializedName("PeerId")
    @Expose
    private String PeerId;

    /**
    * <p>CKafka消息主题</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>Ckafka消息主题</p>
    */
    @SerializedName("MetricTopic")
    @Expose
    private String MetricTopic;

    /**
     * Get <p>关联的产品名，当前只支持Prometheus、CKafka</p> 
     * @return ProductName <p>关联的产品名，当前只支持Prometheus、CKafka</p>
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set <p>关联的产品名，当前只支持Prometheus、CKafka</p>
     * @param ProductName <p>关联的产品名，当前只支持Prometheus、CKafka</p>
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get <p>关联关系的状态：// 关联关系状态：1（启用）、2（不启用）</p> 
     * @return Status <p>关联关系的状态：// 关联关系状态：1（启用）、2（不启用）</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>关联关系的状态：// 关联关系状态：1（启用）、2（不启用）</p>
     * @param Status <p>关联关系的状态：// 关联关系状态：1（启用）、2（不启用）</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>业务系统ID</p> 
     * @return InstanceId <p>业务系统ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>业务系统ID</p>
     * @param InstanceId <p>业务系统ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>关联的产品实例ID</p> 
     * @return PeerId <p>关联的产品实例ID</p>
     */
    public String getPeerId() {
        return this.PeerId;
    }

    /**
     * Set <p>关联的产品实例ID</p>
     * @param PeerId <p>关联的产品实例ID</p>
     */
    public void setPeerId(String PeerId) {
        this.PeerId = PeerId;
    }

    /**
     * Get <p>CKafka消息主题</p> 
     * @return Topic <p>CKafka消息主题</p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>CKafka消息主题</p>
     * @param Topic <p>CKafka消息主题</p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>Ckafka消息主题</p> 
     * @return MetricTopic <p>Ckafka消息主题</p>
     */
    public String getMetricTopic() {
        return this.MetricTopic;
    }

    /**
     * Set <p>Ckafka消息主题</p>
     * @param MetricTopic <p>Ckafka消息主题</p>
     */
    public void setMetricTopic(String MetricTopic) {
        this.MetricTopic = MetricTopic;
    }

    public ModifyApmAssociationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApmAssociationRequest(ModifyApmAssociationRequest source) {
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PeerId != null) {
            this.PeerId = new String(source.PeerId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.MetricTopic != null) {
            this.MetricTopic = new String(source.MetricTopic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PeerId", this.PeerId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "MetricTopic", this.MetricTopic);

    }
}

