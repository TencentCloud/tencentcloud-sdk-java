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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAgentSwitchRequest extends AbstractModel {

    /**
    * Agent标识。
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * 停止或重连Agent，支持值包括："on" - 重连Agent， "off" - 停止Agent。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 服务产品类型，仅支持 "dbbrain-mysql" - 自建MySQL。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get Agent标识。 
     * @return AgentId Agent标识。
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set Agent标识。
     * @param AgentId Agent标识。
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get 停止或重连Agent，支持值包括："on" - 重连Agent， "off" - 停止Agent。 
     * @return Switch 停止或重连Agent，支持值包括："on" - 重连Agent， "off" - 停止Agent。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 停止或重连Agent，支持值包括："on" - 重连Agent， "off" - 停止Agent。
     * @param Switch 停止或重连Agent，支持值包括："on" - 重连Agent， "off" - 停止Agent。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 服务产品类型，仅支持 "dbbrain-mysql" - 自建MySQL。 
     * @return Product 服务产品类型，仅支持 "dbbrain-mysql" - 自建MySQL。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，仅支持 "dbbrain-mysql" - 自建MySQL。
     * @param Product 服务产品类型，仅支持 "dbbrain-mysql" - 自建MySQL。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public UpdateAgentSwitchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAgentSwitchRequest(UpdateAgentSwitchRequest source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

