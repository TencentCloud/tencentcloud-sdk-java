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

public class OtherInvoiceList extends AbstractModel{

    /**
    * 列表
    */
    @SerializedName("OtherInvoiceItemList")
    @Expose
    private OtherInvoiceItem [] OtherInvoiceItemList;

    /**
     * Get 列表 
     * @return OtherInvoiceItemList 列表
     */
    public OtherInvoiceItem [] getOtherInvoiceItemList() {
        return this.OtherInvoiceItemList;
    }

    /**
     * Set 列表
     * @param OtherInvoiceItemList 列表
     */
    public void setOtherInvoiceItemList(OtherInvoiceItem [] OtherInvoiceItemList) {
        this.OtherInvoiceItemList = OtherInvoiceItemList;
    }

    public OtherInvoiceList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OtherInvoiceList(OtherInvoiceList source) {
        if (source.OtherInvoiceItemList != null) {
            this.OtherInvoiceItemList = new OtherInvoiceItem[source.OtherInvoiceItemList.length];
            for (int i = 0; i < source.OtherInvoiceItemList.length; i++) {
                this.OtherInvoiceItemList[i] = new OtherInvoiceItem(source.OtherInvoiceItemList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "OtherInvoiceItemList.", this.OtherInvoiceItemList);

    }
}

