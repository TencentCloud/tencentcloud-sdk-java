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

public class MedicalInvoice extends AbstractModel{

    /**
    * 发票名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 发票代码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 发票号码
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 价税合计（小写）
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * 价税合计（大写）
    */
    @SerializedName("TotalCn")
    @Expose
    private String TotalCn;

    /**
    * 开票日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 校验码
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * 发票属地
    */
    @SerializedName("Place")
    @Expose
    private String Place;

    /**
    * 复核人
    */
    @SerializedName("Reviewer")
    @Expose
    private String Reviewer;

    /**
     * Get 发票名称 
     * @return Title 发票名称
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 发票名称
     * @param Title 发票名称
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 发票代码 
     * @return Code 发票代码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 发票代码
     * @param Code 发票代码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 发票号码 
     * @return Number 发票号码
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set 发票号码
     * @param Number 发票号码
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get 价税合计（小写） 
     * @return Total 价税合计（小写）
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set 价税合计（小写）
     * @param Total 价税合计（小写）
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get 价税合计（大写） 
     * @return TotalCn 价税合计（大写）
     */
    public String getTotalCn() {
        return this.TotalCn;
    }

    /**
     * Set 价税合计（大写）
     * @param TotalCn 价税合计（大写）
     */
    public void setTotalCn(String TotalCn) {
        this.TotalCn = TotalCn;
    }

    /**
     * Get 开票日期 
     * @return Date 开票日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 开票日期
     * @param Date 开票日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 校验码 
     * @return CheckCode 校验码
     */
    public String getCheckCode() {
        return this.CheckCode;
    }

    /**
     * Set 校验码
     * @param CheckCode 校验码
     */
    public void setCheckCode(String CheckCode) {
        this.CheckCode = CheckCode;
    }

    /**
     * Get 发票属地 
     * @return Place 发票属地
     */
    public String getPlace() {
        return this.Place;
    }

    /**
     * Set 发票属地
     * @param Place 发票属地
     */
    public void setPlace(String Place) {
        this.Place = Place;
    }

    /**
     * Get 复核人 
     * @return Reviewer 复核人
     */
    public String getReviewer() {
        return this.Reviewer;
    }

    /**
     * Set 复核人
     * @param Reviewer 复核人
     */
    public void setReviewer(String Reviewer) {
        this.Reviewer = Reviewer;
    }

    public MedicalInvoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MedicalInvoice(MedicalInvoice source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.TotalCn != null) {
            this.TotalCn = new String(source.TotalCn);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.CheckCode != null) {
            this.CheckCode = new String(source.CheckCode);
        }
        if (source.Place != null) {
            this.Place = new String(source.Place);
        }
        if (source.Reviewer != null) {
            this.Reviewer = new String(source.Reviewer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TotalCn", this.TotalCn);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "Place", this.Place);
        this.setParamSimple(map, prefix + "Reviewer", this.Reviewer);

    }
}

