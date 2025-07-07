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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExpressDelivery extends AbstractModel {

    /**
    * 物流公司
    */
    @SerializedName("LogisticsCompany")
    @Expose
    private String LogisticsCompany;

    /**
    * 快递单号
    */
    @SerializedName("ExpressNumber")
    @Expose
    private String ExpressNumber;

    /**
     * Get 物流公司 
     * @return LogisticsCompany 物流公司
     */
    public String getLogisticsCompany() {
        return this.LogisticsCompany;
    }

    /**
     * Set 物流公司
     * @param LogisticsCompany 物流公司
     */
    public void setLogisticsCompany(String LogisticsCompany) {
        this.LogisticsCompany = LogisticsCompany;
    }

    /**
     * Get 快递单号 
     * @return ExpressNumber 快递单号
     */
    public String getExpressNumber() {
        return this.ExpressNumber;
    }

    /**
     * Set 快递单号
     * @param ExpressNumber 快递单号
     */
    public void setExpressNumber(String ExpressNumber) {
        this.ExpressNumber = ExpressNumber;
    }

    public ExpressDelivery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExpressDelivery(ExpressDelivery source) {
        if (source.LogisticsCompany != null) {
            this.LogisticsCompany = new String(source.LogisticsCompany);
        }
        if (source.ExpressNumber != null) {
            this.ExpressNumber = new String(source.ExpressNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogisticsCompany", this.LogisticsCompany);
        this.setParamSimple(map, prefix + "ExpressNumber", this.ExpressNumber);

    }
}

