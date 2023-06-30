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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupTableContent extends AbstractModel{

    /**
    * 数据库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 表总字节数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalBytes")
    @Expose
    private Long TotalBytes;

    /**
    * 虚拟cluster
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VCluster")
    @Expose
    private String VCluster;

    /**
    * 表ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ips")
    @Expose
    private String Ips;

    /**
    * zk路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZooPath")
    @Expose
    private String ZooPath;

    /**
    * cvm的ip地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rip")
    @Expose
    private String Rip;

    /**
     * Get 数据库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Database 数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 数据库
注意：此字段可能返回 null，表示取不到有效值。
     * @param Database 数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Table 表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Table 表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 表总字节数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalBytes 表总字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalBytes() {
        return this.TotalBytes;
    }

    /**
     * Set 表总字节数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalBytes 表总字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalBytes(Long TotalBytes) {
        this.TotalBytes = TotalBytes;
    }

    /**
     * Get 虚拟cluster
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VCluster 虚拟cluster
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVCluster() {
        return this.VCluster;
    }

    /**
     * Set 虚拟cluster
注意：此字段可能返回 null，表示取不到有效值。
     * @param VCluster 虚拟cluster
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVCluster(String VCluster) {
        this.VCluster = VCluster;
    }

    /**
     * Get 表ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ips 表ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIps() {
        return this.Ips;
    }

    /**
     * Set 表ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ips 表ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIps(String Ips) {
        this.Ips = Ips;
    }

    /**
     * Get zk路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZooPath zk路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZooPath() {
        return this.ZooPath;
    }

    /**
     * Set zk路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZooPath zk路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZooPath(String ZooPath) {
        this.ZooPath = ZooPath;
    }

    /**
     * Get cvm的ip地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rip cvm的ip地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRip() {
        return this.Rip;
    }

    /**
     * Set cvm的ip地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rip cvm的ip地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRip(String Rip) {
        this.Rip = Rip;
    }

    public BackupTableContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupTableContent(BackupTableContent source) {
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.TotalBytes != null) {
            this.TotalBytes = new Long(source.TotalBytes);
        }
        if (source.VCluster != null) {
            this.VCluster = new String(source.VCluster);
        }
        if (source.Ips != null) {
            this.Ips = new String(source.Ips);
        }
        if (source.ZooPath != null) {
            this.ZooPath = new String(source.ZooPath);
        }
        if (source.Rip != null) {
            this.Rip = new String(source.Rip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "TotalBytes", this.TotalBytes);
        this.setParamSimple(map, prefix + "VCluster", this.VCluster);
        this.setParamSimple(map, prefix + "Ips", this.Ips);
        this.setParamSimple(map, prefix + "ZooPath", this.ZooPath);
        this.setParamSimple(map, prefix + "Rip", this.Rip);

    }
}

