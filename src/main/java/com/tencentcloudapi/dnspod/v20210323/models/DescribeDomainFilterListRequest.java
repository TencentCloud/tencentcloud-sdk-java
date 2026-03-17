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

public class DescribeDomainFilterListRequest extends AbstractModel {

    /**
    * <p>根据域名分组类型获取域名。可取值为 ALL，MINE，SHARE，RECENT。<br>ALL：全部<br>MINE：我的域名<br>SHARE：共享给我的域名<br>RECENT：最近操作过的域名</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>记录开始的偏移, 第一条记录为 0, 依次类推。默认值为 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>要获取的域名数量, 比如获取 20 个, 则为 20。默认值为 5000。如果账户中的域名数量超过了 5000, 将会强制分页并且只返回前 5000 条, 这时需要通过 Offset 和 Limit 参数去获取其它域名。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>根据域名分组 id 获取域名</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1427/56172">DescribeDomainList</a></p>
    */
    @SerializedName("GroupId")
    @Expose
    private Long [] GroupId;

    /**
    * <p>根据关键字获取域名。</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>排序字段。可取值为 NAME，STATUS，RECORDS，GRADE，UPDATED_ON。<br>NAME：域名名称<br>STATUS：域名状态<br>RECORDS：记录数量<br>GRADE：套餐等级<br>UPDATED_ON：更新时间</p>
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * <p>排序类型，升序：ASC，降序：DESC。</p>
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * <p>根据域名状态获取域名。可取值为 ENABLE，LOCK，PAUSE，SPAM。<br>ENABLE：正常<br>LOCK：锁定<br>PAUSE：暂停<br>SPAM：封禁</p>
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * <p>根据套餐获取域名，可通过 DescribeDomain 或 DescribeDomainList 接口 Grade 字段获取。</p>
    */
    @SerializedName("Package")
    @Expose
    private String [] Package;

    /**
    * <p>根据备注信息获取域名。</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>要获取域名的更新时间起始时间点，如 &#39;2021-05-01 03:00:00&#39;。</p>
    */
    @SerializedName("UpdatedAtBegin")
    @Expose
    private String UpdatedAtBegin;

    /**
    * <p>要获取域名的更新时间终止时间点，如 &#39;2021-05-10 20:00:00&#39;。</p>
    */
    @SerializedName("UpdatedAtEnd")
    @Expose
    private String UpdatedAtEnd;

    /**
    * <p>要获取域名的记录数查询区间起点。</p>
    */
    @SerializedName("RecordCountBegin")
    @Expose
    private Long RecordCountBegin;

    /**
    * <p>要获取域名的记录数查询区间终点。</p>
    */
    @SerializedName("RecordCountEnd")
    @Expose
    private Long RecordCountEnd;

