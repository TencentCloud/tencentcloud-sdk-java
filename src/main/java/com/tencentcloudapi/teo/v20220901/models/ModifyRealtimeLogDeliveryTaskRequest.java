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

public class ModifyRealtimeLogDeliveryTaskRequest extends AbstractModel {

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>实时日志投递任务 ID。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>实时日志投递任务的名称，格式为数字、英文、-和_组合，最多 200 个字符。不填保持原有配置。</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>实时日志投递任务的状态，取值有：</p><li>enabled: 启用；</li><li>disabled: 停用。</li>不填保持原有配置。
    */
    @SerializedName("DeliveryStatus")
    @Expose
    private String DeliveryStatus;

    /**
    * <p>实时日志投递任务对应的实体（七层域名或者四层代理实例）列表。取值示例如下：</p><li>七层域名：domain.example.com；</li><li>四层代理实例：sid-2s69eb5wcms7。</li>不填保持原有配置。<p>取值参考：<a href="https://cloud.tencent.com/document/api/1552/80690">DescribeApplicationProxies</a></p>
    */
    @SerializedName("EntityList")
    @Expose
    private String [] EntityList;

    /**
    * <p>投递的预设字段列表。不填保持原有配置。</p><p>取值参考：DescribeLogFields</p>
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
    * <p>投递的自定义日志字段列表，可以通过自定义日志推送字段名称和取值表达式，实现个性化的实时日志内容推送，详见 <a href="">自定义日志字段表达式</a>。<br>仅七层访问日志（LogType= l7-access-logs 或 domain）支持添加自定义字段，允许配置的自定义字段个数有配额限制，如遇配额不足请 <a href="https://cloud.tencent.com/online-service?from=sales&amp;source=PRESALE">联系我们</a> 。</p>
    */
    @SerializedName("CustomFields")
    @Expose
    private CustomField [] CustomFields;

    /**
    * <p>投递的自定义表达式字段列表，可以通过自定义日志推送字段名称和取值表达式，实现个性化的实时日志内容推送，使用详情见 [自定义日志字段表达式]()。<br>仅七层访问日志（LogType= l7-access-logs 或 domain）支持添加自定义字段。允许配置的自定义字段个数有配额限制，如遇配额不足请 [联系我们](https://cloud.tencent.com/online-service?from=sales&amp;source=PRESALE) 。<br>**注意**：若 CustomExpressionFields 中存在命名 与 Fields 和 CustomFields 中同名的字段，以  CustomExpressionFields 中的取值为准。</p>
    */
    @SerializedName("CustomExpressionFields")
    @Expose
    private CustomExpressionField [] CustomExpressionFields;

    /**
    * <p>日志投递的过滤条件。不填表示投递全量日志。</p>
    */
    @SerializedName("DeliveryConditions")
    @Expose
    private DeliveryCondition [] DeliveryConditions;

    /**
    * <p>采样比例，采用千分制，取值范围为1-1000，例如：填写 605 表示采样比例为 60.5%。不填保持原有配置。</p>
    */
    @SerializedName("Sample")
    @Expose
    private Long Sample;

    /**
    * <p>日志投递的输出格式，使用详情见 <a href="https://cloud.tencent.com/document/product/1552/110448">自定义日志输出格式</a>。不填表示为默认格式，默认格式逻辑如下：<ul><li>当 TaskType 取值为 custom_endpoint 时，默认格式为多个 JSON 对象组成的数组，每个 JSON 对象为一条日志；</li><li>当 TaskType 取值为 s3 时，默认格式为 JSON Lines；</li></ul>特别地，当 TaskType 取值为 cls 或 log_analysis 时，LogFormat.FormatType 的值只能为 json，且 LogFormat 中其他参数将被忽略，建议不传 LogFormat。</p>
    */
    @SerializedName("LogFormat")
    @Expose
    private LogFormat LogFormat;

