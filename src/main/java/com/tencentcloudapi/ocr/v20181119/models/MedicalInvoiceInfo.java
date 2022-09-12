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

public class MedicalInvoiceInfo extends AbstractModel{

    /**
    * 医疗发票识别结果条目
    */
    @SerializedName("MedicalInvoiceItems")
    @Expose
    private MedicalInvoiceItem [] MedicalInvoiceItems;

    /**
     * Get 医疗发票识别结果条目 
     * @return MedicalInvoiceItems 医疗发票识别结果条目
     */
    public MedicalInvoiceItem [] getMedicalInvoiceItems() {
        return this.MedicalInvoiceItems;
    }

    /**
     * Set 医疗发票识别结果条目
     * @param MedicalInvoiceItems 医疗发票识别结果条目
     */
    public void setMedicalInvoiceItems(MedicalInvoiceItem [] MedicalInvoiceItems) {
        this.MedicalInvoiceItems = MedicalInvoiceItems;
    }

    public MedicalInvoiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MedicalInvoiceInfo(MedicalInvoiceInfo source) {
        if (source.MedicalInvoiceItems != null) {
            this.MedicalInvoiceItems = new MedicalInvoiceItem[source.MedicalInvoiceItems.length];
            for (int i = 0; i < source.MedicalInvoiceItems.length; i++) {
                this.MedicalInvoiceItems[i] = new MedicalInvoiceItem(source.MedicalInvoiceItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MedicalInvoiceItems.", this.MedicalInvoiceItems);

    }
}

