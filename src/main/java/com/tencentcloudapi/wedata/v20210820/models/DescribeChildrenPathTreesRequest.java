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

public class DescribeChildrenPathTreesRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 目录路径
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
    * true
    */
    @SerializedName("IncludeFile")
    @Expose
    private String IncludeFile;

    /**
    * 2
    */
    @SerializedName("QueryDepth")
    @Expose
    private Long QueryDepth;

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
     * Get 目录路径 
     * @return LocalPath 目录路径
     */
    public String getLocalPath() {
        return this.LocalPath;
    }

    /**
     * Set 目录路径
     * @param LocalPath 目录路径
     */
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    /**
     * Get true 
     * @return IncludeFile true
     */
    public String getIncludeFile() {
        return this.IncludeFile;
    }

    /**
     * Set true
     * @param IncludeFile true
     */
    public void setIncludeFile(String IncludeFile) {
        this.IncludeFile = IncludeFile;
    }

    /**
     * Get 2 
     * @return QueryDepth 2
     */
    public Long getQueryDepth() {
        return this.QueryDepth;
    }

    /**
     * Set 2
     * @param QueryDepth 2
     */
    public void setQueryDepth(Long QueryDepth) {
        this.QueryDepth = QueryDepth;
    }

    public DescribeChildrenPathTreesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeChildrenPathTreesRequest(DescribeChildrenPathTreesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.LocalPath != null) {
            this.LocalPath = new String(source.LocalPath);
        }
        if (source.IncludeFile != null) {
            this.IncludeFile = new String(source.IncludeFile);
        }
        if (source.QueryDepth != null) {
            this.QueryDepth = new Long(source.QueryDepth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);
        this.setParamSimple(map, prefix + "IncludeFile", this.IncludeFile);
        this.setParamSimple(map, prefix + "QueryDepth", this.QueryDepth);

    }
}

