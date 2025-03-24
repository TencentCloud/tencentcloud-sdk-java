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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WireReceivingInfo extends AbstractModel {

    /**
    * '光纤', '网线', '电源线'
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 数量
    */
    @SerializedName("Quantity")
    @Expose
    private Long Quantity;

    /**
    * '箱', '卷', '套'
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 收货凭证号
    */
    @SerializedName("ReceiptNumber")
    @Expose
    private String ReceiptNumber;

    /**
    * 硬件备注
    */
    @SerializedName("HardwareMemo")
    @Expose
    private String HardwareMemo;

    /**
     * Get '光纤', '网线', '电源线' 
     * @return TypeName '光纤', '网线', '电源线'
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set '光纤', '网线', '电源线'
     * @param TypeName '光纤', '网线', '电源线'
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get 数量 
     * @return Quantity 数量
     */
    public Long getQuantity() {
        return this.Quantity;
    }

    /**
     * Set 数量
     * @param Quantity 数量
     */
    public void setQuantity(Long Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Get '箱', '卷', '套' 
     * @return Unit '箱', '卷', '套'
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set '箱', '卷', '套'
     * @param Unit '箱', '卷', '套'
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 收货凭证号 
     * @return ReceiptNumber 收货凭证号
     */
    public String getReceiptNumber() {
        return this.ReceiptNumber;
    }

    /**
     * Set 收货凭证号
     * @param ReceiptNumber 收货凭证号
     */
    public void setReceiptNumber(String ReceiptNumber) {
        this.ReceiptNumber = ReceiptNumber;
    }

    /**
     * Get 硬件备注 
     * @return HardwareMemo 硬件备注
     */
    public String getHardwareMemo() {
        return this.HardwareMemo;
    }

    /**
     * Set 硬件备注
     * @param HardwareMemo 硬件备注
     */
    public void setHardwareMemo(String HardwareMemo) {
        this.HardwareMemo = HardwareMemo;
    }

    public WireReceivingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WireReceivingInfo(WireReceivingInfo source) {
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.Quantity != null) {
            this.Quantity = new Long(source.Quantity);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.ReceiptNumber != null) {
            this.ReceiptNumber = new String(source.ReceiptNumber);
        }
        if (source.HardwareMemo != null) {
            this.HardwareMemo = new String(source.HardwareMemo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "ReceiptNumber", this.ReceiptNumber);
        this.setParamSimple(map, prefix + "HardwareMemo", this.HardwareMemo);

    }
}

