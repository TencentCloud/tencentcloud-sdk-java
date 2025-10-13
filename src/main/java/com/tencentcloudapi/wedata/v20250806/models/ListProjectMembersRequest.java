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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListProjectMembersRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 使用成员名过滤，支持模糊查询
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 使用成员id过滤，支持模糊查询
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * 分页大小，默认第一页
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 分页条数，默认10条
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

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

    /**
     * Get 使用成员名过滤，支持模糊查询 
     * @return UserName 使用成员名过滤，支持模糊查询
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 使用成员名过滤，支持模糊查询
     * @param UserName 使用成员名过滤，支持模糊查询
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 使用成员id过滤，支持模糊查询 
     * @return UserUin 使用成员id过滤，支持模糊查询
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 使用成员id过滤，支持模糊查询
     * @param UserUin 使用成员id过滤，支持模糊查询
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get 分页大小，默认第一页 
     * @return PageSize 分页大小，默认第一页
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小，默认第一页
     * @param PageSize 分页大小，默认第一页
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 分页条数，默认10条 
     * @return PageNumber 分页条数，默认10条
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页条数，默认10条
     * @param PageNumber 分页条数，默认10条
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    public ListProjectMembersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListProjectMembersRequest(ListProjectMembersRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);

    }
}

