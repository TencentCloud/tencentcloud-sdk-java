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
    * 设备功能码（ypsxth:音频双向通话 ，spdxth:视频单向通话）
    */
    @SerializedName("Features")
    @Expose
    private String [] Features;

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
    * 地域：
China-Mainland（中国大陆）
China-Hong Kong, Macao and Taiwan（港澳台地区）
America（美国）
Europe（欧洲）
India（印度）
Other-Overseas（其他境外地区）
    */
    @SerializedName("ProductRegion")
    @Expose
    private String ProductRegion;

    /**
    * 设备类型, 0-普通视频设备，1-NVR设备
    */
    @SerializedName("ProductCate")
    @Expose
    private Long ProductCate;

    /**
    * 接入模型，bit0是0：公版小程序未接入，bit0是1：公版小程序已接入
    */
    @SerializedName("AccessMode")
    @Expose
    private Long AccessMode;

    /**
    * Linux,Android,Liteos等系统
    */
    @SerializedName("Os")
    @Expose
    private String Os;

    /**
    * 芯片架构，只是针对操作系统为android的
    */
    @SerializedName("ChipArch")
    @Expose
    private String ChipArch;

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
     * Get 地域：
China-Mainland（中国大陆）
China-Hong Kong, Macao and Taiwan（港澳台地区）
America（美国）
Europe（欧洲）
India（印度）
Other-Overseas（其他境外地区） 
     * @return ProductRegion 地域：
China-Mainland（中国大陆）
China-Hong Kong, Macao and Taiwan（港澳台地区）
America（美国）
Europe（欧洲）
India（印度）
Other-Overseas（其他境外地区）
     */
    public String getProductRegion() {
        return this.ProductRegion;
    }

    /**
     * Set 地域：
China-Mainland（中国大陆）
China-Hong Kong, Macao and Taiwan（港澳台地区）
America（美国）
Europe（欧洲）
India（印度）
Other-Overseas（其他境外地区）
     * @param ProductRegion 地域：
China-Mainland（中国大陆）
China-Hong Kong, Macao and Taiwan（港澳台地区）
America（美国）
Europe（欧洲）
India（印度）
Other-Overseas（其他境外地区）
     */
    public void setProductRegion(String ProductRegion) {
        this.ProductRegion = ProductRegion;
    }

    /**
     * Get 设备类型, 0-普通视频设备，1-NVR设备 
     * @return ProductCate 设备类型, 0-普通视频设备，1-NVR设备
     */
    public Long getProductCate() {
        return this.ProductCate;
    }

    /**
     * Set 设备类型, 0-普通视频设备，1-NVR设备
     * @param ProductCate 设备类型, 0-普通视频设备，1-NVR设备
     */
    public void setProductCate(Long ProductCate) {
        this.ProductCate = ProductCate;
    }

    /**
     * Get 接入模型，bit0是0：公版小程序未接入，bit0是1：公版小程序已接入 
     * @return AccessMode 接入模型，bit0是0：公版小程序未接入，bit0是1：公版小程序已接入
     */
    public Long getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set 接入模型，bit0是0：公版小程序未接入，bit0是1：公版小程序已接入
     * @param AccessMode 接入模型，bit0是0：公版小程序未接入，bit0是1：公版小程序已接入
     */
    public void setAccessMode(Long AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get Linux,Android,Liteos等系统 
     * @return Os Linux,Android,Liteos等系统
     */
    public String getOs() {
        return this.Os;
    }

    /**
     * Set Linux,Android,Liteos等系统
     * @param Os Linux,Android,Liteos等系统
     */
    public void setOs(String Os) {
        this.Os = Os;
    }

    /**
     * Get 芯片架构，只是针对操作系统为android的 
     * @return ChipArch 芯片架构，只是针对操作系统为android的
     */
    public String getChipArch() {
        return this.ChipArch;
    }

    /**
     * Set 芯片架构，只是针对操作系统为android的
     * @param ChipArch 芯片架构，只是针对操作系统为android的
     */
    public void setChipArch(String ChipArch) {
        this.ChipArch = ChipArch;
    }

    public CreateProductRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProductRequest(CreateProductRequest source) {
        if (source.ProductModel != null) {
            this.ProductModel = new String(source.ProductModel);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ProductDescription != null) {
            this.ProductDescription = new String(source.ProductDescription);
        }
        if (source.Features != null) {
            this.Features = new String[source.Features.length];
            for (int i = 0; i < source.Features.length; i++) {
                this.Features[i] = new String(source.Features[i]);
            }
        }
        if (source.ChipManufactureId != null) {
            this.ChipManufactureId = new String(source.ChipManufactureId);
        }
        if (source.ChipId != null) {
            this.ChipId = new String(source.ChipId);
        }
        if (source.ProductRegion != null) {
            this.ProductRegion = new String(source.ProductRegion);
        }
        if (source.ProductCate != null) {
            this.ProductCate = new Long(source.ProductCate);
        }
        if (source.AccessMode != null) {
            this.AccessMode = new Long(source.AccessMode);
        }
        if (source.Os != null) {
            this.Os = new String(source.Os);
        }
        if (source.ChipArch != null) {
            this.ChipArch = new String(source.ChipArch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductModel", this.ProductModel);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProductDescription", this.ProductDescription);
        this.setParamArraySimple(map, prefix + "Features.", this.Features);
        this.setParamSimple(map, prefix + "ChipManufactureId", this.ChipManufactureId);
        this.setParamSimple(map, prefix + "ChipId", this.ChipId);
        this.setParamSimple(map, prefix + "ProductRegion", this.ProductRegion);
        this.setParamSimple(map, prefix + "ProductCate", this.ProductCate);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamSimple(map, prefix + "Os", this.Os);
        this.setParamSimple(map, prefix + "ChipArch", this.ChipArch);

    }
}

