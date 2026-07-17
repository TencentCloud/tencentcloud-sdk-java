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
    * <p>日志类型。首次查询必填；使用 NextToken 续查时不能传。枚举值包括 cfw_netflow_border、cfw_netflow_vpc、cfw_netflow_nat、cfw_netflow_nta、cfw_netflow_dns、cfw_rule_threatinfo、cfw_rule_acl、cfw_rule_vpc_acl、cfw_rule_nat_acl、cfw_ndr_subject_risk、cfw_ndr_dataleak_entry、cfw_ndr_ai_audit、cfw_feature_collect、cfw_behavior_collect、operate_log_all。</p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>CLS CQL 查询语句。默认 *；使用 NextToken 续查时不能传。</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>查询起始时间。支持 RFC3339、YYYY-MM-DD HH:MM:SS、YYYY-MM-DD 或 Unix 时间戳；传入后从该时间向后查询 TimeRange；使用 NextToken 续查时不能传。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询时间范围。默认 1h；格式为正整数加单位 m/h/d，例如 5m、1h、24h、7d；使用 NextToken 续查时不能传。</p>
    */
    @SerializedName("TimeRange")
    @Expose
    private String TimeRange;

    /**
    * <p>单页返回条数。默认 100，最大 1000；使用 NextToken 续查时不能传。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>上一页 Response.Data 返回的不透明续查 token。首次查询不传；续查时只传 NextToken。无效、篡改、过期或租户不匹配会被拒绝。</p>
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
     * Get <p>日志类型。首次查询必填；使用 NextToken 续查时不能传。枚举值包括 cfw_netflow_border、cfw_netflow_vpc、cfw_netflow_nat、cfw_netflow_nta、cfw_netflow_dns、cfw_rule_threatinfo、cfw_rule_acl、cfw_rule_vpc_acl、cfw_rule_nat_acl、cfw_ndr_subject_risk、cfw_ndr_dataleak_entry、cfw_ndr_ai_audit、cfw_feature_collect、cfw_behavior_collect、operate_log_all。</p> 
     * @return LogType <p>日志类型。首次查询必填；使用 NextToken 续查时不能传。枚举值包括 cfw_netflow_border、cfw_netflow_vpc、cfw_netflow_nat、cfw_netflow_nta、cfw_netflow_dns、cfw_rule_threatinfo、cfw_rule_acl、cfw_rule_vpc_acl、cfw_rule_nat_acl、cfw_ndr_subject_risk、cfw_ndr_dataleak_entry、cfw_ndr_ai_audit、cfw_feature_collect、cfw_behavior_collect、operate_log_all。</p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>日志类型。首次查询必填；使用 NextToken 续查时不能传。枚举值包括 cfw_netflow_border、cfw_netflow_vpc、cfw_netflow_nat、cfw_netflow_nta、cfw_netflow_dns、cfw_rule_threatinfo、cfw_rule_acl、cfw_rule_vpc_acl、cfw_rule_nat_acl、cfw_ndr_subject_risk、cfw_ndr_dataleak_entry、cfw_ndr_ai_audit、cfw_feature_collect、cfw_behavior_collect、operate_log_all。</p>
     * @param LogType <p>日志类型。首次查询必填；使用 NextToken 续查时不能传。枚举值包括 cfw_netflow_border、cfw_netflow_vpc、cfw_netflow_nat、cfw_netflow_nta、cfw_netflow_dns、cfw_rule_threatinfo、cfw_rule_acl、cfw_rule_vpc_acl、cfw_rule_nat_acl、cfw_ndr_subject_risk、cfw_ndr_dataleak_entry、cfw_ndr_ai_audit、cfw_feature_collect、cfw_behavior_collect、operate_log_all。</p>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>CLS CQL 查询语句。默认 *；使用 NextToken 续查时不能传。</p> 
     * @return Query <p>CLS CQL 查询语句。默认 *；使用 NextToken 续查时不能传。</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>CLS CQL 查询语句。默认 *；使用 NextToken 续查时不能传。</p>
     * @param Query <p>CLS CQL 查询语句。默认 *；使用 NextToken 续查时不能传。</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>查询起始时间。支持 RFC3339、YYYY-MM-DD HH:MM:SS、YYYY-MM-DD 或 Unix 时间戳；传入后从该时间向后查询 TimeRange；使用 NextToken 续查时不能传。</p> 
     * @return StartTime <p>查询起始时间。支持 RFC3339、YYYY-MM-DD HH:MM:SS、YYYY-MM-DD 或 Unix 时间戳；传入后从该时间向后查询 TimeRange；使用 NextToken 续查时不能传。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询起始时间。支持 RFC3339、YYYY-MM-DD HH:MM:SS、YYYY-MM-DD 或 Unix 时间戳；传入后从该时间向后查询 TimeRange；使用 NextToken 续查时不能传。</p>
     * @param StartTime <p>查询起始时间。支持 RFC3339、YYYY-MM-DD HH:MM:SS、YYYY-MM-DD 或 Unix 时间戳；传入后从该时间向后查询 TimeRange；使用 NextToken 续查时不能传。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询时间范围。默认 1h；格式为正整数加单位 m/h/d，例如 5m、1h、24h、7d；使用 NextToken 续查时不能传。</p> 
     * @return TimeRange <p>查询时间范围。默认 1h；格式为正整数加单位 m/h/d，例如 5m、1h、24h、7d；使用 NextToken 续查时不能传。</p>
     */
    public String getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set <p>查询时间范围。默认 1h；格式为正整数加单位 m/h/d，例如 5m、1h、24h、7d；使用 NextToken 续查时不能传。</p>
     * @param TimeRange <p>查询时间范围。默认 1h；格式为正整数加单位 m/h/d，例如 5m、1h、24h、7d；使用 NextToken 续查时不能传。</p>
     */
    public void setTimeRange(String TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get <p>单页返回条数。默认 100，最大 1000；使用 NextToken 续查时不能传。</p> 
     * @return Limit <p>单页返回条数。默认 100，最大 1000；使用 NextToken 续查时不能传。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单页返回条数。默认 100，最大 1000；使用 NextToken 续查时不能传。</p>
     * @param Limit <p>单页返回条数。默认 100，最大 1000；使用 NextToken 续查时不能传。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>上一页 Response.Data 返回的不透明续查 token。首次查询不传；续查时只传 NextToken。无效、篡改、过期或租户不匹配会被拒绝。</p> 
     * @return NextToken <p>上一页 Response.Data 返回的不透明续查 token。首次查询不传；续查时只传 NextToken。无效、篡改、过期或租户不匹配会被拒绝。</p>
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set <p>上一页 Response.Data 返回的不透明续查 token。首次查询不传；续查时只传 NextToken。无效、篡改、过期或租户不匹配会被拒绝。</p>
     * @param NextToken <p>上一页 Response.Data 返回的不透明续查 token。首次查询不传；续查时只传 NextToken。无效、篡改、过期或租户不匹配会被拒绝。</p>
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

