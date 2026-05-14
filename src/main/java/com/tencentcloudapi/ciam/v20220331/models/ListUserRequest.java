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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListUserRequest extends AbstractModel {

    /**
    * <p>用户目录ID</p>
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * <p>分页数据</p>
    */
    @SerializedName("Pageable")
    @Expose
    private Pageable Pageable;

    /**
    * <p>Key可选值为condition、userGroup、userOrg、weComUserOrg<li> <strong>condition</strong> </li>    Values = 查询条件，用户ID，用户名称，手机或邮箱<li> <strong>userGroup</strong> </li>    Values = 用户组ID<li> <strong>userOrg</strong> </li>    Values = 用户所属机构ID<li> <strong>weComUserOrg</strong> </li>    Values = 用户所属企业微信机构ID</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>返回信息是否为原文</p>
    */
    @SerializedName("Original")
    @Expose
    private Boolean Original;

    /**
     * Get <p>用户目录ID</p> 
     * @return UserStoreId <p>用户目录ID</p>
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set <p>用户目录ID</p>
     * @param UserStoreId <p>用户目录ID</p>
     */
    public void setUserStoreId(String UserStoreId) {
        this.UserStoreId = UserStoreId;
    }

    /**
     * Get <p>分页数据</p> 
     * @return Pageable <p>分页数据</p>
     */
    public Pageable getPageable() {
        return this.Pageable;
    }

    /**
     * Set <p>分页数据</p>
     * @param Pageable <p>分页数据</p>
     */
    public void setPageable(Pageable Pageable) {
        this.Pageable = Pageable;
    }

    /**
     * Get <p>Key可选值为condition、userGroup、userOrg、weComUserOrg<li> <strong>condition</strong> </li>    Values = 查询条件，用户ID，用户名称，手机或邮箱<li> <strong>userGroup</strong> </li>    Values = 用户组ID<li> <strong>userOrg</strong> </li>    Values = 用户所属机构ID<li> <strong>weComUserOrg</strong> </li>    Values = 用户所属企业微信机构ID</p> 
     * @return Filters <p>Key可选值为condition、userGroup、userOrg、weComUserOrg<li> <strong>condition</strong> </li>    Values = 查询条件，用户ID，用户名称，手机或邮箱<li> <strong>userGroup</strong> </li>    Values = 用户组ID<li> <strong>userOrg</strong> </li>    Values = 用户所属机构ID<li> <strong>weComUserOrg</strong> </li>    Values = 用户所属企业微信机构ID</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Key可选值为condition、userGroup、userOrg、weComUserOrg<li> <strong>condition</strong> </li>    Values = 查询条件，用户ID，用户名称，手机或邮箱<li> <strong>userGroup</strong> </li>    Values = 用户组ID<li> <strong>userOrg</strong> </li>    Values = 用户所属机构ID<li> <strong>weComUserOrg</strong> </li>    Values = 用户所属企业微信机构ID</p>
     * @param Filters <p>Key可选值为condition、userGroup、userOrg、weComUserOrg<li> <strong>condition</strong> </li>    Values = 查询条件，用户ID，用户名称，手机或邮箱<li> <strong>userGroup</strong> </li>    Values = 用户组ID<li> <strong>userOrg</strong> </li>    Values = 用户所属机构ID<li> <strong>weComUserOrg</strong> </li>    Values = 用户所属企业微信机构ID</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>返回信息是否为原文</p> 
     * @return Original <p>返回信息是否为原文</p>
     */
    public Boolean getOriginal() {
        return this.Original;
    }

    /**
     * Set <p>返回信息是否为原文</p>
     * @param Original <p>返回信息是否为原文</p>
     */
    public void setOriginal(Boolean Original) {
        this.Original = Original;
    }

    public ListUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUserRequest(ListUserRequest source) {
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.Pageable != null) {
            this.Pageable = new Pageable(source.Pageable);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Original != null) {
            this.Original = new Boolean(source.Original);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamObj(map, prefix + "Pageable.", this.Pageable);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Original", this.Original);

    }
}

