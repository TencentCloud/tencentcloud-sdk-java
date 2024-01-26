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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectsRequest extends AbstractModel {

    /**
    * 传1拉取所有项目（包括隐藏项目），传0拉取显示项目
    */
    @SerializedName("AllList")
    @Expose
    private Long AllList;

    /**
    * 分页条数，固定值1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 按项目ID筛选，大于0
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 按项目名称筛选
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
     * Get 传1拉取所有项目（包括隐藏项目），传0拉取显示项目 
     * @return AllList 传1拉取所有项目（包括隐藏项目），传0拉取显示项目
     */
    public Long getAllList() {
        return this.AllList;
    }

    /**
     * Set 传1拉取所有项目（包括隐藏项目），传0拉取显示项目
     * @param AllList 传1拉取所有项目（包括隐藏项目），传0拉取显示项目
     */
    public void setAllList(Long AllList) {
        this.AllList = AllList;
    }

    /**
     * Get 分页条数，固定值1000。 
     * @return Limit 分页条数，固定值1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页条数，固定值1000。
     * @param Limit 分页条数，固定值1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量。 
     * @return Offset 分页偏移量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量。
     * @param Offset 分页偏移量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 按项目ID筛选，大于0 
     * @return ProjectId 按项目ID筛选，大于0
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 按项目ID筛选，大于0
     * @param ProjectId 按项目ID筛选，大于0
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 按项目名称筛选 
     * @return ProjectName 按项目名称筛选
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 按项目名称筛选
     * @param ProjectName 按项目名称筛选
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public DescribeProjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectsRequest(DescribeProjectsRequest source) {
        if (source.AllList != null) {
            this.AllList = new Long(source.AllList);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllList", this.AllList);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);

    }
}

