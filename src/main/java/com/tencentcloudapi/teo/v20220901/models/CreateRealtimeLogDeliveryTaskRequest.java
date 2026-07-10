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

public class CreateRealtimeLogDeliveryTaskRequest extends AbstractModel {

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>数据投递区域，可选值：<ul><li>mainland：中国大陆境内；</li><li>overseas：全球（不含中国大陆）。</li></ul></p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>数据投递类型，可选值：<ul><li>l7-access-logs：七层访问日志；</li><li>application：四层代理日志；</li><li>function：边缘函数运行日志；</li><li>web-attack：托管规则日志；</li></ul>以下类型日志合并入 l7-access-logs，不再支持新增：</p><ul><li>domain：站点加速日志；</li><li>web-rateLiming：速率限制和 CC 攻击防护日志；</li><li>web-rule：自定义规则日志；</li><li>web-bot：Bot 管理日志。</li></ul>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>实时日志投递任务的名称，格式为数字、英文、-和_组合，最多 200 个字符。</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>实时日志投递任务类型，取值有：<ul><li>cls: 推送到腾讯云 CLS；</li><li>custom_endpoint：推送到自定义 HTTP(S) 地址；</li><li>s3：推送到 AWS S3 兼容存储桶地址；</li><li>log_analysis：推送到 EdgeOne 日志分析，仅当 LogType = l7-access-logs 或 web-attack 时支持。</li></ul></p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>实时日志投递任务对应的实体列表。取值示例如下：<ul><li>七层域名：domain.example.com</li><li>四层代理实例：sid-2s69eb5wcms7</li><li>边缘函数实例：test-zone-2mxigizoh9l9-1257626257</li></ul></p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1552/103413">DescribeL4Proxy</a></p>
    */
    @SerializedName("EntityList")
    @Expose
    private String [] EntityList;

    /**
    * <p>投递的预设字段列表。取值参考：<ul><li><a href="https://cloud.tencent.com/document/product/1552/105791">七层访问日志（站点加速日志）</a></li><li><a href="https://cloud.tencent.com/document/product/1552/105792">四层代理日志</a></li><li><a href="https://cloud.tencent.com/document/product/1552/115585">边缘函数运行日志</a></li></ul></p><p>取值参考：DescribeLogFields</p>
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
    * <p>投递的自定义字段列表，支持在 HTTP 请求头、响应头、Cookie、请求正文中提取指定内容。<br>自定义字段名称不能重复，仅七层访问日志（LogType= l7-access-logs 或 domain）支持添加自定义字段。<br>允许配置的自定义字段个数有配额限制，如遇配额不足请 [联系我们](https://cloud.tencent.com/online-service?from=sales&amp;source=PRESALE)。</p>
    */
    @SerializedName("CustomFields")
    @Expose
    private CustomField [] CustomFields;

    /**
    * <p>日志投递的过滤条件，不填表示投递全量日志。</p>
    */
    @SerializedName("DeliveryConditions")
    @Expose
    private DeliveryCondition [] DeliveryConditions;

    /**
    * <p>采样比例，采用千分制，取值范围为1-1000，例如：填写 605 表示采样比例为 60.5%。不填表示采样比例为 100%。</p>
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
    * <p>CLS 的配置信息。当 TaskType 取值为 cls 时，该参数必填。</p>
    */
    @SerializedName("CLS")
    @Expose
    private CLSTopic CLS;

    /**
    * <p>自定义 HTTP 服务的配置信息。当 TaskType 取值为 custom_endpoint 时，该参数必填。</p>
    */
    @SerializedName("CustomEndpoint")
    @Expose
    private CustomEndpoint CustomEndpoint;