    /**
    * <p>自定义 HTTP 服务的配置信息，不填保持原有配置。</p>
    */
    @SerializedName("CustomEndpoint")
    @Expose
    private CustomEndpoint CustomEndpoint;

    /**
    * <p>AWS S3 兼容存储桶的配置信息，不填保持原有配置。</p>
    */
    @SerializedName("S3")
    @Expose
    private S3 S3;

    /**
     * Get <p>站点 ID。</p> 
     * @return ZoneId <p>站点 ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID。</p>
     * @param ZoneId <p>站点 ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

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
     * Get <p>实时日志投递任务的名称，格式为数字、英文、-和_组合，最多 200 个字符。不填保持原有配置。</p> 
     * @return TaskName <p>实时日志投递任务的名称，格式为数字、英文、-和_组合，最多 200 个字符。不填保持原有配置。</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>实时日志投递任务的名称，格式为数字、英文、-和_组合，最多 200 个字符。不填保持原有配置。</p>
     * @param TaskName <p>实时日志投递任务的名称，格式为数字、英文、-和_组合，最多 200 个字符。不填保持原有配置。</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>实时日志投递任务的状态，取值有：</p><li>enabled: 启用；</li><li>disabled: 停用。</li>不填保持原有配置。 
     * @return DeliveryStatus <p>实时日志投递任务的状态，取值有：</p><li>enabled: 启用；</li><li>disabled: 停用。</li>不填保持原有配置。
     */
    public String getDeliveryStatus() {
        return this.DeliveryStatus;
    }

    /**
     * Set <p>实时日志投递任务的状态，取值有：</p><li>enabled: 启用；</li><li>disabled: 停用。</li>不填保持原有配置。
     * @param DeliveryStatus <p>实时日志投递任务的状态，取值有：</p><li>enabled: 启用；</li><li>disabled: 停用。</li>不填保持原有配置。
     */
    public void setDeliveryStatus(String DeliveryStatus) {
        this.DeliveryStatus = DeliveryStatus;
    }

    /**
     * Get <p>实时日志投递任务对应的实体（七层域名或者四层代理实例）列表。取值示例如下：</p><li>七层域名：domain.example.com；</li><li>四层代理实例：sid-2s69eb5wcms7。</li>不填保持原有配置。<p>取值参考：<a href="https://cloud.tencent.com/document/api/1552/80690">DescribeApplicationProxies</a></p> 
     * @return EntityList <p>实时日志投递任务对应的实体（七层域名或者四层代理实例）列表。取值示例如下：</p><li>七层域名：domain.example.com；</li><li>四层代理实例：sid-2s69eb5wcms7。</li>不填保持原有配置。<p>取值参考：<a href="https://cloud.tencent.com/document/api/1552/80690">DescribeApplicationProxies</a></p>
     */
    public String [] getEntityList() {
        return this.EntityList;
    }

    /**
     * Set <p>实时日志投递任务对应的实体（七层域名或者四层代理实例）列表。取值示例如下：</p><li>七层域名：domain.example.com；</li><li>四层代理实例：sid-2s69eb5wcms7。</li>不填保持原有配置。<p>取值参考：<a href="https://cloud.tencent.com/document/api/1552/80690">DescribeApplicationProxies</a></p>
     * @param EntityList <p>实时日志投递任务对应的实体（七层域名或者四层代理实例）列表。取值示例如下：</p><li>七层域名：domain.example.com；</li><li>四层代理实例：sid-2s69eb5wcms7。</li>不填保持原有配置。<p>取值参考：<a href="https://cloud.tencent.com/document/api/1552/80690">DescribeApplicationProxies</a></p>
     */
    public void setEntityList(String [] EntityList) {
        this.EntityList = EntityList;
    }

