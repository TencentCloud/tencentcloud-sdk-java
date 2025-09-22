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

public class ListResourceFilesRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 数据页数，大于等于1。默认1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页显示的数据条数，最小为10条，最大为200 条。默认10
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 资源文件名称(模糊搜索关键词)
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 资源文件所属文件夹路径(如/a/b/c，查询c文件夹下的资源文件)
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * 创建人ID, 可通过DescribeCurrentUserInfo接口获取
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * 更新时间范围,开始时间, 格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("ModifyTimeStart")
    @Expose
    private String ModifyTimeStart;

    /**
    * 更新时间范围,结束时间, 格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("ModifyTimeEnd")
    @Expose
    private String ModifyTimeEnd;

    /**
    * 创建时间范围,开始时间, 格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("CreateTimeStart")
    @Expose
    private String CreateTimeStart;

    /**
    * 创建时间范围,结束时间, 格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("CreateTimeEnd")
    @Expose
    private String CreateTimeEnd;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 数据页数，大于等于1。默认1 
     * @return PageNumber 数据页数，大于等于1。默认1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 数据页数，大于等于1。默认1
     * @param PageNumber 数据页数，大于等于1。默认1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页显示的数据条数，最小为10条，最大为200 条。默认10 
     * @return PageSize 每页显示的数据条数，最小为10条，最大为200 条。默认10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页显示的数据条数，最小为10条，最大为200 条。默认10
     * @param PageSize 每页显示的数据条数，最小为10条，最大为200 条。默认10
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 资源文件名称(模糊搜索关键词) 
     * @return ResourceName 资源文件名称(模糊搜索关键词)
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源文件名称(模糊搜索关键词)
     * @param ResourceName 资源文件名称(模糊搜索关键词)
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 资源文件所属文件夹路径(如/a/b/c，查询c文件夹下的资源文件) 
     * @return ParentFolderPath 资源文件所属文件夹路径(如/a/b/c，查询c文件夹下的资源文件)
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set 资源文件所属文件夹路径(如/a/b/c，查询c文件夹下的资源文件)
     * @param ParentFolderPath 资源文件所属文件夹路径(如/a/b/c，查询c文件夹下的资源文件)
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get 创建人ID, 可通过DescribeCurrentUserInfo接口获取 
     * @return CreateUserUin 创建人ID, 可通过DescribeCurrentUserInfo接口获取
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set 创建人ID, 可通过DescribeCurrentUserInfo接口获取
     * @param CreateUserUin 创建人ID, 可通过DescribeCurrentUserInfo接口获取
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get 更新时间范围,开始时间, 格式yyyy-MM-dd HH:mm:ss 
     * @return ModifyTimeStart 更新时间范围,开始时间, 格式yyyy-MM-dd HH:mm:ss
     */
    public String getModifyTimeStart() {
        return this.ModifyTimeStart;
    }

    /**
     * Set 更新时间范围,开始时间, 格式yyyy-MM-dd HH:mm:ss
     * @param ModifyTimeStart 更新时间范围,开始时间, 格式yyyy-MM-dd HH:mm:ss
     */
    public void setModifyTimeStart(String ModifyTimeStart) {
        this.ModifyTimeStart = ModifyTimeStart;
    }

    /**
     * Get 更新时间范围,结束时间, 格式yyyy-MM-dd HH:mm:ss 
     * @return ModifyTimeEnd 更新时间范围,结束时间, 格式yyyy-MM-dd HH:mm:ss
     */
    public String getModifyTimeEnd() {
        return this.ModifyTimeEnd;
    }

    /**
     * Set 更新时间范围,结束时间, 格式yyyy-MM-dd HH:mm:ss
     * @param ModifyTimeEnd 更新时间范围,结束时间, 格式yyyy-MM-dd HH:mm:ss
     */
    public void setModifyTimeEnd(String ModifyTimeEnd) {
        this.ModifyTimeEnd = ModifyTimeEnd;
    }

    /**
     * Get 创建时间范围,开始时间, 格式yyyy-MM-dd HH:mm:ss 
     * @return CreateTimeStart 创建时间范围,开始时间, 格式yyyy-MM-dd HH:mm:ss
     */
    public String getCreateTimeStart() {
        return this.CreateTimeStart;
    }

    /**
     * Set 创建时间范围,开始时间, 格式yyyy-MM-dd HH:mm:ss
     * @param CreateTimeStart 创建时间范围,开始时间, 格式yyyy-MM-dd HH:mm:ss
     */
    public void setCreateTimeStart(String CreateTimeStart) {
        this.CreateTimeStart = CreateTimeStart;
    }

    /**
     * Get 创建时间范围,结束时间, 格式yyyy-MM-dd HH:mm:ss 
     * @return CreateTimeEnd 创建时间范围,结束时间, 格式yyyy-MM-dd HH:mm:ss
     */
    public String getCreateTimeEnd() {
        return this.CreateTimeEnd;
    }

    /**
     * Set 创建时间范围,结束时间, 格式yyyy-MM-dd HH:mm:ss
     * @param CreateTimeEnd 创建时间范围,结束时间, 格式yyyy-MM-dd HH:mm:ss
     */
    public void setCreateTimeEnd(String CreateTimeEnd) {
        this.CreateTimeEnd = CreateTimeEnd;
    }

    public ListResourceFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListResourceFilesRequest(ListResourceFilesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.ModifyTimeStart != null) {
            this.ModifyTimeStart = new String(source.ModifyTimeStart);
        }
        if (source.ModifyTimeEnd != null) {
            this.ModifyTimeEnd = new String(source.ModifyTimeEnd);
        }
        if (source.CreateTimeStart != null) {
            this.CreateTimeStart = new String(source.CreateTimeStart);
        }
        if (source.CreateTimeEnd != null) {
            this.CreateTimeEnd = new String(source.CreateTimeEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "ModifyTimeStart", this.ModifyTimeStart);
        this.setParamSimple(map, prefix + "ModifyTimeEnd", this.ModifyTimeEnd);
        this.setParamSimple(map, prefix + "CreateTimeStart", this.CreateTimeStart);
        this.setParamSimple(map, prefix + "CreateTimeEnd", this.CreateTimeEnd);

    }
}

