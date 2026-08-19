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
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>请求的数据页数。默认值为1，取值大于等于1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页显示的数据条数。默认值为10 ，最小值为10，最大值为200</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>搜索关键词</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>工作流所属文件夹</p>
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * <p>bundleId项</p>
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * <p>负责人ID</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>创建人ID</p>
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * <p>运行账号ID</p>
    */
    @SerializedName("ExecuteUserUin")
    @Expose
    private String ExecuteUserUin;

    /**
    * <p>修改时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String [] ModifyTime;

    /**
    * <p>创建时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String [] CreateTime;

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>请求的数据页数。默认值为1，取值大于等于1</p> 
     * @return PageNumber <p>请求的数据页数。默认值为1，取值大于等于1</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>请求的数据页数。默认值为1，取值大于等于1</p>
     * @param PageNumber <p>请求的数据页数。默认值为1，取值大于等于1</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页显示的数据条数。默认值为10 ，最小值为10，最大值为200</p> 
     * @return PageSize <p>每页显示的数据条数。默认值为10 ，最小值为10，最大值为200</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页显示的数据条数。默认值为10 ，最小值为10，最大值为200</p>
     * @param PageSize <p>每页显示的数据条数。默认值为10 ，最小值为10，最大值为200</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>搜索关键词</p> 
     * @return Keyword <p>搜索关键词</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>搜索关键词</p>
     * @param Keyword <p>搜索关键词</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>工作流所属文件夹</p> 
     * @return ParentFolderPath <p>工作流所属文件夹</p>
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set <p>工作流所属文件夹</p>
     * @param ParentFolderPath <p>工作流所属文件夹</p>
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get <p>bundleId项</p> 
     * @return BundleId <p>bundleId项</p>
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set <p>bundleId项</p>
     * @param BundleId <p>bundleId项</p>
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get <p>负责人ID</p> 
     * @return OwnerUin <p>负责人ID</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>负责人ID</p>
     * @param OwnerUin <p>负责人ID</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>创建人ID</p> 
     * @return CreateUserUin <p>创建人ID</p>
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set <p>创建人ID</p>
     * @param CreateUserUin <p>创建人ID</p>
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get <p>运行账号ID</p> 
     * @return ExecuteUserUin <p>运行账号ID</p>
     */
    public String getExecuteUserUin() {
        return this.ExecuteUserUin;
    }

    /**
     * Set <p>运行账号ID</p>
     * @param ExecuteUserUin <p>运行账号ID</p>
     */
    public void setExecuteUserUin(String ExecuteUserUin) {
        this.ExecuteUserUin = ExecuteUserUin;
    }

    /**
     * Get <p>修改时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间</p> 
     * @return ModifyTime <p>修改时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间</p>
     */
    public String [] getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>修改时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间</p>
     * @param ModifyTime <p>修改时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间</p>
     */
    public void setModifyTime(String [] ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>创建时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间</p> 
     * @return CreateTime <p>创建时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间</p>
     */
    public String [] getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间</p>
     * @param CreateTime <p>创建时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间</p>
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
        if (source.ExecuteUserUin != null) {
            this.ExecuteUserUin = new String(source.ExecuteUserUin);
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
        this.setParamSimple(map, prefix + "ExecuteUserUin", this.ExecuteUserUin);
        this.setParamArraySimple(map, prefix + "ModifyTime.", this.ModifyTime);
        this.setParamArraySimple(map, prefix + "CreateTime.", this.CreateTime);

    }
}

