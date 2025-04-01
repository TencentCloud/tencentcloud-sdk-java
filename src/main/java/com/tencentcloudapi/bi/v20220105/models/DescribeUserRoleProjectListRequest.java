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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserRoleProjectListRequest extends AbstractModel {

    /**
    * 页码
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 页数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 是否只获取绑定企微应用的
    */
    @SerializedName("IsOnlyBindAppUser")
    @Expose
    private Boolean IsOnlyBindAppUser;

    /**
    * 是否获取全部数据
    */
    @SerializedName("AllPage")
    @Expose
    private Boolean AllPage;

    /**
    * 角色编码
    */
    @SerializedName("RoleCode")
    @Expose
    private String RoleCode;

    /**
     * Get 页码 
     * @return PageNo 页码
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 页码
     * @param PageNo 页码
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 页数 
     * @return PageSize 页数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页数
     * @param PageSize 页数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
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
     * Get 是否只获取绑定企微应用的 
     * @return IsOnlyBindAppUser 是否只获取绑定企微应用的
     */
    public Boolean getIsOnlyBindAppUser() {
        return this.IsOnlyBindAppUser;
    }

    /**
     * Set 是否只获取绑定企微应用的
     * @param IsOnlyBindAppUser 是否只获取绑定企微应用的
     */
    public void setIsOnlyBindAppUser(Boolean IsOnlyBindAppUser) {
        this.IsOnlyBindAppUser = IsOnlyBindAppUser;
    }

    /**
     * Get 是否获取全部数据 
     * @return AllPage 是否获取全部数据
     */
    public Boolean getAllPage() {
        return this.AllPage;
    }

    /**
     * Set 是否获取全部数据
     * @param AllPage 是否获取全部数据
     */
    public void setAllPage(Boolean AllPage) {
        this.AllPage = AllPage;
    }

    /**
     * Get 角色编码 
     * @return RoleCode 角色编码
     */
    public String getRoleCode() {
        return this.RoleCode;
    }

    /**
     * Set 角色编码
     * @param RoleCode 角色编码
     */
    public void setRoleCode(String RoleCode) {
        this.RoleCode = RoleCode;
    }

    public DescribeUserRoleProjectListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserRoleProjectListRequest(DescribeUserRoleProjectListRequest source) {
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.IsOnlyBindAppUser != null) {
            this.IsOnlyBindAppUser = new Boolean(source.IsOnlyBindAppUser);
        }
        if (source.AllPage != null) {
            this.AllPage = new Boolean(source.AllPage);
        }
        if (source.RoleCode != null) {
            this.RoleCode = new String(source.RoleCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "IsOnlyBindAppUser", this.IsOnlyBindAppUser);
        this.setParamSimple(map, prefix + "AllPage", this.AllPage);
        this.setParamSimple(map, prefix + "RoleCode", this.RoleCode);

    }
}

