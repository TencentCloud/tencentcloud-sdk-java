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

public class DescribeDomainFilterListRequest extends AbstractModel{

    /**
    * 根据域名分组类型获取域名。可取值为 ALL，MINE，SHARE，RECENT。
ALL：全部
MINE：我的域名
SHARE：共享给我的域名
RECENT：最近操作过的域名
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 记录开始的偏移, 第一条记录为 0, 依次类推。默认值为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 要获取的域名数量, 比如获取 20 个, 则为 20。默认值为 5000。如果账户中的域名数量超过了 5000, 将会强制分页并且只返回前 5000 条, 这时需要通过 Offset 和 Limit 参数去获取其它域名。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 根据域名分组 id 获取域名，可通过 DescribeDomain 或 DescribeDomainList 接口 GroupId 字段获取。
    */
    @SerializedName("GroupId")
    @Expose
    private Long [] GroupId;

    /**
    * 根据关键字获取域名。
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 排序字段。可取值为 NAME，STATUS，RECORDS，GRADE，UPDATED_ON。
NAME：域名名称
STATUS：域名状态
RECORDS：记录数量
GRADE：套餐等级
UPDATED_ON：更新时间
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * 排序类型，升序：ASC，降序：DESC。
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * 根据域名状态获取域名。可取值为 ENABLE，LOCK，PAUSE，SPAM。
ENABLE：正常
LOCK：锁定
PAUSE：暂停
SPAM：封禁
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * 根据套餐获取域名，可通过 DescribeDomain 或 DescribeDomainList 接口 Grade 字段获取。
    */
    @SerializedName("Package")
    @Expose
    private String [] Package;

    /**
    * 根据备注信息获取域名。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 要获取域名的更新时间起始时间点，如 '2021-05-01 03:00:00'。
    */
    @SerializedName("UpdatedAtBegin")
    @Expose
    private String UpdatedAtBegin;

    /**
    * 要获取域名的更新时间终止时间点，如 '2021-05-10 20:00:00'。
    */
    @SerializedName("UpdatedAtEnd")
    @Expose
    private String UpdatedAtEnd;

    /**
    * 要获取域名的记录数查询区间起点。
    */
    @SerializedName("RecordCountBegin")
    @Expose
    private Long RecordCountBegin;

    /**
    * 要获取域名的记录数查询区间终点。
    */
    @SerializedName("RecordCountEnd")
    @Expose
    private Long RecordCountEnd;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 标签过滤
    */
    @SerializedName("Tags")
    @Expose
    private TagItemFilter [] Tags;

