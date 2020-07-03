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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SqlFileInfo extends AbstractModel{

    /**
    * 上传时间
    */
    @SerializedName("UploadTime")
    @Expose
    private String UploadTime;

    /**
    * 上传进度
    */
    @SerializedName("UploadInfo")
    @Expose
    private UploadInfo UploadInfo;

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件大小，单位为Bytes
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 上传是否完成标志，可选值：0 - 未完成，1 - 已完成
    */
    @SerializedName("IsUploadFinished")
    @Expose
    private Long IsUploadFinished;

    /**
    * 文件ID
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get 上传时间 
     * @return UploadTime 上传时间
     */
    public String getUploadTime() {
        return this.UploadTime;
    }

    /**
     * Set 上传时间
     * @param UploadTime 上传时间
     */
    public void setUploadTime(String UploadTime) {
        this.UploadTime = UploadTime;
    }

    /**
     * Get 上传进度 
     * @return UploadInfo 上传进度
     */
    public UploadInfo getUploadInfo() {
        return this.UploadInfo;
    }

    /**
     * Set 上传进度
     * @param UploadInfo 上传进度
     */
    public void setUploadInfo(UploadInfo UploadInfo) {
        this.UploadInfo = UploadInfo;
    }

    /**
     * Get 文件名 
     * @return FileName 文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名
     * @param FileName 文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件大小，单位为Bytes 
     * @return FileSize 文件大小，单位为Bytes
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小，单位为Bytes
     * @param FileSize 文件大小，单位为Bytes
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 上传是否完成标志，可选值：0 - 未完成，1 - 已完成 
     * @return IsUploadFinished 上传是否完成标志，可选值：0 - 未完成，1 - 已完成
     */
    public Long getIsUploadFinished() {
        return this.IsUploadFinished;
    }

    /**
     * Set 上传是否完成标志，可选值：0 - 未完成，1 - 已完成
     * @param IsUploadFinished 上传是否完成标志，可选值：0 - 未完成，1 - 已完成
     */
    public void setIsUploadFinished(Long IsUploadFinished) {
        this.IsUploadFinished = IsUploadFinished;
    }

    /**
     * Get 文件ID 
     * @return FileId 文件ID
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 文件ID
     * @param FileId 文件ID
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UploadTime", this.UploadTime);
        this.setParamObj(map, prefix + "UploadInfo.", this.UploadInfo);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "IsUploadFinished", this.IsUploadFinished);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

