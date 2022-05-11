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

public class PassInvoiceInfo extends AbstractModel{

    /**
    * 通行费车牌号
    */
    @SerializedName("NumberPlate")
    @Expose
    private String NumberPlate;

    /**
    * 通行费类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 通行日期起
    */
    @SerializedName("PassDateBegin")
    @Expose
    private String PassDateBegin;

    /**
    * 通行日期止
    */
    @SerializedName("PassDateEnd")
    @Expose
    private String PassDateEnd;

    /**
    * 税收分类编码
    */
    @SerializedName("TaxClassifyCode")
    @Expose
    private String TaxClassifyCode;

    /**
     * Get 通行费车牌号 
     * @return NumberPlate 通行费车牌号
     */
    public String getNumberPlate() {
        return this.NumberPlate;
    }

    /**
     * Set 通行费车牌号
     * @param NumberPlate 通行费车牌号
     */
    public void setNumberPlate(String NumberPlate) {
        this.NumberPlate = NumberPlate;
    }

    /**
     * Get 通行费类型 
     * @return Type 通行费类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 通行费类型
     * @param Type 通行费类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 通行日期起 
     * @return PassDateBegin 通行日期起
     */
    public String getPassDateBegin() {
        return this.PassDateBegin;
    }

    /**
     * Set 通行日期起
     * @param PassDateBegin 通行日期起
     */
    public void setPassDateBegin(String PassDateBegin) {
        this.PassDateBegin = PassDateBegin;
    }

    /**
     * Get 通行日期止 
     * @return PassDateEnd 通行日期止
     */
    public String getPassDateEnd() {
        return this.PassDateEnd;
    }

    /**
     * Set 通行日期止
     * @param PassDateEnd 通行日期止
     */
    public void setPassDateEnd(String PassDateEnd) {
        this.PassDateEnd = PassDateEnd;
    }

    /**
     * Get 税收分类编码 
     * @return TaxClassifyCode 税收分类编码
     */
    public String getTaxClassifyCode() {
        return this.TaxClassifyCode;
    }

    /**
     * Set 税收分类编码
     * @param TaxClassifyCode 税收分类编码
     */
    public void setTaxClassifyCode(String TaxClassifyCode) {
        this.TaxClassifyCode = TaxClassifyCode;
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

    }
}

