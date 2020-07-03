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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PredictInput extends AbstractModel{

    /**
    * 输入路径，支持 cos 格式路径文件夹或文件
    */
    @SerializedName("InputPath")
    @Expose
    private String InputPath;

    /**
    * 输出路径，支持 cos 格式路径
    */
    @SerializedName("OutputPath")
    @Expose
    private String OutputPath;

    /**
    * 输入数据格式，目前支持：JSON
    */
    @SerializedName("InputDataFormat")
    @Expose
    private String InputDataFormat;

    /**
    * 输出数据格式，目前支持：JSON
    */
    @SerializedName("OutputDataFormat")
    @Expose
    private String OutputDataFormat;

    /**
    * 预测批大小，默认为 64
    */
    @SerializedName("BatchSize")
    @Expose
    private Long BatchSize;

    /**
    * 模型签名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SignatureName")
    @Expose
    private String SignatureName;

    /**
     * Get 输入路径，支持 cos 格式路径文件夹或文件 
     * @return InputPath 输入路径，支持 cos 格式路径文件夹或文件
     */
    public String getInputPath() {
        return this.InputPath;
    }

    /**
     * Set 输入路径，支持 cos 格式路径文件夹或文件
     * @param InputPath 输入路径，支持 cos 格式路径文件夹或文件
     */
    public void setInputPath(String InputPath) {
        this.InputPath = InputPath;
    }

    /**
     * Get 输出路径，支持 cos 格式路径 
     * @return OutputPath 输出路径，支持 cos 格式路径
     */
    public String getOutputPath() {
        return this.OutputPath;
    }

    /**
     * Set 输出路径，支持 cos 格式路径
     * @param OutputPath 输出路径，支持 cos 格式路径
     */
    public void setOutputPath(String OutputPath) {
        this.OutputPath = OutputPath;
    }

    /**
     * Get 输入数据格式，目前支持：JSON 
     * @return InputDataFormat 输入数据格式，目前支持：JSON
     */
    public String getInputDataFormat() {
        return this.InputDataFormat;
    }

    /**
     * Set 输入数据格式，目前支持：JSON
     * @param InputDataFormat 输入数据格式，目前支持：JSON
     */
    public void setInputDataFormat(String InputDataFormat) {
        this.InputDataFormat = InputDataFormat;
    }

    /**
     * Get 输出数据格式，目前支持：JSON 
     * @return OutputDataFormat 输出数据格式，目前支持：JSON
     */
    public String getOutputDataFormat() {
        return this.OutputDataFormat;
    }

    /**
     * Set 输出数据格式，目前支持：JSON
     * @param OutputDataFormat 输出数据格式，目前支持：JSON
     */
    public void setOutputDataFormat(String OutputDataFormat) {
        this.OutputDataFormat = OutputDataFormat;
    }

    /**
     * Get 预测批大小，默认为 64 
     * @return BatchSize 预测批大小，默认为 64
     */
    public Long getBatchSize() {
        return this.BatchSize;
    }

    /**
     * Set 预测批大小，默认为 64
     * @param BatchSize 预测批大小，默认为 64
     */
    public void setBatchSize(Long BatchSize) {
        this.BatchSize = BatchSize;
    }

    /**
     * Get 模型签名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SignatureName 模型签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSignatureName() {
        return this.SignatureName;
    }

    /**
     * Set 模型签名
注意：此字段可能返回 null，表示取不到有效值。
     * @param SignatureName 模型签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSignatureName(String SignatureName) {
        this.SignatureName = SignatureName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputPath", this.InputPath);
        this.setParamSimple(map, prefix + "OutputPath", this.OutputPath);
        this.setParamSimple(map, prefix + "InputDataFormat", this.InputDataFormat);
        this.setParamSimple(map, prefix + "OutputDataFormat", this.OutputDataFormat);
        this.setParamSimple(map, prefix + "BatchSize", this.BatchSize);
        this.setParamSimple(map, prefix + "SignatureName", this.SignatureName);

    }
}

