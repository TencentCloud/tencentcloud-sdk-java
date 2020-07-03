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

public class TableInfoNew extends AbstractModel{

    /**
    * 表格名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 表格实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableInstanceId")
    @Expose
    private String TableInstanceId;

    /**
    * 表格数据结构类型，如：`GENERIC`或`LIST`
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * 表格数据描述语言（IDL）类型，如：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableIdlType")
    @Expose
    private String TableIdlType;

    /**
    * 表格所属集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 表格所属集群名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 表格所属表格组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * 表格所属表格组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableGroupName")
    @Expose
    private String TableGroupName;

    /**
    * 表格主键字段结构json字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyStruct")
    @Expose
    private String KeyStruct;

    /**
    * 表格非主键字段结构json字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueStruct")
    @Expose
    private String ValueStruct;

    /**
    * 表格分表因子集合，对PROTO类型表格有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShardingKeySet")
    @Expose
    private String ShardingKeySet;

    /**
    * 表格索引键字段集合，对PROTO类型表格有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexStruct")
    @Expose
    private String IndexStruct;

    /**
    * LIST类型表格元素个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListElementNum")
    @Expose
    private Long ListElementNum;

    /**
    * 表格所关联IDL文件信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdlFiles")
    @Expose
    private IdlFileInfo [] IdlFiles;

    /**
    * 表格预留容量（GB）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReservedVolume")
    @Expose
    private Long ReservedVolume;

    /**
    * 表格预留读CU
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReservedReadQps")
    @Expose
    private Long ReservedReadQps;

    /**
    * 表格预留写CU
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReservedWriteQps")
    @Expose
    private Long ReservedWriteQps;

    /**
    * 表格实际数据量大小（MB）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableSize")
    @Expose
    private Long TableSize;

    /**
    * 表格状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 表格创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 表格最后一次修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 表格备注信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memo")
    @Expose
    private String Memo;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
    * TcaplusDB SDK数据访问接入ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiAccessId")
    @Expose
    private String ApiAccessId;

    /**
    * SORTLIST类型表格排序字段个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SortFieldNum")
    @Expose
    private Long SortFieldNum;

    /**
    * SORTLIST类型表格排序顺序
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SortRule")
    @Expose
    private Long SortRule;

    /**
    * 表格分布式索引信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbClusterInfoStruct")
    @Expose
    private String DbClusterInfoStruct;

    /**
     * Get 表格名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表格名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表格名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表格名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 表格实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableInstanceId 表格实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableInstanceId() {
        return this.TableInstanceId;
    }

    /**
     * Set 表格实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableInstanceId 表格实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableInstanceId(String TableInstanceId) {
        this.TableInstanceId = TableInstanceId;
    }

    /**
     * Get 表格数据结构类型，如：`GENERIC`或`LIST`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableType 表格数据结构类型，如：`GENERIC`或`LIST`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set 表格数据结构类型，如：`GENERIC`或`LIST`
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableType 表格数据结构类型，如：`GENERIC`或`LIST`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get 表格数据描述语言（IDL）类型，如：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableIdlType 表格数据描述语言（IDL）类型，如：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableIdlType() {
        return this.TableIdlType;
    }

    /**
     * Set 表格数据描述语言（IDL）类型，如：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableIdlType 表格数据描述语言（IDL）类型，如：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableIdlType(String TableIdlType) {
        this.TableIdlType = TableIdlType;
    }

    /**
     * Get 表格所属集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 表格所属集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 表格所属集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 表格所属集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 表格所属集群名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName 表格所属集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 表格所属集群名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 表格所属集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 表格所属表格组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableGroupId 表格所属表格组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set 表格所属表格组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableGroupId 表格所属表格组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get 表格所属表格组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableGroupName 表格所属表格组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableGroupName() {
        return this.TableGroupName;
    }

    /**
     * Set 表格所属表格组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableGroupName 表格所属表格组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableGroupName(String TableGroupName) {
        this.TableGroupName = TableGroupName;
    }

    /**
     * Get 表格主键字段结构json字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyStruct 表格主键字段结构json字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyStruct() {
        return this.KeyStruct;
    }

    /**
     * Set 表格主键字段结构json字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyStruct 表格主键字段结构json字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyStruct(String KeyStruct) {
        this.KeyStruct = KeyStruct;
    }

    /**
     * Get 表格非主键字段结构json字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueStruct 表格非主键字段结构json字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValueStruct() {
        return this.ValueStruct;
    }

    /**
     * Set 表格非主键字段结构json字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueStruct 表格非主键字段结构json字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueStruct(String ValueStruct) {
        this.ValueStruct = ValueStruct;
    }

    /**
     * Get 表格分表因子集合，对PROTO类型表格有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShardingKeySet 表格分表因子集合，对PROTO类型表格有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShardingKeySet() {
        return this.ShardingKeySet;
    }

    /**
     * Set 表格分表因子集合，对PROTO类型表格有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShardingKeySet 表格分表因子集合，对PROTO类型表格有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShardingKeySet(String ShardingKeySet) {
        this.ShardingKeySet = ShardingKeySet;
    }

    /**
     * Get 表格索引键字段集合，对PROTO类型表格有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexStruct 表格索引键字段集合，对PROTO类型表格有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexStruct() {
        return this.IndexStruct;
    }

    /**
     * Set 表格索引键字段集合，对PROTO类型表格有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexStruct 表格索引键字段集合，对PROTO类型表格有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexStruct(String IndexStruct) {
        this.IndexStruct = IndexStruct;
    }

    /**
     * Get LIST类型表格元素个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListElementNum LIST类型表格元素个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getListElementNum() {
        return this.ListElementNum;
    }

    /**
     * Set LIST类型表格元素个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListElementNum LIST类型表格元素个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListElementNum(Long ListElementNum) {
        this.ListElementNum = ListElementNum;
    }

    /**
     * Get 表格所关联IDL文件信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdlFiles 表格所关联IDL文件信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IdlFileInfo [] getIdlFiles() {
        return this.IdlFiles;
    }

    /**
     * Set 表格所关联IDL文件信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdlFiles 表格所关联IDL文件信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdlFiles(IdlFileInfo [] IdlFiles) {
        this.IdlFiles = IdlFiles;
    }

    /**
     * Get 表格预留容量（GB）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReservedVolume 表格预留容量（GB）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReservedVolume() {
        return this.ReservedVolume;
    }

    /**
     * Set 表格预留容量（GB）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReservedVolume 表格预留容量（GB）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReservedVolume(Long ReservedVolume) {
        this.ReservedVolume = ReservedVolume;
    }

    /**
     * Get 表格预留读CU
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReservedReadQps 表格预留读CU
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReservedReadQps() {
        return this.ReservedReadQps;
    }

    /**
     * Set 表格预留读CU
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReservedReadQps 表格预留读CU
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReservedReadQps(Long ReservedReadQps) {
        this.ReservedReadQps = ReservedReadQps;
    }

    /**
     * Get 表格预留写CU
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReservedWriteQps 表格预留写CU
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReservedWriteQps() {
        return this.ReservedWriteQps;
    }

    /**
     * Set 表格预留写CU
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReservedWriteQps 表格预留写CU
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReservedWriteQps(Long ReservedWriteQps) {
        this.ReservedWriteQps = ReservedWriteQps;
    }

    /**
     * Get 表格实际数据量大小（MB）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableSize 表格实际数据量大小（MB）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTableSize() {
        return this.TableSize;
    }

    /**
     * Set 表格实际数据量大小（MB）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableSize 表格实际数据量大小（MB）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableSize(Long TableSize) {
        this.TableSize = TableSize;
    }

    /**
     * Get 表格状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 表格状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 表格状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 表格状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 表格创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 表格创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 表格创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 表格创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 表格最后一次修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedTime 表格最后一次修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 表格最后一次修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedTime 表格最后一次修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 表格备注信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memo 表格备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemo() {
        return this.Memo;
    }

    /**
     * Set 表格备注信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memo 表格备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemo(String Memo) {
        this.Memo = Memo;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Error 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Error 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    /**
     * Get TcaplusDB SDK数据访问接入ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiAccessId TcaplusDB SDK数据访问接入ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiAccessId() {
        return this.ApiAccessId;
    }

    /**
     * Set TcaplusDB SDK数据访问接入ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiAccessId TcaplusDB SDK数据访问接入ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiAccessId(String ApiAccessId) {
        this.ApiAccessId = ApiAccessId;
    }

    /**
     * Get SORTLIST类型表格排序字段个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SortFieldNum SORTLIST类型表格排序字段个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSortFieldNum() {
        return this.SortFieldNum;
    }

    /**
     * Set SORTLIST类型表格排序字段个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SortFieldNum SORTLIST类型表格排序字段个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSortFieldNum(Long SortFieldNum) {
        this.SortFieldNum = SortFieldNum;
    }

    /**
     * Get SORTLIST类型表格排序顺序
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SortRule SORTLIST类型表格排序顺序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSortRule() {
        return this.SortRule;
    }

    /**
     * Set SORTLIST类型表格排序顺序
注意：此字段可能返回 null，表示取不到有效值。
     * @param SortRule SORTLIST类型表格排序顺序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSortRule(Long SortRule) {
        this.SortRule = SortRule;
    }

    /**
     * Get 表格分布式索引信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbClusterInfoStruct 表格分布式索引信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbClusterInfoStruct() {
        return this.DbClusterInfoStruct;
    }

    /**
     * Set 表格分布式索引信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbClusterInfoStruct 表格分布式索引信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbClusterInfoStruct(String DbClusterInfoStruct) {
        this.DbClusterInfoStruct = DbClusterInfoStruct;
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

    }
}

