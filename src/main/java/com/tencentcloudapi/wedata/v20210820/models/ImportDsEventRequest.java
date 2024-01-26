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

public class ImportDsEventRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 事件名称
    */
    @SerializedName("FileCos")
    @Expose
    private String FileCos;

    /**
    * 桶名
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * cos地域
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * 是否强制刷新
    */
    @SerializedName("ForceUpdate")
    @Expose
    private Boolean ForceUpdate;

    /**
    * 共享存储临时文件名称，详情可以见 UploadFileDs 接口，该参数从 UploadFileDs 中的 TargetFileName，不能为空
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

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
     * Get 事件名称 
     * @return FileCos 事件名称
     */
    public String getFileCos() {
        return this.FileCos;
    }

    /**
     * Set 事件名称
     * @param FileCos 事件名称
     */
    public void setFileCos(String FileCos) {
        this.FileCos = FileCos;
    }

    /**
     * Get 桶名 
     * @return BucketName 桶名
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 桶名
     * @param BucketName 桶名
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get cos地域 
     * @return CosRegion cos地域
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set cos地域
     * @param CosRegion cos地域
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get 是否强制刷新 
     * @return ForceUpdate 是否强制刷新
     */
    public Boolean getForceUpdate() {
        return this.ForceUpdate;
    }

    /**
     * Set 是否强制刷新
     * @param ForceUpdate 是否强制刷新
     */
    public void setForceUpdate(Boolean ForceUpdate) {
        this.ForceUpdate = ForceUpdate;
    }

    /**
     * Get 共享存储临时文件名称，详情可以见 UploadFileDs 接口，该参数从 UploadFileDs 中的 TargetFileName，不能为空 
     * @return FileName 共享存储临时文件名称，详情可以见 UploadFileDs 接口，该参数从 UploadFileDs 中的 TargetFileName，不能为空
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 共享存储临时文件名称，详情可以见 UploadFileDs 接口，该参数从 UploadFileDs 中的 TargetFileName，不能为空
     * @param FileName 共享存储临时文件名称，详情可以见 UploadFileDs 接口，该参数从 UploadFileDs 中的 TargetFileName，不能为空
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public ImportDsEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportDsEventRequest(ImportDsEventRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FileCos != null) {
            this.FileCos = new String(source.FileCos);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
        }
        if (source.ForceUpdate != null) {
            this.ForceUpdate = new Boolean(source.ForceUpdate);
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
        this.setParamSimple(map, prefix + "FileCos", this.FileCos);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "ForceUpdate", this.ForceUpdate);
        this.setParamSimple(map, prefix + "FileName", this.FileName);

    }
}

