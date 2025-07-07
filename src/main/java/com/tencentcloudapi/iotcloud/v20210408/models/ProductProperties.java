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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductProperties extends AbstractModel {

    /**
    * 产品描述
    */
    @SerializedName("ProductDescription")
    @Expose
    private String ProductDescription;

    /**
    * 加密类型，1表示证书认证，2表示签名认证。如不填写，默认值是1
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
    * 产品类型，各个类型值代表的节点-类型如下：
0 普通产品，2 NB-IoT产品，4 LoRa产品，3 LoRa网关产品，5 普通网关产品   默认值是0
    */
    @SerializedName("ProductType")
    @Expose
    private Long ProductType;

    /**
    * 数据格式，取值为json或者custom，默认值是json
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 产品所属平台，默认值是0
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * LoRa产品运营侧APPEUI，只有LoRa产品需要填写
    */
    @SerializedName("Appeui")
    @Expose
    private String Appeui;

    /**
    * 产品绑定的物模型ID，-1表示不绑定
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 产品绑定的物模型名称
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 产品密钥，suite产品才会有
    */
    @SerializedName("ProductKey")
    @Expose
    private String ProductKey;

    /**
    * 动态注册类型 0-关闭, 1-预定义设备名 2-动态定义设备名
    */
    @SerializedName("RegisterType")
    @Expose
    private Long RegisterType;

    /**
    * 动态注册产品密钥
    */
    @SerializedName("ProductSecret")
    @Expose
    private String ProductSecret;

    /**
    * RegisterType为2时，设备动态创建的限制数量
    */
    @SerializedName("RegisterLimit")
    @Expose
    private Long RegisterLimit;

    /**
    * 划归的产品，展示为源产品ID，其余为空
    */
    @SerializedName("OriginProductId")
    @Expose
    private String OriginProductId;

    /**
    * 私有CA名称
    */
    @SerializedName("PrivateCAName")
    @Expose
    private String PrivateCAName;

    /**
    * 划归的产品，展示为源用户ID，其余为空
    */
    @SerializedName("OriginUserId")
    @Expose
    private Long OriginUserId;

    /**
    * 设备限制
    */
    @SerializedName("DeviceLimit")
    @Expose
    private Long DeviceLimit;

    /**
    * 产品禁用状态
    */
    @SerializedName("ForbiddenStatus")
    @Expose
    private Long ForbiddenStatus;

    /**
    * LoRa产品运营侧APPEUI，只有LoRa产品需要填写
    */
    @SerializedName("AppEUI")
    @Expose
    private String AppEUI;

    /**
     * Get 产品描述 
     * @return ProductDescription 产品描述
     */
    public String getProductDescription() {
        return this.ProductDescription;
    }

    /**
     * Set 产品描述
     * @param ProductDescription 产品描述
     */
    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    /**
     * Get 加密类型，1表示证书认证，2表示签名认证。如不填写，默认值是1 
     * @return EncryptionType 加密类型，1表示证书认证，2表示签名认证。如不填写，默认值是1
     */
    public String getEncryptionType() {
        return this.EncryptionType;
    }

    /**
     * Set 加密类型，1表示证书认证，2表示签名认证。如不填写，默认值是1
     * @param EncryptionType 加密类型，1表示证书认证，2表示签名认证。如不填写，默认值是1
     */
    public void setEncryptionType(String EncryptionType) {
        this.EncryptionType = EncryptionType;
    }

    /**
     * Get 产品所属区域，目前只支持广州（gz） 
     * @return Region 产品所属区域，目前只支持广州（gz）
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 产品所属区域，目前只支持广州（gz）
     * @param Region 产品所属区域，目前只支持广州（gz）
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 产品类型，各个类型值代表的节点-类型如下：
0 普通产品，2 NB-IoT产品，4 LoRa产品，3 LoRa网关产品，5 普通网关产品   默认值是0 
     * @return ProductType 产品类型，各个类型值代表的节点-类型如下：
0 普通产品，2 NB-IoT产品，4 LoRa产品，3 LoRa网关产品，5 普通网关产品   默认值是0
     */
    public Long getProductType() {
        return this.ProductType;
    }

    /**
     * Set 产品类型，各个类型值代表的节点-类型如下：
0 普通产品，2 NB-IoT产品，4 LoRa产品，3 LoRa网关产品，5 普通网关产品   默认值是0
     * @param ProductType 产品类型，各个类型值代表的节点-类型如下：
0 普通产品，2 NB-IoT产品，4 LoRa产品，3 LoRa网关产品，5 普通网关产品   默认值是0
     */
    public void setProductType(Long ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get 数据格式，取值为json或者custom，默认值是json 
     * @return Format 数据格式，取值为json或者custom，默认值是json
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 数据格式，取值为json或者custom，默认值是json
     * @param Format 数据格式，取值为json或者custom，默认值是json
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 产品所属平台，默认值是0 
     * @return Platform 产品所属平台，默认值是0
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 产品所属平台，默认值是0
     * @param Platform 产品所属平台，默认值是0
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get LoRa产品运营侧APPEUI，只有LoRa产品需要填写 
     * @return Appeui LoRa产品运营侧APPEUI，只有LoRa产品需要填写
     * @deprecated
     */
    @Deprecated
    public String getAppeui() {
        return this.Appeui;
    }

    /**
     * Set LoRa产品运营侧APPEUI，只有LoRa产品需要填写
     * @param Appeui LoRa产品运营侧APPEUI，只有LoRa产品需要填写
     * @deprecated
     */
    @Deprecated
    public void setAppeui(String Appeui) {
        this.Appeui = Appeui;
    }

    /**
     * Get 产品绑定的物模型ID，-1表示不绑定 
     * @return ModelId 产品绑定的物模型ID，-1表示不绑定
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 产品绑定的物模型ID，-1表示不绑定
     * @param ModelId 产品绑定的物模型ID，-1表示不绑定
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 产品绑定的物模型名称 
     * @return ModelName 产品绑定的物模型名称
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 产品绑定的物模型名称
     * @param ModelName 产品绑定的物模型名称
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 产品密钥，suite产品才会有 
     * @return ProductKey 产品密钥，suite产品才会有
     */
    public String getProductKey() {
        return this.ProductKey;
    }

    /**
     * Set 产品密钥，suite产品才会有
     * @param ProductKey 产品密钥，suite产品才会有
     */
    public void setProductKey(String ProductKey) {
        this.ProductKey = ProductKey;
    }

    /**
     * Get 动态注册类型 0-关闭, 1-预定义设备名 2-动态定义设备名 
     * @return RegisterType 动态注册类型 0-关闭, 1-预定义设备名 2-动态定义设备名
     */
    public Long getRegisterType() {
        return this.RegisterType;
    }

    /**
     * Set 动态注册类型 0-关闭, 1-预定义设备名 2-动态定义设备名
     * @param RegisterType 动态注册类型 0-关闭, 1-预定义设备名 2-动态定义设备名
     */
    public void setRegisterType(Long RegisterType) {
        this.RegisterType = RegisterType;
    }

    /**
     * Get 动态注册产品密钥 
     * @return ProductSecret 动态注册产品密钥
     */
    public String getProductSecret() {
        return this.ProductSecret;
    }

    /**
     * Set 动态注册产品密钥
     * @param ProductSecret 动态注册产品密钥
     */
    public void setProductSecret(String ProductSecret) {
        this.ProductSecret = ProductSecret;
    }

    /**
     * Get RegisterType为2时，设备动态创建的限制数量 
     * @return RegisterLimit RegisterType为2时，设备动态创建的限制数量
     */
    public Long getRegisterLimit() {
        return this.RegisterLimit;
    }

    /**
     * Set RegisterType为2时，设备动态创建的限制数量
     * @param RegisterLimit RegisterType为2时，设备动态创建的限制数量
     */
    public void setRegisterLimit(Long RegisterLimit) {
        this.RegisterLimit = RegisterLimit;
    }

    /**
     * Get 划归的产品，展示为源产品ID，其余为空 
     * @return OriginProductId 划归的产品，展示为源产品ID，其余为空
     */
    public String getOriginProductId() {
        return this.OriginProductId;
    }

    /**
     * Set 划归的产品，展示为源产品ID，其余为空
     * @param OriginProductId 划归的产品，展示为源产品ID，其余为空
     */
    public void setOriginProductId(String OriginProductId) {
        this.OriginProductId = OriginProductId;
    }

    /**
     * Get 私有CA名称 
     * @return PrivateCAName 私有CA名称
     */
    public String getPrivateCAName() {
        return this.PrivateCAName;
    }

    /**
     * Set 私有CA名称
     * @param PrivateCAName 私有CA名称
     */
    public void setPrivateCAName(String PrivateCAName) {
        this.PrivateCAName = PrivateCAName;
    }

    /**
     * Get 划归的产品，展示为源用户ID，其余为空 
     * @return OriginUserId 划归的产品，展示为源用户ID，其余为空
     */
    public Long getOriginUserId() {
        return this.OriginUserId;
    }

    /**
     * Set 划归的产品，展示为源用户ID，其余为空
     * @param OriginUserId 划归的产品，展示为源用户ID，其余为空
     */
    public void setOriginUserId(Long OriginUserId) {
        this.OriginUserId = OriginUserId;
    }

    /**
     * Get 设备限制 
     * @return DeviceLimit 设备限制
     */
    public Long getDeviceLimit() {
        return this.DeviceLimit;
    }

    /**
     * Set 设备限制
     * @param DeviceLimit 设备限制
     */
    public void setDeviceLimit(Long DeviceLimit) {
        this.DeviceLimit = DeviceLimit;
    }

    /**
     * Get 产品禁用状态 
     * @return ForbiddenStatus 产品禁用状态
     */
    public Long getForbiddenStatus() {
        return this.ForbiddenStatus;
    }

    /**
     * Set 产品禁用状态
     * @param ForbiddenStatus 产品禁用状态
     */
    public void setForbiddenStatus(Long ForbiddenStatus) {
        this.ForbiddenStatus = ForbiddenStatus;
    }

    /**
     * Get LoRa产品运营侧APPEUI，只有LoRa产品需要填写 
     * @return AppEUI LoRa产品运营侧APPEUI，只有LoRa产品需要填写
     */
    public String getAppEUI() {
        return this.AppEUI;
    }

    /**
     * Set LoRa产品运营侧APPEUI，只有LoRa产品需要填写
     * @param AppEUI LoRa产品运营侧APPEUI，只有LoRa产品需要填写
     */
    public void setAppEUI(String AppEUI) {
        this.AppEUI = AppEUI;
    }

    public ProductProperties() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductProperties(ProductProperties source) {
        if (source.ProductDescription != null) {
            this.ProductDescription = new String(source.ProductDescription);
        }
        if (source.EncryptionType != null) {
            this.EncryptionType = new String(source.EncryptionType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ProductType != null) {
            this.ProductType = new Long(source.ProductType);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.Appeui != null) {
            this.Appeui = new String(source.Appeui);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ProductKey != null) {
            this.ProductKey = new String(source.ProductKey);
        }
        if (source.RegisterType != null) {
            this.RegisterType = new Long(source.RegisterType);
        }
        if (source.ProductSecret != null) {
            this.ProductSecret = new String(source.ProductSecret);
        }
        if (source.RegisterLimit != null) {
            this.RegisterLimit = new Long(source.RegisterLimit);
        }
        if (source.OriginProductId != null) {
            this.OriginProductId = new String(source.OriginProductId);
        }
        if (source.PrivateCAName != null) {
            this.PrivateCAName = new String(source.PrivateCAName);
        }
        if (source.OriginUserId != null) {
            this.OriginUserId = new Long(source.OriginUserId);
        }
        if (source.DeviceLimit != null) {
            this.DeviceLimit = new Long(source.DeviceLimit);
        }
        if (source.ForbiddenStatus != null) {
            this.ForbiddenStatus = new Long(source.ForbiddenStatus);
        }
        if (source.AppEUI != null) {
            this.AppEUI = new String(source.AppEUI);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductDescription", this.ProductDescription);
        this.setParamSimple(map, prefix + "EncryptionType", this.EncryptionType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Appeui", this.Appeui);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ProductKey", this.ProductKey);
        this.setParamSimple(map, prefix + "RegisterType", this.RegisterType);
        this.setParamSimple(map, prefix + "ProductSecret", this.ProductSecret);
        this.setParamSimple(map, prefix + "RegisterLimit", this.RegisterLimit);
        this.setParamSimple(map, prefix + "OriginProductId", this.OriginProductId);
        this.setParamSimple(map, prefix + "PrivateCAName", this.PrivateCAName);
        this.setParamSimple(map, prefix + "OriginUserId", this.OriginUserId);
        this.setParamSimple(map, prefix + "DeviceLimit", this.DeviceLimit);
        this.setParamSimple(map, prefix + "ForbiddenStatus", this.ForbiddenStatus);
        this.setParamSimple(map, prefix + "AppEUI", this.AppEUI);

    }
}

