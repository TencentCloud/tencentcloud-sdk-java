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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DdosRule extends AbstractModel{

    /**
    * DDoS防护等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DdosStatusInfo")
    @Expose
    private DDoSStatusInfo DdosStatusInfo;

    /**
    * DDoS地域封禁
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DdosGeoIp")
    @Expose
    private DDoSGeoIp DdosGeoIp;

    /**
    * DDoS黑白名单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DdosAllowBlock")
    @Expose
    private DdosAllowBlock DdosAllowBlock;

    /**
    * DDoS 协议封禁+连接防护
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DdosAntiPly")
    @Expose
    private DDoSAntiPly DdosAntiPly;

    /**
    * DDoS特征过滤
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DdosPacketFilter")
    @Expose
    private DdosPacketFilter DdosPacketFilter;

    /**
    * DDoS端口过滤
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DdosAcl")
    @Expose
    private DdosAcls DdosAcl;

    /**
    * DDoS开关 on-开启；off-关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get DDoS防护等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DdosStatusInfo DDoS防护等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DDoSStatusInfo getDdosStatusInfo() {
        return this.DdosStatusInfo;
    }

    /**
     * Set DDoS防护等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param DdosStatusInfo DDoS防护等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDdosStatusInfo(DDoSStatusInfo DdosStatusInfo) {
        this.DdosStatusInfo = DdosStatusInfo;
    }

    /**
     * Get DDoS地域封禁
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DdosGeoIp DDoS地域封禁
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DDoSGeoIp getDdosGeoIp() {
        return this.DdosGeoIp;
    }

    /**
     * Set DDoS地域封禁
注意：此字段可能返回 null，表示取不到有效值。
     * @param DdosGeoIp DDoS地域封禁
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDdosGeoIp(DDoSGeoIp DdosGeoIp) {
        this.DdosGeoIp = DdosGeoIp;
    }

    /**
     * Get DDoS黑白名单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DdosAllowBlock DDoS黑白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DdosAllowBlock getDdosAllowBlock() {
        return this.DdosAllowBlock;
    }

    /**
     * Set DDoS黑白名单
注意：此字段可能返回 null，表示取不到有效值。
     * @param DdosAllowBlock DDoS黑白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDdosAllowBlock(DdosAllowBlock DdosAllowBlock) {
        this.DdosAllowBlock = DdosAllowBlock;
    }

    /**
     * Get DDoS 协议封禁+连接防护
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DdosAntiPly DDoS 协议封禁+连接防护
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DDoSAntiPly getDdosAntiPly() {
        return this.DdosAntiPly;
    }

    /**
     * Set DDoS 协议封禁+连接防护
注意：此字段可能返回 null，表示取不到有效值。
     * @param DdosAntiPly DDoS 协议封禁+连接防护
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDdosAntiPly(DDoSAntiPly DdosAntiPly) {
        this.DdosAntiPly = DdosAntiPly;
    }

    /**
     * Get DDoS特征过滤
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DdosPacketFilter DDoS特征过滤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DdosPacketFilter getDdosPacketFilter() {
        return this.DdosPacketFilter;
    }

    /**
     * Set DDoS特征过滤
注意：此字段可能返回 null，表示取不到有效值。
     * @param DdosPacketFilter DDoS特征过滤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDdosPacketFilter(DdosPacketFilter DdosPacketFilter) {
        this.DdosPacketFilter = DdosPacketFilter;
    }

    /**
     * Get DDoS端口过滤
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DdosAcl DDoS端口过滤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DdosAcls getDdosAcl() {
        return this.DdosAcl;
    }

    /**
     * Set DDoS端口过滤
注意：此字段可能返回 null，表示取不到有效值。
     * @param DdosAcl DDoS端口过滤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDdosAcl(DdosAcls DdosAcl) {
        this.DdosAcl = DdosAcl;
    }

    /**
     * Get DDoS开关 on-开启；off-关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch DDoS开关 on-开启；off-关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set DDoS开关 on-开启；off-关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch DDoS开关 on-开启；off-关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public DdosRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DdosRule(DdosRule source) {
        if (source.DdosStatusInfo != null) {
            this.DdosStatusInfo = new DDoSStatusInfo(source.DdosStatusInfo);
        }
        if (source.DdosGeoIp != null) {
            this.DdosGeoIp = new DDoSGeoIp(source.DdosGeoIp);
        }
        if (source.DdosAllowBlock != null) {
            this.DdosAllowBlock = new DdosAllowBlock(source.DdosAllowBlock);
        }
        if (source.DdosAntiPly != null) {
            this.DdosAntiPly = new DDoSAntiPly(source.DdosAntiPly);
        }
        if (source.DdosPacketFilter != null) {
            this.DdosPacketFilter = new DdosPacketFilter(source.DdosPacketFilter);
        }
        if (source.DdosAcl != null) {
            this.DdosAcl = new DdosAcls(source.DdosAcl);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DdosStatusInfo.", this.DdosStatusInfo);
        this.setParamObj(map, prefix + "DdosGeoIp.", this.DdosGeoIp);
        this.setParamObj(map, prefix + "DdosAllowBlock.", this.DdosAllowBlock);
        this.setParamObj(map, prefix + "DdosAntiPly.", this.DdosAntiPly);
        this.setParamObj(map, prefix + "DdosPacketFilter.", this.DdosPacketFilter);
        this.setParamObj(map, prefix + "DdosAcl.", this.DdosAcl);
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

