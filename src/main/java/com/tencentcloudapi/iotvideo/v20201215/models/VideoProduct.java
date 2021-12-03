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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoProduct extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 产品设备类型（普通设备)	1.普通设备
    */
    @SerializedName("DeviceType")
    @Expose
    private Long DeviceType;

    /**
    * 认证方式：2：PSK
    */
    @SerializedName("EncryptionType")
    @Expose
    private Long EncryptionType;

    /**
    * 设备功能码
    */
    @SerializedName("Features")
    @Expose
    private String [] Features;

    /**
    * 操作系统
    */
    @SerializedName("ChipOs")
    @Expose
    private String ChipOs;

    /**
    * 芯片厂商id
    */
    @SerializedName("ChipManufactureId")
    @Expose
    private String ChipManufactureId;

    /**
    * 芯片id
    */
    @SerializedName("ChipId")
    @Expose
    private String ChipId;

    /**
    * 产品描述信息
    */
    @SerializedName("ProductDescription")
    @Expose
    private String ProductDescription;

    /**
    * 创建时间unix时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 修改时间unix时间戳
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 连接类型，wifi表示WIFI连接，cellular表示4G连接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

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
     * Get 产品设备类型（普通设备)	1.普通设备 
     * @return DeviceType 产品设备类型（普通设备)	1.普通设备
     */
    public Long getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 产品设备类型（普通设备)	1.普通设备
     * @param DeviceType 产品设备类型（普通设备)	1.普通设备
     */
    public void setDeviceType(Long DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 认证方式：2：PSK 
     * @return EncryptionType 认证方式：2：PSK
     */
    public Long getEncryptionType() {
        return this.EncryptionType;
    }

    /**
     * Set 认证方式：2：PSK
     * @param EncryptionType 认证方式：2：PSK
     */
    public void setEncryptionType(Long EncryptionType) {
        this.EncryptionType = EncryptionType;
    }

    /**
     * Get 设备功能码 
     * @return Features 设备功能码
     */
    public String [] getFeatures() {
        return this.Features;
    }

    /**
     * Set 设备功能码
     * @param Features 设备功能码
     */
    public void setFeatures(String [] Features) {
        this.Features = Features;
    }

    /**
     * Get 操作系统 
     * @return ChipOs 操作系统
     */
    public String getChipOs() {
        return this.ChipOs;
    }

    /**
     * Set 操作系统
     * @param ChipOs 操作系统
     */
    public void setChipOs(String ChipOs) {
        this.ChipOs = ChipOs;
    }

    /**
     * Get 芯片厂商id 
     * @return ChipManufactureId 芯片厂商id
     */
    public String getChipManufactureId() {
        return this.ChipManufactureId;
    }

    /**
     * Set 芯片厂商id
     * @param ChipManufactureId 芯片厂商id
     */
    public void setChipManufactureId(String ChipManufactureId) {
        this.ChipManufactureId = ChipManufactureId;
    }

    /**
     * Get 芯片id 
     * @return ChipId 芯片id
     */
    public String getChipId() {
        return this.ChipId;
    }

    /**
     * Set 芯片id
     * @param ChipId 芯片id
     */
    public void setChipId(String ChipId) {
        this.ChipId = ChipId;
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
     * Get 创建时间unix时间戳 
     * @return CreateTime 创建时间unix时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间unix时间戳
     * @param CreateTime 创建时间unix时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间unix时间戳 
     * @return UpdateTime 修改时间unix时间戳
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间unix时间戳
     * @param UpdateTime 修改时间unix时间戳
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 连接类型，wifi表示WIFI连接，cellular表示4G连接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetType 连接类型，wifi表示WIFI连接，cellular表示4G连接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set 连接类型，wifi表示WIFI连接，cellular表示4G连接
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetType 连接类型，wifi表示WIFI连接，cellular表示4G连接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    public VideoProduct() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoProduct(VideoProduct source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new Long(source.DeviceType);
        }
        if (source.EncryptionType != null) {
            this.EncryptionType = new Long(source.EncryptionType);
        }
        if (source.Features != null) {
            this.Features = new String[source.Features.length];
            for (int i = 0; i < source.Features.length; i++) {
                this.Features[i] = new String(source.Features[i]);
            }
        }
        if (source.ChipOs != null) {
            this.ChipOs = new String(source.ChipOs);
        }
        if (source.ChipManufactureId != null) {
            this.ChipManufactureId = new String(source.ChipManufactureId);
        }
        if (source.ChipId != null) {
            this.ChipId = new String(source.ChipId);
        }
        if (source.ProductDescription != null) {
            this.ProductDescription = new String(source.ProductDescription);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "EncryptionType", this.EncryptionType);
        this.setParamArraySimple(map, prefix + "Features.", this.Features);
        this.setParamSimple(map, prefix + "ChipOs", this.ChipOs);
        this.setParamSimple(map, prefix + "ChipManufactureId", this.ChipManufactureId);
        this.setParamSimple(map, prefix + "ChipId", this.ChipId);
        this.setParamSimple(map, prefix + "ProductDescription", this.ProductDescription);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "NetType", this.NetType);

    }
}