    /**
    * <p>项目ID，&quot;账号中心-项目管理&quot;拿到项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>标签过滤</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagItemFilter [] Tags;

    /**
     * Get <p>根据域名分组类型获取域名。可取值为 ALL，MINE，SHARE，RECENT。<br>ALL：全部<br>MINE：我的域名<br>SHARE：共享给我的域名<br>RECENT：最近操作过的域名</p> 
     * @return Type <p>根据域名分组类型获取域名。可取值为 ALL，MINE，SHARE，RECENT。<br>ALL：全部<br>MINE：我的域名<br>SHARE：共享给我的域名<br>RECENT：最近操作过的域名</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>根据域名分组类型获取域名。可取值为 ALL，MINE，SHARE，RECENT。<br>ALL：全部<br>MINE：我的域名<br>SHARE：共享给我的域名<br>RECENT：最近操作过的域名</p>
     * @param Type <p>根据域名分组类型获取域名。可取值为 ALL，MINE，SHARE，RECENT。<br>ALL：全部<br>MINE：我的域名<br>SHARE：共享给我的域名<br>RECENT：最近操作过的域名</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>记录开始的偏移, 第一条记录为 0, 依次类推。默认值为 0。</p> 
     * @return Offset <p>记录开始的偏移, 第一条记录为 0, 依次类推。默认值为 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>记录开始的偏移, 第一条记录为 0, 依次类推。默认值为 0。</p>
     * @param Offset <p>记录开始的偏移, 第一条记录为 0, 依次类推。默认值为 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>要获取的域名数量, 比如获取 20 个, 则为 20。默认值为 5000。如果账户中的域名数量超过了 5000, 将会强制分页并且只返回前 5000 条, 这时需要通过 Offset 和 Limit 参数去获取其它域名。</p> 
     * @return Limit <p>要获取的域名数量, 比如获取 20 个, 则为 20。默认值为 5000。如果账户中的域名数量超过了 5000, 将会强制分页并且只返回前 5000 条, 这时需要通过 Offset 和 Limit 参数去获取其它域名。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>要获取的域名数量, 比如获取 20 个, 则为 20。默认值为 5000。如果账户中的域名数量超过了 5000, 将会强制分页并且只返回前 5000 条, 这时需要通过 Offset 和 Limit 参数去获取其它域名。</p>
     * @param Limit <p>要获取的域名数量, 比如获取 20 个, 则为 20。默认值为 5000。如果账户中的域名数量超过了 5000, 将会强制分页并且只返回前 5000 条, 这时需要通过 Offset 和 Limit 参数去获取其它域名。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>根据域名分组 id 获取域名</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1427/56172">DescribeDomainList</a></p> 
     * @return GroupId <p>根据域名分组 id 获取域名</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1427/56172">DescribeDomainList</a></p>
     */
    public Long [] getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>根据域名分组 id 获取域名</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1427/56172">DescribeDomainList</a></p>
     * @param GroupId <p>根据域名分组 id 获取域名</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1427/56172">DescribeDomainList</a></p>
     */
    public void setGroupId(Long [] GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>根据关键字获取域名。</p> 
     * @return Keyword <p>根据关键字获取域名。</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>根据关键字获取域名。</p>
     * @param Keyword <p>根据关键字获取域名。</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>排序字段。可取值为 NAME，STATUS，RECORDS，GRADE，UPDATED_ON。<br>NAME：域名名称<br>STATUS：域名状态<br>RECORDS：记录数量<br>GRADE：套餐等级<br>UPDATED_ON：更新时间</p> 
     * @return SortField <p>排序字段。可取值为 NAME，STATUS，RECORDS，GRADE，UPDATED_ON。<br>NAME：域名名称<br>STATUS：域名状态<br>RECORDS：记录数量<br>GRADE：套餐等级<br>UPDATED_ON：更新时间</p>
     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set <p>排序字段。可取值为 NAME，STATUS，RECORDS，GRADE，UPDATED_ON。<br>NAME：域名名称<br>STATUS：域名状态<br>RECORDS：记录数量<br>GRADE：套餐等级<br>UPDATED_ON：更新时间</p>
     * @param SortField <p>排序字段。可取值为 NAME，STATUS，RECORDS，GRADE，UPDATED_ON。<br>NAME：域名名称<br>STATUS：域名状态<br>RECORDS：记录数量<br>GRADE：套餐等级<br>UPDATED_ON：更新时间</p>
     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get <p>排序类型，升序：ASC，降序：DESC。</p> 
     * @return SortType <p>排序类型，升序：ASC，降序：DESC。</p>
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set <p>排序类型，升序：ASC，降序：DESC。</p>
     * @param SortType <p>排序类型，升序：ASC，降序：DESC。</p>
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get <p>根据域名状态获取域名。可取值为 ENABLE，LOCK，PAUSE，SPAM。<br>ENABLE：正常<br>LOCK：锁定<br>PAUSE：暂停<br>SPAM：封禁</p> 
     * @return Status <p>根据域名状态获取域名。可取值为 ENABLE，LOCK，PAUSE，SPAM。<br>ENABLE：正常<br>LOCK：锁定<br>PAUSE：暂停<br>SPAM：封禁</p>
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>根据域名状态获取域名。可取值为 ENABLE，LOCK，PAUSE，SPAM。<br>ENABLE：正常<br>LOCK：锁定<br>PAUSE：暂停<br>SPAM：封禁</p>
     * @param Status <p>根据域名状态获取域名。可取值为 ENABLE，LOCK，PAUSE，SPAM。<br>ENABLE：正常<br>LOCK：锁定<br>PAUSE：暂停<br>SPAM：封禁</p>
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get <p>根据套餐获取域名，可通过 DescribeDomain 或 DescribeDomainList 接口 Grade 字段获取。</p> 
     * @return Package <p>根据套餐获取域名，可通过 DescribeDomain 或 DescribeDomainList 接口 Grade 字段获取。</p>
     */
    public String [] getPackage() {
        return this.Package;
    }

    /**
     * Set <p>根据套餐获取域名，可通过 DescribeDomain 或 DescribeDomainList 接口 Grade 字段获取。</p>
     * @param Package <p>根据套餐获取域名，可通过 DescribeDomain 或 DescribeDomainList 接口 Grade 字段获取。</p>
     */
    public void setPackage(String [] Package) {
        this.Package = Package;
    }

    /**
     * Get <p>根据备注信息获取域名。</p> 
     * @return Remark <p>根据备注信息获取域名。</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>根据备注信息获取域名。</p>
     * @param Remark <p>根据备注信息获取域名。</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>要获取域名的更新时间起始时间点，如 &#39;2021-05-01 03:00:00&#39;。</p> 
     * @return UpdatedAtBegin <p>要获取域名的更新时间起始时间点，如 &#39;2021-05-01 03:00:00&#39;。</p>
     */
    public String getUpdatedAtBegin() {
        return this.UpdatedAtBegin;
    }

    /**
     * Set <p>要获取域名的更新时间起始时间点，如 &#39;2021-05-01 03:00:00&#39;。</p>
     * @param UpdatedAtBegin <p>要获取域名的更新时间起始时间点，如 &#39;2021-05-01 03:00:00&#39;。</p>
     */
    public void setUpdatedAtBegin(String UpdatedAtBegin) {
        this.UpdatedAtBegin = UpdatedAtBegin;
    }

    /**
     * Get <p>要获取域名的更新时间终止时间点，如 &#39;2021-05-10 20:00:00&#39;。</p> 
     * @return UpdatedAtEnd <p>要获取域名的更新时间终止时间点，如 &#39;2021-05-10 20:00:00&#39;。</p>
     */
    public String getUpdatedAtEnd() {
        return this.UpdatedAtEnd;
    }

    /**
     * Set <p>要获取域名的更新时间终止时间点，如 &#39;2021-05-10 20:00:00&#39;。</p>
     * @param UpdatedAtEnd <p>要获取域名的更新时间终止时间点，如 &#39;2021-05-10 20:00:00&#39;。</p>
     */
    public void setUpdatedAtEnd(String UpdatedAtEnd) {
        this.UpdatedAtEnd = UpdatedAtEnd;
    }

    /**
     * Get <p>要获取域名的记录数查询区间起点。</p> 
     * @return RecordCountBegin <p>要获取域名的记录数查询区间起点。</p>
     */
    public Long getRecordCountBegin() {
        return this.RecordCountBegin;
    }

    /**
     * Set <p>要获取域名的记录数查询区间起点。</p>
     * @param RecordCountBegin <p>要获取域名的记录数查询区间起点。</p>
     */
    public void setRecordCountBegin(Long RecordCountBegin) {
        this.RecordCountBegin = RecordCountBegin;
    }

    /**
     * Get <p>要获取域名的记录数查询区间终点。</p> 
     * @return RecordCountEnd <p>要获取域名的记录数查询区间终点。</p>
     */
    public Long getRecordCountEnd() {
        return this.RecordCountEnd;
    }

    /**
     * Set <p>要获取域名的记录数查询区间终点。</p>
     * @param RecordCountEnd <p>要获取域名的记录数查询区间终点。</p>
     */
    public void setRecordCountEnd(Long RecordCountEnd) {
        this.RecordCountEnd = RecordCountEnd;
    }

    /**
     * Get <p>项目ID，&quot;账号中心-项目管理&quot;拿到项目ID</p> 
     * @return ProjectId <p>项目ID，&quot;账号中心-项目管理&quot;拿到项目ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID，&quot;账号中心-项目管理&quot;拿到项目ID</p>
     * @param ProjectId <p>项目ID，&quot;账号中心-项目管理&quot;拿到项目ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>标签过滤</p> 
     * @return Tags <p>标签过滤</p>
     */
    public TagItemFilter [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签过滤</p>
     * @param Tags <p>标签过滤</p>
     */
    public void setTags(TagItemFilter [] Tags) {
        this.Tags = Tags;
    }

    public DescribeDomainFilterListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainFilterListRequest(DescribeDomainFilterListRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.Package != null) {
            this.Package = new String[source.Package.length];
            for (int i = 0; i < source.Package.length; i++) {
                this.Package[i] = new String(source.Package[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.UpdatedAtBegin != null) {
            this.UpdatedAtBegin = new String(source.UpdatedAtBegin);
        }
        if (source.UpdatedAtEnd != null) {
            this.UpdatedAtEnd = new String(source.UpdatedAtEnd);
        }
        if (source.RecordCountBegin != null) {
            this.RecordCountBegin = new Long(source.RecordCountBegin);
        }
        if (source.RecordCountEnd != null) {
            this.RecordCountEnd = new Long(source.RecordCountEnd);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Tags != null) {
            this.Tags = new TagItemFilter[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItemFilter(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "GroupId.", this.GroupId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "SortField", this.SortField);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "Package.", this.Package);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "UpdatedAtBegin", this.UpdatedAtBegin);
        this.setParamSimple(map, prefix + "UpdatedAtEnd", this.UpdatedAtEnd);
        this.setParamSimple(map, prefix + "RecordCountBegin", this.RecordCountBegin);
        this.setParamSimple(map, prefix + "RecordCountEnd", this.RecordCountEnd);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

