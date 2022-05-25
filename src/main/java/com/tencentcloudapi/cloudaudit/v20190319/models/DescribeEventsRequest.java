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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEventsRequest extends AbstractModel{

    /**
    * 起始时间戳（单位秒，不超过当前时间 90 天）
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间戳（单位秒，查询时间跨度小于 30 天）
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 查看更多日志的凭证
    */
    @SerializedName("NextToken")
    @Expose
    private Long NextToken;

    /**
    * 返回日志的最大条数（最大 50 条）
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * 检索条件（目前支持 RequestId：请求 ID、EventName：事件名称、ActionType：操作类型（Write：写；Read：读）、PrincipalId：子账号、ResourceType：资源类型、ResourceName：资源名称、AccessKeyId：密钥 ID、SensitiveAction：是否敏感操作、ApiErrorCode：API 错误码、CamErrorCode：CAM 错误码、Tags：标签（AttributeValue格式：[{"key":"*","value":"*"}]））
    */
    @SerializedName("LookupAttributes")
    @Expose
    private LookupAttribute [] LookupAttributes;

    /**
    * 是否返回 IP 归属地（1 返回，0 不返回）
    */
    @SerializedName("IsReturnLocation")
    @Expose
    private Long IsReturnLocation;

    /**
     * Get 起始时间戳（单位秒，不超过当前时间 90 天） 
     * @return StartTime 起始时间戳（单位秒，不超过当前时间 90 天）
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间戳（单位秒，不超过当前时间 90 天）
     * @param StartTime 起始时间戳（单位秒，不超过当前时间 90 天）
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间戳（单位秒，查询时间跨度小于 30 天） 
     * @return EndTime 结束时间戳（单位秒，查询时间跨度小于 30 天）
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间戳（单位秒，查询时间跨度小于 30 天）
     * @param EndTime 结束时间戳（单位秒，查询时间跨度小于 30 天）
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 查看更多日志的凭证 
     * @return NextToken 查看更多日志的凭证
     */
    public Long getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 查看更多日志的凭证
     * @param NextToken 查看更多日志的凭证
     */
    public void setNextToken(Long NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get 返回日志的最大条数（最大 50 条） 
     * @return MaxResults 返回日志的最大条数（最大 50 条）
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set 返回日志的最大条数（最大 50 条）
     * @param MaxResults 返回日志的最大条数（最大 50 条）
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get 检索条件（目前支持 RequestId：请求 ID、EventName：事件名称、ActionType：操作类型（Write：写；Read：读）、PrincipalId：子账号、ResourceType：资源类型、ResourceName：资源名称、AccessKeyId：密钥 ID、SensitiveAction：是否敏感操作、ApiErrorCode：API 错误码、CamErrorCode：CAM 错误码、Tags：标签（AttributeValue格式：[{"key":"*","value":"*"}]）） 
     * @return LookupAttributes 检索条件（目前支持 RequestId：请求 ID、EventName：事件名称、ActionType：操作类型（Write：写；Read：读）、PrincipalId：子账号、ResourceType：资源类型、ResourceName：资源名称、AccessKeyId：密钥 ID、SensitiveAction：是否敏感操作、ApiErrorCode：API 错误码、CamErrorCode：CAM 错误码、Tags：标签（AttributeValue格式：[{"key":"*","value":"*"}]））
     */
    public LookupAttribute [] getLookupAttributes() {
        return this.LookupAttributes;
    }

    /**
     * Set 检索条件（目前支持 RequestId：请求 ID、EventName：事件名称、ActionType：操作类型（Write：写；Read：读）、PrincipalId：子账号、ResourceType：资源类型、ResourceName：资源名称、AccessKeyId：密钥 ID、SensitiveAction：是否敏感操作、ApiErrorCode：API 错误码、CamErrorCode：CAM 错误码、Tags：标签（AttributeValue格式：[{"key":"*","value":"*"}]））
     * @param LookupAttributes 检索条件（目前支持 RequestId：请求 ID、EventName：事件名称、ActionType：操作类型（Write：写；Read：读）、PrincipalId：子账号、ResourceType：资源类型、ResourceName：资源名称、AccessKeyId：密钥 ID、SensitiveAction：是否敏感操作、ApiErrorCode：API 错误码、CamErrorCode：CAM 错误码、Tags：标签（AttributeValue格式：[{"key":"*","value":"*"}]））
     */
    public void setLookupAttributes(LookupAttribute [] LookupAttributes) {
        this.LookupAttributes = LookupAttributes;
    }

    /**
     * Get 是否返回 IP 归属地（1 返回，0 不返回） 
     * @return IsReturnLocation 是否返回 IP 归属地（1 返回，0 不返回）
     */
    public Long getIsReturnLocation() {
        return this.IsReturnLocation;
    }

    /**
     * Set 是否返回 IP 归属地（1 返回，0 不返回）
     * @param IsReturnLocation 是否返回 IP 归属地（1 返回，0 不返回）
     */
    public void setIsReturnLocation(Long IsReturnLocation) {
        this.IsReturnLocation = IsReturnLocation;
    }

    public DescribeEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEventsRequest(DescribeEventsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.NextToken != null) {
            this.NextToken = new Long(source.NextToken);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.LookupAttributes != null) {
            this.LookupAttributes = new LookupAttribute[source.LookupAttributes.length];
            for (int i = 0; i < source.LookupAttributes.length; i++) {
                this.LookupAttributes[i] = new LookupAttribute(source.LookupAttributes[i]);
            }
        }
        if (source.IsReturnLocation != null) {
            this.IsReturnLocation = new Long(source.IsReturnLocation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamArrayObj(map, prefix + "LookupAttributes.", this.LookupAttributes);
        this.setParamSimple(map, prefix + "IsReturnLocation", this.IsReturnLocation);

    }
}

