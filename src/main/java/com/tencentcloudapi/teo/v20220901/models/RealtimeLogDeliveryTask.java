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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RealtimeLogDeliveryTask extends AbstractModel {

    /**
    * <p>实时日志投递任务 ID。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>实时日志投递任务的名称。</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>实时日志投递任务的状态，取值有： <li>enabled: 已启用；</li> <li>disabled: 已停用；</li><li>deleted: 异常删除状态，请检查目的地腾讯云 CLS 日志集/日志主题是否已被删除。</li></p>
    */
    @SerializedName("DeliveryStatus")
    @Expose
    private String DeliveryStatus;

    /**
    * <p>实时日志投递任务类型，取值有： <li>cls: 推送到腾讯云 CLS；</li> <li>custom_endpoint：推送到自定义 HTTP(S) 地址；</li> <li>s3：推送到 AWS S3 兼容存储桶地址；</li><li>log_analysis：推送到 EdgeOne 日志分析。</li></p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>实时日志投递任务对应的实体（七层域名或者四层代理实例）列表。取值示例如下： <li>七层域名：domain.example.com；</li> <li>四层代理实例：sid-2s69eb5wcms7。</li></p>
    */
    @SerializedName("EntityList")
    @Expose
    private String [] EntityList;

    /**
    * <p>数据投递类型，取值有： <li>l7-access-logs：七层访问日志；</li><li>application：四层代理日志；</li> <li>function：边缘函数运行日志；</li> <li>web-attack：托管规则日志；</li> <li>domain：站点加速日志；</li> <li>web-rateLiming：速率限制和 CC 攻击防护日志；</li><li>web-rule：自定义规则日志；</li> <li>web-bot：Bot 管理日志。</li></p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>数据投递区域，取值有： <li>mainland：中国大陆境内；</li> <li>overseas：全球（不含中国大陆）。</li></p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>投递的预设字段列表。</p>
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
    * <p>投递的自定义字段列表。</p>
    */
    @SerializedName("CustomFields")
    @Expose
    private CustomField [] CustomFields;

    /**
    * <p>日志投递的过滤条件。</p>
    */
    @SerializedName("DeliveryConditions")
    @Expose
    private DeliveryCondition [] DeliveryConditions;

    /**
    * <p>采样比例，采用千分制，取值范围为1-1000，例如：605 表示采样比例为 60.5%。</p>
    */
    @SerializedName("Sample")
    @Expose
    private Long Sample;

    /**
    * <p>日志投递的输出格式。出参为 null 时表示为默认格式，默认格式逻辑如下：</p><li>当 TaskType 取值为 custom_endpoint 时，默认格式为多个 JSON 对象组成的数组，每个 JSON 对象为一条日志；</li><li>当 TaskType 取值为 s3 时，默认格式为 JSON Lines。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogFormat")
    @Expose
    private LogFormat LogFormat;

    /**
    * <p>CLS 的配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CLS")
    @Expose
    private CLSTopic CLS;

    /**
    * <p>自定义 HTTP 服务的配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomEndpoint")
    @Expose
    private CustomEndpoint CustomEndpoint;

    /**
    * <p>AWS S3 兼容存储桶的配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("S3")
    @Expose
    private S3 S3;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>实时日志投递任务 ID。</p> 
     * @return TaskId <p>实时日志投递任务 ID。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>实时日志投递任务 ID。</p>
     * @param TaskId <p>实时日志投递任务 ID。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>实时日志投递任务的名称。</p> 
     * @return TaskName <p>实时日志投递任务的名称。</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>实时日志投递任务的名称。</p>
     * @param TaskName <p>实时日志投递任务的名称。</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>实时日志投递任务的状态，取值有： <li>enabled: 已启用；</li> <li>disabled: 已停用；</li><li>deleted: 异常删除状态，请检查目的地腾讯云 CLS 日志集/日志主题是否已被删除。</li></p> 
     * @return DeliveryStatus <p>实时日志投递任务的状态，取值有： <li>enabled: 已启用；</li> <li>disabled: 已停用；</li><li>deleted: 异常删除状态，请检查目的地腾讯云 CLS 日志集/日志主题是否已被删除。</li></p>
     */
    public String getDeliveryStatus() {
        return this.DeliveryStatus;
    }

    /**
     * Set <p>实时日志投递任务的状态，取值有： <li>enabled: 已启用；</li> <li>disabled: 已停用；</li><li>deleted: 异常删除状态，请检查目的地腾讯云 CLS 日志集/日志主题是否已被删除。</li></p>
     * @param DeliveryStatus <p>实时日志投递任务的状态，取值有： <li>enabled: 已启用；</li> <li>disabled: 已停用；</li><li>deleted: 异常删除状态，请检查目的地腾讯云 CLS 日志集/日志主题是否已被删除。</li></p>
     */
    public void setDeliveryStatus(String DeliveryStatus) {
        this.DeliveryStatus = DeliveryStatus;
    }

    /**
     * Get <p>实时日志投递任务类型，取值有： <li>cls: 推送到腾讯云 CLS；</li> <li>custom_endpoint：推送到自定义 HTTP(S) 地址；</li> <li>s3：推送到 AWS S3 兼容存储桶地址；</li><li>log_analysis：推送到 EdgeOne 日志分析。</li></p> 
     * @return TaskType <p>实时日志投递任务类型，取值有： <li>cls: 推送到腾讯云 CLS；</li> <li>custom_endpoint：推送到自定义 HTTP(S) 地址；</li> <li>s3：推送到 AWS S3 兼容存储桶地址；</li><li>log_analysis：推送到 EdgeOne 日志分析。</li></p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>实时日志投递任务类型，取值有： <li>cls: 推送到腾讯云 CLS；</li> <li>custom_endpoint：推送到自定义 HTTP(S) 地址；</li> <li>s3：推送到 AWS S3 兼容存储桶地址；</li><li>log_analysis：推送到 EdgeOne 日志分析。</li></p>
     * @param TaskType <p>实时日志投递任务类型，取值有： <li>cls: 推送到腾讯云 CLS；</li> <li>custom_endpoint：推送到自定义 HTTP(S) 地址；</li> <li>s3：推送到 AWS S3 兼容存储桶地址；</li><li>log_analysis：推送到 EdgeOne 日志分析。</li></p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>实时日志投递任务对应的实体（七层域名或者四层代理实例）列表。取值示例如下： <li>七层域名：domain.example.com；</li> <li>四层代理实例：sid-2s69eb5wcms7。</li></p> 
     * @return EntityList <p>实时日志投递任务对应的实体（七层域名或者四层代理实例）列表。取值示例如下： <li>七层域名：domain.example.com；</li> <li>四层代理实例：sid-2s69eb5wcms7。</li></p>
     */
    public String [] getEntityList() {
        return this.EntityList;
    }

    /**
     * Set <p>实时日志投递任务对应的实体（七层域名或者四层代理实例）列表。取值示例如下： <li>七层域名：domain.example.com；</li> <li>四层代理实例：sid-2s69eb5wcms7。</li></p>
     * @param EntityList <p>实时日志投递任务对应的实体（七层域名或者四层代理实例）列表。取值示例如下： <li>七层域名：domain.example.com；</li> <li>四层代理实例：sid-2s69eb5wcms7。</li></p>
     */
    public void setEntityList(String [] EntityList) {
        this.EntityList = EntityList;
    }

    /**
     * Get <p>数据投递类型，取值有： <li>l7-access-logs：七层访问日志；</li><li>application：四层代理日志；</li> <li>function：边缘函数运行日志；</li> <li>web-attack：托管规则日志；</li> <li>domain：站点加速日志；</li> <li>web-rateLiming：速率限制和 CC 攻击防护日志；</li><li>web-rule：自定义规则日志；</li> <li>web-bot：Bot 管理日志。</li></p> 
     * @return LogType <p>数据投递类型，取值有： <li>l7-access-logs：七层访问日志；</li><li>application：四层代理日志；</li> <li>function：边缘函数运行日志；</li> <li>web-attack：托管规则日志；</li> <li>domain：站点加速日志；</li> <li>web-rateLiming：速率限制和 CC 攻击防护日志；</li><li>web-rule：自定义规则日志；</li> <li>web-bot：Bot 管理日志。</li></p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>数据投递类型，取值有： <li>l7-access-logs：七层访问日志；</li><li>application：四层代理日志；</li> <li>function：边缘函数运行日志；</li> <li>web-attack：托管规则日志；</li> <li>domain：站点加速日志；</li> <li>web-rateLiming：速率限制和 CC 攻击防护日志；</li><li>web-rule：自定义规则日志；</li> <li>web-bot：Bot 管理日志。</li></p>
     * @param LogType <p>数据投递类型，取值有： <li>l7-access-logs：七层访问日志；</li><li>application：四层代理日志；</li> <li>function：边缘函数运行日志；</li> <li>web-attack：托管规则日志；</li> <li>domain：站点加速日志；</li> <li>web-rateLiming：速率限制和 CC 攻击防护日志；</li><li>web-rule：自定义规则日志；</li> <li>web-bot：Bot 管理日志。</li></p>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>数据投递区域，取值有： <li>mainland：中国大陆境内；</li> <li>overseas：全球（不含中国大陆）。</li></p> 
     * @return Area <p>数据投递区域，取值有： <li>mainland：中国大陆境内；</li> <li>overseas：全球（不含中国大陆）。</li></p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>数据投递区域，取值有： <li>mainland：中国大陆境内；</li> <li>overseas：全球（不含中国大陆）。</li></p>
     * @param Area <p>数据投递区域，取值有： <li>mainland：中国大陆境内；</li> <li>overseas：全球（不含中国大陆）。</li></p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>投递的预设字段列表。</p> 
     * @return Fields <p>投递的预设字段列表。</p>
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set <p>投递的预设字段列表。</p>
     * @param Fields <p>投递的预设字段列表。</p>
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get <p>投递的自定义字段列表。</p> 
     * @return CustomFields <p>投递的自定义字段列表。</p>
     */
    public CustomField [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set <p>投递的自定义字段列表。</p>
     * @param CustomFields <p>投递的自定义字段列表。</p>
     */
    public void setCustomFields(CustomField [] CustomFields) {
        this.CustomFields = CustomFields;
    }

    /**
     * Get <p>日志投递的过滤条件。</p> 
     * @return DeliveryConditions <p>日志投递的过滤条件。</p>
     */
    public DeliveryCondition [] getDeliveryConditions() {
        return this.DeliveryConditions;
    }

    /**
     * Set <p>日志投递的过滤条件。</p>
     * @param DeliveryConditions <p>日志投递的过滤条件。</p>
     */
    public void setDeliveryConditions(DeliveryCondition [] DeliveryConditions) {
        this.DeliveryConditions = DeliveryConditions;
    }

    /**
     * Get <p>采样比例，采用千分制，取值范围为1-1000，例如：605 表示采样比例为 60.5%。</p> 
     * @return Sample <p>采样比例，采用千分制，取值范围为1-1000，例如：605 表示采样比例为 60.5%。</p>
     */
    public Long getSample() {
        return this.Sample;
    }

    /**
     * Set <p>采样比例，采用千分制，取值范围为1-1000，例如：605 表示采样比例为 60.5%。</p>
     * @param Sample <p>采样比例，采用千分制，取值范围为1-1000，例如：605 表示采样比例为 60.5%。</p>
     */
    public void setSample(Long Sample) {
        this.Sample = Sample;
    }

    /**
     * Get <p>日志投递的输出格式。出参为 null 时表示为默认格式，默认格式逻辑如下：</p><li>当 TaskType 取值为 custom_endpoint 时，默认格式为多个 JSON 对象组成的数组，每个 JSON 对象为一条日志；</li><li>当 TaskType 取值为 s3 时，默认格式为 JSON Lines。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogFormat <p>日志投递的输出格式。出参为 null 时表示为默认格式，默认格式逻辑如下：</p><li>当 TaskType 取值为 custom_endpoint 时，默认格式为多个 JSON 对象组成的数组，每个 JSON 对象为一条日志；</li><li>当 TaskType 取值为 s3 时，默认格式为 JSON Lines。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogFormat getLogFormat() {
        return this.LogFormat;
    }

    /**
     * Set <p>日志投递的输出格式。出参为 null 时表示为默认格式，默认格式逻辑如下：</p><li>当 TaskType 取值为 custom_endpoint 时，默认格式为多个 JSON 对象组成的数组，每个 JSON 对象为一条日志；</li><li>当 TaskType 取值为 s3 时，默认格式为 JSON Lines。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogFormat <p>日志投递的输出格式。出参为 null 时表示为默认格式，默认格式逻辑如下：</p><li>当 TaskType 取值为 custom_endpoint 时，默认格式为多个 JSON 对象组成的数组，每个 JSON 对象为一条日志；</li><li>当 TaskType 取值为 s3 时，默认格式为 JSON Lines。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogFormat(LogFormat LogFormat) {
        this.LogFormat = LogFormat;
    }

    /**
     * Get <p>CLS 的配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CLS <p>CLS 的配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CLSTopic getCLS() {
        return this.CLS;
    }

    /**
     * Set <p>CLS 的配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CLS <p>CLS 的配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCLS(CLSTopic CLS) {
        this.CLS = CLS;
    }

    /**
     * Get <p>自定义 HTTP 服务的配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomEndpoint <p>自定义 HTTP 服务的配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CustomEndpoint getCustomEndpoint() {
        return this.CustomEndpoint;
    }

    /**
     * Set <p>自定义 HTTP 服务的配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomEndpoint <p>自定义 HTTP 服务的配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomEndpoint(CustomEndpoint CustomEndpoint) {
        this.CustomEndpoint = CustomEndpoint;
    }

    /**
     * Get <p>AWS S3 兼容存储桶的配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return S3 <p>AWS S3 兼容存储桶的配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public S3 getS3() {
        return this.S3;
    }

    /**
     * Set <p>AWS S3 兼容存储桶的配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param S3 <p>AWS S3 兼容存储桶的配置信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setS3(S3 S3) {
        this.S3 = S3;
    }

    /**
     * Get <p>创建时间。</p> 
     * @return CreateTime <p>创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreateTime <p>创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间。</p> 
     * @return UpdateTime <p>更新时间。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间。</p>
     * @param UpdateTime <p>更新时间。</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public RealtimeLogDeliveryTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RealtimeLogDeliveryTask(RealtimeLogDeliveryTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.DeliveryStatus != null) {
            this.DeliveryStatus = new String(source.DeliveryStatus);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "DeliveryStatus", this.DeliveryStatus);
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
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

