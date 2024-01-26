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

public class MoveFileRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 来源路径
    */
    @SerializedName("SourceFilePath")
    @Expose
    private String SourceFilePath;

    /**
    * 目标路径
    */
    @SerializedName("TargetDirPath")
    @Expose
    private String TargetDirPath;

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
     * Get 来源路径 
     * @return SourceFilePath 来源路径
     */
    public String getSourceFilePath() {
        return this.SourceFilePath;
    }

    /**
     * Set 来源路径
     * @param SourceFilePath 来源路径
     */
    public void setSourceFilePath(String SourceFilePath) {
        this.SourceFilePath = SourceFilePath;
    }

    /**
     * Get 目标路径 
     * @return TargetDirPath 目标路径
     */
    public String getTargetDirPath() {
        return this.TargetDirPath;
    }

    /**
     * Set 目标路径
     * @param TargetDirPath 目标路径
     */
    public void setTargetDirPath(String TargetDirPath) {
        this.TargetDirPath = TargetDirPath;
    }

    public MoveFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MoveFileRequest(MoveFileRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.SourceFilePath != null) {
            this.SourceFilePath = new String(source.SourceFilePath);
        }
        if (source.TargetDirPath != null) {
            this.TargetDirPath = new String(source.TargetDirPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "SourceFilePath", this.SourceFilePath);
        this.setParamSimple(map, prefix + "TargetDirPath", this.TargetDirPath);

    }
}