    /**
     * Get 根据域名分组类型获取域名。可取值为 ALL，MINE，SHARE，RECENT。
ALL：全部
MINE：我的域名
SHARE：共享给我的域名
RECENT：最近操作过的域名 
     * @return Type 根据域名分组类型获取域名。可取值为 ALL，MINE，SHARE，RECENT。
ALL：全部
MINE：我的域名
SHARE：共享给我的域名
RECENT：最近操作过的域名
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 根据域名分组类型获取域名。可取值为 ALL，MINE，SHARE，RECENT。
ALL：全部
MINE：我的域名
SHARE：共享给我的域名
RECENT：最近操作过的域名
     * @param Type 根据域名分组类型获取域名。可取值为 ALL，MINE，SHARE，RECENT。
ALL：全部
MINE：我的域名
SHARE：共享给我的域名
RECENT：最近操作过的域名
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 记录开始的偏移, 第一条记录为 0, 依次类推。默认值为 0。 
     * @return Offset 记录开始的偏移, 第一条记录为 0, 依次类推。默认值为 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 记录开始的偏移, 第一条记录为 0, 依次类推。默认值为 0。
     * @param Offset 记录开始的偏移, 第一条记录为 0, 依次类推。默认值为 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 要获取的域名数量, 比如获取 20 个, 则为 20。默认值为 5000。如果账户中的域名数量超过了 5000, 将会强制分页并且只返回前 5000 条, 这时需要通过 Offset 和 Limit 参数去获取其它域名。 
     * @return Limit 要获取的域名数量, 比如获取 20 个, 则为 20。默认值为 5000。如果账户中的域名数量超过了 5000, 将会强制分页并且只返回前 5000 条, 这时需要通过 Offset 和 Limit 参数去获取其它域名。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 要获取的域名数量, 比如获取 20 个, 则为 20。默认值为 5000。如果账户中的域名数量超过了 5000, 将会强制分页并且只返回前 5000 条, 这时需要通过 Offset 和 Limit 参数去获取其它域名。
     * @param Limit 要获取的域名数量, 比如获取 20 个, 则为 20。默认值为 5000。如果账户中的域名数量超过了 5000, 将会强制分页并且只返回前 5000 条, 这时需要通过 Offset 和 Limit 参数去获取其它域名。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 根据域名分组 id 获取域名，可通过 DescribeDomain 或 DescribeDomainList 接口 GroupId 字段获取。 
     * @return GroupId 根据域名分组 id 获取域名，可通过 DescribeDomain 或 DescribeDomainList 接口 GroupId 字段获取。
     */
    public Long [] getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 根据域名分组 id 获取域名，可通过 DescribeDomain 或 DescribeDomainList 接口 GroupId 字段获取。
     * @param GroupId 根据域名分组 id 获取域名，可通过 DescribeDomain 或 DescribeDomainList 接口 GroupId 字段获取。
     */
    public void setGroupId(Long [] GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 根据关键字获取域名。 
     * @return Keyword 根据关键字获取域名。
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 根据关键字获取域名。
     * @param Keyword 根据关键字获取域名。
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 排序字段。可取值为 NAME，STATUS，RECORDS，GRADE，UPDATED_ON。
NAME：域名名称
STATUS：域名状态
RECORDS：记录数量
GRADE：套餐等级
UPDATED_ON：更新时间 
     * @return SortField 排序字段。可取值为 NAME，STATUS，RECORDS，GRADE，UPDATED_ON。
NAME：域名名称
STATUS：域名状态
RECORDS：记录数量
GRADE：套餐等级
UPDATED_ON：更新时间
     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set 排序字段。可取值为 NAME，STATUS，RECORDS，GRADE，UPDATED_ON。
NAME：域名名称
STATUS：域名状态
RECORDS：记录数量
GRADE：套餐等级
UPDATED_ON：更新时间
     * @param SortField 排序字段。可取值为 NAME，STATUS，RECORDS，GRADE，UPDATED_ON。
NAME：域名名称
STATUS：域名状态
RECORDS：记录数量
GRADE：套餐等级
UPDATED_ON：更新时间
     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get 排序类型，升序：ASC，降序：DESC。 
     * @return SortType 排序类型，升序：ASC，降序：DESC。
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set 排序类型，升序：ASC，降序：DESC。
     * @param SortType 排序类型，升序：ASC，降序：DESC。
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get 根据域名状态获取域名。可取值为 ENABLE，LOCK，PAUSE，SPAM。
ENABLE：正常
LOCK：锁定
PAUSE：暂停
SPAM：封禁 
     * @return Status 根据域名状态获取域名。可取值为 ENABLE，LOCK，PAUSE，SPAM。
ENABLE：正常
LOCK：锁定
PAUSE：暂停
SPAM：封禁
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set 根据域名状态获取域名。可取值为 ENABLE，LOCK，PAUSE，SPAM。
ENABLE：正常
LOCK：锁定
PAUSE：暂停
SPAM：封禁
     * @param Status 根据域名状态获取域名。可取值为 ENABLE，LOCK，PAUSE，SPAM。
ENABLE：正常
LOCK：锁定
PAUSE：暂停
SPAM：封禁
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get 根据套餐获取域名，可通过 DescribeDomain 或 DescribeDomainList 接口 Grade 字段获取。 
     * @return Package 根据套餐获取域名，可通过 DescribeDomain 或 DescribeDomainList 接口 Grade 字段获取。
     */
    public String [] getPackage() {
        return this.Package;
    }

    /**
     * Set 根据套餐获取域名，可通过 DescribeDomain 或 DescribeDomainList 接口 Grade 字段获取。
     * @param Package 根据套餐获取域名，可通过 DescribeDomain 或 DescribeDomainList 接口 Grade 字段获取。
     */
    public void setPackage(String [] Package) {
        this.Package = Package;
    }

    /**
     * Get 根据备注信息获取域名。 
     * @return Remark 根据备注信息获取域名。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 根据备注信息获取域名。
     * @param Remark 根据备注信息获取域名。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 要获取域名的更新时间起始时间点，如 '2021-05-01 03:00:00'。 
     * @return UpdatedAtBegin 要获取域名的更新时间起始时间点，如 '2021-05-01 03:00:00'。
     */
    public String getUpdatedAtBegin() {
        return this.UpdatedAtBegin;
    }

    /**
     * Set 要获取域名的更新时间起始时间点，如 '2021-05-01 03:00:00'。
     * @param UpdatedAtBegin 要获取域名的更新时间起始时间点，如 '2021-05-01 03:00:00'。
     */
    public void setUpdatedAtBegin(String UpdatedAtBegin) {
        this.UpdatedAtBegin = UpdatedAtBegin;
    }

    /**
     * Get 要获取域名的更新时间终止时间点，如 '2021-05-10 20:00:00'。 
     * @return UpdatedAtEnd 要获取域名的更新时间终止时间点，如 '2021-05-10 20:00:00'。
     */
    public String getUpdatedAtEnd() {
        return this.UpdatedAtEnd;
    }

    /**
     * Set 要获取域名的更新时间终止时间点，如 '2021-05-10 20:00:00'。
     * @param UpdatedAtEnd 要获取域名的更新时间终止时间点，如 '2021-05-10 20:00:00'。
     */
    public void setUpdatedAtEnd(String UpdatedAtEnd) {
        this.UpdatedAtEnd = UpdatedAtEnd;
    }

    /**
     * Get 要获取域名的记录数查询区间起点。 
     * @return RecordCountBegin 要获取域名的记录数查询区间起点。
     */
    public Long getRecordCountBegin() {
        return this.RecordCountBegin;
    }

    /**
     * Set 要获取域名的记录数查询区间起点。
     * @param RecordCountBegin 要获取域名的记录数查询区间起点。
     */
    public void setRecordCountBegin(Long RecordCountBegin) {
        this.RecordCountBegin = RecordCountBegin;
    }

    /**
     * Get 要获取域名的记录数查询区间终点。 
     * @return RecordCountEnd 要获取域名的记录数查询区间终点。
     */
    public Long getRecordCountEnd() {
        return this.RecordCountEnd;
    }

    /**
     * Set 要获取域名的记录数查询区间终点。
     * @param RecordCountEnd 要获取域名的记录数查询区间终点。
     */
    public void setRecordCountEnd(Long RecordCountEnd) {
        this.RecordCountEnd = RecordCountEnd;
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

    /**
     * Get 标签过滤 
     * @return Tags 标签过滤
     */
    public TagItemFilter [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签过滤
     * @param Tags 标签过滤
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

