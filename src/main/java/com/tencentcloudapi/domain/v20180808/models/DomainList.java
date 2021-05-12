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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainList extends AbstractModel{

    /**
    * 是否是溢价域名：
ture 是    
false 不是
    */
    @SerializedName("IsPremium")
    @Expose
    private Boolean IsPremium;

    /**
    * 域名资源ID。
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 域名名称。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 是否已设置自动续费 。
0：未设置 
1：已设置
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * 注册时间。
    */
    @SerializedName("CreationDate")
    @Expose
    private String CreationDate;

    /**
    * 到期时间。
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * 域名后缀
    */
    @SerializedName("Tld")
    @Expose
    private String Tld;

    /**
    * 编码后的后缀（中文会进行编码）
    */
    @SerializedName("CodeTld")
    @Expose
    private String CodeTld;

    /**
    * 域名购买状态。
ok：正常
AboutToExpire: 即将到期
RegisterPending：注册中
RegisterDoing：注册中
RegisterFailed：注册失败
RenewPending：续费期
RenewDoing：续费中
RedemptionPending：赎回期
RedemptionDoing：赎回中
TransferPending：转入中
TransferTransing：转入中
TransferFailed：转入失败
    */
    @SerializedName("BuyStatus")
    @Expose
    private String BuyStatus;

    /**
     * Get 是否是溢价域名：
ture 是    
false 不是 
     * @return IsPremium 是否是溢价域名：
ture 是    
false 不是
     */
    public Boolean getIsPremium() {
        return this.IsPremium;
    }

    /**
     * Set 是否是溢价域名：
ture 是    
false 不是
     * @param IsPremium 是否是溢价域名：
ture 是    
false 不是
     */
    public void setIsPremium(Boolean IsPremium) {
        this.IsPremium = IsPremium;
    }

    /**
     * Get 域名资源ID。 
     * @return DomainId 域名资源ID。
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名资源ID。
     * @param DomainId 域名资源ID。
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 域名名称。 
     * @return DomainName 域名名称。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 域名名称。
     * @param DomainName 域名名称。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 是否已设置自动续费 。
0：未设置 
1：已设置 
     * @return AutoRenew 是否已设置自动续费 。
0：未设置 
1：已设置
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 是否已设置自动续费 。
0：未设置 
1：已设置
     * @param AutoRenew 是否已设置自动续费 。
0：未设置 
1：已设置
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 注册时间。 
     * @return CreationDate 注册时间。
     */
    public String getCreationDate() {
        return this.CreationDate;
    }

    /**
     * Set 注册时间。
     * @param CreationDate 注册时间。
     */
    public void setCreationDate(String CreationDate) {
        this.CreationDate = CreationDate;
    }

    /**
     * Get 到期时间。 
     * @return ExpirationDate 到期时间。
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set 到期时间。
     * @param ExpirationDate 到期时间。
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get 域名后缀 
     * @return Tld 域名后缀
     */
    public String getTld() {
        return this.Tld;
    }

    /**
     * Set 域名后缀
     * @param Tld 域名后缀
     */
    public void setTld(String Tld) {
        this.Tld = Tld;
    }

    /**
     * Get 编码后的后缀（中文会进行编码） 
     * @return CodeTld 编码后的后缀（中文会进行编码）
     */
    public String getCodeTld() {
        return this.CodeTld;
    }

    /**
     * Set 编码后的后缀（中文会进行编码）
     * @param CodeTld 编码后的后缀（中文会进行编码）
     */
    public void setCodeTld(String CodeTld) {
        this.CodeTld = CodeTld;
    }

    /**
     * Get 域名购买状态。
ok：正常
AboutToExpire: 即将到期
RegisterPending：注册中
RegisterDoing：注册中
RegisterFailed：注册失败
RenewPending：续费期
RenewDoing：续费中
RedemptionPending：赎回期
RedemptionDoing：赎回中
TransferPending：转入中
TransferTransing：转入中
TransferFailed：转入失败 
     * @return BuyStatus 域名购买状态。
ok：正常
AboutToExpire: 即将到期
RegisterPending：注册中
RegisterDoing：注册中
RegisterFailed：注册失败
RenewPending：续费期
RenewDoing：续费中
RedemptionPending：赎回期
RedemptionDoing：赎回中
TransferPending：转入中
TransferTransing：转入中
TransferFailed：转入失败
     */
    public String getBuyStatus() {
        return this.BuyStatus;
    }

    /**
     * Set 域名购买状态。
ok：正常
AboutToExpire: 即将到期
RegisterPending：注册中
RegisterDoing：注册中
RegisterFailed：注册失败
RenewPending：续费期
RenewDoing：续费中
RedemptionPending：赎回期
RedemptionDoing：赎回中
TransferPending：转入中
TransferTransing：转入中
TransferFailed：转入失败
     * @param BuyStatus 域名购买状态。
ok：正常
AboutToExpire: 即将到期
RegisterPending：注册中
RegisterDoing：注册中
RegisterFailed：注册失败
RenewPending：续费期
RenewDoing：续费中
RedemptionPending：赎回期
RedemptionDoing：赎回中
TransferPending：转入中
TransferTransing：转入中
TransferFailed：转入失败
     */
    public void setBuyStatus(String BuyStatus) {
        this.BuyStatus = BuyStatus;
    }

    public DomainList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainList(DomainList source) {
        if (source.IsPremium != null) {
            this.IsPremium = new Boolean(source.IsPremium);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.CreationDate != null) {
            this.CreationDate = new String(source.CreationDate);
        }
        if (source.ExpirationDate != null) {
            this.ExpirationDate = new String(source.ExpirationDate);
        }
        if (source.Tld != null) {
            this.Tld = new String(source.Tld);
        }
        if (source.CodeTld != null) {
            this.CodeTld = new String(source.CodeTld);
        }
        if (source.BuyStatus != null) {
            this.BuyStatus = new String(source.BuyStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsPremium", this.IsPremium);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "CreationDate", this.CreationDate);
        this.setParamSimple(map, prefix + "ExpirationDate", this.ExpirationDate);
        this.setParamSimple(map, prefix + "Tld", this.Tld);
        this.setParamSimple(map, prefix + "CodeTld", this.CodeTld);
        this.setParamSimple(map, prefix + "BuyStatus", this.BuyStatus);

    }
}