    /**
    * <p>AWS S3 兼容存储桶的配置信息。当 TaskType 取值为 s3 时，该参数必填。</p>
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
     * Get <p>数据投递区域，可选值：<ul><li>mainland：中国大陆境内；</li><li>overseas：全球（不含中国大陆）。</li></ul></p> 
     * @return Area <p>数据投递区域，可选值：<ul><li>mainland：中国大陆境内；</li><li>overseas：全球（不含中国大陆）。</li></ul></p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>数据投递区域，可选值：<ul><li>mainland：中国大陆境内；</li><li>overseas：全球（不含中国大陆）。</li></ul></p>
     * @param Area <p>数据投递区域，可选值：<ul><li>mainland：中国大陆境内；</li><li>overseas：全球（不含中国大陆）。</li></ul></p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>数据投递类型，可选值：<ul><li>l7-access-logs：七层访问日志；</li><li>application：四层代理日志；</li><li>function：边缘函数运行日志；</li><li>web-attack：托管规则日志；</li></ul>以下类型日志合并入 l7-access-logs，不再支持新增：</p><ul><li>domain：站点加速日志；</li><li>web-rateLiming：速率限制和 CC 攻击防护日志；</li><li>web-rule：自定义规则日志；</li><li>web-bot：Bot 管理日志。</li></ul> 
     * @return LogType <p>数据投递类型，可选值：<ul><li>l7-access-logs：七层访问日志；</li><li>application：四层代理日志；</li><li>function：边缘函数运行日志；</li><li>web-attack：托管规则日志；</li></ul>以下类型日志合并入 l7-access-logs，不再支持新增：</p><ul><li>domain：站点加速日志；</li><li>web-rateLiming：速率限制和 CC 攻击防护日志；</li><li>web-rule：自定义规则日志；</li><li>web-bot：Bot 管理日志。</li></ul>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>数据投递类型，可选值：<ul><li>l7-access-logs：七层访问日志；</li><li>application：四层代理日志；</li><li>function：边缘函数运行日志；</li><li>web-attack：托管规则日志；</li></ul>以下类型日志合并入 l7-access-logs，不再支持新增：</p><ul><li>domain：站点加速日志；</li><li>web-rateLiming：速率限制和 CC 攻击防护日志；</li><li>web-rule：自定义规则日志；</li><li>web-bot：Bot 管理日志。</li></ul>
     * @param LogType <p>数据投递类型，可选值：<ul><li>l7-access-logs：七层访问日志；</li><li>application：四层代理日志；</li><li>function：边缘函数运行日志；</li><li>web-attack：托管规则日志；</li></ul>以下类型日志合并入 l7-access-logs，不再支持新增：</p><ul><li>domain：站点加速日志；</li><li>web-rateLiming：速率限制和 CC 攻击防护日志；</li><li>web-rule：自定义规则日志；</li><li>web-bot：Bot 管理日志。</li></ul>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>实时日志投递任务的名称，格式为数字、英文、-和_组合，最多 200 个字符。</p> 
     * @return TaskName <p>实时日志投递任务的名称，格式为数字、英文、-和_组合，最多 200 个字符。</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>实时日志投递任务的名称，格式为数字、英文、-和_组合，最多 200 个字符。</p>
     * @param TaskName <p>实时日志投递任务的名称，格式为数字、英文、-和_组合，最多 200 个字符。</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>实时日志投递任务类型，取值有：<ul><li>cls: 推送到腾讯云 CLS；</li><li>custom_endpoint：推送到自定义 HTTP(S) 地址；</li><li>s3：推送到 AWS S3 兼容存储桶地址；</li><li>log_analysis：推送到 EdgeOne 日志分析，仅当 LogType = l7-access-logs 或 web-attack 时支持。</li></ul></p> 
     * @return TaskType <p>实时日志投递任务类型，取值有：<ul><li>cls: 推送到腾讯云 CLS；</li><li>custom_endpoint：推送到自定义 HTTP(S) 地址；</li><li>s3：推送到 AWS S3 兼容存储桶地址；</li><li>log_analysis：推送到 EdgeOne 日志分析，仅当 LogType = l7-access-logs 或 web-attack 时支持。</li></ul></p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>实时日志投递任务类型，取值有：<ul><li>cls: 推送到腾讯云 CLS；</li><li>custom_endpoint：推送到自定义 HTTP(S) 地址；</li><li>s3：推送到 AWS S3 兼容存储桶地址；</li><li>log_analysis：推送到 EdgeOne 日志分析，仅当 LogType = l7-access-logs 或 web-attack 时支持。</li></ul></p>
     * @param TaskType <p>实时日志投递任务类型，取值有：<ul><li>cls: 推送到腾讯云 CLS；</li><li>custom_endpoint：推送到自定义 HTTP(S) 地址；</li><li>s3：推送到 AWS S3 兼容存储桶地址；</li><li>log_analysis：推送到 EdgeOne 日志分析，仅当 LogType = l7-access-logs 或 web-attack 时支持。</li></ul></p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>实时日志投递任务对应的实体列表。取值示例如下：<ul><li>七层域名：domain.example.com</li><li>四层代理实例：sid-2s69eb5wcms7</li><li>边缘函数实例：test-zone-2mxigizoh9l9-1257626257</li></ul></p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1552/103413">DescribeL4Proxy</a></p> 
     * @return EntityList <p>实时日志投递任务对应的实体列表。取值示例如下：<ul><li>七层域名：domain.example.com</li><li>四层代理实例：sid-2s69eb5wcms7</li><li>边缘函数实例：test-zone-2mxigizoh9l9-1257626257</li></ul></p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1552/103413">DescribeL4Proxy</a></p>
     */
    public String [] getEntityList() {
        return this.EntityList;
    }

