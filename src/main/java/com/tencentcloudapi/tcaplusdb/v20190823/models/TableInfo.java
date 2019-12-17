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

public class TableInfo extends AbstractModel{

    /**
    * 表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 表实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableInstanceId")
    @Expose
    private String TableInstanceId;

    /**
    * 表数据结构类型，如：`GENERIC`或`LIST`
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * 表数据描述语言（IDL）类型，如：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableIdlType")
    @Expose
    private String TableIdlType;

    /**
    * 表所属应用实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 表所属应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 表所属大区ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogicZoneId")
    @Expose
    private String LogicZoneId;

    /**
    * 表所属大区名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 表主键结构json字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyStruct")
    @Expose
    private String KeyStruct;

    /**
    * 表非主键结构json字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueStruct")
    @Expose
    private String ValueStruct;

    /**
    * 表分表因子集合，PROTO表有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShardingKeySet")
    @Expose
    private String ShardingKeySet;

    /**
    * 表索引键集合，PROTO表有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexStruct")
    @Expose
    private String IndexStruct;

    /**
    * LIST表元素个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListElementNum")
    @Expose
    private Long ListElementNum;

    /**
    * 表所关联IDL文件信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdlFiles")
    @Expose
    private IdlFileInfo [] IdlFiles;

    /**
    * 表预留容量（GB）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReservedVolume")
    @Expose
    private Long ReservedVolume;

    /**
    * 表预留读QPS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReservedReadQps")
    @Expose
    private Long ReservedReadQps;

    /**
    * 表预留写QPS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReservedWriteQps")
    @Expose
    private Long ReservedWriteQps;

    /**
    * 表实际数据量大小（MB）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableSize")
    @Expose
    private Long TableSize;

    /**
    * 表状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 表创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 最后一次更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 表备注信息
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
    * Api接入ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiAccessId")
    @Expose
    private String ApiAccessId;

    /**
     * Get 表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 表实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableInstanceId 表实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableInstanceId() {
        return this.TableInstanceId;
    }

    /**
     * Set 表实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableInstanceId 表实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableInstanceId(String TableInstanceId) {
        this.TableInstanceId = TableInstanceId;
    }

    /**
     * Get 表数据结构类型，如：`GENERIC`或`LIST`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableType 表数据结构类型，如：`GENERIC`或`LIST`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set 表数据结构类型，如：`GENERIC`或`LIST`
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableType 表数据结构类型，如：`GENERIC`或`LIST`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get 表数据描述语言（IDL）类型，如：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableIdlType 表数据描述语言（IDL）类型，如：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableIdlType() {
        return this.TableIdlType;
    }

    /**
     * Set 表数据描述语言（IDL）类型，如：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableIdlType 表数据描述语言（IDL）类型，如：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableIdlType(String TableIdlType) {
        this.TableIdlType = TableIdlType;
    }

    /**
     * Get 表所属应用实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId 表所属应用实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 表所属应用实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 表所属应用实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 表所属应用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppName 表所属应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 表所属应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppName 表所属应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 表所属大区ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogicZoneId 表所属大区ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogicZoneId() {
        return this.LogicZoneId;
    }

    /**
     * Set 表所属大区ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogicZoneId 表所属大区ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogicZoneId(String LogicZoneId) {
        this.LogicZoneId = LogicZoneId;
    }

    /**
     * Get 表所属大区名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneName 表所属大区名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 表所属大区名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneName 表所属大区名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 表主键结构json字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyStruct 表主键结构json字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyStruct() {
        return this.KeyStruct;
    }

    /**
     * Set 表主键结构json字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyStruct 表主键结构json字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyStruct(String KeyStruct) {
        this.KeyStruct = KeyStruct;
    }

    /**
     * Get 表非主键结构json字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueStruct 表非主键结构json字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValueStruct() {
        return this.ValueStruct;
    }

    /**
     * Set 表非主键结构json字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueStruct 表非主键结构json字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueStruct(String ValueStruct) {
        this.ValueStruct = ValueStruct;
    }

    /**
     * Get 表分表因子集合，PROTO表有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShardingKeySet 表分表因子集合，PROTO表有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShardingKeySet() {
        return this.ShardingKeySet;
    }

    /**
     * Set 表分表因子集合，PROTO表有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShardingKeySet 表分表因子集合，PROTO表有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShardingKeySet(String ShardingKeySet) {
        this.ShardingKeySet = ShardingKeySet;
    }

    /**
     * Get 表索引键集合，PROTO表有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexStruct 表索引键集合，PROTO表有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexStruct() {
        return this.IndexStruct;
    }

    /**
     * Set 表索引键集合，PROTO表有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexStruct 表索引键集合，PROTO表有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexStruct(String IndexStruct) {
        this.IndexStruct = IndexStruct;
    }

    /**
     * Get LIST表元素个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListElementNum LIST表元素个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getListElementNum() {
        return this.ListElementNum;
    }

    /**
     * Set LIST表元素个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListElementNum LIST表元素个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListElementNum(Long ListElementNum) {
        this.ListElementNum = ListElementNum;
    }

    /**
     * Get 表所关联IDL文件信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdlFiles 表所关联IDL文件信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IdlFileInfo [] getIdlFiles() {
        return this.IdlFiles;
    }

    /**
     * Set 表所关联IDL文件信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdlFiles 表所关联IDL文件信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdlFiles(IdlFileInfo [] IdlFiles) {
        this.IdlFiles = IdlFiles;
    }

    /**
     * Get 表预留容量（GB）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReservedVolume 表预留容量（GB）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReservedVolume() {
        return this.ReservedVolume;
    }

    /**
     * Set 表预留容量（GB）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReservedVolume 表预留容量（GB）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReservedVolume(Long ReservedVolume) {
        this.ReservedVolume = ReservedVolume;
    }

    /**
     * Get 表预留读QPS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReservedReadQps 表预留读QPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReservedReadQps() {
        return this.ReservedReadQps;
    }

    /**
     * Set 表预留读QPS
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReservedReadQps 表预留读QPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReservedReadQps(Long ReservedReadQps) {
        this.ReservedReadQps = ReservedReadQps;
    }

    /**
     * Get 表预留写QPS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReservedWriteQps 表预留写QPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReservedWriteQps() {
        return this.ReservedWriteQps;
    }

    /**
     * Set 表预留写QPS
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReservedWriteQps 表预留写QPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReservedWriteQps(Long ReservedWriteQps) {
        this.ReservedWriteQps = ReservedWriteQps;
    }

    /**
     * Get 表实际数据量大小（MB）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableSize 表实际数据量大小（MB）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTableSize() {
        return this.TableSize;
    }

    /**
     * Set 表实际数据量大小（MB）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableSize 表实际数据量大小（MB）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableSize(Long TableSize) {
        this.TableSize = TableSize;
    }

    /**
     * Get 表状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 表状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 表状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 表状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 表创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 表创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 表创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 表创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 最后一次更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedTime 最后一次更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 最后一次更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedTime 最后一次更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 表备注信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memo 表备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemo() {
        return this.Memo;
    }

    /**
     * Set 表备注信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memo 表备注信息
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
     * Get Api接入ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiAccessId Api接入ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiAccessId() {
        return this.ApiAccessId;
    }

    /**
     * Set Api接入ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiAccessId Api接入ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiAccessId(String ApiAccessId) {
        this.ApiAccessId = ApiAccessId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableInstanceId", this.TableInstanceId);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "TableIdlType", this.TableIdlType);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "LogicZoneId", this.LogicZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
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

    }
}

