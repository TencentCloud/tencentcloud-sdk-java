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

public class ProductEntry extends AbstractModel {

    /**
    * <p>产品ID</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>产品名称</p>
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * <p>产品分组模板ID</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * <p>加密类型。1表示证书认证，2表示密钥认证，21表示TID认证-SE方式，22表示TID认证-软加固方式</p>
    */
    @SerializedName("EncryptionType")
    @Expose
    private String EncryptionType;

    /**
    * <p>连接类型。如：<br>wifi、wifi-ble、cellular、5g、lorawan、ble、ethernet、wifi-ethernet、else、sub_zigbee、sub_ble、sub_433mhz、sub_else、sub_blemesh</p>
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * <p>数据协议 (1 使用物模型 2 为自定义类型)</p>
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
    * <p>状态 如：all 全部, dev 开发中, audit 审核中 released 已发布</p>
    */
    @SerializedName("DevStatus")
    @Expose
    private String DevStatus;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>区域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>产品类型。如： 0 普通产品 ， 5 网关产品</p>
    */
    @SerializedName("ProductType")
    @Expose
    private Long ProductType;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>产品ModuleId</p>
    */
    @SerializedName("ModuleId")
    @Expose
    private Long ModuleId;

    /**
    * <p>是否使用脚本进行二进制转json功能 可以取值 true / false</p>
    */
    @SerializedName("EnableProductScript")
    @Expose
    private String EnableProductScript;

    /**
    * <p>创建人 UinId</p>
    */
    @SerializedName("CreateUserId")
    @Expose
    private Long CreateUserId;

    /**
    * <p>创建者昵称</p>
    */
    @SerializedName("CreatorNickName")
    @Expose
    private String CreatorNickName;

    /**
    * <p>绑定策略（1：强踢；2：非强踢；0：表示无意义）</p>
    */
    @SerializedName("BindStrategy")
    @Expose
    private Long BindStrategy;

    /**
    * <p>设备数量</p>
    */
    @SerializedName("DeviceCount")
    @Expose
    private Long DeviceCount;

    /**
    * <p>平均传输速率</p>
    */
    @SerializedName("Rate")
    @Expose
    private String Rate;

    /**
    * <p>有效期</p>
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * <p>互联互通标识</p>
    */
    @SerializedName("IsInterconnection")
    @Expose
    private Long IsInterconnection;

    /**
    * <p>UIN</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>AppID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>绑定的第三方CA名称；空 = 腾讯云CA证书</p>
    */
    @SerializedName("PrivateCAName")
    @Expose
    private String PrivateCAName;

    /**
    * <p>true = 第三方CA</p>
    */
    @SerializedName("IsPrivateCA")
    @Expose
    private Boolean IsPrivateCA;

    /**
    * <p>CA 证书名称</p>
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * <p>证书序列号</p>
    */
    @SerializedName("CertSN")
    @Expose
    private String CertSN;

    /**
    * <p>颁发者</p>
    */
    @SerializedName("IssuerName")
    @Expose
    private String IssuerName;

    /**
    * <p>证书主题</p>
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * <p>生效时间（Unix 秒）</p><p>单位：秒</p>
    */
    @SerializedName("EffectiveTime")
    @Expose
    private Long EffectiveTime;

    /**
    * <p>过期时间（Unix 秒）</p><p>单位：秒</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <p>CA 证书 PEM 全文</p>
    */
    @SerializedName("CertText")
    @Expose
    private String CertText;

    /**
     * Get <p>产品ID</p> 
     * @return ProductId <p>产品ID</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品ID</p>
     * @param ProductId <p>产品ID</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>产品名称</p> 
     * @return ProductName <p>产品名称</p>
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set <p>产品名称</p>
     * @param ProductName <p>产品名称</p>
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get <p>产品分组模板ID</p> 
     * @return CategoryId <p>产品分组模板ID</p>
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>产品分组模板ID</p>
     * @param CategoryId <p>产品分组模板ID</p>
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>加密类型。1表示证书认证，2表示密钥认证，21表示TID认证-SE方式，22表示TID认证-软加固方式</p> 
     * @return EncryptionType <p>加密类型。1表示证书认证，2表示密钥认证，21表示TID认证-SE方式，22表示TID认证-软加固方式</p>
     */
    public String getEncryptionType() {
        return this.EncryptionType;
    }

    /**
     * Set <p>加密类型。1表示证书认证，2表示密钥认证，21表示TID认证-SE方式，22表示TID认证-软加固方式</p>
     * @param EncryptionType <p>加密类型。1表示证书认证，2表示密钥认证，21表示TID认证-SE方式，22表示TID认证-软加固方式</p>
     */
    public void setEncryptionType(String EncryptionType) {
        this.EncryptionType = EncryptionType;
    }

