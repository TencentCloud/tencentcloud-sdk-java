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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncTableInfo extends AbstractModel{

    /**
    * 目标缓写表的分表数目
    */
    @SerializedName("TargetTableSplitNum")
    @Expose
    private Long TargetTableSplitNum;

    /**
    * 目标缓写表名前缀
    */
    @SerializedName("TargetTableNamePrefix")
    @Expose
    private String [] TargetTableNamePrefix;

    /**
    * 缓写数据库实例ID
    */
    @SerializedName("TargetSyncDBInstanceId")
    @Expose
    private String TargetSyncDBInstanceId;

    /**
    * 缓写表所在数据库名称
    */
    @SerializedName("TargetDatabaseName")
    @Expose
    private String TargetDatabaseName;

    /**
    * 缓写状态，0：创建中，1：进行中，2：关闭，-1：被删除
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 表格所在集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 表格所在表格组ID
    */
    @SerializedName("TableGroupId")
    @Expose
    private Long TableGroupId;

    /**
    * 表格名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 表格ID
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * TcaplusDB表主键字段到目标缓写表字段的映射
    */
    @SerializedName("KeyFieldMapping")
    @Expose
    private SyncTableField [] KeyFieldMapping;

    /**
    * TcaplusDB表字段到目标缓写表字段的映射
    */
    @SerializedName("ValueFieldMapping")
    @Expose
    private SyncTableField [] ValueFieldMapping;

    /**
     * Get 目标缓写表的分表数目 
     * @return TargetTableSplitNum 目标缓写表的分表数目
     */
    public Long getTargetTableSplitNum() {
        return this.TargetTableSplitNum;
    }

    /**
     * Set 目标缓写表的分表数目
     * @param TargetTableSplitNum 目标缓写表的分表数目
     */
    public void setTargetTableSplitNum(Long TargetTableSplitNum) {
        this.TargetTableSplitNum = TargetTableSplitNum;
    }

    /**
     * Get 目标缓写表名前缀 
     * @return TargetTableNamePrefix 目标缓写表名前缀
     */
    public String [] getTargetTableNamePrefix() {
        return this.TargetTableNamePrefix;
    }

    /**
     * Set 目标缓写表名前缀
     * @param TargetTableNamePrefix 目标缓写表名前缀
     */
    public void setTargetTableNamePrefix(String [] TargetTableNamePrefix) {
        this.TargetTableNamePrefix = TargetTableNamePrefix;
    }

    /**
     * Get 缓写数据库实例ID 
     * @return TargetSyncDBInstanceId 缓写数据库实例ID
     */
    public String getTargetSyncDBInstanceId() {
        return this.TargetSyncDBInstanceId;
    }

    /**
     * Set 缓写数据库实例ID
     * @param TargetSyncDBInstanceId 缓写数据库实例ID
     */
    public void setTargetSyncDBInstanceId(String TargetSyncDBInstanceId) {
        this.TargetSyncDBInstanceId = TargetSyncDBInstanceId;
    }

    /**
     * Get 缓写表所在数据库名称 
     * @return TargetDatabaseName 缓写表所在数据库名称
     */
    public String getTargetDatabaseName() {
        return this.TargetDatabaseName;
    }

    /**
     * Set 缓写表所在数据库名称
     * @param TargetDatabaseName 缓写表所在数据库名称
     */
    public void setTargetDatabaseName(String TargetDatabaseName) {
        this.TargetDatabaseName = TargetDatabaseName;
    }

    /**
     * Get 缓写状态，0：创建中，1：进行中，2：关闭，-1：被删除 
     * @return Status 缓写状态，0：创建中，1：进行中，2：关闭，-1：被删除
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 缓写状态，0：创建中，1：进行中，2：关闭，-1：被删除
     * @param Status 缓写状态，0：创建中，1：进行中，2：关闭，-1：被删除
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 表格所在集群ID 
     * @return ClusterId 表格所在集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 表格所在集群ID
     * @param ClusterId 表格所在集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 表格所在表格组ID 
     * @return TableGroupId 表格所在表格组ID
     */
    public Long getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set 表格所在表格组ID
     * @param TableGroupId 表格所在表格组ID
     */
    public void setTableGroupId(Long TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get 表格名称 
     * @return TableName 表格名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表格名称
     * @param TableName 表格名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 表格ID 
     * @return TableId 表格ID
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 表格ID
     * @param TableId 表格ID
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get TcaplusDB表主键字段到目标缓写表字段的映射 
     * @return KeyFieldMapping TcaplusDB表主键字段到目标缓写表字段的映射
     */
    public SyncTableField [] getKeyFieldMapping() {
        return this.KeyFieldMapping;
    }

    /**
     * Set TcaplusDB表主键字段到目标缓写表字段的映射
     * @param KeyFieldMapping TcaplusDB表主键字段到目标缓写表字段的映射
     */
    public void setKeyFieldMapping(SyncTableField [] KeyFieldMapping) {
        this.KeyFieldMapping = KeyFieldMapping;
    }

    /**
     * Get TcaplusDB表字段到目标缓写表字段的映射 
     * @return ValueFieldMapping TcaplusDB表字段到目标缓写表字段的映射
     */
    public SyncTableField [] getValueFieldMapping() {
        return this.ValueFieldMapping;
    }

    /**
     * Set TcaplusDB表字段到目标缓写表字段的映射
     * @param ValueFieldMapping TcaplusDB表字段到目标缓写表字段的映射
     */
    public void setValueFieldMapping(SyncTableField [] ValueFieldMapping) {
        this.ValueFieldMapping = ValueFieldMapping;
    }

    public SyncTableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncTableInfo(SyncTableInfo source) {
        if (source.TargetTableSplitNum != null) {
            this.TargetTableSplitNum = new Long(source.TargetTableSplitNum);
        }
        if (source.TargetTableNamePrefix != null) {
            this.TargetTableNamePrefix = new String[source.TargetTableNamePrefix.length];
            for (int i = 0; i < source.TargetTableNamePrefix.length; i++) {
                this.TargetTableNamePrefix[i] = new String(source.TargetTableNamePrefix[i]);
            }
        }
        if (source.TargetSyncDBInstanceId != null) {
            this.TargetSyncDBInstanceId = new String(source.TargetSyncDBInstanceId);
        }
        if (source.TargetDatabaseName != null) {
            this.TargetDatabaseName = new String(source.TargetDatabaseName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.TableGroupId != null) {
            this.TableGroupId = new Long(source.TableGroupId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.KeyFieldMapping != null) {
            this.KeyFieldMapping = new SyncTableField[source.KeyFieldMapping.length];
            for (int i = 0; i < source.KeyFieldMapping.length; i++) {
                this.KeyFieldMapping[i] = new SyncTableField(source.KeyFieldMapping[i]);
            }
        }
        if (source.ValueFieldMapping != null) {
            this.ValueFieldMapping = new SyncTableField[source.ValueFieldMapping.length];
            for (int i = 0; i < source.ValueFieldMapping.length; i++) {
                this.ValueFieldMapping[i] = new SyncTableField(source.ValueFieldMapping[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetTableSplitNum", this.TargetTableSplitNum);
        this.setParamArraySimple(map, prefix + "TargetTableNamePrefix.", this.TargetTableNamePrefix);
        this.setParamSimple(map, prefix + "TargetSyncDBInstanceId", this.TargetSyncDBInstanceId);
        this.setParamSimple(map, prefix + "TargetDatabaseName", this.TargetDatabaseName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamArrayObj(map, prefix + "KeyFieldMapping.", this.KeyFieldMapping);
        this.setParamArrayObj(map, prefix + "ValueFieldMapping.", this.ValueFieldMapping);

    }
}

