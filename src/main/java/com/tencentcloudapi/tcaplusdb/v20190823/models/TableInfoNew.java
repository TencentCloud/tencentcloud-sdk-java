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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableInfoNew extends AbstractModel {

    /**
    * 表格名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 表格实例ID
    */
    @SerializedName("TableInstanceId")
    @Expose
    private String TableInstanceId;

    /**
    * 表格数据结构类型，如：`GENERIC`或`LIST`
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * 表格数据描述语言（IDL）类型，如：`PROTO`或`TDR`
    */
    @SerializedName("TableIdlType")
    @Expose
    private String TableIdlType;

    /**
    * 表格所属集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 表格所属集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 表格所属表格组ID
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * 表格所属表格组名称
    */
    @SerializedName("TableGroupName")
    @Expose
    private String TableGroupName;

    /**
    * 表格主键字段结构json字符串
    */
    @SerializedName("KeyStruct")
    @Expose
    private String KeyStruct;

    /**
    * 表格非主键字段结构json字符串
    */
    @SerializedName("ValueStruct")
    @Expose
    private String ValueStruct;

    /**
    * 表格分表因子集合，对PROTO类型表格有效
    */
    @SerializedName("ShardingKeySet")
    @Expose
    private String ShardingKeySet;

    /**
    * 表格索引键字段集合，对PROTO类型表格有效
    */
    @SerializedName("IndexStruct")
    @Expose
    private String IndexStruct;

    /**
    * LIST类型表格元素个数
    */
    @SerializedName("ListElementNum")
    @Expose
    private Long ListElementNum;

    /**
    * 表格所关联IDL文件信息列表
    */
    @SerializedName("IdlFiles")
    @Expose
    private IdlFileInfo [] IdlFiles;

    /**
    * 表格预留容量（GB）
    */
    @SerializedName("ReservedVolume")
    @Expose
    private Long ReservedVolume;

    /**
    * 表格预留读CU
    */
    @SerializedName("ReservedReadQps")
    @Expose
    private Long ReservedReadQps;

    /**
    * 表格预留写CU
    */
    @SerializedName("ReservedWriteQps")
    @Expose
    private Long ReservedWriteQps;

    /**
    * 表格实际数据量大小（MB）
    */
    @SerializedName("TableSize")
    @Expose
    private Long TableSize;

    /**
    * 表格状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 表格创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 表格最后一次修改时间
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 表格备注信息
    */
    @SerializedName("Memo")
    @Expose
    private String Memo;

    /**
    * 错误信息
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
    * TcaplusDB SDK数据访问接入ID
    */
    @SerializedName("ApiAccessId")
    @Expose
    private String ApiAccessId;

    /**
    * SORTLIST类型表格排序字段个数
    */
    @SerializedName("SortFieldNum")
    @Expose
    private Long SortFieldNum;

    /**
    * SORTLIST类型表格排序顺序
    */
    @SerializedName("SortRule")
    @Expose
    private Long SortRule;

    /**
    * 表格分布式索引/缓写、kafka数据订阅信息
    */
    @SerializedName("DbClusterInfoStruct")
    @Expose
    private String DbClusterInfoStruct;

    /**
    * 表格Txh备份文件多少天后过期删除
    */
    @SerializedName("TxhBackupExpireDay")
    @Expose
    private Long TxhBackupExpireDay;

    /**
    * 表格的缓写信息
    */
    @SerializedName("SyncTableInfo")
    @Expose
    private SyncTableInfo SyncTableInfo;

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
     * Get 表格实例ID 
     * @return TableInstanceId 表格实例ID
     */
    public String getTableInstanceId() {
        return this.TableInstanceId;
    }

    /**
     * Set 表格实例ID
     * @param TableInstanceId 表格实例ID
     */
    public void setTableInstanceId(String TableInstanceId) {
        this.TableInstanceId = TableInstanceId;
    }

    /**
     * Get 表格数据结构类型，如：`GENERIC`或`LIST` 
     * @return TableType 表格数据结构类型，如：`GENERIC`或`LIST`
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set 表格数据结构类型，如：`GENERIC`或`LIST`
     * @param TableType 表格数据结构类型，如：`GENERIC`或`LIST`
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get 表格数据描述语言（IDL）类型，如：`PROTO`或`TDR` 
     * @return TableIdlType 表格数据描述语言（IDL）类型，如：`PROTO`或`TDR`
     */
    public String getTableIdlType() {
        return this.TableIdlType;
    }

    /**
     * Set 表格数据描述语言（IDL）类型，如：`PROTO`或`TDR`
     * @param TableIdlType 表格数据描述语言（IDL）类型，如：`PROTO`或`TDR`
     */
    public void setTableIdlType(String TableIdlType) {
        this.TableIdlType = TableIdlType;
    }

    /**
     * Get 表格所属集群ID 
     * @return ClusterId 表格所属集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 表格所属集群ID
     * @param ClusterId 表格所属集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 表格所属集群名称 
     * @return ClusterName 表格所属集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 表格所属集群名称
     * @param ClusterName 表格所属集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 表格所属表格组ID 
     * @return TableGroupId 表格所属表格组ID
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set 表格所属表格组ID
     * @param TableGroupId 表格所属表格组ID
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get 表格所属表格组名称 
     * @return TableGroupName 表格所属表格组名称
     */
    public String getTableGroupName() {
        return this.TableGroupName;
    }

    /**
     * Set 表格所属表格组名称
     * @param TableGroupName 表格所属表格组名称
     */
    public void setTableGroupName(String TableGroupName) {
        this.TableGroupName = TableGroupName;
    }

    /**
     * Get 表格主键字段结构json字符串 
     * @return KeyStruct 表格主键字段结构json字符串
     */
    public String getKeyStruct() {
        return this.KeyStruct;
    }

    /**
     * Set 表格主键字段结构json字符串
     * @param KeyStruct 表格主键字段结构json字符串
     */
    public void setKeyStruct(String KeyStruct) {
        this.KeyStruct = KeyStruct;
    }

    /**
     * Get 表格非主键字段结构json字符串 
     * @return ValueStruct 表格非主键字段结构json字符串
     */
    public String getValueStruct() {
        return this.ValueStruct;
    }

    /**
     * Set 表格非主键字段结构json字符串
     * @param ValueStruct 表格非主键字段结构json字符串
     */
    public void setValueStruct(String ValueStruct) {
        this.ValueStruct = ValueStruct;
    }

    /**
     * Get 表格分表因子集合，对PROTO类型表格有效 
     * @return ShardingKeySet 表格分表因子集合，对PROTO类型表格有效
     */
    public String getShardingKeySet() {
        return this.ShardingKeySet;
    }

    /**
     * Set 表格分表因子集合，对PROTO类型表格有效
     * @param ShardingKeySet 表格分表因子集合，对PROTO类型表格有效
     */
    public void setShardingKeySet(String ShardingKeySet) {
        this.ShardingKeySet = ShardingKeySet;
    }

    /**
     * Get 表格索引键字段集合，对PROTO类型表格有效 
     * @return IndexStruct 表格索引键字段集合，对PROTO类型表格有效
     */
    public String getIndexStruct() {
        return this.IndexStruct;
    }

    /**
     * Set 表格索引键字段集合，对PROTO类型表格有效
     * @param IndexStruct 表格索引键字段集合，对PROTO类型表格有效
     */
    public void setIndexStruct(String IndexStruct) {
        this.IndexStruct = IndexStruct;
    }

    /**
     * Get LIST类型表格元素个数 
     * @return ListElementNum LIST类型表格元素个数
     */
    public Long getListElementNum() {
        return this.ListElementNum;
    }

    /**
     * Set LIST类型表格元素个数
     * @param ListElementNum LIST类型表格元素个数
     */
    public void setListElementNum(Long ListElementNum) {
        this.ListElementNum = ListElementNum;
    }

    /**
     * Get 表格所关联IDL文件信息列表 
     * @return IdlFiles 表格所关联IDL文件信息列表
     */
    public IdlFileInfo [] getIdlFiles() {
        return this.IdlFiles;
    }

    /**
     * Set 表格所关联IDL文件信息列表
     * @param IdlFiles 表格所关联IDL文件信息列表
     */
    public void setIdlFiles(IdlFileInfo [] IdlFiles) {
        this.IdlFiles = IdlFiles;
    }

    /**
     * Get 表格预留容量（GB） 
     * @return ReservedVolume 表格预留容量（GB）
     */
    public Long getReservedVolume() {
        return this.ReservedVolume;
    }

    /**
     * Set 表格预留容量（GB）
     * @param ReservedVolume 表格预留容量（GB）
     */
    public void setReservedVolume(Long ReservedVolume) {
        this.ReservedVolume = ReservedVolume;
    }

    /**
     * Get 表格预留读CU 
     * @return ReservedReadQps 表格预留读CU
     */
    public Long getReservedReadQps() {
        return this.ReservedReadQps;
    }

    /**
     * Set 表格预留读CU
     * @param ReservedReadQps 表格预留读CU
     */
    public void setReservedReadQps(Long ReservedReadQps) {
        this.ReservedReadQps = ReservedReadQps;
    }

    /**
     * Get 表格预留写CU 
     * @return ReservedWriteQps 表格预留写CU
     */
    public Long getReservedWriteQps() {
        return this.ReservedWriteQps;
    }

    /**
     * Set 表格预留写CU
     * @param ReservedWriteQps 表格预留写CU
     */
    public void setReservedWriteQps(Long ReservedWriteQps) {
        this.ReservedWriteQps = ReservedWriteQps;
    }

    /**
     * Get 表格实际数据量大小（MB） 
     * @return TableSize 表格实际数据量大小（MB）
     */
    public Long getTableSize() {
        return this.TableSize;
    }

    /**
     * Set 表格实际数据量大小（MB）
     * @param TableSize 表格实际数据量大小（MB）
     */
    public void setTableSize(Long TableSize) {
        this.TableSize = TableSize;
    }

    /**
     * Get 表格状态 
     * @return Status 表格状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 表格状态
     * @param Status 表格状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 表格创建时间 
     * @return CreatedTime 表格创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 表格创建时间
     * @param CreatedTime 表格创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 表格最后一次修改时间 
     * @return UpdatedTime 表格最后一次修改时间
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 表格最后一次修改时间
     * @param UpdatedTime 表格最后一次修改时间
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 表格备注信息 
     * @return Memo 表格备注信息
     */
    public String getMemo() {
        return this.Memo;
    }

    /**
     * Set 表格备注信息
     * @param Memo 表格备注信息
     */
    public void setMemo(String Memo) {
        this.Memo = Memo;
    }

    /**
     * Get 错误信息 
     * @return Error 错误信息
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set 错误信息
     * @param Error 错误信息
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    /**
     * Get TcaplusDB SDK数据访问接入ID 
     * @return ApiAccessId TcaplusDB SDK数据访问接入ID
     */
    public String getApiAccessId() {
        return this.ApiAccessId;
    }

    /**
     * Set TcaplusDB SDK数据访问接入ID
     * @param ApiAccessId TcaplusDB SDK数据访问接入ID
     */
    public void setApiAccessId(String ApiAccessId) {
        this.ApiAccessId = ApiAccessId;
    }

    /**
     * Get SORTLIST类型表格排序字段个数 
     * @return SortFieldNum SORTLIST类型表格排序字段个数
     */
    public Long getSortFieldNum() {
        return this.SortFieldNum;
    }

    /**
     * Set SORTLIST类型表格排序字段个数
     * @param SortFieldNum SORTLIST类型表格排序字段个数
     */
    public void setSortFieldNum(Long SortFieldNum) {
        this.SortFieldNum = SortFieldNum;
    }

    /**
     * Get SORTLIST类型表格排序顺序 
     * @return SortRule SORTLIST类型表格排序顺序
     */
    public Long getSortRule() {
        return this.SortRule;
    }

    /**
     * Set SORTLIST类型表格排序顺序
     * @param SortRule SORTLIST类型表格排序顺序
     */
    public void setSortRule(Long SortRule) {
        this.SortRule = SortRule;
    }

    /**
     * Get 表格分布式索引/缓写、kafka数据订阅信息 
     * @return DbClusterInfoStruct 表格分布式索引/缓写、kafka数据订阅信息
     */
    public String getDbClusterInfoStruct() {
        return this.DbClusterInfoStruct;
    }

    /**
     * Set 表格分布式索引/缓写、kafka数据订阅信息
     * @param DbClusterInfoStruct 表格分布式索引/缓写、kafka数据订阅信息
     */
    public void setDbClusterInfoStruct(String DbClusterInfoStruct) {
        this.DbClusterInfoStruct = DbClusterInfoStruct;
    }

    /**
     * Get 表格Txh备份文件多少天后过期删除 
     * @return TxhBackupExpireDay 表格Txh备份文件多少天后过期删除
     */
    public Long getTxhBackupExpireDay() {
        return this.TxhBackupExpireDay;
    }

    /**
     * Set 表格Txh备份文件多少天后过期删除
     * @param TxhBackupExpireDay 表格Txh备份文件多少天后过期删除
     */
    public void setTxhBackupExpireDay(Long TxhBackupExpireDay) {
        this.TxhBackupExpireDay = TxhBackupExpireDay;
    }

    /**
     * Get 表格的缓写信息 
     * @return SyncTableInfo 表格的缓写信息
     */
    public SyncTableInfo getSyncTableInfo() {
        return this.SyncTableInfo;
    }

    /**
     * Set 表格的缓写信息
     * @param SyncTableInfo 表格的缓写信息
     */
    public void setSyncTableInfo(SyncTableInfo SyncTableInfo) {
        this.SyncTableInfo = SyncTableInfo;
    }

    public TableInfoNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableInfoNew(TableInfoNew source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableInstanceId != null) {
            this.TableInstanceId = new String(source.TableInstanceId);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.TableIdlType != null) {
            this.TableIdlType = new String(source.TableIdlType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.TableGroupName != null) {
            this.TableGroupName = new String(source.TableGroupName);
        }
        if (source.KeyStruct != null) {
            this.KeyStruct = new String(source.KeyStruct);
        }
        if (source.ValueStruct != null) {
            this.ValueStruct = new String(source.ValueStruct);
        }
        if (source.ShardingKeySet != null) {
            this.ShardingKeySet = new String(source.ShardingKeySet);
        }
        if (source.IndexStruct != null) {
            this.IndexStruct = new String(source.IndexStruct);
        }
        if (source.ListElementNum != null) {
            this.ListElementNum = new Long(source.ListElementNum);
        }
        if (source.IdlFiles != null) {
            this.IdlFiles = new IdlFileInfo[source.IdlFiles.length];
            for (int i = 0; i < source.IdlFiles.length; i++) {
                this.IdlFiles[i] = new IdlFileInfo(source.IdlFiles[i]);
            }
        }
        if (source.ReservedVolume != null) {
            this.ReservedVolume = new Long(source.ReservedVolume);
        }
        if (source.ReservedReadQps != null) {
            this.ReservedReadQps = new Long(source.ReservedReadQps);
        }
        if (source.ReservedWriteQps != null) {
            this.ReservedWriteQps = new Long(source.ReservedWriteQps);
        }
        if (source.TableSize != null) {
            this.TableSize = new Long(source.TableSize);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.Memo != null) {
            this.Memo = new String(source.Memo);
        }
        if (source.Error != null) {
            this.Error = new ErrorInfo(source.Error);
        }
        if (source.ApiAccessId != null) {
            this.ApiAccessId = new String(source.ApiAccessId);
        }
        if (source.SortFieldNum != null) {
            this.SortFieldNum = new Long(source.SortFieldNum);
        }
        if (source.SortRule != null) {
            this.SortRule = new Long(source.SortRule);
        }
        if (source.DbClusterInfoStruct != null) {
            this.DbClusterInfoStruct = new String(source.DbClusterInfoStruct);
        }
        if (source.TxhBackupExpireDay != null) {
            this.TxhBackupExpireDay = new Long(source.TxhBackupExpireDay);
        }
        if (source.SyncTableInfo != null) {
            this.SyncTableInfo = new SyncTableInfo(source.SyncTableInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableInstanceId", this.TableInstanceId);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "TableIdlType", this.TableIdlType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableGroupName", this.TableGroupName);
        this.setParamSimple(map, prefix + "KeyStruct", this.KeyStruct);
        this.setParamSimple(map, prefix + "ValueStruct", this.ValueStruct);
        this.setParamSimple(map, prefix + "ShardingKeySet", this.ShardingKeySet);
        this.setParamSimple(map, prefix + "IndexStruct", this.IndexStruct);
        this.setParamSimple(map, prefix + "ListElementNum", this.ListElementNum);
        this.setParamArrayObj(map, prefix + "IdlFiles.", this.IdlFiles);
        this.setParamSimple(map, prefix + "ReservedVolume", this.ReservedVolume);
        this.setParamSimple(map, prefix + "ReservedReadQps", this.ReservedReadQps);
        this.setParamSimple(map, prefix + "ReservedWriteQps", this.ReservedWriteQps);
        this.setParamSimple(map, prefix + "TableSize", this.TableSize);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "Memo", this.Memo);
        this.setParamObj(map, prefix + "Error.", this.Error);
        this.setParamSimple(map, prefix + "ApiAccessId", this.ApiAccessId);
        this.setParamSimple(map, prefix + "SortFieldNum", this.SortFieldNum);
        this.setParamSimple(map, prefix + "SortRule", this.SortRule);
        this.setParamSimple(map, prefix + "DbClusterInfoStruct", this.DbClusterInfoStruct);
        this.setParamSimple(map, prefix + "TxhBackupExpireDay", this.TxhBackupExpireDay);
        this.setParamObj(map, prefix + "SyncTableInfo.", this.SyncTableInfo);

    }
}

