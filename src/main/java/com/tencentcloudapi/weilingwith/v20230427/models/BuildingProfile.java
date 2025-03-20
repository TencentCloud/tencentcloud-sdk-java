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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BuildingProfile extends AbstractModel {

    /**
    * 建筑id
    */
    @SerializedName("BuildingId")
    @Expose
    private String BuildingId;

    /**
    * 建筑名称
    */
    @SerializedName("BuildingName")
    @Expose
    private String BuildingName;

    /**
    * 空间编码
    */
    @SerializedName("SpaceCode")
    @Expose
    private String SpaceCode;

    /**
    * 经度
    */
    @SerializedName("Longitude")
    @Expose
    private Float Longitude;

    /**
    * 纬度
    */
    @SerializedName("Latitude")
    @Expose
    private Float Latitude;

    /**
    * 地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
     * Get 建筑id 
     * @return BuildingId 建筑id
     */
    public String getBuildingId() {
        return this.BuildingId;
    }

    /**
     * Set 建筑id
     * @param BuildingId 建筑id
     */
    public void setBuildingId(String BuildingId) {
        this.BuildingId = BuildingId;
    }

    /**
     * Get 建筑名称 
     * @return BuildingName 建筑名称
     */
    public String getBuildingName() {
        return this.BuildingName;
    }

    /**
     * Set 建筑名称
     * @param BuildingName 建筑名称
     */
    public void setBuildingName(String BuildingName) {
        this.BuildingName = BuildingName;
    }

    /**
     * Get 空间编码 
     * @return SpaceCode 空间编码
     */
    public String getSpaceCode() {
        return this.SpaceCode;
    }

    /**
     * Set 空间编码
     * @param SpaceCode 空间编码
     */
    public void setSpaceCode(String SpaceCode) {
        this.SpaceCode = SpaceCode;
    }

    /**
     * Get 经度 
     * @return Longitude 经度
     */
    public Float getLongitude() {
        return this.Longitude;
    }

    /**
     * Set 经度
     * @param Longitude 经度
     */
    public void setLongitude(Float Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * Get 纬度 
     * @return Latitude 纬度
     */
    public Float getLatitude() {
        return this.Latitude;
    }

    /**
     * Set 纬度
     * @param Latitude 纬度
     */
    public void setLatitude(Float Latitude) {
        this.Latitude = Latitude;
    }

    /**
     * Get 地址 
     * @return Address 地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 地址
     * @param Address 地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    public BuildingProfile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BuildingProfile(BuildingProfile source) {
        if (source.BuildingId != null) {
            this.BuildingId = new String(source.BuildingId);
        }
        if (source.BuildingName != null) {
            this.BuildingName = new String(source.BuildingName);
        }
        if (source.SpaceCode != null) {
            this.SpaceCode = new String(source.SpaceCode);
        }
        if (source.Longitude != null) {
            this.Longitude = new Float(source.Longitude);
        }
        if (source.Latitude != null) {
            this.Latitude = new Float(source.Latitude);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BuildingId", this.BuildingId);
        this.setParamSimple(map, prefix + "BuildingName", this.BuildingName);
        this.setParamSimple(map, prefix + "SpaceCode", this.SpaceCode);
        this.setParamSimple(map, prefix + "Longitude", this.Longitude);
        this.setParamSimple(map, prefix + "Latitude", this.Latitude);
        this.setParamSimple(map, prefix + "Address", this.Address);

    }
}

