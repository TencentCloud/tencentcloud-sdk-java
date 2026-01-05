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

public class ListTriggerWorkflowsRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 请求的数据页数。默认值为1，取值大于等于1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页显示的数据条数。默认值为10 ，最小值为10，最大值为200
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
    * 工作流所属文件夹
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * bundleId项
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * 负责人ID
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 创建人ID
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * 修改时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String [] ModifyTime;

    /**
    * 创建时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String [] CreateTime;

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
     * Get 请求的数据页数。默认值为1，取值大于等于1 
     * @return PageNumber 请求的数据页数。默认值为1，取值大于等于1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 请求的数据页数。默认值为1，取值大于等于1
     * @param PageNumber 请求的数据页数。默认值为1，取值大于等于1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页显示的数据条数。默认值为10 ，最小值为10，最大值为200 
     * @return PageSize 每页显示的数据条数。默认值为10 ，最小值为10，最大值为200
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页显示的数据条数。默认值为10 ，最小值为10，最大值为200
     * @param PageSize 每页显示的数据条数。默认值为10 ，最小值为10，最大值为200
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
     * Get 工作流所属文件夹 
     * @return ParentFolderPath 工作流所属文件夹
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set 工作流所属文件夹
     * @param ParentFolderPath 工作流所属文件夹
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get bundleId项 
     * @return BundleId bundleId项
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set bundleId项
     * @param BundleId bundleId项
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get 负责人ID 
     * @return OwnerUin 负责人ID
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 负责人ID
     * @param OwnerUin 负责人ID
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 创建人ID 
     * @return CreateUserUin 创建人ID
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set 创建人ID
     * @param CreateUserUin 创建人ID
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get 修改时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间 
     * @return ModifyTime 修改时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间
     */
    public String [] getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间
     * @param ModifyTime 修改时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间
     */
    public void setModifyTime(String [] ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 创建时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间 
     * @return CreateTime 创建时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间
     */
    public String [] getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间
     * @param CreateTime 创建时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间
     */
    public void setCreateTime(String [] CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ListTriggerWorkflowsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTriggerWorkflowsRequest(ListTriggerWorkflowsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String[source.ModifyTime.length];
            for (int i = 0; i < source.ModifyTime.length; i++) {
                this.ModifyTime[i] = new String(source.ModifyTime[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String[source.CreateTime.length];
            for (int i = 0; i < source.CreateTime.length; i++) {
                this.CreateTime[i] = new String(source.CreateTime[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamArraySimple(map, prefix + "ModifyTime.", this.ModifyTime);
        this.setParamArraySimple(map, prefix + "CreateTime.", this.CreateTime);

    }
}

