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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStudioProductRequest extends AbstractModel {

    /**
    * 产品名称，名称不能和已经存在的产品名称重复。命名规则：[a-zA-Z0-9:_-]{1,32}
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 产品分组模板ID , ( 自定义模板填写1 , 控制台调用会使用预置的其他ID)
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 产品类型 填写 ( 0 普通产品 ， 5 网关产品)
    */
    @SerializedName("ProductType")
    @Expose
    private Long ProductType;

    /**
    * 加密类型 ，1表示证书认证，2表示密钥认证，21表示TID认证-SE方式，22表示TID认证-软加固方式
    */
    @SerializedName("EncryptionType")
    @Expose
    private String EncryptionType;

    /**
    * 连接类型 可以填写 wifi、wifi-ble、cellular、5g、lorawan、ble、ethernet、wifi-ethernet、else、sub_zigbee、sub_ble、sub_433mhz、sub_else、sub_blemesh
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * 数据协议 (1 使用物模型 2 为自定义)
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
    * 产品的项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 平均传输速率
    */
    @SerializedName("Rate")
    @Expose
    private String Rate;

    /**
    * 期限
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
     * Get 产品名称，名称不能和已经存在的产品名称重复。命名规则：[a-zA-Z0-9:_-]{1,32} 
     * @return ProductName 产品名称，名称不能和已经存在的产品名称重复。命名规则：[a-zA-Z0-9:_-]{1,32}
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称，名称不能和已经存在的产品名称重复。命名规则：[a-zA-Z0-9:_-]{1,32}
     * @param ProductName 产品名称，名称不能和已经存在的产品名称重复。命名规则：[a-zA-Z0-9:_-]{1,32}
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 产品分组模板ID , ( 自定义模板填写1 , 控制台调用会使用预置的其他ID) 
     * @return CategoryId 产品分组模板ID , ( 自定义模板填写1 , 控制台调用会使用预置的其他ID)
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 产品分组模板ID , ( 自定义模板填写1 , 控制台调用会使用预置的其他ID)
     * @param CategoryId 产品分组模板ID , ( 自定义模板填写1 , 控制台调用会使用预置的其他ID)
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 产品类型 填写 ( 0 普通产品 ， 5 网关产品) 
     * @return ProductType 产品类型 填写 ( 0 普通产品 ， 5 网关产品)
     */
    public Long getProductType() {
        return this.ProductType;
    }

    /**
     * Set 产品类型 填写 ( 0 普通产品 ， 5 网关产品)
     * @param ProductType 产品类型 填写 ( 0 普通产品 ， 5 网关产品)
     */
    public void setProductType(Long ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get 加密类型 ，1表示证书认证，2表示密钥认证，21表示TID认证-SE方式，22表示TID认证-软加固方式 
     * @return EncryptionType 加密类型 ，1表示证书认证，2表示密钥认证，21表示TID认证-SE方式，22表示TID认证-软加固方式
     */
    public String getEncryptionType() {
        return this.EncryptionType;
    }

    /**
     * Set 加密类型 ，1表示证书认证，2表示密钥认证，21表示TID认证-SE方式，22表示TID认证-软加固方式
     * @param EncryptionType 加密类型 ，1表示证书认证，2表示密钥认证，21表示TID认证-SE方式，22表示TID认证-软加固方式
     */
    public void setEncryptionType(String EncryptionType) {
        this.EncryptionType = EncryptionType;
    }

    /**
     * Get 连接类型 可以填写 wifi、wifi-ble、cellular、5g、lorawan、ble、ethernet、wifi-ethernet、else、sub_zigbee、sub_ble、sub_433mhz、sub_else、sub_blemesh 
     * @return NetType 连接类型 可以填写 wifi、wifi-ble、cellular、5g、lorawan、ble、ethernet、wifi-ethernet、else、sub_zigbee、sub_ble、sub_433mhz、sub_else、sub_blemesh
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set 连接类型 可以填写 wifi、wifi-ble、cellular、5g、lorawan、ble、ethernet、wifi-ethernet、else、sub_zigbee、sub_ble、sub_433mhz、sub_else、sub_blemesh
     * @param NetType 连接类型 可以填写 wifi、wifi-ble、cellular、5g、lorawan、ble、ethernet、wifi-ethernet、else、sub_zigbee、sub_ble、sub_433mhz、sub_else、sub_blemesh
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 数据协议 (1 使用物模型 2 为自定义) 
     * @return DataProtocol 数据协议 (1 使用物模型 2 为自定义)
     */
    public Long getDataProtocol() {
        return this.DataProtocol;
    }

    /**
     * Set 数据协议 (1 使用物模型 2 为自定义)
     * @param DataProtocol 数据协议 (1 使用物模型 2 为自定义)
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
     * Get 产品的项目ID 
     * @return ProjectId 产品的项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 产品的项目ID
     * @param ProjectId 产品的项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 平均传输速率 
     * @return Rate 平均传输速率
     */
    public String getRate() {
        return this.Rate;
    }

    /**
     * Set 平均传输速率
     * @param Rate 平均传输速率
     */
    public void setRate(String Rate) {
        this.Rate = Rate;
    }

    /**
     * Get 期限 
     * @return Period 期限
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set 期限
     * @param Period 期限
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    public CreateStudioProductRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStudioProductRequest(CreateStudioProductRequest source) {
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.ProductType != null) {
            this.ProductType = new Long(source.ProductType);
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
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Rate != null) {
            this.Rate = new String(source.Rate);
        }
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "EncryptionType", this.EncryptionType);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "DataProtocol", this.DataProtocol);
        this.setParamSimple(map, prefix + "ProductDesc", this.ProductDesc);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

