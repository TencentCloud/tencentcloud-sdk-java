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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileInfo extends AbstractModel{

    /**
    * 文件Id
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件大小，单位为Byte
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 文件上传时间，10位时间戳（精确到秒）
    */
    @SerializedName("CreatedOn")
    @Expose
    private Long CreatedOn;

    /**
     * Get 文件Id 
     * @return FileId 文件Id
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 文件Id
     * @param FileId 文件Id
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
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
     * Get 文件大小，单位为Byte 
     * @return FileSize 文件大小，单位为Byte
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小，单位为Byte
     * @param FileSize 文件大小，单位为Byte
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 文件上传时间，10位时间戳（精确到秒） 
     * @return CreatedOn 文件上传时间，10位时间戳（精确到秒）
     */
    public Long getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 文件上传时间，10位时间戳（精确到秒）
     * @param CreatedOn 文件上传时间，10位时间戳（精确到秒）
     */
    public void setCreatedOn(Long CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    public FileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileInfo(FileInfo source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new Long(source.CreatedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);

    }
}

