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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppendDocument extends AbstractModel {

    /**
    * <p>文件名称</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>文件id</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>文件url</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * <p>文件大小</p>
    */
    @SerializedName("FileSize")
    @Expose
    private Float FileSize;

    /**
     * Get <p>文件名称</p> 
     * @return FileName <p>文件名称</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名称</p>
     * @param FileName <p>文件名称</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>文件id</p> 
     * @return FileId <p>文件id</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>文件id</p>
     * @param FileId <p>文件id</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>文件url</p> 
     * @return FileUrl <p>文件url</p>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>文件url</p>
     * @param FileUrl <p>文件url</p>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get <p>文件大小</p> 
     * @return FileSize <p>文件大小</p>
     */
    public Float getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>文件大小</p>
     * @param FileSize <p>文件大小</p>
     */
    public void setFileSize(Float FileSize) {
        this.FileSize = FileSize;
    }

    public AppendDocument() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppendDocument(AppendDocument source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileSize != null) {
            this.FileSize = new Float(source.FileSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);

    }
}

