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

public class KnowledgeTaskConfig extends AbstractModel {

    /**
    * 切片类型  0:自定义切片，1：智能切片
    */
    @SerializedName("ChunkType")
    @Expose
    private Long ChunkType;

    /**
    * /智能切片：最小值 1000，默认 4800 自定义切片：正整数即可,默认值 1000
    */
    @SerializedName("MaxChunkSize")
    @Expose
    private Long MaxChunkSize;

    /**
    *  切片分隔符,自定义切片使用：默认值为：["\n\n", "\n", "。", "！", "？", "，", ""]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Delimiters")
    @Expose
    private String [] Delimiters;

    /**
    * 自定义切片使用:默认0 可重叠字符长度
    */
    @SerializedName("ChunkOverlap")
    @Expose
    private Long ChunkOverlap;

    /**
    * 表格类文档解析
    */
    @SerializedName("Columns")
    @Expose
    private ColumnInfo [] Columns;

    /**
    * 带检索的索引列表
    */
    @SerializedName("Indexes")
    @Expose
    private Long [] Indexes;

    /**
    * 0：不生成文档摘要，1：生成文档概要。默认0，当取1时，GenParaSummary必须也为1
    */
    @SerializedName("GenDocSummary")
    @Expose
    private Long GenDocSummary;

    /**
    * 0：不生成段落摘要，1：生成段落概要。默认0
    */
    @SerializedName("GenParaSummary")
    @Expose
    private Long GenParaSummary;

    /**
     * Get 切片类型  0:自定义切片，1：智能切片 
     * @return ChunkType 切片类型  0:自定义切片，1：智能切片
     */
    public Long getChunkType() {
        return this.ChunkType;
    }

    /**
     * Set 切片类型  0:自定义切片，1：智能切片
     * @param ChunkType 切片类型  0:自定义切片，1：智能切片
     */
    public void setChunkType(Long ChunkType) {
        this.ChunkType = ChunkType;
    }

    /**
     * Get /智能切片：最小值 1000，默认 4800 自定义切片：正整数即可,默认值 1000 
     * @return MaxChunkSize /智能切片：最小值 1000，默认 4800 自定义切片：正整数即可,默认值 1000
     */
    public Long getMaxChunkSize() {
        return this.MaxChunkSize;
    }

    /**
     * Set /智能切片：最小值 1000，默认 4800 自定义切片：正整数即可,默认值 1000
     * @param MaxChunkSize /智能切片：最小值 1000，默认 4800 自定义切片：正整数即可,默认值 1000
     */
    public void setMaxChunkSize(Long MaxChunkSize) {
        this.MaxChunkSize = MaxChunkSize;
    }

    /**
     * Get  切片分隔符,自定义切片使用：默认值为：["\n\n", "\n", "。", "！", "？", "，", ""]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Delimiters  切片分隔符,自定义切片使用：默认值为：["\n\n", "\n", "。", "！", "？", "，", ""]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDelimiters() {
        return this.Delimiters;
    }

    /**
     * Set  切片分隔符,自定义切片使用：默认值为：["\n\n", "\n", "。", "！", "？", "，", ""]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Delimiters  切片分隔符,自定义切片使用：默认值为：["\n\n", "\n", "。", "！", "？", "，", ""]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelimiters(String [] Delimiters) {
        this.Delimiters = Delimiters;
    }

    /**
     * Get 自定义切片使用:默认0 可重叠字符长度 
     * @return ChunkOverlap 自定义切片使用:默认0 可重叠字符长度
     */
    public Long getChunkOverlap() {
        return this.ChunkOverlap;
    }

    /**
     * Set 自定义切片使用:默认0 可重叠字符长度
     * @param ChunkOverlap 自定义切片使用:默认0 可重叠字符长度
     */
    public void setChunkOverlap(Long ChunkOverlap) {
        this.ChunkOverlap = ChunkOverlap;
    }

    /**
     * Get 表格类文档解析 
     * @return Columns 表格类文档解析
     */
    public ColumnInfo [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 表格类文档解析
     * @param Columns 表格类文档解析
     */
    public void setColumns(ColumnInfo [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get 带检索的索引列表 
     * @return Indexes 带检索的索引列表
     */
    public Long [] getIndexes() {
        return this.Indexes;
    }

    /**
     * Set 带检索的索引列表
     * @param Indexes 带检索的索引列表
     */
    public void setIndexes(Long [] Indexes) {
        this.Indexes = Indexes;
    }

    /**
     * Get 0：不生成文档摘要，1：生成文档概要。默认0，当取1时，GenParaSummary必须也为1 
     * @return GenDocSummary 0：不生成文档摘要，1：生成文档概要。默认0，当取1时，GenParaSummary必须也为1
     */
    public Long getGenDocSummary() {
        return this.GenDocSummary;
    }

    /**
     * Set 0：不生成文档摘要，1：生成文档概要。默认0，当取1时，GenParaSummary必须也为1
     * @param GenDocSummary 0：不生成文档摘要，1：生成文档概要。默认0，当取1时，GenParaSummary必须也为1
     */
    public void setGenDocSummary(Long GenDocSummary) {
        this.GenDocSummary = GenDocSummary;
    }

    /**
     * Get 0：不生成段落摘要，1：生成段落概要。默认0 
     * @return GenParaSummary 0：不生成段落摘要，1：生成段落概要。默认0
     */
    public Long getGenParaSummary() {
        return this.GenParaSummary;
    }

    /**
     * Set 0：不生成段落摘要，1：生成段落概要。默认0
     * @param GenParaSummary 0：不生成段落摘要，1：生成段落概要。默认0
     */
    public void setGenParaSummary(Long GenParaSummary) {
        this.GenParaSummary = GenParaSummary;
    }

    public KnowledgeTaskConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeTaskConfig(KnowledgeTaskConfig source) {
        if (source.ChunkType != null) {
            this.ChunkType = new Long(source.ChunkType);
        }
        if (source.MaxChunkSize != null) {
            this.MaxChunkSize = new Long(source.MaxChunkSize);
        }
        if (source.Delimiters != null) {
            this.Delimiters = new String[source.Delimiters.length];
            for (int i = 0; i < source.Delimiters.length; i++) {
                this.Delimiters[i] = new String(source.Delimiters[i]);
            }
        }
        if (source.ChunkOverlap != null) {
            this.ChunkOverlap = new Long(source.ChunkOverlap);
        }
        if (source.Columns != null) {
            this.Columns = new ColumnInfo[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new ColumnInfo(source.Columns[i]);
            }
        }
        if (source.Indexes != null) {
            this.Indexes = new Long[source.Indexes.length];
            for (int i = 0; i < source.Indexes.length; i++) {
                this.Indexes[i] = new Long(source.Indexes[i]);
            }
        }
        if (source.GenDocSummary != null) {
            this.GenDocSummary = new Long(source.GenDocSummary);
        }
        if (source.GenParaSummary != null) {
            this.GenParaSummary = new Long(source.GenParaSummary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChunkType", this.ChunkType);
        this.setParamSimple(map, prefix + "MaxChunkSize", this.MaxChunkSize);
        this.setParamArraySimple(map, prefix + "Delimiters.", this.Delimiters);
        this.setParamSimple(map, prefix + "ChunkOverlap", this.ChunkOverlap);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamArraySimple(map, prefix + "Indexes.", this.Indexes);
        this.setParamSimple(map, prefix + "GenDocSummary", this.GenDocSummary);
        this.setParamSimple(map, prefix + "GenParaSummary", this.GenParaSummary);

    }
}

