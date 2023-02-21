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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVipVportRequest extends AbstractModel{

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 实例组id
    */
    @SerializedName("InstanceGrpId")
    @Expose
    private String InstanceGrpId;

    /**
    * 需要修改的目的ip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 需要修改的目的端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 数据库类型，取值范围: 
<li> MYSQL </li>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 旧ip回收前的保留时间，单位小时，0表示立即回收
    */
    @SerializedName("OldIpReserveHours")
    @Expose
    private Long OldIpReserveHours;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 实例组id 
     * @return InstanceGrpId 实例组id
     */
    public String getInstanceGrpId() {
        return this.InstanceGrpId;
    }

    /**
     * Set 实例组id
     * @param InstanceGrpId 实例组id
     */
    public void setInstanceGrpId(String InstanceGrpId) {
        this.InstanceGrpId = InstanceGrpId;
    }

    /**
     * Get 需要修改的目的ip 
     * @return Vip 需要修改的目的ip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 需要修改的目的ip
     * @param Vip 需要修改的目的ip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 需要修改的目的端口 
     * @return Vport 需要修改的目的端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 需要修改的目的端口
     * @param Vport 需要修改的目的端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 数据库类型，取值范围: 
<li> MYSQL </li> 
     * @return DbType 数据库类型，取值范围: 
<li> MYSQL </li>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 数据库类型，取值范围: 
<li> MYSQL </li>
     * @param DbType 数据库类型，取值范围: 
<li> MYSQL </li>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get 旧ip回收前的保留时间，单位小时，0表示立即回收 
     * @return OldIpReserveHours 旧ip回收前的保留时间，单位小时，0表示立即回收
     */
    public Long getOldIpReserveHours() {
        return this.OldIpReserveHours;
    }

    /**
     * Set 旧ip回收前的保留时间，单位小时，0表示立即回收
     * @param OldIpReserveHours 旧ip回收前的保留时间，单位小时，0表示立即回收
     */
    public void setOldIpReserveHours(Long OldIpReserveHours) {
        this.OldIpReserveHours = OldIpReserveHours;
    }

    public ModifyVipVportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVipVportRequest(ModifyVipVportRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceGrpId != null) {
            this.InstanceGrpId = new String(source.InstanceGrpId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.OldIpReserveHours != null) {
            this.OldIpReserveHours = new Long(source.OldIpReserveHours);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceGrpId", this.InstanceGrpId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "OldIpReserveHours", this.OldIpReserveHours);

    }
}

