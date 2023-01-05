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
package com.tencentcloudapi.api.v20201106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel{

    /**
    * 可用区名称，例如，ap-guangzhou-3
全网可用区名称如下：
<li> ap-chongqing-1 </li>
<li> ap-seoul-1 </li>
<li> ap-seoul-2 </li>
<li> ap-chengdu-1 </li>
<li> ap-chengdu-2 </li>
<li> ap-hongkong-1 </li>
<li> ap-hongkong-2 </li>
<li> ap-shenzhen-fsi-1 </li>
<li> ap-shenzhen-fsi-2 </li>
<li> ap-shenzhen-fsi-3 </li>
<li> ap-guangzhou-1（售罄）</li>
<li> ap-guangzhou-2（售罄）</li>
<li> ap-guangzhou-3 </li>
<li> ap-guangzhou-4 </li>
<li> ap-guangzhou-6 </li>
<li> ap-tokyo-1 </li>
<li> ap-singapore-1 </li>
<li> ap-singapore-2 </li>
<li> ap-shanghai-fsi-1 </li>
<li> ap-shanghai-fsi-2 </li>
<li> ap-shanghai-fsi-3 </li>
<li> ap-bangkok-1 </li>
<li> ap-shanghai-1（售罄） </li>
<li> ap-shanghai-2 </li>
<li> ap-shanghai-3 </li>
<li> ap-shanghai-4 </li>
<li> ap-shanghai-5 </li>
<li> ap-mumbai-1 </li>
<li> ap-mumbai-2 </li>
<li> eu-moscow-1 </li>
<li> ap-beijing-1 </li>
<li> ap-beijing-2 </li>
<li> ap-beijing-3 </li>
<li> ap-beijing-4 </li>
<li> ap-beijing-5 </li>
<li> na-siliconvalley-1 </li>
<li> na-siliconvalley-2 </li>
<li> eu-frankfurt-1 </li>
<li> na-toronto-1 </li>
<li> na-ashburn-1 </li>
<li> na-ashburn-2 </li>
<li> ap-nanjing-1 </li>
<li> ap-nanjing-2 </li>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 可用区描述，例如，广州三区
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 可用区ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 可用区状态，包含AVAILABLE和UNAVAILABLE。AVAILABLE代表可用，UNAVAILABLE代表不可用。
    */
    @SerializedName("ZoneState")
    @Expose
    private String ZoneState;

    /**
    * 父级zone
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentZone")
    @Expose
    private String ParentZone;

    /**
    * 父级可用区ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentZoneId")
    @Expose
    private String ParentZoneId;

    /**
    * 父级可用区描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentZoneName")
    @Expose
    private String ParentZoneName;

    /**
    * zone类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneType")
    @Expose
    private String ZoneType;

    /**
    * 控制台类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineRoomTypeMC")
    @Expose
    private String MachineRoomTypeMC;

    /**
    * 和ZoneId一样，适用于控制台调用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneIdMC")
    @Expose
    private String ZoneIdMC;

    /**
     * Get 可用区名称，例如，ap-guangzhou-3
全网可用区名称如下：
<li> ap-chongqing-1 </li>
<li> ap-seoul-1 </li>
<li> ap-seoul-2 </li>
<li> ap-chengdu-1 </li>
<li> ap-chengdu-2 </li>
<li> ap-hongkong-1 </li>
<li> ap-hongkong-2 </li>
<li> ap-shenzhen-fsi-1 </li>
<li> ap-shenzhen-fsi-2 </li>
<li> ap-shenzhen-fsi-3 </li>
<li> ap-guangzhou-1（售罄）</li>
<li> ap-guangzhou-2（售罄）</li>
<li> ap-guangzhou-3 </li>
<li> ap-guangzhou-4 </li>
<li> ap-guangzhou-6 </li>
<li> ap-tokyo-1 </li>
<li> ap-singapore-1 </li>
<li> ap-singapore-2 </li>
<li> ap-shanghai-fsi-1 </li>
<li> ap-shanghai-fsi-2 </li>
<li> ap-shanghai-fsi-3 </li>
<li> ap-bangkok-1 </li>
<li> ap-shanghai-1（售罄） </li>
<li> ap-shanghai-2 </li>
<li> ap-shanghai-3 </li>
<li> ap-shanghai-4 </li>
<li> ap-shanghai-5 </li>
<li> ap-mumbai-1 </li>
<li> ap-mumbai-2 </li>
<li> eu-moscow-1 </li>
<li> ap-beijing-1 </li>
<li> ap-beijing-2 </li>
<li> ap-beijing-3 </li>
<li> ap-beijing-4 </li>
<li> ap-beijing-5 </li>
<li> na-siliconvalley-1 </li>
<li> na-siliconvalley-2 </li>
<li> eu-frankfurt-1 </li>
<li> na-toronto-1 </li>
<li> na-ashburn-1 </li>
<li> na-ashburn-2 </li>
<li> ap-nanjing-1 </li>
<li> ap-nanjing-2 </li> 
     * @return Zone 可用区名称，例如，ap-guangzhou-3
全网可用区名称如下：
<li> ap-chongqing-1 </li>
<li> ap-seoul-1 </li>
<li> ap-seoul-2 </li>
<li> ap-chengdu-1 </li>
<li> ap-chengdu-2 </li>
<li> ap-hongkong-1 </li>
<li> ap-hongkong-2 </li>
<li> ap-shenzhen-fsi-1 </li>
<li> ap-shenzhen-fsi-2 </li>
<li> ap-shenzhen-fsi-3 </li>
<li> ap-guangzhou-1（售罄）</li>
<li> ap-guangzhou-2（售罄）</li>
<li> ap-guangzhou-3 </li>
<li> ap-guangzhou-4 </li>
<li> ap-guangzhou-6 </li>
<li> ap-tokyo-1 </li>
<li> ap-singapore-1 </li>
<li> ap-singapore-2 </li>
<li> ap-shanghai-fsi-1 </li>
<li> ap-shanghai-fsi-2 </li>
<li> ap-shanghai-fsi-3 </li>
<li> ap-bangkok-1 </li>
<li> ap-shanghai-1（售罄） </li>
<li> ap-shanghai-2 </li>
<li> ap-shanghai-3 </li>
<li> ap-shanghai-4 </li>
<li> ap-shanghai-5 </li>
<li> ap-mumbai-1 </li>
<li> ap-mumbai-2 </li>
<li> eu-moscow-1 </li>
<li> ap-beijing-1 </li>
<li> ap-beijing-2 </li>
<li> ap-beijing-3 </li>
<li> ap-beijing-4 </li>
<li> ap-beijing-5 </li>
<li> na-siliconvalley-1 </li>
<li> na-siliconvalley-2 </li>
<li> eu-frankfurt-1 </li>
<li> na-toronto-1 </li>
<li> na-ashburn-1 </li>
<li> na-ashburn-2 </li>
<li> ap-nanjing-1 </li>
<li> ap-nanjing-2 </li>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区名称，例如，ap-guangzhou-3
全网可用区名称如下：
<li> ap-chongqing-1 </li>
<li> ap-seoul-1 </li>
<li> ap-seoul-2 </li>
<li> ap-chengdu-1 </li>
<li> ap-chengdu-2 </li>
<li> ap-hongkong-1 </li>
<li> ap-hongkong-2 </li>
<li> ap-shenzhen-fsi-1 </li>
<li> ap-shenzhen-fsi-2 </li>
<li> ap-shenzhen-fsi-3 </li>
<li> ap-guangzhou-1（售罄）</li>
<li> ap-guangzhou-2（售罄）</li>
<li> ap-guangzhou-3 </li>
<li> ap-guangzhou-4 </li>
<li> ap-guangzhou-6 </li>
<li> ap-tokyo-1 </li>
<li> ap-singapore-1 </li>
<li> ap-singapore-2 </li>
<li> ap-shanghai-fsi-1 </li>
<li> ap-shanghai-fsi-2 </li>
<li> ap-shanghai-fsi-3 </li>
<li> ap-bangkok-1 </li>
<li> ap-shanghai-1（售罄） </li>
<li> ap-shanghai-2 </li>
<li> ap-shanghai-3 </li>
<li> ap-shanghai-4 </li>
<li> ap-shanghai-5 </li>
<li> ap-mumbai-1 </li>
<li> ap-mumbai-2 </li>
<li> eu-moscow-1 </li>
<li> ap-beijing-1 </li>
<li> ap-beijing-2 </li>
<li> ap-beijing-3 </li>
<li> ap-beijing-4 </li>
<li> ap-beijing-5 </li>
<li> na-siliconvalley-1 </li>
<li> na-siliconvalley-2 </li>
<li> eu-frankfurt-1 </li>
<li> na-toronto-1 </li>
<li> na-ashburn-1 </li>
<li> na-ashburn-2 </li>
<li> ap-nanjing-1 </li>
<li> ap-nanjing-2 </li>
     * @param Zone 可用区名称，例如，ap-guangzhou-3
全网可用区名称如下：
<li> ap-chongqing-1 </li>
<li> ap-seoul-1 </li>
<li> ap-seoul-2 </li>
<li> ap-chengdu-1 </li>
<li> ap-chengdu-2 </li>
<li> ap-hongkong-1 </li>
<li> ap-hongkong-2 </li>
<li> ap-shenzhen-fsi-1 </li>
<li> ap-shenzhen-fsi-2 </li>
<li> ap-shenzhen-fsi-3 </li>
<li> ap-guangzhou-1（售罄）</li>
<li> ap-guangzhou-2（售罄）</li>
<li> ap-guangzhou-3 </li>
<li> ap-guangzhou-4 </li>
<li> ap-guangzhou-6 </li>
<li> ap-tokyo-1 </li>
<li> ap-singapore-1 </li>
<li> ap-singapore-2 </li>
<li> ap-shanghai-fsi-1 </li>
<li> ap-shanghai-fsi-2 </li>
<li> ap-shanghai-fsi-3 </li>
<li> ap-bangkok-1 </li>
<li> ap-shanghai-1（售罄） </li>
<li> ap-shanghai-2 </li>
<li> ap-shanghai-3 </li>
<li> ap-shanghai-4 </li>
<li> ap-shanghai-5 </li>
<li> ap-mumbai-1 </li>
<li> ap-mumbai-2 </li>
<li> eu-moscow-1 </li>
<li> ap-beijing-1 </li>
<li> ap-beijing-2 </li>
<li> ap-beijing-3 </li>
<li> ap-beijing-4 </li>
<li> ap-beijing-5 </li>
<li> na-siliconvalley-1 </li>
<li> na-siliconvalley-2 </li>
<li> eu-frankfurt-1 </li>
<li> na-toronto-1 </li>
<li> na-ashburn-1 </li>
<li> na-ashburn-2 </li>
<li> ap-nanjing-1 </li>
<li> ap-nanjing-2 </li>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 可用区描述，例如，广州三区 
     * @return ZoneName 可用区描述，例如，广州三区
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 可用区描述，例如，广州三区
     * @param ZoneName 可用区描述，例如，广州三区
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 可用区ID 
     * @return ZoneId 可用区ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区ID
     * @param ZoneId 可用区ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 可用区状态，包含AVAILABLE和UNAVAILABLE。AVAILABLE代表可用，UNAVAILABLE代表不可用。 
     * @return ZoneState 可用区状态，包含AVAILABLE和UNAVAILABLE。AVAILABLE代表可用，UNAVAILABLE代表不可用。
     */
    public String getZoneState() {
        return this.ZoneState;
    }

    /**
     * Set 可用区状态，包含AVAILABLE和UNAVAILABLE。AVAILABLE代表可用，UNAVAILABLE代表不可用。
     * @param ZoneState 可用区状态，包含AVAILABLE和UNAVAILABLE。AVAILABLE代表可用，UNAVAILABLE代表不可用。
     */
    public void setZoneState(String ZoneState) {
        this.ZoneState = ZoneState;
    }

    /**
     * Get 父级zone
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentZone 父级zone
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentZone() {
        return this.ParentZone;
    }

    /**
     * Set 父级zone
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentZone 父级zone
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentZone(String ParentZone) {
        this.ParentZone = ParentZone;
    }

    /**
     * Get 父级可用区ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentZoneId 父级可用区ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentZoneId() {
        return this.ParentZoneId;
    }

    /**
     * Set 父级可用区ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentZoneId 父级可用区ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentZoneId(String ParentZoneId) {
        this.ParentZoneId = ParentZoneId;
    }

    /**
     * Get 父级可用区描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentZoneName 父级可用区描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentZoneName() {
        return this.ParentZoneName;
    }

    /**
     * Set 父级可用区描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentZoneName 父级可用区描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentZoneName(String ParentZoneName) {
        this.ParentZoneName = ParentZoneName;
    }

    /**
     * Get zone类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneType zone类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneType() {
        return this.ZoneType;
    }

    /**
     * Set zone类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneType zone类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneType(String ZoneType) {
        this.ZoneType = ZoneType;
    }

    /**
     * Get 控制台类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineRoomTypeMC 控制台类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMachineRoomTypeMC() {
        return this.MachineRoomTypeMC;
    }

    /**
     * Set 控制台类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineRoomTypeMC 控制台类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineRoomTypeMC(String MachineRoomTypeMC) {
        this.MachineRoomTypeMC = MachineRoomTypeMC;
    }

    /**
     * Get 和ZoneId一样，适用于控制台调用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneIdMC 和ZoneId一样，适用于控制台调用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneIdMC() {
        return this.ZoneIdMC;
    }

    /**
     * Set 和ZoneId一样，适用于控制台调用
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneIdMC 和ZoneId一样，适用于控制台调用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneIdMC(String ZoneIdMC) {
        this.ZoneIdMC = ZoneIdMC;
    }

    public ZoneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneInfo(ZoneInfo source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneState != null) {
            this.ZoneState = new String(source.ZoneState);
        }
        if (source.ParentZone != null) {
            this.ParentZone = new String(source.ParentZone);
        }
        if (source.ParentZoneId != null) {
            this.ParentZoneId = new String(source.ParentZoneId);
        }
        if (source.ParentZoneName != null) {
            this.ParentZoneName = new String(source.ParentZoneName);
        }
        if (source.ZoneType != null) {
            this.ZoneType = new String(source.ZoneType);
        }
        if (source.MachineRoomTypeMC != null) {
            this.MachineRoomTypeMC = new String(source.MachineRoomTypeMC);
        }
        if (source.ZoneIdMC != null) {
            this.ZoneIdMC = new String(source.ZoneIdMC);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneState", this.ZoneState);
        this.setParamSimple(map, prefix + "ParentZone", this.ParentZone);
        this.setParamSimple(map, prefix + "ParentZoneId", this.ParentZoneId);
        this.setParamSimple(map, prefix + "ParentZoneName", this.ParentZoneName);
        this.setParamSimple(map, prefix + "ZoneType", this.ZoneType);
        this.setParamSimple(map, prefix + "MachineRoomTypeMC", this.MachineRoomTypeMC);
        this.setParamSimple(map, prefix + "ZoneIdMC", this.ZoneIdMC);

    }
}

