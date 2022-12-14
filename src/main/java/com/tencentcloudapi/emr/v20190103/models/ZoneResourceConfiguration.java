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

public class ZoneResourceConfiguration extends AbstractModel{

    /**
    * 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 所有节点资源的规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllNodeResourceSpec")
    @Expose
    private AllNodeResourceSpec AllNodeResourceSpec;

    /**
    * 如果是单可用区，ZoneTag可以不用填， 如果是双AZ部署，第一个可用区ZoneTag选择master，第二个可用区ZoneTag选择standby，如果是三AZ部署，第一个可用区ZoneTag选择master，第二个可用区ZoneTag选择standby，第三个可用区ZoneTag选择third-party，取值范围：
  <li>master</li>
  <li>standby</li>
  <li>third-party</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneTag")
    @Expose
    private String ZoneTag;

    /**
     * Get 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualPrivateCloud 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualPrivateCloud 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Get 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Placement 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Placement 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 所有节点资源的规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllNodeResourceSpec 所有节点资源的规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AllNodeResourceSpec getAllNodeResourceSpec() {
        return this.AllNodeResourceSpec;
    }

    /**
     * Set 所有节点资源的规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllNodeResourceSpec 所有节点资源的规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllNodeResourceSpec(AllNodeResourceSpec AllNodeResourceSpec) {
        this.AllNodeResourceSpec = AllNodeResourceSpec;
    }

    /**
     * Get 如果是单可用区，ZoneTag可以不用填， 如果是双AZ部署，第一个可用区ZoneTag选择master，第二个可用区ZoneTag选择standby，如果是三AZ部署，第一个可用区ZoneTag选择master，第二个可用区ZoneTag选择standby，第三个可用区ZoneTag选择third-party，取值范围：
  <li>master</li>
  <li>standby</li>
  <li>third-party</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneTag 如果是单可用区，ZoneTag可以不用填， 如果是双AZ部署，第一个可用区ZoneTag选择master，第二个可用区ZoneTag选择standby，如果是三AZ部署，第一个可用区ZoneTag选择master，第二个可用区ZoneTag选择standby，第三个可用区ZoneTag选择third-party，取值范围：
  <li>master</li>
  <li>standby</li>
  <li>third-party</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneTag() {
        return this.ZoneTag;
    }

    /**
     * Set 如果是单可用区，ZoneTag可以不用填， 如果是双AZ部署，第一个可用区ZoneTag选择master，第二个可用区ZoneTag选择standby，如果是三AZ部署，第一个可用区ZoneTag选择master，第二个可用区ZoneTag选择standby，第三个可用区ZoneTag选择third-party，取值范围：
  <li>master</li>
  <li>standby</li>
  <li>third-party</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneTag 如果是单可用区，ZoneTag可以不用填， 如果是双AZ部署，第一个可用区ZoneTag选择master，第二个可用区ZoneTag选择standby，如果是三AZ部署，第一个可用区ZoneTag选择master，第二个可用区ZoneTag选择standby，第三个可用区ZoneTag选择third-party，取值范围：
  <li>master</li>
  <li>standby</li>
  <li>third-party</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneTag(String ZoneTag) {
        this.ZoneTag = ZoneTag;
    }

    public ZoneResourceConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneResourceConfiguration(ZoneResourceConfiguration source) {
        if (source.VirtualPrivateCloud != null) {
            this.VirtualPrivateCloud = new VirtualPrivateCloud(source.VirtualPrivateCloud);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.AllNodeResourceSpec != null) {
            this.AllNodeResourceSpec = new AllNodeResourceSpec(source.AllNodeResourceSpec);
        }
        if (source.ZoneTag != null) {
            this.ZoneTag = new String(source.ZoneTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "VirtualPrivateCloud.", this.VirtualPrivateCloud);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamObj(map, prefix + "AllNodeResourceSpec.", this.AllNodeResourceSpec);
        this.setParamSimple(map, prefix + "ZoneTag", this.ZoneTag);

    }
}

