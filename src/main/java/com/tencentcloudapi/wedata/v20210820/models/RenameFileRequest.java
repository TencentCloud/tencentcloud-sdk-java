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

public class RenameFileRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 文件路径
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 新文件名
    */
    @SerializedName("File")
    @Expose
    private String File;

    /**
    * 来源任务（集成使用）
    */
    @SerializedName("FromTask")
    @Expose
    private String FromTask;

    /**
    * 目标任务（集成使用）
    */
    @SerializedName("ToTask")
    @Expose
    private String ToTask;

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
     * Get 文件路径 
     * @return FilePath 文件路径
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 文件路径
     * @param FilePath 文件路径
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get 新文件名 
     * @return File 新文件名
     */
    public String getFile() {
        return this.File;
    }

    /**
     * Set 新文件名
     * @param File 新文件名
     */
    public void setFile(String File) {
        this.File = File;
    }

    /**
     * Get 来源任务（集成使用） 
     * @return FromTask 来源任务（集成使用）
     */
    public String getFromTask() {
        return this.FromTask;
    }

    /**
     * Set 来源任务（集成使用）
     * @param FromTask 来源任务（集成使用）
     */
    public void setFromTask(String FromTask) {
        this.FromTask = FromTask;
    }

    /**
     * Get 目标任务（集成使用） 
     * @return ToTask 目标任务（集成使用）
     */
    public String getToTask() {
        return this.ToTask;
    }

    /**
     * Set 目标任务（集成使用）
     * @param ToTask 目标任务（集成使用）
     */
    public void setToTask(String ToTask) {
        this.ToTask = ToTask;
    }

    public RenameFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenameFileRequest(RenameFileRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.File != null) {
            this.File = new String(source.File);
        }
        if (source.FromTask != null) {
            this.FromTask = new String(source.FromTask);
        }
        if (source.ToTask != null) {
            this.ToTask = new String(source.ToTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "File", this.File);
        this.setParamSimple(map, prefix + "FromTask", this.FromTask);
        this.setParamSimple(map, prefix + "ToTask", this.ToTask);

    }
}

