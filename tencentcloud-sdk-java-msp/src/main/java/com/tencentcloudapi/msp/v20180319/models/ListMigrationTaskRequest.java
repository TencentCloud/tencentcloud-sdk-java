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
package com.tencentcloudapi.msp.v20180319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListMigrationTaskRequest extends AbstractModel{

    /**
    * 记录起始数，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 记录条数，默认值为10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 项目ID，默认值为空
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get 记录起始数，默认值为0 
     * @return Offset 记录起始数，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 记录起始数，默认值为0
     * @param Offset 记录起始数，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 记录条数，默认值为10 
     * @return Limit 记录条数，默认值为10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 记录条数，默认值为10
     * @param Limit 记录条数，默认值为10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 项目ID，默认值为空 
     * @return ProjectId 项目ID，默认值为空
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID，默认值为空
     * @param ProjectId 项目ID，默认值为空
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

