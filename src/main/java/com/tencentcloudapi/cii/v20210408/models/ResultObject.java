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
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResultObject extends AbstractModel{

    /**
    * 图片质量分
    */
    @SerializedName("Quality")
    @Expose
    private Float Quality;

    /**
    * 由结构化算法结构化json转换的字符串，具体协议参见算法结构化结果协议
    */
    @SerializedName("StructureResult")
    @Expose
    private String StructureResult;

    /**
    * 报告分类信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportType")
    @Expose
    private ClassifyInfo [] ReportType;

    /**
     * Get 图片质量分 
     * @return Quality 图片质量分
     */
    public Float getQuality() {
        return this.Quality;
    }

    /**
     * Set 图片质量分
     * @param Quality 图片质量分
     */
    public void setQuality(Float Quality) {
        this.Quality = Quality;
    }

    /**
     * Get 由结构化算法结构化json转换的字符串，具体协议参见算法结构化结果协议 
     * @return StructureResult 由结构化算法结构化json转换的字符串，具体协议参见算法结构化结果协议
     */
    public String getStructureResult() {
        return this.StructureResult;
    }

    /**
     * Set 由结构化算法结构化json转换的字符串，具体协议参见算法结构化结果协议
     * @param StructureResult 由结构化算法结构化json转换的字符串，具体协议参见算法结构化结果协议
     */
    public void setStructureResult(String StructureResult) {
        this.StructureResult = StructureResult;
    }

    /**
     * Get 报告分类信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportType 报告分类信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClassifyInfo [] getReportType() {
        return this.ReportType;
    }

    /**
     * Set 报告分类信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportType 报告分类信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportType(ClassifyInfo [] ReportType) {
        this.ReportType = ReportType;
    }

    public ResultObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResultObject(ResultObject source) {
        if (source.Quality != null) {
            this.Quality = new Float(source.Quality);
        }
        if (source.StructureResult != null) {
            this.StructureResult = new String(source.StructureResult);
        }
        if (source.ReportType != null) {
            this.ReportType = new ClassifyInfo[source.ReportType.length];
            for (int i = 0; i < source.ReportType.length; i++) {
                this.ReportType[i] = new ClassifyInfo(source.ReportType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quality", this.Quality);
        this.setParamSimple(map, prefix + "StructureResult", this.StructureResult);
        this.setParamArrayObj(map, prefix + "ReportType.", this.ReportType);

    }
}

