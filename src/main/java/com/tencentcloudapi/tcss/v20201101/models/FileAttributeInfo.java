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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileAttributeInfo extends AbstractModel{

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件类型
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文件大小(字节)
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 文件路径
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 文件创建时间
    */
    @SerializedName("FileCreateTime")
    @Expose
    private String FileCreateTime;

    /**
    * 最近被篡改文件创建时间
    */
    @SerializedName("LatestTamperedFileMTime")
    @Expose
    private String LatestTamperedFileMTime;

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
     * Get 文件大小(字节) 
     * @return FileSize 文件大小(字节)
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小(字节)
     * @param FileSize 文件大小(字节)
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
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
     * Get 文件创建时间 
     * @return FileCreateTime 文件创建时间
     */
    public String getFileCreateTime() {
        return this.FileCreateTime;
    }

    /**
     * Set 文件创建时间
     * @param FileCreateTime 文件创建时间
     */
    public void setFileCreateTime(String FileCreateTime) {
        this.FileCreateTime = FileCreateTime;
    }

    /**
     * Get 最近被篡改文件创建时间 
     * @return LatestTamperedFileMTime 最近被篡改文件创建时间
     */
    public String getLatestTamperedFileMTime() {
        return this.LatestTamperedFileMTime;
    }

    /**
     * Set 最近被篡改文件创建时间
     * @param LatestTamperedFileMTime 最近被篡改文件创建时间
     */
    public void setLatestTamperedFileMTime(String LatestTamperedFileMTime) {
        this.LatestTamperedFileMTime = LatestTamperedFileMTime;
    }

    public FileAttributeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileAttributeInfo(FileAttributeInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.FileCreateTime != null) {
            this.FileCreateTime = new String(source.FileCreateTime);
        }
        if (source.LatestTamperedFileMTime != null) {
            this.LatestTamperedFileMTime = new String(source.LatestTamperedFileMTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "FileCreateTime", this.FileCreateTime);
        this.setParamSimple(map, prefix + "LatestTamperedFileMTime", this.LatestTamperedFileMTime);

    }
}

