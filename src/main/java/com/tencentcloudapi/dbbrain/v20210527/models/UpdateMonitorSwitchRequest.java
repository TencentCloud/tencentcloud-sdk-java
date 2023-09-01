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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateMonitorSwitchRequest extends AbstractModel{

    /**
    * 停止或重连Agent实例，支持值包括："on" - 重连实例， "off" - 停止实例。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 服务产品类型，仅支持 "dbbrain-mysql" - 自建MySQL。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 停止或重连Agent实例，支持值包括："on" - 重连实例， "off" - 停止实例。 
     * @return Switch 停止或重连Agent实例，支持值包括："on" - 重连实例， "off" - 停止实例。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 停止或重连Agent实例，支持值包括："on" - 重连实例， "off" - 停止实例。
     * @param Switch 停止或重连Agent实例，支持值包括："on" - 重连实例， "off" - 停止实例。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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

    public UpdateMonitorSwitchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateMonitorSwitchRequest(UpdateMonitorSwitchRequest source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

