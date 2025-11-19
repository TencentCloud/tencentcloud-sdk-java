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

public class ModifyApmSampleConfigRequest extends AbstractModel {

    /**
    * 业务系统ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 采样规则名
    */
    @SerializedName("SampleName")
    @Expose
    private String SampleName;

    /**
    * 采样率
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * 应用名，生效于所有应用则填空
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 接口名
    */
    @SerializedName("OperationName")
    @Expose
    private String OperationName;

    /**
    * 采样tag
    */
    @SerializedName("Tags")
    @Expose
    private APMKVItem [] Tags;

    /**
    * 采样开关 0关 1开 2删除
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 配置Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 0=精确匹配（默认）；1=前缀匹配；2=后缀匹配
    */
    @SerializedName("OperationType")
    @Expose
    private Long OperationType;

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
     * Get 采样规则名 
     * @return SampleName 采样规则名
     */
    public String getSampleName() {
        return this.SampleName;
    }

    /**
     * Set 采样规则名
     * @param SampleName 采样规则名
     */
    public void setSampleName(String SampleName) {
        this.SampleName = SampleName;
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
     * Get 应用名，生效于所有应用则填空 
     * @return ServiceName 应用名，生效于所有应用则填空
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 应用名，生效于所有应用则填空
     * @param ServiceName 应用名，生效于所有应用则填空
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
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
     * Get 采样tag 
     * @return Tags 采样tag
     */
    public APMKVItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set 采样tag
     * @param Tags 采样tag
     */
    public void setTags(APMKVItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 采样开关 0关 1开 2删除 
     * @return Status 采样开关 0关 1开 2删除
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 采样开关 0关 1开 2删除
     * @param Status 采样开关 0关 1开 2删除
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 配置Id 
     * @return Id 配置Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 配置Id
     * @param Id 配置Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 0=精确匹配（默认）；1=前缀匹配；2=后缀匹配 
     * @return OperationType 0=精确匹配（默认）；1=前缀匹配；2=后缀匹配
     */
    public Long getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 0=精确匹配（默认）；1=前缀匹配；2=后缀匹配
     * @param OperationType 0=精确匹配（默认）；1=前缀匹配；2=后缀匹配
     */
    public void setOperationType(Long OperationType) {
        this.OperationType = OperationType;
    }

    public ModifyApmSampleConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApmSampleConfigRequest(ModifyApmSampleConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SampleName != null) {
            this.SampleName = new String(source.SampleName);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.OperationName != null) {
            this.OperationName = new String(source.OperationName);
        }
        if (source.Tags != null) {
            this.Tags = new APMKVItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new APMKVItem(source.Tags[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.OperationType != null) {
            this.OperationType = new Long(source.OperationType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SampleName", this.SampleName);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "OperationName", this.OperationName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);

    }
}

