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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VMSpec extends AbstractModel {

    /**
    * LightHouse=轻量云服务器
CVM=云服务器
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 轻量云服务器规格。
当Type=LightHouse时有效
    */
    @SerializedName("LightHouseSpec")
    @Expose
    private VMSpecLightHouse LightHouseSpec;

    /**
    * 价格信息
    */
    @SerializedName("Price")
    @Expose
    private VMPrice Price;

    /**
     * Get LightHouse=轻量云服务器
CVM=云服务器 
     * @return Type LightHouse=轻量云服务器
CVM=云服务器
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set LightHouse=轻量云服务器
CVM=云服务器
     * @param Type LightHouse=轻量云服务器
CVM=云服务器
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 轻量云服务器规格。
当Type=LightHouse时有效 
     * @return LightHouseSpec 轻量云服务器规格。
当Type=LightHouse时有效
     */
    public VMSpecLightHouse getLightHouseSpec() {
        return this.LightHouseSpec;
    }

    /**
     * Set 轻量云服务器规格。
当Type=LightHouse时有效
     * @param LightHouseSpec 轻量云服务器规格。
当Type=LightHouse时有效
     */
    public void setLightHouseSpec(VMSpecLightHouse LightHouseSpec) {
        this.LightHouseSpec = LightHouseSpec;
    }

    /**
     * Get 价格信息 
     * @return Price 价格信息
     */
    public VMPrice getPrice() {
        return this.Price;
    }

    /**
     * Set 价格信息
     * @param Price 价格信息
     */
    public void setPrice(VMPrice Price) {
        this.Price = Price;
    }

    public VMSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VMSpec(VMSpec source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.LightHouseSpec != null) {
            this.LightHouseSpec = new VMSpecLightHouse(source.LightHouseSpec);
        }
        if (source.Price != null) {
            this.Price = new VMPrice(source.Price);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "LightHouseSpec.", this.LightHouseSpec);
        this.setParamObj(map, prefix + "Price.", this.Price);

    }
}

