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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaxPayment extends AbstractModel {

    /**
    * 发票名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 识别出的字段名称(关键字)，支持以下字段：
税号 、纳税人识别号 、纳税人名称 、金额合计大写 、金额合计小写 、填发日期 、税务机关 、填票人。
示例值：纳税人识别号
    */
    @SerializedName("Content")
    @Expose
    private OtherInvoiceItem [] Content;

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
     * Get 识别出的字段名称(关键字)，支持以下字段：
税号 、纳税人识别号 、纳税人名称 、金额合计大写 、金额合计小写 、填发日期 、税务机关 、填票人。
示例值：纳税人识别号 
     * @return Content 识别出的字段名称(关键字)，支持以下字段：
税号 、纳税人识别号 、纳税人名称 、金额合计大写 、金额合计小写 、填发日期 、税务机关 、填票人。
示例值：纳税人识别号
     */
    public OtherInvoiceItem [] getContent() {
        return this.Content;
    }

    /**
     * Set 识别出的字段名称(关键字)，支持以下字段：
税号 、纳税人识别号 、纳税人名称 、金额合计大写 、金额合计小写 、填发日期 、税务机关 、填票人。
示例值：纳税人识别号
     * @param Content 识别出的字段名称(关键字)，支持以下字段：
税号 、纳税人识别号 、纳税人名称 、金额合计大写 、金额合计小写 、填发日期 、税务机关 、填票人。
示例值：纳税人识别号
     */
    public void setContent(OtherInvoiceItem [] Content) {
        this.Content = Content;
    }

    public TaxPayment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaxPayment(TaxPayment source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Content != null) {
            this.Content = new OtherInvoiceItem[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new OtherInvoiceItem(source.Content[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamArrayObj(map, prefix + "Content.", this.Content);

    }
}

