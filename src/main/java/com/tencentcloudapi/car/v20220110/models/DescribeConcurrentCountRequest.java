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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConcurrentCountRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 应用类别（DESKTOP: 桌面端，MOBILE：移动端）
    */
    @SerializedName("ApplicationCategory")
    @Expose
    private String ApplicationCategory;

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
     * Get 应用类别（DESKTOP: 桌面端，MOBILE：移动端） 
     * @return ApplicationCategory 应用类别（DESKTOP: 桌面端，MOBILE：移动端）
     */
    public String getApplicationCategory() {
        return this.ApplicationCategory;
    }

    /**
     * Set 应用类别（DESKTOP: 桌面端，MOBILE：移动端）
     * @param ApplicationCategory 应用类别（DESKTOP: 桌面端，MOBILE：移动端）
     */
    public void setApplicationCategory(String ApplicationCategory) {
        this.ApplicationCategory = ApplicationCategory;
    }

    public DescribeConcurrentCountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConcurrentCountRequest(DescribeConcurrentCountRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ApplicationCategory != null) {
            this.ApplicationCategory = new String(source.ApplicationCategory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ApplicationCategory", this.ApplicationCategory);

    }
}

