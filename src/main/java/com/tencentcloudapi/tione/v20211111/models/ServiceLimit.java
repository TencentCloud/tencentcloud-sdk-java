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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceLimit extends AbstractModel{

    /**
    * 是否开启实例层面限流限速，true or false。true 则 InstanceRpsLimit 必填， false 则 InstanceRpsLimit 不生效
    */
    @SerializedName("EnableInstanceRpsLimit")
    @Expose
    private Boolean EnableInstanceRpsLimit;

    /**
    * 每个服务实例的 request per second 限速, 0 为不限流
    */
    @SerializedName("InstanceRpsLimit")
    @Expose
    private Long InstanceRpsLimit;

    /**
     * Get 是否开启实例层面限流限速，true or false。true 则 InstanceRpsLimit 必填， false 则 InstanceRpsLimit 不生效 
     * @return EnableInstanceRpsLimit 是否开启实例层面限流限速，true or false。true 则 InstanceRpsLimit 必填， false 则 InstanceRpsLimit 不生效
     */
    public Boolean getEnableInstanceRpsLimit() {
        return this.EnableInstanceRpsLimit;
    }

    /**
     * Set 是否开启实例层面限流限速，true or false。true 则 InstanceRpsLimit 必填， false 则 InstanceRpsLimit 不生效
     * @param EnableInstanceRpsLimit 是否开启实例层面限流限速，true or false。true 则 InstanceRpsLimit 必填， false 则 InstanceRpsLimit 不生效
     */
    public void setEnableInstanceRpsLimit(Boolean EnableInstanceRpsLimit) {
        this.EnableInstanceRpsLimit = EnableInstanceRpsLimit;
    }

    /**
     * Get 每个服务实例的 request per second 限速, 0 为不限流 
     * @return InstanceRpsLimit 每个服务实例的 request per second 限速, 0 为不限流
     */
    public Long getInstanceRpsLimit() {
        return this.InstanceRpsLimit;
    }

    /**
     * Set 每个服务实例的 request per second 限速, 0 为不限流
     * @param InstanceRpsLimit 每个服务实例的 request per second 限速, 0 为不限流
     */
    public void setInstanceRpsLimit(Long InstanceRpsLimit) {
        this.InstanceRpsLimit = InstanceRpsLimit;
    }

    public ServiceLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceLimit(ServiceLimit source) {
        if (source.EnableInstanceRpsLimit != null) {
            this.EnableInstanceRpsLimit = new Boolean(source.EnableInstanceRpsLimit);
        }
        if (source.InstanceRpsLimit != null) {
            this.InstanceRpsLimit = new Long(source.InstanceRpsLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableInstanceRpsLimit", this.EnableInstanceRpsLimit);
        this.setParamSimple(map, prefix + "InstanceRpsLimit", this.InstanceRpsLimit);

    }
}

