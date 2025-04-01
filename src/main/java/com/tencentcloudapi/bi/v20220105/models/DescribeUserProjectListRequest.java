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

public class DescribeUserProjectListRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 无
    */
    @SerializedName("AllPage")
    @Expose
    private Boolean AllPage;

    /**
    * 无
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 无
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 是否过滤掉企业管理员
    */
    @SerializedName("IsFilterPerAuthUser")
    @Expose
    private Boolean IsFilterPerAuthUser;

    /**
    * 是否过滤掉当前用户
    */
    @SerializedName("IsFilterCurrentUser")
    @Expose
    private Boolean IsFilterCurrentUser;

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
     * Get 无 
     * @return AllPage 无
     */
    public Boolean getAllPage() {
        return this.AllPage;
    }

    /**
     * Set 无
     * @param AllPage 无
     */
    public void setAllPage(Boolean AllPage) {
        this.AllPage = AllPage;
    }

    /**
     * Get 无 
     * @return PageNo 无
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 无
     * @param PageNo 无
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 无 
     * @return PageSize 无
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 无
     * @param PageSize 无
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 是否过滤掉企业管理员 
     * @return IsFilterPerAuthUser 是否过滤掉企业管理员
     */
    public Boolean getIsFilterPerAuthUser() {
        return this.IsFilterPerAuthUser;
    }

    /**
     * Set 是否过滤掉企业管理员
     * @param IsFilterPerAuthUser 是否过滤掉企业管理员
     */
    public void setIsFilterPerAuthUser(Boolean IsFilterPerAuthUser) {
        this.IsFilterPerAuthUser = IsFilterPerAuthUser;
    }

    /**
     * Get 是否过滤掉当前用户 
     * @return IsFilterCurrentUser 是否过滤掉当前用户
     */
    public Boolean getIsFilterCurrentUser() {
        return this.IsFilterCurrentUser;
    }

    /**
     * Set 是否过滤掉当前用户
     * @param IsFilterCurrentUser 是否过滤掉当前用户
     */
    public void setIsFilterCurrentUser(Boolean IsFilterCurrentUser) {
        this.IsFilterCurrentUser = IsFilterCurrentUser;
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

    }
}

