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

public class ProductBase extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 产器型号(APP产品,为APP包名)
    */
    @SerializedName("ProductModel")
    @Expose
    private String ProductModel;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 产品描述信息
    */
    @SerializedName("ProductDescription")
    @Expose
    private String ProductDescription;

    /**
    * 创建时间，UNIX 时间戳，单位秒
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 物模型发布版本号,0代表物模型尚未发布
    */
    @SerializedName("IotModelRevision")
    @Expose
    private Long IotModelRevision;

    /**
    * 产品密钥
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

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
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 产品描述信息 
     * @return ProductDescription 产品描述信息
     */
    public String getProductDescription() {
        return this.ProductDescription;
    }

    /**
     * Set 产品描述信息
     * @param ProductDescription 产品描述信息
     */
    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    /**
     * Get 创建时间，UNIX 时间戳，单位秒 
     * @return CreateTime 创建时间，UNIX 时间戳，单位秒
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，UNIX 时间戳，单位秒
     * @param CreateTime 创建时间，UNIX 时间戳，单位秒
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 物模型发布版本号,0代表物模型尚未发布 
     * @return IotModelRevision 物模型发布版本号,0代表物模型尚未发布
     */
    public Long getIotModelRevision() {
        return this.IotModelRevision;
    }

    /**
     * Set 物模型发布版本号,0代表物模型尚未发布
     * @param IotModelRevision 物模型发布版本号,0代表物模型尚未发布
     */
    public void setIotModelRevision(Long IotModelRevision) {
        this.IotModelRevision = IotModelRevision;
    }

    /**
     * Get 产品密钥 
     * @return SecretKey 产品密钥
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 产品密钥
     * @param SecretKey 产品密钥
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductModel", this.ProductModel);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProductDescription", this.ProductDescription);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IotModelRevision", this.IotModelRevision);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);

    }
}

