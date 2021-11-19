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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstancePricesPartDetail extends AbstractModel{

    /**
    * cpu的价格信息
    */
    @SerializedName("CpuPrice")
    @Expose
    private PriceDetail CpuPrice;

    /**
    * 内存价格信息
    */
    @SerializedName("MemPrice")
    @Expose
    private PriceDetail MemPrice;

    /**
    * 磁盘价格信息
    */
    @SerializedName("DisksPrice")
    @Expose
    private PriceDetail DisksPrice;

    /**
     * Get cpu的价格信息 
     * @return CpuPrice cpu的价格信息
     */
    public PriceDetail getCpuPrice() {
        return this.CpuPrice;
    }

    /**
     * Set cpu的价格信息
     * @param CpuPrice cpu的价格信息
     */
    public void setCpuPrice(PriceDetail CpuPrice) {
        this.CpuPrice = CpuPrice;
    }

    /**
     * Get 内存价格信息 
     * @return MemPrice 内存价格信息
     */
    public PriceDetail getMemPrice() {
        return this.MemPrice;
    }

    /**
     * Set 内存价格信息
     * @param MemPrice 内存价格信息
     */
    public void setMemPrice(PriceDetail MemPrice) {
        this.MemPrice = MemPrice;
    }

    /**
     * Get 磁盘价格信息 
     * @return DisksPrice 磁盘价格信息
     */
    public PriceDetail getDisksPrice() {
        return this.DisksPrice;
    }

    /**
     * Set 磁盘价格信息
     * @param DisksPrice 磁盘价格信息
     */
    public void setDisksPrice(PriceDetail DisksPrice) {
        this.DisksPrice = DisksPrice;
    }

    public InstancePricesPartDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstancePricesPartDetail(InstancePricesPartDetail source) {
        if (source.CpuPrice != null) {
            this.CpuPrice = new PriceDetail(source.CpuPrice);
        }
        if (source.MemPrice != null) {
            this.MemPrice = new PriceDetail(source.MemPrice);
        }
        if (source.DisksPrice != null) {
            this.DisksPrice = new PriceDetail(source.DisksPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CpuPrice.", this.CpuPrice);
        this.setParamObj(map, prefix + "MemPrice.", this.MemPrice);
        this.setParamObj(map, prefix + "DisksPrice.", this.DisksPrice);

    }
}

