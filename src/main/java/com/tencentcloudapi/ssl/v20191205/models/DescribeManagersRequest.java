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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeManagersRequest extends AbstractModel{

    /**
    * 公司ID
    */
    @SerializedName("CompanyId")
    @Expose
    private Long CompanyId;

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页每页数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 管理人姓名
    */
    @SerializedName("ManagerName")
    @Expose
    private String ManagerName;

    /**
    * 模糊查询管理人邮箱
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
    * 管理人姓名/邮箱/部门精准匹配
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get 公司ID 
     * @return CompanyId 公司ID
     */
    public Long getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 公司ID
     * @param CompanyId 公司ID
     */
    public void setCompanyId(Long CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页每页数量 
     * @return Limit 分页每页数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页每页数量
     * @param Limit 分页每页数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 管理人姓名 
     * @return ManagerName 管理人姓名
     */
    public String getManagerName() {
        return this.ManagerName;
    }

    /**
     * Set 管理人姓名
     * @param ManagerName 管理人姓名
     */
    public void setManagerName(String ManagerName) {
        this.ManagerName = ManagerName;
    }

    /**
     * Get 模糊查询管理人邮箱 
     * @return ManagerMail 模糊查询管理人邮箱
     */
    public String getManagerMail() {
        return this.ManagerMail;
    }

    /**
     * Set 模糊查询管理人邮箱
     * @param ManagerMail 模糊查询管理人邮箱
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
     * Get 管理人姓名/邮箱/部门精准匹配 
     * @return SearchKey 管理人姓名/邮箱/部门精准匹配
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 管理人姓名/邮箱/部门精准匹配
     * @param SearchKey 管理人姓名/邮箱/部门精准匹配
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

