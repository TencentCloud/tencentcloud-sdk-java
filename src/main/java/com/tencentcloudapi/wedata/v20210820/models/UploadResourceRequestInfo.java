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

public class UploadResourceRequestInfo extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 资源路径
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 桶名称
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 所属地区
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 是否为新资源
    */
    @SerializedName("NewFile")
    @Expose
    private Boolean NewFile;

    /**
    * 资源列表
    */
    @SerializedName("FileList")
    @Expose
    private String [] FileList;

    /**
    * 资源大小列表
    */
    @SerializedName("FileSizeList")
    @Expose
    private String [] FileSizeList;

    /**
    * File Md5（适配私有化，公有云可以不传）
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

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
     * Get 资源路径 
     * @return FilePath 资源路径
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 资源路径
     * @param FilePath 资源路径
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get 桶名称 
     * @return BucketName 桶名称
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 桶名称
     * @param BucketName 桶名称
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 所属地区 
     * @return Region 所属地区
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 所属地区
     * @param Region 所属地区
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 是否为新资源 
     * @return NewFile 是否为新资源
     */
    public Boolean getNewFile() {
        return this.NewFile;
    }

    /**
     * Set 是否为新资源
     * @param NewFile 是否为新资源
     */
    public void setNewFile(Boolean NewFile) {
        this.NewFile = NewFile;
    }

    /**
     * Get 资源列表 
     * @return FileList 资源列表
     */
    public String [] getFileList() {
        return this.FileList;
    }

    /**
     * Set 资源列表
     * @param FileList 资源列表
     */
    public void setFileList(String [] FileList) {
        this.FileList = FileList;
    }

    /**
     * Get 资源大小列表 
     * @return FileSizeList 资源大小列表
     */
    public String [] getFileSizeList() {
        return this.FileSizeList;
    }

    /**
     * Set 资源大小列表
     * @param FileSizeList 资源大小列表
     */
    public void setFileSizeList(String [] FileSizeList) {
        this.FileSizeList = FileSizeList;
    }

    /**
     * Get File Md5（适配私有化，公有云可以不传） 
     * @return FileMd5 File Md5（适配私有化，公有云可以不传）
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set File Md5（适配私有化，公有云可以不传）
     * @param FileMd5 File Md5（适配私有化，公有云可以不传）
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    public UploadResourceRequestInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadResourceRequestInfo(UploadResourceRequestInfo source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.NewFile != null) {
            this.NewFile = new Boolean(source.NewFile);
        }
        if (source.FileList != null) {
            this.FileList = new String[source.FileList.length];
            for (int i = 0; i < source.FileList.length; i++) {
                this.FileList[i] = new String(source.FileList[i]);
            }
        }
        if (source.FileSizeList != null) {
            this.FileSizeList = new String[source.FileSizeList.length];
            for (int i = 0; i < source.FileSizeList.length; i++) {
                this.FileSizeList[i] = new String(source.FileSizeList[i]);
            }
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "NewFile", this.NewFile);
        this.setParamArraySimple(map, prefix + "FileList.", this.FileList);
        this.setParamArraySimple(map, prefix + "FileSizeList.", this.FileSizeList);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);

    }
}

