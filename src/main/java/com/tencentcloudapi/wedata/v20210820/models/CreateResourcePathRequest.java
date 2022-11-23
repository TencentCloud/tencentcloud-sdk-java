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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateResourcePathRequest extends AbstractModel{

    /**
    * 文件夹名称，如 aaa
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 文件夹所属父目录，请注意，根目录为 /datastudio/resource
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 文件夹名称，如 aaa 
     * @return Name 文件夹名称，如 aaa
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 文件夹名称，如 aaa
     * @param Name 文件夹名称，如 aaa
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 文件夹所属父目录，请注意，根目录为 /datastudio/resource 
     * @return FilePath 文件夹所属父目录，请注意，根目录为 /datastudio/resource
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 文件夹所属父目录，请注意，根目录为 /datastudio/resource
     * @param FilePath 文件夹所属父目录，请注意，根目录为 /datastudio/resource
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

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

    public CreateResourcePathRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateResourcePathRequest(CreateResourcePathRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

