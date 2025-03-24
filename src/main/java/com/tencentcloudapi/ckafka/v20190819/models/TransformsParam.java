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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TransformsParam extends AbstractModel {

    /**
    * 原始数据
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 处理链
    */
    @SerializedName("FieldChain")
    @Expose
    private FieldParam [] FieldChain;

    /**
    * 过滤器
    */
    @SerializedName("FilterParam")
    @Expose
    private FilterMapParam [] FilterParam;

    /**
    * 失败处理
    */
    @SerializedName("FailureParam")
    @Expose
    private FailureParam FailureParam;

    /**
    * 测试结果
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 数据来源
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 输出格式，JSON，ROW，默认为JSON
    */
    @SerializedName("OutputFormat")
    @Expose
    private String OutputFormat;

    /**
    * 输出格式为ROW必填
    */
    @SerializedName("RowParam")
    @Expose
    private RowParam RowParam;

    /**
    * 是否保留数据源Topic元数据信息（源Topic、Partition、Offset），默认为false
    */
    @SerializedName("KeepMetadata")
    @Expose
    private Boolean KeepMetadata;

    /**
    * 数组解析
    */
    @SerializedName("BatchAnalyse")
    @Expose
    private BatchAnalyseParam BatchAnalyse;

    /**
     * Get 原始数据 
     * @return Content 原始数据
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 原始数据
     * @param Content 原始数据
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 处理链 
     * @return FieldChain 处理链
     */
    public FieldParam [] getFieldChain() {
        return this.FieldChain;
    }

    /**
     * Set 处理链
     * @param FieldChain 处理链
     */
    public void setFieldChain(FieldParam [] FieldChain) {
        this.FieldChain = FieldChain;
    }

    /**
     * Get 过滤器 
     * @return FilterParam 过滤器
     */
    public FilterMapParam [] getFilterParam() {
        return this.FilterParam;
    }

    /**
     * Set 过滤器
     * @param FilterParam 过滤器
     */
    public void setFilterParam(FilterMapParam [] FilterParam) {
        this.FilterParam = FilterParam;
    }

    /**
     * Get 失败处理 
     * @return FailureParam 失败处理
     */
    public FailureParam getFailureParam() {
        return this.FailureParam;
    }

    /**
     * Set 失败处理
     * @param FailureParam 失败处理
     */
    public void setFailureParam(FailureParam FailureParam) {
        this.FailureParam = FailureParam;
    }

    /**
     * Get 测试结果 
     * @return Result 测试结果
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 测试结果
     * @param Result 测试结果
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 数据来源 
     * @return SourceType 数据来源
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 数据来源
     * @param SourceType 数据来源
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 输出格式，JSON，ROW，默认为JSON 
     * @return OutputFormat 输出格式，JSON，ROW，默认为JSON
     */
    public String getOutputFormat() {
        return this.OutputFormat;
    }

    /**
     * Set 输出格式，JSON，ROW，默认为JSON
     * @param OutputFormat 输出格式，JSON，ROW，默认为JSON
     */
    public void setOutputFormat(String OutputFormat) {
        this.OutputFormat = OutputFormat;
    }

    /**
     * Get 输出格式为ROW必填 
     * @return RowParam 输出格式为ROW必填
     */
    public RowParam getRowParam() {
        return this.RowParam;
    }

    /**
     * Set 输出格式为ROW必填
     * @param RowParam 输出格式为ROW必填
     */
    public void setRowParam(RowParam RowParam) {
        this.RowParam = RowParam;
    }

    /**
     * Get 是否保留数据源Topic元数据信息（源Topic、Partition、Offset），默认为false 
     * @return KeepMetadata 是否保留数据源Topic元数据信息（源Topic、Partition、Offset），默认为false
     */
    public Boolean getKeepMetadata() {
        return this.KeepMetadata;
    }

    /**
     * Set 是否保留数据源Topic元数据信息（源Topic、Partition、Offset），默认为false
     * @param KeepMetadata 是否保留数据源Topic元数据信息（源Topic、Partition、Offset），默认为false
     */
    public void setKeepMetadata(Boolean KeepMetadata) {
        this.KeepMetadata = KeepMetadata;
    }

    /**
     * Get 数组解析 
     * @return BatchAnalyse 数组解析
     */
    public BatchAnalyseParam getBatchAnalyse() {
        return this.BatchAnalyse;
    }

    /**
     * Set 数组解析
     * @param BatchAnalyse 数组解析
     */
    public void setBatchAnalyse(BatchAnalyseParam BatchAnalyse) {
        this.BatchAnalyse = BatchAnalyse;
    }

    public TransformsParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransformsParam(TransformsParam source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.FieldChain != null) {
            this.FieldChain = new FieldParam[source.FieldChain.length];
            for (int i = 0; i < source.FieldChain.length; i++) {
                this.FieldChain[i] = new FieldParam(source.FieldChain[i]);
            }
        }
        if (source.FilterParam != null) {
            this.FilterParam = new FilterMapParam[source.FilterParam.length];
            for (int i = 0; i < source.FilterParam.length; i++) {
                this.FilterParam[i] = new FilterMapParam(source.FilterParam[i]);
            }
        }
        if (source.FailureParam != null) {
            this.FailureParam = new FailureParam(source.FailureParam);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.OutputFormat != null) {
            this.OutputFormat = new String(source.OutputFormat);
        }
        if (source.RowParam != null) {
            this.RowParam = new RowParam(source.RowParam);
        }
        if (source.KeepMetadata != null) {
            this.KeepMetadata = new Boolean(source.KeepMetadata);
        }
        if (source.BatchAnalyse != null) {
            this.BatchAnalyse = new BatchAnalyseParam(source.BatchAnalyse);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArrayObj(map, prefix + "FieldChain.", this.FieldChain);
        this.setParamArrayObj(map, prefix + "FilterParam.", this.FilterParam);
        this.setParamObj(map, prefix + "FailureParam.", this.FailureParam);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "OutputFormat", this.OutputFormat);
        this.setParamObj(map, prefix + "RowParam.", this.RowParam);
        this.setParamSimple(map, prefix + "KeepMetadata", this.KeepMetadata);
        this.setParamObj(map, prefix + "BatchAnalyse.", this.BatchAnalyse);

    }
}

