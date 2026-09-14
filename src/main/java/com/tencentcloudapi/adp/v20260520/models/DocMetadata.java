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

public class DocMetadata extends AbstractModel {

    /**
    * <p>文档字符数</p>
    */
    @SerializedName("DocCharCount")
    @Expose
    private String DocCharCount;

    /**
    * <p>文件名</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>文件大小（字节）</p>
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * <p>文件类型/扩展名</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>元数据引用字段名列表（用于显示文档哪些分类和属性被设置为元数据）</p>
    */
    @SerializedName("RefFieldNameList")
    @Expose
    private String [] RefFieldNameList;

    /**
    * <p>来源描述</p>
    */
    @SerializedName("SourceDesc")
    @Expose
    private String SourceDesc;

    /**
    * <p>文档来源类型：1=本地上传，2=网页链接，3=COS 对接，4=外部导入<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DOC_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>DOC_SOURCE_TYPE_LOCAL</td><td>1</td><td>本地上传</td></tr><tr><td>DOC_SOURCE_TYPE_URL</td><td>2</td><td>网页链接</td></tr><tr><td>DOC_SOURCE_TYPE_COS</td><td>3</td><td>COS 对接</td></tr><tr><td>DOC_SOURCE_TYPE_IMPORT</td><td>4</td><td>外部导入</td></tr></tbody></table></p>
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
     * Get <p>文档字符数</p> 
     * @return DocCharCount <p>文档字符数</p>
     */
    public String getDocCharCount() {
        return this.DocCharCount;
    }

    /**
     * Set <p>文档字符数</p>
     * @param DocCharCount <p>文档字符数</p>
     */
    public void setDocCharCount(String DocCharCount) {
        this.DocCharCount = DocCharCount;
    }

    /**
     * Get <p>文件名</p> 
     * @return FileName <p>文件名</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名</p>
     * @param FileName <p>文件名</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>文件大小（字节）</p> 
     * @return FileSize <p>文件大小（字节）</p>
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>文件大小（字节）</p>
     * @param FileSize <p>文件大小（字节）</p>
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>文件类型/扩展名</p> 
     * @return FileType <p>文件类型/扩展名</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>文件类型/扩展名</p>
     * @param FileType <p>文件类型/扩展名</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>元数据引用字段名列表（用于显示文档哪些分类和属性被设置为元数据）</p> 
     * @return RefFieldNameList <p>元数据引用字段名列表（用于显示文档哪些分类和属性被设置为元数据）</p>
     */
    public String [] getRefFieldNameList() {
        return this.RefFieldNameList;
    }

    /**
     * Set <p>元数据引用字段名列表（用于显示文档哪些分类和属性被设置为元数据）</p>
     * @param RefFieldNameList <p>元数据引用字段名列表（用于显示文档哪些分类和属性被设置为元数据）</p>
     */
    public void setRefFieldNameList(String [] RefFieldNameList) {
        this.RefFieldNameList = RefFieldNameList;
    }

    /**
     * Get <p>来源描述</p> 
     * @return SourceDesc <p>来源描述</p>
     */
    public String getSourceDesc() {
        return this.SourceDesc;
    }

    /**
     * Set <p>来源描述</p>
     * @param SourceDesc <p>来源描述</p>
     */
    public void setSourceDesc(String SourceDesc) {
        this.SourceDesc = SourceDesc;
    }

    /**
     * Get <p>文档来源类型：1=本地上传，2=网页链接，3=COS 对接，4=外部导入<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DOC_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>DOC_SOURCE_TYPE_LOCAL</td><td>1</td><td>本地上传</td></tr><tr><td>DOC_SOURCE_TYPE_URL</td><td>2</td><td>网页链接</td></tr><tr><td>DOC_SOURCE_TYPE_COS</td><td>3</td><td>COS 对接</td></tr><tr><td>DOC_SOURCE_TYPE_IMPORT</td><td>4</td><td>外部导入</td></tr></tbody></table></p> 
     * @return SourceType <p>文档来源类型：1=本地上传，2=网页链接，3=COS 对接，4=外部导入<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DOC_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>DOC_SOURCE_TYPE_LOCAL</td><td>1</td><td>本地上传</td></tr><tr><td>DOC_SOURCE_TYPE_URL</td><td>2</td><td>网页链接</td></tr><tr><td>DOC_SOURCE_TYPE_COS</td><td>3</td><td>COS 对接</td></tr><tr><td>DOC_SOURCE_TYPE_IMPORT</td><td>4</td><td>外部导入</td></tr></tbody></table></p>
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>文档来源类型：1=本地上传，2=网页链接，3=COS 对接，4=外部导入<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DOC_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>DOC_SOURCE_TYPE_LOCAL</td><td>1</td><td>本地上传</td></tr><tr><td>DOC_SOURCE_TYPE_URL</td><td>2</td><td>网页链接</td></tr><tr><td>DOC_SOURCE_TYPE_COS</td><td>3</td><td>COS 对接</td></tr><tr><td>DOC_SOURCE_TYPE_IMPORT</td><td>4</td><td>外部导入</td></tr></tbody></table></p>
     * @param SourceType <p>文档来源类型：1=本地上传，2=网页链接，3=COS 对接，4=外部导入<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DOC_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>DOC_SOURCE_TYPE_LOCAL</td><td>1</td><td>本地上传</td></tr><tr><td>DOC_SOURCE_TYPE_URL</td><td>2</td><td>网页链接</td></tr><tr><td>DOC_SOURCE_TYPE_COS</td><td>3</td><td>COS 对接</td></tr><tr><td>DOC_SOURCE_TYPE_IMPORT</td><td>4</td><td>外部导入</td></tr></tbody></table></p>
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    public DocMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocMetadata(DocMetadata source) {
        if (source.DocCharCount != null) {
            this.DocCharCount = new String(source.DocCharCount);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new String(source.FileSize);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.RefFieldNameList != null) {
            this.RefFieldNameList = new String[source.RefFieldNameList.length];
            for (int i = 0; i < source.RefFieldNameList.length; i++) {
                this.RefFieldNameList[i] = new String(source.RefFieldNameList[i]);
            }
        }
        if (source.SourceDesc != null) {
            this.SourceDesc = new String(source.SourceDesc);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocCharCount", this.DocCharCount);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamArraySimple(map, prefix + "RefFieldNameList.", this.RefFieldNameList);
        this.setParamSimple(map, prefix + "SourceDesc", this.SourceDesc);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);

    }
}

