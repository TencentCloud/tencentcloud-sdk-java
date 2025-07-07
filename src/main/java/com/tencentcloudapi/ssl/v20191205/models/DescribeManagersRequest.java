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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeManagersRequest extends AbstractModel {

    /**
    * 公司ID,可以从DescribeCompanies接口获取
    */
    @SerializedName("CompanyId")
    @Expose
    private Long CompanyId;

    /**
    * 分页偏移量，如果不传默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页每页数量，如果不传默认值为10，最大值为1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 管理人姓名（将废弃），请使用SearchKey
    */
    @SerializedName("ManagerName")
    @Expose
    private String ManagerName;

    /**
    * 模糊查询管理人邮箱（将废弃），请使用SearchKey
    */
    @SerializedName("ManagerMail")
    @Expose
    private String ManagerMail;

    /**
    * 根据管理人状态进行筛选，取值有
'none' 未提交审核
'audit', 亚信审核中
'CAaudit' CA审核中
'ok' 已审核
'invalid'  审核失败
'expiring'  即将过期
'expired' 已过期
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 根据这样的格式:管理人姓|管理人名|邮箱|部门 ,进行精准匹配
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get 公司ID,可以从DescribeCompanies接口获取 
     * @return CompanyId 公司ID,可以从DescribeCompanies接口获取
     */
    public Long getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 公司ID,可以从DescribeCompanies接口获取
     * @param CompanyId 公司ID,可以从DescribeCompanies接口获取
     */
    public void setCompanyId(Long CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 分页偏移量，如果不传默认值为0 
     * @return Offset 分页偏移量，如果不传默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，如果不传默认值为0
     * @param Offset 分页偏移量，如果不传默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页每页数量，如果不传默认值为10，最大值为1000 
     * @return Limit 分页每页数量，如果不传默认值为10，最大值为1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页每页数量，如果不传默认值为10，最大值为1000
     * @param Limit 分页每页数量，如果不传默认值为10，最大值为1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 管理人姓名（将废弃），请使用SearchKey 
     * @return ManagerName 管理人姓名（将废弃），请使用SearchKey
     */
    public String getManagerName() {
        return this.ManagerName;
    }

    /**
     * Set 管理人姓名（将废弃），请使用SearchKey
     * @param ManagerName 管理人姓名（将废弃），请使用SearchKey
     */
    public void setManagerName(String ManagerName) {
        this.ManagerName = ManagerName;
    }

    /**
     * Get 模糊查询管理人邮箱（将废弃），请使用SearchKey 
     * @return ManagerMail 模糊查询管理人邮箱（将废弃），请使用SearchKey
     */
    public String getManagerMail() {
        return this.ManagerMail;
    }

    /**
     * Set 模糊查询管理人邮箱（将废弃），请使用SearchKey
     * @param ManagerMail 模糊查询管理人邮箱（将废弃），请使用SearchKey
     */
    public void setManagerMail(String ManagerMail) {
        this.ManagerMail = ManagerMail;
    }

    /**
     * Get 根据管理人状态进行筛选，取值有
'none' 未提交审核
'audit', 亚信审核中
'CAaudit' CA审核中
'ok' 已审核
'invalid'  审核失败
'expiring'  即将过期
'expired' 已过期 
     * @return Status 根据管理人状态进行筛选，取值有
'none' 未提交审核
'audit', 亚信审核中
'CAaudit' CA审核中
'ok' 已审核
'invalid'  审核失败
'expiring'  即将过期
'expired' 已过期
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 根据管理人状态进行筛选，取值有
'none' 未提交审核
'audit', 亚信审核中
'CAaudit' CA审核中
'ok' 已审核
'invalid'  审核失败
'expiring'  即将过期
'expired' 已过期
     * @param Status 根据管理人状态进行筛选，取值有
'none' 未提交审核
'audit', 亚信审核中
'CAaudit' CA审核中
'ok' 已审核
'invalid'  审核失败
'expiring'  即将过期
'expired' 已过期
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 根据这样的格式:管理人姓|管理人名|邮箱|部门 ,进行精准匹配 
     * @return SearchKey 根据这样的格式:管理人姓|管理人名|邮箱|部门 ,进行精准匹配
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 根据这样的格式:管理人姓|管理人名|邮箱|部门 ,进行精准匹配
     * @param SearchKey 根据这样的格式:管理人姓|管理人名|邮箱|部门 ,进行精准匹配
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    public DescribeManagersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeManagersRequest(DescribeManagersRequest source) {
        if (source.CompanyId != null) {
            this.CompanyId = new Long(source.CompanyId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ManagerName != null) {
            this.ManagerName = new String(source.ManagerName);
        }
        if (source.ManagerMail != null) {
            this.ManagerMail = new String(source.ManagerMail);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ManagerName", this.ManagerName);
        this.setParamSimple(map, prefix + "ManagerMail", this.ManagerMail);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);

    }
}

