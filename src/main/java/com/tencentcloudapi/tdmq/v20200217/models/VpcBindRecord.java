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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcBindRecord extends AbstractModel{

    /**
    * 租户Vpc Id
    */
    @SerializedName("UniqueVpcId")
    @Expose
    private String UniqueVpcId;

    /**
    * 租户Vpc子网Id
    */
    @SerializedName("UniqueSubnetId")
    @Expose
    private String UniqueSubnetId;

    /**
    * 路由Id
    */
    @SerializedName("RouterId")
    @Expose
    private String RouterId;

    /**
    * Vpc的Id
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Vpc的Port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 说明，128个字符以内
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 租户Vpc Id 
     * @return UniqueVpcId 租户Vpc Id
     */
    public String getUniqueVpcId() {
        return this.UniqueVpcId;
    }

    /**
     * Set 租户Vpc Id
     * @param UniqueVpcId 租户Vpc Id
     */
    public void setUniqueVpcId(String UniqueVpcId) {
        this.UniqueVpcId = UniqueVpcId;
    }

    /**
     * Get 租户Vpc子网Id 
     * @return UniqueSubnetId 租户Vpc子网Id
     */
    public String getUniqueSubnetId() {
        return this.UniqueSubnetId;
    }

    /**
     * Set 租户Vpc子网Id
     * @param UniqueSubnetId 租户Vpc子网Id
     */
    public void setUniqueSubnetId(String UniqueSubnetId) {
        this.UniqueSubnetId = UniqueSubnetId;
    }

    /**
     * Get 路由Id 
     * @return RouterId 路由Id
     */
    public String getRouterId() {
        return this.RouterId;
    }

    /**
     * Set 路由Id
     * @param RouterId 路由Id
     */
    public void setRouterId(String RouterId) {
        this.RouterId = RouterId;
    }

    /**
     * Get Vpc的Id 
     * @return Ip Vpc的Id
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Vpc的Id
     * @param Ip Vpc的Id
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Vpc的Port 
     * @return Port Vpc的Port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Vpc的Port
     * @param Port Vpc的Port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 说明，128个字符以内
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 说明，128个字符以内
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明，128个字符以内
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 说明，128个字符以内
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public VpcBindRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcBindRecord(VpcBindRecord source) {
        if (source.UniqueVpcId != null) {
            this.UniqueVpcId = new String(source.UniqueVpcId);
        }
        if (source.UniqueSubnetId != null) {
            this.UniqueSubnetId = new String(source.UniqueSubnetId);
        }
        if (source.RouterId != null) {
            this.RouterId = new String(source.RouterId);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniqueVpcId", this.UniqueVpcId);
        this.setParamSimple(map, prefix + "UniqueSubnetId", this.UniqueSubnetId);
        this.setParamSimple(map, prefix + "RouterId", this.RouterId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

