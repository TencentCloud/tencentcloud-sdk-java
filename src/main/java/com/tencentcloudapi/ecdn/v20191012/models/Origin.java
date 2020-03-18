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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Origin extends AbstractModel{

    /**
    * 主源站列表，默认格式为 ["ip1:port1", "ip2:port2"]。
支持在源站列表中配置权重，配置IP源站权重格式为 ["ip1:port1:weight1", "ip2:port2:weight2"]。
    */
    @SerializedName("Origins")
    @Expose
    private String [] Origins;

    /**
    * 主源站类型，支持domain，ip，分别表示域名源站，ip源站。
设置Origins时必须填写。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * 回源时Host头部值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 回源协议类型，支持http，follow，https，分别表示强制http回源，协议跟随回源，https回源。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginPullProtocol")
    @Expose
    private String OriginPullProtocol;

    /**
    * 备份源站列表。
    */
    @SerializedName("BackupOrigins")
    @Expose
    private String [] BackupOrigins;

    /**
    * 备份源站类型，同OriginType。
设置BackupOrigins时必须填写。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupOriginType")
    @Expose
    private String BackupOriginType;

    /**
     * Get 主源站列表，默认格式为 ["ip1:port1", "ip2:port2"]。
支持在源站列表中配置权重，配置IP源站权重格式为 ["ip1:port1:weight1", "ip2:port2:weight2"]。 
     * @return Origins 主源站列表，默认格式为 ["ip1:port1", "ip2:port2"]。
支持在源站列表中配置权重，配置IP源站权重格式为 ["ip1:port1:weight1", "ip2:port2:weight2"]。
     */
    public String [] getOrigins() {
        return this.Origins;
    }

    /**
     * Set 主源站列表，默认格式为 ["ip1:port1", "ip2:port2"]。
支持在源站列表中配置权重，配置IP源站权重格式为 ["ip1:port1:weight1", "ip2:port2:weight2"]。
     * @param Origins 主源站列表，默认格式为 ["ip1:port1", "ip2:port2"]。
支持在源站列表中配置权重，配置IP源站权重格式为 ["ip1:port1:weight1", "ip2:port2:weight2"]。
     */
    public void setOrigins(String [] Origins) {
        this.Origins = Origins;
    }

    /**
     * Get 主源站类型，支持domain，ip，分别表示域名源站，ip源站。
设置Origins时必须填写。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginType 主源站类型，支持domain，ip，分别表示域名源站，ip源站。
设置Origins时必须填写。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set 主源站类型，支持domain，ip，分别表示域名源站，ip源站。
设置Origins时必须填写。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginType 主源站类型，支持domain，ip，分别表示域名源站，ip源站。
设置Origins时必须填写。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get 回源时Host头部值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerName 回源时Host头部值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 回源时Host头部值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerName 回源时Host头部值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get 回源协议类型，支持http，follow，https，分别表示强制http回源，协议跟随回源，https回源。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginPullProtocol 回源协议类型，支持http，follow，https，分别表示强制http回源，协议跟随回源，https回源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginPullProtocol() {
        return this.OriginPullProtocol;
    }

    /**
     * Set 回源协议类型，支持http，follow，https，分别表示强制http回源，协议跟随回源，https回源。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginPullProtocol 回源协议类型，支持http，follow，https，分别表示强制http回源，协议跟随回源，https回源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginPullProtocol(String OriginPullProtocol) {
        this.OriginPullProtocol = OriginPullProtocol;
    }

    /**
     * Get 备份源站列表。 
     * @return BackupOrigins 备份源站列表。
     */
    public String [] getBackupOrigins() {
        return this.BackupOrigins;
    }

    /**
     * Set 备份源站列表。
     * @param BackupOrigins 备份源站列表。
     */
    public void setBackupOrigins(String [] BackupOrigins) {
        this.BackupOrigins = BackupOrigins;
    }

    /**
     * Get 备份源站类型，同OriginType。
设置BackupOrigins时必须填写。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupOriginType 备份源站类型，同OriginType。
设置BackupOrigins时必须填写。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupOriginType() {
        return this.BackupOriginType;
    }

    /**
     * Set 备份源站类型，同OriginType。
设置BackupOrigins时必须填写。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupOriginType 备份源站类型，同OriginType。
设置BackupOrigins时必须填写。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupOriginType(String BackupOriginType) {
        this.BackupOriginType = BackupOriginType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Origins.", this.Origins);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "OriginPullProtocol", this.OriginPullProtocol);
        this.setParamArraySimple(map, prefix + "BackupOrigins.", this.BackupOrigins);
        this.setParamSimple(map, prefix + "BackupOriginType", this.BackupOriginType);

    }
}

