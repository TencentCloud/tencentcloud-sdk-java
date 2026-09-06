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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PassInvoiceInfo extends AbstractModel {

    /**
    * <p>通行费车牌号；数电通行费源字段 cph 写入该字段。</p>
    */
    @SerializedName("NumberPlate")
    @Expose
    private String NumberPlate;

    /**
    * <p>通行费类型；数电通行费源字段 cllx 写入该字</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>通行日期起</p>
    */
    @SerializedName("PassDateBegin")
    @Expose
    private String PassDateBegin;

    /**
    * <p>通行日期止</p>
    */
    @SerializedName("PassDateEnd")
    @Expose
    private String PassDateEnd;

    /**
    * <p>税收分类编码</p>
    */
    @SerializedName("TaxClassifyCode")
    @Expose
    private String TaxClassifyCode;

    /**
    * <p>通行费车牌号</p>
    */
    @SerializedName("CarType")
    @Expose
    private String CarType;

    /**
    * <p>通行费车辆类型</p>
    */
    @SerializedName("PlateNumber")
    @Expose
    private String PlateNumber;

    /**
     * Get <p>通行费车牌号；数电通行费源字段 cph 写入该字段。</p> 
     * @return NumberPlate <p>通行费车牌号；数电通行费源字段 cph 写入该字段。</p>
     */
    public String getNumberPlate() {
        return this.NumberPlate;
    }

    /**
     * Set <p>通行费车牌号；数电通行费源字段 cph 写入该字段。</p>
     * @param NumberPlate <p>通行费车牌号；数电通行费源字段 cph 写入该字段。</p>
     */
    public void setNumberPlate(String NumberPlate) {
        this.NumberPlate = NumberPlate;
    }

    /**
     * Get <p>通行费类型；数电通行费源字段 cllx 写入该字</p> 
     * @return Type <p>通行费类型；数电通行费源字段 cllx 写入该字</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>通行费类型；数电通行费源字段 cllx 写入该字</p>
     * @param Type <p>通行费类型；数电通行费源字段 cllx 写入该字</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>通行日期起</p> 
     * @return PassDateBegin <p>通行日期起</p>
     */
    public String getPassDateBegin() {
        return this.PassDateBegin;
    }

    /**
     * Set <p>通行日期起</p>
     * @param PassDateBegin <p>通行日期起</p>
     */
    public void setPassDateBegin(String PassDateBegin) {
        this.PassDateBegin = PassDateBegin;
    }

    /**
     * Get <p>通行日期止</p> 
     * @return PassDateEnd <p>通行日期止</p>
     */
    public String getPassDateEnd() {
        return this.PassDateEnd;
    }

    /**
     * Set <p>通行日期止</p>
     * @param PassDateEnd <p>通行日期止</p>
     */
    public void setPassDateEnd(String PassDateEnd) {
        this.PassDateEnd = PassDateEnd;
    }

    /**
     * Get <p>税收分类编码</p> 
     * @return TaxClassifyCode <p>税收分类编码</p>
     */
    public String getTaxClassifyCode() {
        return this.TaxClassifyCode;
    }

    /**
     * Set <p>税收分类编码</p>
     * @param TaxClassifyCode <p>税收分类编码</p>
     */
    public void setTaxClassifyCode(String TaxClassifyCode) {
        this.TaxClassifyCode = TaxClassifyCode;
    }

    /**
     * Get <p>通行费车牌号</p> 
     * @return CarType <p>通行费车牌号</p>
     */
    public String getCarType() {
        return this.CarType;
    }

    /**
     * Set <p>通行费车牌号</p>
     * @param CarType <p>通行费车牌号</p>
     */
    public void setCarType(String CarType) {
        this.CarType = CarType;
    }

    /**
     * Get <p>通行费车辆类型</p> 
     * @return PlateNumber <p>通行费车辆类型</p>
     */
    public String getPlateNumber() {
        return this.PlateNumber;
    }

    /**
     * Set <p>通行费车辆类型</p>
     * @param PlateNumber <p>通行费车辆类型</p>
     */
    public void setPlateNumber(String PlateNumber) {
        this.PlateNumber = PlateNumber;
    }

    public PassInvoiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PassInvoiceInfo(PassInvoiceInfo source) {
        if (source.NumberPlate != null) {
            this.NumberPlate = new String(source.NumberPlate);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PassDateBegin != null) {
            this.PassDateBegin = new String(source.PassDateBegin);
        }
        if (source.PassDateEnd != null) {
            this.PassDateEnd = new String(source.PassDateEnd);
        }
        if (source.TaxClassifyCode != null) {
            this.TaxClassifyCode = new String(source.TaxClassifyCode);
        }
        if (source.CarType != null) {
            this.CarType = new String(source.CarType);
        }
        if (source.PlateNumber != null) {
            this.PlateNumber = new String(source.PlateNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NumberPlate", this.NumberPlate);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PassDateBegin", this.PassDateBegin);
        this.setParamSimple(map, prefix + "PassDateEnd", this.PassDateEnd);
        this.setParamSimple(map, prefix + "TaxClassifyCode", this.TaxClassifyCode);
        this.setParamSimple(map, prefix + "CarType", this.CarType);
        this.setParamSimple(map, prefix + "PlateNumber", this.PlateNumber);

    }
}

