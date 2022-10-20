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

public class CreateOrUpdateResourceRequest extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 文件名
    */
    @SerializedName("Files")
    @Expose
    private String [] Files;

    /**
    * 文件所属路径，资源管理根路径为 /datastudio/resouce
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * cos存储桶名字
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * cos所属地域
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * 是否为新文件，新增为 true，更新为 false
    */
    @SerializedName("NewFile")
    @Expose
    private Boolean NewFile;

    /**
    * 文件大小
    */
    @SerializedName("FilesSize")
    @Expose
    private String [] FilesSize;

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
     * Get 文件名 
     * @return Files 文件名
     */
    public String [] getFiles() {
        return this.Files;
    }

    /**
     * Set 文件名
     * @param Files 文件名
     */
    public void setFiles(String [] Files) {
        this.Files = Files;
    }

    /**
     * Get 文件所属路径，资源管理根路径为 /datastudio/resouce 
     * @return FilePath 文件所属路径，资源管理根路径为 /datastudio/resouce
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 文件所属路径，资源管理根路径为 /datastudio/resouce
     * @param FilePath 文件所属路径，资源管理根路径为 /datastudio/resouce
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get cos存储桶名字 
     * @return CosBucketName cos存储桶名字
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set cos存储桶名字
     * @param CosBucketName cos存储桶名字
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get cos所属地域 
     * @return CosRegion cos所属地域
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set cos所属地域
     * @param CosRegion cos所属地域
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get 是否为新文件，新增为 true，更新为 false 
     * @return NewFile 是否为新文件，新增为 true，更新为 false
     */
    public Boolean getNewFile() {
        return this.NewFile;
    }

    /**
     * Set 是否为新文件，新增为 true，更新为 false
     * @param NewFile 是否为新文件，新增为 true，更新为 false
     */
    public void setNewFile(Boolean NewFile) {
        this.NewFile = NewFile;
    }

    /**
     * Get 文件大小 
     * @return FilesSize 文件大小
     */
    public String [] getFilesSize() {
        return this.FilesSize;
    }

    /**
     * Set 文件大小
     * @param FilesSize 文件大小
     */
    public void setFilesSize(String [] FilesSize) {
        this.FilesSize = FilesSize;
    }

    public CreateOrUpdateResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrUpdateResourceRequest(CreateOrUpdateResourceRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Files != null) {
            this.Files = new String[source.Files.length];
            for (int i = 0; i < source.Files.length; i++) {
                this.Files[i] = new String(source.Files[i]);
            }
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
        }
        if (source.NewFile != null) {
            this.NewFile = new Boolean(source.NewFile);
        }
        if (source.FilesSize != null) {
            this.FilesSize = new String[source.FilesSize.length];
            for (int i = 0; i < source.FilesSize.length; i++) {
                this.FilesSize[i] = new String(source.FilesSize[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "Files.", this.Files);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "NewFile", this.NewFile);
        this.setParamArraySimple(map, prefix + "FilesSize.", this.FilesSize);

    }
}

