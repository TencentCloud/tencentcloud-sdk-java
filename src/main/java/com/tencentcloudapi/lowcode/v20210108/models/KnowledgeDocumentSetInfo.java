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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeDocumentSetInfo extends AbstractModel {

    /**
    * 文件的字符数。
    */
    @SerializedName("TextLength")
    @Expose
    private Long TextLength;

    /**
    * 文件的字节数。
    */
    @SerializedName("ByteLength")
    @Expose
    private Long ByteLength;

    /**
    * 文件被预处理、Embedding 向量化的进度。
    */
    @SerializedName("IndexedProgress")
    @Expose
    private Long IndexedProgress;

    /**
    * 文件预处理、Embedding 向量化的状态。
New：等待解析。
Loading：文件解析中。
Failure：文件解析、写入出错。
Ready：文件解析、写入完成。

    */
    @SerializedName("IndexedStatus")
    @Expose
    private String IndexedStatus;

    /**
    * 文件创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 文件最后更新时间。
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * 文件关键字。
    */
    @SerializedName("Keywords")
    @Expose
    private String Keywords;

    /**
     * Get 文件的字符数。 
     * @return TextLength 文件的字符数。
     */
    public Long getTextLength() {
        return this.TextLength;
    }

    /**
     * Set 文件的字符数。
     * @param TextLength 文件的字符数。
     */
    public void setTextLength(Long TextLength) {
        this.TextLength = TextLength;
    }

    /**
     * Get 文件的字节数。 
     * @return ByteLength 文件的字节数。
     */
    public Long getByteLength() {
        return this.ByteLength;
    }

    /**
     * Set 文件的字节数。
     * @param ByteLength 文件的字节数。
     */
    public void setByteLength(Long ByteLength) {
        this.ByteLength = ByteLength;
    }

    /**
     * Get 文件被预处理、Embedding 向量化的进度。 
     * @return IndexedProgress 文件被预处理、Embedding 向量化的进度。
     */
    public Long getIndexedProgress() {
        return this.IndexedProgress;
    }

    /**
     * Set 文件被预处理、Embedding 向量化的进度。
     * @param IndexedProgress 文件被预处理、Embedding 向量化的进度。
     */
    public void setIndexedProgress(Long IndexedProgress) {
        this.IndexedProgress = IndexedProgress;
    }

    /**
     * Get 文件预处理、Embedding 向量化的状态。
New：等待解析。
Loading：文件解析中。
Failure：文件解析、写入出错。
Ready：文件解析、写入完成。
 
     * @return IndexedStatus 文件预处理、Embedding 向量化的状态。
New：等待解析。
Loading：文件解析中。
Failure：文件解析、写入出错。
Ready：文件解析、写入完成。

     */
    public String getIndexedStatus() {
        return this.IndexedStatus;
    }

    /**
     * Set 文件预处理、Embedding 向量化的状态。
New：等待解析。
Loading：文件解析中。
Failure：文件解析、写入出错。
Ready：文件解析、写入完成。

     * @param IndexedStatus 文件预处理、Embedding 向量化的状态。
New：等待解析。
Loading：文件解析中。
Failure：文件解析、写入出错。
Ready：文件解析、写入完成。

     */
    public void setIndexedStatus(String IndexedStatus) {
        this.IndexedStatus = IndexedStatus;
    }

    /**
     * Get 文件创建时间。 
     * @return CreateTime 文件创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 文件创建时间。
     * @param CreateTime 文件创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 文件最后更新时间。 
     * @return LastUpdateTime 文件最后更新时间。
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 文件最后更新时间。
     * @param LastUpdateTime 文件最后更新时间。
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get 文件关键字。 
     * @return Keywords 文件关键字。
     */
    public String getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 文件关键字。
     * @param Keywords 文件关键字。
     */
    public void setKeywords(String Keywords) {
        this.Keywords = Keywords;
    }

    public KnowledgeDocumentSetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeDocumentSetInfo(KnowledgeDocumentSetInfo source) {
        if (source.TextLength != null) {
            this.TextLength = new Long(source.TextLength);
        }
        if (source.ByteLength != null) {
            this.ByteLength = new Long(source.ByteLength);
        }
        if (source.IndexedProgress != null) {
            this.IndexedProgress = new Long(source.IndexedProgress);
        }
        if (source.IndexedStatus != null) {
            this.IndexedStatus = new String(source.IndexedStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
        if (source.Keywords != null) {
            this.Keywords = new String(source.Keywords);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TextLength", this.TextLength);
        this.setParamSimple(map, prefix + "ByteLength", this.ByteLength);
        this.setParamSimple(map, prefix + "IndexedProgress", this.IndexedProgress);
        this.setParamSimple(map, prefix + "IndexedStatus", this.IndexedStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "Keywords", this.Keywords);

    }
}

