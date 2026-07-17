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

public class BindUserDeviceRequest extends AbstractModel {

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
    * <p>设备名（禁止使用虚拟设备名 ~virtualDev）</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>用户 OpenID，用于定位 / 兜底创建 App 用户</p>
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
    * <p>房间 ID，默认 &quot;0&quot;</p>
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * <p>用户昵称（仅首次创建用户时使用）</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

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
     * Get <p>设备名（禁止使用虚拟设备名 ~virtualDev）</p> 
     * @return DeviceName <p>设备名（禁止使用虚拟设备名 ~virtualDev）</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>设备名（禁止使用虚拟设备名 ~virtualDev）</p>
     * @param DeviceName <p>设备名（禁止使用虚拟设备名 ~virtualDev）</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>用户 OpenID，用于定位 / 兜底创建 App 用户</p> 
     * @return OpenID <p>用户 OpenID，用于定位 / 兜底创建 App 用户</p>
     */
    public String getOpenID() {
        return this.OpenID;
    }

    /**
     * Set <p>用户 OpenID，用于定位 / 兜底创建 App 用户</p>
     * @param OpenID <p>用户 OpenID，用于定位 / 兜底创建 App 用户</p>
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

    /**
     * Get <p>房间 ID，默认 &quot;0&quot;</p> 
     * @return RoomId <p>房间 ID，默认 &quot;0&quot;</p>
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>房间 ID，默认 &quot;0&quot;</p>
     * @param RoomId <p>房间 ID，默认 &quot;0&quot;</p>
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>用户昵称（仅首次创建用户时使用）</p> 
     * @return NickName <p>用户昵称（仅首次创建用户时使用）</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>用户昵称（仅首次创建用户时使用）</p>
     * @param NickName <p>用户昵称（仅首次创建用户时使用）</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    public BindUserDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindUserDeviceRequest(BindUserDeviceRequest source) {
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
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
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
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);

    }
}

