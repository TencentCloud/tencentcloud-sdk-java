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

public class DataSourceItem extends AbstractModel {

    /**
    * 源端实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 源端集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 源端数据库类型
    */
    @SerializedName("DBType")
    @Expose
    private String DBType;

    /**
    * 源端数据库IP
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 源端数据库端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 源实例地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 源端实例可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 源端主账号uin
    */
    @SerializedName("SrcUin")
    @Expose
    private String SrcUin;

    /**
    * 账号类型
    */
    @SerializedName("AccountMode")
    @Expose
    private String AccountMode;

    /**
    * 同步任务状态
    */
    @SerializedName("ReplicationJobStatus")
    @Expose
    private String ReplicationJobStatus;

    /**
     * Get 源端实例ID 
     * @return InstanceId 源端实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 源端实例ID
     * @param InstanceId 源端实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 源端集群ID 
     * @return ClusterId 源端集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 源端集群ID
     * @param ClusterId 源端集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 源端数据库类型 
     * @return DBType 源端数据库类型
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * Set 源端数据库类型
     * @param DBType 源端数据库类型
     */
    public void setDBType(String DBType) {
        this.DBType = DBType;
    }

    /**
     * Get 源端数据库IP 
     * @return IP 源端数据库IP
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 源端数据库IP
     * @param IP 源端数据库IP
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 源端数据库端口 
     * @return Port 源端数据库端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 源端数据库端口
     * @param Port 源端数据库端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 源实例地域 
     * @return Region 源实例地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 源实例地域
     * @param Region 源实例地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 源端实例可用区 
     * @return Zone 源端实例可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 源端实例可用区
     * @param Zone 源端实例可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 源端主账号uin 
     * @return SrcUin 源端主账号uin
     */
    public String getSrcUin() {
        return this.SrcUin;
    }

    /**
     * Set 源端主账号uin
     * @param SrcUin 源端主账号uin
     */
    public void setSrcUin(String SrcUin) {
        this.SrcUin = SrcUin;
    }

    /**
     * Get 账号类型 
     * @return AccountMode 账号类型
     */
    public String getAccountMode() {
        return this.AccountMode;
    }

    /**
     * Set 账号类型
     * @param AccountMode 账号类型
     */
    public void setAccountMode(String AccountMode) {
        this.AccountMode = AccountMode;
    }

    /**
     * Get 同步任务状态 
     * @return ReplicationJobStatus 同步任务状态
     */
    public String getReplicationJobStatus() {
        return this.ReplicationJobStatus;
    }

    /**
     * Set 同步任务状态
     * @param ReplicationJobStatus 同步任务状态
     */
    public void setReplicationJobStatus(String ReplicationJobStatus) {
        this.ReplicationJobStatus = ReplicationJobStatus;
    }

    public DataSourceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSourceItem(DataSourceItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.DBType != null) {
            this.DBType = new String(source.DBType);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SrcUin != null) {
            this.SrcUin = new String(source.SrcUin);
        }
        if (source.AccountMode != null) {
            this.AccountMode = new String(source.AccountMode);
        }
        if (source.ReplicationJobStatus != null) {
            this.ReplicationJobStatus = new String(source.ReplicationJobStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "DBType", this.DBType);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "SrcUin", this.SrcUin);
        this.setParamSimple(map, prefix + "AccountMode", this.AccountMode);
        this.setParamSimple(map, prefix + "ReplicationJobStatus", this.ReplicationJobStatus);

    }
}

