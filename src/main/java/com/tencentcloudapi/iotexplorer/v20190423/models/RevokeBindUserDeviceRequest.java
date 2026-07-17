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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RevokeBindUserDeviceRequest extends AbstractModel {

    /**
    * <p>应用 AppKey，用于解析 IotAppID 并完成签名校验</p>
    */
    @SerializedName("AppKey")
    @Expose
    private String AppKey;

    /**
    * <p>产品 ID</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>设备名</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>用户 OpenID（仅只读定位，不会创建）</p>
    */
    @SerializedName("OpenID")
    @Expose
    private String OpenID;

    /**
    * <p>家庭名，默认 default</p>
    */
    @SerializedName("FamilyName")
    @Expose
    private String FamilyName;

    /**
     * Get <p>应用 AppKey，用于解析 IotAppID 并完成签名校验</p> 
     * @return AppKey <p>应用 AppKey，用于解析 IotAppID 并完成签名校验</p>
     */
    public String getAppKey() {
        return this.AppKey;
    }

    /**
     * Set <p>应用 AppKey，用于解析 IotAppID 并完成签名校验</p>
     * @param AppKey <p>应用 AppKey，用于解析 IotAppID 并完成签名校验</p>
     */
    public void setAppKey(String AppKey) {
        this.AppKey = AppKey;
    }

    /**
     * Get <p>产品 ID</p> 
     * @return ProductId <p>产品 ID</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品 ID</p>
     * @param ProductId <p>产品 ID</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>设备名</p> 
     * @return DeviceName <p>设备名</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>设备名</p>
     * @param DeviceName <p>设备名</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>用户 OpenID（仅只读定位，不会创建）</p> 
     * @return OpenID <p>用户 OpenID（仅只读定位，不会创建）</p>
     */
    public String getOpenID() {
        return this.OpenID;
    }

    /**
     * Set <p>用户 OpenID（仅只读定位，不会创建）</p>
     * @param OpenID <p>用户 OpenID（仅只读定位，不会创建）</p>
     */
    public void setOpenID(String OpenID) {
        this.OpenID = OpenID;
    }

    /**
     * Get <p>家庭名，默认 default</p> 
     * @return FamilyName <p>家庭名，默认 default</p>
     */
    public String getFamilyName() {
        return this.FamilyName;
    }

    /**
     * Set <p>家庭名，默认 default</p>
     * @param FamilyName <p>家庭名，默认 default</p>
     */
    public void setFamilyName(String FamilyName) {
        this.FamilyName = FamilyName;
    }

    public RevokeBindUserDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RevokeBindUserDeviceRequest(RevokeBindUserDeviceRequest source) {
        if (source.AppKey != null) {
            this.AppKey = new String(source.AppKey);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.OpenID != null) {
            this.OpenID = new String(source.OpenID);
        }
        if (source.FamilyName != null) {
            this.FamilyName = new String(source.FamilyName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppKey", this.AppKey);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "OpenID", this.OpenID);
        this.setParamSimple(map, prefix + "FamilyName", this.FamilyName);

    }
}

