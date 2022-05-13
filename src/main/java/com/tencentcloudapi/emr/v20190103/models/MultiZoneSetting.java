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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiZoneSetting extends AbstractModel{

    /**
    * "master"、"standby"、"third-party"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneTag")
    @Expose
    private String ZoneTag;

    /**
    * 无
    */
    @SerializedName("VPCSettings")
    @Expose
    private VPCSettings VPCSettings;

    /**
    * 无
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 无
    */
    @SerializedName("ResourceSpec")
    @Expose
    private NewResourceSpec ResourceSpec;

    /**
     * Get "master"、"standby"、"third-party"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneTag "master"、"standby"、"third-party"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneTag() {
        return this.ZoneTag;
    }

    /**
     * Set "master"、"standby"、"third-party"
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneTag "master"、"standby"、"third-party"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneTag(String ZoneTag) {
        this.ZoneTag = ZoneTag;
    }

    /**
     * Get 无 
     * @return VPCSettings 无
     */
    public VPCSettings getVPCSettings() {
        return this.VPCSettings;
    }

    /**
     * Set 无
     * @param VPCSettings 无
     */
    public void setVPCSettings(VPCSettings VPCSettings) {
        this.VPCSettings = VPCSettings;
    }

    /**
     * Get 无 
     * @return Placement 无
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 无
     * @param Placement 无
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 无 
     * @return ResourceSpec 无
     */
    public NewResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * Set 无
     * @param ResourceSpec 无
     */
    public void setResourceSpec(NewResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    public MultiZoneSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiZoneSetting(MultiZoneSetting source) {
        if (source.ZoneTag != null) {
            this.ZoneTag = new String(source.ZoneTag);
        }
        if (source.VPCSettings != null) {
            this.VPCSettings = new VPCSettings(source.VPCSettings);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.ResourceSpec != null) {
            this.ResourceSpec = new NewResourceSpec(source.ResourceSpec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneTag", this.ZoneTag);
        this.setParamObj(map, prefix + "VPCSettings.", this.VPCSettings);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamObj(map, prefix + "ResourceSpec.", this.ResourceSpec);

    }
}

