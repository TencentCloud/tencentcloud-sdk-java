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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCfwLogsRequest extends AbstractModel {

    /**
    * 日志类型。首次查询必填；使用 NextToken 续查时不能传。cfw_netflow_border=互联网边界流量，cfw_netflow_vpc=VPC 东西向流量，cfw_netflow_nat=NAT 防火墙流量，cfw_netflow_nta=NDR/NTA 流量，cfw_netflow_dns=DNS 防火墙日志，cfw_rule_threatinfo=入侵防御/威胁情报告警，cfw_rule_acl=互联网边界访问控制日志，cfw_rule_vpc_acl=VPC 访问控制日志，cfw_rule_nat_acl=NAT 访问控制日志，cfw_ndr_subject_risk=NDR 专题风险，cfw_ndr_dataleak_entry=NDR 敏感数据泄露，cfw_ndr_ai_audit=NDR AI 应用识别与大模型调用审计，cfw_feature_collect=统计特征与基线异常，cfw_behavior_collect=Beacon/DNS/端口/证书/VPC 互访行为，operate_log_all=操作审计日志。
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 日志过滤表达式。默认 * 表示不过滤；例如 src_ip:1.1.1.1。可查询字段随 LogType 变化，应优先使用对应 Items 中已返回的字段名，不要猜测不存在的字段；使用 NextToken 续查时不能传。
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 查询起始时间。支持 RFC3339、YYYY-MM-DD HH:MM:SS、YYYY-MM-DD 或 Unix 时间戳；传入后从该时间向后查询 TimeRange；使用 NextToken 续查时不能传。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询时间范围。默认 1h；格式为正整数加单位 m/h/d，例如 5m、1h、24h、7d；使用 NextToken 续查时不能传。
    */
    @SerializedName("TimeRange")
    @Expose
    private String TimeRange;

    /**
    * 单页返回条数。首次查询可选，默认 100；取值 1 至 1000；使用 NextToken 续查时不能传。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 上一页 Response.Data 返回的不透明续查 token。首次查询不传；续查时只传 NextToken。无效、篡改或租户不匹配会被拒绝。
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
     * Get 日志类型。首次查询必填；使用 NextToken 续查时不能传。cfw_netflow_border=互联网边界流量，cfw_netflow_vpc=VPC 东西向流量，cfw_netflow_nat=NAT 防火墙流量，cfw_netflow_nta=NDR/NTA 流量，cfw_netflow_dns=DNS 防火墙日志，cfw_rule_threatinfo=入侵防御/威胁情报告警，cfw_rule_acl=互联网边界访问控制日志，cfw_rule_vpc_acl=VPC 访问控制日志，cfw_rule_nat_acl=NAT 访问控制日志，cfw_ndr_subject_risk=NDR 专题风险，cfw_ndr_dataleak_entry=NDR 敏感数据泄露，cfw_ndr_ai_audit=NDR AI 应用识别与大模型调用审计，cfw_feature_collect=统计特征与基线异常，cfw_behavior_collect=Beacon/DNS/端口/证书/VPC 互访行为，operate_log_all=操作审计日志。 
     * @return LogType 日志类型。首次查询必填；使用 NextToken 续查时不能传。cfw_netflow_border=互联网边界流量，cfw_netflow_vpc=VPC 东西向流量，cfw_netflow_nat=NAT 防火墙流量，cfw_netflow_nta=NDR/NTA 流量，cfw_netflow_dns=DNS 防火墙日志，cfw_rule_threatinfo=入侵防御/威胁情报告警，cfw_rule_acl=互联网边界访问控制日志，cfw_rule_vpc_acl=VPC 访问控制日志，cfw_rule_nat_acl=NAT 访问控制日志，cfw_ndr_subject_risk=NDR 专题风险，cfw_ndr_dataleak_entry=NDR 敏感数据泄露，cfw_ndr_ai_audit=NDR AI 应用识别与大模型调用审计，cfw_feature_collect=统计特征与基线异常，cfw_behavior_collect=Beacon/DNS/端口/证书/VPC 互访行为，operate_log_all=操作审计日志。
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型。首次查询必填；使用 NextToken 续查时不能传。cfw_netflow_border=互联网边界流量，cfw_netflow_vpc=VPC 东西向流量，cfw_netflow_nat=NAT 防火墙流量，cfw_netflow_nta=NDR/NTA 流量，cfw_netflow_dns=DNS 防火墙日志，cfw_rule_threatinfo=入侵防御/威胁情报告警，cfw_rule_acl=互联网边界访问控制日志，cfw_rule_vpc_acl=VPC 访问控制日志，cfw_rule_nat_acl=NAT 访问控制日志，cfw_ndr_subject_risk=NDR 专题风险，cfw_ndr_dataleak_entry=NDR 敏感数据泄露，cfw_ndr_ai_audit=NDR AI 应用识别与大模型调用审计，cfw_feature_collect=统计特征与基线异常，cfw_behavior_collect=Beacon/DNS/端口/证书/VPC 互访行为，operate_log_all=操作审计日志。
     * @param LogType 日志类型。首次查询必填；使用 NextToken 续查时不能传。cfw_netflow_border=互联网边界流量，cfw_netflow_vpc=VPC 东西向流量，cfw_netflow_nat=NAT 防火墙流量，cfw_netflow_nta=NDR/NTA 流量，cfw_netflow_dns=DNS 防火墙日志，cfw_rule_threatinfo=入侵防御/威胁情报告警，cfw_rule_acl=互联网边界访问控制日志，cfw_rule_vpc_acl=VPC 访问控制日志，cfw_rule_nat_acl=NAT 访问控制日志，cfw_ndr_subject_risk=NDR 专题风险，cfw_ndr_dataleak_entry=NDR 敏感数据泄露，cfw_ndr_ai_audit=NDR AI 应用识别与大模型调用审计，cfw_feature_collect=统计特征与基线异常，cfw_behavior_collect=Beacon/DNS/端口/证书/VPC 互访行为，operate_log_all=操作审计日志。
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 日志过滤表达式。默认 * 表示不过滤；例如 src_ip:1.1.1.1。可查询字段随 LogType 变化，应优先使用对应 Items 中已返回的字段名，不要猜测不存在的字段；使用 NextToken 续查时不能传。 
     * @return Query 日志过滤表达式。默认 * 表示不过滤；例如 src_ip:1.1.1.1。可查询字段随 LogType 变化，应优先使用对应 Items 中已返回的字段名，不要猜测不存在的字段；使用 NextToken 续查时不能传。
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 日志过滤表达式。默认 * 表示不过滤；例如 src_ip:1.1.1.1。可查询字段随 LogType 变化，应优先使用对应 Items 中已返回的字段名，不要猜测不存在的字段；使用 NextToken 续查时不能传。
     * @param Query 日志过滤表达式。默认 * 表示不过滤；例如 src_ip:1.1.1.1。可查询字段随 LogType 变化，应优先使用对应 Items 中已返回的字段名，不要猜测不存在的字段；使用 NextToken 续查时不能传。
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 查询起始时间。支持 RFC3339、YYYY-MM-DD HH:MM:SS、YYYY-MM-DD 或 Unix 时间戳；传入后从该时间向后查询 TimeRange；使用 NextToken 续查时不能传。 
     * @return StartTime 查询起始时间。支持 RFC3339、YYYY-MM-DD HH:MM:SS、YYYY-MM-DD 或 Unix 时间戳；传入后从该时间向后查询 TimeRange；使用 NextToken 续查时不能传。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询起始时间。支持 RFC3339、YYYY-MM-DD HH:MM:SS、YYYY-MM-DD 或 Unix 时间戳；传入后从该时间向后查询 TimeRange；使用 NextToken 续查时不能传。
     * @param StartTime 查询起始时间。支持 RFC3339、YYYY-MM-DD HH:MM:SS、YYYY-MM-DD 或 Unix 时间戳；传入后从该时间向后查询 TimeRange；使用 NextToken 续查时不能传。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询时间范围。默认 1h；格式为正整数加单位 m/h/d，例如 5m、1h、24h、7d；使用 NextToken 续查时不能传。 
     * @return TimeRange 查询时间范围。默认 1h；格式为正整数加单位 m/h/d，例如 5m、1h、24h、7d；使用 NextToken 续查时不能传。
     */
    public String getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set 查询时间范围。默认 1h；格式为正整数加单位 m/h/d，例如 5m、1h、24h、7d；使用 NextToken 续查时不能传。
     * @param TimeRange 查询时间范围。默认 1h；格式为正整数加单位 m/h/d，例如 5m、1h、24h、7d；使用 NextToken 续查时不能传。
     */
    public void setTimeRange(String TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get 单页返回条数。首次查询可选，默认 100；取值 1 至 1000；使用 NextToken 续查时不能传。 
     * @return Limit 单页返回条数。首次查询可选，默认 100；取值 1 至 1000；使用 NextToken 续查时不能传。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单页返回条数。首次查询可选，默认 100；取值 1 至 1000；使用 NextToken 续查时不能传。
     * @param Limit 单页返回条数。首次查询可选，默认 100；取值 1 至 1000；使用 NextToken 续查时不能传。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 上一页 Response.Data 返回的不透明续查 token。首次查询不传；续查时只传 NextToken。无效、篡改或租户不匹配会被拒绝。 
     * @return NextToken 上一页 Response.Data 返回的不透明续查 token。首次查询不传；续查时只传 NextToken。无效、篡改或租户不匹配会被拒绝。
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 上一页 Response.Data 返回的不透明续查 token。首次查询不传；续查时只传 NextToken。无效、篡改或租户不匹配会被拒绝。
     * @param NextToken 上一页 Response.Data 返回的不透明续查 token。首次查询不传；续查时只传 NextToken。无效、篡改或租户不匹配会被拒绝。
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    public DescribeCfwLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfwLogsRequest(DescribeCfwLogsRequest source) {
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.TimeRange != null) {
            this.TimeRange = new String(source.TimeRange);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "TimeRange", this.TimeRange);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);

    }
}

