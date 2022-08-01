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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectsRequest extends AbstractModel{

    /**
    * 分页offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 项目ID数组
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * 项目名
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 按字段排序
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 升序/降序
    */
    @SerializedName("Ascend")
    @Expose
    private Boolean Ascend;

    /**
    * 标签数组
    */
    @SerializedName("TagFilters")
    @Expose
    private TagSpec [] TagFilters;

    /**
     * Get 分页offset 
     * @return Offset 分页offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页offset
     * @param Offset 分页offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页limit 
     * @return Limit 每页limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页limit
     * @param Limit 每页limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 项目ID数组 
     * @return ProjectIds 项目ID数组
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目ID数组
     * @param ProjectIds 项目ID数组
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 项目名 
     * @return ProjectName 项目名
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名
     * @param ProjectName 项目名
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 按字段排序 
     * @return OrderBy 按字段排序
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 按字段排序
     * @param OrderBy 按字段排序
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 升序/降序 
     * @return Ascend 升序/降序
     */
    public Boolean getAscend() {
        return this.Ascend;
    }

    /**
     * Set 升序/降序
     * @param Ascend 升序/降序
     */
    public void setAscend(Boolean Ascend) {
        this.Ascend = Ascend;
    }

    /**
     * Get 标签数组 
     * @return TagFilters 标签数组
     */
    public TagSpec [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set 标签数组
     * @param TagFilters 标签数组
     */
    public void setTagFilters(TagSpec [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    public DescribeProjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectsRequest(DescribeProjectsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Ascend != null) {
            this.Ascend = new Boolean(source.Ascend);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagSpec[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagSpec(source.TagFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Ascend", this.Ascend);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);

    }
}

