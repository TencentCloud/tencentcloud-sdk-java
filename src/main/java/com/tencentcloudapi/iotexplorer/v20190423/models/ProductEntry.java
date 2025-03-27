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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductEntry extends AbstractModel {

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
    * 产品分组模板ID
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 加密类型。1表示证书认证，2表示密钥认证，21表示TID认证-SE方式，22表示TID认证-软加固方式
    */
    @SerializedName("EncryptionType")
    @Expose
    private String EncryptionType;

    /**
    * 连接类型。如：
wifi、wifi-ble、cellular、5g、lorawan、ble、ethernet、wifi-ethernet、else、sub_zigbee、sub_ble、sub_433mhz、sub_else、sub_blemesh
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * 数据协议 (1 使用物模型 2 为自定义类型)
    */
    @SerializedName("DataProtocol")
    @Expose
    private Long DataProtocol;

    /**
    * 产品描述
    */
    @SerializedName("ProductDesc")
    @Expose
    private String ProductDesc;

    /**
    * 状态 如：all 全部, dev 开发中, audit 审核中 released 已发布
    */
    @SerializedName("DevStatus")
    @Expose
    private String DevStatus;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 产品类型。如： 0 普通产品 ， 5 网关产品
    */
    @SerializedName("ProductType")
    @Expose
    private Long ProductType;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 产品ModuleId
    */
    @SerializedName("ModuleId")
    @Expose
    private Long ModuleId;

    /**
    * 是否使用脚本进行二进制转json功能 可以取值 true / false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableProductScript")
    @Expose
    private String EnableProductScript;

    /**
    * 创建人 UinId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserId")
    @Expose
    private Long CreateUserId;

    /**
    * 创建者昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorNickName")
    @Expose
    private String CreatorNickName;

    /**
    * 绑定策略（1：强踢；2：非强踢；0：表示无意义）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindStrategy")
    @Expose
    private Long BindStrategy;

    /**
    * 设备数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceCount")
    @Expose
    private Long DeviceCount;

    /**
    * 平均传输速率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rate")
    @Expose
    private String Rate;

    /**
    * 有效期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * 互联互通标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsInterconnection")
    @Expose
    private Long IsInterconnection;

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
     * Get 产品分组模板ID 
     * @return CategoryId 产品分组模板ID
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 产品分组模板ID
     * @param CategoryId 产品分组模板ID
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 加密类型。1表示证书认证，2表示密钥认证，21表示TID认证-SE方式，22表示TID认证-软加固方式 
     * @return EncryptionType 加密类型。1表示证书认证，2表示密钥认证，21表示TID认证-SE方式，22表示TID认证-软加固方式
     */
    public String getEncryptionType() {
        return this.EncryptionType;
    }

    /**
     * Set 加密类型。1表示证书认证，2表示密钥认证，21表示TID认证-SE方式，22表示TID认证-软加固方式
     * @param EncryptionType 加密类型。1表示证书认证，2表示密钥认证，21表示TID认证-SE方式，22表示TID认证-软加固方式
     */
    public void setEncryptionType(String EncryptionType) {
        this.EncryptionType = EncryptionType;
    }

    /**
     * Get 连接类型。如：
wifi、wifi-ble、cellular、5g、lorawan、ble、ethernet、wifi-ethernet、else、sub_zigbee、sub_ble、sub_433mhz、sub_else、sub_blemesh 
     * @return NetType 连接类型。如：
wifi、wifi-ble、cellular、5g、lorawan、ble、ethernet、wifi-ethernet、else、sub_zigbee、sub_ble、sub_433mhz、sub_else、sub_blemesh
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set 连接类型。如：
wifi、wifi-ble、cellular、5g、lorawan、ble、ethernet、wifi-ethernet、else、sub_zigbee、sub_ble、sub_433mhz、sub_else、sub_blemesh
     * @param NetType 连接类型。如：
wifi、wifi-ble、cellular、5g、lorawan、ble、ethernet、wifi-ethernet、else、sub_zigbee、sub_ble、sub_433mhz、sub_else、sub_blemesh
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 数据协议 (1 使用物模型 2 为自定义类型) 
     * @return DataProtocol 数据协议 (1 使用物模型 2 为自定义类型)
     */
    public Long getDataProtocol() {
        return this.DataProtocol;
    }

    /**
     * Set 数据协议 (1 使用物模型 2 为自定义类型)
     * @param DataProtocol 数据协议 (1 使用物模型 2 为自定义类型)
     */
    public void setDataProtocol(Long DataProtocol) {
        this.DataProtocol = DataProtocol;
    }

    /**
     * Get 产品描述 
     * @return ProductDesc 产品描述
     */
    public String getProductDesc() {
        return this.ProductDesc;
    }

    /**
     * Set 产品描述
     * @param ProductDesc 产品描述
     */
    public void setProductDesc(String ProductDesc) {
        this.ProductDesc = ProductDesc;
    }

    /**
     * Get 状态 如：all 全部, dev 开发中, audit 审核中 released 已发布 
     * @return DevStatus 状态 如：all 全部, dev 开发中, audit 审核中 released 已发布
     */
    public String getDevStatus() {
        return this.DevStatus;
    }

    /**
     * Set 状态 如：all 全部, dev 开发中, audit 审核中 released 已发布
     * @param DevStatus 状态 如：all 全部, dev 开发中, audit 审核中 released 已发布
     */
    public void setDevStatus(String DevStatus) {
        this.DevStatus = DevStatus;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 区域 
     * @return Region 区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域
     * @param Region 区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 产品类型。如： 0 普通产品 ， 5 网关产品 
     * @return ProductType 产品类型。如： 0 普通产品 ， 5 网关产品
     */
    public Long getProductType() {
        return this.ProductType;
    }

    /**
     * Set 产品类型。如： 0 普通产品 ， 5 网关产品
     * @param ProductType 产品类型。如： 0 普通产品 ， 5 网关产品
     */
    public void setProductType(Long ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 产品ModuleId 
     * @return ModuleId 产品ModuleId
     */
    public Long getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set 产品ModuleId
     * @param ModuleId 产品ModuleId
     */
    public void setModuleId(Long ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get 是否使用脚本进行二进制转json功能 可以取值 true / false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableProductScript 是否使用脚本进行二进制转json功能 可以取值 true / false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnableProductScript() {
        return this.EnableProductScript;
    }

    /**
     * Set 是否使用脚本进行二进制转json功能 可以取值 true / false
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableProductScript 是否使用脚本进行二进制转json功能 可以取值 true / false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableProductScript(String EnableProductScript) {
        this.EnableProductScript = EnableProductScript;
    }

    /**
     * Get 创建人 UinId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserId 创建人 UinId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateUserId() {
        return this.CreateUserId;
    }

    /**
     * Set 创建人 UinId
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserId 创建人 UinId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserId(Long CreateUserId) {
        this.CreateUserId = CreateUserId;
    }

    /**
     * Get 创建者昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorNickName 创建者昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorNickName() {
        return this.CreatorNickName;
    }

    /**
     * Set 创建者昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorNickName 创建者昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorNickName(String CreatorNickName) {
        this.CreatorNickName = CreatorNickName;
    }

    /**
     * Get 绑定策略（1：强踢；2：非强踢；0：表示无意义）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindStrategy 绑定策略（1：强踢；2：非强踢；0：表示无意义）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBindStrategy() {
        return this.BindStrategy;
    }

    /**
     * Set 绑定策略（1：强踢；2：非强踢；0：表示无意义）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindStrategy 绑定策略（1：强踢；2：非强踢；0：表示无意义）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindStrategy(Long BindStrategy) {
        this.BindStrategy = BindStrategy;
    }

    /**
     * Get 设备数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceCount 设备数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeviceCount() {
        return this.DeviceCount;
    }

    /**
     * Set 设备数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceCount 设备数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceCount(Long DeviceCount) {
        this.DeviceCount = DeviceCount;
    }

    /**
     * Get 平均传输速率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rate 平均传输速率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRate() {
        return this.Rate;
    }

    /**
     * Set 平均传输速率
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rate 平均传输速率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRate(String Rate) {
        this.Rate = Rate;
    }

    /**
     * Get 有效期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Period 有效期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set 有效期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Period 有效期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    /**
     * Get 互联互通标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsInterconnection 互联互通标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsInterconnection() {
        return this.IsInterconnection;
    }

    /**
     * Set 互联互通标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsInterconnection 互联互通标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsInterconnection(Long IsInterconnection) {
        this.IsInterconnection = IsInterconnection;
    }

    public ProductEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductEntry(ProductEntry source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.EncryptionType != null) {
            this.EncryptionType = new String(source.EncryptionType);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.DataProtocol != null) {
            this.DataProtocol = new Long(source.DataProtocol);
        }
        if (source.ProductDesc != null) {
            this.ProductDesc = new String(source.ProductDesc);
        }
        if (source.DevStatus != null) {
            this.DevStatus = new String(source.DevStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ProductType != null) {
            this.ProductType = new Long(source.ProductType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ModuleId != null) {
            this.ModuleId = new Long(source.ModuleId);
        }
        if (source.EnableProductScript != null) {
            this.EnableProductScript = new String(source.EnableProductScript);
        }
        if (source.CreateUserId != null) {
            this.CreateUserId = new Long(source.CreateUserId);
        }
        if (source.CreatorNickName != null) {
            this.CreatorNickName = new String(source.CreatorNickName);
        }
        if (source.BindStrategy != null) {
            this.BindStrategy = new Long(source.BindStrategy);
        }
        if (source.DeviceCount != null) {
            this.DeviceCount = new Long(source.DeviceCount);
        }
        if (source.Rate != null) {
            this.Rate = new String(source.Rate);
        }
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
        if (source.IsInterconnection != null) {
            this.IsInterconnection = new Long(source.IsInterconnection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "EncryptionType", this.EncryptionType);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "DataProtocol", this.DataProtocol);
        this.setParamSimple(map, prefix + "ProductDesc", this.ProductDesc);
        this.setParamSimple(map, prefix + "DevStatus", this.DevStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "EnableProductScript", this.EnableProductScript);
        this.setParamSimple(map, prefix + "CreateUserId", this.CreateUserId);
        this.setParamSimple(map, prefix + "CreatorNickName", this.CreatorNickName);
        this.setParamSimple(map, prefix + "BindStrategy", this.BindStrategy);
        this.setParamSimple(map, prefix + "DeviceCount", this.DeviceCount);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "IsInterconnection", this.IsInterconnection);

    }
}

