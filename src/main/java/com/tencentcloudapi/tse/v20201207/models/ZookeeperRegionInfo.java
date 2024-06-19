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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZookeeperRegionInfo extends AbstractModel {

    /**
    * 部署架构信息

- SingleRegion: 普通单地域
- MultiRegion: 普通多地域场景
- MasterSlave: 两地域，主备地域场景
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployMode")
    @Expose
    private String DeployMode;

    /**
    * 主地域的额外信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainRegion")
    @Expose
    private ZookeeperRegionMyIdInfo MainRegion;

    /**
    * 其他地域的额外信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtherRegions")
    @Expose
    private ZookeeperRegionMyIdInfo [] OtherRegions;

    /**
     * Get 部署架构信息

- SingleRegion: 普通单地域
- MultiRegion: 普通多地域场景
- MasterSlave: 两地域，主备地域场景
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployMode 部署架构信息

- SingleRegion: 普通单地域
- MultiRegion: 普通多地域场景
- MasterSlave: 两地域，主备地域场景
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set 部署架构信息

- SingleRegion: 普通单地域
- MultiRegion: 普通多地域场景
- MasterSlave: 两地域，主备地域场景
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployMode 部署架构信息

- SingleRegion: 普通单地域
- MultiRegion: 普通多地域场景
- MasterSlave: 两地域，主备地域场景
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployMode(String DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get 主地域的额外信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainRegion 主地域的额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ZookeeperRegionMyIdInfo getMainRegion() {
        return this.MainRegion;
    }

    /**
     * Set 主地域的额外信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainRegion 主地域的额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainRegion(ZookeeperRegionMyIdInfo MainRegion) {
        this.MainRegion = MainRegion;
    }

    /**
     * Get 其他地域的额外信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtherRegions 其他地域的额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ZookeeperRegionMyIdInfo [] getOtherRegions() {
        return this.OtherRegions;
    }

    /**
     * Set 其他地域的额外信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtherRegions 其他地域的额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtherRegions(ZookeeperRegionMyIdInfo [] OtherRegions) {
        this.OtherRegions = OtherRegions;
    }

    public ZookeeperRegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZookeeperRegionInfo(ZookeeperRegionInfo source) {
        if (source.DeployMode != null) {
            this.DeployMode = new String(source.DeployMode);
        }
        if (source.MainRegion != null) {
            this.MainRegion = new ZookeeperRegionMyIdInfo(source.MainRegion);
        }
        if (source.OtherRegions != null) {
            this.OtherRegions = new ZookeeperRegionMyIdInfo[source.OtherRegions.length];
            for (int i = 0; i < source.OtherRegions.length; i++) {
                this.OtherRegions[i] = new ZookeeperRegionMyIdInfo(source.OtherRegions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamObj(map, prefix + "MainRegion.", this.MainRegion);
        this.setParamArrayObj(map, prefix + "OtherRegions.", this.OtherRegions);

    }
}

