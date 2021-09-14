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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatFwInstance extends AbstractModel{

    /**
    * nat实例id
    */
    @SerializedName("NatinsId")
    @Expose
    private String NatinsId;

    /**
    * nat实例名称
    */
    @SerializedName("NatinsName")
    @Expose
    private String NatinsName;

    /**
    * 实例所在地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 0:新增模式，1:接入模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwMode")
    @Expose
    private Long FwMode;

    /**
    * 0:正常状态， 1: 正在创建
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * nat公网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NatIp")
    @Expose
    private String NatIp;

    /**
     * Get nat实例id 
     * @return NatinsId nat实例id
     */
    public String getNatinsId() {
        return this.NatinsId;
    }

    /**
     * Set nat实例id
     * @param NatinsId nat实例id
     */
    public void setNatinsId(String NatinsId) {
        this.NatinsId = NatinsId;
    }

    /**
     * Get nat实例名称 
     * @return NatinsName nat实例名称
     */
    public String getNatinsName() {
        return this.NatinsName;
    }

    /**
     * Set nat实例名称
     * @param NatinsName nat实例名称
     */
    public void setNatinsName(String NatinsName) {
        this.NatinsName = NatinsName;
    }

    /**
     * Get 实例所在地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 实例所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所在地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 实例所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 0:新增模式，1:接入模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwMode 0:新增模式，1:接入模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFwMode() {
        return this.FwMode;
    }

    /**
     * Set 0:新增模式，1:接入模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwMode 0:新增模式，1:接入模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwMode(Long FwMode) {
        this.FwMode = FwMode;
    }

    /**
     * Get 0:正常状态， 1: 正在创建
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 0:正常状态， 1: 正在创建
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0:正常状态， 1: 正在创建
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 0:正常状态， 1: 正在创建
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get nat公网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NatIp nat公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNatIp() {
        return this.NatIp;
    }

    /**
     * Set nat公网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param NatIp nat公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNatIp(String NatIp) {
        this.NatIp = NatIp;
    }

    public NatFwInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatFwInstance(NatFwInstance source) {
        if (source.NatinsId != null) {
            this.NatinsId = new String(source.NatinsId);
        }
        if (source.NatinsName != null) {
            this.NatinsName = new String(source.NatinsName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.FwMode != null) {
            this.FwMode = new Long(source.FwMode);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.NatIp != null) {
            this.NatIp = new String(source.NatIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatinsId", this.NatinsId);
        this.setParamSimple(map, prefix + "NatinsName", this.NatinsName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "FwMode", this.FwMode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NatIp", this.NatIp);

    }
}

