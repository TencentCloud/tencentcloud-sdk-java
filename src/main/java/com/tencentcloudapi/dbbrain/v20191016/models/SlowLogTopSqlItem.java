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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogTopSqlItem extends AbstractModel {

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
    * 数据库名
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
    * 平均执行时间
    */
    @SerializedName("QueryTimeAvg")
    @Expose
    private Float QueryTimeAvg;

    /**
    * 平均返回行数
    */
    @SerializedName("RowsSentAvg")
    @Expose
    private Float RowsSentAvg;

    /**
    * 平均锁等待时间
    */
    @SerializedName("LockTimeAvg")
    @Expose
    private Float LockTimeAvg;

    /**
    * 平均扫描行数
    */
    @SerializedName("RowsExaminedAvg")
    @Expose
    private Float RowsExaminedAvg;

    /**
    * SQL模板的MD5值
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

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
     * Get 数据库名 
     * @return Schema 数据库名
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set 数据库名
     * @param Schema 数据库名
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
     * Get 平均执行时间 
     * @return QueryTimeAvg 平均执行时间
     */
    public Float getQueryTimeAvg() {
        return this.QueryTimeAvg;
    }

    /**
     * Set 平均执行时间
     * @param QueryTimeAvg 平均执行时间
     */
    public void setQueryTimeAvg(Float QueryTimeAvg) {
        this.QueryTimeAvg = QueryTimeAvg;
    }

    /**
     * Get 平均返回行数 
     * @return RowsSentAvg 平均返回行数
     */
    public Float getRowsSentAvg() {
        return this.RowsSentAvg;
    }

    /**
     * Set 平均返回行数
     * @param RowsSentAvg 平均返回行数
     */
    public void setRowsSentAvg(Float RowsSentAvg) {
        this.RowsSentAvg = RowsSentAvg;
    }

    /**
     * Get 平均锁等待时间 
     * @return LockTimeAvg 平均锁等待时间
     */
    public Float getLockTimeAvg() {
        return this.LockTimeAvg;
    }

    /**
     * Set 平均锁等待时间
     * @param LockTimeAvg 平均锁等待时间
     */
    public void setLockTimeAvg(Float LockTimeAvg) {
        this.LockTimeAvg = LockTimeAvg;
    }

    /**
     * Get 平均扫描行数 
     * @return RowsExaminedAvg 平均扫描行数
     */
    public Float getRowsExaminedAvg() {
        return this.RowsExaminedAvg;
    }

    /**
     * Set 平均扫描行数
     * @param RowsExaminedAvg 平均扫描行数
     */
    public void setRowsExaminedAvg(Float RowsExaminedAvg) {
        this.RowsExaminedAvg = RowsExaminedAvg;
    }

    /**
     * Get SQL模板的MD5值 
     * @return Md5 SQL模板的MD5值
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set SQL模板的MD5值
     * @param Md5 SQL模板的MD5值
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    public SlowLogTopSqlItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowLogTopSqlItem(SlowLogTopSqlItem source) {
        if (source.LockTime != null) {
            this.LockTime = new Float(source.LockTime);
        }
        if (source.LockTimeMax != null) {
            this.LockTimeMax = new Float(source.LockTimeMax);
        }
        if (source.LockTimeMin != null) {
            this.LockTimeMin = new Float(source.LockTimeMin);
        }
        if (source.RowsExamined != null) {
            this.RowsExamined = new Long(source.RowsExamined);
        }
        if (source.RowsExaminedMax != null) {
            this.RowsExaminedMax = new Long(source.RowsExaminedMax);
        }
        if (source.RowsExaminedMin != null) {
            this.RowsExaminedMin = new Long(source.RowsExaminedMin);
        }
        if (source.QueryTime != null) {
            this.QueryTime = new Float(source.QueryTime);
        }
        if (source.QueryTimeMax != null) {
            this.QueryTimeMax = new Float(source.QueryTimeMax);
        }
        if (source.QueryTimeMin != null) {
            this.QueryTimeMin = new Float(source.QueryTimeMin);
        }
        if (source.RowsSent != null) {
            this.RowsSent = new Long(source.RowsSent);
        }
        if (source.RowsSentMax != null) {
            this.RowsSentMax = new Long(source.RowsSentMax);
        }
        if (source.RowsSentMin != null) {
            this.RowsSentMin = new Long(source.RowsSentMin);
        }
        if (source.ExecTimes != null) {
            this.ExecTimes = new Long(source.ExecTimes);
        }
        if (source.SqlTemplate != null) {
            this.SqlTemplate = new String(source.SqlTemplate);
        }
        if (source.SqlText != null) {
            this.SqlText = new String(source.SqlText);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.QueryTimeRatio != null) {
            this.QueryTimeRatio = new Float(source.QueryTimeRatio);
        }
        if (source.LockTimeRatio != null) {
            this.LockTimeRatio = new Float(source.LockTimeRatio);
        }
        if (source.RowsExaminedRatio != null) {
            this.RowsExaminedRatio = new Float(source.RowsExaminedRatio);
        }
        if (source.RowsSentRatio != null) {
            this.RowsSentRatio = new Float(source.RowsSentRatio);
        }
        if (source.QueryTimeAvg != null) {
            this.QueryTimeAvg = new Float(source.QueryTimeAvg);
        }
        if (source.RowsSentAvg != null) {
            this.RowsSentAvg = new Float(source.RowsSentAvg);
        }
        if (source.LockTimeAvg != null) {
            this.LockTimeAvg = new Float(source.LockTimeAvg);
        }
        if (source.RowsExaminedAvg != null) {
            this.RowsExaminedAvg = new Float(source.RowsExaminedAvg);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
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
        this.setParamSimple(map, prefix + "QueryTimeAvg", this.QueryTimeAvg);
        this.setParamSimple(map, prefix + "RowsSentAvg", this.RowsSentAvg);
        this.setParamSimple(map, prefix + "LockTimeAvg", this.LockTimeAvg);
        this.setParamSimple(map, prefix + "RowsExaminedAvg", this.RowsExaminedAvg);
        this.setParamSimple(map, prefix + "Md5", this.Md5);

    }
}

