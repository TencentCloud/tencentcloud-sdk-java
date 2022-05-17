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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyOrderStatusRequest extends AbstractModel{

    /**
    * 要更新成的状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 大订单ID
    */
    @SerializedName("DedicatedClusterOrderId")
    @Expose
    private String DedicatedClusterOrderId;

    /**
    * 小订单ID
    */
    @SerializedName("SubOrderIds")
    @Expose
    private String [] SubOrderIds;

    /**
     * Get 要更新成的状态 
     * @return Status 要更新成的状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 要更新成的状态
     * @param Status 要更新成的状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 大订单ID 
     * @return DedicatedClusterOrderId 大订单ID
     */
    public String getDedicatedClusterOrderId() {
        return this.DedicatedClusterOrderId;
    }

    /**
     * Set 大订单ID
     * @param DedicatedClusterOrderId 大订单ID
     */
    public void setDedicatedClusterOrderId(String DedicatedClusterOrderId) {
        this.DedicatedClusterOrderId = DedicatedClusterOrderId;
    }

    /**
     * Get 小订单ID 
     * @return SubOrderIds 小订单ID
     */
    public String [] getSubOrderIds() {
        return this.SubOrderIds;
    }

    /**
     * Set 小订单ID
     * @param SubOrderIds 小订单ID
     */
    public void setSubOrderIds(String [] SubOrderIds) {
        this.SubOrderIds = SubOrderIds;
    }

    public ModifyOrderStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOrderStatusRequest(ModifyOrderStatusRequest source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DedicatedClusterOrderId != null) {
            this.DedicatedClusterOrderId = new String(source.DedicatedClusterOrderId);
        }
        if (source.SubOrderIds != null) {
            this.SubOrderIds = new String[source.SubOrderIds.length];
            for (int i = 0; i < source.SubOrderIds.length; i++) {
                this.SubOrderIds[i] = new String(source.SubOrderIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DedicatedClusterOrderId", this.DedicatedClusterOrderId);
        this.setParamArraySimple(map, prefix + "SubOrderIds.", this.SubOrderIds);

    }
}

