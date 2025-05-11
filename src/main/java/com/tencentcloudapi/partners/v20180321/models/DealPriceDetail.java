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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DealPriceDetail extends AbstractModel {

    /**
    * 子订单号
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * 订单归属人uin（代客uin）
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 子产品价格详情列表
    */
    @SerializedName("SubProductPriceDetail")
    @Expose
    private SubProductPriceDetail [] SubProductPriceDetail;

    /**
     * Get 子订单号 
     * @return DealName 子订单号
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 子订单号
     * @param DealName 子订单号
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get 订单归属人uin（代客uin） 
     * @return OwnerUin 订单归属人uin（代客uin）
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 订单归属人uin（代客uin）
     * @param OwnerUin 订单归属人uin（代客uin）
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 子产品价格详情列表 
     * @return SubProductPriceDetail 子产品价格详情列表
     */
    public SubProductPriceDetail [] getSubProductPriceDetail() {
        return this.SubProductPriceDetail;
    }

    /**
     * Set 子产品价格详情列表
     * @param SubProductPriceDetail 子产品价格详情列表
     */
    public void setSubProductPriceDetail(SubProductPriceDetail [] SubProductPriceDetail) {
        this.SubProductPriceDetail = SubProductPriceDetail;
    }

    public DealPriceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DealPriceDetail(DealPriceDetail source) {
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.SubProductPriceDetail != null) {
            this.SubProductPriceDetail = new SubProductPriceDetail[source.SubProductPriceDetail.length];
            for (int i = 0; i < source.SubProductPriceDetail.length; i++) {
                this.SubProductPriceDetail[i] = new SubProductPriceDetail(source.SubProductPriceDetail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamArrayObj(map, prefix + "SubProductPriceDetail.", this.SubProductPriceDetail);

    }
}

