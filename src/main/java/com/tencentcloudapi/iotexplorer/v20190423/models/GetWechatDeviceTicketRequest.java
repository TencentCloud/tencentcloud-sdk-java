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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetWechatDeviceTicketRequest extends AbstractModel {

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 产品名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 是否第三方小程序
    */
    @SerializedName("IsThirdApp")
    @Expose
    private Long IsThirdApp;

    /**
    * 模板ID
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 产品名称 
     * @return DeviceName 产品名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 产品名称
     * @param DeviceName 产品名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 是否第三方小程序 
     * @return IsThirdApp 是否第三方小程序
     */
    public Long getIsThirdApp() {
        return this.IsThirdApp;
    }

    /**
     * Set 是否第三方小程序
     * @param IsThirdApp 是否第三方小程序
     */
    public void setIsThirdApp(Long IsThirdApp) {
        this.IsThirdApp = IsThirdApp;
    }

    /**
     * Get 模板ID 
     * @return ModelId 模板ID
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模板ID
     * @param ModelId 模板ID
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    public GetWechatDeviceTicketRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWechatDeviceTicketRequest(GetWechatDeviceTicketRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.IsThirdApp != null) {
            this.IsThirdApp = new Long(source.IsThirdApp);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "IsThirdApp", this.IsThirdApp);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);

    }
}

