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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetOfflineDIInstanceListRequest extends AbstractModel{

    /**
    * 第几页
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 每页几条
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 无
    */
    @SerializedName("SearchCondition")
    @Expose
    private SearchConditionNew SearchCondition;

    /**
     * Get 第几页 
     * @return PageIndex 第几页
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 第几页
     * @param PageIndex 第几页
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 每页几条 
     * @return PageSize 每页几条
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页几条
     * @param PageSize 每页几条
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 无 
     * @return SearchCondition 无
     */
    public SearchConditionNew getSearchCondition() {
        return this.SearchCondition;
    }

    /**
     * Set 无
     * @param SearchCondition 无
     */
    public void setSearchCondition(SearchConditionNew SearchCondition) {
        this.SearchCondition = SearchCondition;
    }

    public GetOfflineDIInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetOfflineDIInstanceListRequest(GetOfflineDIInstanceListRequest source) {
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.SearchCondition != null) {
            this.SearchCondition = new SearchConditionNew(source.SearchCondition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamObj(map, prefix + "SearchCondition.", this.SearchCondition);

    }
}

