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

public class DescribeRecordListRequest extends AbstractModel {

    /**
    * <p>域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId</p>
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * <p>解析记录的主机头，如果传了此参数，则只会返回此主机头对应的解析记录</p>
    */
    @SerializedName("Subdomain")
    @Expose
    private String Subdomain;

    /**
    * <p>获取某种类型的解析记录，如 A，CNAME，NS，AAAA，显性URL，隐性URL，CAA，SPF等</p>
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * <p>获取某条线路名称的解析记录。可以通过接口DescribeRecordLineList查看当前域名允许的线路信息</p>
    */
    @SerializedName("RecordLine")
    @Expose
    private String RecordLine;

    /**
    * <p>获取某个线路Id对应的解析记录，如果传RecordLineId，系统会忽略RecordLine参数。可以通过接口DescribeRecordLineList查看当前域名允许的线路信息</p>
    */
    @SerializedName("RecordLineId")
    @Expose
    private String RecordLineId;

    /**
    * <p>获取某个分组下的解析记录时，传这个分组Id。可通过DescribeRecordGroupList接口获取所有分组</p>
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * <p>通过关键字搜索解析记录，当前支持搜索主机头和记录值</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>排序字段，支持 name,line,type,value,weight,mx,ttl,updated_on 几个字段。</p>
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * <p>排序方式，正序：ASC，逆序：DESC。默认值为ASC。</p>
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * <p>偏移量，默认值为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>限制数量，当前Limit最大支持3000。默认值为100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>查询不到数据时是否报错</p>枚举值：<ul><li> yes： 报错</li><li> no： 不报错，返回空列表</li></ul>默认值：yes
    */
    @SerializedName("ErrorOnEmpty")
    @Expose
    private String ErrorOnEmpty;

    /**
     * Get <p>域名</p> 
     * @return Domain <p>域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
     * @param Domain <p>域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId</p> 
     * @return DomainId <p>域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId</p>
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set <p>域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId</p>
     * @param DomainId <p>域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId</p>
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get <p>解析记录的主机头，如果传了此参数，则只会返回此主机头对应的解析记录</p> 
     * @return Subdomain <p>解析记录的主机头，如果传了此参数，则只会返回此主机头对应的解析记录</p>
     */
    public String getSubdomain() {
        return this.Subdomain;
    }

    /**
     * Set <p>解析记录的主机头，如果传了此参数，则只会返回此主机头对应的解析记录</p>
     * @param Subdomain <p>解析记录的主机头，如果传了此参数，则只会返回此主机头对应的解析记录</p>
     */
    public void setSubdomain(String Subdomain) {
        this.Subdomain = Subdomain;
    }

    /**
     * Get <p>获取某种类型的解析记录，如 A，CNAME，NS，AAAA，显性URL，隐性URL，CAA，SPF等</p> 
     * @return RecordType <p>获取某种类型的解析记录，如 A，CNAME，NS，AAAA，显性URL，隐性URL，CAA，SPF等</p>
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set <p>获取某种类型的解析记录，如 A，CNAME，NS，AAAA，显性URL，隐性URL，CAA，SPF等</p>
     * @param RecordType <p>获取某种类型的解析记录，如 A，CNAME，NS，AAAA，显性URL，隐性URL，CAA，SPF等</p>
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get <p>获取某条线路名称的解析记录。可以通过接口DescribeRecordLineList查看当前域名允许的线路信息</p> 
     * @return RecordLine <p>获取某条线路名称的解析记录。可以通过接口DescribeRecordLineList查看当前域名允许的线路信息</p>
     */
    public String getRecordLine() {
        return this.RecordLine;
    }

    /**
     * Set <p>获取某条线路名称的解析记录。可以通过接口DescribeRecordLineList查看当前域名允许的线路信息</p>
     * @param RecordLine <p>获取某条线路名称的解析记录。可以通过接口DescribeRecordLineList查看当前域名允许的线路信息</p>
     */
    public void setRecordLine(String RecordLine) {
        this.RecordLine = RecordLine;
    }

    /**
     * Get <p>获取某个线路Id对应的解析记录，如果传RecordLineId，系统会忽略RecordLine参数。可以通过接口DescribeRecordLineList查看当前域名允许的线路信息</p> 
     * @return RecordLineId <p>获取某个线路Id对应的解析记录，如果传RecordLineId，系统会忽略RecordLine参数。可以通过接口DescribeRecordLineList查看当前域名允许的线路信息</p>
     */
    public String getRecordLineId() {
        return this.RecordLineId;
    }

