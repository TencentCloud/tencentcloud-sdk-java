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
    * 设备功能码
ypsxth : 音频双向通话;	
spdxth : 视频单向通话(监控);
NVR0824 : NVR设备,大于8路，小于等于24路;
WifiKeepalive : Wifi保活(低功耗产品);
Alexa : Alexa接入;
Google : Google接入;
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FuncCode")
    @Expose
    private String [] FuncCode;

    /**
    * 产品类别，0 : 普通视频设备；1 : NVR设备
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductCate")
    @Expose
    private Long ProductCate;

    /**
    * 产品地域
China-Mainland（中国大陆）
China-Hong Kong, Macao and Taiwan（港澳台地区）
America（美国）
Europe（欧洲）
India（印度）
Other-Overseas（其他境外地区）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductRegion")
    @Expose
    private String ProductRegion;

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
     * Get 设备功能码
ypsxth : 音频双向通话;	
spdxth : 视频单向通话(监控);
NVR0824 : NVR设备,大于8路，小于等于24路;
WifiKeepalive : Wifi保活(低功耗产品);
Alexa : Alexa接入;
Google : Google接入;
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FuncCode 设备功能码
ypsxth : 音频双向通话;	
spdxth : 视频单向通话(监控);
NVR0824 : NVR设备,大于8路，小于等于24路;
WifiKeepalive : Wifi保活(低功耗产品);
Alexa : Alexa接入;
Google : Google接入;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFuncCode() {
        return this.FuncCode;
    }

    /**
     * Set 设备功能码
ypsxth : 音频双向通话;	
spdxth : 视频单向通话(监控);
NVR0824 : NVR设备,大于8路，小于等于24路;
WifiKeepalive : Wifi保活(低功耗产品);
Alexa : Alexa接入;
Google : Google接入;
注意：此字段可能返回 null，表示取不到有效值。
     * @param FuncCode 设备功能码
ypsxth : 音频双向通话;	
spdxth : 视频单向通话(监控);
NVR0824 : NVR设备,大于8路，小于等于24路;
WifiKeepalive : Wifi保活(低功耗产品);
Alexa : Alexa接入;
Google : Google接入;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFuncCode(String [] FuncCode) {
        this.FuncCode = FuncCode;
    }

    /**
     * Get 产品类别，0 : 普通视频设备；1 : NVR设备
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductCate 产品类别，0 : 普通视频设备；1 : NVR设备
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProductCate() {
        return this.ProductCate;
    }

    /**
     * Set 产品类别，0 : 普通视频设备；1 : NVR设备
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductCate 产品类别，0 : 普通视频设备；1 : NVR设备
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductCate(Long ProductCate) {
        this.ProductCate = ProductCate;
    }

    /**
     * Get 产品地域
China-Mainland（中国大陆）
China-Hong Kong, Macao and Taiwan（港澳台地区）
America（美国）
Europe（欧洲）
India（印度）
Other-Overseas（其他境外地区）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductRegion 产品地域
China-Mainland（中国大陆）
China-Hong Kong, Macao and Taiwan（港澳台地区）
America（美国）
Europe（欧洲）
India（印度）
Other-Overseas（其他境外地区）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductRegion() {
        return this.ProductRegion;
    }

    /**
     * Set 产品地域
China-Mainland（中国大陆）
China-Hong Kong, Macao and Taiwan（港澳台地区）
America（美国）
Europe（欧洲）
India（印度）
Other-Overseas（其他境外地区）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductRegion 产品地域
China-Mainland（中国大陆）
China-Hong Kong, Macao and Taiwan（港澳台地区）
America（美国）
Europe（欧洲）
India（印度）
Other-Overseas（其他境外地区）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductRegion(String ProductRegion) {
        this.ProductRegion = ProductRegion;
    }

    public ProductBase() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductBase(ProductBase source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ProductModel != null) {
            this.ProductModel = new String(source.ProductModel);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ProductDescription != null) {
            this.ProductDescription = new String(source.ProductDescription);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.IotModelRevision != null) {
            this.IotModelRevision = new Long(source.IotModelRevision);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.FuncCode != null) {
            this.FuncCode = new String[source.FuncCode.length];
            for (int i = 0; i < source.FuncCode.length; i++) {
                this.FuncCode[i] = new String(source.FuncCode[i]);
            }
        }
        if (source.ProductCate != null) {
            this.ProductCate = new Long(source.ProductCate);
        }
        if (source.ProductRegion != null) {
            this.ProductRegion = new String(source.ProductRegion);
        }
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
        this.setParamArraySimple(map, prefix + "FuncCode.", this.FuncCode);
        this.setParamSimple(map, prefix + "ProductCate", this.ProductCate);
        this.setParamSimple(map, prefix + "ProductRegion", this.ProductRegion);

    }
}

