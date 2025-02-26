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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QureyKnowledgeDocumentSetInfo extends AbstractModel {

    /**
    * 文件的字符数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextLength")
    @Expose
    private Long TextLength;

    /**
    * 文件的字节数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ByteLength")
    @Expose
    private Long ByteLength;

    /**
    * 文件被预处理、Embedding 向量化的进度。
注意：此字段可能返回 null，表示取不到有效值。
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

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexedStatus")
    @Expose
    private String IndexedStatus;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexedErrorMsg")
    @Expose
    private String IndexedErrorMsg;

    /**
    * 文件创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 文件最后更新时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * 文件关键字。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keywords")
    @Expose
    private String Keywords;

    /**
     * Get 文件的字符数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextLength 文件的字符数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTextLength() {
        return this.TextLength;
    }

    /**
     * Set 文件的字符数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextLength 文件的字符数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextLength(Long TextLength) {
        this.TextLength = TextLength;
    }

    /**
     * Get 文件的字节数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ByteLength 文件的字节数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getByteLength() {
        return this.ByteLength;
    }

    /**
     * Set 文件的字节数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ByteLength 文件的字节数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setByteLength(Long ByteLength) {
        this.ByteLength = ByteLength;
    }

    /**
     * Get 文件被预处理、Embedding 向量化的进度。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexedProgress 文件被预处理、Embedding 向量化的进度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndexedProgress() {
        return this.IndexedProgress;
    }

    /**
     * Set 文件被预处理、Embedding 向量化的进度。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexedProgress 文件被预处理、Embedding 向量化的进度。
注意：此字段可能返回 null，表示取不到有效值。
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

注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexedStatus 文件预处理、Embedding 向量化的状态。
New：等待解析。
Loading：文件解析中。
Failure：文件解析、写入出错。
Ready：文件解析、写入完成。

注意：此字段可能返回 null，表示取不到有效值。
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

注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexedStatus 文件预处理、Embedding 向量化的状态。
New：等待解析。
Loading：文件解析中。
Failure：文件解析、写入出错。
Ready：文件解析、写入完成。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexedStatus(String IndexedStatus) {
        this.IndexedStatus = IndexedStatus;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexedErrorMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexedErrorMsg() {
        return this.IndexedErrorMsg;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexedErrorMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexedErrorMsg(String IndexedErrorMsg) {
        this.IndexedErrorMsg = IndexedErrorMsg;
    }

    /**
     * Get 文件创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 文件创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 文件创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 文件创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 文件最后更新时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdateTime 文件最后更新时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 文件最后更新时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdateTime 文件最后更新时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get 文件关键字。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keywords 文件关键字。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 文件关键字。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keywords 文件关键字。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeywords(String Keywords) {
        this.Keywords = Keywords;
    }

    public QureyKnowledgeDocumentSetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QureyKnowledgeDocumentSetInfo(QureyKnowledgeDocumentSetInfo source) {
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
        if (source.IndexedErrorMsg != null) {
            this.IndexedErrorMsg = new String(source.IndexedErrorMsg);
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
        this.setParamSimple(map, prefix + "IndexedErrorMsg", this.IndexedErrorMsg);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "Keywords", this.Keywords);

    }
}

