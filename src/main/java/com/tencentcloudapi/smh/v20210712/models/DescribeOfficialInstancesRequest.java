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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOfficialInstancesRequest extends AbstractModel{

    /**
    * 是否查询实例绑定的超级管理员账号，默认值为 false。
    */
    @SerializedName("SuperAdminAccount")
    @Expose
    private Boolean SuperAdminAccount;

    /**
    * 按照一个或者多个实例 ID 查询，每次请求的上限为 100 个。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 页码，整型，配合 PageSize 使用，默认值为 1。
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数目，整型，配合 PageNumber 使用，默认值为 20，最大值为 100。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 对指定列进行排序
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * 续费管理筛选类型
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * 超级管理管理员账号是否绑定了手机号
    */
    @SerializedName("BindPhone")
    @Expose
    private Boolean BindPhone;

    /**
     * Get 是否查询实例绑定的超级管理员账号，默认值为 false。 
     * @return SuperAdminAccount 是否查询实例绑定的超级管理员账号，默认值为 false。
     */
    public Boolean getSuperAdminAccount() {
        return this.SuperAdminAccount;
    }

    /**
     * Set 是否查询实例绑定的超级管理员账号，默认值为 false。
     * @param SuperAdminAccount 是否查询实例绑定的超级管理员账号，默认值为 false。
     */
    public void setSuperAdminAccount(Boolean SuperAdminAccount) {
        this.SuperAdminAccount = SuperAdminAccount;
    }

    /**
     * Get 按照一个或者多个实例 ID 查询，每次请求的上限为 100 个。 
     * @return InstanceIds 按照一个或者多个实例 ID 查询，每次请求的上限为 100 个。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 按照一个或者多个实例 ID 查询，每次请求的上限为 100 个。
     * @param InstanceIds 按照一个或者多个实例 ID 查询，每次请求的上限为 100 个。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 页码，整型，配合 PageSize 使用，默认值为 1。 
     * @return PageNumber 页码，整型，配合 PageSize 使用，默认值为 1。
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码，整型，配合 PageSize 使用，默认值为 1。
     * @param PageNumber 页码，整型，配合 PageSize 使用，默认值为 1。
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数目，整型，配合 PageNumber 使用，默认值为 20，最大值为 100。 
     * @return PageSize 每页数目，整型，配合 PageNumber 使用，默认值为 20，最大值为 100。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数目，整型，配合 PageNumber 使用，默认值为 20，最大值为 100。
     * @param PageSize 每页数目，整型，配合 PageNumber 使用，默认值为 20，最大值为 100。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 对指定列进行排序 
     * @return OrderBy 对指定列进行排序
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 对指定列进行排序
     * @param OrderBy 对指定列进行排序
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式 
     * @return OrderByType 排序方式
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序方式
     * @param OrderByType 排序方式
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 续费管理筛选类型 
     * @return AutoRenew 续费管理筛选类型
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 续费管理筛选类型
     * @param AutoRenew 续费管理筛选类型
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 超级管理管理员账号是否绑定了手机号 
     * @return BindPhone 超级管理管理员账号是否绑定了手机号
     */
    public Boolean getBindPhone() {
        return this.BindPhone;
    }

    /**
     * Set 超级管理管理员账号是否绑定了手机号
     * @param BindPhone 超级管理管理员账号是否绑定了手机号
     */
    public void setBindPhone(Boolean BindPhone) {
        this.BindPhone = BindPhone;
    }

    public DescribeOfficialInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOfficialInstancesRequest(DescribeOfficialInstancesRequest source) {
        if (source.SuperAdminAccount != null) {
            this.SuperAdminAccount = new Boolean(source.SuperAdminAccount);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.BindPhone != null) {
            this.BindPhone = new Boolean(source.BindPhone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SuperAdminAccount", this.SuperAdminAccount);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "BindPhone", this.BindPhone);

    }
}

