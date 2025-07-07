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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Rack extends AbstractModel {

    /**
    * 机架名称
    */
    @SerializedName("RackName")
    @Expose
    private String RackName;

    /**
    * 机架所属的机房管理单元ID
    */
    @SerializedName("IdcUnitId")
    @Expose
    private Long IdcUnitId;

    /**
    * 机架所属的机房管理单元名称
    */
    @SerializedName("IdcUnitName")
    @Expose
    private String IdcUnitName;

    /**
    * 机架所属的机房名称
    */
    @SerializedName("IdcName")
    @Expose
    private String IdcName;

    /**
    * 机架所属的机房ID
    */
    @SerializedName("IdcId")
    @Expose
    private Long IdcId;

    /**
    * 机架ID
    */
    @SerializedName("RackId")
    @Expose
    private Long RackId;

    /**
    * 是否开电
    */
    @SerializedName("IsPowerOn")
    @Expose
    private Boolean IsPowerOn;

    /**
    * 机架最近一次开电时间，YYYY-MM-DD 格式
    */
    @SerializedName("RackOpenTime")
    @Expose
    private String RackOpenTime;

    /**
    * 托管类型
    */
    @SerializedName("HostingType")
    @Expose
    private String HostingType;

    /**
     * Get 机架名称 
     * @return RackName 机架名称
     */
    public String getRackName() {
        return this.RackName;
    }

    /**
     * Set 机架名称
     * @param RackName 机架名称
     */
    public void setRackName(String RackName) {
        this.RackName = RackName;
    }

    /**
     * Get 机架所属的机房管理单元ID 
     * @return IdcUnitId 机架所属的机房管理单元ID
     */
    public Long getIdcUnitId() {
        return this.IdcUnitId;
    }

    /**
     * Set 机架所属的机房管理单元ID
     * @param IdcUnitId 机架所属的机房管理单元ID
     */
    public void setIdcUnitId(Long IdcUnitId) {
        this.IdcUnitId = IdcUnitId;
    }

    /**
     * Get 机架所属的机房管理单元名称 
     * @return IdcUnitName 机架所属的机房管理单元名称
     */
    public String getIdcUnitName() {
        return this.IdcUnitName;
    }

    /**
     * Set 机架所属的机房管理单元名称
     * @param IdcUnitName 机架所属的机房管理单元名称
     */
    public void setIdcUnitName(String IdcUnitName) {
        this.IdcUnitName = IdcUnitName;
    }

    /**
     * Get 机架所属的机房名称 
     * @return IdcName 机架所属的机房名称
     */
    public String getIdcName() {
        return this.IdcName;
    }

    /**
     * Set 机架所属的机房名称
     * @param IdcName 机架所属的机房名称
     */
    public void setIdcName(String IdcName) {
        this.IdcName = IdcName;
    }

    /**
     * Get 机架所属的机房ID 
     * @return IdcId 机架所属的机房ID
     */
    public Long getIdcId() {
        return this.IdcId;
    }

    /**
     * Set 机架所属的机房ID
     * @param IdcId 机架所属的机房ID
     */
    public void setIdcId(Long IdcId) {
        this.IdcId = IdcId;
    }

    /**
     * Get 机架ID 
     * @return RackId 机架ID
     */
    public Long getRackId() {
        return this.RackId;
    }

    /**
     * Set 机架ID
     * @param RackId 机架ID
     */
    public void setRackId(Long RackId) {
        this.RackId = RackId;
    }

    /**
     * Get 是否开电 
     * @return IsPowerOn 是否开电
     */
    public Boolean getIsPowerOn() {
        return this.IsPowerOn;
    }

    /**
     * Set 是否开电
     * @param IsPowerOn 是否开电
     */
    public void setIsPowerOn(Boolean IsPowerOn) {
        this.IsPowerOn = IsPowerOn;
    }

    /**
     * Get 机架最近一次开电时间，YYYY-MM-DD 格式 
     * @return RackOpenTime 机架最近一次开电时间，YYYY-MM-DD 格式
     */
    public String getRackOpenTime() {
        return this.RackOpenTime;
    }

    /**
     * Set 机架最近一次开电时间，YYYY-MM-DD 格式
     * @param RackOpenTime 机架最近一次开电时间，YYYY-MM-DD 格式
     */
    public void setRackOpenTime(String RackOpenTime) {
        this.RackOpenTime = RackOpenTime;
    }

    /**
     * Get 托管类型 
     * @return HostingType 托管类型
     */
    public String getHostingType() {
        return this.HostingType;
    }

    /**
     * Set 托管类型
     * @param HostingType 托管类型
     */
    public void setHostingType(String HostingType) {
        this.HostingType = HostingType;
    }

    public Rack() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Rack(Rack source) {
        if (source.RackName != null) {
            this.RackName = new String(source.RackName);
        }
        if (source.IdcUnitId != null) {
            this.IdcUnitId = new Long(source.IdcUnitId);
        }
        if (source.IdcUnitName != null) {
            this.IdcUnitName = new String(source.IdcUnitName);
        }
        if (source.IdcName != null) {
            this.IdcName = new String(source.IdcName);
        }
        if (source.IdcId != null) {
            this.IdcId = new Long(source.IdcId);
        }
        if (source.RackId != null) {
            this.RackId = new Long(source.RackId);
        }
        if (source.IsPowerOn != null) {
            this.IsPowerOn = new Boolean(source.IsPowerOn);
        }
        if (source.RackOpenTime != null) {
            this.RackOpenTime = new String(source.RackOpenTime);
        }
        if (source.HostingType != null) {
            this.HostingType = new String(source.HostingType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RackName", this.RackName);
        this.setParamSimple(map, prefix + "IdcUnitId", this.IdcUnitId);
        this.setParamSimple(map, prefix + "IdcUnitName", this.IdcUnitName);
        this.setParamSimple(map, prefix + "IdcName", this.IdcName);
        this.setParamSimple(map, prefix + "IdcId", this.IdcId);
        this.setParamSimple(map, prefix + "RackId", this.RackId);
        this.setParamSimple(map, prefix + "IsPowerOn", this.IsPowerOn);
        this.setParamSimple(map, prefix + "RackOpenTime", this.RackOpenTime);
        this.setParamSimple(map, prefix + "HostingType", this.HostingType);

    }
}

