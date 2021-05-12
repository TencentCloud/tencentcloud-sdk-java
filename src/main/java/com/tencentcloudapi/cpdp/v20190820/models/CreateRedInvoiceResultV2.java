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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRedInvoiceResultV2 extends AbstractModel{

    /**
    * 红票ID
    */
    @SerializedName("InvoiceId")
    @Expose
    private String InvoiceId;

    /**
     * Get 红票ID 
     * @return InvoiceId 红票ID
     */
    public String getInvoiceId() {
        return this.InvoiceId;
    }

    /**
     * Set 红票ID
     * @param InvoiceId 红票ID
     */
    public void setInvoiceId(String InvoiceId) {
        this.InvoiceId = InvoiceId;
    }

    public CreateRedInvoiceResultV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRedInvoiceResultV2(CreateRedInvoiceResultV2 source) {
        if (source.InvoiceId != null) {
            this.InvoiceId = new String(source.InvoiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvoiceId", this.InvoiceId);

    }
}

