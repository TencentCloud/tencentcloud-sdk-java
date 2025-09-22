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

public class ListResourceFoldersRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 资源文件夹绝对路径，取值示例
/wedata/test
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

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
     * Get 资源文件夹绝对路径，取值示例
/wedata/test 
     * @return ParentFolderPath 资源文件夹绝对路径，取值示例
/wedata/test
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set 资源文件夹绝对路径，取值示例
/wedata/test
     * @param ParentFolderPath 资源文件夹绝对路径，取值示例
/wedata/test
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
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

    public ListResourceFoldersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListResourceFoldersRequest(ListResourceFoldersRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
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
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

