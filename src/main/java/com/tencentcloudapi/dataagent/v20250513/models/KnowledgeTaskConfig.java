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
    * <p>切片类型  0:自定义切片，1：智能切片</p>
    */
    @SerializedName("ChunkType")
    @Expose
    private Long ChunkType;

    /**
    * <p>/智能切片：最小值 1000，默认 4800 自定义切片：正整数即可,默认值 1000</p>
    */
    @SerializedName("MaxChunkSize")
    @Expose
    private Long MaxChunkSize;

    /**
    * <p>切片分隔符,自定义切片使用：默认值为：[&quot;\n\n&quot;, &quot;\n&quot;, &quot;。&quot;, &quot;！&quot;, &quot;？&quot;, &quot;，&quot;, &quot;&quot;]</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Delimiters")
    @Expose
    private String [] Delimiters;

    /**
    * <p>自定义切片使用:默认0 可重叠字符长度</p>
    */
    @SerializedName("ChunkOverlap")
    @Expose
    private Long ChunkOverlap;

    /**
    * <p>表格类文档解析</p>
    */
    @SerializedName("Columns")
    @Expose
    private ColumnInfo [] Columns;

    /**
    * <p>带检索的索引列表</p>
    */
    @SerializedName("Indexes")
    @Expose
    private Long [] Indexes;

    /**
    * <p>0：不生成文档摘要，1：生成文档概要。默认0，当取1时，GenParaSummary必须也为1</p>
    */
    @SerializedName("GenDocSummary")
    @Expose
    private Long GenDocSummary;

    /**
    * <p>0：不生成段落摘要，1：生成段落概要。默认0</p>
    */
    @SerializedName("GenParaSummary")
    @Expose
    private Long GenParaSummary;

    /**
    * <p>0：不开启图片理解，1：开启图片理解。默认1</p><p>取值范围：[1, 10000]</p><p>默认值：1</p>
    */
    @SerializedName("EnableImageUnderstanding")
    @Expose
    private Long EnableImageUnderstanding;

    /**
     * Get <p>切片类型  0:自定义切片，1：智能切片</p> 
     * @return ChunkType <p>切片类型  0:自定义切片，1：智能切片</p>
     */
    public Long getChunkType() {
        return this.ChunkType;
    }

    /**
     * Set <p>切片类型  0:自定义切片，1：智能切片</p>
     * @param ChunkType <p>切片类型  0:自定义切片，1：智能切片</p>
     */
    public void setChunkType(Long ChunkType) {
        this.ChunkType = ChunkType;
    }

    /**
     * Get <p>/智能切片：最小值 1000，默认 4800 自定义切片：正整数即可,默认值 1000</p> 
     * @return MaxChunkSize <p>/智能切片：最小值 1000，默认 4800 自定义切片：正整数即可,默认值 1000</p>
     */
    public Long getMaxChunkSize() {
        return this.MaxChunkSize;
    }

    /**
     * Set <p>/智能切片：最小值 1000，默认 4800 自定义切片：正整数即可,默认值 1000</p>
     * @param MaxChunkSize <p>/智能切片：最小值 1000，默认 4800 自定义切片：正整数即可,默认值 1000</p>
     */
    public void setMaxChunkSize(Long MaxChunkSize) {
        this.MaxChunkSize = MaxChunkSize;
    }

    /**
     * Get <p>切片分隔符,自定义切片使用：默认值为：[&quot;\n\n&quot;, &quot;\n&quot;, &quot;。&quot;, &quot;！&quot;, &quot;？&quot;, &quot;，&quot;, &quot;&quot;]</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Delimiters <p>切片分隔符,自定义切片使用：默认值为：[&quot;\n\n&quot;, &quot;\n&quot;, &quot;。&quot;, &quot;！&quot;, &quot;？&quot;, &quot;，&quot;, &quot;&quot;]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDelimiters() {
        return this.Delimiters;
    }

    /**
     * Set <p>切片分隔符,自定义切片使用：默认值为：[&quot;\n\n&quot;, &quot;\n&quot;, &quot;。&quot;, &quot;！&quot;, &quot;？&quot;, &quot;，&quot;, &quot;&quot;]</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Delimiters <p>切片分隔符,自定义切片使用：默认值为：[&quot;\n\n&quot;, &quot;\n&quot;, &quot;。&quot;, &quot;！&quot;, &quot;？&quot;, &quot;，&quot;, &quot;&quot;]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelimiters(String [] Delimiters) {
        this.Delimiters = Delimiters;
    }

    /**
     * Get <p>自定义切片使用:默认0 可重叠字符长度</p> 
     * @return ChunkOverlap <p>自定义切片使用:默认0 可重叠字符长度</p>
     */
    public Long getChunkOverlap() {
        return this.ChunkOverlap;
    }

    /**
     * Set <p>自定义切片使用:默认0 可重叠字符长度</p>
     * @param ChunkOverlap <p>自定义切片使用:默认0 可重叠字符长度</p>
     */
    public void setChunkOverlap(Long ChunkOverlap) {
        this.ChunkOverlap = ChunkOverlap;
    }

    /**
     * Get <p>表格类文档解析</p> 
     * @return Columns <p>表格类文档解析</p>
     */
    public ColumnInfo [] getColumns() {
        return this.Columns;
    }

    /**
     * Set <p>表格类文档解析</p>
     * @param Columns <p>表格类文档解析</p>
     */
    public void setColumns(ColumnInfo [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get <p>带检索的索引列表</p> 
     * @return Indexes <p>带检索的索引列表</p>
     */
    public Long [] getIndexes() {
        return this.Indexes;
    }

    /**
     * Set <p>带检索的索引列表</p>
     * @param Indexes <p>带检索的索引列表</p>
     */
    public void setIndexes(Long [] Indexes) {
        this.Indexes = Indexes;
    }

    /**
     * Get <p>0：不生成文档摘要，1：生成文档概要。默认0，当取1时，GenParaSummary必须也为1</p> 
     * @return GenDocSummary <p>0：不生成文档摘要，1：生成文档概要。默认0，当取1时，GenParaSummary必须也为1</p>
     */
    public Long getGenDocSummary() {
        return this.GenDocSummary;
    }

    /**
     * Set <p>0：不生成文档摘要，1：生成文档概要。默认0，当取1时，GenParaSummary必须也为1</p>
     * @param GenDocSummary <p>0：不生成文档摘要，1：生成文档概要。默认0，当取1时，GenParaSummary必须也为1</p>
     */
    public void setGenDocSummary(Long GenDocSummary) {
        this.GenDocSummary = GenDocSummary;
    }

    /**
     * Get <p>0：不生成段落摘要，1：生成段落概要。默认0</p> 
     * @return GenParaSummary <p>0：不生成段落摘要，1：生成段落概要。默认0</p>
     */
    public Long getGenParaSummary() {
        return this.GenParaSummary;
    }

    /**
     * Set <p>0：不生成段落摘要，1：生成段落概要。默认0</p>
     * @param GenParaSummary <p>0：不生成段落摘要，1：生成段落概要。默认0</p>
     */
    public void setGenParaSummary(Long GenParaSummary) {
        this.GenParaSummary = GenParaSummary;
    }

    /**
     * Get <p>0：不开启图片理解，1：开启图片理解。默认1</p><p>取值范围：[1, 10000]</p><p>默认值：1</p> 
     * @return EnableImageUnderstanding <p>0：不开启图片理解，1：开启图片理解。默认1</p><p>取值范围：[1, 10000]</p><p>默认值：1</p>
     */
    public Long getEnableImageUnderstanding() {
        return this.EnableImageUnderstanding;
    }

    /**
     * Set <p>0：不开启图片理解，1：开启图片理解。默认1</p><p>取值范围：[1, 10000]</p><p>默认值：1</p>
     * @param EnableImageUnderstanding <p>0：不开启图片理解，1：开启图片理解。默认1</p><p>取值范围：[1, 10000]</p><p>默认值：1</p>
     */
    public void setEnableImageUnderstanding(Long EnableImageUnderstanding) {
        this.EnableImageUnderstanding = EnableImageUnderstanding;
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
        if (source.EnableImageUnderstanding != null) {
            this.EnableImageUnderstanding = new Long(source.EnableImageUnderstanding);
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
        this.setParamSimple(map, prefix + "EnableImageUnderstanding", this.EnableImageUnderstanding);

    }
}

