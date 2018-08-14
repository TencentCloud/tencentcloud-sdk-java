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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NormalQueryItem  extends AbstractModel{

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 调用次数
    */
    @SerializedName("Calls")
    @Expose
    private Integer Calls;

    /**
    * 粒度点
    */
    @SerializedName("CallsGrids")
    @Expose
    private Integer [] CallsGrids;

    /**
    * 花费总时间
    */
    @SerializedName("CostTime")
    @Expose
    private Float CostTime;

    /**
    * 影响的行数
    */
    @SerializedName("Rows")
    @Expose
    private Integer Rows;

    /**
    * 花费最小时间
    */
    @SerializedName("MinCostTime")
    @Expose
    private Float MinCostTime;

    /**
    * 花费最大时间
    */
    @SerializedName("MaxCostTime")
    @Expose
    private Float MaxCostTime;

    /**
    * 最早一条慢SQL时间
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * 最晚一条慢SQL时间
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * 读共享内存块数
    */
    @SerializedName("SharedReadBlks")
    @Expose
    private Integer SharedReadBlks;

    /**
    * 写共享内存块数
    */
    @SerializedName("SharedWriteBlks")
    @Expose
    private Integer SharedWriteBlks;

    /**
    * 读io总耗时
    */
    @SerializedName("ReadCostTime")
    @Expose
    private Integer ReadCostTime;

    /**
    * 写io总耗时
    */
    @SerializedName("WriteCostTime")
    @Expose
    private Integer WriteCostTime;

    /**
    * 数据库名字
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 脱敏后的慢SQL
    */
    @SerializedName("NormalQuery")
    @Expose
    private String NormalQuery;

    /**
     * 获取用户名
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * 设置用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * 获取调用次数
     * @return Calls 调用次数
     */
    public Integer getCalls() {
        return this.Calls;
    }

    /**
     * 设置调用次数
     * @param Calls 调用次数
     */
    public void setCalls(Integer Calls) {
        this.Calls = Calls;
    }

    /**
     * 获取粒度点
     * @return CallsGrids 粒度点
     */
    public Integer [] getCallsGrids() {
        return this.CallsGrids;
    }

    /**
     * 设置粒度点
     * @param CallsGrids 粒度点
     */
    public void setCallsGrids(Integer [] CallsGrids) {
        this.CallsGrids = CallsGrids;
    }

    /**
     * 获取花费总时间
     * @return CostTime 花费总时间
     */
    public Float getCostTime() {
        return this.CostTime;
    }

    /**
     * 设置花费总时间
     * @param CostTime 花费总时间
     */
    public void setCostTime(Float CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * 获取影响的行数
     * @return Rows 影响的行数
     */
    public Integer getRows() {
        return this.Rows;
    }

    /**
     * 设置影响的行数
     * @param Rows 影响的行数
     */
    public void setRows(Integer Rows) {
        this.Rows = Rows;
    }

    /**
     * 获取花费最小时间
     * @return MinCostTime 花费最小时间
     */
    public Float getMinCostTime() {
        return this.MinCostTime;
    }

    /**
     * 设置花费最小时间
     * @param MinCostTime 花费最小时间
     */
    public void setMinCostTime(Float MinCostTime) {
        this.MinCostTime = MinCostTime;
    }

    /**
     * 获取花费最大时间
     * @return MaxCostTime 花费最大时间
     */
    public Float getMaxCostTime() {
        return this.MaxCostTime;
    }

    /**
     * 设置花费最大时间
     * @param MaxCostTime 花费最大时间
     */
    public void setMaxCostTime(Float MaxCostTime) {
        this.MaxCostTime = MaxCostTime;
    }

    /**
     * 获取最早一条慢SQL时间
     * @return FirstTime 最早一条慢SQL时间
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * 设置最早一条慢SQL时间
     * @param FirstTime 最早一条慢SQL时间
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * 获取最晚一条慢SQL时间
     * @return LastTime 最晚一条慢SQL时间
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * 设置最晚一条慢SQL时间
     * @param LastTime 最晚一条慢SQL时间
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * 获取读共享内存块数
     * @return SharedReadBlks 读共享内存块数
     */
    public Integer getSharedReadBlks() {
        return this.SharedReadBlks;
    }

    /**
     * 设置读共享内存块数
     * @param SharedReadBlks 读共享内存块数
     */
    public void setSharedReadBlks(Integer SharedReadBlks) {
        this.SharedReadBlks = SharedReadBlks;
    }

    /**
     * 获取写共享内存块数
     * @return SharedWriteBlks 写共享内存块数
     */
    public Integer getSharedWriteBlks() {
        return this.SharedWriteBlks;
    }

    /**
     * 设置写共享内存块数
     * @param SharedWriteBlks 写共享内存块数
     */
    public void setSharedWriteBlks(Integer SharedWriteBlks) {
        this.SharedWriteBlks = SharedWriteBlks;
    }

    /**
     * 获取读io总耗时
     * @return ReadCostTime 读io总耗时
     */
    public Integer getReadCostTime() {
        return this.ReadCostTime;
    }

    /**
     * 设置读io总耗时
     * @param ReadCostTime 读io总耗时
     */
    public void setReadCostTime(Integer ReadCostTime) {
        this.ReadCostTime = ReadCostTime;
    }

    /**
     * 获取写io总耗时
     * @return WriteCostTime 写io总耗时
     */
    public Integer getWriteCostTime() {
        return this.WriteCostTime;
    }

    /**
     * 设置写io总耗时
     * @param WriteCostTime 写io总耗时
     */
    public void setWriteCostTime(Integer WriteCostTime) {
        this.WriteCostTime = WriteCostTime;
    }

    /**
     * 获取数据库名字
     * @return DatabaseName 数据库名字
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * 设置数据库名字
     * @param DatabaseName 数据库名字
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * 获取脱敏后的慢SQL
     * @return NormalQuery 脱敏后的慢SQL
     */
    public String getNormalQuery() {
        return this.NormalQuery;
    }

    /**
     * 设置脱敏后的慢SQL
     * @param NormalQuery 脱敏后的慢SQL
     */
    public void setNormalQuery(String NormalQuery) {
        this.NormalQuery = NormalQuery;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Calls", this.Calls);
        this.setParamArraySimple(map, prefix + "CallsGrids.", this.CallsGrids);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "Rows", this.Rows);
        this.setParamSimple(map, prefix + "MinCostTime", this.MinCostTime);
        this.setParamSimple(map, prefix + "MaxCostTime", this.MaxCostTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "SharedReadBlks", this.SharedReadBlks);
        this.setParamSimple(map, prefix + "SharedWriteBlks", this.SharedWriteBlks);
        this.setParamSimple(map, prefix + "ReadCostTime", this.ReadCostTime);
        this.setParamSimple(map, prefix + "WriteCostTime", this.WriteCostTime);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "NormalQuery", this.NormalQuery);

    }
}

