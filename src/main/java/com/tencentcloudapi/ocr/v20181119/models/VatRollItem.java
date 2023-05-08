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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VatRollItem extends AbstractModel{

    /**
    * 项目名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数量
    */
    @SerializedName("Quantity")
    @Expose
    private String Quantity;

    /**
    * 单价
    */
    @SerializedName("Price")
    @Expose
    private String Price;

    /**
    * 金额
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
     * Get 项目名称 
     * @return Name 项目名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 项目名称
     * @param Name 项目名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数量 
     * @return Quantity 数量
     */
    public String getQuantity() {
        return this.Quantity;
    }

    /**
     * Set 数量
     * @param Quantity 数量
     */
    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Get 单价 
     * @return Price 单价
     */
    public String getPrice() {
        return this.Price;
    }

    /**
     * Set 单价
     * @param Price 单价
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    /**
     * Get 金额 
     * @return Total 金额
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set 金额
     * @param Total 金额
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    public VatRollItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatRollItem(VatRollItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Quantity != null) {
            this.Quantity = new String(source.Quantity);
        }
        if (source.Price != null) {
            this.Price = new String(source.Price);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

