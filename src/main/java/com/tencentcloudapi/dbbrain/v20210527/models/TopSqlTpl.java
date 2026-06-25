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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopSqlTpl extends AbstractModel {

    /**
    * <p>执行次数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecTimes")
    @Expose
    private Long ExecTimes;

    /**
    * <p>SQL模板Id，数据类型Long。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlTemplateId")
    @Expose
    private String SqlTemplateId;

    /**
    * <p>最小影响行数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AffectRowsMin")
    @Expose
    private Long AffectRowsMin;

    /**
    * <p>sql模板</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlTemplate")
    @Expose
    private String SqlTemplate;

    /**
    * <p>表名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>最大影响行数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AffectRowsMax")
    @Expose
    private Long AffectRowsMax;

    /**
    * <p>sql类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * <p>影响行数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * <p>DB名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DB")
    @Expose
    private String DB;

    /**
    * <p>最小锁等待时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockWaitTimeMin")
    @Expose
    private Float LockWaitTimeMin;

    /**
    * <p>cpu时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuTime")
    @Expose
    private Float CpuTime;

    /**
    * <p>最大io等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IoWaitTimeMax")
    @Expose
    private Float IoWaitTimeMax;

    /**
    * <p>最大锁等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockWaitTimeMax")
    @Expose
    private Float LockWaitTimeMax;

    /**
    * <p>最小检查行数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckRowsMin")
    @Expose
    private Long CheckRowsMin;

    /**
    * <p>检查行数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckRows")
    @Expose
    private Long CheckRows;

    /**
    * <p>最大cpu时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuTimeMax")
    @Expose
    private Float CpuTimeMax;

    /**
    * <p>最小io等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IoWaitTimeMin")
    @Expose
    private Long IoWaitTimeMin;

    /**
    * <p>最大执行时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatencyMax")
    @Expose
    private Float LatencyMax;

    /**
    * <p>io等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IoWaitTime")
    @Expose
    private Float IoWaitTime;

    /**
    * <p>最大检查行数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckRowsMax")
    @Expose
    private Long CheckRowsMax;

    /**
    * <p>最小cpu时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuTimeMin")
    @Expose
    private Float CpuTimeMin;

    /**
    * <p>sql详情</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * <p>锁等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockWaitTime")
    @Expose
    private Float LockWaitTime;

    /**
    * <p>最小执行时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatencyMin")
    @Expose
    private Float LatencyMin;

    /**
    * <p>执行时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Latency")
    @Expose
    private Float Latency;

    /**
    * <p>queryTime 占比，单位%</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryTimeRatio")
    @Expose
    private String QueryTimeRatio;

    /**
    * <p>平均扫描行数</p>
    */
    @SerializedName("CheckRowsAvg")
    @Expose
    private Long CheckRowsAvg;

    /**
    * <p>平均cpu时间</p>
    */
    @SerializedName("CpuTimeAvg")
    @Expose
    private Float CpuTimeAvg;

    /**
    * <p>平均io等待时间</p>
    */
    @SerializedName("IoWaitTimeAvg")
    @Expose
    private Float IoWaitTimeAvg;

    /**
    * <p>平均执行时间</p>
    */
    @SerializedName("LatencyAvg")
    @Expose
    private Float LatencyAvg;

    /**
    * <p>平均锁等待时长</p>
    */
    @SerializedName("LockWaitTimeAvg")
    @Expose
    private Float LockWaitTimeAvg;

    /**
    * <p>发送行数</p>
    */
    @SerializedName("SentRows")
    @Expose
    private Long SentRows;

    /**
    * <p>平均发送行数</p>
    */
    @SerializedName("SentRowsAvg")
    @Expose
    private Long SentRowsAvg;

    /**
    * <p>平均影响行数</p>
    */
    @SerializedName("AffectRowsAvg")
    @Expose
    private Long AffectRowsAvg;

    /**
     * Get <p>执行次数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecTimes <p>执行次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecTimes() {
        return this.ExecTimes;
    }

    /**
     * Set <p>执行次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecTimes <p>执行次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecTimes(Long ExecTimes) {
        this.ExecTimes = ExecTimes;
    }

    /**
     * Get <p>SQL模板Id，数据类型Long。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlTemplateId <p>SQL模板Id，数据类型Long。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlTemplateId() {
        return this.SqlTemplateId;
    }

    /**
     * Set <p>SQL模板Id，数据类型Long。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlTemplateId <p>SQL模板Id，数据类型Long。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlTemplateId(String SqlTemplateId) {
        this.SqlTemplateId = SqlTemplateId;
    }

    /**
     * Get <p>最小影响行数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AffectRowsMin <p>最小影响行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAffectRowsMin() {
        return this.AffectRowsMin;
    }

    /**
     * Set <p>最小影响行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AffectRowsMin <p>最小影响行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAffectRowsMin(Long AffectRowsMin) {
        this.AffectRowsMin = AffectRowsMin;
    }

    /**
     * Get <p>sql模板</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlTemplate <p>sql模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlTemplate() {
        return this.SqlTemplate;
    }

    /**
     * Set <p>sql模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlTemplate <p>sql模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlTemplate(String SqlTemplate) {
        this.SqlTemplate = SqlTemplate;
    }

    /**
     * Get <p>表名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName <p>表名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>表名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName <p>表名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get <p>最大影响行数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AffectRowsMax <p>最大影响行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAffectRowsMax() {
        return this.AffectRowsMax;
    }

    /**
     * Set <p>最大影响行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AffectRowsMax <p>最大影响行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAffectRowsMax(Long AffectRowsMax) {
        this.AffectRowsMax = AffectRowsMax;
    }

    /**
     * Get <p>sql类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlType <p>sql类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set <p>sql类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlType <p>sql类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get <p>影响行数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AffectRows <p>影响行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAffectRows() {
        return this.AffectRows;
    }

    /**
     * Set <p>影响行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AffectRows <p>影响行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAffectRows(Long AffectRows) {
        this.AffectRows = AffectRows;
    }

    /**
     * Get <p>DB名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DB <p>DB名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDB() {
        return this.DB;
    }

    /**
     * Set <p>DB名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DB <p>DB名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDB(String DB) {
        this.DB = DB;
    }

    /**
     * Get <p>最小锁等待时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockWaitTimeMin <p>最小锁等待时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLockWaitTimeMin() {
        return this.LockWaitTimeMin;
    }

    /**
     * Set <p>最小锁等待时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockWaitTimeMin <p>最小锁等待时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockWaitTimeMin(Float LockWaitTimeMin) {
        this.LockWaitTimeMin = LockWaitTimeMin;
    }

    /**
     * Get <p>cpu时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuTime <p>cpu时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCpuTime() {
        return this.CpuTime;
    }

    /**
     * Set <p>cpu时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuTime <p>cpu时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuTime(Float CpuTime) {
        this.CpuTime = CpuTime;
    }

    /**
     * Get <p>最大io等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IoWaitTimeMax <p>最大io等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getIoWaitTimeMax() {
        return this.IoWaitTimeMax;
    }

    /**
     * Set <p>最大io等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IoWaitTimeMax <p>最大io等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIoWaitTimeMax(Float IoWaitTimeMax) {
        this.IoWaitTimeMax = IoWaitTimeMax;
    }

    /**
     * Get <p>最大锁等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockWaitTimeMax <p>最大锁等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLockWaitTimeMax() {
        return this.LockWaitTimeMax;
    }

    /**
     * Set <p>最大锁等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockWaitTimeMax <p>最大锁等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockWaitTimeMax(Float LockWaitTimeMax) {
        this.LockWaitTimeMax = LockWaitTimeMax;
    }

    /**
     * Get <p>最小检查行数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckRowsMin <p>最小检查行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCheckRowsMin() {
        return this.CheckRowsMin;
    }

    /**
     * Set <p>最小检查行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckRowsMin <p>最小检查行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckRowsMin(Long CheckRowsMin) {
        this.CheckRowsMin = CheckRowsMin;
    }

    /**
     * Get <p>检查行数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckRows <p>检查行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCheckRows() {
        return this.CheckRows;
    }

    /**
     * Set <p>检查行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckRows <p>检查行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckRows(Long CheckRows) {
        this.CheckRows = CheckRows;
    }

    /**
     * Get <p>最大cpu时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuTimeMax <p>最大cpu时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCpuTimeMax() {
        return this.CpuTimeMax;
    }

    /**
     * Set <p>最大cpu时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuTimeMax <p>最大cpu时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuTimeMax(Float CpuTimeMax) {
        this.CpuTimeMax = CpuTimeMax;
    }

    /**
     * Get <p>最小io等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IoWaitTimeMin <p>最小io等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIoWaitTimeMin() {
        return this.IoWaitTimeMin;
    }

    /**
     * Set <p>最小io等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IoWaitTimeMin <p>最小io等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIoWaitTimeMin(Long IoWaitTimeMin) {
        this.IoWaitTimeMin = IoWaitTimeMin;
    }

    /**
     * Get <p>最大执行时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatencyMax <p>最大执行时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLatencyMax() {
        return this.LatencyMax;
    }

    /**
     * Set <p>最大执行时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatencyMax <p>最大执行时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatencyMax(Float LatencyMax) {
        this.LatencyMax = LatencyMax;
    }

    /**
     * Get <p>io等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IoWaitTime <p>io等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getIoWaitTime() {
        return this.IoWaitTime;
    }

    /**
     * Set <p>io等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IoWaitTime <p>io等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIoWaitTime(Float IoWaitTime) {
        this.IoWaitTime = IoWaitTime;
    }

    /**
     * Get <p>最大检查行数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckRowsMax <p>最大检查行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCheckRowsMax() {
        return this.CheckRowsMax;
    }

    /**
     * Set <p>最大检查行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckRowsMax <p>最大检查行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckRowsMax(Long CheckRowsMax) {
        this.CheckRowsMax = CheckRowsMax;
    }

    /**
     * Get <p>最小cpu时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuTimeMin <p>最小cpu时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCpuTimeMin() {
        return this.CpuTimeMin;
    }

    /**
     * Set <p>最小cpu时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuTimeMin <p>最小cpu时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuTimeMin(Float CpuTimeMin) {
        this.CpuTimeMin = CpuTimeMin;
    }

    /**
     * Get <p>sql详情</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlText <p>sql详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set <p>sql详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlText <p>sql详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get <p>锁等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockWaitTime <p>锁等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLockWaitTime() {
        return this.LockWaitTime;
    }

    /**
     * Set <p>锁等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockWaitTime <p>锁等待时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockWaitTime(Float LockWaitTime) {
        this.LockWaitTime = LockWaitTime;
    }

    /**
     * Get <p>最小执行时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatencyMin <p>最小执行时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLatencyMin() {
        return this.LatencyMin;
    }

    /**
     * Set <p>最小执行时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatencyMin <p>最小执行时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatencyMin(Float LatencyMin) {
        this.LatencyMin = LatencyMin;
    }

    /**
     * Get <p>执行时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Latency <p>执行时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLatency() {
        return this.Latency;
    }

    /**
     * Set <p>执行时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Latency <p>执行时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatency(Float Latency) {
        this.Latency = Latency;
    }

    /**
     * Get <p>queryTime 占比，单位%</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryTimeRatio <p>queryTime 占比，单位%</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueryTimeRatio() {
        return this.QueryTimeRatio;
    }

    /**
     * Set <p>queryTime 占比，单位%</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryTimeRatio <p>queryTime 占比，单位%</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryTimeRatio(String QueryTimeRatio) {
        this.QueryTimeRatio = QueryTimeRatio;
    }

    /**
     * Get <p>平均扫描行数</p> 
     * @return CheckRowsAvg <p>平均扫描行数</p>
     */
    public Long getCheckRowsAvg() {
        return this.CheckRowsAvg;
    }

    /**
     * Set <p>平均扫描行数</p>
     * @param CheckRowsAvg <p>平均扫描行数</p>
     */
    public void setCheckRowsAvg(Long CheckRowsAvg) {
        this.CheckRowsAvg = CheckRowsAvg;
    }

    /**
     * Get <p>平均cpu时间</p> 
     * @return CpuTimeAvg <p>平均cpu时间</p>
     */
    public Float getCpuTimeAvg() {
        return this.CpuTimeAvg;
    }

    /**
     * Set <p>平均cpu时间</p>
     * @param CpuTimeAvg <p>平均cpu时间</p>
     */
    public void setCpuTimeAvg(Float CpuTimeAvg) {
        this.CpuTimeAvg = CpuTimeAvg;
    }

    /**
     * Get <p>平均io等待时间</p> 
     * @return IoWaitTimeAvg <p>平均io等待时间</p>
     */
    public Float getIoWaitTimeAvg() {
        return this.IoWaitTimeAvg;
    }

    /**
     * Set <p>平均io等待时间</p>
     * @param IoWaitTimeAvg <p>平均io等待时间</p>
     */
    public void setIoWaitTimeAvg(Float IoWaitTimeAvg) {
        this.IoWaitTimeAvg = IoWaitTimeAvg;
    }

    /**
     * Get <p>平均执行时间</p> 
     * @return LatencyAvg <p>平均执行时间</p>
     */
    public Float getLatencyAvg() {
        return this.LatencyAvg;
    }

    /**
     * Set <p>平均执行时间</p>
     * @param LatencyAvg <p>平均执行时间</p>
     */
    public void setLatencyAvg(Float LatencyAvg) {
        this.LatencyAvg = LatencyAvg;
    }

    /**
     * Get <p>平均锁等待时长</p> 
     * @return LockWaitTimeAvg <p>平均锁等待时长</p>
     */
    public Float getLockWaitTimeAvg() {
        return this.LockWaitTimeAvg;
    }

    /**
     * Set <p>平均锁等待时长</p>
     * @param LockWaitTimeAvg <p>平均锁等待时长</p>
     */
    public void setLockWaitTimeAvg(Float LockWaitTimeAvg) {
        this.LockWaitTimeAvg = LockWaitTimeAvg;
    }

    /**
     * Get <p>发送行数</p> 
     * @return SentRows <p>发送行数</p>
     */
    public Long getSentRows() {
        return this.SentRows;
    }

    /**
     * Set <p>发送行数</p>
     * @param SentRows <p>发送行数</p>
     */
    public void setSentRows(Long SentRows) {
        this.SentRows = SentRows;
    }

    /**
     * Get <p>平均发送行数</p> 
     * @return SentRowsAvg <p>平均发送行数</p>
     */
    public Long getSentRowsAvg() {
        return this.SentRowsAvg;
    }

    /**
     * Set <p>平均发送行数</p>
     * @param SentRowsAvg <p>平均发送行数</p>
     */
    public void setSentRowsAvg(Long SentRowsAvg) {
        this.SentRowsAvg = SentRowsAvg;
    }

    /**
     * Get <p>平均影响行数</p> 
     * @return AffectRowsAvg <p>平均影响行数</p>
     */
    public Long getAffectRowsAvg() {
        return this.AffectRowsAvg;
    }

    /**
     * Set <p>平均影响行数</p>
     * @param AffectRowsAvg <p>平均影响行数</p>
     */
    public void setAffectRowsAvg(Long AffectRowsAvg) {
        this.AffectRowsAvg = AffectRowsAvg;
    }

    public TopSqlTpl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopSqlTpl(TopSqlTpl source) {
        if (source.ExecTimes != null) {
            this.ExecTimes = new Long(source.ExecTimes);
        }
        if (source.SqlTemplateId != null) {
            this.SqlTemplateId = new String(source.SqlTemplateId);
        }
        if (source.AffectRowsMin != null) {
            this.AffectRowsMin = new Long(source.AffectRowsMin);
        }
        if (source.SqlTemplate != null) {
            this.SqlTemplate = new String(source.SqlTemplate);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.AffectRowsMax != null) {
            this.AffectRowsMax = new Long(source.AffectRowsMax);
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.AffectRows != null) {
            this.AffectRows = new Long(source.AffectRows);
        }
        if (source.DB != null) {
            this.DB = new String(source.DB);
        }
        if (source.LockWaitTimeMin != null) {
            this.LockWaitTimeMin = new Float(source.LockWaitTimeMin);
        }
        if (source.CpuTime != null) {
            this.CpuTime = new Float(source.CpuTime);
        }
        if (source.IoWaitTimeMax != null) {
            this.IoWaitTimeMax = new Float(source.IoWaitTimeMax);
        }
        if (source.LockWaitTimeMax != null) {
            this.LockWaitTimeMax = new Float(source.LockWaitTimeMax);
        }
        if (source.CheckRowsMin != null) {
            this.CheckRowsMin = new Long(source.CheckRowsMin);
        }
        if (source.CheckRows != null) {
            this.CheckRows = new Long(source.CheckRows);
        }
        if (source.CpuTimeMax != null) {
            this.CpuTimeMax = new Float(source.CpuTimeMax);
        }
        if (source.IoWaitTimeMin != null) {
            this.IoWaitTimeMin = new Long(source.IoWaitTimeMin);
        }
        if (source.LatencyMax != null) {
            this.LatencyMax = new Float(source.LatencyMax);
        }
        if (source.IoWaitTime != null) {
            this.IoWaitTime = new Float(source.IoWaitTime);
        }
        if (source.CheckRowsMax != null) {
            this.CheckRowsMax = new Long(source.CheckRowsMax);
        }
        if (source.CpuTimeMin != null) {
            this.CpuTimeMin = new Float(source.CpuTimeMin);
        }
        if (source.SqlText != null) {
            this.SqlText = new String(source.SqlText);
        }
        if (source.LockWaitTime != null) {
            this.LockWaitTime = new Float(source.LockWaitTime);
        }
        if (source.LatencyMin != null) {
            this.LatencyMin = new Float(source.LatencyMin);
        }
        if (source.Latency != null) {
            this.Latency = new Float(source.Latency);
        }
        if (source.QueryTimeRatio != null) {
            this.QueryTimeRatio = new String(source.QueryTimeRatio);
        }
        if (source.CheckRowsAvg != null) {
            this.CheckRowsAvg = new Long(source.CheckRowsAvg);
        }
        if (source.CpuTimeAvg != null) {
            this.CpuTimeAvg = new Float(source.CpuTimeAvg);
        }
        if (source.IoWaitTimeAvg != null) {
            this.IoWaitTimeAvg = new Float(source.IoWaitTimeAvg);
        }
        if (source.LatencyAvg != null) {
            this.LatencyAvg = new Float(source.LatencyAvg);
        }
        if (source.LockWaitTimeAvg != null) {
            this.LockWaitTimeAvg = new Float(source.LockWaitTimeAvg);
        }
        if (source.SentRows != null) {
            this.SentRows = new Long(source.SentRows);
        }
        if (source.SentRowsAvg != null) {
            this.SentRowsAvg = new Long(source.SentRowsAvg);
        }
        if (source.AffectRowsAvg != null) {
            this.AffectRowsAvg = new Long(source.AffectRowsAvg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecTimes", this.ExecTimes);
        this.setParamSimple(map, prefix + "SqlTemplateId", this.SqlTemplateId);
        this.setParamSimple(map, prefix + "AffectRowsMin", this.AffectRowsMin);
        this.setParamSimple(map, prefix + "SqlTemplate", this.SqlTemplate);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "AffectRowsMax", this.AffectRowsMax);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamSimple(map, prefix + "DB", this.DB);
        this.setParamSimple(map, prefix + "LockWaitTimeMin", this.LockWaitTimeMin);
        this.setParamSimple(map, prefix + "CpuTime", this.CpuTime);
        this.setParamSimple(map, prefix + "IoWaitTimeMax", this.IoWaitTimeMax);
        this.setParamSimple(map, prefix + "LockWaitTimeMax", this.LockWaitTimeMax);
        this.setParamSimple(map, prefix + "CheckRowsMin", this.CheckRowsMin);
        this.setParamSimple(map, prefix + "CheckRows", this.CheckRows);
        this.setParamSimple(map, prefix + "CpuTimeMax", this.CpuTimeMax);
        this.setParamSimple(map, prefix + "IoWaitTimeMin", this.IoWaitTimeMin);
        this.setParamSimple(map, prefix + "LatencyMax", this.LatencyMax);
        this.setParamSimple(map, prefix + "IoWaitTime", this.IoWaitTime);
        this.setParamSimple(map, prefix + "CheckRowsMax", this.CheckRowsMax);
        this.setParamSimple(map, prefix + "CpuTimeMin", this.CpuTimeMin);
        this.setParamSimple(map, prefix + "SqlText", this.SqlText);
        this.setParamSimple(map, prefix + "LockWaitTime", this.LockWaitTime);
        this.setParamSimple(map, prefix + "LatencyMin", this.LatencyMin);
        this.setParamSimple(map, prefix + "Latency", this.Latency);
        this.setParamSimple(map, prefix + "QueryTimeRatio", this.QueryTimeRatio);
        this.setParamSimple(map, prefix + "CheckRowsAvg", this.CheckRowsAvg);
        this.setParamSimple(map, prefix + "CpuTimeAvg", this.CpuTimeAvg);
        this.setParamSimple(map, prefix + "IoWaitTimeAvg", this.IoWaitTimeAvg);
        this.setParamSimple(map, prefix + "LatencyAvg", this.LatencyAvg);
        this.setParamSimple(map, prefix + "LockWaitTimeAvg", this.LockWaitTimeAvg);
        this.setParamSimple(map, prefix + "SentRows", this.SentRows);
        this.setParamSimple(map, prefix + "SentRowsAvg", this.SentRowsAvg);
        this.setParamSimple(map, prefix + "AffectRowsAvg", this.AffectRowsAvg);

    }
}

