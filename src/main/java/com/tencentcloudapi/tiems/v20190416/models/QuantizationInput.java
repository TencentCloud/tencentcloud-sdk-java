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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuantizationInput extends AbstractModel {

    /**
    * 量化输入路径
    */
    @SerializedName("InputPath")
    @Expose
    private String InputPath;

    /**
    * 量化输出路径
    */
    @SerializedName("OutputPath")
    @Expose
    private String OutputPath;

    /**
    * 量化批大小
    */
    @SerializedName("BatchSize")
    @Expose
    private Long BatchSize;

    /**
    * 量化精度，支持：FP32，FP16，INT8
    */
    @SerializedName("Precision")
    @Expose
    private String Precision;

    /**
    * 转换类型
    */
    @SerializedName("ConvertType")
    @Expose
    private String ConvertType;

    /**
     * Get 量化输入路径 
     * @return InputPath 量化输入路径
     */
    public String getInputPath() {
        return this.InputPath;
    }

    /**
     * Set 量化输入路径
     * @param InputPath 量化输入路径
     */
    public void setInputPath(String InputPath) {
        this.InputPath = InputPath;
    }

    /**
     * Get 量化输出路径 
     * @return OutputPath 量化输出路径
     */
    public String getOutputPath() {
        return this.OutputPath;
    }

    /**
     * Set 量化输出路径
     * @param OutputPath 量化输出路径
     */
    public void setOutputPath(String OutputPath) {
        this.OutputPath = OutputPath;
    }

    /**
     * Get 量化批大小 
     * @return BatchSize 量化批大小
     */
    public Long getBatchSize() {
        return this.BatchSize;
    }

    /**
     * Set 量化批大小
     * @param BatchSize 量化批大小
     */
    public void setBatchSize(Long BatchSize) {
        this.BatchSize = BatchSize;
    }

    /**
     * Get 量化精度，支持：FP32，FP16，INT8 
     * @return Precision 量化精度，支持：FP32，FP16，INT8
     */
    public String getPrecision() {
        return this.Precision;
    }

    /**
     * Set 量化精度，支持：FP32，FP16，INT8
     * @param Precision 量化精度，支持：FP32，FP16，INT8
     */
    public void setPrecision(String Precision) {
        this.Precision = Precision;
    }

    /**
     * Get 转换类型 
     * @return ConvertType 转换类型
     */
    public String getConvertType() {
        return this.ConvertType;
    }

    /**
     * Set 转换类型
     * @param ConvertType 转换类型
     */
    public void setConvertType(String ConvertType) {
        this.ConvertType = ConvertType;
    }

    public QuantizationInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuantizationInput(QuantizationInput source) {
        if (source.InputPath != null) {
            this.InputPath = new String(source.InputPath);
        }
        if (source.OutputPath != null) {
            this.OutputPath = new String(source.OutputPath);
        }
        if (source.BatchSize != null) {
            this.BatchSize = new Long(source.BatchSize);
        }
        if (source.Precision != null) {
            this.Precision = new String(source.Precision);
        }
        if (source.ConvertType != null) {
            this.ConvertType = new String(source.ConvertType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputPath", this.InputPath);
        this.setParamSimple(map, prefix + "OutputPath", this.OutputPath);
        this.setParamSimple(map, prefix + "BatchSize", this.BatchSize);
        this.setParamSimple(map, prefix + "Precision", this.Precision);
        this.setParamSimple(map, prefix + "ConvertType", this.ConvertType);

    }
}

