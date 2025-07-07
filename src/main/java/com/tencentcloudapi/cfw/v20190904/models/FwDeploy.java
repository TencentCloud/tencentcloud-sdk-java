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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FwDeploy extends AbstractModel {

    /**
    * 防火墙部署地域
    */
    @SerializedName("DeployRegion")
    @Expose
    private String DeployRegion;

    /**
    * 带宽，单位：Mbps
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 异地灾备 1：使用异地灾备；0：不使用异地灾备；为空则默认不使用异地灾备
    */
    @SerializedName("CrossAZone")
    @Expose
    private Long CrossAZone;

    /**
    * 主可用区，为空则选择默认可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 备可用区，为空则选择默认可用区
    */
    @SerializedName("ZoneBak")
    @Expose
    private String ZoneBak;

    /**
    * 若为cdc防火墙时填充该id
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
     * Get 防火墙部署地域 
     * @return DeployRegion 防火墙部署地域
     */
    public String getDeployRegion() {
        return this.DeployRegion;
    }

    /**
     * Set 防火墙部署地域
     * @param DeployRegion 防火墙部署地域
     */
    public void setDeployRegion(String DeployRegion) {
        this.DeployRegion = DeployRegion;
    }

    /**
     * Get 带宽，单位：Mbps 
     * @return Width 带宽，单位：Mbps
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 带宽，单位：Mbps
     * @param Width 带宽，单位：Mbps
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 异地灾备 1：使用异地灾备；0：不使用异地灾备；为空则默认不使用异地灾备 
     * @return CrossAZone 异地灾备 1：使用异地灾备；0：不使用异地灾备；为空则默认不使用异地灾备
     */
    public Long getCrossAZone() {
        return this.CrossAZone;
    }

    /**
     * Set 异地灾备 1：使用异地灾备；0：不使用异地灾备；为空则默认不使用异地灾备
     * @param CrossAZone 异地灾备 1：使用异地灾备；0：不使用异地灾备；为空则默认不使用异地灾备
     */
    public void setCrossAZone(Long CrossAZone) {
        this.CrossAZone = CrossAZone;
    }

    /**
     * Get 主可用区，为空则选择默认可用区 
     * @return Zone 主可用区，为空则选择默认可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 主可用区，为空则选择默认可用区
     * @param Zone 主可用区，为空则选择默认可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 备可用区，为空则选择默认可用区 
     * @return ZoneBak 备可用区，为空则选择默认可用区
     */
    public String getZoneBak() {
        return this.ZoneBak;
    }

    /**
     * Set 备可用区，为空则选择默认可用区
     * @param ZoneBak 备可用区，为空则选择默认可用区
     */
    public void setZoneBak(String ZoneBak) {
        this.ZoneBak = ZoneBak;
    }

    /**
     * Get 若为cdc防火墙时填充该id 
     * @return CdcId 若为cdc防火墙时填充该id
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set 若为cdc防火墙时填充该id
     * @param CdcId 若为cdc防火墙时填充该id
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    public FwDeploy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FwDeploy(FwDeploy source) {
        if (source.DeployRegion != null) {
            this.DeployRegion = new String(source.DeployRegion);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.CrossAZone != null) {
            this.CrossAZone = new Long(source.CrossAZone);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneBak != null) {
            this.ZoneBak = new String(source.ZoneBak);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployRegion", this.DeployRegion);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "CrossAZone", this.CrossAZone);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneBak", this.ZoneBak);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);

    }
}

