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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRealtimeLogDeliveryTaskRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 实时日志投递任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 实时日志投递任务的名称，格式为数字、英文、-和_组合，最多 200 个字符。不填保持原有配置。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 实时日志投递任务的状态，取值有：
<li>enabled: 启用；</li>
<li>disabled: 停用。</li>不填保持原有配置。
    */
    @SerializedName("DeliveryStatus")
    @Expose
    private String DeliveryStatus;

    /**
    * 实时日志投递任务对应的实体（七层域名或者四层代理实例）列表。取值示例如下：
<li>七层域名：domain.example.com；</li>
<li>四层代理实例：sid-2s69eb5wcms7。</li>不填保持原有配置。
    */
    @SerializedName("EntityList")
    @Expose
    private String [] EntityList;

    /**
    * 投递的预设字段列表。不填保持原有配置。
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
    * 投递的自定义字段列表，支持在 HTTP 请求头、响应头、Cookie 中提取指定字段值。自定义字段名称不能重复，且最多不能超过 200 个字段。不填保持原有配置。
    */
    @SerializedName("CustomFields")
    @Expose
    private CustomField [] CustomFields;

    /**
    * 日志投递的过滤条件。不填表示投递全量日志。
    */
    @SerializedName("DeliveryConditions")
    @Expose
    private DeliveryCondition [] DeliveryConditions;

    /**
    * 采样比例，采用千分制，取值范围为1-1000，例如：填写 605 表示采样比例为 60.5%。不填保持原有配置。
    */
    @SerializedName("Sample")
    @Expose
    private Long Sample;

    /**
    * 自定义 HTTP 服务的配置信息，不填保持原有配置。 
    */
    @SerializedName("CustomEndpoint")
    @Expose
    private CustomEndpoint CustomEndpoint;

    /**
    * AWS S3 兼容存储桶的配置信息，不填保持原有配置。
    */
    @SerializedName("S3")
    @Expose
    private S3 S3;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 实时日志投递任务 ID。 
     * @return TaskId 实时日志投递任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 实时日志投递任务 ID。
     * @param TaskId 实时日志投递任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 实时日志投递任务的名称，格式为数字、英文、-和_组合，最多 200 个字符。不填保持原有配置。 
     * @return TaskName 实时日志投递任务的名称，格式为数字、英文、-和_组合，最多 200 个字符。不填保持原有配置。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 实时日志投递任务的名称，格式为数字、英文、-和_组合，最多 200 个字符。不填保持原有配置。
     * @param TaskName 实时日志投递任务的名称，格式为数字、英文、-和_组合，最多 200 个字符。不填保持原有配置。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 实时日志投递任务的状态，取值有：
<li>enabled: 启用；</li>
<li>disabled: 停用。</li>不填保持原有配置。 
     * @return DeliveryStatus 实时日志投递任务的状态，取值有：
