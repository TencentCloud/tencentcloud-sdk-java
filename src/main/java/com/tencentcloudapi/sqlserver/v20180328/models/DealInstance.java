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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DealInstance extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String [] InstanceId;

    /**
    * 订单号
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String [] getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String [] InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 订单号 
     * @return DealName 订单号
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 订单号
     * @param DealName 订单号
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    public DealInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DealInstance(DealInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String[source.InstanceId.length];
            for (int i = 0; i < source.InstanceId.length; i++) {
                this.InstanceId[i] = new String(source.InstanceId[i]);
            }
        }
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceId.", this.InstanceId);
        this.setParamSimple(map, prefix + "DealName", this.DealName);

    }
}

