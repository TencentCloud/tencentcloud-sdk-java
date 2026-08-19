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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Card extends AbstractModel {

    /**
    * <p>发卡行识别码卡号前6位</p><p>参数格式：符合ISO 13616-1标准</p>
    */
    @SerializedName("CardBin")
    @Expose
    private String CardBin;

    /**
    * <p>发卡行识别码卡号后4位</p><p>参数格式：符合ISO 13616-1标准</p>
    */
    @SerializedName("LastFourDigits")
    @Expose
    private String LastFourDigits;

    /**
    * <p>发行国家</p>
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * <p>发行银行</p>
    */
    @SerializedName("Bank")
    @Expose
    private String Bank;

    /**
    * <p>支付卡类型</p><p>枚举值：</p><ul><li>credit： 信用卡</li><li>debit： 借记卡</li><li>charge： 签账卡</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>支付卡品牌</p>
    */
    @SerializedName("Brand")
    @Expose
    private String Brand;

    /**
    * <p>支付卡等级</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>持有者姓名</p>
    */
    @SerializedName("HolderName")
    @Expose
    private String HolderName;

    /**
    * <p>过期日期</p><p>参数格式：YYYY-MM-DD</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get <p>发卡行识别码卡号前6位</p><p>参数格式：符合ISO 13616-1标准</p> 
     * @return CardBin <p>发卡行识别码卡号前6位</p><p>参数格式：符合ISO 13616-1标准</p>
     */
    public String getCardBin() {
        return this.CardBin;
    }

    /**
     * Set <p>发卡行识别码卡号前6位</p><p>参数格式：符合ISO 13616-1标准</p>
     * @param CardBin <p>发卡行识别码卡号前6位</p><p>参数格式：符合ISO 13616-1标准</p>
     */
    public void setCardBin(String CardBin) {
        this.CardBin = CardBin;
    }

    /**
     * Get <p>发卡行识别码卡号后4位</p><p>参数格式：符合ISO 13616-1标准</p> 
     * @return LastFourDigits <p>发卡行识别码卡号后4位</p><p>参数格式：符合ISO 13616-1标准</p>
     */
    public String getLastFourDigits() {
        return this.LastFourDigits;
    }

    /**
     * Set <p>发卡行识别码卡号后4位</p><p>参数格式：符合ISO 13616-1标准</p>
     * @param LastFourDigits <p>发卡行识别码卡号后4位</p><p>参数格式：符合ISO 13616-1标准</p>
     */
    public void setLastFourDigits(String LastFourDigits) {
        this.LastFourDigits = LastFourDigits;
    }

    /**
     * Get <p>发行国家</p> 
     * @return Country <p>发行国家</p>
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set <p>发行国家</p>
     * @param Country <p>发行国家</p>
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get <p>发行银行</p> 
     * @return Bank <p>发行银行</p>
     */
    public String getBank() {
        return this.Bank;
    }

    /**
     * Set <p>发行银行</p>
     * @param Bank <p>发行银行</p>
     */
    public void setBank(String Bank) {
        this.Bank = Bank;
    }

    /**
     * Get <p>支付卡类型</p><p>枚举值：</p><ul><li>credit： 信用卡</li><li>debit： 借记卡</li><li>charge： 签账卡</li></ul> 
     * @return Type <p>支付卡类型</p><p>枚举值：</p><ul><li>credit： 信用卡</li><li>debit： 借记卡</li><li>charge： 签账卡</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>支付卡类型</p><p>枚举值：</p><ul><li>credit： 信用卡</li><li>debit： 借记卡</li><li>charge： 签账卡</li></ul>
     * @param Type <p>支付卡类型</p><p>枚举值：</p><ul><li>credit： 信用卡</li><li>debit： 借记卡</li><li>charge： 签账卡</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>支付卡品牌</p> 
     * @return Brand <p>支付卡品牌</p>
     */
    public String getBrand() {
        return this.Brand;
    }

    /**
     * Set <p>支付卡品牌</p>
     * @param Brand <p>支付卡品牌</p>
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * Get <p>支付卡等级</p> 
     * @return Level <p>支付卡等级</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>支付卡等级</p>
     * @param Level <p>支付卡等级</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>持有者姓名</p> 
     * @return HolderName <p>持有者姓名</p>
     */
    public String getHolderName() {
        return this.HolderName;
    }

    /**
     * Set <p>持有者姓名</p>
     * @param HolderName <p>持有者姓名</p>
     */
    public void setHolderName(String HolderName) {
        this.HolderName = HolderName;
    }

    /**
     * Get <p>过期日期</p><p>参数格式：YYYY-MM-DD</p> 
     * @return ExpireTime <p>过期日期</p><p>参数格式：YYYY-MM-DD</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>过期日期</p><p>参数格式：YYYY-MM-DD</p>
     * @param ExpireTime <p>过期日期</p><p>参数格式：YYYY-MM-DD</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public Card() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Card(Card source) {
        if (source.CardBin != null) {
            this.CardBin = new String(source.CardBin);
        }
        if (source.LastFourDigits != null) {
            this.LastFourDigits = new String(source.LastFourDigits);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Bank != null) {
            this.Bank = new String(source.Bank);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Brand != null) {
            this.Brand = new String(source.Brand);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.HolderName != null) {
            this.HolderName = new String(source.HolderName);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CardBin", this.CardBin);
        this.setParamSimple(map, prefix + "LastFourDigits", this.LastFourDigits);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Bank", this.Bank);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "HolderName", this.HolderName);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

