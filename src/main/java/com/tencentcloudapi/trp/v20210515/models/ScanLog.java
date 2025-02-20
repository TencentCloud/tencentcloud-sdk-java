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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanLog extends AbstractModel {

    /**
    * 行ID
    */
    @SerializedName("LogId")
    @Expose
    private Long LogId;

    /**
    * 微信openid
    */
    @SerializedName("Openid")
    @Expose
    private String Openid;

    /**
    * 微信昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 商户ID
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 商品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * ip地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 国家
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 省份
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 城市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 县/区
    */
    @SerializedName("District")
    @Expose
    private String District;

    /**
    * 微信 unionid
    */
    @SerializedName("Unionid")
    @Expose
    private String Unionid;

    /**
    * 首次扫码 0:否, 1:是
    */
    @SerializedName("First")
    @Expose
    private Long First;

    /**
    * 批次ID
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 扫码类型 0:无效扫码 1: 小程序扫码 2: 商家扫码
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 商户名称
    */
    @SerializedName("MerchantName")
    @Expose
    private String MerchantName;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 产品Logo
    */
    @SerializedName("ProductLogo")
    @Expose
    private String ProductLogo;

    /**
    * 风险状态
0: 未知, 1:通过, 2:失败/风险, 3:存疑
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否开启验证
0:否, 1:是
    */
    @SerializedName("Verify")
    @Expose
    private Long Verify;

    /**
     * Get 行ID 
     * @return LogId 行ID
     */
    public Long getLogId() {
        return this.LogId;
    }

    /**
     * Set 行ID
     * @param LogId 行ID
     */
    public void setLogId(Long LogId) {
        this.LogId = LogId;
    }

    /**
     * Get 微信openid 
     * @return Openid 微信openid
     */
    public String getOpenid() {
        return this.Openid;
    }

    /**
     * Set 微信openid
     * @param Openid 微信openid
     */
    public void setOpenid(String Openid) {
        this.Openid = Openid;
    }

    /**
     * Get 微信昵称 
     * @return Nickname 微信昵称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 微信昵称
     * @param Nickname 微信昵称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 码 
     * @return Code 码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 码
     * @param Code 码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 企业ID 
     * @return CorpId 企业ID
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
     * @param CorpId 企业ID
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 商户ID 
     * @return MerchantId 商户ID
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户ID
     * @param MerchantId 商户ID
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 商品ID 
     * @return ProductId 商品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 商品ID
     * @param ProductId 商品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get ip地址 
     * @return Ip ip地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set ip地址
     * @param Ip ip地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 国家 
     * @return Country 国家
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 国家
     * @param Country 国家
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 省份 
     * @return Province 省份
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省份
     * @param Province 省份
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 城市 
     * @return City 城市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 城市
     * @param City 城市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 县/区 
     * @return District 县/区
     */
    public String getDistrict() {
        return this.District;
    }

    /**
     * Set 县/区
     * @param District 县/区
     */
    public void setDistrict(String District) {
        this.District = District;
    }

    /**
     * Get 微信 unionid 
     * @return Unionid 微信 unionid
     */
    public String getUnionid() {
        return this.Unionid;
    }

    /**
     * Set 微信 unionid
     * @param Unionid 微信 unionid
     */
    public void setUnionid(String Unionid) {
        this.Unionid = Unionid;
    }

    /**
     * Get 首次扫码 0:否, 1:是 
     * @return First 首次扫码 0:否, 1:是
     */
    public Long getFirst() {
        return this.First;
    }

    /**
     * Set 首次扫码 0:否, 1:是
     * @param First 首次扫码 0:否, 1:是
     */
    public void setFirst(Long First) {
        this.First = First;
    }

    /**
     * Get 批次ID 
     * @return BatchId 批次ID
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 批次ID
     * @param BatchId 批次ID
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 扫码类型 0:无效扫码 1: 小程序扫码 2: 商家扫码 
     * @return Type 扫码类型 0:无效扫码 1: 小程序扫码 2: 商家扫码
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 扫码类型 0:无效扫码 1: 小程序扫码 2: 商家扫码
     * @param Type 扫码类型 0:无效扫码 1: 小程序扫码 2: 商家扫码
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 商户名称 
     * @return MerchantName 商户名称
     */
    public String getMerchantName() {
        return this.MerchantName;
    }

    /**
     * Set 商户名称
     * @param MerchantName 商户名称
     */
    public void setMerchantName(String MerchantName) {
        this.MerchantName = MerchantName;
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
     * Get 产品Logo 
     * @return ProductLogo 产品Logo
     */
    public String getProductLogo() {
        return this.ProductLogo;
    }

    /**
     * Set 产品Logo
     * @param ProductLogo 产品Logo
     */
    public void setProductLogo(String ProductLogo) {
        this.ProductLogo = ProductLogo;
    }

    /**
     * Get 风险状态
0: 未知, 1:通过, 2:失败/风险, 3:存疑 
     * @return Status 风险状态
0: 未知, 1:通过, 2:失败/风险, 3:存疑
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 风险状态
0: 未知, 1:通过, 2:失败/风险, 3:存疑
     * @param Status 风险状态
0: 未知, 1:通过, 2:失败/风险, 3:存疑
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否开启验证
0:否, 1:是 
     * @return Verify 是否开启验证
0:否, 1:是
     */
    public Long getVerify() {
        return this.Verify;
    }

    /**
     * Set 是否开启验证
0:否, 1:是
     * @param Verify 是否开启验证
0:否, 1:是
     */
    public void setVerify(Long Verify) {
        this.Verify = Verify;
    }

    public ScanLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanLog(ScanLog source) {
        if (source.LogId != null) {
            this.LogId = new Long(source.LogId);
        }
        if (source.Openid != null) {
            this.Openid = new String(source.Openid);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.District != null) {
            this.District = new String(source.District);
        }
        if (source.Unionid != null) {
            this.Unionid = new String(source.Unionid);
        }
        if (source.First != null) {
            this.First = new Long(source.First);
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.MerchantName != null) {
            this.MerchantName = new String(source.MerchantName);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ProductLogo != null) {
            this.ProductLogo = new String(source.ProductLogo);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Verify != null) {
            this.Verify = new Long(source.Verify);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamSimple(map, prefix + "Openid", this.Openid);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "District", this.District);
        this.setParamSimple(map, prefix + "Unionid", this.Unionid);
        this.setParamSimple(map, prefix + "First", this.First);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "MerchantName", this.MerchantName);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProductLogo", this.ProductLogo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Verify", this.Verify);

    }
}

