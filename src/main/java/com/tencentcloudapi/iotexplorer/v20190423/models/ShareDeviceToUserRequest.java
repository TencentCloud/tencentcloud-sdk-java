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

public class ShareDeviceToUserRequest extends AbstractModel {

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
    * <p>设备所有者 OpenID（必须已存在）</p>
    */
    @SerializedName("OwnerOpenID")
    @Expose
    private String OwnerOpenID;

    /**
    * <p>被分享用户 OpenID（不存在则自动创建）</p>
    */
    @SerializedName("ToOpenID")
    @Expose
    private String ToOpenID;

    /**
    * <p>被分享用户昵称（仅自动创建时使用）</p>
    */
    @SerializedName("ToNickName")
    @Expose
    private String ToNickName;

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
     * Get <p>设备所有者 OpenID（必须已存在）</p> 
     * @return OwnerOpenID <p>设备所有者 OpenID（必须已存在）</p>
     */
    public String getOwnerOpenID() {
        return this.OwnerOpenID;
    }

    /**
     * Set <p>设备所有者 OpenID（必须已存在）</p>
     * @param OwnerOpenID <p>设备所有者 OpenID（必须已存在）</p>
     */
    public void setOwnerOpenID(String OwnerOpenID) {
        this.OwnerOpenID = OwnerOpenID;
    }

    /**
     * Get <p>被分享用户 OpenID（不存在则自动创建）</p> 
     * @return ToOpenID <p>被分享用户 OpenID（不存在则自动创建）</p>
     */
    public String getToOpenID() {
        return this.ToOpenID;
    }

    /**
     * Set <p>被分享用户 OpenID（不存在则自动创建）</p>
     * @param ToOpenID <p>被分享用户 OpenID（不存在则自动创建）</p>
     */
    public void setToOpenID(String ToOpenID) {
        this.ToOpenID = ToOpenID;
    }

    /**
     * Get <p>被分享用户昵称（仅自动创建时使用）</p> 
     * @return ToNickName <p>被分享用户昵称（仅自动创建时使用）</p>
     */
    public String getToNickName() {
        return this.ToNickName;
    }

    /**
     * Set <p>被分享用户昵称（仅自动创建时使用）</p>
     * @param ToNickName <p>被分享用户昵称（仅自动创建时使用）</p>
     */
    public void setToNickName(String ToNickName) {
        this.ToNickName = ToNickName;
    }

    public ShareDeviceToUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShareDeviceToUserRequest(ShareDeviceToUserRequest source) {
        if (source.AppKey != null) {
            this.AppKey = new String(source.AppKey);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.OwnerOpenID != null) {
            this.OwnerOpenID = new String(source.OwnerOpenID);
        }
        if (source.ToOpenID != null) {
            this.ToOpenID = new String(source.ToOpenID);
        }
        if (source.ToNickName != null) {
            this.ToNickName = new String(source.ToNickName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppKey", this.AppKey);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "OwnerOpenID", this.OwnerOpenID);
        this.setParamSimple(map, prefix + "ToOpenID", this.ToOpenID);
        this.setParamSimple(map, prefix + "ToNickName", this.ToNickName);

    }
}

