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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Deals extends AbstractModel{

    /**
    * 子订单ID
    */
    @SerializedName("DealId")
    @Expose
    private String DealId;

    /**
    * 子订单号
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
     * Get 子订单ID 
     * @return DealId 子订单ID
     */
    public String getDealId() {
        return this.DealId;
    }

    /**
     * Set 子订单ID
     * @param DealId 子订单ID
     */
    public void setDealId(String DealId) {
        this.DealId = DealId;
    }

    /**
     * Get 子订单号 
     * @return DealName 子订单号
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 子订单号
     * @param DealName 子订单号
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    public Deals() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Deals(Deals source) {
        if (source.DealId != null) {
            this.DealId = new String(source.DealId);
        }
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealId", this.DealId);
        this.setParamSimple(map, prefix + "DealName", this.DealName);

    }
}

