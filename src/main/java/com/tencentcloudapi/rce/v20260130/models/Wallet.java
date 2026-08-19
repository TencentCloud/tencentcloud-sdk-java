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

public class Wallet extends AbstractModel {

    /**
    * <p>钱包类型</p><p>枚举值：</p><ul><li>crypto： 加密货币</li><li>digital： 数字货币</li><li>fiat： 法币</li></ul>
    */
    @SerializedName("WalletType")
    @Expose
    private String WalletType;

    /**
    * <p>钱包地址，通常为钱包的唯一标识</p>
    */
    @SerializedName("WalletAddress")
    @Expose
    private String WalletAddress;

    /**
    * <p>钱包归属人姓名</p>
    */
    @SerializedName("WalletHolderName")
    @Expose
    private String WalletHolderName;

    /**
    * <p>钱包供应商，wechat、alipay、paypal等</p>
    */
    @SerializedName("WalletProvider")
    @Expose
    private String WalletProvider;

    /**
     * Get <p>钱包类型</p><p>枚举值：</p><ul><li>crypto： 加密货币</li><li>digital： 数字货币</li><li>fiat： 法币</li></ul> 
     * @return WalletType <p>钱包类型</p><p>枚举值：</p><ul><li>crypto： 加密货币</li><li>digital： 数字货币</li><li>fiat： 法币</li></ul>
     */
    public String getWalletType() {
        return this.WalletType;
    }

    /**
     * Set <p>钱包类型</p><p>枚举值：</p><ul><li>crypto： 加密货币</li><li>digital： 数字货币</li><li>fiat： 法币</li></ul>
     * @param WalletType <p>钱包类型</p><p>枚举值：</p><ul><li>crypto： 加密货币</li><li>digital： 数字货币</li><li>fiat： 法币</li></ul>
     */
    public void setWalletType(String WalletType) {
        this.WalletType = WalletType;
    }

    /**
     * Get <p>钱包地址，通常为钱包的唯一标识</p> 
     * @return WalletAddress <p>钱包地址，通常为钱包的唯一标识</p>
     */
    public String getWalletAddress() {
        return this.WalletAddress;
    }

    /**
     * Set <p>钱包地址，通常为钱包的唯一标识</p>
     * @param WalletAddress <p>钱包地址，通常为钱包的唯一标识</p>
     */
    public void setWalletAddress(String WalletAddress) {
        this.WalletAddress = WalletAddress;
    }

    /**
     * Get <p>钱包归属人姓名</p> 
     * @return WalletHolderName <p>钱包归属人姓名</p>
     */
    public String getWalletHolderName() {
        return this.WalletHolderName;
    }

    /**
     * Set <p>钱包归属人姓名</p>
     * @param WalletHolderName <p>钱包归属人姓名</p>
     */
    public void setWalletHolderName(String WalletHolderName) {
        this.WalletHolderName = WalletHolderName;
    }

    /**
     * Get <p>钱包供应商，wechat、alipay、paypal等</p> 
     * @return WalletProvider <p>钱包供应商，wechat、alipay、paypal等</p>
     */
    public String getWalletProvider() {
        return this.WalletProvider;
    }

    /**
     * Set <p>钱包供应商，wechat、alipay、paypal等</p>
     * @param WalletProvider <p>钱包供应商，wechat、alipay、paypal等</p>
     */
    public void setWalletProvider(String WalletProvider) {
        this.WalletProvider = WalletProvider;
    }

    public Wallet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Wallet(Wallet source) {
        if (source.WalletType != null) {
            this.WalletType = new String(source.WalletType);
        }
        if (source.WalletAddress != null) {
            this.WalletAddress = new String(source.WalletAddress);
        }
        if (source.WalletHolderName != null) {
            this.WalletHolderName = new String(source.WalletHolderName);
        }
        if (source.WalletProvider != null) {
            this.WalletProvider = new String(source.WalletProvider);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WalletType", this.WalletType);
        this.setParamSimple(map, prefix + "WalletAddress", this.WalletAddress);
        this.setParamSimple(map, prefix + "WalletHolderName", this.WalletHolderName);
        this.setParamSimple(map, prefix + "WalletProvider", this.WalletProvider);

    }
}

