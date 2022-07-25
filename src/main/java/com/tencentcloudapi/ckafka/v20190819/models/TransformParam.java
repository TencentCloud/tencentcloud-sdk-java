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

public class TransformParam extends AbstractModel{

    /**
    * 解析格式，JSON，DELIMITER分隔符，REGULAR正则提取
    */
    @SerializedName("AnalysisFormat")
    @Expose
    private String AnalysisFormat;

    /**
    * 输出格式
    */
    @SerializedName("OutputFormat")
    @Expose
    private String OutputFormat;

    /**
    * 是否保留解析失败数据
    */
    @SerializedName("FailureParam")
    @Expose
    private FailureParam FailureParam;

    /**
    * 原始数据
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 数据来源，TOPIC从源topic拉取，CUSTOMIZE自定义
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 分隔符、正则表达式
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
    * Map
    */
    @SerializedName("MapParam")
    @Expose
    private MapParam [] MapParam;

    /**
    * 过滤器
    */
    @SerializedName("FilterParam")
    @Expose
    private FilterMapParam [] FilterParam;

    /**
    * 测试结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 解析结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnalyseResult")
    @Expose
    private MapParam [] AnalyseResult;

    /**
    * 底层引擎是否使用eb
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseEventBus")
    @Expose
    private Boolean UseEventBus;

    /**
     * Get 解析格式，JSON，DELIMITER分隔符，REGULAR正则提取 
     * @return AnalysisFormat 解析格式，JSON，DELIMITER分隔符，REGULAR正则提取
     */
    public String getAnalysisFormat() {
        return this.AnalysisFormat;
    }

    /**
     * Set 解析格式，JSON，DELIMITER分隔符，REGULAR正则提取
     * @param AnalysisFormat 解析格式，JSON，DELIMITER分隔符，REGULAR正则提取
     */
    public void setAnalysisFormat(String AnalysisFormat) {
        this.AnalysisFormat = AnalysisFormat;
    }

    /**
     * Get 输出格式 
     * @return OutputFormat 输出格式
     */
    public String getOutputFormat() {
        return this.OutputFormat;
    }

    /**
     * Set 输出格式
     * @param OutputFormat 输出格式
     */
    public void setOutputFormat(String OutputFormat) {
        this.OutputFormat = OutputFormat;
    }

    /**
     * Get 是否保留解析失败数据 
     * @return FailureParam 是否保留解析失败数据
     */
    public FailureParam getFailureParam() {
        return this.FailureParam;
    }

    /**
     * Set 是否保留解析失败数据
     * @param FailureParam 是否保留解析失败数据
     */
    public void setFailureParam(FailureParam FailureParam) {
        this.FailureParam = FailureParam;
    }

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
     * Get 数据来源，TOPIC从源topic拉取，CUSTOMIZE自定义 
     * @return SourceType 数据来源，TOPIC从源topic拉取，CUSTOMIZE自定义
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 数据来源，TOPIC从源topic拉取，CUSTOMIZE自定义
     * @param SourceType 数据来源，TOPIC从源topic拉取，CUSTOMIZE自定义
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 分隔符、正则表达式 
     * @return Regex 分隔符、正则表达式
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set 分隔符、正则表达式
     * @param Regex 分隔符、正则表达式
     */
    public void setRegex(String Regex) {
        this.Regex = Regex;
    }

    /**
     * Get Map 
     * @return MapParam Map
     */
    public MapParam [] getMapParam() {
        return this.MapParam;
    }

    /**
     * Set Map
     * @param MapParam Map
     */
    public void setMapParam(MapParam [] MapParam) {
        this.MapParam = MapParam;
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
     * Get 解析结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnalyseResult 解析结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MapParam [] getAnalyseResult() {
        return this.AnalyseResult;
    }

    /**
     * Set 解析结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnalyseResult 解析结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnalyseResult(MapParam [] AnalyseResult) {
        this.AnalyseResult = AnalyseResult;
    }

    /**
     * Get 底层引擎是否使用eb
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UseEventBus 底层引擎是否使用eb
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUseEventBus() {
        return this.UseEventBus;
    }

    /**
     * Set 底层引擎是否使用eb
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseEventBus 底层引擎是否使用eb
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseEventBus(Boolean UseEventBus) {
        this.UseEventBus = UseEventBus;
    }

    public TransformParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransformParam(TransformParam source) {
        if (source.AnalysisFormat != null) {
            this.AnalysisFormat = new String(source.AnalysisFormat);
        }
        if (source.OutputFormat != null) {
            this.OutputFormat = new String(source.OutputFormat);
        }
        if (source.FailureParam != null) {
            this.FailureParam = new FailureParam(source.FailureParam);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.Regex != null) {
            this.Regex = new String(source.Regex);
        }
        if (source.MapParam != null) {
            this.MapParam = new MapParam[source.MapParam.length];
            for (int i = 0; i < source.MapParam.length; i++) {
                this.MapParam[i] = new MapParam(source.MapParam[i]);
            }
        }
        if (source.FilterParam != null) {
            this.FilterParam = new FilterMapParam[source.FilterParam.length];
            for (int i = 0; i < source.FilterParam.length; i++) {
                this.FilterParam[i] = new FilterMapParam(source.FilterParam[i]);
            }
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.AnalyseResult != null) {
            this.AnalyseResult = new MapParam[source.AnalyseResult.length];
            for (int i = 0; i < source.AnalyseResult.length; i++) {
                this.AnalyseResult[i] = new MapParam(source.AnalyseResult[i]);
            }
        }
        if (source.UseEventBus != null) {
            this.UseEventBus = new Boolean(source.UseEventBus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AnalysisFormat", this.AnalysisFormat);
        this.setParamSimple(map, prefix + "OutputFormat", this.OutputFormat);
        this.setParamObj(map, prefix + "FailureParam.", this.FailureParam);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "Regex", this.Regex);
        this.setParamArrayObj(map, prefix + "MapParam.", this.MapParam);
        this.setParamArrayObj(map, prefix + "FilterParam.", this.FilterParam);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamArrayObj(map, prefix + "AnalyseResult.", this.AnalyseResult);
        this.setParamSimple(map, prefix + "UseEventBus", this.UseEventBus);

    }
}

