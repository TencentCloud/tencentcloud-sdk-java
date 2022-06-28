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

public class OpenBankPayLimitInfo extends AbstractModel{

    /**
    * 限制类型
    */
    @SerializedName("PayLimitType")
    @Expose
    private String PayLimitType;

    /**
    * 限制类型值
    */
    @SerializedName("PayLimitValue")
    @Expose
    private String PayLimitValue;

    /**
     * Get 限制类型 
     * @return PayLimitType 限制类型
     */
    public String getPayLimitType() {
        return this.PayLimitType;
    }

    /**
     * Set 限制类型
     * @param PayLimitType 限制类型
     */
    public void setPayLimitType(String PayLimitType) {
        this.PayLimitType = PayLimitType;
    }

    /**
     * Get 限制类型值 
     * @return PayLimitValue 限制类型值
     */
    public String getPayLimitValue() {
        return this.PayLimitValue;
    }

    /**
     * Set 限制类型值
     * @param PayLimitValue 限制类型值
     */
    public void setPayLimitValue(String PayLimitValue) {
        this.PayLimitValue = PayLimitValue;
    }

    public OpenBankPayLimitInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenBankPayLimitInfo(OpenBankPayLimitInfo source) {
        if (source.PayLimitType != null) {
            this.PayLimitType = new String(source.PayLimitType);
        }
        if (source.PayLimitValue != null) {
            this.PayLimitValue = new String(source.PayLimitValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayLimitType", this.PayLimitType);
        this.setParamSimple(map, prefix + "PayLimitValue", this.PayLimitValue);

    }
}