    /**
     * Get <p>连接类型。如：<br>wifi、wifi-ble、cellular、5g、lorawan、ble、ethernet、wifi-ethernet、else、sub_zigbee、sub_ble、sub_433mhz、sub_else、sub_blemesh</p> 
     * @return NetType <p>连接类型。如：<br>wifi、wifi-ble、cellular、5g、lorawan、ble、ethernet、wifi-ethernet、else、sub_zigbee、sub_ble、sub_433mhz、sub_else、sub_blemesh</p>
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>连接类型。如：<br>wifi、wifi-ble、cellular、5g、lorawan、ble、ethernet、wifi-ethernet、else、sub_zigbee、sub_ble、sub_433mhz、sub_else、sub_blemesh</p>
     * @param NetType <p>连接类型。如：<br>wifi、wifi-ble、cellular、5g、lorawan、ble、ethernet、wifi-ethernet、else、sub_zigbee、sub_ble、sub_433mhz、sub_else、sub_blemesh</p>
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>数据协议 (1 使用物模型 2 为自定义类型)</p> 
     * @return DataProtocol <p>数据协议 (1 使用物模型 2 为自定义类型)</p>
     */
    public Long getDataProtocol() {
        return this.DataProtocol;
    }

    /**
     * Set <p>数据协议 (1 使用物模型 2 为自定义类型)</p>
     * @param DataProtocol <p>数据协议 (1 使用物模型 2 为自定义类型)</p>
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
     * Get <p>状态 如：all 全部, dev 开发中, audit 审核中 released 已发布</p> 
     * @return DevStatus <p>状态 如：all 全部, dev 开发中, audit 审核中 released 已发布</p>
     */
    public String getDevStatus() {
        return this.DevStatus;
    }

