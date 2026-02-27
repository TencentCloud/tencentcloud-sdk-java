/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceSecurityGroupsRequest extends AbstractModel {

    /**
    * 网络组id(cynosdbmysql-grp-前缀开头)或集群id（例如 cynosdbmysql-xxxxxxxx前缀）,当通过实例IP地址三元组（UniqVpcId、Vip、Vport）配置安全组时，该字段必须设置为集群ID（例如 cynosdbmysql-xxxxxxxx前缀）。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 要修改的安全组ID列表，一个或者多个安全组ID组成的数组。
注意：该入参会全量替换存量已有集合，非增量更新。修改需传入预期的全量集合。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例所属VPC网络ID,（UniqVpcId、Vip 和 Vport 三个参数需同时指定，用于唯一标识网络实例）
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 实例IP地址,实例IP地址三元组UniqVpcId、Vip 和 Vport) 三个参数需同时指定，用于唯一标识网络实实例
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 实例端口,实例IP地址三元组UniqVpcId、Vip 和 Vport) 三个参数需同时指定，用于唯一标识网络实实例
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
     * Get 网络组id(cynosdbmysql-grp-前缀开头)或集群id（例如 cynosdbmysql-xxxxxxxx前缀）,当通过实例IP地址三元组（UniqVpcId、Vip、Vport）配置安全组时，该字段必须设置为集群ID（例如 cynosdbmysql-xxxxxxxx前缀）。 
     * @return InstanceId 网络组id(cynosdbmysql-grp-前缀开头)或集群id（例如 cynosdbmysql-xxxxxxxx前缀）,当通过实例IP地址三元组（UniqVpcId、Vip、Vport）配置安全组时，该字段必须设置为集群ID（例如 cynosdbmysql-xxxxxxxx前缀）。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 网络组id(cynosdbmysql-grp-前缀开头)或集群id（例如 cynosdbmysql-xxxxxxxx前缀）,当通过实例IP地址三元组（UniqVpcId、Vip、Vport）配置安全组时，该字段必须设置为集群ID（例如 cynosdbmysql-xxxxxxxx前缀）。
     * @param InstanceId 网络组id(cynosdbmysql-grp-前缀开头)或集群id（例如 cynosdbmysql-xxxxxxxx前缀）,当通过实例IP地址三元组（UniqVpcId、Vip、Vport）配置安全组时，该字段必须设置为集群ID（例如 cynosdbmysql-xxxxxxxx前缀）。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 要修改的安全组ID列表，一个或者多个安全组ID组成的数组。
注意：该入参会全量替换存量已有集合，非增量更新。修改需传入预期的全量集合。 
     * @return SecurityGroupIds 要修改的安全组ID列表，一个或者多个安全组ID组成的数组。
注意：该入参会全量替换存量已有集合，非增量更新。修改需传入预期的全量集合。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 要修改的安全组ID列表，一个或者多个安全组ID组成的数组。
注意：该入参会全量替换存量已有集合，非增量更新。修改需传入预期的全量集合。
     * @param SecurityGroupIds 要修改的安全组ID列表，一个或者多个安全组ID组成的数组。
注意：该入参会全量替换存量已有集合，非增量更新。修改需传入预期的全量集合。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例所属VPC网络ID,（UniqVpcId、Vip 和 Vport 三个参数需同时指定，用于唯一标识网络实例） 
     * @return UniqVpcId 实例所属VPC网络ID,（UniqVpcId、Vip 和 Vport 三个参数需同时指定，用于唯一标识网络实例）
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 实例所属VPC网络ID,（UniqVpcId、Vip 和 Vport 三个参数需同时指定，用于唯一标识网络实例）
     * @param UniqVpcId 实例所属VPC网络ID,（UniqVpcId、Vip 和 Vport 三个参数需同时指定，用于唯一标识网络实例）
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 实例IP地址,实例IP地址三元组UniqVpcId、Vip 和 Vport) 三个参数需同时指定，用于唯一标识网络实实例 
     * @return Vip 实例IP地址,实例IP地址三元组UniqVpcId、Vip 和 Vport) 三个参数需同时指定，用于唯一标识网络实实例
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 实例IP地址,实例IP地址三元组UniqVpcId、Vip 和 Vport) 三个参数需同时指定，用于唯一标识网络实实例
     * @param Vip 实例IP地址,实例IP地址三元组UniqVpcId、Vip 和 Vport) 三个参数需同时指定，用于唯一标识网络实实例
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 实例端口,实例IP地址三元组UniqVpcId、Vip 和 Vport) 三个参数需同时指定，用于唯一标识网络实实例 
     * @return Vport 实例端口,实例IP地址三元组UniqVpcId、Vip 和 Vport) 三个参数需同时指定，用于唯一标识网络实实例
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 实例端口,实例IP地址三元组UniqVpcId、Vip 和 Vport) 三个参数需同时指定，用于唯一标识网络实实例
     * @param Vport 实例端口,实例IP地址三元组UniqVpcId、Vip 和 Vport) 三个参数需同时指定，用于唯一标识网络实实例
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    public ModifyDBInstanceSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceSecurityGroupsRequest(ModifyDBInstanceSecurityGroupsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);

    }
}

