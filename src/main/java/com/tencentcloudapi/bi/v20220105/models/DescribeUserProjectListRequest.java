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

public class DescribeUserProjectListRequest extends AbstractModel {

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>无</p>
    */
    @SerializedName("AllPage")
    @Expose
    private Boolean AllPage;

    /**
    * <p>无</p>
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * <p>无</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>是否过滤掉企业管理员</p>
    */
    @SerializedName("IsFilterPerAuthUser")
    @Expose
    private Boolean IsFilterPerAuthUser;

    /**
    * <p>是否过滤掉当前用户</p>
    */
    @SerializedName("IsFilterCurrentUser")
    @Expose
    private Boolean IsFilterCurrentUser;

    /**
    * <p>关键字</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>无</p> 
     * @return AllPage <p>无</p>
     */
    public Boolean getAllPage() {
        return this.AllPage;
    }

    /**
     * Set <p>无</p>
     * @param AllPage <p>无</p>
     */
    public void setAllPage(Boolean AllPage) {
        this.AllPage = AllPage;
    }

    /**
     * Get <p>无</p> 
     * @return PageNo <p>无</p>
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set <p>无</p>
     * @param PageNo <p>无</p>
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get <p>无</p> 
     * @return PageSize <p>无</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>无</p>
     * @param PageSize <p>无</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>是否过滤掉企业管理员</p> 
     * @return IsFilterPerAuthUser <p>是否过滤掉企业管理员</p>
     */
    public Boolean getIsFilterPerAuthUser() {
        return this.IsFilterPerAuthUser;
    }

    /**
     * Set <p>是否过滤掉企业管理员</p>
     * @param IsFilterPerAuthUser <p>是否过滤掉企业管理员</p>
     */
    public void setIsFilterPerAuthUser(Boolean IsFilterPerAuthUser) {
        this.IsFilterPerAuthUser = IsFilterPerAuthUser;
    }

    /**
     * Get <p>是否过滤掉当前用户</p> 
     * @return IsFilterCurrentUser <p>是否过滤掉当前用户</p>
     */
    public Boolean getIsFilterCurrentUser() {
        return this.IsFilterCurrentUser;
    }

    /**
     * Set <p>是否过滤掉当前用户</p>
     * @param IsFilterCurrentUser <p>是否过滤掉当前用户</p>
     */
    public void setIsFilterCurrentUser(Boolean IsFilterCurrentUser) {
        this.IsFilterCurrentUser = IsFilterCurrentUser;
    }

    /**
     * Get <p>关键字</p> 
     * @return Keyword <p>关键字</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>关键字</p>
     * @param Keyword <p>关键字</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public DescribeUserProjectListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserProjectListRequest(DescribeUserProjectListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AllPage != null) {
            this.AllPage = new Boolean(source.AllPage);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.IsFilterPerAuthUser != null) {
            this.IsFilterPerAuthUser = new Boolean(source.IsFilterPerAuthUser);
        }
        if (source.IsFilterCurrentUser != null) {
            this.IsFilterCurrentUser = new Boolean(source.IsFilterCurrentUser);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AllPage", this.AllPage);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "IsFilterPerAuthUser", this.IsFilterPerAuthUser);
        this.setParamSimple(map, prefix + "IsFilterCurrentUser", this.IsFilterCurrentUser);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

