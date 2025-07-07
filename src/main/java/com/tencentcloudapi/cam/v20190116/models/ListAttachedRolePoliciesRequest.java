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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAttachedRolePoliciesRequest extends AbstractModel {

    /**
    * 页码，从 1 开始
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页行数，不能大于200
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
    * 角色 ID。用于指定角色，入参 RoleId 与 RoleName 二选一
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * 角色名。用于指定角色，入参 RoleId 与 RoleName 二选一
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 按策略类型过滤，User表示仅查询自定义策略，QCS表示仅查询预设策略
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 搜索关键字
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get 页码，从 1 开始 
     * @return Page 页码，从 1 开始
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码，从 1 开始
     * @param Page 页码，从 1 开始
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 每页行数，不能大于200 
     * @return Rp 每页行数，不能大于200
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * Set 每页行数，不能大于200
     * @param Rp 每页行数，不能大于200
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    /**
     * Get 角色 ID。用于指定角色，入参 RoleId 与 RoleName 二选一 
     * @return RoleId 角色 ID。用于指定角色，入参 RoleId 与 RoleName 二选一
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 角色 ID。用于指定角色，入参 RoleId 与 RoleName 二选一
     * @param RoleId 角色 ID。用于指定角色，入参 RoleId 与 RoleName 二选一
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get 角色名。用于指定角色，入参 RoleId 与 RoleName 二选一 
     * @return RoleName 角色名。用于指定角色，入参 RoleId 与 RoleName 二选一
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名。用于指定角色，入参 RoleId 与 RoleName 二选一
     * @param RoleName 角色名。用于指定角色，入参 RoleId 与 RoleName 二选一
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 按策略类型过滤，User表示仅查询自定义策略，QCS表示仅查询预设策略 
     * @return PolicyType 按策略类型过滤，User表示仅查询自定义策略，QCS表示仅查询预设策略
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 按策略类型过滤，User表示仅查询自定义策略，QCS表示仅查询预设策略
     * @param PolicyType 按策略类型过滤，User表示仅查询自定义策略，QCS表示仅查询预设策略
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 搜索关键字 
     * @return Keyword 搜索关键字
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 搜索关键字
     * @param Keyword 搜索关键字
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public ListAttachedRolePoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAttachedRolePoliciesRequest(ListAttachedRolePoliciesRequest source) {
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Rp != null) {
            this.Rp = new Long(source.Rp);
        }
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Rp", this.Rp);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

