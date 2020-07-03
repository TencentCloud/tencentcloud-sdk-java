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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceDealRequest extends AbstractModel{

    /**
    * 订单ID，通过CreateDBInstance等接口返回
    */
    @SerializedName("DealId")
    @Expose
    private String DealId;

    /**
     * Get 订单ID，通过CreateDBInstance等接口返回 
     * @return DealId 订单ID，通过CreateDBInstance等接口返回
     */
    public String getDealId() {
        return this.DealId;
    }

    /**
     * Set 订单ID，通过CreateDBInstance等接口返回
     * @param DealId 订单ID，通过CreateDBInstance等接口返回
     */
    public void setDealId(String DealId) {
        this.DealId = DealId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealId", this.DealId);

    }
}

