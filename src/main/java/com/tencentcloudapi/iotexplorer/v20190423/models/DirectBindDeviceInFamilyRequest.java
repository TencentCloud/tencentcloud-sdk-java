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

public class DirectBindDeviceInFamilyRequest extends AbstractModel{

    /**
    * 小程序appid
    */
    @SerializedName("IotAppID")
    @Expose
    private String IotAppID;

    /**
    * 用户ID
    */
    @SerializedName("UserID")
    @Expose
    private String UserID;

    /**
    * 家庭ID
    */
    @SerializedName("FamilyId")
    @Expose
    private String FamilyId;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 房间ID
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
     * Get 小程序appid 
     * @return IotAppID 小程序appid
     */
    public String getIotAppID() {
        return this.IotAppID;
    }

    /**
     * Set 小程序appid
     * @param IotAppID 小程序appid
     */
    public void setIotAppID(String IotAppID) {
        this.IotAppID = IotAppID;
    }

    /**
     * Get 用户ID 
     * @return UserID 用户ID
     */
    public String getUserID() {
        return this.UserID;
    }

    /**
     * Set 用户ID
     * @param UserID 用户ID
     */
    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    /**
     * Get 家庭ID 
     * @return FamilyId 家庭ID
     */
    public String getFamilyId() {
        return this.FamilyId;
    }

    /**
     * Set 家庭ID
     * @param FamilyId 家庭ID
     */
    public void setFamilyId(String FamilyId) {
        this.FamilyId = FamilyId;
    }

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
     * Get 设备名 
     * @return DeviceName 设备名
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名
     * @param DeviceName 设备名
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 房间ID 
     * @return RoomId 房间ID
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间ID
     * @param RoomId 房间ID
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    public DirectBindDeviceInFamilyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DirectBindDeviceInFamilyRequest(DirectBindDeviceInFamilyRequest source) {
        if (source.IotAppID != null) {
            this.IotAppID = new String(source.IotAppID);
        }
        if (source.UserID != null) {
            this.UserID = new String(source.UserID);
        }
        if (source.FamilyId != null) {
            this.FamilyId = new String(source.FamilyId);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IotAppID", this.IotAppID);
        this.setParamSimple(map, prefix + "UserID", this.UserID);
        this.setParamSimple(map, prefix + "FamilyId", this.FamilyId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);

    }
}

