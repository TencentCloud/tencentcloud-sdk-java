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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel{

    /**
    * 可用区数值形式的唯一ID，如：100001
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 可用区字符串形式的唯一ID，如：ap-guangzhou-1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 可用区名称，如：广州一区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 可用区所属地域，如：ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneRegion")
    @Expose
    private String ZoneRegion;

    /**
    * 可用区是否是LocalZone可用区，如：false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalZone")
    @Expose
    private Boolean LocalZone;

    /**
     * Get 可用区数值形式的唯一ID，如：100001
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId 可用区数值形式的唯一ID，如：100001
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区数值形式的唯一ID，如：100001
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId 可用区数值形式的唯一ID，如：100001
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 可用区字符串形式的唯一ID，如：ap-guangzhou-1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 可用区字符串形式的唯一ID，如：ap-guangzhou-1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区字符串形式的唯一ID，如：ap-guangzhou-1
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 可用区字符串形式的唯一ID，如：ap-guangzhou-1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 可用区名称，如：广州一区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneName 可用区名称，如：广州一区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 可用区名称，如：广州一区
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneName 可用区名称，如：广州一区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 可用区所属地域，如：ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneRegion 可用区所属地域，如：ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneRegion() {
        return this.ZoneRegion;
    }

    /**
     * Set 可用区所属地域，如：ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneRegion 可用区所属地域，如：ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneRegion(String ZoneRegion) {
        this.ZoneRegion = ZoneRegion;
    }

    /**
     * Get 可用区是否是LocalZone可用区，如：false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalZone 可用区是否是LocalZone可用区，如：false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getLocalZone() {
        return this.LocalZone;
    }

    /**
     * Set 可用区是否是LocalZone可用区，如：false
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalZone 可用区是否是LocalZone可用区，如：false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalZone(Boolean LocalZone) {
        this.LocalZone = LocalZone;
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

    }
}

