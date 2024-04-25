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

public class CreateRealtimeLogDeliveryTaskRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 实时日志投递任务的名称，格式为数字、英文、-和_组合，最多 200 个字符。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 实时日志投递任务类型，取值有：
<li>cls: 推送到腾讯云 CLS；</li>
<li>custom_endpoint：推送到自定义 HTTP(S) 地址；</li>
<li>s3：推送到 AWS S3 兼容存储桶地址。</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 实时日志投递任务对应的实体（七层域名或者四层代理实例）列表。取值示例如下：
<li>七层域名：domain.example.com；</li>
<li>四层代理实例：sid-2s69eb5wcms7。</li>
    */
    @SerializedName("EntityList")
    @Expose
    private String [] EntityList;

    /**
    * 数据投递类型，取值有：
<li>domain：站点加速日志；</li>
<li>application：四层代理日志；</li>
<li>web-rateLiming：速率限制和 CC 攻击防护日志；</li>
<li>web-attack：托管规则日志；</li>
<li>web-rule：自定义规则日志；</li>
<li>web-bot：Bot管理日志。</li>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 数据投递区域，取值有：
<li>mainland：中国大陆境内；</li>
<li>overseas：全球（不含中国大陆）。</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 投递的预设字段列表。
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
    * 投递的自定义字段列表，支持在 HTTP 请求头、响应头、Cookie 中提取指定字段值。自定义字段名称不能重复，且最多不能超过 200 个字段。
    */
    @SerializedName("CustomFields")
    @Expose
    private CustomField [] CustomFields;

    /**
    * 日志投递的过滤条件，不填表示投递全量日志。
    */
    @SerializedName("DeliveryConditions")
    @Expose
    private DeliveryCondition [] DeliveryConditions;

    /**
    * 采样比例，采用千分制，取值范围为1-1000，例如：填写 605 表示采样比例为 60.5%。不填表示采样比例为 100%。
    */
    @SerializedName("Sample")
    @Expose
    private Long Sample;

    /**
    * 日志投递的输出格式。不填表示为默认格式，默认格式逻辑如下：
<li>当 TaskType 取值为 custom_endpoint 时，默认格式为多个 JSON 对象组成的数组，每个 JSON 对象为一条日志；</li>
<li>当 TaskType 取值为 s3 时，默认格式为 JSON Lines；</li>特别地，当 TaskType 取值为 cls 时，LogFormat.FormatType 的值只能为 json，且 LogFormat 中其他参数将被忽略，建议不传 LogFormat。
    */
    @SerializedName("LogFormat")
    @Expose
    private LogFormat LogFormat;

    /**
    * CLS 的配置信息。当 TaskType 取值为 cls 时，该参数必填。
    */
    @SerializedName("CLS")
    @Expose
    private CLSTopic CLS;

    /**
    * 自定义 HTTP 服务的配置信息。当 TaskType 取值为 custom_endpoint 时，该参数必填。
    */
    @SerializedName("CustomEndpoint")
    @Expose
    private CustomEndpoint CustomEndpoint;

    /**
    * AWS S3 兼容存储桶的配置信息。当 TaskType 取值为 s3 时，该参数必填。
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
     * Get 实时日志投递任务的名称，格式为数字、英文、-和_组合，最多 200 个字符。 
     * @return TaskName 实时日志投递任务的名称，格式为数字、英文、-和_组合，最多 200 个字符。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 实时日志投递任务的名称，格式为数字、英文、-和_组合，最多 200 个字符。
     * @param TaskName 实时日志投递任务的名称，格式为数字、英文、-和_组合，最多 200 个字符。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 实时日志投递任务类型，取值有：
<li>cls: 推送到腾讯云 CLS；</li>
<li>custom_endpoint：推送到自定义 HTTP(S) 地址；</li>
<li>s3：推送到 AWS S3 兼容存储桶地址。</li> 
     * @return TaskType 实时日志投递任务类型，取值有：
<li>cls: 推送到腾讯云 CLS；</li>
<li>custom_endpoint：推送到自定义 HTTP(S) 地址；</li>
<li>s3：推送到 AWS S3 兼容存储桶地址。</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 实时日志投递任务类型，取值有：
<li>cls: 推送到腾讯云 CLS；</li>
<li>custom_endpoint：推送到自定义 HTTP(S) 地址；</li>
<li>s3：推送到 AWS S3 兼容存储桶地址。</li>
     * @param TaskType 实时日志投递任务类型，取值有：
<li>cls: 推送到腾讯云 CLS；</li>
<li>custom_endpoint：推送到自定义 HTTP(S) 地址；</li>
<li>s3：推送到 AWS S3 兼容存储桶地址。</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 实时日志投递任务对应的实体（七层域名或者四层代理实例）列表。取值示例如下：
<li>七层域名：domain.example.com；</li>
<li>四层代理实例：sid-2s69eb5wcms7。</li> 
     * @return EntityList 实时日志投递任务对应的实体（七层域名或者四层代理实例）列表。取值示例如下：
<li>七层域名：domain.example.com；</li>
<li>四层代理实例：sid-2s69eb5wcms7。</li>
     */
    public String [] getEntityList() {
        return this.EntityList;
    }

    /**
     * Set 实时日志投递任务对应的实体（七层域名或者四层代理实例）列表。取值示例如下：
<li>七层域名：domain.example.com；</li>
<li>四层代理实例：sid-2s69eb5wcms7。</li>
     * @param EntityList 实时日志投递任务对应的实体（七层域名或者四层代理实例）列表。取值示例如下：
<li>七层域名：domain.example.com；</li>
<li>四层代理实例：sid-2s69eb5wcms7。</li>
     */
    public void setEntityList(String [] EntityList) {
        this.EntityList = EntityList;
    }

    /**
     * Get 数据投递类型，取值有：
<li>domain：站点加速日志；</li>
<li>application：四层代理日志；</li>
<li>web-rateLiming：速率限制和 CC 攻击防护日志；</li>
<li>web-attack：托管规则日志；</li>
<li>web-rule：自定义规则日志；</li>
<li>web-bot：Bot管理日志。</li> 
     * @return LogType 数据投递类型，取值有：
<li>domain：站点加速日志；</li>
<li>application：四层代理日志；</li>
<li>web-rateLiming：速率限制和 CC 攻击防护日志；</li>
<li>web-attack：托管规则日志；</li>
<li>web-rule：自定义规则日志；</li>
<li>web-bot：Bot管理日志。</li>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 数据投递类型，取值有：
<li>domain：站点加速日志；</li>
<li>application：四层代理日志；</li>
<li>web-rateLiming：速率限制和 CC 攻击防护日志；</li>
<li>web-attack：托管规则日志；</li>
<li>web-rule：自定义规则日志；</li>
<li>web-bot：Bot管理日志。</li>
     * @param LogType 数据投递类型，取值有：
<li>domain：站点加速日志；</li>
<li>application：四层代理日志；</li>
<li>web-rateLiming：速率限制和 CC 攻击防护日志；</li>
<li>web-attack：托管规则日志；</li>
<li>web-rule：自定义规则日志；</li>
<li>web-bot：Bot管理日志。</li>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 数据投递区域，取值有：
<li>mainland：中国大陆境内；</li>
<li>overseas：全球（不含中国大陆）。</li> 
     * @return Area 数据投递区域，取值有：
<li>mainland：中国大陆境内；</li>
<li>overseas：全球（不含中国大陆）。</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 数据投递区域，取值有：
<li>mainland：中国大陆境内；</li>
<li>overseas：全球（不含中国大陆）。</li>
     * @param Area 数据投递区域，取值有：
<li>mainland：中国大陆境内；</li>
<li>overseas：全球（不含中国大陆）。</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 投递的预设字段列表。 
     * @return Fields 投递的预设字段列表。
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set 投递的预设字段列表。
     * @param Fields 投递的预设字段列表。
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get 投递的自定义字段列表，支持在 HTTP 请求头、响应头、Cookie 中提取指定字段值。自定义字段名称不能重复，且最多不能超过 200 个字段。 
     * @return CustomFields 投递的自定义字段列表，支持在 HTTP 请求头、响应头、Cookie 中提取指定字段值。自定义字段名称不能重复，且最多不能超过 200 个字段。
     */
    public CustomField [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set 投递的自定义字段列表，支持在 HTTP 请求头、响应头、Cookie 中提取指定字段值。自定义字段名称不能重复，且最多不能超过 200 个字段。
     * @param CustomFields 投递的自定义字段列表，支持在 HTTP 请求头、响应头、Cookie 中提取指定字段值。自定义字段名称不能重复，且最多不能超过 200 个字段。
     */
    public void setCustomFields(CustomField [] CustomFields) {
        this.CustomFields = CustomFields;
    }

    /**
     * Get 日志投递的过滤条件，不填表示投递全量日志。 
     * @return DeliveryConditions 日志投递的过滤条件，不填表示投递全量日志。
     */
    public DeliveryCondition [] getDeliveryConditions() {
        return this.DeliveryConditions;
    }

    /**
     * Set 日志投递的过滤条件，不填表示投递全量日志。
     * @param DeliveryConditions 日志投递的过滤条件，不填表示投递全量日志。
     */
    public void setDeliveryConditions(DeliveryCondition [] DeliveryConditions) {
        this.DeliveryConditions = DeliveryConditions;
    }

    /**
     * Get 采样比例，采用千分制，取值范围为1-1000，例如：填写 605 表示采样比例为 60.5%。不填表示采样比例为 100%。 
     * @return Sample 采样比例，采用千分制，取值范围为1-1000，例如：填写 605 表示采样比例为 60.5%。不填表示采样比例为 100%。
     */
    public Long getSample() {
        return this.Sample;
    }

    /**
     * Set 采样比例，采用千分制，取值范围为1-1000，例如：填写 605 表示采样比例为 60.5%。不填表示采样比例为 100%。
     * @param Sample 采样比例，采用千分制，取值范围为1-1000，例如：填写 605 表示采样比例为 60.5%。不填表示采样比例为 100%。
     */
    public void setSample(Long Sample) {
        this.Sample = Sample;
    }

    /**
     * Get 日志投递的输出格式。不填表示为默认格式，默认格式逻辑如下：
<li>当 TaskType 取值为 custom_endpoint 时，默认格式为多个 JSON 对象组成的数组，每个 JSON 对象为一条日志；</li>
<li>当 TaskType 取值为 s3 时，默认格式为 JSON Lines；</li>特别地，当 TaskType 取值为 cls 时，LogFormat.FormatType 的值只能为 json，且 LogFormat 中其他参数将被忽略，建议不传 LogFormat。 
     * @return LogFormat 日志投递的输出格式。不填表示为默认格式，默认格式逻辑如下：
<li>当 TaskType 取值为 custom_endpoint 时，默认格式为多个 JSON 对象组成的数组，每个 JSON 对象为一条日志；</li>
<li>当 TaskType 取值为 s3 时，默认格式为 JSON Lines；</li>特别地，当 TaskType 取值为 cls 时，LogFormat.FormatType 的值只能为 json，且 LogFormat 中其他参数将被忽略，建议不传 LogFormat。
     */
    public LogFormat getLogFormat() {
        return this.LogFormat;
    }

    /**
     * Set 日志投递的输出格式。不填表示为默认格式，默认格式逻辑如下：
<li>当 TaskType 取值为 custom_endpoint 时，默认格式为多个 JSON 对象组成的数组，每个 JSON 对象为一条日志；</li>
<li>当 TaskType 取值为 s3 时，默认格式为 JSON Lines；</li>特别地，当 TaskType 取值为 cls 时，LogFormat.FormatType 的值只能为 json，且 LogFormat 中其他参数将被忽略，建议不传 LogFormat。
     * @param LogFormat 日志投递的输出格式。不填表示为默认格式，默认格式逻辑如下：
<li>当 TaskType 取值为 custom_endpoint 时，默认格式为多个 JSON 对象组成的数组，每个 JSON 对象为一条日志；</li>
<li>当 TaskType 取值为 s3 时，默认格式为 JSON Lines；</li>特别地，当 TaskType 取值为 cls 时，LogFormat.FormatType 的值只能为 json，且 LogFormat 中其他参数将被忽略，建议不传 LogFormat。
     */
    public void setLogFormat(LogFormat LogFormat) {
        this.LogFormat = LogFormat;
    }

    /**
     * Get CLS 的配置信息。当 TaskType 取值为 cls 时，该参数必填。 
     * @return CLS CLS 的配置信息。当 TaskType 取值为 cls 时，该参数必填。
     */
    public CLSTopic getCLS() {
        return this.CLS;
    }

    /**
     * Set CLS 的配置信息。当 TaskType 取值为 cls 时，该参数必填。
     * @param CLS CLS 的配置信息。当 TaskType 取值为 cls 时，该参数必填。
     */
    public void setCLS(CLSTopic CLS) {
        this.CLS = CLS;
    }

    /**
     * Get 自定义 HTTP 服务的配置信息。当 TaskType 取值为 custom_endpoint 时，该参数必填。 
     * @return CustomEndpoint 自定义 HTTP 服务的配置信息。当 TaskType 取值为 custom_endpoint 时，该参数必填。
     */
    public CustomEndpoint getCustomEndpoint() {
        return this.CustomEndpoint;
    }

    /**
     * Set 自定义 HTTP 服务的配置信息。当 TaskType 取值为 custom_endpoint 时，该参数必填。
     * @param CustomEndpoint 自定义 HTTP 服务的配置信息。当 TaskType 取值为 custom_endpoint 时，该参数必填。
     */
    public void setCustomEndpoint(CustomEndpoint CustomEndpoint) {
        this.CustomEndpoint = CustomEndpoint;
    }

    /**
     * Get AWS S3 兼容存储桶的配置信息。当 TaskType 取值为 s3 时，该参数必填。 
     * @return S3 AWS S3 兼容存储桶的配置信息。当 TaskType 取值为 s3 时，该参数必填。
     */
    public S3 getS3() {
        return this.S3;
    }

    /**
     * Set AWS S3 兼容存储桶的配置信息。当 TaskType 取值为 s3 时，该参数必填。
     * @param S3 AWS S3 兼容存储桶的配置信息。当 TaskType 取值为 s3 时，该参数必填。
     */
    public void setS3(S3 S3) {
        this.S3 = S3;
    }

    public CreateRealtimeLogDeliveryTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRealtimeLogDeliveryTaskRequest(CreateRealtimeLogDeliveryTaskRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.EntityList != null) {
            this.EntityList = new String[source.EntityList.length];
            for (int i = 0; i < source.EntityList.length; i++) {
                this.EntityList[i] = new String(source.EntityList[i]);
            }
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
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
        if (source.LogFormat != null) {
            this.LogFormat = new LogFormat(source.LogFormat);
        }
        if (source.CLS != null) {
            this.CLS = new CLSTopic(source.CLS);
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
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "EntityList.", this.EntityList);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamArraySimple(map, prefix + "Fields.", this.Fields);
        this.setParamArrayObj(map, prefix + "CustomFields.", this.CustomFields);
        this.setParamArrayObj(map, prefix + "DeliveryConditions.", this.DeliveryConditions);
        this.setParamSimple(map, prefix + "Sample", this.Sample);
        this.setParamObj(map, prefix + "LogFormat.", this.LogFormat);
        this.setParamObj(map, prefix + "CLS.", this.CLS);
        this.setParamObj(map, prefix + "CustomEndpoint.", this.CustomEndpoint);
        this.setParamObj(map, prefix + "S3.", this.S3);

    }
}

