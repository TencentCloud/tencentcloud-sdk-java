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

public class DescribeRecordFilterListRequest extends AbstractModel{

    /**
    * 要获取的解析记录所属的域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 要获取的解析记录所属的域名 Id，如果传了 DomainId，系统将会忽略 Domain 参数。 可以通过接口 DescribeDomainList 查到所有的 Domain 以及 DomainId。
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * 根据解析记录的主机头获取解析记录。默认模糊匹配。可以通过设置 IsExactSubdomain 参数为 true 进行精确查找。
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * 获取某些类型的解析记录，如 A，CNAME，NS，AAAA，显性URL，隐性URL，CAA，SPF等。
    */
    @SerializedName("RecordType")
    @Expose
    private String [] RecordType;

    /**
    * 获取某些线路ID的解析记录。可以通过接口 DescribeRecordLineList 查看当前域名允许的线路信息。
    */
    @SerializedName("RecordLine")
    @Expose
    private String [] RecordLine;

    /**
    * 获取某些分组下的解析记录时，传这个分组 Id。可以通过接口 DescribeRecordGroupList 接口 GroupId 字段获取。
    */
    @SerializedName("GroupId")
    @Expose
    private Long [] GroupId;

    /**
    * 通过关键字搜索解析记录，当前支持搜索主机头和记录值
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 排序字段，支持 NAME，LINE，TYPE，VALUE，WEIGHT，MX，TTL，UPDATED_ON 几个字段。
NAME：解析记录的主机头
LINE：解析记录线路
TYPE：解析记录类型
VALUE：解析记录值
WEIGHT：权重
MX：MX 优先级
TTL：解析记录缓存时间
UPDATED_ON：解析记录更新时间

    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * 排序方式，升序：ASC，降序：DESC。默认值为ASC。
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
    * 根据解析记录的值获取解析记录
    */
    @SerializedName("RecordValue")
    @Expose
    private String RecordValue;

    /**
    * 根据解析记录的状态获取解析记录。可取值为 ENABLE，DISABLE。
ENABLE：正常 
DISABLE：暂停 
    */
    @SerializedName("RecordStatus")
    @Expose
    private String [] RecordStatus;

    /**
    * 要获取解析记录权重查询区间起点。
    */
    @SerializedName("WeightBegin")
    @Expose
    private Long WeightBegin;

    /**
    * 要获取解析记录权重查询区间终点。
    */
    @SerializedName("WeightEnd")
    @Expose
    private Long WeightEnd;

    /**
    * 要获取解析记录 MX 优先级查询区间起点。
    */
    @SerializedName("MXBegin")
    @Expose
    private Long MXBegin;

    /**
    * 要获取解析记录 MX 优先级查询区间终点。
    */
    @SerializedName("MXEnd")
    @Expose
    private Long MXEnd;

    /**
    * 要获取解析记录 TTL 查询区间起点。
    */
    @SerializedName("TTLBegin")
    @Expose
    private Long TTLBegin;

    /**
    * 要获取解析记录 TTL 查询区间终点。
    */
    @SerializedName("TTLEnd")
    @Expose
    private Long TTLEnd;

    /**
    * 要获取解析记录更新时间查询区间起点。
    */
    @SerializedName("UpdatedAtBegin")
    @Expose
    private String UpdatedAtBegin;

    /**
    * 要获取解析记录更新时间查询区间终点。
    */
    @SerializedName("UpdatedAtEnd")
    @Expose
    private String UpdatedAtEnd;

    /**
    * 根据解析记录的备注获取解析记录。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 是否根据 Subdomain 参数进行精确查找。
    */
    @SerializedName("IsExactSubDomain")
    @Expose
    private Boolean IsExactSubDomain;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get 要获取的解析记录所属的域名。 
     * @return Domain 要获取的解析记录所属的域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 要获取的解析记录所属的域名。
     * @param Domain 要获取的解析记录所属的域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 要获取的解析记录所属的域名 Id，如果传了 DomainId，系统将会忽略 Domain 参数。 可以通过接口 DescribeDomainList 查到所有的 Domain 以及 DomainId。 
     * @return DomainId 要获取的解析记录所属的域名 Id，如果传了 DomainId，系统将会忽略 Domain 参数。 可以通过接口 DescribeDomainList 查到所有的 Domain 以及 DomainId。
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 要获取的解析记录所属的域名 Id，如果传了 DomainId，系统将会忽略 Domain 参数。 可以通过接口 DescribeDomainList 查到所有的 Domain 以及 DomainId。
     * @param DomainId 要获取的解析记录所属的域名 Id，如果传了 DomainId，系统将会忽略 Domain 参数。 可以通过接口 DescribeDomainList 查到所有的 Domain 以及 DomainId。
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 根据解析记录的主机头获取解析记录。默认模糊匹配。可以通过设置 IsExactSubdomain 参数为 true 进行精确查找。 
     * @return SubDomain 根据解析记录的主机头获取解析记录。默认模糊匹配。可以通过设置 IsExactSubdomain 参数为 true 进行精确查找。
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 根据解析记录的主机头获取解析记录。默认模糊匹配。可以通过设置 IsExactSubdomain 参数为 true 进行精确查找。
     * @param SubDomain 根据解析记录的主机头获取解析记录。默认模糊匹配。可以通过设置 IsExactSubdomain 参数为 true 进行精确查找。
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get 获取某些类型的解析记录，如 A，CNAME，NS，AAAA，显性URL，隐性URL，CAA，SPF等。 
     * @return RecordType 获取某些类型的解析记录，如 A，CNAME，NS，AAAA，显性URL，隐性URL，CAA，SPF等。
     */
    public String [] getRecordType() {
        return this.RecordType;
    }

