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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TestData extends AbstractModel{

    /**
    * 测试数据集所在的文件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 测试数据集是否分片
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Split")
    @Expose
    private Boolean Split;

    /**
    * 首行是否为参数名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeaderInFile")
    @Expose
    private Boolean HeaderInFile;

    /**
    * 参数名数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeaderColumns")
    @Expose
    private String [] HeaderColumns;

    /**
    * 文件行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LineCount")
    @Expose
    private Long LineCount;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 文件字节数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 头部数据行
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeadLines")
    @Expose
    private String [] HeadLines;

    /**
    * 尾部数据行
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TailLines")
    @Expose
    private String [] TailLines;

    /**
    * 文件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 文件 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get 测试数据集所在的文件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 测试数据集所在的文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 测试数据集所在的文件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 测试数据集所在的文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 测试数据集是否分片
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Split 测试数据集是否分片
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSplit() {
        return this.Split;
    }

    /**
     * Set 测试数据集是否分片
注意：此字段可能返回 null，表示取不到有效值。
     * @param Split 测试数据集是否分片
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSplit(Boolean Split) {
        this.Split = Split;
    }

    /**
     * Get 首行是否为参数名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeaderInFile 首行是否为参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHeaderInFile() {
        return this.HeaderInFile;
    }

    /**
     * Set 首行是否为参数名
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeaderInFile 首行是否为参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaderInFile(Boolean HeaderInFile) {
        this.HeaderInFile = HeaderInFile;
    }

    /**
     * Get 参数名数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeaderColumns 参数名数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getHeaderColumns() {
        return this.HeaderColumns;
    }

    /**
     * Set 参数名数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeaderColumns 参数名数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaderColumns(String [] HeaderColumns) {
        this.HeaderColumns = HeaderColumns;
    }

    /**
     * Get 文件行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LineCount 文件行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLineCount() {
        return this.LineCount;
    }

    /**
     * Set 文件行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param LineCount 文件行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLineCount(Long LineCount) {
        this.LineCount = LineCount;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 文件字节数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size 文件字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 文件字节数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 文件字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 头部数据行
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeadLines 头部数据行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getHeadLines() {
        return this.HeadLines;
    }

    /**
     * Set 头部数据行
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeadLines 头部数据行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeadLines(String [] HeadLines) {
        this.HeadLines = HeadLines;
    }

    /**
     * Get 尾部数据行
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TailLines 尾部数据行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTailLines() {
        return this.TailLines;
    }

    /**
     * Set 尾部数据行
注意：此字段可能返回 null，表示取不到有效值。
     * @param TailLines 尾部数据行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTailLines(String [] TailLines) {
        this.TailLines = TailLines;
    }

    /**
     * Get 文件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 文件 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileId 文件 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 文件 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileId 文件 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    public TestData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TestData(TestData source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Split != null) {
            this.Split = new Boolean(source.Split);
        }
        if (source.HeaderInFile != null) {
            this.HeaderInFile = new Boolean(source.HeaderInFile);
        }
        if (source.HeaderColumns != null) {
            this.HeaderColumns = new String[source.HeaderColumns.length];
            for (int i = 0; i < source.HeaderColumns.length; i++) {
                this.HeaderColumns[i] = new String(source.HeaderColumns[i]);
            }
        }
        if (source.LineCount != null) {
            this.LineCount = new Long(source.LineCount);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.HeadLines != null) {
            this.HeadLines = new String[source.HeadLines.length];
            for (int i = 0; i < source.HeadLines.length; i++) {
                this.HeadLines[i] = new String(source.HeadLines[i]);
            }
        }
        if (source.TailLines != null) {
            this.TailLines = new String[source.TailLines.length];
            for (int i = 0; i < source.TailLines.length; i++) {
                this.TailLines[i] = new String(source.TailLines[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Split", this.Split);
        this.setParamSimple(map, prefix + "HeaderInFile", this.HeaderInFile);
        this.setParamArraySimple(map, prefix + "HeaderColumns.", this.HeaderColumns);
        this.setParamSimple(map, prefix + "LineCount", this.LineCount);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamArraySimple(map, prefix + "HeadLines.", this.HeadLines);
        this.setParamArraySimple(map, prefix + "TailLines.", this.TailLines);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

