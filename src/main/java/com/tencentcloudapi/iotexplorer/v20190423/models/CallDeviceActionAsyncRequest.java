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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallDeviceActionAsyncRequest extends AbstractModel{

    /**
    * 产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 产品数据模板中行为功能的标识符，由开发者自行根据设备的应用场景定义
    */
    @SerializedName("ActionId")
    @Expose
    private String ActionId;

    /**
    * 输入参数
    */
    @SerializedName("InputParams")
    @Expose
    private String InputParams;

    /**
     * Get 产品Id 
     * @return ProductId 产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品Id
     * @param ProductId 产品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 产品数据模板中行为功能的标识符，由开发者自行根据设备的应用场景定义 
     * @return ActionId 产品数据模板中行为功能的标识符，由开发者自行根据设备的应用场景定义
     */
    public String getActionId() {
        return this.ActionId;
    }

    /**
     * Set 产品数据模板中行为功能的标识符，由开发者自行根据设备的应用场景定义
     * @param ActionId 产品数据模板中行为功能的标识符，由开发者自行根据设备的应用场景定义
     */
    public void setActionId(String ActionId) {
        this.ActionId = ActionId;
    }

    /**
     * Get 输入参数 
     * @return InputParams 输入参数
     */
    public String getInputParams() {
        return this.InputParams;
    }

    /**
     * Set 输入参数
     * @param InputParams 输入参数
     */
    public void setInputParams(String InputParams) {
        this.InputParams = InputParams;
    }

    public CallDeviceActionAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallDeviceActionAsyncRequest(CallDeviceActionAsyncRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ActionId != null) {
            this.ActionId = new String(source.ActionId);
        }
        if (source.InputParams != null) {
            this.InputParams = new String(source.InputParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ActionId", this.ActionId);
        this.setParamSimple(map, prefix + "InputParams", this.InputParams);

    }
}

