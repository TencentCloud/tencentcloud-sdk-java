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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileSample extends AbstractModel{

    /**
    * 文件md5
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * 文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件url
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 文件压缩后云url
    */
    @SerializedName("CompressFileUrl")
    @Expose
    private String CompressFileUrl;

    /**
     * Get 文件md5 
     * @return FileMd5 文件md5
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set 文件md5
     * @param FileMd5 文件md5
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get 文件名称 
     * @return FileName 文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称
     * @param FileName 文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件url 
     * @return FileUrl 文件url
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 文件url
     * @param FileUrl 文件url
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 文件压缩后云url 
     * @return CompressFileUrl 文件压缩后云url
     */
    public String getCompressFileUrl() {
        return this.CompressFileUrl;
    }

    /**
     * Set 文件压缩后云url
     * @param CompressFileUrl 文件压缩后云url
     */
    public void setCompressFileUrl(String CompressFileUrl) {
        this.CompressFileUrl = CompressFileUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "CompressFileUrl", this.CompressFileUrl);

    }
}

