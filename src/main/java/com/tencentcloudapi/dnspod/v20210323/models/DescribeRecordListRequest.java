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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordListRequest extends AbstractModel{

    /**
    * 要获取的解析记录所属的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 要获取的解析记录所属的域名Id，如果传了DomainId，系统将会忽略Domain参数
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * 解析记录的主机头，如果传了此参数，则只会返回此主机头对应的解析记录
    */
    @SerializedName("Subdomain")
    @Expose
    private String Subdomain;

    /**
    * 获取某种类型的解析记录，如 A，CNAME，NS，AAAA，显性URL，隐性URL，CAA，SPF等
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * 获取某条线路名称的解析记录
    */
    @SerializedName("RecordLine")
    @Expose
    private String RecordLine;

    /**
    * 获取某个线路Id对应的解析记录，如果传RecordLineId，系统会忽略RecordLine参数
    */
    @SerializedName("RecordLineId")
    @Expose
    private String RecordLineId;

    /**
    * 获取某个分组下的解析记录时，传这个分组Id
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 通过关键字搜索解析记录，当前支持搜索主机头和记录值
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 排序字段，支持 name,line,type,value,weight,mx,ttl,updated_on 几个字段。
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * 排序方式，正序：ASC，逆序：DESC。默认值为ASC。
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * 偏移量，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数量，当前Limit最大支持3000。默认值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 要获取的解析记录所属的域名 
     * @return Domain 要获取的解析记录所属的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 要获取的解析记录所属的域名
     * @param Domain 要获取的解析记录所属的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 要获取的解析记录所属的域名Id，如果传了DomainId，系统将会忽略Domain参数 
     * @return DomainId 要获取的解析记录所属的域名Id，如果传了DomainId，系统将会忽略Domain参数
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 要获取的解析记录所属的域名Id，如果传了DomainId，系统将会忽略Domain参数
     * @param DomainId 要获取的解析记录所属的域名Id，如果传了DomainId，系统将会忽略Domain参数
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 解析记录的主机头，如果传了此参数，则只会返回此主机头对应的解析记录 
     * @return Subdomain 解析记录的主机头，如果传了此参数，则只会返回此主机头对应的解析记录
     */
    public String getSubdomain() {
        return this.Subdomain;
    }

    /**
     * Set 解析记录的主机头，如果传了此参数，则只会返回此主机头对应的解析记录
     * @param Subdomain 解析记录的主机头，如果传了此参数，则只会返回此主机头对应的解析记录
     */
    public void setSubdomain(String Subdomain) {
        this.Subdomain = Subdomain;
    }

    /**
     * Get 获取某种类型的解析记录，如 A，CNAME，NS，AAAA，显性URL，隐性URL，CAA，SPF等 
     * @return RecordType 获取某种类型的解析记录，如 A，CNAME，NS，AAAA，显性URL，隐性URL，CAA，SPF等
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set 获取某种类型的解析记录，如 A，CNAME，NS，AAAA，显性URL，隐性URL，CAA，SPF等
     * @param RecordType 获取某种类型的解析记录，如 A，CNAME，NS，AAAA，显性URL，隐性URL，CAA，SPF等
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get 获取某条线路名称的解析记录 
     * @return RecordLine 获取某条线路名称的解析记录
     */
    public String getRecordLine() {
        return this.RecordLine;
    }

    /**
     * Set 获取某条线路名称的解析记录
     * @param RecordLine 获取某条线路名称的解析记录
     */
    public void setRecordLine(String RecordLine) {
        this.RecordLine = RecordLine;
    }

    /**
     * Get 获取某个线路Id对应的解析记录，如果传RecordLineId，系统会忽略RecordLine参数 
     * @return RecordLineId 获取某个线路Id对应的解析记录，如果传RecordLineId，系统会忽略RecordLine参数
     */
    public String getRecordLineId() {
        return this.RecordLineId;
    }

    /**
     * Set 获取某个线路Id对应的解析记录，如果传RecordLineId，系统会忽略RecordLine参数
     * @param RecordLineId 获取某个线路Id对应的解析记录，如果传RecordLineId，系统会忽略RecordLine参数
     */
    public void setRecordLineId(String RecordLineId) {
        this.RecordLineId = RecordLineId;
    }

    /**
     * Get 获取某个分组下的解析记录时，传这个分组Id 
     * @return GroupId 获取某个分组下的解析记录时，传这个分组Id
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 获取某个分组下的解析记录时，传这个分组Id
     * @param GroupId 获取某个分组下的解析记录时，传这个分组Id
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 通过关键字搜索解析记录，当前支持搜索主机头和记录值 
     * @return Keyword 通过关键字搜索解析记录，当前支持搜索主机头和记录值
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 通过关键字搜索解析记录，当前支持搜索主机头和记录值
     * @param Keyword 通过关键字搜索解析记录，当前支持搜索主机头和记录值
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 排序字段，支持 name,line,type,value,weight,mx,ttl,updated_on 几个字段。 
     * @return SortField 排序字段，支持 name,line,type,value,weight,mx,ttl,updated_on 几个字段。
     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set 排序字段，支持 name,line,type,value,weight,mx,ttl,updated_on 几个字段。
     * @param SortField 排序字段，支持 name,line,type,value,weight,mx,ttl,updated_on 几个字段。
     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get 排序方式，正序：ASC，逆序：DESC。默认值为ASC。 
     * @return SortType 排序方式，正序：ASC，逆序：DESC。默认值为ASC。
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set 排序方式，正序：ASC，逆序：DESC。默认值为ASC。
     * @param SortType 排序方式，正序：ASC，逆序：DESC。默认值为ASC。
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get 偏移量，默认值为0。 
     * @return Offset 偏移量，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认值为0。
     * @param Offset 偏移量，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数量，当前Limit最大支持3000。默认值为100。 
     * @return Limit 限制数量，当前Limit最大支持3000。默认值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数量，当前Limit最大支持3000。默认值为100。
     * @param Limit 限制数量，当前Limit最大支持3000。默认值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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

    }
}

