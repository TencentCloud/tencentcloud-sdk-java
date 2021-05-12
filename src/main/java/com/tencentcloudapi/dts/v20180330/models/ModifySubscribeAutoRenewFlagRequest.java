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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySubscribeAutoRenewFlagRequest extends AbstractModel{

    /**
    * 订阅实例ID，例如：subs-8uey736k
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * 自动续费标识。1-自动续费，0-不自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
     * Get 订阅实例ID，例如：subs-8uey736k 
     * @return SubscribeId 订阅实例ID，例如：subs-8uey736k
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set 订阅实例ID，例如：subs-8uey736k
     * @param SubscribeId 订阅实例ID，例如：subs-8uey736k
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get 自动续费标识。1-自动续费，0-不自动续费 
     * @return AutoRenewFlag 自动续费标识。1-自动续费，0-不自动续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标识。1-自动续费，0-不自动续费
     * @param AutoRenewFlag 自动续费标识。1-自动续费，0-不自动续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    public ModifySubscribeAutoRenewFlagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySubscribeAutoRenewFlagRequest(ModifySubscribeAutoRenewFlagRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);

    }
}

