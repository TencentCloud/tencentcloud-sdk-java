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

public class ProductData extends AbstractModel{

    /**
    * 产品ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 产品名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 产品描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductDescription")
    @Expose
    private String ProductDescription;

    /**
    * 创建时间，UNIX 时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 物模型发布版本号,0代表物模型尚未发布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IotModelRevision")
    @Expose
    private Long IotModelRevision;

    /**
    * 产品密钥
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * 设备功能码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Features")
    @Expose
    private String [] Features;

    /**
    * 产器型号(APP产品,为APP包名)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductModel")
    @Expose
    private String ProductModel;

    /**
    * 主芯片厂商id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChipManufactureId")
    @Expose
    private String ChipManufactureId;

    /**
    * 主芯片型号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChipId")
    @Expose
    private String ChipId;

    /**
     * Get 产品ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductId 产品ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductId 产品ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 产品名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductName 产品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductName 产品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 产品描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductDescription 产品描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductDescription() {
        return this.ProductDescription;
    }

    /**
     * Set 产品描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductDescription 产品描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    /**
     * Get 创建时间，UNIX 时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间，UNIX 时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，UNIX 时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间，UNIX 时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 物模型发布版本号,0代表物模型尚未发布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IotModelRevision 物模型发布版本号,0代表物模型尚未发布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIotModelRevision() {
        return this.IotModelRevision;
    }

    /**
     * Set 物模型发布版本号,0代表物模型尚未发布
注意：此字段可能返回 null，表示取不到有效值。
     * @param IotModelRevision 物模型发布版本号,0代表物模型尚未发布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIotModelRevision(Long IotModelRevision) {
        this.IotModelRevision = IotModelRevision;
    }

    /**
     * Get 产品密钥
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretKey 产品密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 产品密钥
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretKey 产品密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get 设备功能码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Features 设备功能码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFeatures() {
        return this.Features;
    }

    /**
     * Set 设备功能码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Features 设备功能码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFeatures(String [] Features) {
        this.Features = Features;
    }

    /**
     * Get 产器型号(APP产品,为APP包名)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductModel 产器型号(APP产品,为APP包名)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductModel() {
        return this.ProductModel;
    }

    /**
     * Set 产器型号(APP产品,为APP包名)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductModel 产器型号(APP产品,为APP包名)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductModel(String ProductModel) {
        this.ProductModel = ProductModel;
    }

    /**
     * Get 主芯片厂商id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChipManufactureId 主芯片厂商id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChipManufactureId() {
        return this.ChipManufactureId;
    }

    /**
     * Set 主芯片厂商id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChipManufactureId 主芯片厂商id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChipManufactureId(String ChipManufactureId) {
        this.ChipManufactureId = ChipManufactureId;
    }

    /**
     * Get 主芯片型号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChipId 主芯片型号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChipId() {
        return this.ChipId;
    }

    /**
     * Set 主芯片型号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChipId 主芯片型号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChipId(String ChipId) {
        this.ChipId = ChipId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProductDescription", this.ProductDescription);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IotModelRevision", this.IotModelRevision);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamArraySimple(map, prefix + "Features.", this.Features);
        this.setParamSimple(map, prefix + "ProductModel", this.ProductModel);
        this.setParamSimple(map, prefix + "ChipManufactureId", this.ChipManufactureId);
        this.setParamSimple(map, prefix + "ChipId", this.ChipId);

    }
}

