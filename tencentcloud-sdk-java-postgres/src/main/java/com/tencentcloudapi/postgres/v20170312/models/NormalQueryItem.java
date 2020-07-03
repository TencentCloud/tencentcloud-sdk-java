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

public class NormalQueryItem extends AbstractModel{

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
    private Long Calls;

    /**
    * 粒度点
    */
    @SerializedName("CallsGrids")
    @Expose
    private Long [] CallsGrids;

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
    private Long Rows;

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
    private Long SharedReadBlks;

    /**
    * 写共享内存块数
    */
    @SerializedName("SharedWriteBlks")
    @Expose
    private Long SharedWriteBlks;

    /**
    * 读io总耗时
    */
    @SerializedName("ReadCostTime")
    @Expose
    private Long ReadCostTime;

    /**
    * 写io总耗时
    */
    @SerializedName("WriteCostTime")
    @Expose
    private Long WriteCostTime;

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
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 调用次数 
     * @return Calls 调用次数
     */
    public Long getCalls() {
        return this.Calls;
    }

    /**
     * Set 调用次数
     * @param Calls 调用次数
     */
    public void setCalls(Long Calls) {
        this.Calls = Calls;
    }

    /**
     * Get 粒度点 
     * @return CallsGrids 粒度点
     */
    public Long [] getCallsGrids() {
        return this.CallsGrids;
    }

    /**
     * Set 粒度点
     * @param CallsGrids 粒度点
     */
    public void setCallsGrids(Long [] CallsGrids) {
        this.CallsGrids = CallsGrids;
    }

    /**
     * Get 花费总时间 
     * @return CostTime 花费总时间
     */
    public Float getCostTime() {
        return this.CostTime;
    }

    /**
     * Set 花费总时间
     * @param CostTime 花费总时间
     */
    public void setCostTime(Float CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get 影响的行数 
     * @return Rows 影响的行数
     */
    public Long getRows() {
        return this.Rows;
    }

    /**
     * Set 影响的行数
     * @param Rows 影响的行数
     */
    public void setRows(Long Rows) {
        this.Rows = Rows;
    }

    /**
     * Get 花费最小时间 
     * @return MinCostTime 花费最小时间
     */
    public Float getMinCostTime() {
        return this.MinCostTime;
    }

    /**
     * Set 花费最小时间
     * @param MinCostTime 花费最小时间
     */
    public void setMinCostTime(Float MinCostTime) {
        this.MinCostTime = MinCostTime;
    }

    /**
     * Get 花费最大时间 
     * @return MaxCostTime 花费最大时间
     */
    public Float getMaxCostTime() {
        return this.MaxCostTime;
    }

    /**
     * Set 花费最大时间
     * @param MaxCostTime 花费最大时间
     */
    public void setMaxCostTime(Float MaxCostTime) {
        this.MaxCostTime = MaxCostTime;
    }

    /**
     * Get 最早一条慢SQL时间 
     * @return FirstTime 最早一条慢SQL时间
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set 最早一条慢SQL时间
     * @param FirstTime 最早一条慢SQL时间
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get 最晚一条慢SQL时间 
     * @return LastTime 最晚一条慢SQL时间
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set 最晚一条慢SQL时间
     * @param LastTime 最晚一条慢SQL时间
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get 读共享内存块数 
     * @return SharedReadBlks 读共享内存块数
     */
    public Long getSharedReadBlks() {
        return this.SharedReadBlks;
    }

    /**
     * Set 读共享内存块数
     * @param SharedReadBlks 读共享内存块数
     */
    public void setSharedReadBlks(Long SharedReadBlks) {
        this.SharedReadBlks = SharedReadBlks;
    }

    /**
     * Get 写共享内存块数 
     * @return SharedWriteBlks 写共享内存块数
     */
    public Long getSharedWriteBlks() {
        return this.SharedWriteBlks;
    }

    /**
     * Set 写共享内存块数
     * @param SharedWriteBlks 写共享内存块数
     */
    public void setSharedWriteBlks(Long SharedWriteBlks) {
        this.SharedWriteBlks = SharedWriteBlks;
    }

    /**
     * Get 读io总耗时 
     * @return ReadCostTime 读io总耗时
     */
    public Long getReadCostTime() {
        return this.ReadCostTime;
    }

    /**
     * Set 读io总耗时
     * @param ReadCostTime 读io总耗时
     */
    public void setReadCostTime(Long ReadCostTime) {
        this.ReadCostTime = ReadCostTime;
    }

    /**
     * Get 写io总耗时 
     * @return WriteCostTime 写io总耗时
     */
    public Long getWriteCostTime() {
        return this.WriteCostTime;
    }

    /**
     * Set 写io总耗时
     * @param WriteCostTime 写io总耗时
     */
    public void setWriteCostTime(Long WriteCostTime) {
        this.WriteCostTime = WriteCostTime;
    }

    /**
     * Get 数据库名字 
     * @return DatabaseName 数据库名字
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名字
     * @param DatabaseName 数据库名字
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 脱敏后的慢SQL 
     * @return NormalQuery 脱敏后的慢SQL
     */
    public String getNormalQuery() {
        return this.NormalQuery;
    }

    /**
     * Set 脱敏后的慢SQL
     * @param NormalQuery 脱敏后的慢SQL
     */
    public void setNormalQuery(String NormalQuery) {
        this.NormalQuery = NormalQuery;
    }

    /**
     * Internal implementation, normal users should not use it.
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

