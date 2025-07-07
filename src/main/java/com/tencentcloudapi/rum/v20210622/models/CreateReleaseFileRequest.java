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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateReleaseFileRequest extends AbstractModel {

    /**
    * 项目 id
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * 文件信息列表
    */
    @SerializedName("Files")
    @Expose
    private ReleaseFile [] Files;

    /**
     * Get 项目 id 
     * @return ProjectID 项目 id
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set 项目 id
     * @param ProjectID 项目 id
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get 文件信息列表 
     * @return Files 文件信息列表
     */
    public ReleaseFile [] getFiles() {
        return this.Files;
    }

    /**
     * Set 文件信息列表
     * @param Files 文件信息列表
     */
    public void setFiles(ReleaseFile [] Files) {
        this.Files = Files;
    }

    public CreateReleaseFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReleaseFileRequest(CreateReleaseFileRequest source) {
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.Files != null) {
            this.Files = new ReleaseFile[source.Files.length];
            for (int i = 0; i < source.Files.length; i++) {
                this.Files[i] = new ReleaseFile(source.Files[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamArrayObj(map, prefix + "Files.", this.Files);

    }
}

