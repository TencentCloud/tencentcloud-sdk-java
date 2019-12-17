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

public class PriceInfo extends AbstractModel{

    /**
    * 域名后缀，例如.com
    */
    @SerializedName("Tld")
    @Expose
    private String Tld;

    /**
    * 购买年限，范围[1-10]
    */
    @SerializedName("Year")
    @Expose
    private Long Year;

    /**
    * 域名原价
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 域名现价
    */
    @SerializedName("RealPrice")
    @Expose
    private Long RealPrice;

    /**
    * 商品的购买类型，新购，续费，赎回，转入，续费并转入
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
     * Get 域名后缀，例如.com 
     * @return Tld 域名后缀，例如.com
     */
    public String getTld() {
        return this.Tld;
    }

    /**
     * Set 域名后缀，例如.com
     * @param Tld 域名后缀，例如.com
     */
    public void setTld(String Tld) {
        this.Tld = Tld;
    }

    /**
     * Get 购买年限，范围[1-10] 
     * @return Year 购买年限，范围[1-10]
     */
    public Long getYear() {
        return this.Year;
    }

    /**
     * Set 购买年限，范围[1-10]
     * @param Year 购买年限，范围[1-10]
     */
    public void setYear(Long Year) {
        this.Year = Year;
    }

    /**
     * Get 域名原价 
     * @return Price 域名原价
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set 域名原价
     * @param Price 域名原价
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * Get 域名现价 
     * @return RealPrice 域名现价
     */
    public Long getRealPrice() {
        return this.RealPrice;
    }

    /**
     * Set 域名现价
     * @param RealPrice 域名现价
     */
    public void setRealPrice(Long RealPrice) {
        this.RealPrice = RealPrice;
    }

    /**
     * Get 商品的购买类型，新购，续费，赎回，转入，续费并转入 
     * @return Operation 商品的购买类型，新购，续费，赎回，转入，续费并转入
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 商品的购买类型，新购，续费，赎回，转入，续费并转入
     * @param Operation 商品的购买类型，新购，续费，赎回，转入，续费并转入
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tld", this.Tld);
        this.setParamSimple(map, prefix + "Year", this.Year);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "RealPrice", this.RealPrice);
        this.setParamSimple(map, prefix + "Operation", this.Operation);

    }
}

