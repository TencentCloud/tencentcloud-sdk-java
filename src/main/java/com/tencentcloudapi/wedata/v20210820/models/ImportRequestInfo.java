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

public class ImportRequestInfo extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * zip包上传cos地址
    */
    @SerializedName("FileCos")
    @Expose
    private String FileCos;

    /**
    * cos桶名
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * cos地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 文件导入路径（不包含文件名）
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

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
     * Get zip包上传cos地址 
     * @return FileCos zip包上传cos地址
     */
    public String getFileCos() {
        return this.FileCos;
    }

    /**
     * Set zip包上传cos地址
     * @param FileCos zip包上传cos地址
     */
    public void setFileCos(String FileCos) {
        this.FileCos = FileCos;
    }

    /**
     * Get cos桶名 
     * @return BucketName cos桶名
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set cos桶名
     * @param BucketName cos桶名
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get cos地域 
     * @return Region cos地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set cos地域
     * @param Region cos地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 文件导入路径（不包含文件名） 
     * @return FilePath 文件导入路径（不包含文件名）
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 文件导入路径（不包含文件名）
     * @param FilePath 文件导入路径（不包含文件名）
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    public ImportRequestInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportRequestInfo(ImportRequestInfo source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FileCos != null) {
            this.FileCos = new String(source.FileCos);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FileCos", this.FileCos);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);

    }
}