    /**
     * Get <p>投递的预设字段列表。不填保持原有配置。</p><p>取值参考：DescribeLogFields</p> 
     * @return Fields <p>投递的预设字段列表。不填保持原有配置。</p><p>取值参考：DescribeLogFields</p>
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set <p>投递的预设字段列表。不填保持原有配置。</p><p>取值参考：DescribeLogFields</p>
     * @param Fields <p>投递的预设字段列表。不填保持原有配置。</p><p>取值参考：DescribeLogFields</p>
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get <p>投递的自定义日志字段列表，可以通过自定义日志推送字段名称和取值表达式，实现个性化的实时日志内容推送，详见 <a href="">自定义日志字段表达式</a>。<br>仅七层访问日志（LogType= l7-access-logs 或 domain）支持添加自定义字段，允许配置的自定义字段个数有配额限制，如遇配额不足请 <a href="https://cloud.tencent.com/online-service?from=sales&amp;source=PRESALE">联系我们</a> 。</p> 
     * @return CustomFields <p>投递的自定义日志字段列表，可以通过自定义日志推送字段名称和取值表达式，实现个性化的实时日志内容推送，详见 <a href="">自定义日志字段表达式</a>。<br>仅七层访问日志（LogType= l7-access-logs 或 domain）支持添加自定义字段，允许配置的自定义字段个数有配额限制，如遇配额不足请 <a href="https://cloud.tencent.com/online-service?from=sales&amp;source=PRESALE">联系我们</a> 。</p>
     */
    public CustomField [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set <p>投递的自定义日志字段列表，可以通过自定义日志推送字段名称和取值表达式，实现个性化的实时日志内容推送，详见 <a href="">自定义日志字段表达式</a>。<br>仅七层访问日志（LogType= l7-access-logs 或 domain）支持添加自定义字段，允许配置的自定义字段个数有配额限制，如遇配额不足请 <a href="https://cloud.tencent.com/online-service?from=sales&amp;source=PRESALE">联系我们</a> 。</p>
     * @param CustomFields <p>投递的自定义日志字段列表，可以通过自定义日志推送字段名称和取值表达式，实现个性化的实时日志内容推送，详见 <a href="">自定义日志字段表达式</a>。<br>仅七层访问日志（LogType= l7-access-logs 或 domain）支持添加自定义字段，允许配置的自定义字段个数有配额限制，如遇配额不足请 <a href="https://cloud.tencent.com/online-service?from=sales&amp;source=PRESALE">联系我们</a> 。</p>
     */
    public void setCustomFields(CustomField [] CustomFields) {
        this.CustomFields = CustomFields;
    }

    /**
     * Get <p>投递的自定义表达式字段列表，可以通过自定义日志推送字段名称和取值表达式，实现个性化的实时日志内容推送，使用详情见 [自定义日志字段表达式]()。<br>仅七层访问日志（LogType= l7-access-logs 或 domain）支持添加自定义字段。允许配置的自定义字段个数有配额限制，如遇配额不足请 [联系我们](https://cloud.tencent.com/online-service?from=sales&amp;source=PRESALE) 。<br>**注意**：若 CustomExpressionFields 中存在命名 与 Fields 和 CustomFields 中同名的字段，以  CustomExpressionFields 中的取值为准。</p> 
     * @return CustomExpressionFields <p>投递的自定义表达式字段列表，可以通过自定义日志推送字段名称和取值表达式，实现个性化的实时日志内容推送，使用详情见 [自定义日志字段表达式]()。<br>仅七层访问日志（LogType= l7-access-logs 或 domain）支持添加自定义字段。允许配置的自定义字段个数有配额限制，如遇配额不足请 [联系我们](https://cloud.tencent.com/online-service?from=sales&amp;source=PRESALE) 。<br>**注意**：若 CustomExpressionFields 中存在命名 与 Fields 和 CustomFields 中同名的字段，以  CustomExpressionFields 中的取值为准。</p>
     */
    public CustomExpressionField [] getCustomExpressionFields() {
        return this.CustomExpressionFields;
    }

    /**
     * Set <p>投递的自定义表达式字段列表，可以通过自定义日志推送字段名称和取值表达式，实现个性化的实时日志内容推送，使用详情见 [自定义日志字段表达式]()。<br>仅七层访问日志（LogType= l7-access-logs 或 domain）支持添加自定义字段。允许配置的自定义字段个数有配额限制，如遇配额不足请 [联系我们](https://cloud.tencent.com/online-service?from=sales&amp;source=PRESALE) 。<br>**注意**：若 CustomExpressionFields 中存在命名 与 Fields 和 CustomFields 中同名的字段，以  CustomExpressionFields 中的取值为准。</p>
     * @param CustomExpressionFields <p>投递的自定义表达式字段列表，可以通过自定义日志推送字段名称和取值表达式，实现个性化的实时日志内容推送，使用详情见 [自定义日志字段表达式]()。<br>仅七层访问日志（LogType= l7-access-logs 或 domain）支持添加自定义字段。允许配置的自定义字段个数有配额限制，如遇配额不足请 [联系我们](https://cloud.tencent.com/online-service?from=sales&amp;source=PRESALE) 。<br>**注意**：若 CustomExpressionFields 中存在命名 与 Fields 和 CustomFields 中同名的字段，以  CustomExpressionFields 中的取值为准。</p>
     */
    public void setCustomExpressionFields(CustomExpressionField [] CustomExpressionFields) {
        this.CustomExpressionFields = CustomExpressionFields;
    }

    /**
     * Get <p>日志投递的过滤条件。不填表示投递全量日志。</p> 
     * @return DeliveryConditions <p>日志投递的过滤条件。不填表示投递全量日志。</p>
     */
    public DeliveryCondition [] getDeliveryConditions() {
        return this.DeliveryConditions;
    }

    /**
     * Set <p>日志投递的过滤条件。不填表示投递全量日志。</p>
     * @param DeliveryConditions <p>日志投递的过滤条件。不填表示投递全量日志。</p>
     */
    public void setDeliveryConditions(DeliveryCondition [] DeliveryConditions) {
        this.DeliveryConditions = DeliveryConditions;
    }

    /**
     * Get <p>采样比例，采用千分制，取值范围为1-1000，例如：填写 605 表示采样比例为 60.5%。不填保持原有配置。</p> 
     * @return Sample <p>采样比例，采用千分制，取值范围为1-1000，例如：填写 605 表示采样比例为 60.5%。不填保持原有配置。</p>
     */
    public Long getSample() {
        return this.Sample;
    }

    /**
     * Set <p>采样比例，采用千分制，取值范围为1-1000，例如：填写 605 表示采样比例为 60.5%。不填保持原有配置。</p>
     * @param Sample <p>采样比例，采用千分制，取值范围为1-1000，例如：填写 605 表示采样比例为 60.5%。不填保持原有配置。</p>
     */
    public void setSample(Long Sample) {
        this.Sample = Sample;
    }

    /**
     * Get <p>日志投递的输出格式，使用详情见 <a href="https://cloud.tencent.com/document/product/1552/110448">自定义日志输出格式</a>。不填表示为默认格式，默认格式逻辑如下：<ul><li>当 TaskType 取值为 custom_endpoint 时，默认格式为多个 JSON 对象组成的数组，每个 JSON 对象为一条日志；</li><li>当 TaskType 取值为 s3 时，默认格式为 JSON Lines；</li></ul>特别地，当 TaskType 取值为 cls 或 log_analysis 时，LogFormat.FormatType 的值只能为 json，且 LogFormat 中其他参数将被忽略，建议不传 LogFormat。</p> 
     * @return LogFormat <p>日志投递的输出格式，使用详情见 <a href="https://cloud.tencent.com/document/product/1552/110448">自定义日志输出格式</a>。不填表示为默认格式，默认格式逻辑如下：<ul><li>当 TaskType 取值为 custom_endpoint 时，默认格式为多个 JSON 对象组成的数组，每个 JSON 对象为一条日志；</li><li>当 TaskType 取值为 s3 时，默认格式为 JSON Lines；</li></ul>特别地，当 TaskType 取值为 cls 或 log_analysis 时，LogFormat.FormatType 的值只能为 json，且 LogFormat 中其他参数将被忽略，建议不传 LogFormat。</p>
     */
    public LogFormat getLogFormat() {
        return this.LogFormat;
    }

    /**
     * Set <p>日志投递的输出格式，使用详情见 <a href="https://cloud.tencent.com/document/product/1552/110448">自定义日志输出格式</a>。不填表示为默认格式，默认格式逻辑如下：<ul><li>当 TaskType 取值为 custom_endpoint 时，默认格式为多个 JSON 对象组成的数组，每个 JSON 对象为一条日志；</li><li>当 TaskType 取值为 s3 时，默认格式为 JSON Lines；</li></ul>特别地，当 TaskType 取值为 cls 或 log_analysis 时，LogFormat.FormatType 的值只能为 json，且 LogFormat 中其他参数将被忽略，建议不传 LogFormat。</p>
     * @param LogFormat <p>日志投递的输出格式，使用详情见 <a href="https://cloud.tencent.com/document/product/1552/110448">自定义日志输出格式</a>。不填表示为默认格式，默认格式逻辑如下：<ul><li>当 TaskType 取值为 custom_endpoint 时，默认格式为多个 JSON 对象组成的数组，每个 JSON 对象为一条日志；</li><li>当 TaskType 取值为 s3 时，默认格式为 JSON Lines；</li></ul>特别地，当 TaskType 取值为 cls 或 log_analysis 时，LogFormat.FormatType 的值只能为 json，且 LogFormat 中其他参数将被忽略，建议不传 LogFormat。</p>
     */
    public void setLogFormat(LogFormat LogFormat) {
        this.LogFormat = LogFormat;
    }

    /**
     * Get <p>自定义 HTTP 服务的配置信息，不填保持原有配置。</p> 
     * @return CustomEndpoint <p>自定义 HTTP 服务的配置信息，不填保持原有配置。</p>
     */
    public CustomEndpoint getCustomEndpoint() {
        return this.CustomEndpoint;
    }

    /**
     * Set <p>自定义 HTTP 服务的配置信息，不填保持原有配置。</p>
     * @param CustomEndpoint <p>自定义 HTTP 服务的配置信息，不填保持原有配置。</p>
     */
    public void setCustomEndpoint(CustomEndpoint CustomEndpoint) {
        this.CustomEndpoint = CustomEndpoint;
    }

    /**
     * Get <p>AWS S3 兼容存储桶的配置信息，不填保持原有配置。</p> 
     * @return S3 <p>AWS S3 兼容存储桶的配置信息，不填保持原有配置。</p>
     */
    public S3 getS3() {
        return this.S3;
    }

    /**
     * Set <p>AWS S3 兼容存储桶的配置信息，不填保持原有配置。</p>
     * @param S3 <p>AWS S3 兼容存储桶的配置信息，不填保持原有配置。</p>
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
        if (source.CustomExpressionFields != null) {
            this.CustomExpressionFields = new CustomExpressionField[source.CustomExpressionFields.length];
            for (int i = 0; i < source.CustomExpressionFields.length; i++) {
                this.CustomExpressionFields[i] = new CustomExpressionField(source.CustomExpressionFields[i]);
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
        this.setParamArrayObj(map, prefix + "CustomExpressionFields.", this.CustomExpressionFields);
        this.setParamArrayObj(map, prefix + "DeliveryConditions.", this.DeliveryConditions);
        this.setParamSimple(map, prefix + "Sample", this.Sample);
        this.setParamObj(map, prefix + "LogFormat.", this.LogFormat);
        this.setParamObj(map, prefix + "CustomEndpoint.", this.CustomEndpoint);
        this.setParamObj(map, prefix + "S3.", this.S3);

    }
}

