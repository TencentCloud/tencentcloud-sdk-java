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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListWorkspaceRolesRequest extends AbstractModel {

    /**
    * <p>工作空间ID</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>关键字，支持按角色名称模糊搜索</p>
    */
    @SerializedName("NameKeyword")
    @Expose
    private String NameKeyword;

    /**
    * <p>页码，从1开始，默认1</p><p>默认值：1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页大小，默认10，取值范围为 [1,100]，越界时自动收敛到边界值</p><p>默认值：10</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>工作空间ID</p> 
     * @return WorkspaceId <p>工作空间ID</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间ID</p>
     * @param WorkspaceId <p>工作空间ID</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>关键字，支持按角色名称模糊搜索</p> 
     * @return NameKeyword <p>关键字，支持按角色名称模糊搜索</p>
     */
    public String getNameKeyword() {
        return this.NameKeyword;
    }

    /**
     * Set <p>关键字，支持按角色名称模糊搜索</p>
     * @param NameKeyword <p>关键字，支持按角色名称模糊搜索</p>
     */
    public void setNameKeyword(String NameKeyword) {
        this.NameKeyword = NameKeyword;
    }

    /**
     * Get <p>页码，从1开始，默认1</p><p>默认值：1</p> 
     * @return PageNumber <p>页码，从1开始，默认1</p><p>默认值：1</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码，从1开始，默认1</p><p>默认值：1</p>
     * @param PageNumber <p>页码，从1开始，默认1</p><p>默认值：1</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页大小，默认10，取值范围为 [1,100]，越界时自动收敛到边界值</p><p>默认值：10</p> 
     * @return PageSize <p>每页大小，默认10，取值范围为 [1,100]，越界时自动收敛到边界值</p><p>默认值：10</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页大小，默认10，取值范围为 [1,100]，越界时自动收敛到边界值</p><p>默认值：10</p>
     * @param PageSize <p>每页大小，默认10，取值范围为 [1,100]，越界时自动收敛到边界值</p><p>默认值：10</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListWorkspaceRolesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkspaceRolesRequest(ListWorkspaceRolesRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.NameKeyword != null) {
            this.NameKeyword = new String(source.NameKeyword);
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
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "NameKeyword", this.NameKeyword);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

