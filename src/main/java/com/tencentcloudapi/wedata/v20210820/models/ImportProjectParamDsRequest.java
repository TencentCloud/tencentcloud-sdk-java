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

public class ImportProjectParamDsRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 已废弃
    */
    @SerializedName("FilesCos")
    @Expose
    private String [] FilesCos;

    /**
    * 发布ID
    */
    @SerializedName("PublishInfoId")
    @Expose
    private String PublishInfoId;

    /**
    * 全局参数
    */
    @SerializedName("GlobalConfig")
    @Expose
    private String GlobalConfig;

    /**
    * 已废弃
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 已废弃
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * 共享存储临时文件名称，详情可以见 UploadFileDs 接口，该参数从 UploadFileDs 中的 TargetFileName
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

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
     * Get 已废弃 
     * @return FilesCos 已废弃
     */
    public String [] getFilesCos() {
        return this.FilesCos;
    }

    /**
     * Set 已废弃
     * @param FilesCos 已废弃
     */
    public void setFilesCos(String [] FilesCos) {
        this.FilesCos = FilesCos;
    }

    /**
     * Get 发布ID 
     * @return PublishInfoId 发布ID
     */
    public String getPublishInfoId() {
        return this.PublishInfoId;
    }

    /**
     * Set 发布ID
     * @param PublishInfoId 发布ID
     */
    public void setPublishInfoId(String PublishInfoId) {
        this.PublishInfoId = PublishInfoId;
    }

    /**
     * Get 全局参数 
     * @return GlobalConfig 全局参数
     */
    public String getGlobalConfig() {
        return this.GlobalConfig;
    }

    /**
     * Set 全局参数
     * @param GlobalConfig 全局参数
     */
    public void setGlobalConfig(String GlobalConfig) {
        this.GlobalConfig = GlobalConfig;
    }

    /**
     * Get 已废弃 
     * @return BucketName 已废弃
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 已废弃
     * @param BucketName 已废弃
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 已废弃 
     * @return CosRegion 已废弃
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set 已废弃
     * @param CosRegion 已废弃
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get 共享存储临时文件名称，详情可以见 UploadFileDs 接口，该参数从 UploadFileDs 中的 TargetFileName 
     * @return FileName 共享存储临时文件名称，详情可以见 UploadFileDs 接口，该参数从 UploadFileDs 中的 TargetFileName
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 共享存储临时文件名称，详情可以见 UploadFileDs 接口，该参数从 UploadFileDs 中的 TargetFileName
     * @param FileName 共享存储临时文件名称，详情可以见 UploadFileDs 接口，该参数从 UploadFileDs 中的 TargetFileName
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public ImportProjectParamDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportProjectParamDsRequest(ImportProjectParamDsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FilesCos != null) {
            this.FilesCos = new String[source.FilesCos.length];
            for (int i = 0; i < source.FilesCos.length; i++) {
                this.FilesCos[i] = new String(source.FilesCos[i]);
            }
        }
        if (source.PublishInfoId != null) {
            this.PublishInfoId = new String(source.PublishInfoId);
        }
        if (source.GlobalConfig != null) {
            this.GlobalConfig = new String(source.GlobalConfig);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "FilesCos.", this.FilesCos);
        this.setParamSimple(map, prefix + "PublishInfoId", this.PublishInfoId);
        this.setParamSimple(map, prefix + "GlobalConfig", this.GlobalConfig);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "FileName", this.FileName);

    }
}

