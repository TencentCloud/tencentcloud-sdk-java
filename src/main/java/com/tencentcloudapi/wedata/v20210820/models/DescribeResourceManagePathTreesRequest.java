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

public class DescribeResourceManagePathTreesRequest extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 名字，供搜索
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 文件类型
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文件路径
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 文件夹类型
    */
    @SerializedName("DirType")
    @Expose
    private String DirType;

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
     * Get 名字，供搜索 
     * @return Name 名字，供搜索
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名字，供搜索
     * @param Name 名字，供搜索
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 文件类型 
     * @return FileType 文件类型
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型
     * @param FileType 文件类型
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
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
     * Get 文件夹类型 
     * @return DirType 文件夹类型
     */
    public String getDirType() {
        return this.DirType;
    }

    /**
     * Set 文件夹类型
     * @param DirType 文件夹类型
     */
    public void setDirType(String DirType) {
        this.DirType = DirType;
    }

    public DescribeResourceManagePathTreesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceManagePathTreesRequest(DescribeResourceManagePathTreesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.DirType != null) {
            this.DirType = new String(source.DirType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "DirType", this.DirType);

    }
}

