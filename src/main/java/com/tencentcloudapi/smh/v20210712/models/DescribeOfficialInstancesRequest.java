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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SuperAdminAccount", this.SuperAdminAccount);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

