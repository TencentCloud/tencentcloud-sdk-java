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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessPoint extends AbstractModel{

    /**
    * 接入点的名称。
    */
    @SerializedName("AccessPointName")
    @Expose
    private String AccessPointName;

    /**
    * 接入点唯一ID。
    */
    @SerializedName("AccessPointId")
    @Expose
    private String AccessPointId;

    /**
    * 接入点的状态。可用，不可用。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 接入点的位置。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 接入点支持的运营商列表。
    */
    @SerializedName("LineOperator")
    @Expose
    private String [] LineOperator;

    /**
    * 接入点管理的大区ID。
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
     * Get 接入点的名称。 
     * @return AccessPointName 接入点的名称。
     */
    public String getAccessPointName() {
        return this.AccessPointName;
    }

    /**
     * Set 接入点的名称。
     * @param AccessPointName 接入点的名称。
     */
    public void setAccessPointName(String AccessPointName) {
        this.AccessPointName = AccessPointName;
    }

    /**
     * Get 接入点唯一ID。 
     * @return AccessPointId 接入点唯一ID。
     */
    public String getAccessPointId() {
        return this.AccessPointId;
    }

    /**
     * Set 接入点唯一ID。
     * @param AccessPointId 接入点唯一ID。
     */
    public void setAccessPointId(String AccessPointId) {
        this.AccessPointId = AccessPointId;
    }

    /**
     * Get 接入点的状态。可用，不可用。 
     * @return State 接入点的状态。可用，不可用。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 接入点的状态。可用，不可用。
     * @param State 接入点的状态。可用，不可用。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 接入点的位置。 
     * @return Location 接入点的位置。
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 接入点的位置。
     * @param Location 接入点的位置。
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 接入点支持的运营商列表。 
     * @return LineOperator 接入点支持的运营商列表。
     */
    public String [] getLineOperator() {
        return this.LineOperator;
    }

    /**
     * Set 接入点支持的运营商列表。
     * @param LineOperator 接入点支持的运营商列表。
     */
    public void setLineOperator(String [] LineOperator) {
        this.LineOperator = LineOperator;
    }

    /**
     * Get 接入点管理的大区ID。 
     * @return RegionId 接入点管理的大区ID。
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 接入点管理的大区ID。
     * @param RegionId 接入点管理的大区ID。
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessPointName", this.AccessPointName);
        this.setParamSimple(map, prefix + "AccessPointId", this.AccessPointId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamArraySimple(map, prefix + "LineOperator.", this.LineOperator);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

