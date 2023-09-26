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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserRoleListRequest extends AbstractModel{

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
    * 全部页码
    */
    @SerializedName("AllPage")
    @Expose
    private Boolean AllPage;

    /**
    * 0 企业用户 1 访客 不填表示所有用户
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * 模糊搜索的关键字
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

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
     * Get 全部页码 
     * @return AllPage 全部页码
     */
    public Boolean getAllPage() {
        return this.AllPage;
    }

    /**
     * Set 全部页码
     * @param AllPage 全部页码
     */
    public void setAllPage(Boolean AllPage) {
        this.AllPage = AllPage;
    }

    /**
     * Get 0 企业用户 1 访客 不填表示所有用户 
     * @return UserType 0 企业用户 1 访客 不填表示所有用户
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set 0 企业用户 1 访客 不填表示所有用户
     * @param UserType 0 企业用户 1 访客 不填表示所有用户
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get 模糊搜索的关键字 
     * @return Keyword 模糊搜索的关键字
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 模糊搜索的关键字
     * @param Keyword 模糊搜索的关键字
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
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

    }
}

