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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FieldWriteConfig extends AbstractModel {

    /**
    * <p>1:开启 0:不开启</p>
    */
    @SerializedName("EnableHeaders")
    @Expose
    private Long EnableHeaders;

    /**
    * <p>1:开启 0:不开启</p>
    */
    @SerializedName("EnableBody")
    @Expose
    private Long EnableBody;

    /**
    * <p>仅当该条访问日志命中攻击规则时，是否额外存储 attack_body 字段（取值与 body 字段相同）。1:开启 0/不填:不开启。与 EnableBody 完全独立，互不影响。仅在存储查询链路（DescribeAccessMeta/ModifyAccessPeriod）中生效，不影响 CLS/CKafka 自定义投递（CreatePostCLSFlow/CreatePostCKafkaFlow）配置。</p>
    */
    @SerializedName("EnableAttackBody")
    @Expose
    private Long EnableAttackBody;

    /**
    * <p>1:开启 0:不开启</p>
    */
    @SerializedName("EnableBot")
    @Expose
    private Long EnableBot;

    /**
    * <p>响应方向body<br>1:开启 0:不开启</p>
    */
    @SerializedName("EnableResponse")
    @Expose
    private Long EnableResponse;

    /**
    * <p>是否投递 response_headers（响应头，完整键值对，原样投递不做过滤/脱敏，超过2KB截断）。1:开启 0/不填:不开启。与 EnableResponse（响应体）完全独立，互不影响。</p>
    */
    @SerializedName("EnableResponseHeaders")
    @Expose
    private Long EnableResponseHeaders;

    /**
    * <p>是否投递 response_length（响应包长度，单位字节）。1:开启 0/不填:不开启。与 EnableResponse 完全独立，互不影响。</p>
    */
    @SerializedName("EnableResponseLength")
    @Expose
    private Long EnableResponseLength;

    /**
    * <p>是否投递 response_status_line（客户端可见 HTTP 状态行，如 HTTP/1.1 200 OK，超过1KB截断）。1:开启 0/不填:不开启。与 EnableResponse 完全独立，互不影响。拦截/未回源时也会有值，记录的是 WAF 返回给客户端的状态行。</p>
    */
    @SerializedName("EnableResponseStatusLine")
    @Expose
    private Long EnableResponseStatusLine;

    /**
    * <p>大模型安全防护详情字段，用;分割，仅对 SDK 访问日志生效。不传表示全部写入；传空字符串表示只写必填字段（uuid、appid、instance、timestamp、llm_service_id）。</p>
    */
    @SerializedName("LlmItem")
    @Expose
    private String LlmItem;

    /**
    * <p>headers 字段中10个通用冗余子字段（accept/accept-encoding/accept-language/connection/content-type/cookie/host/referer/x-forwarded-for/user-agent）剔除开关。1:剔除 0/不填:不剔除。仅在CLS/CKafka自定义投递（CreatePostCLSFlow/CreatePostCKafkaFlow及对应Describe接口）中生效，不影响原有存储日志配置。</p>
    */
    @SerializedName("FilterPlusEnableHeaderFilter")
    @Expose
    private Long FilterPlusEnableHeaderFilter;

    /**
     * Get <p>1:开启 0:不开启</p> 
     * @return EnableHeaders <p>1:开启 0:不开启</p>
     */
    public Long getEnableHeaders() {
        return this.EnableHeaders;
    }

    /**
     * Set <p>1:开启 0:不开启</p>
     * @param EnableHeaders <p>1:开启 0:不开启</p>
     */
    public void setEnableHeaders(Long EnableHeaders) {
        this.EnableHeaders = EnableHeaders;
    }

    /**
     * Get <p>1:开启 0:不开启</p> 
     * @return EnableBody <p>1:开启 0:不开启</p>
     */
    public Long getEnableBody() {
        return this.EnableBody;
    }

    /**
     * Set <p>1:开启 0:不开启</p>
     * @param EnableBody <p>1:开启 0:不开启</p>
     */
    public void setEnableBody(Long EnableBody) {
        this.EnableBody = EnableBody;
    }

    /**
     * Get <p>仅当该条访问日志命中攻击规则时，是否额外存储 attack_body 字段（取值与 body 字段相同）。1:开启 0/不填:不开启。与 EnableBody 完全独立，互不影响。仅在存储查询链路（DescribeAccessMeta/ModifyAccessPeriod）中生效，不影响 CLS/CKafka 自定义投递（CreatePostCLSFlow/CreatePostCKafkaFlow）配置。</p> 
     * @return EnableAttackBody <p>仅当该条访问日志命中攻击规则时，是否额外存储 attack_body 字段（取值与 body 字段相同）。1:开启 0/不填:不开启。与 EnableBody 完全独立，互不影响。仅在存储查询链路（DescribeAccessMeta/ModifyAccessPeriod）中生效，不影响 CLS/CKafka 自定义投递（CreatePostCLSFlow/CreatePostCKafkaFlow）配置。</p>
     */
    public Long getEnableAttackBody() {
        return this.EnableAttackBody;
    }

    /**
     * Set <p>仅当该条访问日志命中攻击规则时，是否额外存储 attack_body 字段（取值与 body 字段相同）。1:开启 0/不填:不开启。与 EnableBody 完全独立，互不影响。仅在存储查询链路（DescribeAccessMeta/ModifyAccessPeriod）中生效，不影响 CLS/CKafka 自定义投递（CreatePostCLSFlow/CreatePostCKafkaFlow）配置。</p>
     * @param EnableAttackBody <p>仅当该条访问日志命中攻击规则时，是否额外存储 attack_body 字段（取值与 body 字段相同）。1:开启 0/不填:不开启。与 EnableBody 完全独立，互不影响。仅在存储查询链路（DescribeAccessMeta/ModifyAccessPeriod）中生效，不影响 CLS/CKafka 自定义投递（CreatePostCLSFlow/CreatePostCKafkaFlow）配置。</p>
     */
    public void setEnableAttackBody(Long EnableAttackBody) {
        this.EnableAttackBody = EnableAttackBody;
    }

    /**
     * Get <p>1:开启 0:不开启</p> 
     * @return EnableBot <p>1:开启 0:不开启</p>
     */
    public Long getEnableBot() {
        return this.EnableBot;
    }

    /**
     * Set <p>1:开启 0:不开启</p>
     * @param EnableBot <p>1:开启 0:不开启</p>
     */
    public void setEnableBot(Long EnableBot) {
        this.EnableBot = EnableBot;
    }

    /**
     * Get <p>响应方向body<br>1:开启 0:不开启</p> 
     * @return EnableResponse <p>响应方向body<br>1:开启 0:不开启</p>
     */
    public Long getEnableResponse() {
        return this.EnableResponse;
    }

    /**
     * Set <p>响应方向body<br>1:开启 0:不开启</p>
     * @param EnableResponse <p>响应方向body<br>1:开启 0:不开启</p>
     */
    public void setEnableResponse(Long EnableResponse) {
        this.EnableResponse = EnableResponse;
    }

    /**
     * Get <p>是否投递 response_headers（响应头，完整键值对，原样投递不做过滤/脱敏，超过2KB截断）。1:开启 0/不填:不开启。与 EnableResponse（响应体）完全独立，互不影响。</p> 
     * @return EnableResponseHeaders <p>是否投递 response_headers（响应头，完整键值对，原样投递不做过滤/脱敏，超过2KB截断）。1:开启 0/不填:不开启。与 EnableResponse（响应体）完全独立，互不影响。</p>
     */
    public Long getEnableResponseHeaders() {
        return this.EnableResponseHeaders;
    }

    /**
     * Set <p>是否投递 response_headers（响应头，完整键值对，原样投递不做过滤/脱敏，超过2KB截断）。1:开启 0/不填:不开启。与 EnableResponse（响应体）完全独立，互不影响。</p>
     * @param EnableResponseHeaders <p>是否投递 response_headers（响应头，完整键值对，原样投递不做过滤/脱敏，超过2KB截断）。1:开启 0/不填:不开启。与 EnableResponse（响应体）完全独立，互不影响。</p>
     */
    public void setEnableResponseHeaders(Long EnableResponseHeaders) {
        this.EnableResponseHeaders = EnableResponseHeaders;
    }

    /**
     * Get <p>是否投递 response_length（响应包长度，单位字节）。1:开启 0/不填:不开启。与 EnableResponse 完全独立，互不影响。</p> 
     * @return EnableResponseLength <p>是否投递 response_length（响应包长度，单位字节）。1:开启 0/不填:不开启。与 EnableResponse 完全独立，互不影响。</p>
     */
    public Long getEnableResponseLength() {
        return this.EnableResponseLength;
    }

    /**
     * Set <p>是否投递 response_length（响应包长度，单位字节）。1:开启 0/不填:不开启。与 EnableResponse 完全独立，互不影响。</p>
     * @param EnableResponseLength <p>是否投递 response_length（响应包长度，单位字节）。1:开启 0/不填:不开启。与 EnableResponse 完全独立，互不影响。</p>
     */
    public void setEnableResponseLength(Long EnableResponseLength) {
        this.EnableResponseLength = EnableResponseLength;
    }

    /**
     * Get <p>是否投递 response_status_line（客户端可见 HTTP 状态行，如 HTTP/1.1 200 OK，超过1KB截断）。1:开启 0/不填:不开启。与 EnableResponse 完全独立，互不影响。拦截/未回源时也会有值，记录的是 WAF 返回给客户端的状态行。</p> 
     * @return EnableResponseStatusLine <p>是否投递 response_status_line（客户端可见 HTTP 状态行，如 HTTP/1.1 200 OK，超过1KB截断）。1:开启 0/不填:不开启。与 EnableResponse 完全独立，互不影响。拦截/未回源时也会有值，记录的是 WAF 返回给客户端的状态行。</p>
     */
    public Long getEnableResponseStatusLine() {
        return this.EnableResponseStatusLine;
    }

    /**
     * Set <p>是否投递 response_status_line（客户端可见 HTTP 状态行，如 HTTP/1.1 200 OK，超过1KB截断）。1:开启 0/不填:不开启。与 EnableResponse 完全独立，互不影响。拦截/未回源时也会有值，记录的是 WAF 返回给客户端的状态行。</p>
     * @param EnableResponseStatusLine <p>是否投递 response_status_line（客户端可见 HTTP 状态行，如 HTTP/1.1 200 OK，超过1KB截断）。1:开启 0/不填:不开启。与 EnableResponse 完全独立，互不影响。拦截/未回源时也会有值，记录的是 WAF 返回给客户端的状态行。</p>
     */
    public void setEnableResponseStatusLine(Long EnableResponseStatusLine) {
        this.EnableResponseStatusLine = EnableResponseStatusLine;
    }

    /**
     * Get <p>大模型安全防护详情字段，用;分割，仅对 SDK 访问日志生效。不传表示全部写入；传空字符串表示只写必填字段（uuid、appid、instance、timestamp、llm_service_id）。</p> 
     * @return LlmItem <p>大模型安全防护详情字段，用;分割，仅对 SDK 访问日志生效。不传表示全部写入；传空字符串表示只写必填字段（uuid、appid、instance、timestamp、llm_service_id）。</p>
     */
    public String getLlmItem() {
        return this.LlmItem;
    }

    /**
     * Set <p>大模型安全防护详情字段，用;分割，仅对 SDK 访问日志生效。不传表示全部写入；传空字符串表示只写必填字段（uuid、appid、instance、timestamp、llm_service_id）。</p>
     * @param LlmItem <p>大模型安全防护详情字段，用;分割，仅对 SDK 访问日志生效。不传表示全部写入；传空字符串表示只写必填字段（uuid、appid、instance、timestamp、llm_service_id）。</p>
     */
    public void setLlmItem(String LlmItem) {
        this.LlmItem = LlmItem;
    }

    /**
     * Get <p>headers 字段中10个通用冗余子字段（accept/accept-encoding/accept-language/connection/content-type/cookie/host/referer/x-forwarded-for/user-agent）剔除开关。1:剔除 0/不填:不剔除。仅在CLS/CKafka自定义投递（CreatePostCLSFlow/CreatePostCKafkaFlow及对应Describe接口）中生效，不影响原有存储日志配置。</p> 
     * @return FilterPlusEnableHeaderFilter <p>headers 字段中10个通用冗余子字段（accept/accept-encoding/accept-language/connection/content-type/cookie/host/referer/x-forwarded-for/user-agent）剔除开关。1:剔除 0/不填:不剔除。仅在CLS/CKafka自定义投递（CreatePostCLSFlow/CreatePostCKafkaFlow及对应Describe接口）中生效，不影响原有存储日志配置。</p>
     */
    public Long getFilterPlusEnableHeaderFilter() {
        return this.FilterPlusEnableHeaderFilter;
    }

    /**
     * Set <p>headers 字段中10个通用冗余子字段（accept/accept-encoding/accept-language/connection/content-type/cookie/host/referer/x-forwarded-for/user-agent）剔除开关。1:剔除 0/不填:不剔除。仅在CLS/CKafka自定义投递（CreatePostCLSFlow/CreatePostCKafkaFlow及对应Describe接口）中生效，不影响原有存储日志配置。</p>
     * @param FilterPlusEnableHeaderFilter <p>headers 字段中10个通用冗余子字段（accept/accept-encoding/accept-language/connection/content-type/cookie/host/referer/x-forwarded-for/user-agent）剔除开关。1:剔除 0/不填:不剔除。仅在CLS/CKafka自定义投递（CreatePostCLSFlow/CreatePostCKafkaFlow及对应Describe接口）中生效，不影响原有存储日志配置。</p>
     */
    public void setFilterPlusEnableHeaderFilter(Long FilterPlusEnableHeaderFilter) {
        this.FilterPlusEnableHeaderFilter = FilterPlusEnableHeaderFilter;
    }

    public FieldWriteConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FieldWriteConfig(FieldWriteConfig source) {
        if (source.EnableHeaders != null) {
            this.EnableHeaders = new Long(source.EnableHeaders);
        }
        if (source.EnableBody != null) {
            this.EnableBody = new Long(source.EnableBody);
        }
        if (source.EnableAttackBody != null) {
            this.EnableAttackBody = new Long(source.EnableAttackBody);
        }
        if (source.EnableBot != null) {
            this.EnableBot = new Long(source.EnableBot);
        }
        if (source.EnableResponse != null) {
            this.EnableResponse = new Long(source.EnableResponse);
        }
        if (source.EnableResponseHeaders != null) {
            this.EnableResponseHeaders = new Long(source.EnableResponseHeaders);
        }
        if (source.EnableResponseLength != null) {
            this.EnableResponseLength = new Long(source.EnableResponseLength);
        }
        if (source.EnableResponseStatusLine != null) {
            this.EnableResponseStatusLine = new Long(source.EnableResponseStatusLine);
        }
        if (source.LlmItem != null) {
            this.LlmItem = new String(source.LlmItem);
        }
        if (source.FilterPlusEnableHeaderFilter != null) {
            this.FilterPlusEnableHeaderFilter = new Long(source.FilterPlusEnableHeaderFilter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableHeaders", this.EnableHeaders);
        this.setParamSimple(map, prefix + "EnableBody", this.EnableBody);
        this.setParamSimple(map, prefix + "EnableAttackBody", this.EnableAttackBody);
        this.setParamSimple(map, prefix + "EnableBot", this.EnableBot);
        this.setParamSimple(map, prefix + "EnableResponse", this.EnableResponse);
        this.setParamSimple(map, prefix + "EnableResponseHeaders", this.EnableResponseHeaders);
        this.setParamSimple(map, prefix + "EnableResponseLength", this.EnableResponseLength);
        this.setParamSimple(map, prefix + "EnableResponseStatusLine", this.EnableResponseStatusLine);
        this.setParamSimple(map, prefix + "LlmItem", this.LlmItem);
        this.setParamSimple(map, prefix + "FilterPlusEnableHeaderFilter", this.FilterPlusEnableHeaderFilter);

    }
}

