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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TransformsParam extends AbstractModel{

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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterParam")
    @Expose
    private FilterMapParam [] FilterParam;

    /**
    * 失败处理
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailureParam")
    @Expose
    private FailureParam FailureParam;

    /**
    * 测试结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 数据来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 输出格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputFormat")
    @Expose
    private String OutputFormat;

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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterParam 过滤器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterMapParam [] getFilterParam() {
        return this.FilterParam;
    }

    /**
     * Set 过滤器
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterParam 过滤器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterParam(FilterMapParam [] FilterParam) {
        this.FilterParam = FilterParam;
    }

    /**
     * Get 失败处理
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailureParam 失败处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FailureParam getFailureParam() {
        return this.FailureParam;
    }

    /**
     * Set 失败处理
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailureParam 失败处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailureParam(FailureParam FailureParam) {
        this.FailureParam = FailureParam;
    }

    /**
     * Get 测试结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 测试结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 测试结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 测试结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 数据来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceType 数据来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 数据来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceType 数据来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 输出格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputFormat 输出格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputFormat() {
        return this.OutputFormat;
    }

    /**
     * Set 输出格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputFormat 输出格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputFormat(String OutputFormat) {
        this.OutputFormat = OutputFormat;
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

    }
}

