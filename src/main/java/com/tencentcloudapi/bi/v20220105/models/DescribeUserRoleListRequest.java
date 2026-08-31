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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserRoleListRequest extends AbstractModel {

    /**
    * <p>页码</p>
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * <p>页数</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>全部页码</p>
    */
    @SerializedName("AllPage")
    @Expose
    private Boolean AllPage;

    /**
    * <p>0 企业用户 1 访客 不填表示所有用户</p>
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * <p>模糊搜索的关键字</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>项目id</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>是否只获取绑定企微应用的</p>
    */
    @SerializedName("IsOnlyBindAppUser")
    @Expose
    private Boolean IsOnlyBindAppUser;

    /**
    * <p>用户类型</p>
    */
    @SerializedName("IdentityType")
    @Expose
    private String IdentityType;

    /**
     * Get <p>页码</p> 
     * @return PageNo <p>页码</p>
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set <p>页码</p>
     * @param PageNo <p>页码</p>
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get <p>页数</p> 
     * @return PageSize <p>页数</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>页数</p>
     * @param PageSize <p>页数</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>全部页码</p> 
     * @return AllPage <p>全部页码</p>
     */
    public Boolean getAllPage() {
        return this.AllPage;
    }

    /**
     * Set <p>全部页码</p>
     * @param AllPage <p>全部页码</p>
     */
    public void setAllPage(Boolean AllPage) {
        this.AllPage = AllPage;
    }

    /**
     * Get <p>0 企业用户 1 访客 不填表示所有用户</p> 
     * @return UserType <p>0 企业用户 1 访客 不填表示所有用户</p>
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set <p>0 企业用户 1 访客 不填表示所有用户</p>
     * @param UserType <p>0 企业用户 1 访客 不填表示所有用户</p>
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get <p>模糊搜索的关键字</p> 
     * @return Keyword <p>模糊搜索的关键字</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>模糊搜索的关键字</p>
     * @param Keyword <p>模糊搜索的关键字</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>项目id</p> 
     * @return ProjectId <p>项目id</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目id</p>
     * @param ProjectId <p>项目id</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>是否只获取绑定企微应用的</p> 
     * @return IsOnlyBindAppUser <p>是否只获取绑定企微应用的</p>
     */
    public Boolean getIsOnlyBindAppUser() {
        return this.IsOnlyBindAppUser;
    }

    /**
     * Set <p>是否只获取绑定企微应用的</p>
     * @param IsOnlyBindAppUser <p>是否只获取绑定企微应用的</p>
     */
    public void setIsOnlyBindAppUser(Boolean IsOnlyBindAppUser) {
        this.IsOnlyBindAppUser = IsOnlyBindAppUser;
    }

    /**
     * Get <p>用户类型</p> 
     * @return IdentityType <p>用户类型</p>
     */
    public String getIdentityType() {
        return this.IdentityType;
    }

    /**
     * Set <p>用户类型</p>
     * @param IdentityType <p>用户类型</p>
     */
    public void setIdentityType(String IdentityType) {
        this.IdentityType = IdentityType;
    }

    public DescribeUserRoleListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserRoleListRequest(DescribeUserRoleListRequest source) {
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.AllPage != null) {
            this.AllPage = new Boolean(source.AllPage);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.IsOnlyBindAppUser != null) {
            this.IsOnlyBindAppUser = new Boolean(source.IsOnlyBindAppUser);
        }
        if (source.IdentityType != null) {
            this.IdentityType = new String(source.IdentityType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "AllPage", this.AllPage);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "IsOnlyBindAppUser", this.IsOnlyBindAppUser);
        this.setParamSimple(map, prefix + "IdentityType", this.IdentityType);

    }
}

