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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogTopSqlItem extends AbstractModel{

    /**
    * sql总锁等待时间
    */
    @SerializedName("LockTime")
    @Expose
    private Float LockTime;

    /**
    * 最大锁等待时间
    */
    @SerializedName("LockTimeMax")
    @Expose
    private Float LockTimeMax;

    /**
    * 最小锁等待时间
    */
    @SerializedName("LockTimeMin")
    @Expose
    private Float LockTimeMin;

    /**
    * 总扫描行数
    */
    @SerializedName("RowsExamined")
    @Expose
    private Long RowsExamined;

    /**
    * 最大扫描行数
    */
    @SerializedName("RowsExaminedMax")
    @Expose
    private Long RowsExaminedMax;

    /**
    * 最小扫描行数
    */
    @SerializedName("RowsExaminedMin")
    @Expose
    private Long RowsExaminedMin;

    /**
    * 总耗时
    */
    @SerializedName("QueryTime")
    @Expose
    private Float QueryTime;

    /**
    * 最大执行时间
    */
    @SerializedName("QueryTimeMax")
    @Expose
    private Float QueryTimeMax;

    /**
    * 最小执行时间
    */
    @SerializedName("QueryTimeMin")
    @Expose
    private Float QueryTimeMin;

    /**
    * 总返回行数
    */
    @SerializedName("RowsSent")
    @Expose
    private Long RowsSent;

    /**
    * 最大返回行数
    */
    @SerializedName("RowsSentMax")
    @Expose
    private Long RowsSentMax;

    /**
    * 最小返回行数
    */
    @SerializedName("RowsSentMin")
    @Expose
    private Long RowsSentMin;

    /**
    * 执行次数
    */
    @SerializedName("ExecTimes")
    @Expose
    private Long ExecTimes;

    /**
    * sql模板
    */
    @SerializedName("SqlTemplate")
    @Expose
    private String SqlTemplate;

    /**
    * 带参数SQL（随机）
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * schema
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * 总耗时占比
    */
    @SerializedName("QueryTimeRatio")
    @Expose
    private Float QueryTimeRatio;

    /**
    * sql总锁等待时间占比
    */
    @SerializedName("LockTimeRatio")
    @Expose
    private Float LockTimeRatio;

    /**
    * 总扫描行数占比
    */
    @SerializedName("RowsExaminedRatio")
    @Expose
    private Float RowsExaminedRatio;

    /**
    * 总返回行数占比
    */
    @SerializedName("RowsSentRatio")
    @Expose
    private Float RowsSentRatio;

    /**
     * Get sql总锁等待时间 
     * @return LockTime sql总锁等待时间
     */
    public Float getLockTime() {
        return this.LockTime;
    }

    /**
     * Set sql总锁等待时间
     * @param LockTime sql总锁等待时间
     */
    public void setLockTime(Float LockTime) {
        this.LockTime = LockTime;
    }

    /**
     * Get 最大锁等待时间 
     * @return LockTimeMax 最大锁等待时间
     */
    public Float getLockTimeMax() {
        return this.LockTimeMax;
    }

    /**
     * Set 最大锁等待时间
     * @param LockTimeMax 最大锁等待时间
     */
    public void setLockTimeMax(Float LockTimeMax) {
        this.LockTimeMax = LockTimeMax;
    }

    /**
     * Get 最小锁等待时间 
     * @return LockTimeMin 最小锁等待时间
     */
    public Float getLockTimeMin() {
        return this.LockTimeMin;
    }

    /**
     * Set 最小锁等待时间
     * @param LockTimeMin 最小锁等待时间
     */
    public void setLockTimeMin(Float LockTimeMin) {
        this.LockTimeMin = LockTimeMin;
    }

    /**
     * Get 总扫描行数 
     * @return RowsExamined 总扫描行数
     */
    public Long getRowsExamined() {
        return this.RowsExamined;
    }

    /**
     * Set 总扫描行数
     * @param RowsExamined 总扫描行数
     */
    public void setRowsExamined(Long RowsExamined) {
        this.RowsExamined = RowsExamined;
    }

    /**
     * Get 最大扫描行数 
     * @return RowsExaminedMax 最大扫描行数
     */
    public Long getRowsExaminedMax() {
        return this.RowsExaminedMax;
    }

    /**
     * Set 最大扫描行数
     * @param RowsExaminedMax 最大扫描行数
     */
    public void setRowsExaminedMax(Long RowsExaminedMax) {
        this.RowsExaminedMax = RowsExaminedMax;
    }

    /**
     * Get 最小扫描行数 
     * @return RowsExaminedMin 最小扫描行数
     */
    public Long getRowsExaminedMin() {
        return this.RowsExaminedMin;
    }

    /**
     * Set 最小扫描行数
     * @param RowsExaminedMin 最小扫描行数
     */
    public void setRowsExaminedMin(Long RowsExaminedMin) {
        this.RowsExaminedMin = RowsExaminedMin;
    }

    /**
     * Get 总耗时 
     * @return QueryTime 总耗时
     */
    public Float getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set 总耗时
     * @param QueryTime 总耗时
     */
    public void setQueryTime(Float QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get 最大执行时间 
     * @return QueryTimeMax 最大执行时间
     */
    public Float getQueryTimeMax() {
        return this.QueryTimeMax;
    }

    /**
     * Set 最大执行时间
     * @param QueryTimeMax 最大执行时间
     */
    public void setQueryTimeMax(Float QueryTimeMax) {
        this.QueryTimeMax = QueryTimeMax;
    }

    /**
     * Get 最小执行时间 
     * @return QueryTimeMin 最小执行时间
     */
    public Float getQueryTimeMin() {
        return this.QueryTimeMin;
    }

    /**
     * Set 最小执行时间
     * @param QueryTimeMin 最小执行时间
     */
    public void setQueryTimeMin(Float QueryTimeMin) {
        this.QueryTimeMin = QueryTimeMin;
    }

    /**
     * Get 总返回行数 
     * @return RowsSent 总返回行数
     */
    public Long getRowsSent() {
        return this.RowsSent;
    }

    /**
     * Set 总返回行数
     * @param RowsSent 总返回行数
     */
    public void setRowsSent(Long RowsSent) {
        this.RowsSent = RowsSent;
    }

    /**
     * Get 最大返回行数 
     * @return RowsSentMax 最大返回行数
     */
    public Long getRowsSentMax() {
        return this.RowsSentMax;
    }

    /**
     * Set 最大返回行数
     * @param RowsSentMax 最大返回行数
     */
    public void setRowsSentMax(Long RowsSentMax) {
        this.RowsSentMax = RowsSentMax;
    }

    /**
     * Get 最小返回行数 
     * @return RowsSentMin 最小返回行数
     */
    public Long getRowsSentMin() {
        return this.RowsSentMin;
    }

    /**
     * Set 最小返回行数
     * @param RowsSentMin 最小返回行数
     */
    public void setRowsSentMin(Long RowsSentMin) {
        this.RowsSentMin = RowsSentMin;
    }

    /**
     * Get 执行次数 
     * @return ExecTimes 执行次数
     */
    public Long getExecTimes() {
        return this.ExecTimes;
    }

    /**
     * Set 执行次数
     * @param ExecTimes 执行次数
     */
    public void setExecTimes(Long ExecTimes) {
        this.ExecTimes = ExecTimes;
    }

    /**
     * Get sql模板 
     * @return SqlTemplate sql模板
     */
    public String getSqlTemplate() {
        return this.SqlTemplate;
    }

    /**
     * Set sql模板
     * @param SqlTemplate sql模板
     */
    public void setSqlTemplate(String SqlTemplate) {
        this.SqlTemplate = SqlTemplate;
    }

    /**
     * Get 带参数SQL（随机） 
     * @return SqlText 带参数SQL（随机）
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set 带参数SQL（随机）
     * @param SqlText 带参数SQL（随机）
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get schema 
     * @return Schema schema
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set schema
     * @param Schema schema
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get 总耗时占比 
     * @return QueryTimeRatio 总耗时占比
     */
    public Float getQueryTimeRatio() {
        return this.QueryTimeRatio;
    }

    /**
     * Set 总耗时占比
     * @param QueryTimeRatio 总耗时占比
     */
    public void setQueryTimeRatio(Float QueryTimeRatio) {
        this.QueryTimeRatio = QueryTimeRatio;
    }

    /**
     * Get sql总锁等待时间占比 
     * @return LockTimeRatio sql总锁等待时间占比
     */
    public Float getLockTimeRatio() {
        return this.LockTimeRatio;
    }

    /**
     * Set sql总锁等待时间占比
     * @param LockTimeRatio sql总锁等待时间占比
     */
    public void setLockTimeRatio(Float LockTimeRatio) {
        this.LockTimeRatio = LockTimeRatio;
    }

    /**
     * Get 总扫描行数占比 
     * @return RowsExaminedRatio 总扫描行数占比
     */
    public Float getRowsExaminedRatio() {
        return this.RowsExaminedRatio;
    }

    /**
     * Set 总扫描行数占比
     * @param RowsExaminedRatio 总扫描行数占比
     */
    public void setRowsExaminedRatio(Float RowsExaminedRatio) {
        this.RowsExaminedRatio = RowsExaminedRatio;
    }

    /**
     * Get 总返回行数占比 
     * @return RowsSentRatio 总返回行数占比
     */
    public Float getRowsSentRatio() {
        return this.RowsSentRatio;
    }

    /**
     * Set 总返回行数占比
     * @param RowsSentRatio 总返回行数占比
     */
    public void setRowsSentRatio(Float RowsSentRatio) {
        this.RowsSentRatio = RowsSentRatio;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LockTime", this.LockTime);
        this.setParamSimple(map, prefix + "LockTimeMax", this.LockTimeMax);
        this.setParamSimple(map, prefix + "LockTimeMin", this.LockTimeMin);
        this.setParamSimple(map, prefix + "RowsExamined", this.RowsExamined);
        this.setParamSimple(map, prefix + "RowsExaminedMax", this.RowsExaminedMax);
        this.setParamSimple(map, prefix + "RowsExaminedMin", this.RowsExaminedMin);
        this.setParamSimple(map, prefix + "QueryTime", this.QueryTime);
        this.setParamSimple(map, prefix + "QueryTimeMax", this.QueryTimeMax);
        this.setParamSimple(map, prefix + "QueryTimeMin", this.QueryTimeMin);
        this.setParamSimple(map, prefix + "RowsSent", this.RowsSent);
        this.setParamSimple(map, prefix + "RowsSentMax", this.RowsSentMax);
        this.setParamSimple(map, prefix + "RowsSentMin", this.RowsSentMin);
        this.setParamSimple(map, prefix + "ExecTimes", this.ExecTimes);
        this.setParamSimple(map, prefix + "SqlTemplate", this.SqlTemplate);
        this.setParamSimple(map, prefix + "SqlText", this.SqlText);
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "QueryTimeRatio", this.QueryTimeRatio);
        this.setParamSimple(map, prefix + "LockTimeRatio", this.LockTimeRatio);
        this.setParamSimple(map, prefix + "RowsExaminedRatio", this.RowsExaminedRatio);
        this.setParamSimple(map, prefix + "RowsSentRatio", this.RowsSentRatio);

    }
}

