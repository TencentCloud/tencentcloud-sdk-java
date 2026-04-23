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
    * <p>网络组id(cynosdbmysql-grp-前缀开头)或集群id（例如 cynosdbmysql-xxxxxxxx前缀）,当通过实例IP地址三元组（UniqVpcId、Vip、Vport）配置安全组时，该字段必须设置为集群ID（例如 cynosdbmysql-xxxxxxxx前缀）。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>要修改的安全组ID列表，一个或者多个安全组ID组成的数组。<br>注意：该入参会全量替换存量已有集合，非增量更新。修改需传入预期的全量集合。</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>实例所属VPC网络ID,（UniqVpcId、Vip 和 Vport 三个参数需同时指定，用于唯一标识网络实例）</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>实例IP地址,实例IP地址三元组UniqVpcId、Vip 和 Vport) 三个参数需同时指定，用于唯一标识网络实实例</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>实例端口,实例IP地址三元组UniqVpcId、Vip 和 Vport) 三个参数需同时指定，用于唯一标识网络实实例</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
     * Get <p>网络组id(cynosdbmysql-grp-前缀开头)或集群id（例如 cynosdbmysql-xxxxxxxx前缀）,当通过实例IP地址三元组（UniqVpcId、Vip、Vport）配置安全组时，该字段必须设置为集群ID（例如 cynosdbmysql-xxxxxxxx前缀）。</p> 
     * @return InstanceId <p>网络组id(cynosdbmysql-grp-前缀开头)或集群id（例如 cynosdbmysql-xxxxxxxx前缀）,当通过实例IP地址三元组（UniqVpcId、Vip、Vport）配置安全组时，该字段必须设置为集群ID（例如 cynosdbmysql-xxxxxxxx前缀）。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>网络组id(cynosdbmysql-grp-前缀开头)或集群id（例如 cynosdbmysql-xxxxxxxx前缀）,当通过实例IP地址三元组（UniqVpcId、Vip、Vport）配置安全组时，该字段必须设置为集群ID（例如 cynosdbmysql-xxxxxxxx前缀）。</p>
     * @param InstanceId <p>网络组id(cynosdbmysql-grp-前缀开头)或集群id（例如 cynosdbmysql-xxxxxxxx前缀）,当通过实例IP地址三元组（UniqVpcId、Vip、Vport）配置安全组时，该字段必须设置为集群ID（例如 cynosdbmysql-xxxxxxxx前缀）。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>要修改的安全组ID列表，一个或者多个安全组ID组成的数组。<br>注意：该入参会全量替换存量已有集合，非增量更新。修改需传入预期的全量集合。</p> 
     * @return SecurityGroupIds <p>要修改的安全组ID列表，一个或者多个安全组ID组成的数组。<br>注意：该入参会全量替换存量已有集合，非增量更新。修改需传入预期的全量集合。</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>要修改的安全组ID列表，一个或者多个安全组ID组成的数组。<br>注意：该入参会全量替换存量已有集合，非增量更新。修改需传入预期的全量集合。</p>
     * @param SecurityGroupIds <p>要修改的安全组ID列表，一个或者多个安全组ID组成的数组。<br>注意：该入参会全量替换存量已有集合，非增量更新。修改需传入预期的全量集合。</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>可用区</p> 
     * @return Zone <p>可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区</p>
     * @param Zone <p>可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>实例所属VPC网络ID,（UniqVpcId、Vip 和 Vport 三个参数需同时指定，用于唯一标识网络实例）</p> 
     * @return UniqVpcId <p>实例所属VPC网络ID,（UniqVpcId、Vip 和 Vport 三个参数需同时指定，用于唯一标识网络实例）</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>实例所属VPC网络ID,（UniqVpcId、Vip 和 Vport 三个参数需同时指定，用于唯一标识网络实例）</p>
     * @param UniqVpcId <p>实例所属VPC网络ID,（UniqVpcId、Vip 和 Vport 三个参数需同时指定，用于唯一标识网络实例）</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>实例IP地址,实例IP地址三元组UniqVpcId、Vip 和 Vport) 三个参数需同时指定，用于唯一标识网络实实例</p> 
     * @return Vip <p>实例IP地址,实例IP地址三元组UniqVpcId、Vip 和 Vport) 三个参数需同时指定，用于唯一标识网络实实例</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>实例IP地址,实例IP地址三元组UniqVpcId、Vip 和 Vport) 三个参数需同时指定，用于唯一标识网络实实例</p>
     * @param Vip <p>实例IP地址,实例IP地址三元组UniqVpcId、Vip 和 Vport) 三个参数需同时指定，用于唯一标识网络实实例</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>实例端口,实例IP地址三元组UniqVpcId、Vip 和 Vport) 三个参数需同时指定，用于唯一标识网络实实例</p> 
     * @return Vport <p>实例端口,实例IP地址三元组UniqVpcId、Vip 和 Vport) 三个参数需同时指定，用于唯一标识网络实实例</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>实例端口,实例IP地址三元组UniqVpcId、Vip 和 Vport) 三个参数需同时指定，用于唯一标识网络实实例</p>
     * @param Vport <p>实例端口,实例IP地址三元组UniqVpcId、Vip 和 Vport) 三个参数需同时指定，用于唯一标识网络实实例</p>
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

