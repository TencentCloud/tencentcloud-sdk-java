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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainLogFilterFileRequest extends AbstractModel {

    /**
    * 要获取操作日志的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 要获取操作日志的域名 Id，如果传了 DomainId，系统将会忽略 Domain 参数。 可以通过接口 DescribeDomainList 查到所有的 Domain 以及 DomainId
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * 通过关键字搜索，支持搜索字段：账户 UIN、操作 IP、操作内容
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 操作时间范围起始时间(仅支持近6个月的日志查询)
    */
    @SerializedName("OperateBegin")
    @Expose
    private String OperateBegin;

    /**
    * 操作时间范围截止时间(仅支持近6个月的日志查询)
    */
    @SerializedName("OperateEnd")
    @Expose
    private String OperateEnd;

    /**
    * 操作账号 UIN 精确匹配
    */
    @SerializedName("OperateUin")
    @Expose
    private Long OperateUin;

    /**
    * 操作 IP 精确匹配
    */
    @SerializedName("OperateClientIP")
    @Expose
    private String OperateClientIP;

    /**
    * 操作内容 模糊匹配
    */
    @SerializedName("OperateContent")
    @Expose
    private String OperateContent;

    /**
     * Get 要获取操作日志的域名 
     * @return Domain 要获取操作日志的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 要获取操作日志的域名
     * @param Domain 要获取操作日志的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 要获取操作日志的域名 Id，如果传了 DomainId，系统将会忽略 Domain 参数。 可以通过接口 DescribeDomainList 查到所有的 Domain 以及 DomainId 
     * @return DomainId 要获取操作日志的域名 Id，如果传了 DomainId，系统将会忽略 Domain 参数。 可以通过接口 DescribeDomainList 查到所有的 Domain 以及 DomainId
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 要获取操作日志的域名 Id，如果传了 DomainId，系统将会忽略 Domain 参数。 可以通过接口 DescribeDomainList 查到所有的 Domain 以及 DomainId
     * @param DomainId 要获取操作日志的域名 Id，如果传了 DomainId，系统将会忽略 Domain 参数。 可以通过接口 DescribeDomainList 查到所有的 Domain 以及 DomainId
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 通过关键字搜索，支持搜索字段：账户 UIN、操作 IP、操作内容 
     * @return Keyword 通过关键字搜索，支持搜索字段：账户 UIN、操作 IP、操作内容
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 通过关键字搜索，支持搜索字段：账户 UIN、操作 IP、操作内容
     * @param Keyword 通过关键字搜索，支持搜索字段：账户 UIN、操作 IP、操作内容
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 操作时间范围起始时间(仅支持近6个月的日志查询) 
     * @return OperateBegin 操作时间范围起始时间(仅支持近6个月的日志查询)
     */
    public String getOperateBegin() {
        return this.OperateBegin;
    }

    /**
     * Set 操作时间范围起始时间(仅支持近6个月的日志查询)
     * @param OperateBegin 操作时间范围起始时间(仅支持近6个月的日志查询)
     */
    public void setOperateBegin(String OperateBegin) {
        this.OperateBegin = OperateBegin;
    }

    /**
     * Get 操作时间范围截止时间(仅支持近6个月的日志查询) 
     * @return OperateEnd 操作时间范围截止时间(仅支持近6个月的日志查询)
     */
    public String getOperateEnd() {
        return this.OperateEnd;
    }

    /**
     * Set 操作时间范围截止时间(仅支持近6个月的日志查询)
     * @param OperateEnd 操作时间范围截止时间(仅支持近6个月的日志查询)
     */
    public void setOperateEnd(String OperateEnd) {
        this.OperateEnd = OperateEnd;
    }

    /**
     * Get 操作账号 UIN 精确匹配 
     * @return OperateUin 操作账号 UIN 精确匹配
     */
    public Long getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set 操作账号 UIN 精确匹配
     * @param OperateUin 操作账号 UIN 精确匹配
     */
    public void setOperateUin(Long OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get 操作 IP 精确匹配 
     * @return OperateClientIP 操作 IP 精确匹配
     */
    public String getOperateClientIP() {
        return this.OperateClientIP;
    }

    /**
     * Set 操作 IP 精确匹配
     * @param OperateClientIP 操作 IP 精确匹配
     */
    public void setOperateClientIP(String OperateClientIP) {
        this.OperateClientIP = OperateClientIP;
    }

    /**
     * Get 操作内容 模糊匹配 
     * @return OperateContent 操作内容 模糊匹配
     */
    public String getOperateContent() {
        return this.OperateContent;
    }

    /**
     * Set 操作内容 模糊匹配
     * @param OperateContent 操作内容 模糊匹配
     */
    public void setOperateContent(String OperateContent) {
        this.OperateContent = OperateContent;
    }

    public DescribeDomainLogFilterFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainLogFilterFileRequest(DescribeDomainLogFilterFileRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.OperateBegin != null) {
            this.OperateBegin = new String(source.OperateBegin);
        }
        if (source.OperateEnd != null) {
            this.OperateEnd = new String(source.OperateEnd);
        }
        if (source.OperateUin != null) {
            this.OperateUin = new Long(source.OperateUin);
        }
        if (source.OperateClientIP != null) {
            this.OperateClientIP = new String(source.OperateClientIP);
        }
        if (source.OperateContent != null) {
            this.OperateContent = new String(source.OperateContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "OperateBegin", this.OperateBegin);
        this.setParamSimple(map, prefix + "OperateEnd", this.OperateEnd);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "OperateClientIP", this.OperateClientIP);
        this.setParamSimple(map, prefix + "OperateContent", this.OperateContent);

    }
}

