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

public class DescribePathTreesRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 关键字
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 是否包含文件
    */
    @SerializedName("IncludeFile")
    @Expose
    private String IncludeFile;

    /**
    * 最大深度
    */
    @SerializedName("MaxDepth")
    @Expose
    private Long MaxDepth;

    /**
    * 文件是否被引用
    */
    @SerializedName("FileNotUsed")
    @Expose
    private String FileNotUsed;

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
     * Get 关键字 
     * @return Keyword 关键字
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键字
     * @param Keyword 关键字
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 是否包含文件 
     * @return IncludeFile 是否包含文件
     */
    public String getIncludeFile() {
        return this.IncludeFile;
    }

    /**
     * Set 是否包含文件
     * @param IncludeFile 是否包含文件
     */
    public void setIncludeFile(String IncludeFile) {
        this.IncludeFile = IncludeFile;
    }

    /**
     * Get 最大深度 
     * @return MaxDepth 最大深度
     */
    public Long getMaxDepth() {
        return this.MaxDepth;
    }

    /**
     * Set 最大深度
     * @param MaxDepth 最大深度
     */
    public void setMaxDepth(Long MaxDepth) {
        this.MaxDepth = MaxDepth;
    }

    /**
     * Get 文件是否被引用 
     * @return FileNotUsed 文件是否被引用
     */
    public String getFileNotUsed() {
        return this.FileNotUsed;
    }

    /**
     * Set 文件是否被引用
     * @param FileNotUsed 文件是否被引用
     */
    public void setFileNotUsed(String FileNotUsed) {
        this.FileNotUsed = FileNotUsed;
    }

    public DescribePathTreesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePathTreesRequest(DescribePathTreesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.IncludeFile != null) {
            this.IncludeFile = new String(source.IncludeFile);
        }
        if (source.MaxDepth != null) {
            this.MaxDepth = new Long(source.MaxDepth);
        }
        if (source.FileNotUsed != null) {
            this.FileNotUsed = new String(source.FileNotUsed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "IncludeFile", this.IncludeFile);
        this.setParamSimple(map, prefix + "MaxDepth", this.MaxDepth);
        this.setParamSimple(map, prefix + "FileNotUsed", this.FileNotUsed);

    }
}

