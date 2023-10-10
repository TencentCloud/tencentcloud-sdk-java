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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CanFixVulInfo extends AbstractModel{

    /**
    * 漏洞id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 该漏洞可修复的主机信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostList")
    @Expose
    private VulInfoHostInfo [] HostList;

    /**
    * 修复提示tag
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FixTag")
    @Expose
    private String [] FixTag;

    /**
     * Get 漏洞id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulId 漏洞id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set 漏洞id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulId 漏洞id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulName 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulName 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get 该漏洞可修复的主机信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostList 该漏洞可修复的主机信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VulInfoHostInfo [] getHostList() {
        return this.HostList;
    }

    /**
     * Set 该漏洞可修复的主机信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostList 该漏洞可修复的主机信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostList(VulInfoHostInfo [] HostList) {
        this.HostList = HostList;
    }

    /**
     * Get 修复提示tag
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FixTag 修复提示tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFixTag() {
        return this.FixTag;
    }

    /**
     * Set 修复提示tag
注意：此字段可能返回 null，表示取不到有效值。
     * @param FixTag 修复提示tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFixTag(String [] FixTag) {
        this.FixTag = FixTag;
    }

    public CanFixVulInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CanFixVulInfo(CanFixVulInfo source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.HostList != null) {
            this.HostList = new VulInfoHostInfo[source.HostList.length];
            for (int i = 0; i < source.HostList.length; i++) {
                this.HostList[i] = new VulInfoHostInfo(source.HostList[i]);
            }
        }
        if (source.FixTag != null) {
            this.FixTag = new String[source.FixTag.length];
            for (int i = 0; i < source.FixTag.length; i++) {
                this.FixTag[i] = new String(source.FixTag[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamArrayObj(map, prefix + "HostList.", this.HostList);
        this.setParamArraySimple(map, prefix + "FixTag.", this.FixTag);

    }
}

