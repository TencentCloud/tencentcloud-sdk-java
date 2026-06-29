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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplexBilling extends AbstractModel {

    /**
    * <p>复合计费列表</p>
    */
    @SerializedName("ComplexList")
    @Expose
    private ComplexBillingItem [] ComplexList;

    /**
     * Get <p>复合计费列表</p> 
     * @return ComplexList <p>复合计费列表</p>
     */
    public ComplexBillingItem [] getComplexList() {
        return this.ComplexList;
    }

    /**
     * Set <p>复合计费列表</p>
     * @param ComplexList <p>复合计费列表</p>
     */
    public void setComplexList(ComplexBillingItem [] ComplexList) {
        this.ComplexList = ComplexList;
    }

    public ComplexBilling() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplexBilling(ComplexBilling source) {
        if (source.ComplexList != null) {
            this.ComplexList = new ComplexBillingItem[source.ComplexList.length];
            for (int i = 0; i < source.ComplexList.length; i++) {
                this.ComplexList[i] = new ComplexBillingItem(source.ComplexList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ComplexList.", this.ComplexList);

    }
}

