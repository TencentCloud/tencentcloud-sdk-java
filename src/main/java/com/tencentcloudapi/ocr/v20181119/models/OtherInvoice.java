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

public class OtherInvoice extends AbstractModel{

    /**
    * 发票名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 金额
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * 列表
    */
    @SerializedName("OtherInvoiceListItems")
    @Expose
    private OtherInvoiceItem [] OtherInvoiceListItems;

    /**
    * 表格
    */
    @SerializedName("OtherInvoiceTableItems")
    @Expose
    private OtherInvoiceList [] OtherInvoiceTableItems;

    /**
    * 发票日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

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

    /**
     * Get 列表 
     * @return OtherInvoiceListItems 列表
     */
    public OtherInvoiceItem [] getOtherInvoiceListItems() {
        return this.OtherInvoiceListItems;
    }

    /**
     * Set 列表
     * @param OtherInvoiceListItems 列表
     */
    public void setOtherInvoiceListItems(OtherInvoiceItem [] OtherInvoiceListItems) {
        this.OtherInvoiceListItems = OtherInvoiceListItems;
    }

    /**
     * Get 表格 
     * @return OtherInvoiceTableItems 表格
     */
    public OtherInvoiceList [] getOtherInvoiceTableItems() {
        return this.OtherInvoiceTableItems;
    }

    /**
     * Set 表格
     * @param OtherInvoiceTableItems 表格
     */
    public void setOtherInvoiceTableItems(OtherInvoiceList [] OtherInvoiceTableItems) {
        this.OtherInvoiceTableItems = OtherInvoiceTableItems;
    }

    /**
     * Get 发票日期 
     * @return Date 发票日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 发票日期
     * @param Date 发票日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    public OtherInvoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OtherInvoice(OtherInvoice source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.OtherInvoiceListItems != null) {
            this.OtherInvoiceListItems = new OtherInvoiceItem[source.OtherInvoiceListItems.length];
            for (int i = 0; i < source.OtherInvoiceListItems.length; i++) {
                this.OtherInvoiceListItems[i] = new OtherInvoiceItem(source.OtherInvoiceListItems[i]);
            }
        }
        if (source.OtherInvoiceTableItems != null) {
            this.OtherInvoiceTableItems = new OtherInvoiceList[source.OtherInvoiceTableItems.length];
            for (int i = 0; i < source.OtherInvoiceTableItems.length; i++) {
                this.OtherInvoiceTableItems[i] = new OtherInvoiceList(source.OtherInvoiceTableItems[i]);
            }
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "OtherInvoiceListItems.", this.OtherInvoiceListItems);
        this.setParamArrayObj(map, prefix + "OtherInvoiceTableItems.", this.OtherInvoiceTableItems);
        this.setParamSimple(map, prefix + "Date", this.Date);

    }
}