    /**
     * Set 获取某些类型的解析记录，如 A，CNAME，NS，AAAA，显性URL，隐性URL，CAA，SPF等。
     * @param RecordType 获取某些类型的解析记录，如 A，CNAME，NS，AAAA，显性URL，隐性URL，CAA，SPF等。
     */
    public void setRecordType(String [] RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get 获取某些线路ID的解析记录。可以通过接口 DescribeRecordLineList 查看当前域名允许的线路信息。 
     * @return RecordLine 获取某些线路ID的解析记录。可以通过接口 DescribeRecordLineList 查看当前域名允许的线路信息。
     */
    public String [] getRecordLine() {
        return this.RecordLine;
    }

    /**
     * Set 获取某些线路ID的解析记录。可以通过接口 DescribeRecordLineList 查看当前域名允许的线路信息。
     * @param RecordLine 获取某些线路ID的解析记录。可以通过接口 DescribeRecordLineList 查看当前域名允许的线路信息。
     */
    public void setRecordLine(String [] RecordLine) {
        this.RecordLine = RecordLine;
    }

    /**
     * Get 获取某些分组下的解析记录时，传这个分组 Id。可以通过接口 DescribeRecordGroupList 接口 GroupId 字段获取。 
     * @return GroupId 获取某些分组下的解析记录时，传这个分组 Id。可以通过接口 DescribeRecordGroupList 接口 GroupId 字段获取。
     */
    public Long [] getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 获取某些分组下的解析记录时，传这个分组 Id。可以通过接口 DescribeRecordGroupList 接口 GroupId 字段获取。
     * @param GroupId 获取某些分组下的解析记录时，传这个分组 Id。可以通过接口 DescribeRecordGroupList 接口 GroupId 字段获取。
     */
    public void setGroupId(Long [] GroupId) {
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
     * Get 排序字段，支持 NAME，LINE，TYPE，VALUE，WEIGHT，MX，TTL，UPDATED_ON 几个字段。
NAME：解析记录的主机头
LINE：解析记录线路
TYPE：解析记录类型
VALUE：解析记录值
WEIGHT：权重
MX：MX 优先级
TTL：解析记录缓存时间
UPDATED_ON：解析记录更新时间
 
     * @return SortField 排序字段，支持 NAME，LINE，TYPE，VALUE，WEIGHT，MX，TTL，UPDATED_ON 几个字段。
NAME：解析记录的主机头
LINE：解析记录线路
TYPE：解析记录类型
VALUE：解析记录值
WEIGHT：权重
MX：MX 优先级
TTL：解析记录缓存时间
UPDATED_ON：解析记录更新时间

     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set 排序字段，支持 NAME，LINE，TYPE，VALUE，WEIGHT，MX，TTL，UPDATED_ON 几个字段。
NAME：解析记录的主机头
LINE：解析记录线路
TYPE：解析记录类型
VALUE：解析记录值
WEIGHT：权重
MX：MX 优先级
TTL：解析记录缓存时间
UPDATED_ON：解析记录更新时间

     * @param SortField 排序字段，支持 NAME，LINE，TYPE，VALUE，WEIGHT，MX，TTL，UPDATED_ON 几个字段。
NAME：解析记录的主机头
LINE：解析记录线路
TYPE：解析记录类型
VALUE：解析记录值
WEIGHT：权重
MX：MX 优先级
TTL：解析记录缓存时间
UPDATED_ON：解析记录更新时间

     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get 排序方式，升序：ASC，降序：DESC。默认值为ASC。 
     * @return SortType 排序方式，升序：ASC，降序：DESC。默认值为ASC。
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set 排序方式，升序：ASC，降序：DESC。默认值为ASC。
     * @param SortType 排序方式，升序：ASC，降序：DESC。默认值为ASC。
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

    /**
     * Get 根据解析记录的值获取解析记录 
     * @return RecordValue 根据解析记录的值获取解析记录
     */
    public String getRecordValue() {
        return this.RecordValue;
    }

    /**
     * Set 根据解析记录的值获取解析记录
     * @param RecordValue 根据解析记录的值获取解析记录
     */
    public void setRecordValue(String RecordValue) {
        this.RecordValue = RecordValue;
    }

    /**
     * Get 根据解析记录的状态获取解析记录。可取值为 ENABLE，DISABLE。
ENABLE：正常 
DISABLE：暂停  
     * @return RecordStatus 根据解析记录的状态获取解析记录。可取值为 ENABLE，DISABLE。
ENABLE：正常 
DISABLE：暂停 
     */
    public String [] getRecordStatus() {
        return this.RecordStatus;
    }

    /**
     * Set 根据解析记录的状态获取解析记录。可取值为 ENABLE，DISABLE。
ENABLE：正常 
DISABLE：暂停 
     * @param RecordStatus 根据解析记录的状态获取解析记录。可取值为 ENABLE，DISABLE。
ENABLE：正常 
DISABLE：暂停 
     */
    public void setRecordStatus(String [] RecordStatus) {
        this.RecordStatus = RecordStatus;
    }

    /**
     * Get 要获取解析记录权重查询区间起点。 
     * @return WeightBegin 要获取解析记录权重查询区间起点。
     */
    public Long getWeightBegin() {
        return this.WeightBegin;
    }

    /**
     * Set 要获取解析记录权重查询区间起点。
     * @param WeightBegin 要获取解析记录权重查询区间起点。
     */
    public void setWeightBegin(Long WeightBegin) {
        this.WeightBegin = WeightBegin;
    }

    /**
     * Get 要获取解析记录权重查询区间终点。 
     * @return WeightEnd 要获取解析记录权重查询区间终点。
     */
    public Long getWeightEnd() {
        return this.WeightEnd;
    }

    /**
     * Set 要获取解析记录权重查询区间终点。
     * @param WeightEnd 要获取解析记录权重查询区间终点。
     */
    public void setWeightEnd(Long WeightEnd) {
        this.WeightEnd = WeightEnd;
    }

    /**
     * Get 要获取解析记录 MX 优先级查询区间起点。 
     * @return MXBegin 要获取解析记录 MX 优先级查询区间起点。
     */
    public Long getMXBegin() {
        return this.MXBegin;
    }

    /**
     * Set 要获取解析记录 MX 优先级查询区间起点。
     * @param MXBegin 要获取解析记录 MX 优先级查询区间起点。
     */
    public void setMXBegin(Long MXBegin) {
        this.MXBegin = MXBegin;
    }

    /**
     * Get 要获取解析记录 MX 优先级查询区间终点。 
     * @return MXEnd 要获取解析记录 MX 优先级查询区间终点。
     */
    public Long getMXEnd() {
        return this.MXEnd;
    }

    /**
     * Set 要获取解析记录 MX 优先级查询区间终点。
     * @param MXEnd 要获取解析记录 MX 优先级查询区间终点。
     */
    public void setMXEnd(Long MXEnd) {
        this.MXEnd = MXEnd;
    }

    /**
     * Get 要获取解析记录 TTL 查询区间起点。 
     * @return TTLBegin 要获取解析记录 TTL 查询区间起点。
     */
    public Long getTTLBegin() {
        return this.TTLBegin;
    }

    /**
     * Set 要获取解析记录 TTL 查询区间起点。
     * @param TTLBegin 要获取解析记录 TTL 查询区间起点。
     */
    public void setTTLBegin(Long TTLBegin) {
        this.TTLBegin = TTLBegin;
    }

    /**
     * Get 要获取解析记录 TTL 查询区间终点。 
     * @return TTLEnd 要获取解析记录 TTL 查询区间终点。
     */
    public Long getTTLEnd() {
        return this.TTLEnd;
    }

    /**
     * Set 要获取解析记录 TTL 查询区间终点。
     * @param TTLEnd 要获取解析记录 TTL 查询区间终点。
     */
    public void setTTLEnd(Long TTLEnd) {
        this.TTLEnd = TTLEnd;
    }

    /**
     * Get 要获取解析记录更新时间查询区间起点。 
     * @return UpdatedAtBegin 要获取解析记录更新时间查询区间起点。
     */
    public String getUpdatedAtBegin() {
        return this.UpdatedAtBegin;
    }

    /**
     * Set 要获取解析记录更新时间查询区间起点。
     * @param UpdatedAtBegin 要获取解析记录更新时间查询区间起点。
     */
    public void setUpdatedAtBegin(String UpdatedAtBegin) {
        this.UpdatedAtBegin = UpdatedAtBegin;
    }

    /**
     * Get 要获取解析记录更新时间查询区间终点。 
     * @return UpdatedAtEnd 要获取解析记录更新时间查询区间终点。
     */
    public String getUpdatedAtEnd() {
        return this.UpdatedAtEnd;
    }

    /**
     * Set 要获取解析记录更新时间查询区间终点。
     * @param UpdatedAtEnd 要获取解析记录更新时间查询区间终点。
     */
    public void setUpdatedAtEnd(String UpdatedAtEnd) {
        this.UpdatedAtEnd = UpdatedAtEnd;
    }

    /**
     * Get 根据解析记录的备注获取解析记录。 
     * @return Remark 根据解析记录的备注获取解析记录。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 根据解析记录的备注获取解析记录。
     * @param Remark 根据解析记录的备注获取解析记录。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 是否根据 Subdomain 参数进行精确查找。 
     * @return IsExactSubDomain 是否根据 Subdomain 参数进行精确查找。
     */
    public Boolean getIsExactSubDomain() {
        return this.IsExactSubDomain;
    }

    /**
     * Set 是否根据 Subdomain 参数进行精确查找。
     * @param IsExactSubDomain 是否根据 Subdomain 参数进行精确查找。
     */
    public void setIsExactSubDomain(Boolean IsExactSubDomain) {
        this.IsExactSubDomain = IsExactSubDomain;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    public DescribeRecordFilterListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordFilterListRequest(DescribeRecordFilterListRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.RecordType != null) {
            this.RecordType = new String[source.RecordType.length];
            for (int i = 0; i < source.RecordType.length; i++) {
                this.RecordType[i] = new String(source.RecordType[i]);
            }
        }
        if (source.RecordLine != null) {
            this.RecordLine = new String[source.RecordLine.length];
            for (int i = 0; i < source.RecordLine.length; i++) {
                this.RecordLine[i] = new String(source.RecordLine[i]);
            }
        }
        if (source.GroupId != null) {
            this.GroupId = new Long[source.GroupId.length];
            for (int i = 0; i < source.GroupId.length; i++) {
                this.GroupId[i] = new Long(source.GroupId[i]);
            }
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
        if (source.RecordValue != null) {
            this.RecordValue = new String(source.RecordValue);
        }
        if (source.RecordStatus != null) {
            this.RecordStatus = new String[source.RecordStatus.length];
            for (int i = 0; i < source.RecordStatus.length; i++) {
                this.RecordStatus[i] = new String(source.RecordStatus[i]);
            }
        }
        if (source.WeightBegin != null) {
            this.WeightBegin = new Long(source.WeightBegin);
        }
        if (source.WeightEnd != null) {
            this.WeightEnd = new Long(source.WeightEnd);
        }
        if (source.MXBegin != null) {
            this.MXBegin = new Long(source.MXBegin);
        }
        if (source.MXEnd != null) {
            this.MXEnd = new Long(source.MXEnd);
        }
        if (source.TTLBegin != null) {
            this.TTLBegin = new Long(source.TTLBegin);
        }
        if (source.TTLEnd != null) {
            this.TTLEnd = new Long(source.TTLEnd);
        }
        if (source.UpdatedAtBegin != null) {
            this.UpdatedAtBegin = new String(source.UpdatedAtBegin);
        }
        if (source.UpdatedAtEnd != null) {
            this.UpdatedAtEnd = new String(source.UpdatedAtEnd);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.IsExactSubDomain != null) {
            this.IsExactSubDomain = new Boolean(source.IsExactSubDomain);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamArraySimple(map, prefix + "RecordType.", this.RecordType);
        this.setParamArraySimple(map, prefix + "RecordLine.", this.RecordLine);
        this.setParamArraySimple(map, prefix + "GroupId.", this.GroupId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "SortField", this.SortField);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "RecordValue", this.RecordValue);
        this.setParamArraySimple(map, prefix + "RecordStatus.", this.RecordStatus);
        this.setParamSimple(map, prefix + "WeightBegin", this.WeightBegin);
        this.setParamSimple(map, prefix + "WeightEnd", this.WeightEnd);
        this.setParamSimple(map, prefix + "MXBegin", this.MXBegin);
        this.setParamSimple(map, prefix + "MXEnd", this.MXEnd);
        this.setParamSimple(map, prefix + "TTLBegin", this.TTLBegin);
        this.setParamSimple(map, prefix + "TTLEnd", this.TTLEnd);
        this.setParamSimple(map, prefix + "UpdatedAtBegin", this.UpdatedAtBegin);
        this.setParamSimple(map, prefix + "UpdatedAtEnd", this.UpdatedAtEnd);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "IsExactSubDomain", this.IsExactSubDomain);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

