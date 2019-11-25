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

public class SlowLogTopSqlItem  extends AbstractModel{

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
     * 获取sql总锁等待时间
     * @return LockTime sql总锁等待时间
     */
    public Float getLockTime() {
        return this.LockTime;
    }

    /**
     * 设置sql总锁等待时间
     * @param LockTime sql总锁等待时间
     */
    public void setLockTime(Float LockTime) {
        this.LockTime = LockTime;
    }

    /**
     * 获取最大锁等待时间
     * @return LockTimeMax 最大锁等待时间
     */
    public Float getLockTimeMax() {
        return this.LockTimeMax;
    }

    /**
     * 设置最大锁等待时间
     * @param LockTimeMax 最大锁等待时间
     */
    public void setLockTimeMax(Float LockTimeMax) {
        this.LockTimeMax = LockTimeMax;
    }

    /**
     * 获取最小锁等待时间
     * @return LockTimeMin 最小锁等待时间
     */
    public Float getLockTimeMin() {
        return this.LockTimeMin;
    }

    /**
     * 设置最小锁等待时间
     * @param LockTimeMin 最小锁等待时间
     */
    public void setLockTimeMin(Float LockTimeMin) {
        this.LockTimeMin = LockTimeMin;
    }

    /**
     * 获取总扫描行数
     * @return RowsExamined 总扫描行数
     */
    public Long getRowsExamined() {
        return this.RowsExamined;
    }

    /**
     * 设置总扫描行数
     * @param RowsExamined 总扫描行数
     */
    public void setRowsExamined(Long RowsExamined) {
        this.RowsExamined = RowsExamined;
    }

    /**
     * 获取最大扫描行数
     * @return RowsExaminedMax 最大扫描行数
     */
    public Long getRowsExaminedMax() {
        return this.RowsExaminedMax;
    }

    /**
     * 设置最大扫描行数
     * @param RowsExaminedMax 最大扫描行数
     */
    public void setRowsExaminedMax(Long RowsExaminedMax) {
        this.RowsExaminedMax = RowsExaminedMax;
    }

    /**
     * 获取最小扫描行数
     * @return RowsExaminedMin 最小扫描行数
     */
    public Long getRowsExaminedMin() {
        return this.RowsExaminedMin;
    }

    /**
     * 设置最小扫描行数
     * @param RowsExaminedMin 最小扫描行数
     */
    public void setRowsExaminedMin(Long RowsExaminedMin) {
        this.RowsExaminedMin = RowsExaminedMin;
    }

    /**
     * 获取总耗时
     * @return QueryTime 总耗时
     */
    public Float getQueryTime() {
        return this.QueryTime;
    }

    /**
     * 设置总耗时
     * @param QueryTime 总耗时
     */
    public void setQueryTime(Float QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * 获取最大执行时间
     * @return QueryTimeMax 最大执行时间
     */
    public Float getQueryTimeMax() {
        return this.QueryTimeMax;
    }

    /**
     * 设置最大执行时间
     * @param QueryTimeMax 最大执行时间
     */
    public void setQueryTimeMax(Float QueryTimeMax) {
        this.QueryTimeMax = QueryTimeMax;
    }

    /**
     * 获取最小执行时间
     * @return QueryTimeMin 最小执行时间
     */
    public Float getQueryTimeMin() {
        return this.QueryTimeMin;
    }

    /**
     * 设置最小执行时间
     * @param QueryTimeMin 最小执行时间
     */
    public void setQueryTimeMin(Float QueryTimeMin) {
        this.QueryTimeMin = QueryTimeMin;
    }

    /**
     * 获取总返回行数
     * @return RowsSent 总返回行数
     */
    public Long getRowsSent() {
        return this.RowsSent;
    }

    /**
     * 设置总返回行数
     * @param RowsSent 总返回行数
     */
    public void setRowsSent(Long RowsSent) {
        this.RowsSent = RowsSent;
    }

    /**
     * 获取最大返回行数
     * @return RowsSentMax 最大返回行数
     */
    public Long getRowsSentMax() {
        return this.RowsSentMax;
    }

    /**
     * 设置最大返回行数
     * @param RowsSentMax 最大返回行数
     */
    public void setRowsSentMax(Long RowsSentMax) {
        this.RowsSentMax = RowsSentMax;
    }

    /**
     * 获取最小返回行数
     * @return RowsSentMin 最小返回行数
     */
    public Long getRowsSentMin() {
        return this.RowsSentMin;
    }

    /**
     * 设置最小返回行数
     * @param RowsSentMin 最小返回行数
     */
    public void setRowsSentMin(Long RowsSentMin) {
        this.RowsSentMin = RowsSentMin;
    }

    /**
     * 获取执行次数
     * @return ExecTimes 执行次数
     */
    public Long getExecTimes() {
        return this.ExecTimes;
    }

    /**
     * 设置执行次数
     * @param ExecTimes 执行次数
     */
    public void setExecTimes(Long ExecTimes) {
        this.ExecTimes = ExecTimes;
    }

    /**
     * 获取sql模板
     * @return SqlTemplate sql模板
     */
    public String getSqlTemplate() {
        return this.SqlTemplate;
    }

    /**
     * 设置sql模板
     * @param SqlTemplate sql模板
     */
    public void setSqlTemplate(String SqlTemplate) {
        this.SqlTemplate = SqlTemplate;
    }

    /**
     * 获取带参数SQL（随机）
     * @return SqlText 带参数SQL（随机）
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * 设置带参数SQL（随机）
     * @param SqlText 带参数SQL（随机）
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * 获取schema
     * @return Schema schema
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * 设置schema
     * @param Schema schema
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * 获取总耗时占比
     * @return QueryTimeRatio 总耗时占比
     */
    public Float getQueryTimeRatio() {
        return this.QueryTimeRatio;
    }

    /**
     * 设置总耗时占比
     * @param QueryTimeRatio 总耗时占比
     */
    public void setQueryTimeRatio(Float QueryTimeRatio) {
        this.QueryTimeRatio = QueryTimeRatio;
    }

    /**
     * 获取sql总锁等待时间占比
     * @return LockTimeRatio sql总锁等待时间占比
     */
    public Float getLockTimeRatio() {
        return this.LockTimeRatio;
    }

    /**
     * 设置sql总锁等待时间占比
     * @param LockTimeRatio sql总锁等待时间占比
     */
    public void setLockTimeRatio(Float LockTimeRatio) {
        this.LockTimeRatio = LockTimeRatio;
    }

    /**
     * 获取总扫描行数占比
     * @return RowsExaminedRatio 总扫描行数占比
     */
    public Float getRowsExaminedRatio() {
        return this.RowsExaminedRatio;
    }

    /**
     * 设置总扫描行数占比
     * @param RowsExaminedRatio 总扫描行数占比
     */
    public void setRowsExaminedRatio(Float RowsExaminedRatio) {
        this.RowsExaminedRatio = RowsExaminedRatio;
    }

    /**
     * 获取总返回行数占比
     * @return RowsSentRatio 总返回行数占比
     */
    public Float getRowsSentRatio() {
        return this.RowsSentRatio;
    }

    /**
     * 设置总返回行数占比
     * @param RowsSentRatio 总返回行数占比
     */
    public void setRowsSentRatio(Float RowsSentRatio) {
        this.RowsSentRatio = RowsSentRatio;
    }

    /**
     * 内部实现，用户禁止调用
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

