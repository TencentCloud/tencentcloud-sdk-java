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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConflictQA extends AbstractModel {

    /**
    * <p>答案</p>
    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * <p>知识生效作用域：1=停用，2=仅开发域，3=仅发布域，4=全域<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>停用</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>仅开发域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>仅发布域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>全域</td></tr></tbody></table></p>
    */
    @SerializedName("EffectiveDomain")
    @Expose
    private Long EffectiveDomain;

    /**
    * <p>关联文档名称</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>关联文档类型</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>QA ID</p>
    */
    @SerializedName("QaId")
    @Expose
    private String QaId;

    /**
    * <p>问题</p>
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * <p>来源类型：1=文档生成，2=批量导入，3=手动录入<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>QA_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>QA_SOURCE_TYPE_DOC</td><td>1</td><td>文档生成</td></tr><tr><td>QA_SOURCE_TYPE_BATCH_IMPORT</td><td>2</td><td>批量导入</td></tr><tr><td>QA_SOURCE_TYPE_MANUAL</td><td>3</td><td>手动录入</td></tr></tbody></table></p>
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * <p>更新时间（Unix 秒，用于排序判断新旧）</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>答案</p> 
     * @return Answer <p>答案</p>
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set <p>答案</p>
     * @param Answer <p>答案</p>
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * Get <p>知识生效作用域：1=停用，2=仅开发域，3=仅发布域，4=全域<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>停用</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>仅开发域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>仅发布域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>全域</td></tr></tbody></table></p> 
     * @return EffectiveDomain <p>知识生效作用域：1=停用，2=仅开发域，3=仅发布域，4=全域<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>停用</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>仅开发域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>仅发布域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>全域</td></tr></tbody></table></p>
     */
    public Long getEffectiveDomain() {
        return this.EffectiveDomain;
    }

    /**
     * Set <p>知识生效作用域：1=停用，2=仅开发域，3=仅发布域，4=全域<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>停用</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>仅开发域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>仅发布域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>全域</td></tr></tbody></table></p>
     * @param EffectiveDomain <p>知识生效作用域：1=停用，2=仅开发域，3=仅发布域，4=全域<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>停用</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>仅开发域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>仅发布域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>全域</td></tr></tbody></table></p>
     */
    public void setEffectiveDomain(Long EffectiveDomain) {
        this.EffectiveDomain = EffectiveDomain;
    }

    /**
     * Get <p>关联文档名称</p> 
     * @return FileName <p>关联文档名称</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>关联文档名称</p>
     * @param FileName <p>关联文档名称</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>关联文档类型</p> 
     * @return FileType <p>关联文档类型</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>关联文档类型</p>
     * @param FileType <p>关联文档类型</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>QA ID</p> 
     * @return QaId <p>QA ID</p>
     */
    public String getQaId() {
        return this.QaId;
    }

    /**
     * Set <p>QA ID</p>
     * @param QaId <p>QA ID</p>
     */
    public void setQaId(String QaId) {
        this.QaId = QaId;
    }

    /**
     * Get <p>问题</p> 
     * @return Question <p>问题</p>
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set <p>问题</p>
     * @param Question <p>问题</p>
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get <p>来源类型：1=文档生成，2=批量导入，3=手动录入<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>QA_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>QA_SOURCE_TYPE_DOC</td><td>1</td><td>文档生成</td></tr><tr><td>QA_SOURCE_TYPE_BATCH_IMPORT</td><td>2</td><td>批量导入</td></tr><tr><td>QA_SOURCE_TYPE_MANUAL</td><td>3</td><td>手动录入</td></tr></tbody></table></p> 
     * @return SourceType <p>来源类型：1=文档生成，2=批量导入，3=手动录入<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>QA_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>QA_SOURCE_TYPE_DOC</td><td>1</td><td>文档生成</td></tr><tr><td>QA_SOURCE_TYPE_BATCH_IMPORT</td><td>2</td><td>批量导入</td></tr><tr><td>QA_SOURCE_TYPE_MANUAL</td><td>3</td><td>手动录入</td></tr></tbody></table></p>
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>来源类型：1=文档生成，2=批量导入，3=手动录入<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>QA_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>QA_SOURCE_TYPE_DOC</td><td>1</td><td>文档生成</td></tr><tr><td>QA_SOURCE_TYPE_BATCH_IMPORT</td><td>2</td><td>批量导入</td></tr><tr><td>QA_SOURCE_TYPE_MANUAL</td><td>3</td><td>手动录入</td></tr></tbody></table></p>
     * @param SourceType <p>来源类型：1=文档生成，2=批量导入，3=手动录入<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>QA_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>QA_SOURCE_TYPE_DOC</td><td>1</td><td>文档生成</td></tr><tr><td>QA_SOURCE_TYPE_BATCH_IMPORT</td><td>2</td><td>批量导入</td></tr><tr><td>QA_SOURCE_TYPE_MANUAL</td><td>3</td><td>手动录入</td></tr></tbody></table></p>
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>更新时间（Unix 秒，用于排序判断新旧）</p> 
     * @return UpdateTime <p>更新时间（Unix 秒，用于排序判断新旧）</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间（Unix 秒，用于排序判断新旧）</p>
     * @param UpdateTime <p>更新时间（Unix 秒，用于排序判断新旧）</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ConflictQA() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConflictQA(ConflictQA source) {
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.EffectiveDomain != null) {
            this.EffectiveDomain = new Long(source.EffectiveDomain);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.QaId != null) {
            this.QaId = new String(source.QaId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "EffectiveDomain", this.EffectiveDomain);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "QaId", this.QaId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

