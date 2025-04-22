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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel {

    /**
    * 可用区数值形式的唯一ID，如：100001
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 可用区字符串形式的唯一ID，如：ap-guangzhou-1
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 可用区名称，如：广州一区
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 可用区所属地域，如：ap-guangzhou
    */
    @SerializedName("ZoneRegion")
    @Expose
    private String ZoneRegion;

    /**
    * 可用区是否是LocalZone可用区，如：false
    */
    @SerializedName("LocalZone")
    @Expose
    private Boolean LocalZone;

    /**
    * 可用区是否是EdgeZone可用区，如：false
    */
    @SerializedName("EdgeZone")
    @Expose
    private Boolean EdgeZone;

    /**
     * Get 可用区数值形式的唯一ID，如：100001 
     * @return ZoneId 可用区数值形式的唯一ID，如：100001
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区数值形式的唯一ID，如：100001
     * @param ZoneId 可用区数值形式的唯一ID，如：100001
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 可用区字符串形式的唯一ID，如：ap-guangzhou-1 
     * @return Zone 可用区字符串形式的唯一ID，如：ap-guangzhou-1
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区字符串形式的唯一ID，如：ap-guangzhou-1
     * @param Zone 可用区字符串形式的唯一ID，如：ap-guangzhou-1
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 可用区名称，如：广州一区 
     * @return ZoneName 可用区名称，如：广州一区
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 可用区名称，如：广州一区
     * @param ZoneName 可用区名称，如：广州一区
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 可用区所属地域，如：ap-guangzhou 
     * @return ZoneRegion 可用区所属地域，如：ap-guangzhou
     */
    public String getZoneRegion() {
        return this.ZoneRegion;
    }

    /**
     * Set 可用区所属地域，如：ap-guangzhou
     * @param ZoneRegion 可用区所属地域，如：ap-guangzhou
     */
    public void setZoneRegion(String ZoneRegion) {
        this.ZoneRegion = ZoneRegion;
    }

    /**
     * Get 可用区是否是LocalZone可用区，如：false 
     * @return LocalZone 可用区是否是LocalZone可用区，如：false
     */
    public Boolean getLocalZone() {
        return this.LocalZone;
    }

    /**
     * Set 可用区是否是LocalZone可用区，如：false
     * @param LocalZone 可用区是否是LocalZone可用区，如：false
     */
    public void setLocalZone(Boolean LocalZone) {
        this.LocalZone = LocalZone;
    }

    /**
     * Get 可用区是否是EdgeZone可用区，如：false 
     * @return EdgeZone 可用区是否是EdgeZone可用区，如：false
     */
    public Boolean getEdgeZone() {
        return this.EdgeZone;
    }

    /**
     * Set 可用区是否是EdgeZone可用区，如：false
     * @param EdgeZone 可用区是否是EdgeZone可用区，如：false
     */
    public void setEdgeZone(Boolean EdgeZone) {
        this.EdgeZone = EdgeZone;
    }

    public ZoneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneInfo(ZoneInfo source) {
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ZoneRegion != null) {
            this.ZoneRegion = new String(source.ZoneRegion);
        }
        if (source.LocalZone != null) {
            this.LocalZone = new Boolean(source.LocalZone);
        }
        if (source.EdgeZone != null) {
            this.EdgeZone = new Boolean(source.EdgeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ZoneRegion", this.ZoneRegion);
        this.setParamSimple(map, prefix + "LocalZone", this.LocalZone);
        this.setParamSimple(map, prefix + "EdgeZone", this.EdgeZone);

    }
}

