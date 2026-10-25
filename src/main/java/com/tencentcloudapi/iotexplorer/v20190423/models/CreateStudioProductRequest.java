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
    * <p>产品名称，名称不能和已经存在的产品名称重复。命名规则：[a-zA-Z0-9:_-]{1,32}</p>
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * <p>产品分组模板ID , ( 自定义模板填写1 , 控制台调用会使用预置的其他ID)</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * <p>产品类型 填写 ( 0 普通产品 ， 5 网关产品)</p>
    */
    @SerializedName("ProductType")
    @Expose
    private Long ProductType;

    /**
    * <p>设备认证方式 ，1表示证书认证，2表示密钥认证</p><p>枚举值：</p><ul><li>1： 证书认证(X.509证书认证)</li><li>2： 密钥认证</li></ul>
    */
    @SerializedName("EncryptionType")
    @Expose
    private String EncryptionType;

    /**
    * <p>连接类型 可以填写 wifi、wifi-ble、cellular、5g、lorawan、ble、ethernet、wifi-ethernet、else、sub_zigbee、sub_ble、sub_433mhz、sub_else、sub_blemesh</p>
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * <p>数据协议 (1 使用物模型，即使用腾讯云物联网开发平台制定的物模型协议 2 自定义透传，即用户自由定义MQTT协议Payload部分)</p>
    */
    @SerializedName("DataProtocol")
    @Expose
    private Long DataProtocol;

    /**
    * <p>产品描述</p>
    */
    @SerializedName("ProductDesc")
    @Expose
    private String ProductDesc;

    /**
    * <p>产品所在的项目ID，可从产品管理页的当前URL中获取project_id的值</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>平均传输速率</p>
    */
    @SerializedName("Rate")
    @Expose
    private String Rate;

    /**
    * <p>期限</p>
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * <p>第三方CA证书名称。空/不传 = 腾讯云默认CA证书；非空 = 使用该证书（须为当前账号已上传的 CA，不存在会报错）</p>
    */
    @SerializedName("PrivateCAName")
    @Expose
    private String PrivateCAName;

    /**
     * Get <p>产品名称，名称不能和已经存在的产品名称重复。命名规则：[a-zA-Z0-9:_-]{1,32}</p> 
     * @return ProductName <p>产品名称，名称不能和已经存在的产品名称重复。命名规则：[a-zA-Z0-9:_-]{1,32}</p>
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set <p>产品名称，名称不能和已经存在的产品名称重复。命名规则：[a-zA-Z0-9:_-]{1,32}</p>
     * @param ProductName <p>产品名称，名称不能和已经存在的产品名称重复。命名规则：[a-zA-Z0-9:_-]{1,32}</p>
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get <p>产品分组模板ID , ( 自定义模板填写1 , 控制台调用会使用预置的其他ID)</p> 
     * @return CategoryId <p>产品分组模板ID , ( 自定义模板填写1 , 控制台调用会使用预置的其他ID)</p>
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>产品分组模板ID , ( 自定义模板填写1 , 控制台调用会使用预置的其他ID)</p>
     * @param CategoryId <p>产品分组模板ID , ( 自定义模板填写1 , 控制台调用会使用预置的其他ID)</p>
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>产品类型 填写 ( 0 普通产品 ， 5 网关产品)</p> 
     * @return ProductType <p>产品类型 填写 ( 0 普通产品 ， 5 网关产品)</p>
     */
    public Long getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>产品类型 填写 ( 0 普通产品 ， 5 网关产品)</p>
     * @param ProductType <p>产品类型 填写 ( 0 普通产品 ， 5 网关产品)</p>
     */
    public void setProductType(Long ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get <p>设备认证方式 ，1表示证书认证，2表示密钥认证</p><p>枚举值：</p><ul><li>1： 证书认证(X.509证书认证)</li><li>2： 密钥认证</li></ul> 
     * @return EncryptionType <p>设备认证方式 ，1表示证书认证，2表示密钥认证</p><p>枚举值：</p><ul><li>1： 证书认证(X.509证书认证)</li><li>2： 密钥认证</li></ul>
     */
    public String getEncryptionType() {
        return this.EncryptionType;
    }

    /**
     * Set <p>设备认证方式 ，1表示证书认证，2表示密钥认证</p><p>枚举值：</p><ul><li>1： 证书认证(X.509证书认证)</li><li>2： 密钥认证</li></ul>
     * @param EncryptionType <p>设备认证方式 ，1表示证书认证，2表示密钥认证</p><p>枚举值：</p><ul><li>1： 证书认证(X.509证书认证)</li><li>2： 密钥认证</li></ul>
     */
    public void setEncryptionType(String EncryptionType) {
        this.EncryptionType = EncryptionType;
    }

    /**
     * Get <p>连接类型 可以填写 wifi、wifi-ble、cellular、5g、lorawan、ble、ethernet、wifi-ethernet、else、sub_zigbee、sub_ble、sub_433mhz、sub_else、sub_blemesh</p> 
     * @return NetType <p>连接类型 可以填写 wifi、wifi-ble、cellular、5g、lorawan、ble、ethernet、wifi-ethernet、else、sub_zigbee、sub_ble、sub_433mhz、sub_else、sub_blemesh</p>
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>连接类型 可以填写 wifi、wifi-ble、cellular、5g、lorawan、ble、ethernet、wifi-ethernet、else、sub_zigbee、sub_ble、sub_433mhz、sub_else、sub_blemesh</p>
     * @param NetType <p>连接类型 可以填写 wifi、wifi-ble、cellular、5g、lorawan、ble、ethernet、wifi-ethernet、else、sub_zigbee、sub_ble、sub_433mhz、sub_else、sub_blemesh</p>
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>数据协议 (1 使用物模型，即使用腾讯云物联网开发平台制定的物模型协议 2 自定义透传，即用户自由定义MQTT协议Payload部分)</p> 
     * @return DataProtocol <p>数据协议 (1 使用物模型，即使用腾讯云物联网开发平台制定的物模型协议 2 自定义透传，即用户自由定义MQTT协议Payload部分)</p>
     */
    public Long getDataProtocol() {
        return this.DataProtocol;
    }

    /**
     * Set <p>数据协议 (1 使用物模型，即使用腾讯云物联网开发平台制定的物模型协议 2 自定义透传，即用户自由定义MQTT协议Payload部分)</p>
     * @param DataProtocol <p>数据协议 (1 使用物模型，即使用腾讯云物联网开发平台制定的物模型协议 2 自定义透传，即用户自由定义MQTT协议Payload部分)</p>
     */
    public void setDataProtocol(Long DataProtocol) {
        this.DataProtocol = DataProtocol;
    }

    /**
     * Get <p>产品描述</p> 
     * @return ProductDesc <p>产品描述</p>
     */
    public String getProductDesc() {
        return this.ProductDesc;
    }

    /**
     * Set <p>产品描述</p>
     * @param ProductDesc <p>产品描述</p>
     */
    public void setProductDesc(String ProductDesc) {
        this.ProductDesc = ProductDesc;
    }

    /**
     * Get <p>产品所在的项目ID，可从产品管理页的当前URL中获取project_id的值</p> 
     * @return ProjectId <p>产品所在的项目ID，可从产品管理页的当前URL中获取project_id的值</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>产品所在的项目ID，可从产品管理页的当前URL中获取project_id的值</p>
     * @param ProjectId <p>产品所在的项目ID，可从产品管理页的当前URL中获取project_id的值</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>平均传输速率</p> 
     * @return Rate <p>平均传输速率</p>
     */
    public String getRate() {
        return this.Rate;
    }

    /**
     * Set <p>平均传输速率</p>
     * @param Rate <p>平均传输速率</p>
     */
    public void setRate(String Rate) {
        this.Rate = Rate;
    }

    /**
     * Get <p>期限</p> 
     * @return Period <p>期限</p>
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>期限</p>
     * @param Period <p>期限</p>
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    /**
     * Get <p>第三方CA证书名称。空/不传 = 腾讯云默认CA证书；非空 = 使用该证书（须为当前账号已上传的 CA，不存在会报错）</p> 
     * @return PrivateCAName <p>第三方CA证书名称。空/不传 = 腾讯云默认CA证书；非空 = 使用该证书（须为当前账号已上传的 CA，不存在会报错）</p>
     */
    public String getPrivateCAName() {
        return this.PrivateCAName;
    }

    /**
     * Set <p>第三方CA证书名称。空/不传 = 腾讯云默认CA证书；非空 = 使用该证书（须为当前账号已上传的 CA，不存在会报错）</p>
     * @param PrivateCAName <p>第三方CA证书名称。空/不传 = 腾讯云默认CA证书；非空 = 使用该证书（须为当前账号已上传的 CA，不存在会报错）</p>
     */
    public void setPrivateCAName(String PrivateCAName) {
        this.PrivateCAName = PrivateCAName;
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
        if (source.PrivateCAName != null) {
            this.PrivateCAName = new String(source.PrivateCAName);
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
        this.setParamSimple(map, prefix + "PrivateCAName", this.PrivateCAName);

    }
}

