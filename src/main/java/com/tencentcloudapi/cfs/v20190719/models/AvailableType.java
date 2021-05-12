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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvailableType extends AbstractModel{

    /**
    * 协议与售卖详情
    */
    @SerializedName("Protocols")
    @Expose
    private AvailableProtoStatus [] Protocols;

    /**
    * 存储类型。返回值中 SD 为标准型存储、HP 为性能型存储
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 是否支持预付费。返回值中 true 为支持、false 为不支持
    */
    @SerializedName("Prepayment")
    @Expose
    private Boolean Prepayment;

    /**
     * Get 协议与售卖详情 
     * @return Protocols 协议与售卖详情
     */
    public AvailableProtoStatus [] getProtocols() {
        return this.Protocols;
    }

    /**
     * Set 协议与售卖详情
     * @param Protocols 协议与售卖详情
     */
    public void setProtocols(AvailableProtoStatus [] Protocols) {
        this.Protocols = Protocols;
    }

    /**
     * Get 存储类型。返回值中 SD 为标准型存储、HP 为性能型存储 
     * @return Type 存储类型。返回值中 SD 为标准型存储、HP 为性能型存储
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 存储类型。返回值中 SD 为标准型存储、HP 为性能型存储
     * @param Type 存储类型。返回值中 SD 为标准型存储、HP 为性能型存储
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 是否支持预付费。返回值中 true 为支持、false 为不支持 
     * @return Prepayment 是否支持预付费。返回值中 true 为支持、false 为不支持
     */
    public Boolean getPrepayment() {
        return this.Prepayment;
    }

    /**
     * Set 是否支持预付费。返回值中 true 为支持、false 为不支持
     * @param Prepayment 是否支持预付费。返回值中 true 为支持、false 为不支持
     */
    public void setPrepayment(Boolean Prepayment) {
        this.Prepayment = Prepayment;
    }

    public AvailableType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvailableType(AvailableType source) {
        if (source.Protocols != null) {
            this.Protocols = new AvailableProtoStatus[source.Protocols.length];
            for (int i = 0; i < source.Protocols.length; i++) {
                this.Protocols[i] = new AvailableProtoStatus(source.Protocols[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Prepayment != null) {
            this.Prepayment = new Boolean(source.Prepayment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Protocols.", this.Protocols);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Prepayment", this.Prepayment);

    }
}

