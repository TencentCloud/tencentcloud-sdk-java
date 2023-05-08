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

public class QuotaInvoice extends AbstractModel{

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
    * 发票消费类型
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 省
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 是否存在二维码（1：有，0：无）
    */
    @SerializedName("QRCodeMark")
    @Expose
    private Long QRCodeMark;

    /**
    * 是否有公司印章（0：没有，1：有）
    */
    @SerializedName("CompanySealMark")
    @Expose
    private Long CompanySealMark;

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
     * Get 发票消费类型 
     * @return Kind 发票消费类型
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 发票消费类型
     * @param Kind 发票消费类型
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 省 
     * @return Province 省
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省
     * @param Province 省
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 市 
     * @return City 市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 市
     * @param City 市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 是否存在二维码（1：有，0：无） 
     * @return QRCodeMark 是否存在二维码（1：有，0：无）
     */
    public Long getQRCodeMark() {
        return this.QRCodeMark;
    }

    /**
     * Set 是否存在二维码（1：有，0：无）
     * @param QRCodeMark 是否存在二维码（1：有，0：无）
     */
    public void setQRCodeMark(Long QRCodeMark) {
        this.QRCodeMark = QRCodeMark;
    }

    /**
     * Get 是否有公司印章（0：没有，1：有） 
     * @return CompanySealMark 是否有公司印章（0：没有，1：有）
     */
    public Long getCompanySealMark() {
        return this.CompanySealMark;
    }

    /**
     * Set 是否有公司印章（0：没有，1：有）
     * @param CompanySealMark 是否有公司印章（0：没有，1：有）
     */
    public void setCompanySealMark(Long CompanySealMark) {
        this.CompanySealMark = CompanySealMark;
    }

    public QuotaInvoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuotaInvoice(QuotaInvoice source) {
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
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.QRCodeMark != null) {
            this.QRCodeMark = new Long(source.QRCodeMark);
        }
        if (source.CompanySealMark != null) {
            this.CompanySealMark = new Long(source.CompanySealMark);
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
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "QRCodeMark", this.QRCodeMark);
        this.setParamSimple(map, prefix + "CompanySealMark", this.CompanySealMark);

    }
}

