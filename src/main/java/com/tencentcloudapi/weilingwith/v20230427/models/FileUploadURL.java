/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileUploadURL extends AbstractModel {

    /**
    * 上传地址
    */
    @SerializedName("UploadURL")
    @Expose
    private String UploadURL;

    /**
    * 文件Id
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 下载地址
    */
    @SerializedName("DownloadURL")
    @Expose
    private String DownloadURL;

    /**
     * Get 上传地址 
     * @return UploadURL 上传地址
     */
    public String getUploadURL() {
        return this.UploadURL;
    }

    /**
     * Set 上传地址
     * @param UploadURL 上传地址
     */
    public void setUploadURL(String UploadURL) {
        this.UploadURL = UploadURL;
    }

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
     * Get 下载地址 
     * @return DownloadURL 下载地址
     */
    public String getDownloadURL() {
        return this.DownloadURL;
    }

    /**
     * Set 下载地址
     * @param DownloadURL 下载地址
     */
    public void setDownloadURL(String DownloadURL) {
        this.DownloadURL = DownloadURL;
    }

    public FileUploadURL() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileUploadURL(FileUploadURL source) {
        if (source.UploadURL != null) {
            this.UploadURL = new String(source.UploadURL);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.DownloadURL != null) {
            this.DownloadURL = new String(source.DownloadURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UploadURL", this.UploadURL);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "DownloadURL", this.DownloadURL);

    }
}

