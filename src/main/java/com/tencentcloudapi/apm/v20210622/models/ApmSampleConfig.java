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

public class ApmSampleConfig extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * 服务名
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 采样名字
    */
    @SerializedName("SampleName")
    @Expose
    private String SampleName;

    /**
    * 接口名
    */
    @SerializedName("OperationName")
    @Expose
    private String OperationName;

    /**
    * 采样的span数
    */
    @SerializedName("SpanNum")
    @Expose
    private Long SpanNum;

    /**
    * 采样配置开关 0 关 1 开
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * tags数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private APMKVItem [] Tags;

    /**
    * 采样率
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * 0=精确匹配（默认）；1=前缀匹配；2=后缀匹配
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperationType")
    @Expose
    private Long OperationType;

    /**
    * 配置Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get 实例ID 
     * @return InstanceKey 实例ID
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set 实例ID
     * @param InstanceKey 实例ID
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get 服务名 
     * @return ServiceName 服务名
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名
     * @param ServiceName 服务名
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 采样名字 
     * @return SampleName 采样名字
     */
    public String getSampleName() {
        return this.SampleName;
    }

    /**
     * Set 采样名字
     * @param SampleName 采样名字
     */
    public void setSampleName(String SampleName) {
        this.SampleName = SampleName;
    }

    /**
     * Get 接口名 
     * @return OperationName 接口名
     */
    public String getOperationName() {
        return this.OperationName;
    }

    /**
     * Set 接口名
     * @param OperationName 接口名
     */
    public void setOperationName(String OperationName) {
        this.OperationName = OperationName;
    }

    /**
     * Get 采样的span数 
     * @return SpanNum 采样的span数
     */
    public Long getSpanNum() {
        return this.SpanNum;
    }

    /**
     * Set 采样的span数
     * @param SpanNum 采样的span数
     */
    public void setSpanNum(Long SpanNum) {
        this.SpanNum = SpanNum;
    }

    /**
     * Get 采样配置开关 0 关 1 开 
     * @return Status 采样配置开关 0 关 1 开
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 采样配置开关 0 关 1 开
     * @param Status 采样配置开关 0 关 1 开
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get tags数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags tags数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public APMKVItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set tags数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags tags数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(APMKVItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 采样率 
     * @return SampleRate 采样率
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 采样率
     * @param SampleRate 采样率
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get 0=精确匹配（默认）；1=前缀匹配；2=后缀匹配
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperationType 0=精确匹配（默认）；1=前缀匹配；2=后缀匹配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 0=精确匹配（默认）；1=前缀匹配；2=后缀匹配
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperationType 0=精确匹配（默认）；1=前缀匹配；2=后缀匹配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperationType(Long OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get 配置Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 配置Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 配置Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 配置Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public ApmSampleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmSampleConfig(ApmSampleConfig source) {
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.SampleName != null) {
            this.SampleName = new String(source.SampleName);
        }
        if (source.OperationName != null) {
            this.OperationName = new String(source.OperationName);
        }
        if (source.SpanNum != null) {
            this.SpanNum = new Long(source.SpanNum);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new APMKVItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new APMKVItem(source.Tags[i]);
            }
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.OperationType != null) {
            this.OperationType = new Long(source.OperationType);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "SampleName", this.SampleName);
        this.setParamSimple(map, prefix + "OperationName", this.OperationName);
        this.setParamSimple(map, prefix + "SpanNum", this.SpanNum);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