    /**
     * Set <p>状态 如：all 全部, dev 开发中, audit 审核中 released 已发布</p>
     * @param DevStatus <p>状态 如：all 全部, dev 开发中, audit 审核中 released 已发布</p>
     */
    public void setDevStatus(String DevStatus) {
        this.DevStatus = DevStatus;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>区域</p> 
     * @return Region <p>区域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>区域</p>
     * @param Region <p>区域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>产品类型。如： 0 普通产品 ， 5 网关产品</p> 
     * @return ProductType <p>产品类型。如： 0 普通产品 ， 5 网关产品</p>
     */
    public Long getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>产品类型。如： 0 普通产品 ， 5 网关产品</p>
     * @param ProductType <p>产品类型。如： 0 普通产品 ， 5 网关产品</p>
     */
    public void setProductType(Long ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>产品ModuleId</p> 
     * @return ModuleId <p>产品ModuleId</p>
     */
    public Long getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set <p>产品ModuleId</p>
     * @param ModuleId <p>产品ModuleId</p>
     */
    public void setModuleId(Long ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get <p>是否使用脚本进行二进制转json功能 可以取值 true / false</p> 
     * @return EnableProductScript <p>是否使用脚本进行二进制转json功能 可以取值 true / false</p>
     */
    public String getEnableProductScript() {
        return this.EnableProductScript;
    }

    /**
     * Set <p>是否使用脚本进行二进制转json功能 可以取值 true / false</p>
     * @param EnableProductScript <p>是否使用脚本进行二进制转json功能 可以取值 true / false</p>
     */
    public void setEnableProductScript(String EnableProductScript) {
        this.EnableProductScript = EnableProductScript;
    }

    /**
     * Get <p>创建人 UinId</p> 
     * @return CreateUserId <p>创建人 UinId</p>
     */
    public Long getCreateUserId() {
        return this.CreateUserId;
    }

    /**
     * Set <p>创建人 UinId</p>
     * @param CreateUserId <p>创建人 UinId</p>
     */
    public void setCreateUserId(Long CreateUserId) {
        this.CreateUserId = CreateUserId;
    }

    /**
     * Get <p>创建者昵称</p> 
     * @return CreatorNickName <p>创建者昵称</p>
     */
    public String getCreatorNickName() {
        return this.CreatorNickName;
    }

    /**
     * Set <p>创建者昵称</p>
     * @param CreatorNickName <p>创建者昵称</p>
     */
    public void setCreatorNickName(String CreatorNickName) {
        this.CreatorNickName = CreatorNickName;
    }

    /**
     * Get <p>绑定策略（1：强踢；2：非强踢；0：表示无意义）</p> 
     * @return BindStrategy <p>绑定策略（1：强踢；2：非强踢；0：表示无意义）</p>
     */
    public Long getBindStrategy() {
        return this.BindStrategy;
    }

    /**
     * Set <p>绑定策略（1：强踢；2：非强踢；0：表示无意义）</p>
     * @param BindStrategy <p>绑定策略（1：强踢；2：非强踢；0：表示无意义）</p>
     */
    public void setBindStrategy(Long BindStrategy) {
        this.BindStrategy = BindStrategy;
    }

    /**
     * Get <p>设备数量</p> 
     * @return DeviceCount <p>设备数量</p>
     */
    public Long getDeviceCount() {
        return this.DeviceCount;
    }

    /**
     * Set <p>设备数量</p>
     * @param DeviceCount <p>设备数量</p>
     */
    public void setDeviceCount(Long DeviceCount) {
        this.DeviceCount = DeviceCount;
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
     * Get <p>有效期</p> 
     * @return Period <p>有效期</p>
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>有效期</p>
     * @param Period <p>有效期</p>
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    /**
     * Get <p>互联互通标识</p> 
     * @return IsInterconnection <p>互联互通标识</p>
     */
    public Long getIsInterconnection() {
        return this.IsInterconnection;
    }

    /**
     * Set <p>互联互通标识</p>
     * @param IsInterconnection <p>互联互通标识</p>
     */
    public void setIsInterconnection(Long IsInterconnection) {
        this.IsInterconnection = IsInterconnection;
    }

    /**
     * Get <p>UIN</p> 
     * @return Uin <p>UIN</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>UIN</p>
     * @param Uin <p>UIN</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>AppID</p> 
     * @return AppId <p>AppID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>AppID</p>
     * @param AppId <p>AppID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>绑定的第三方CA名称；空 = 腾讯云CA证书</p> 
     * @return PrivateCAName <p>绑定的第三方CA名称；空 = 腾讯云CA证书</p>
     */
    public String getPrivateCAName() {
        return this.PrivateCAName;
    }

    /**
     * Set <p>绑定的第三方CA名称；空 = 腾讯云CA证书</p>
     * @param PrivateCAName <p>绑定的第三方CA名称；空 = 腾讯云CA证书</p>
     */
    public void setPrivateCAName(String PrivateCAName) {
        this.PrivateCAName = PrivateCAName;
    }

    /**
     * Get <p>true = 第三方CA</p> 
     * @return IsPrivateCA <p>true = 第三方CA</p>
     */
    public Boolean getIsPrivateCA() {
        return this.IsPrivateCA;
    }

    /**
     * Set <p>true = 第三方CA</p>
     * @param IsPrivateCA <p>true = 第三方CA</p>
     */
    public void setIsPrivateCA(Boolean IsPrivateCA) {
        this.IsPrivateCA = IsPrivateCA;
    }

    /**
     * Get <p>CA 证书名称</p> 
     * @return CertName <p>CA 证书名称</p>
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set <p>CA 证书名称</p>
     * @param CertName <p>CA 证书名称</p>
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get <p>证书序列号</p> 
     * @return CertSN <p>证书序列号</p>
     */
    public String getCertSN() {
        return this.CertSN;
    }

    /**
     * Set <p>证书序列号</p>
     * @param CertSN <p>证书序列号</p>
     */
    public void setCertSN(String CertSN) {
        this.CertSN = CertSN;
    }

    /**
     * Get <p>颁发者</p> 
     * @return IssuerName <p>颁发者</p>
     */
    public String getIssuerName() {
        return this.IssuerName;
    }

    /**
     * Set <p>颁发者</p>
     * @param IssuerName <p>颁发者</p>
     */
    public void setIssuerName(String IssuerName) {
        this.IssuerName = IssuerName;
    }

    /**
     * Get <p>证书主题</p> 
     * @return Subject <p>证书主题</p>
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set <p>证书主题</p>
     * @param Subject <p>证书主题</p>
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get <p>生效时间（Unix 秒）</p><p>单位：秒</p> 
     * @return EffectiveTime <p>生效时间（Unix 秒）</p><p>单位：秒</p>
     */
    public Long getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set <p>生效时间（Unix 秒）</p><p>单位：秒</p>
     * @param EffectiveTime <p>生效时间（Unix 秒）</p><p>单位：秒</p>
     */
    public void setEffectiveTime(Long EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get <p>过期时间（Unix 秒）</p><p>单位：秒</p> 
     * @return ExpireTime <p>过期时间（Unix 秒）</p><p>单位：秒</p>
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>过期时间（Unix 秒）</p><p>单位：秒</p>
     * @param ExpireTime <p>过期时间（Unix 秒）</p><p>单位：秒</p>
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>CA 证书 PEM 全文</p> 
     * @return CertText <p>CA 证书 PEM 全文</p>
     */
    public String getCertText() {
        return this.CertText;
    }

    /**
     * Set <p>CA 证书 PEM 全文</p>
     * @param CertText <p>CA 证书 PEM 全文</p>
     */
    public void setCertText(String CertText) {
        this.CertText = CertText;
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
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.PrivateCAName != null) {
            this.PrivateCAName = new String(source.PrivateCAName);
        }
        if (source.IsPrivateCA != null) {
            this.IsPrivateCA = new Boolean(source.IsPrivateCA);
        }
        if (source.CertName != null) {
            this.CertName = new String(source.CertName);
        }
        if (source.CertSN != null) {
            this.CertSN = new String(source.CertSN);
        }
        if (source.IssuerName != null) {
            this.IssuerName = new String(source.IssuerName);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.EffectiveTime != null) {
            this.EffectiveTime = new Long(source.EffectiveTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.CertText != null) {
            this.CertText = new String(source.CertText);
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
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PrivateCAName", this.PrivateCAName);
        this.setParamSimple(map, prefix + "IsPrivateCA", this.IsPrivateCA);
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "CertSN", this.CertSN);
        this.setParamSimple(map, prefix + "IssuerName", this.IssuerName);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamSimple(map, prefix + "EffectiveTime", this.EffectiveTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "CertText", this.CertText);

    }
}

