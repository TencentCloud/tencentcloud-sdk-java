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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IotDevicesInfo extends AbstractModel{

    /**
    * 设备id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 设备名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 设备状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 设备打开状态
    */
    @SerializedName("Disabled")
    @Expose
    private Boolean Disabled;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 设备创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后在线时间
    */
    @SerializedName("LastOnlineTime")
    @Expose
    private String LastOnlineTime;

    /**
    * 设备是否绑定到节点
    */
    @SerializedName("IsBound")
    @Expose
    private Boolean IsBound;

    /**
    * 设备版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 无
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 无
    */
    @SerializedName("UnitID")
    @Expose
    private Long UnitID;

    /**
    * 无
    */
    @SerializedName("UnitName")
    @Expose
    private String UnitName;

    /**
     * Get 设备id 
     * @return Id 设备id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 设备id
     * @param Id 设备id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 设备名称 
     * @return Name 设备名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 设备名称
     * @param Name 设备名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 设备状态 
     * @return Status 设备状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 设备状态
     * @param Status 设备状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 设备打开状态 
     * @return Disabled 设备打开状态
     */
    public Boolean getDisabled() {
        return this.Disabled;
    }

    /**
     * Set 设备打开状态
     * @param Disabled 设备打开状态
     */
    public void setDisabled(Boolean Disabled) {
        this.Disabled = Disabled;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 设备创建时间 
     * @return CreateTime 设备创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 设备创建时间
     * @param CreateTime 设备创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后在线时间 
     * @return LastOnlineTime 最后在线时间
     */
    public String getLastOnlineTime() {
        return this.LastOnlineTime;
    }

    /**
     * Set 最后在线时间
     * @param LastOnlineTime 最后在线时间
     */
    public void setLastOnlineTime(String LastOnlineTime) {
        this.LastOnlineTime = LastOnlineTime;
    }

    /**
     * Get 设备是否绑定到节点 
     * @return IsBound 设备是否绑定到节点
     */
    public Boolean getIsBound() {
        return this.IsBound;
    }

    /**
     * Set 设备是否绑定到节点
     * @param IsBound 设备是否绑定到节点
     */
    public void setIsBound(Boolean IsBound) {
        this.IsBound = IsBound;
    }

    /**
     * Get 设备版本 
     * @return Version 设备版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 设备版本
     * @param Version 设备版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 无 
     * @return Region 无
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 无
     * @param Region 无
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 无 
     * @return UnitID 无
     */
    public Long getUnitID() {
        return this.UnitID;
    }

    /**
     * Set 无
     * @param UnitID 无
     */
    public void setUnitID(Long UnitID) {
        this.UnitID = UnitID;
    }

    /**
     * Get 无 
     * @return UnitName 无
     */
    public String getUnitName() {
        return this.UnitName;
    }

    /**
     * Set 无
     * @param UnitName 无
     */
    public void setUnitName(String UnitName) {
        this.UnitName = UnitName;
    }

    public IotDevicesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IotDevicesInfo(IotDevicesInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Disabled != null) {
            this.Disabled = new Boolean(source.Disabled);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastOnlineTime != null) {
            this.LastOnlineTime = new String(source.LastOnlineTime);
        }
        if (source.IsBound != null) {
            this.IsBound = new Boolean(source.IsBound);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.UnitID != null) {
            this.UnitID = new Long(source.UnitID);
        }
        if (source.UnitName != null) {
            this.UnitName = new String(source.UnitName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Disabled", this.Disabled);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastOnlineTime", this.LastOnlineTime);
        this.setParamSimple(map, prefix + "IsBound", this.IsBound);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "UnitID", this.UnitID);
        this.setParamSimple(map, prefix + "UnitName", this.UnitName);

    }
}

