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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NormQueryItem extends AbstractModel {

    /**
    * 调用次数
    */
    @SerializedName("CallTimes")
    @Expose
    private Long CallTimes;

    /**
    * 读共享内存块数
    */
    @SerializedName("SharedReadBlocks")
    @Expose
    private Long SharedReadBlocks;

    /**
    * 写共享内存块数
    */
    @SerializedName("SharedWriteBlocks")
    @Expose
    private Long SharedWriteBlocks;

    /**
    * 数据库
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 脱敏后语句
    */
    @SerializedName("NormalQuery")
    @Expose
    private String NormalQuery;

    /**
    * 执行时间最长的语句
    */
    @SerializedName("MaxElapsedQuery")
    @Expose
    private String MaxElapsedQuery;

    /**
    * 花费总时间
    */
    @SerializedName("CostTime")
    @Expose
    private Float CostTime;

    /**
    * 客户端ip
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 总次数占比
    */
    @SerializedName("TotalCallTimesPercent")
    @Expose
    private Float TotalCallTimesPercent;

    /**
    * 总耗时占比
    */
    @SerializedName("TotalCostTimePercent")
    @Expose
    private Float TotalCostTimePercent;

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
    * 最早一条时间
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * 最晚一条时间
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * 读io总耗时
    */
    @SerializedName("ReadCostTime")
    @Expose
    private Float ReadCostTime;

    /**
    * 写io总耗时
    */
    @SerializedName("WriteCostTime")
    @Expose
    private Float WriteCostTime;

    /**
     * Get 调用次数 
     * @return CallTimes 调用次数
     */
    public Long getCallTimes() {
        return this.CallTimes;
    }

    /**
     * Set 调用次数
     * @param CallTimes 调用次数
     */
    public void setCallTimes(Long CallTimes) {
        this.CallTimes = CallTimes;
    }

    /**
     * Get 读共享内存块数 
     * @return SharedReadBlocks 读共享内存块数
     */
    public Long getSharedReadBlocks() {
        return this.SharedReadBlocks;
    }

    /**
     * Set 读共享内存块数
     * @param SharedReadBlocks 读共享内存块数
     */
    public void setSharedReadBlocks(Long SharedReadBlocks) {
        this.SharedReadBlocks = SharedReadBlocks;
    }

    /**
     * Get 写共享内存块数 
     * @return SharedWriteBlocks 写共享内存块数
     */
    public Long getSharedWriteBlocks() {
        return this.SharedWriteBlocks;
    }

    /**
     * Set 写共享内存块数
     * @param SharedWriteBlocks 写共享内存块数
     */
    public void setSharedWriteBlocks(Long SharedWriteBlocks) {
        this.SharedWriteBlocks = SharedWriteBlocks;
    }

    /**
     * Get 数据库 
     * @return DatabaseName 数据库
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库
     * @param DatabaseName 数据库
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 脱敏后语句 
     * @return NormalQuery 脱敏后语句
     */
    public String getNormalQuery() {
        return this.NormalQuery;
    }

    /**
     * Set 脱敏后语句
     * @param NormalQuery 脱敏后语句
     */
    public void setNormalQuery(String NormalQuery) {
        this.NormalQuery = NormalQuery;
    }

    /**
     * Get 执行时间最长的语句 
     * @return MaxElapsedQuery 执行时间最长的语句
     */
    public String getMaxElapsedQuery() {
        return this.MaxElapsedQuery;
    }

    /**
     * Set 执行时间最长的语句
     * @param MaxElapsedQuery 执行时间最长的语句
     */
    public void setMaxElapsedQuery(String MaxElapsedQuery) {
        this.MaxElapsedQuery = MaxElapsedQuery;
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
     * Get 客户端ip 
     * @return ClientIp 客户端ip
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 客户端ip
     * @param ClientIp 客户端ip
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

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
     * Get 总次数占比 
     * @return TotalCallTimesPercent 总次数占比
     */
    public Float getTotalCallTimesPercent() {
        return this.TotalCallTimesPercent;
    }

    /**
     * Set 总次数占比
     * @param TotalCallTimesPercent 总次数占比
     */
    public void setTotalCallTimesPercent(Float TotalCallTimesPercent) {
        this.TotalCallTimesPercent = TotalCallTimesPercent;
    }

    /**
     * Get 总耗时占比 
     * @return TotalCostTimePercent 总耗时占比
     */
    public Float getTotalCostTimePercent() {
        return this.TotalCostTimePercent;
    }

    /**
     * Set 总耗时占比
     * @param TotalCostTimePercent 总耗时占比
     */
    public void setTotalCostTimePercent(Float TotalCostTimePercent) {
        this.TotalCostTimePercent = TotalCostTimePercent;
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
     * Get 最早一条时间 
     * @return FirstTime 最早一条时间
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set 最早一条时间
     * @param FirstTime 最早一条时间
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get 最晚一条时间 
     * @return LastTime 最晚一条时间
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set 最晚一条时间
     * @param LastTime 最晚一条时间
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get 读io总耗时 
     * @return ReadCostTime 读io总耗时
     */
    public Float getReadCostTime() {
        return this.ReadCostTime;
    }

    /**
     * Set 读io总耗时
     * @param ReadCostTime 读io总耗时
     */
    public void setReadCostTime(Float ReadCostTime) {
        this.ReadCostTime = ReadCostTime;
    }

    /**
     * Get 写io总耗时 
     * @return WriteCostTime 写io总耗时
     */
    public Float getWriteCostTime() {
        return this.WriteCostTime;
    }

    /**
     * Set 写io总耗时
     * @param WriteCostTime 写io总耗时
     */
    public void setWriteCostTime(Float WriteCostTime) {
        this.WriteCostTime = WriteCostTime;
    }

    public NormQueryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NormQueryItem(NormQueryItem source) {
        if (source.CallTimes != null) {
            this.CallTimes = new Long(source.CallTimes);
        }
        if (source.SharedReadBlocks != null) {
            this.SharedReadBlocks = new Long(source.SharedReadBlocks);
        }
        if (source.SharedWriteBlocks != null) {
            this.SharedWriteBlocks = new Long(source.SharedWriteBlocks);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.NormalQuery != null) {
            this.NormalQuery = new String(source.NormalQuery);
        }
        if (source.MaxElapsedQuery != null) {
            this.MaxElapsedQuery = new String(source.MaxElapsedQuery);
        }
        if (source.CostTime != null) {
            this.CostTime = new Float(source.CostTime);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.TotalCallTimesPercent != null) {
            this.TotalCallTimesPercent = new Float(source.TotalCallTimesPercent);
        }
        if (source.TotalCostTimePercent != null) {
            this.TotalCostTimePercent = new Float(source.TotalCostTimePercent);
        }
        if (source.MinCostTime != null) {
            this.MinCostTime = new Float(source.MinCostTime);
        }
        if (source.MaxCostTime != null) {
            this.MaxCostTime = new Float(source.MaxCostTime);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.ReadCostTime != null) {
            this.ReadCostTime = new Float(source.ReadCostTime);
        }
        if (source.WriteCostTime != null) {
            this.WriteCostTime = new Float(source.WriteCostTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallTimes", this.CallTimes);
        this.setParamSimple(map, prefix + "SharedReadBlocks", this.SharedReadBlocks);
        this.setParamSimple(map, prefix + "SharedWriteBlocks", this.SharedWriteBlocks);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "NormalQuery", this.NormalQuery);
        this.setParamSimple(map, prefix + "MaxElapsedQuery", this.MaxElapsedQuery);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "TotalCallTimesPercent", this.TotalCallTimesPercent);
        this.setParamSimple(map, prefix + "TotalCostTimePercent", this.TotalCostTimePercent);
        this.setParamSimple(map, prefix + "MinCostTime", this.MinCostTime);
        this.setParamSimple(map, prefix + "MaxCostTime", this.MaxCostTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "ReadCostTime", this.ReadCostTime);
        this.setParamSimple(map, prefix + "WriteCostTime", this.WriteCostTime);

    }
}

