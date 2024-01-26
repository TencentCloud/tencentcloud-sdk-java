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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBrowsingHistoriesRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 最近多少个，最大20个
    */
    @SerializedName("TopN")
    @Expose
    private Long TopN;

    /**
    * 查询历史的资源类型file/task/function/event等
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 最近多少个，最大20个 
     * @return TopN 最近多少个，最大20个
     */
    public Long getTopN() {
        return this.TopN;
    }

    /**
     * Set 最近多少个，最大20个
     * @param TopN 最近多少个，最大20个
     */
    public void setTopN(Long TopN) {
        this.TopN = TopN;
    }

    /**
     * Get 查询历史的资源类型file/task/function/event等 
     * @return ResourceType 查询历史的资源类型file/task/function/event等
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 查询历史的资源类型file/task/function/event等
     * @param ResourceType 查询历史的资源类型file/task/function/event等
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    public DescribeBrowsingHistoriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBrowsingHistoriesRequest(DescribeBrowsingHistoriesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TopN != null) {
            this.TopN = new Long(source.TopN);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TopN", this.TopN);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);

    }
}

