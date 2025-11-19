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
    * 关联的产品名，当前只支持Prometheus
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 关联关系的状态：// 关联关系状态：1（启用）、2（不启用）、4（已删除）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 业务系统ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 关联的产品实例ID
    */
    @SerializedName("PeerId")
    @Expose
    private String PeerId;

    /**
    * CKafka消息主题
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
     * Get 关联的产品名，当前只支持Prometheus 
     * @return ProductName 关联的产品名，当前只支持Prometheus
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 关联的产品名，当前只支持Prometheus
     * @param ProductName 关联的产品名，当前只支持Prometheus
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 关联关系的状态：// 关联关系状态：1（启用）、2（不启用）、4（已删除） 
     * @return Status 关联关系的状态：// 关联关系状态：1（启用）、2（不启用）、4（已删除）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 关联关系的状态：// 关联关系状态：1（启用）、2（不启用）、4（已删除）
     * @param Status 关联关系的状态：// 关联关系状态：1（启用）、2（不启用）、4（已删除）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 业务系统ID 
     * @return InstanceId 业务系统ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 业务系统ID
     * @param InstanceId 业务系统ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 关联的产品实例ID 
     * @return PeerId 关联的产品实例ID
     */
    public String getPeerId() {
        return this.PeerId;
    }

    /**
     * Set 关联的产品实例ID
     * @param PeerId 关联的产品实例ID
     */
    public void setPeerId(String PeerId) {
        this.PeerId = PeerId;
    }

    /**
     * Get CKafka消息主题 
     * @return Topic CKafka消息主题
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set CKafka消息主题
     * @param Topic CKafka消息主题
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
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

    }
}

