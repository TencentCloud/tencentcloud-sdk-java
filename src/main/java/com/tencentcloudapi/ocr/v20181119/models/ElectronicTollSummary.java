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

public class ElectronicTollSummary extends AbstractModel {

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
    @SerializedName("Items")
    @Expose
    private ElectronicTollSummaryItem [] Items;

    /**
    * 表格
    */
    @SerializedName("TableItems")
    @Expose
    private ElectronicTollSummaryList [] TableItems;

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
     * @return Items 列表
     */
    public ElectronicTollSummaryItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 列表
     * @param Items 列表
     */
    public void setItems(ElectronicTollSummaryItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get 表格 
     * @return TableItems 表格
     */
    public ElectronicTollSummaryList [] getTableItems() {
        return this.TableItems;
    }

    /**
     * Set 表格
     * @param TableItems 表格
     */
    public void setTableItems(ElectronicTollSummaryList [] TableItems) {
        this.TableItems = TableItems;
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

    public ElectronicTollSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ElectronicTollSummary(ElectronicTollSummary source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.Items != null) {
            this.Items = new ElectronicTollSummaryItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new ElectronicTollSummaryItem(source.Items[i]);
            }
        }
        if (source.TableItems != null) {
            this.TableItems = new ElectronicTollSummaryList[source.TableItems.length];
            for (int i = 0; i < source.TableItems.length; i++) {
                this.TableItems[i] = new ElectronicTollSummaryList(source.TableItems[i]);
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
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamArrayObj(map, prefix + "TableItems.", this.TableItems);
        this.setParamSimple(map, prefix + "Date", this.Date);

    }
}

