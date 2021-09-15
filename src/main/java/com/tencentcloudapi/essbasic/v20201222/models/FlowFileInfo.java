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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowFileInfo extends AbstractModel{

    /**
    * 文件序号
    */
    @SerializedName("FileIndex")
    @Expose
    private Long FileIndex;

    /**
    * 文件类型
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文件的MD5码
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

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
    * 文件创建时间戳
    */
    @SerializedName("CreatedOn")
    @Expose
    private Long CreatedOn;

    /**
    * 文件的下载地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 文件序号 
     * @return FileIndex 文件序号
     */
    public Long getFileIndex() {
        return this.FileIndex;
    }

    /**
     * Set 文件序号
     * @param FileIndex 文件序号
     */
    public void setFileIndex(Long FileIndex) {
        this.FileIndex = FileIndex;
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
     * Get 文件的MD5码 
     * @return FileMd5 文件的MD5码
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set 文件的MD5码
     * @param FileMd5 文件的MD5码
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
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
     * Get 文件创建时间戳 
     * @return CreatedOn 文件创建时间戳
     */
    public Long getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 文件创建时间戳
     * @param CreatedOn 文件创建时间戳
     */
    public void setCreatedOn(Long CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 文件的下载地址 
     * @return Url 文件的下载地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 文件的下载地址
     * @param Url 文件的下载地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public FlowFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowFileInfo(FlowFileInfo source) {
        if (source.FileIndex != null) {
            this.FileIndex = new Long(source.FileIndex);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
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
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileIndex", this.FileIndex);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

