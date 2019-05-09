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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogData  extends AbstractModel{

    /**
    * 语句校验和，用于查询详情
    */
    @SerializedName("CheckSum")
    @Expose
    private String CheckSum;

    /**
    * 数据库名称
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * 抽象的SQL语句
    */
    @SerializedName("FingerPrint")
    @Expose
    private String FingerPrint;

    /**
    * 平均的锁时间
    */
    @SerializedName("LockTimeAvg")
    @Expose
    private String LockTimeAvg;

    /**
    * 最大锁时间
    */
    @SerializedName("LockTimeMax")
    @Expose
    private String LockTimeMax;

    /**
    * 最小锁时间
    */
    @SerializedName("LockTimeMin")
    @Expose
    private String LockTimeMin;

    /**
    * 锁时间总和
    */
    @SerializedName("LockTimeSum")
    @Expose
    private String LockTimeSum;

    /**
    * 查询次数
    */
    @SerializedName("QueryCount")
    @Expose
    private String QueryCount;

    /**
    * 平均查询时间
    */
    @SerializedName("QueryTimeAvg")
    @Expose
    private String QueryTimeAvg;

    /**
    * 最大查询时间
    */
    @SerializedName("QueryTimeMax")
    @Expose
    private String QueryTimeMax;

    /**
    * 最小查询时间
    */
    @SerializedName("QueryTimeMin")
    @Expose
    private String QueryTimeMin;

    /**
    * 查询时间总和
    */
    @SerializedName("QueryTimeSum")
    @Expose
    private String QueryTimeSum;

    /**
    * 扫描行数
    */
    @SerializedName("RowsExaminedSum")
    @Expose
    private String RowsExaminedSum;

    /**
    * 发送行数
    */
    @SerializedName("RowsSentSum")
    @Expose
    private String RowsSentSum;

    /**
    * 最后执行时间
    */
    @SerializedName("TsMax")
    @Expose
    private String TsMax;

    /**
    * 首次执行时间
    */
    @SerializedName("TsMin")
    @Expose
    private String TsMin;

    /**
    * 帐号
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
     * 获取语句校验和，用于查询详情
     * @return CheckSum 语句校验和，用于查询详情
     */
    public String getCheckSum() {
        return this.CheckSum;
    }

    /**
     * 设置语句校验和，用于查询详情
     * @param CheckSum 语句校验和，用于查询详情
     */
    public void setCheckSum(String CheckSum) {
        this.CheckSum = CheckSum;
    }

    /**
     * 获取数据库名称
     * @return Db 数据库名称
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * 设置数据库名称
     * @param Db 数据库名称
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * 获取抽象的SQL语句
     * @return FingerPrint 抽象的SQL语句
     */
    public String getFingerPrint() {
        return this.FingerPrint;
    }

    /**
     * 设置抽象的SQL语句
     * @param FingerPrint 抽象的SQL语句
     */
    public void setFingerPrint(String FingerPrint) {
        this.FingerPrint = FingerPrint;
    }

    /**
     * 获取平均的锁时间
     * @return LockTimeAvg 平均的锁时间
     */
    public String getLockTimeAvg() {
        return this.LockTimeAvg;
    }

    /**
     * 设置平均的锁时间
     * @param LockTimeAvg 平均的锁时间
     */
    public void setLockTimeAvg(String LockTimeAvg) {
        this.LockTimeAvg = LockTimeAvg;
    }

    /**
     * 获取最大锁时间
     * @return LockTimeMax 最大锁时间
     */
    public String getLockTimeMax() {
        return this.LockTimeMax;
    }

    /**
     * 设置最大锁时间
     * @param LockTimeMax 最大锁时间
     */
    public void setLockTimeMax(String LockTimeMax) {
        this.LockTimeMax = LockTimeMax;
    }

    /**
     * 获取最小锁时间
     * @return LockTimeMin 最小锁时间
     */
    public String getLockTimeMin() {
        return this.LockTimeMin;
    }

    /**
     * 设置最小锁时间
     * @param LockTimeMin 最小锁时间
     */
    public void setLockTimeMin(String LockTimeMin) {
        this.LockTimeMin = LockTimeMin;
    }

    /**
     * 获取锁时间总和
     * @return LockTimeSum 锁时间总和
     */
    public String getLockTimeSum() {
        return this.LockTimeSum;
    }

    /**
     * 设置锁时间总和
     * @param LockTimeSum 锁时间总和
     */
    public void setLockTimeSum(String LockTimeSum) {
        this.LockTimeSum = LockTimeSum;
    }

    /**
     * 获取查询次数
     * @return QueryCount 查询次数
     */
    public String getQueryCount() {
        return this.QueryCount;
    }

    /**
     * 设置查询次数
     * @param QueryCount 查询次数
     */
    public void setQueryCount(String QueryCount) {
        this.QueryCount = QueryCount;
    }

    /**
     * 获取平均查询时间
     * @return QueryTimeAvg 平均查询时间
     */
    public String getQueryTimeAvg() {
        return this.QueryTimeAvg;
    }

    /**
     * 设置平均查询时间
     * @param QueryTimeAvg 平均查询时间
     */
    public void setQueryTimeAvg(String QueryTimeAvg) {
        this.QueryTimeAvg = QueryTimeAvg;
    }

    /**
     * 获取最大查询时间
     * @return QueryTimeMax 最大查询时间
     */
    public String getQueryTimeMax() {
        return this.QueryTimeMax;
    }

    /**
     * 设置最大查询时间
     * @param QueryTimeMax 最大查询时间
     */
    public void setQueryTimeMax(String QueryTimeMax) {
        this.QueryTimeMax = QueryTimeMax;
    }

    /**
     * 获取最小查询时间
     * @return QueryTimeMin 最小查询时间
     */
    public String getQueryTimeMin() {
        return this.QueryTimeMin;
    }

    /**
     * 设置最小查询时间
     * @param QueryTimeMin 最小查询时间
     */
    public void setQueryTimeMin(String QueryTimeMin) {
        this.QueryTimeMin = QueryTimeMin;
    }

    /**
     * 获取查询时间总和
     * @return QueryTimeSum 查询时间总和
     */
    public String getQueryTimeSum() {
        return this.QueryTimeSum;
    }

    /**
     * 设置查询时间总和
     * @param QueryTimeSum 查询时间总和
     */
    public void setQueryTimeSum(String QueryTimeSum) {
        this.QueryTimeSum = QueryTimeSum;
    }

    /**
     * 获取扫描行数
     * @return RowsExaminedSum 扫描行数
     */
    public String getRowsExaminedSum() {
        return this.RowsExaminedSum;
    }

    /**
     * 设置扫描行数
     * @param RowsExaminedSum 扫描行数
     */
    public void setRowsExaminedSum(String RowsExaminedSum) {
        this.RowsExaminedSum = RowsExaminedSum;
    }

    /**
     * 获取发送行数
     * @return RowsSentSum 发送行数
     */
    public String getRowsSentSum() {
        return this.RowsSentSum;
    }

    /**
     * 设置发送行数
     * @param RowsSentSum 发送行数
     */
    public void setRowsSentSum(String RowsSentSum) {
        this.RowsSentSum = RowsSentSum;
    }

    /**
     * 获取最后执行时间
     * @return TsMax 最后执行时间
     */
    public String getTsMax() {
        return this.TsMax;
    }

    /**
     * 设置最后执行时间
     * @param TsMax 最后执行时间
     */
    public void setTsMax(String TsMax) {
        this.TsMax = TsMax;
    }

    /**
     * 获取首次执行时间
     * @return TsMin 首次执行时间
     */
    public String getTsMin() {
        return this.TsMin;
    }

    /**
     * 设置首次执行时间
     * @param TsMin 首次执行时间
     */
    public void setTsMin(String TsMin) {
        this.TsMin = TsMin;
    }

    /**
     * 获取帐号
     * @return User 帐号
     */
    public String getUser() {
        return this.User;
    }

    /**
     * 设置帐号
     * @param User 帐号
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckSum", this.CheckSum);
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "FingerPrint", this.FingerPrint);
        this.setParamSimple(map, prefix + "LockTimeAvg", this.LockTimeAvg);
        this.setParamSimple(map, prefix + "LockTimeMax", this.LockTimeMax);
        this.setParamSimple(map, prefix + "LockTimeMin", this.LockTimeMin);
        this.setParamSimple(map, prefix + "LockTimeSum", this.LockTimeSum);
        this.setParamSimple(map, prefix + "QueryCount", this.QueryCount);
        this.setParamSimple(map, prefix + "QueryTimeAvg", this.QueryTimeAvg);
        this.setParamSimple(map, prefix + "QueryTimeMax", this.QueryTimeMax);
        this.setParamSimple(map, prefix + "QueryTimeMin", this.QueryTimeMin);
        this.setParamSimple(map, prefix + "QueryTimeSum", this.QueryTimeSum);
        this.setParamSimple(map, prefix + "RowsExaminedSum", this.RowsExaminedSum);
        this.setParamSimple(map, prefix + "RowsSentSum", this.RowsSentSum);
        this.setParamSimple(map, prefix + "TsMax", this.TsMax);
        this.setParamSimple(map, prefix + "TsMin", this.TsMin);
        this.setParamSimple(map, prefix + "User", this.User);

    }
}

