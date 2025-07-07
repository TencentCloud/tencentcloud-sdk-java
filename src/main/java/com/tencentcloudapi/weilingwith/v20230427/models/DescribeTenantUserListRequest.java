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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTenantUserListRequest extends AbstractModel {

    /**
    * 翻页页码
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 翻页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * token
    */
    @SerializedName("ApplicationToken")
    @Expose
    private String ApplicationToken;

    /**
    * 租户ID
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 更新时间戳，单位秒
    */
    @SerializedName("UpdateAt")
    @Expose
    private Long UpdateAt;

    /**
    * 部门ID
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
    * 用户id
    */
    @SerializedName("Cursor")
    @Expose
    private String Cursor;

    /**
    * 状态，0，获取所有数据，1正常启用，2禁用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 项目空间id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * 关键词
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 是否递归获取子级数据，0需要，1不需要，默认为0
    */
    @SerializedName("NoRecursive")
    @Expose
    private String NoRecursive;

    /**
     * Get 翻页页码 
     * @return Offset 翻页页码
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页页码
     * @param Offset 翻页页码
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 翻页大小 
     * @return Limit 翻页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 翻页大小
     * @param Limit 翻页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get token 
     * @return ApplicationToken token
     */
    public String getApplicationToken() {
        return this.ApplicationToken;
    }

    /**
     * Set token
     * @param ApplicationToken token
     */
    public void setApplicationToken(String ApplicationToken) {
        this.ApplicationToken = ApplicationToken;
    }

    /**
     * Get 租户ID 
     * @return TenantId 租户ID
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 租户ID
     * @param TenantId 租户ID
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 更新时间戳，单位秒 
     * @return UpdateAt 更新时间戳，单位秒
     */
    public Long getUpdateAt() {
        return this.UpdateAt;
    }

    /**
     * Set 更新时间戳，单位秒
     * @param UpdateAt 更新时间戳，单位秒
     */
    public void setUpdateAt(Long UpdateAt) {
        this.UpdateAt = UpdateAt;
    }

    /**
     * Get 部门ID 
     * @return DepartmentId 部门ID
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set 部门ID
     * @param DepartmentId 部门ID
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    /**
     * Get 用户id 
     * @return Cursor 用户id
     */
    public String getCursor() {
        return this.Cursor;
    }

    /**
     * Set 用户id
     * @param Cursor 用户id
     */
    public void setCursor(String Cursor) {
        this.Cursor = Cursor;
    }

    /**
     * Get 状态，0，获取所有数据，1正常启用，2禁用 
     * @return Status 状态，0，获取所有数据，1正常启用，2禁用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，0，获取所有数据，1正常启用，2禁用
     * @param Status 状态，0，获取所有数据，1正常启用，2禁用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 项目空间id 
     * @return WorkspaceId 项目空间id
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 项目空间id
     * @param WorkspaceId 项目空间id
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 关键词 
     * @return Keyword 关键词
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键词
     * @param Keyword 关键词
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 是否递归获取子级数据，0需要，1不需要，默认为0 
     * @return NoRecursive 是否递归获取子级数据，0需要，1不需要，默认为0
     */
    public String getNoRecursive() {
        return this.NoRecursive;
    }

    /**
     * Set 是否递归获取子级数据，0需要，1不需要，默认为0
     * @param NoRecursive 是否递归获取子级数据，0需要，1不需要，默认为0
     */
    public void setNoRecursive(String NoRecursive) {
        this.NoRecursive = NoRecursive;
    }

    public DescribeTenantUserListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTenantUserListRequest(DescribeTenantUserListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.UpdateAt != null) {
            this.UpdateAt = new Long(source.UpdateAt);
        }
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
        if (source.Cursor != null) {
            this.Cursor = new String(source.Cursor);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.NoRecursive != null) {
            this.NoRecursive = new String(source.NoRecursive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "UpdateAt", this.UpdateAt);
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "NoRecursive", this.NoRecursive);

    }
}

