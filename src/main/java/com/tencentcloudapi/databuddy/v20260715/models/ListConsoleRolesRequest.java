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

public class ListConsoleRolesRequest extends AbstractModel {

    /**
    * <p>页码，从1开始，默认1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页大小，默认10，最小10，最大100</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>角色名称或描述模糊匹配</p>
    */
    @SerializedName("RoleKeyword")
    @Expose
    private String RoleKeyword;

    /**
     * Get <p>页码，从1开始，默认1</p> 
     * @return PageNumber <p>页码，从1开始，默认1</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码，从1开始，默认1</p>
     * @param PageNumber <p>页码，从1开始，默认1</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页大小，默认10，最小10，最大100</p> 
     * @return PageSize <p>每页大小，默认10，最小10，最大100</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页大小，默认10，最小10，最大100</p>
     * @param PageSize <p>每页大小，默认10，最小10，最大100</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>角色名称或描述模糊匹配</p> 
     * @return RoleKeyword <p>角色名称或描述模糊匹配</p>
     */
    public String getRoleKeyword() {
        return this.RoleKeyword;
    }

    /**
     * Set <p>角色名称或描述模糊匹配</p>
     * @param RoleKeyword <p>角色名称或描述模糊匹配</p>
     */
    public void setRoleKeyword(String RoleKeyword) {
        this.RoleKeyword = RoleKeyword;
    }

    public ListConsoleRolesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListConsoleRolesRequest(ListConsoleRolesRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.RoleKeyword != null) {
            this.RoleKeyword = new String(source.RoleKeyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "RoleKeyword", this.RoleKeyword);

    }
}

