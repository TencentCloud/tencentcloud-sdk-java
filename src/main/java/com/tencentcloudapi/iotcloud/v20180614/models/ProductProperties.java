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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductProperties  extends AbstractModel{

    /**
    * 产品描述
    */
    @SerializedName("ProductDescription")
    @Expose
    private String ProductDescription;

    /**
    * 加密类型，1表示非对称加密，2表示对称加密。如不填写，默认值是1
    */
    @SerializedName("EncryptionType")
    @Expose
    private String EncryptionType;

    /**
    * 产品所属区域，目前只支持广州（gz）
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 产品类型，0表示正常设备，2表示NB-IoT设备，默认值是0
    */
    @SerializedName("ProductType")
    @Expose
    private Integer ProductType;

    /**
    * 数据格式，取值为json或者custom，默认值是json
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
     * 获取产品描述
     * @return ProductDescription 产品描述
     */
    public String getProductDescription() {
        return this.ProductDescription;
    }

    /**
     * 设置产品描述
     * @param ProductDescription 产品描述
     */
    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    /**
     * 获取加密类型，1表示非对称加密，2表示对称加密。如不填写，默认值是1
     * @return EncryptionType 加密类型，1表示非对称加密，2表示对称加密。如不填写，默认值是1
     */
    public String getEncryptionType() {
        return this.EncryptionType;
    }

    /**
     * 设置加密类型，1表示非对称加密，2表示对称加密。如不填写，默认值是1
     * @param EncryptionType 加密类型，1表示非对称加密，2表示对称加密。如不填写，默认值是1
     */
    public void setEncryptionType(String EncryptionType) {
        this.EncryptionType = EncryptionType;
    }

    /**
     * 获取产品所属区域，目前只支持广州（gz）
     * @return Region 产品所属区域，目前只支持广州（gz）
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置产品所属区域，目前只支持广州（gz）
     * @param Region 产品所属区域，目前只支持广州（gz）
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取产品类型，0表示正常设备，2表示NB-IoT设备，默认值是0
     * @return ProductType 产品类型，0表示正常设备，2表示NB-IoT设备，默认值是0
     */
    public Integer getProductType() {
        return this.ProductType;
    }

    /**
     * 设置产品类型，0表示正常设备，2表示NB-IoT设备，默认值是0
     * @param ProductType 产品类型，0表示正常设备，2表示NB-IoT设备，默认值是0
     */
    public void setProductType(Integer ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * 获取数据格式，取值为json或者custom，默认值是json
     * @return Format 数据格式，取值为json或者custom，默认值是json
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * 设置数据格式，取值为json或者custom，默认值是json
     * @param Format 数据格式，取值为json或者custom，默认值是json
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductDescription", this.ProductDescription);
        this.setParamSimple(map, prefix + "EncryptionType", this.EncryptionType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}

