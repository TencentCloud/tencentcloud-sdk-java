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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReleaseFilesRequest extends AbstractModel{

    /**
    * 项目 id
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * 文件版本
    */
    @SerializedName("FileVersion")
    @Expose
    private String FileVersion;

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
     * Get 文件版本 
     * @return FileVersion 文件版本
     */
    public String getFileVersion() {
        return this.FileVersion;
    }

    /**
     * Set 文件版本
     * @param FileVersion 文件版本
     */
    public void setFileVersion(String FileVersion) {
        this.FileVersion = FileVersion;
    }

    public DescribeReleaseFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReleaseFilesRequest(DescribeReleaseFilesRequest source) {
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.FileVersion != null) {
            this.FileVersion = new String(source.FileVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "FileVersion", this.FileVersion);

    }
}

