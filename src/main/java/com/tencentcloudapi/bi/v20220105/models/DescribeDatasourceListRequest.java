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

public class DescribeDatasourceListRequest extends AbstractModel {

    /**
    * 无
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 返回所有页面，默认false
    */
    @SerializedName("AllPage")
    @Expose
    private Boolean AllPage;

    /**
    * 数据库名称检索
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

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
    * 搜索关键词
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 过滤无权限列表的参数（0 全量，1 使用权限，2 编辑权限）
    */
    @SerializedName("PermissionType")
    @Expose
    private Long PermissionType;

    /**
     * Get 无 
     * @return ProjectId 无
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 无
     * @param ProjectId 无
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 返回所有页面，默认false 
     * @return AllPage 返回所有页面，默认false
     */
    public Boolean getAllPage() {
        return this.AllPage;
    }

    /**
     * Set 返回所有页面，默认false
     * @param AllPage 返回所有页面，默认false
     */
    public void setAllPage(Boolean AllPage) {
        this.AllPage = AllPage;
    }

    /**
     * Get 数据库名称检索 
     * @return DbName 数据库名称检索
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名称检索
     * @param DbName 数据库名称检索
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
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
     * Get 搜索关键词 
     * @return Keyword 搜索关键词
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 搜索关键词
     * @param Keyword 搜索关键词
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 过滤无权限列表的参数（0 全量，1 使用权限，2 编辑权限） 
     * @return PermissionType 过滤无权限列表的参数（0 全量，1 使用权限，2 编辑权限）
     */
    public Long getPermissionType() {
        return this.PermissionType;
    }

    /**
     * Set 过滤无权限列表的参数（0 全量，1 使用权限，2 编辑权限）
     * @param PermissionType 过滤无权限列表的参数（0 全量，1 使用权限，2 编辑权限）
     */
    public void setPermissionType(Long PermissionType) {
        this.PermissionType = PermissionType;
    }

    public DescribeDatasourceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatasourceListRequest(DescribeDatasourceListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AllPage != null) {
            this.AllPage = new Boolean(source.AllPage);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.PermissionType != null) {
            this.PermissionType = new Long(source.PermissionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AllPage", this.AllPage);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "PermissionType", this.PermissionType);

    }
}

