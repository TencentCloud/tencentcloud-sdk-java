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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFileContentRsp extends AbstractModel {

    /**
    * 文件ID；按 FilePath 查询时回显解析结果，便于调用方缓存
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 文件名，不含路径
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件全路径
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 文件类型，参考 ListEntityTypeMetas 返回值为准
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文件大小，字节
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * 文件内容，base64 编码
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 内容编码方式，当前固定 base64
    */
    @SerializedName("ContentEncoding")
    @Expose
    private String ContentEncoding;

    /**
     * Get 文件ID；按 FilePath 查询时回显解析结果，便于调用方缓存 
     * @return FileId 文件ID；按 FilePath 查询时回显解析结果，便于调用方缓存
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 文件ID；按 FilePath 查询时回显解析结果，便于调用方缓存
     * @param FileId 文件ID；按 FilePath 查询时回显解析结果，便于调用方缓存
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 文件名，不含路径 
     * @return FileName 文件名，不含路径
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名，不含路径
     * @param FileName 文件名，不含路径
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件全路径 
     * @return FilePath 文件全路径
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 文件全路径
     * @param FilePath 文件全路径
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get 文件类型，参考 ListEntityTypeMetas 返回值为准 
     * @return FileType 文件类型，参考 ListEntityTypeMetas 返回值为准
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型，参考 ListEntityTypeMetas 返回值为准
     * @param FileType 文件类型，参考 ListEntityTypeMetas 返回值为准
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 文件大小，字节 
     * @return FileSize 文件大小，字节
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小，字节
     * @param FileSize 文件大小，字节
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 文件内容，base64 编码 
     * @return Content 文件内容，base64 编码
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 文件内容，base64 编码
     * @param Content 文件内容，base64 编码
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 内容编码方式，当前固定 base64 
     * @return ContentEncoding 内容编码方式，当前固定 base64
     */
    public String getContentEncoding() {
        return this.ContentEncoding;
    }

    /**
     * Set 内容编码方式，当前固定 base64
     * @param ContentEncoding 内容编码方式，当前固定 base64
     */
    public void setContentEncoding(String ContentEncoding) {
        this.ContentEncoding = ContentEncoding;
    }

    public GetFileContentRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFileContentRsp(GetFileContentRsp source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileSize != null) {
            this.FileSize = new String(source.FileSize);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ContentEncoding != null) {
            this.ContentEncoding = new String(source.ContentEncoding);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ContentEncoding", this.ContentEncoding);

    }
}