    /**
     * Set <p>获取某个线路Id对应的解析记录，如果传RecordLineId，系统会忽略RecordLine参数。可以通过接口DescribeRecordLineList查看当前域名允许的线路信息</p>
     * @param RecordLineId <p>获取某个线路Id对应的解析记录，如果传RecordLineId，系统会忽略RecordLine参数。可以通过接口DescribeRecordLineList查看当前域名允许的线路信息</p>
     */
    public void setRecordLineId(String RecordLineId) {
        this.RecordLineId = RecordLineId;
    }

    /**
     * Get <p>获取某个分组下的解析记录时，传这个分组Id。可通过DescribeRecordGroupList接口获取所有分组</p> 
     * @return GroupId <p>获取某个分组下的解析记录时，传这个分组Id。可通过DescribeRecordGroupList接口获取所有分组</p>
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>获取某个分组下的解析记录时，传这个分组Id。可通过DescribeRecordGroupList接口获取所有分组</p>
     * @param GroupId <p>获取某个分组下的解析记录时，传这个分组Id。可通过DescribeRecordGroupList接口获取所有分组</p>
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>通过关键字搜索解析记录，当前支持搜索主机头和记录值</p> 
     * @return Keyword <p>通过关键字搜索解析记录，当前支持搜索主机头和记录值</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>通过关键字搜索解析记录，当前支持搜索主机头和记录值</p>
     * @param Keyword <p>通过关键字搜索解析记录，当前支持搜索主机头和记录值</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>排序字段，支持 name,line,type,value,weight,mx,ttl,updated_on 几个字段。</p> 
     * @return SortField <p>排序字段，支持 name,line,type,value,weight,mx,ttl,updated_on 几个字段。</p>
     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set <p>排序字段，支持 name,line,type,value,weight,mx,ttl,updated_on 几个字段。</p>
     * @param SortField <p>排序字段，支持 name,line,type,value,weight,mx,ttl,updated_on 几个字段。</p>
     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get <p>排序方式，正序：ASC，逆序：DESC。默认值为ASC。</p> 
     * @return SortType <p>排序方式，正序：ASC，逆序：DESC。默认值为ASC。</p>
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set <p>排序方式，正序：ASC，逆序：DESC。默认值为ASC。</p>
     * @param SortType <p>排序方式，正序：ASC，逆序：DESC。默认值为ASC。</p>
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get <p>偏移量，默认值为0。</p> 
     * @return Offset <p>偏移量，默认值为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认值为0。</p>
     * @param Offset <p>偏移量，默认值为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>限制数量，当前Limit最大支持3000。默认值为100。</p> 
     * @return Limit <p>限制数量，当前Limit最大支持3000。默认值为100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>限制数量，当前Limit最大支持3000。默认值为100。</p>
     * @param Limit <p>限制数量，当前Limit最大支持3000。默认值为100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>查询不到数据时是否报错</p>枚举值：<ul><li> yes： 报错</li><li> no： 不报错，返回空列表</li></ul>默认值：yes 
     * @return ErrorOnEmpty <p>查询不到数据时是否报错</p>枚举值：<ul><li> yes： 报错</li><li> no： 不报错，返回空列表</li></ul>默认值：yes
     */
    public String getErrorOnEmpty() {
        return this.ErrorOnEmpty;
    }

    /**
     * Set <p>查询不到数据时是否报错</p>枚举值：<ul><li> yes： 报错</li><li> no： 不报错，返回空列表</li></ul>默认值：yes
     * @param ErrorOnEmpty <p>查询不到数据时是否报错</p>枚举值：<ul><li> yes： 报错</li><li> no： 不报错，返回空列表</li></ul>默认值：yes
     */
    public void setErrorOnEmpty(String ErrorOnEmpty) {
        this.ErrorOnEmpty = ErrorOnEmpty;
    }

    public DescribeRecordListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordListRequest(DescribeRecordListRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.Subdomain != null) {
            this.Subdomain = new String(source.Subdomain);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.RecordLine != null) {
            this.RecordLine = new String(source.RecordLine);
        }
        if (source.RecordLineId != null) {
            this.RecordLineId = new String(source.RecordLineId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.SortField != null) {
            this.SortField = new String(source.SortField);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ErrorOnEmpty != null) {
            this.ErrorOnEmpty = new String(source.ErrorOnEmpty);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Subdomain", this.Subdomain);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "RecordLine", this.RecordLine);
        this.setParamSimple(map, prefix + "RecordLineId", this.RecordLineId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "SortField", this.SortField);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ErrorOnEmpty", this.ErrorOnEmpty);

    }
}