<li>enabled: 启用；</li>
<li>disabled: 停用。</li>不填保持原有配置。
     */
    public String getDeliveryStatus() {
        return this.DeliveryStatus;
    }

    /**
     * Set 实时日志投递任务的状态，取值有：
<li>enabled: 启用；</li>
<li>disabled: 停用。</li>不填保持原有配置。
     * @param DeliveryStatus 实时日志投递任务的状态，取值有：
<li>enabled: 启用；</li>
<li>disabled: 停用。</li>不填保持原有配置。
     */
    public void setDeliveryStatus(String DeliveryStatus) {
        this.DeliveryStatus = DeliveryStatus;
    }

    /**
     * Get 实时日志投递任务对应的实体（七层域名或者四层代理实例）列表。取值示例如下：
<li>七层域名：domain.example.com；</li>
<li>四层代理实例：sid-2s69eb5wcms7。</li>不填保持原有配置。 
     * @return EntityList 实时日志投递任务对应的实体（七层域名或者四层代理实例）列表。取值示例如下：
<li>七层域名：domain.example.com；</li>
<li>四层代理实例：sid-2s69eb5wcms7。</li>不填保持原有配置。
     */
    public String [] getEntityList() {
        return this.EntityList;
    }

    /**
     * Set 实时日志投递任务对应的实体（七层域名或者四层代理实例）列表。取值示例如下：
<li>七层域名：domain.example.com；</li>
<li>四层代理实例：sid-2s69eb5wcms7。</li>不填保持原有配置。
     * @param EntityList 实时日志投递任务对应的实体（七层域名或者四层代理实例）列表。取值示例如下：
<li>七层域名：domain.example.com；</li>
<li>四层代理实例：sid-2s69eb5wcms7。</li>不填保持原有配置。
     */
    public void setEntityList(String [] EntityList) {
        this.EntityList = EntityList;
    }

    /**
     * Get 投递的预设字段列表。不填保持原有配置。 
     * @return Fields 投递的预设字段列表。不填保持原有配置。
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set 投递的预设字段列表。不填保持原有配置。
     * @param Fields 投递的预设字段列表。不填保持原有配置。
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get 投递的自定义字段列表，支持在 HTTP 请求头、响应头、Cookie 中提取指定字段值。自定义字段名称不能重复，且最多不能超过 200 个字段。不填保持原有配置。 
     * @return CustomFields 投递的自定义字段列表，支持在 HTTP 请求头、响应头、Cookie 中提取指定字段值。自定义字段名称不能重复，且最多不能超过 200 个字段。不填保持原有配置。
     */
    public CustomField [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set 投递的自定义字段列表，支持在 HTTP 请求头、响应头、Cookie 中提取指定字段值。自定义字段名称不能重复，且最多不能超过 200 个字段。不填保持原有配置。
     * @param CustomFields 投递的自定义字段列表，支持在 HTTP 请求头、响应头、Cookie 中提取指定字段值。自定义字段名称不能重复，且最多不能超过 200 个字段。不填保持原有配置。
     */
    public void setCustomFields(CustomField [] CustomFields) {
        this.CustomFields = CustomFields;
    }

    /**
     * Get 日志投递的过滤条件。不填表示投递全量日志。 
     * @return DeliveryConditions 日志投递的过滤条件。不填表示投递全量日志。
     */
    public DeliveryCondition [] getDeliveryConditions() {
        return this.DeliveryConditions;
    }

    /**
     * Set 日志投递的过滤条件。不填表示投递全量日志。
     * @param DeliveryConditions 日志投递的过滤条件。不填表示投递全量日志。
     */
    public void setDeliveryConditions(DeliveryCondition [] DeliveryConditions) {
        this.DeliveryConditions = DeliveryConditions;
    }

    /**
     * Get 采样比例，采用千分制，取值范围为1-1000，例如：填写 605 表示采样比例为 60.5%。不填保持原有配置。 
     * @return Sample 采样比例，采用千分制，取值范围为1-1000，例如：填写 605 表示采样比例为 60.5%。不填保持原有配置。
     */
    public Long getSample() {
        return this.Sample;
    }

    /**
     * Set 采样比例，采用千分制，取值范围为1-1000，例如：填写 605 表示采样比例为 60.5%。不填保持原有配置。
     * @param Sample 采样比例，采用千分制，取值范围为1-1000，例如：填写 605 表示采样比例为 60.5%。不填保持原有配置。
     */
    public void setSample(Long Sample) {
        this.Sample = Sample;
    }

    /**
     * Get 自定义 HTTP 服务的配置信息，不填保持原有配置。  
     * @return CustomEndpoint 自定义 HTTP 服务的配置信息，不填保持原有配置。 
     */
    public CustomEndpoint getCustomEndpoint() {
        return this.CustomEndpoint;
    }

    /**
     * Set 自定义 HTTP 服务的配置信息，不填保持原有配置。 
     * @param CustomEndpoint 自定义 HTTP 服务的配置信息，不填保持原有配置。 
     */
    public void setCustomEndpoint(CustomEndpoint CustomEndpoint) {
        this.CustomEndpoint = CustomEndpoint;
    }

    /**
     * Get AWS S3 兼容存储桶的配置信息，不填保持原有配置。 
     * @return S3 AWS S3 兼容存储桶的配置信息，不填保持原有配置。
     */
    public S3 getS3() {
        return this.S3;
    }

    /**
     * Set AWS S3 兼容存储桶的配置信息，不填保持原有配置。
     * @param S3 AWS S3 兼容存储桶的配置信息，不填保持原有配置。
     */
    public void setS3(S3 S3) {
        this.S3 = S3;
    }

    public ModifyRealtimeLogDeliveryTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRealtimeLogDeliveryTaskRequest(ModifyRealtimeLogDeliveryTaskRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.DeliveryStatus != null) {
            this.DeliveryStatus = new String(source.DeliveryStatus);
        }
        if (source.EntityList != null) {
            this.EntityList = new String[source.EntityList.length];
            for (int i = 0; i < source.EntityList.length; i++) {
                this.EntityList[i] = new String(source.EntityList[i]);
            }
        }
        if (source.Fields != null) {
            this.Fields = new String[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new String(source.Fields[i]);
            }
        }
        if (source.CustomFields != null) {
            this.CustomFields = new CustomField[source.CustomFields.length];
            for (int i = 0; i < source.CustomFields.length; i++) {
                this.CustomFields[i] = new CustomField(source.CustomFields[i]);
            }
        }
        if (source.DeliveryConditions != null) {
            this.DeliveryConditions = new DeliveryCondition[source.DeliveryConditions.length];
            for (int i = 0; i < source.DeliveryConditions.length; i++) {
                this.DeliveryConditions[i] = new DeliveryCondition(source.DeliveryConditions[i]);
            }
        }
        if (source.Sample != null) {
            this.Sample = new Long(source.Sample);
        }
        if (source.CustomEndpoint != null) {
            this.CustomEndpoint = new CustomEndpoint(source.CustomEndpoint);
        }
        if (source.S3 != null) {
            this.S3 = new S3(source.S3);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "DeliveryStatus", this.DeliveryStatus);
        this.setParamArraySimple(map, prefix + "EntityList.", this.EntityList);
        this.setParamArraySimple(map, prefix + "Fields.", this.Fields);
        this.setParamArrayObj(map, prefix + "CustomFields.", this.CustomFields);
        this.setParamArrayObj(map, prefix + "DeliveryConditions.", this.DeliveryConditions);
        this.setParamSimple(map, prefix + "Sample", this.Sample);
        this.setParamObj(map, prefix + "CustomEndpoint.", this.CustomEndpoint);
        this.setParamObj(map, prefix + "S3.", this.S3);

    }
}

