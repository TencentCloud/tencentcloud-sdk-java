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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadDocRealtimeRequest extends AbstractModel {

    /**
    * 知识库ID
    */
    @SerializedName("KnowledgeBaseId")
    @Expose
    private String KnowledgeBaseId;

    /**
    * 文件名，可选。
**需带文件类型后缀**，当文件名无法从传入的`FileUrl`获取时需要通过该字段来明确。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件类型。
**支持的文件类型：**
- `PDF`、`DOC`、`DOCX`、`XLS`、`XLSX`、`PPT`、`PPTX`、`MD`、`TXT`、`PNG`、`JPG`、`JPEG`、`CSV`、`HTML`、`EPUB`

**支持的文件大小：**
 - `PDF`、`DOCX`、`DOC`、`PPT`、`PPTX` 最大 200M 
 - `TXT`、`MD` 最大10M 
 - 其他 最大20M
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文件的 URL 地址。
文件存储于腾讯云的 URL 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。 非腾讯云存储的 URL 速度和稳定性可能受一定影响。
参考：[腾讯云COS文档](https://cloud.tencent.com/document/product/436/7749)
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 过期时间的秒数，最长24小时，默认24小时
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
     * Get 知识库ID 
     * @return KnowledgeBaseId 知识库ID
     */
    public String getKnowledgeBaseId() {
        return this.KnowledgeBaseId;
    }

    /**
     * Set 知识库ID
     * @param KnowledgeBaseId 知识库ID
     */
    public void setKnowledgeBaseId(String KnowledgeBaseId) {
        this.KnowledgeBaseId = KnowledgeBaseId;
    }

    /**
     * Get 文件名，可选。
**需带文件类型后缀**，当文件名无法从传入的`FileUrl`获取时需要通过该字段来明确。 
     * @return FileName 文件名，可选。
**需带文件类型后缀**，当文件名无法从传入的`FileUrl`获取时需要通过该字段来明确。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名，可选。
**需带文件类型后缀**，当文件名无法从传入的`FileUrl`获取时需要通过该字段来明确。
     * @param FileName 文件名，可选。
**需带文件类型后缀**，当文件名无法从传入的`FileUrl`获取时需要通过该字段来明确。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件类型。
**支持的文件类型：**
- `PDF`、`DOC`、`DOCX`、`XLS`、`XLSX`、`PPT`、`PPTX`、`MD`、`TXT`、`PNG`、`JPG`、`JPEG`、`CSV`、`HTML`、`EPUB`

**支持的文件大小：**
 - `PDF`、`DOCX`、`DOC`、`PPT`、`PPTX` 最大 200M 
 - `TXT`、`MD` 最大10M 
 - 其他 最大20M 
     * @return FileType 文件类型。
**支持的文件类型：**
- `PDF`、`DOC`、`DOCX`、`XLS`、`XLSX`、`PPT`、`PPTX`、`MD`、`TXT`、`PNG`、`JPG`、`JPEG`、`CSV`、`HTML`、`EPUB`

**支持的文件大小：**
 - `PDF`、`DOCX`、`DOC`、`PPT`、`PPTX` 最大 200M 
 - `TXT`、`MD` 最大10M 
 - 其他 最大20M
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型。
**支持的文件类型：**
- `PDF`、`DOC`、`DOCX`、`XLS`、`XLSX`、`PPT`、`PPTX`、`MD`、`TXT`、`PNG`、`JPG`、`JPEG`、`CSV`、`HTML`、`EPUB`

**支持的文件大小：**
 - `PDF`、`DOCX`、`DOC`、`PPT`、`PPTX` 最大 200M 
 - `TXT`、`MD` 最大10M 
 - 其他 最大20M
     * @param FileType 文件类型。
**支持的文件类型：**
- `PDF`、`DOC`、`DOCX`、`XLS`、`XLSX`、`PPT`、`PPTX`、`MD`、`TXT`、`PNG`、`JPG`、`JPEG`、`CSV`、`HTML`、`EPUB`

**支持的文件大小：**
 - `PDF`、`DOCX`、`DOC`、`PPT`、`PPTX` 最大 200M 
 - `TXT`、`MD` 最大10M 
 - 其他 最大20M
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 文件的 URL 地址。
文件存储于腾讯云的 URL 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。 非腾讯云存储的 URL 速度和稳定性可能受一定影响。
参考：[腾讯云COS文档](https://cloud.tencent.com/document/product/436/7749) 
     * @return FileUrl 文件的 URL 地址。
文件存储于腾讯云的 URL 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。 非腾讯云存储的 URL 速度和稳定性可能受一定影响。
参考：[腾讯云COS文档](https://cloud.tencent.com/document/product/436/7749)
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 文件的 URL 地址。
文件存储于腾讯云的 URL 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。 非腾讯云存储的 URL 速度和稳定性可能受一定影响。
参考：[腾讯云COS文档](https://cloud.tencent.com/document/product/436/7749)
     * @param FileUrl 文件的 URL 地址。
文件存储于腾讯云的 URL 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。 非腾讯云存储的 URL 速度和稳定性可能受一定影响。
参考：[腾讯云COS文档](https://cloud.tencent.com/document/product/436/7749)
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 过期时间的秒数，最长24小时，默认24小时 
     * @return ExpireTime 过期时间的秒数，最长24小时，默认24小时
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间的秒数，最长24小时，默认24小时
     * @param ExpireTime 过期时间的秒数，最长24小时，默认24小时
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public UploadDocRealtimeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadDocRealtimeRequest(UploadDocRealtimeRequest source) {
        if (source.KnowledgeBaseId != null) {
            this.KnowledgeBaseId = new String(source.KnowledgeBaseId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KnowledgeBaseId", this.KnowledgeBaseId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

