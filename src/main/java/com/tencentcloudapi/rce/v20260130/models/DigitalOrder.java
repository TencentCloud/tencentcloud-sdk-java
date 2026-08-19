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

public class DigitalOrder extends AbstractModel {

    /**
    * <p>数字资产</p>
    */
    @SerializedName("DigitalAsset")
    @Expose
    private String DigitalAsset;

    /**
    * <p>数字资产类型</p><p>枚举值：</p><ul><li>coin： 代币</li><li>commodity： 大宗商品</li><li>crypto： 加密货币</li><li>fiat： 法币</li><li>token： 通证</li><li>stock： 股票</li><li>bond： 债券</li></ul>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>订单类型</p><p>枚举值：</p><ul><li>limit： 限价单</li><li>market： 市价单</li><li>stop_limit： 止损限价单</li><li>stop_loss： 止损单</li><li>take_profit： 止盈单</li><li>take_profit_limit： 止盈限价单</li></ul>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * <p>数字资产的数量</p>
    */
    @SerializedName("Volume")
    @Expose
    private Float Volume;

    /**
     * Get <p>数字资产</p> 
     * @return DigitalAsset <p>数字资产</p>
     */
    public String getDigitalAsset() {
        return this.DigitalAsset;
    }

    /**
     * Set <p>数字资产</p>
     * @param DigitalAsset <p>数字资产</p>
     */
    public void setDigitalAsset(String DigitalAsset) {
        this.DigitalAsset = DigitalAsset;
    }

    /**
     * Get <p>数字资产类型</p><p>枚举值：</p><ul><li>coin： 代币</li><li>commodity： 大宗商品</li><li>crypto： 加密货币</li><li>fiat： 法币</li><li>token： 通证</li><li>stock： 股票</li><li>bond： 债券</li></ul> 
     * @return AssetType <p>数字资产类型</p><p>枚举值：</p><ul><li>coin： 代币</li><li>commodity： 大宗商品</li><li>crypto： 加密货币</li><li>fiat： 法币</li><li>token： 通证</li><li>stock： 股票</li><li>bond： 债券</li></ul>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>数字资产类型</p><p>枚举值：</p><ul><li>coin： 代币</li><li>commodity： 大宗商品</li><li>crypto： 加密货币</li><li>fiat： 法币</li><li>token： 通证</li><li>stock： 股票</li><li>bond： 债券</li></ul>
     * @param AssetType <p>数字资产类型</p><p>枚举值：</p><ul><li>coin： 代币</li><li>commodity： 大宗商品</li><li>crypto： 加密货币</li><li>fiat： 法币</li><li>token： 通证</li><li>stock： 股票</li><li>bond： 债券</li></ul>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>订单类型</p><p>枚举值：</p><ul><li>limit： 限价单</li><li>market： 市价单</li><li>stop_limit： 止损限价单</li><li>stop_loss： 止损单</li><li>take_profit： 止盈单</li><li>take_profit_limit： 止盈限价单</li></ul> 
     * @return OrderType <p>订单类型</p><p>枚举值：</p><ul><li>limit： 限价单</li><li>market： 市价单</li><li>stop_limit： 止损限价单</li><li>stop_loss： 止损单</li><li>take_profit： 止盈单</li><li>take_profit_limit： 止盈限价单</li></ul>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>订单类型</p><p>枚举值：</p><ul><li>limit： 限价单</li><li>market： 市价单</li><li>stop_limit： 止损限价单</li><li>stop_loss： 止损单</li><li>take_profit： 止盈单</li><li>take_profit_limit： 止盈限价单</li></ul>
     * @param OrderType <p>订单类型</p><p>枚举值：</p><ul><li>limit： 限价单</li><li>market： 市价单</li><li>stop_limit： 止损限价单</li><li>stop_loss： 止损单</li><li>take_profit： 止盈单</li><li>take_profit_limit： 止盈限价单</li></ul>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>数字资产的数量</p> 
     * @return Volume <p>数字资产的数量</p>
     */
    public Float getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>数字资产的数量</p>
     * @param Volume <p>数字资产的数量</p>
     */
    public void setVolume(Float Volume) {
        this.Volume = Volume;
    }

    public DigitalOrder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DigitalOrder(DigitalOrder source) {
        if (source.DigitalAsset != null) {
            this.DigitalAsset = new String(source.DigitalAsset);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.Volume != null) {
            this.Volume = new Float(source.Volume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DigitalAsset", this.DigitalAsset);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "Volume", this.Volume);

    }
}