    /**
     * Set <p>实时日志投递任务对应的实体列表。取值示例如下：<ul><li>七层域名：domain.example.com</li><li>四层代理实例：sid-2s69eb5wcms7</li><li>边缘函数实例：test-zone-2mxigizoh9l9-1257626257</li></ul></p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1552/103413">DescribeL4Proxy</a></p>
     * @param EntityList <p>实时日志投递任务对应的实体列表。取值示例如下：<ul><li>七层域名：domain.example.com</li><li>四层代理实例：sid-2s69eb5wcms7</li><li>边缘函数实例：test-zone-2mxigizoh9l9-1257626257</li></ul></p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1552/103413">DescribeL4Proxy</a></p>
     */
    public void setEntityList(String [] EntityList) {
        this.EntityList = EntityList;
    }

    /**
     * Get <p>投递的预设字段列表。取值参考：<ul><li><a href="https://cloud.tencent.com/document/product/1552/105791">七层访问日志（站点加速日志）</a></li><li><a href="https://cloud.tencent.com/document/product/1552/105792">四层代理日志</a></li><li><a href="https://cloud.tencent.com/document/product/1552/115585">边缘函数运行日志</a></li></ul></p><p>取值参考：DescribeLogFields</p> 
     * @return Fields <p>投递的预设字段列表。取值参考：<ul><li><a href="https://cloud.tencent.com/document/product/1552/105791">七层访问日志（站点加速日志）</a></li><li><a href="https://cloud.tencent.com/document/product/1552/105792">四层代理日志</a></li><li><a href="https://cloud.tencent.com/document/product/1552/115585">边缘函数运行日志</a></li></ul></p><p>取值参考：DescribeLogFields</p>
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set <p>投递的预设字段列表。取值参考：<ul><li><a href="https://cloud.tencent.com/document/product/1552/105791">七层访问日志（站点加速日志）</a></li><li><a href="https://cloud.tencent.com/document/product/1552/105792">四层代理日志</a></li><li><a href="https://cloud.tencent.com/document/product/1552/115585">边缘函数运行日志</a></li></ul></p><p>取值参考：DescribeLogFields</p>
     * @param Fields <p>投递的预设字段列表。取值参考：<ul><li><a href="https://cloud.tencent.com/document/product/1552/105791">七层访问日志（站点加速日志）</a></li><li><a href="https://cloud.tencent.com/document/product/1552/105792">四层代理日志</a></li><li><a href="https://cloud.tencent.com/document/product/1552/115585">边缘函数运行日志</a></li></ul></p><p>取值参考：DescribeLogFields</p>
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get <p>投递的自定义字段列表，支持在 HTTP 请求头、响应头、Cookie、请求正文中提取指定内容。<br>自定义字段名称不能重复，仅七层访问日志（LogType= l7-access-logs 或 domain）支持添加自定义字段。<br>允许配置的自定义字段个数有配额限制，如遇配额不足请 [联系我们](https://cloud.tencent.com/online-service?from=sales&amp;source=PRESALE)。</p> 
     * @return CustomFields <p>投递的自定义字段列表，支持在 HTTP 请求头、响应头、Cookie、请求正文中提取指定内容。<br>自定义字段名称不能重复，仅七层访问日志（LogType= l7-access-logs 或 domain）支持添加自定义字段。<br>允许配置的自定义字段个数有配额限制，如遇配额不足请 [联系我们](https://cloud.tencent.com/online-service?from=sales&amp;source=PRESALE)。</p>
     */
    public CustomField [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set <p>投递的自定义字段列表，支持在 HTTP 请求头、响应头、Cookie、请求正文中提取指定内容。<br>自定义字段名称不能重复，仅七层访问日志（LogType= l7-access-logs 或 domain）支持添加自定义字段。<br>允许配置的自定义字段个数有配额限制，如遇配额不足请 [联系我们](https://cloud.tencent.com/online-service?from=sales&amp;source=PRESALE)。</p>
     * @param CustomFields <p>投递的自定义字段列表，支持在 HTTP 请求头、响应头、Cookie、请求正文中提取指定内容。<br>自定义字段名称不能重复，仅七层访问日志（LogType= l7-access-logs 或 domain）支持添加自定义字段。<br>允许配置的自定义字段个数有配额限制，如遇配额不足请 [联系我们](https://cloud.tencent.com/online-service?from=sales&amp;source=PRESALE)。</p>
     */
    public void setCustomFields(CustomField [] CustomFields) {
        this.CustomFields = CustomFields;
    }

    /**
     * Get <p>日志投递的过滤条件，不填表示投递全量日志。</p> 
     * @return DeliveryConditions <p>日志投递的过滤条件，不填表示投递全量日志。</p>
     */
    public DeliveryCondition [] getDeliveryConditions() {
        return this.DeliveryConditions;
    }

    /**
     * Set <p>日志投递的过滤条件，不填表示投递全量日志。</p>
     * @param DeliveryConditions <p>日志投递的过滤条件，不填表示投递全量日志。</p>
     */
    public void setDeliveryConditions(DeliveryCondition [] DeliveryConditions) {
        this.DeliveryConditions = DeliveryConditions;
    }

    /**
     * Get <p>采样比例，采用千分制，取值范围为1-1000，例如：填写 605 表示采样比例为 60.5%。不填表示采样比例为 100%。</p> 
     * @return Sample <p>采样比例，采用千分制，取值范围为1-1000，例如：填写 605 表示采样比例为 60.5%。不填表示采样比例为 100%。</p>
     */
    public Long getSample() {
        return this.Sample;
    }

    /**
     * Set <p>采样比例，采用千分制，取值范围为1-1000，例如：填写 605 表示采样比例为 60.5%。不填表示采样比例为 100%。</p>
     * @param Sample <p>采样比例，采用千分制，取值范围为1-1000，例如：填写 605 表示采样比例为 60.5%。不填表示采样比例为 100%。</p>
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
     * Get <p>CLS 的配置信息。当 TaskType 取值为 cls 时，该参数必填。</p> 
     * @return CLS <p>CLS 的配置信息。当 TaskType 取值为 cls 时，该参数必填。</p>
     */
    public CLSTopic getCLS() {
        return this.CLS;
    }

    /**
     * Set <p>CLS 的配置信息。当 TaskType 取值为 cls 时，该参数必填。</p>
     * @param CLS <p>CLS 的配置信息。当 TaskType 取值为 cls 时，该参数必填。</p>
     */
    public void setCLS(CLSTopic CLS) {
        this.CLS = CLS;
    }

    /**
     * Get <p>自定义 HTTP 服务的配置信息。当 TaskType 取值为 custom_endpoint 时，该参数必填。</p> 
     * @return CustomEndpoint <p>自定义 HTTP 服务的配置信息。当 TaskType 取值为 custom_endpoint 时，该参数必填。</p>
     */
    public CustomEndpoint getCustomEndpoint() {
        return this.CustomEndpoint;
    }

    /**
     * Set <p>自定义 HTTP 服务的配置信息。当 TaskType 取值为 custom_endpoint 时，该参数必填。</p>
     * @param CustomEndpoint <p>自定义 HTTP 服务的配置信息。当 TaskType 取值为 custom_endpoint 时，该参数必填。</p>
     */
    public void setCustomEndpoint(CustomEndpoint CustomEndpoint) {
        this.CustomEndpoint = CustomEndpoint;
    }

    /**
     * Get <p>AWS S3 兼容存储桶的配置信息。当 TaskType 取值为 s3 时，该参数必填。</p> 
     * @return S3 <p>AWS S3 兼容存储桶的配置信息。当 TaskType 取值为 s3 时，该参数必填。</p>
     */
    public S3 getS3() {
        return this.S3;
    }

    /**
     * Set <p>AWS S3 兼容存储桶的配置信息。当 TaskType 取值为 s3 时，该参数必填。</p>
     * @param S3 <p>AWS S3 兼容存储桶的配置信息。当 TaskType 取值为 s3 时，该参数必填。</p>
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
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
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
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "EntityList.", this.EntityList);
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

