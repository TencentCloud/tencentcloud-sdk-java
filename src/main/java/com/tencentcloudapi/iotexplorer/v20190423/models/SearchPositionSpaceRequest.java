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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchPositionSpaceRequest extends AbstractModel{

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 位置空间名字
    */
    @SerializedName("SpaceName")
    @Expose
    private String SpaceName;

    /**
    * 偏移量，从0开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 最大获取数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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
     * Get 位置空间名字 
     * @return SpaceName 位置空间名字
     */
    public String getSpaceName() {
        return this.SpaceName;
    }

    /**
     * Set 位置空间名字
     * @param SpaceName 位置空间名字
     */
    public void setSpaceName(String SpaceName) {
        this.SpaceName = SpaceName;
    }

    /**
     * Get 偏移量，从0开始 
     * @return Offset 偏移量，从0开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，从0开始
     * @param Offset 偏移量，从0开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 最大获取数量 
     * @return Limit 最大获取数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大获取数量
     * @param Limit 最大获取数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public SearchPositionSpaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchPositionSpaceRequest(SearchPositionSpaceRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.SpaceName != null) {
            this.SpaceName = new String(source.SpaceName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "SpaceName", this.SpaceName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

