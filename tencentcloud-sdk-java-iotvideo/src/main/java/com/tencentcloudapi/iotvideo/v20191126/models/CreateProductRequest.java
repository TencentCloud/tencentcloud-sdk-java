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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProductRequest extends AbstractModel{

    /**
    * 产器型号(APP产品,为APP包名)
    */
    @SerializedName("ProductModel")
    @Expose
    private String ProductModel;

    /**
    * 设备功能码（ypsxth:音频双向通话 ，spdxth:视频单向通话）
    */
    @SerializedName("Features")
    @Expose
    private String [] Features;

    /**
    * 产品名称
仅支持中文、英文、数字、下划线，不超过32个字符
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 产品描述信息
不支持单引号、双引号、退格符、回车符、换行符、制表符、反斜杠、下划线、“%”、“#”、“$”，不超过128字符
    */
    @SerializedName("ProductDescription")
    @Expose
    private String ProductDescription;

    /**
    * 主芯片产商ID
    */
    @SerializedName("ChipManufactureId")
    @Expose
    private String ChipManufactureId;

    /**
    * 主芯片ID
    */
    @SerializedName("ChipId")
    @Expose
    private String ChipId;

    /**
     * Get 产器型号(APP产品,为APP包名) 
     * @return ProductModel 产器型号(APP产品,为APP包名)
     */
    public String getProductModel() {
        return this.ProductModel;
    }

    /**
     * Set 产器型号(APP产品,为APP包名)
     * @param ProductModel 产器型号(APP产品,为APP包名)
     */
    public void setProductModel(String ProductModel) {
        this.ProductModel = ProductModel;
    }

    /**
     * Get 设备功能码（ypsxth:音频双向通话 ，spdxth:视频单向通话） 
     * @return Features 设备功能码（ypsxth:音频双向通话 ，spdxth:视频单向通话）
     */
    public String [] getFeatures() {
        return this.Features;
    }

    /**
     * Set 设备功能码（ypsxth:音频双向通话 ，spdxth:视频单向通话）
     * @param Features 设备功能码（ypsxth:音频双向通话 ，spdxth:视频单向通话）
     */
    public void setFeatures(String [] Features) {
        this.Features = Features;
    }

    /**
     * Get 产品名称
仅支持中文、英文、数字、下划线，不超过32个字符 
     * @return ProductName 产品名称
仅支持中文、英文、数字、下划线，不超过32个字符
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
仅支持中文、英文、数字、下划线，不超过32个字符
     * @param ProductName 产品名称
仅支持中文、英文、数字、下划线，不超过32个字符
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 产品描述信息
不支持单引号、双引号、退格符、回车符、换行符、制表符、反斜杠、下划线、“%”、“#”、“$”，不超过128字符 
     * @return ProductDescription 产品描述信息
不支持单引号、双引号、退格符、回车符、换行符、制表符、反斜杠、下划线、“%”、“#”、“$”，不超过128字符
     */
    public String getProductDescription() {
        return this.ProductDescription;
    }

    /**
     * Set 产品描述信息
不支持单引号、双引号、退格符、回车符、换行符、制表符、反斜杠、下划线、“%”、“#”、“$”，不超过128字符
     * @param ProductDescription 产品描述信息
不支持单引号、双引号、退格符、回车符、换行符、制表符、反斜杠、下划线、“%”、“#”、“$”，不超过128字符
     */
    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    /**
     * Get 主芯片产商ID 
     * @return ChipManufactureId 主芯片产商ID
     */
    public String getChipManufactureId() {
        return this.ChipManufactureId;
    }

    /**
     * Set 主芯片产商ID
     * @param ChipManufactureId 主芯片产商ID
     */
    public void setChipManufactureId(String ChipManufactureId) {
        this.ChipManufactureId = ChipManufactureId;
    }

    /**
     * Get 主芯片ID 
     * @return ChipId 主芯片ID
     */
    public String getChipId() {
        return this.ChipId;
    }

    /**
     * Set 主芯片ID
     * @param ChipId 主芯片ID
     */
    public void setChipId(String ChipId) {
        this.ChipId = ChipId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductModel", this.ProductModel);
        this.setParamArraySimple(map, prefix + "Features.", this.Features);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProductDescription", this.ProductDescription);
        this.setParamSimple(map, prefix + "ChipManufactureId", this.ChipManufactureId);
        this.setParamSimple(map, prefix + "ChipId", this.ChipId);

    }
}

