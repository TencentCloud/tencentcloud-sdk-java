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

public class CustomerInfo extends AbstractModel {

    /**
    * 公司全称
    */
    @SerializedName("CustomerName")
    @Expose
    private String CustomerName;

    /**
    * 公司简称
    */
    @SerializedName("ShortCustomerName")
    @Expose
    private String ShortCustomerName;

    /**
    * 是否全托管用户
    */
    @SerializedName("WholeFlag")
    @Expose
    private Boolean WholeFlag;

    /**
     * Get 公司全称 
     * @return CustomerName 公司全称
     */
    public String getCustomerName() {
        return this.CustomerName;
    }

    /**
     * Set 公司全称
     * @param CustomerName 公司全称
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * Get 公司简称 
     * @return ShortCustomerName 公司简称
     */
    public String getShortCustomerName() {
        return this.ShortCustomerName;
    }

    /**
     * Set 公司简称
     * @param ShortCustomerName 公司简称
     */
    public void setShortCustomerName(String ShortCustomerName) {
        this.ShortCustomerName = ShortCustomerName;
    }

    /**
     * Get 是否全托管用户 
     * @return WholeFlag 是否全托管用户
     */
    public Boolean getWholeFlag() {
        return this.WholeFlag;
    }

    /**
     * Set 是否全托管用户
     * @param WholeFlag 是否全托管用户
     */
    public void setWholeFlag(Boolean WholeFlag) {
        this.WholeFlag = WholeFlag;
    }

    public CustomerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomerInfo(CustomerInfo source) {
        if (source.CustomerName != null) {
            this.CustomerName = new String(source.CustomerName);
        }
        if (source.ShortCustomerName != null) {
            this.ShortCustomerName = new String(source.ShortCustomerName);
        }
        if (source.WholeFlag != null) {
            this.WholeFlag = new Boolean(source.WholeFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerName", this.CustomerName);
        this.setParamSimple(map, prefix + "ShortCustomerName", this.ShortCustomerName);
        this.setParamSimple(map, prefix + "WholeFlag", this.WholeFlag);

    }
}

