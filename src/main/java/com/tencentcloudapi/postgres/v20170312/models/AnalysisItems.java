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

public class AnalysisItems extends AbstractModel{

    /**
    * 慢SQL查询的数据库名
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 慢SQL执行的用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 抽象参数之后的慢SQL
    */
    @SerializedName("NormalQuery")
    @Expose
    private String NormalQuery;

    /**
    * 慢SQL执行的客户端地址
    */
    @SerializedName("ClientAddr")
    @Expose
    private String ClientAddr;

    /**
    * 在选定时间范围内慢SQL语句执行的次数
    */
    @SerializedName("CallNum")
    @Expose
    private Long CallNum;

    /**
    * 在选定时间范围内，慢SQL语句执行的次数占所有慢SQL的比例（小数返回）
    */
    @SerializedName("CallPercent")
    @Expose
    private Float CallPercent;

    /**
    * 在选定时间范围内，慢SQL执行的总时间
    */
    @SerializedName("CostTime")
    @Expose
    private Float CostTime;

    /**
    * 在选定时间范围内，慢SQL语句执行的总时间占所有慢SQL的比例（小数返回）
    */
    @SerializedName("CostPercent")
    @Expose
    private Float CostPercent;

    /**
    * 在选定时间范围内，慢SQL语句执行的耗时最短的时间（单位：ms）
    */
    @SerializedName("MinCostTime")
    @Expose
    private Float MinCostTime;

    /**
    * 在选定时间范围内，慢SQL语句执行的耗时最长的时间（单位：ms）
    */
    @SerializedName("MaxCostTime")
    @Expose
    private Float MaxCostTime;

    /**
    * 在选定时间范围内，慢SQL语句执行的耗时平均时间（单位：ms）
    */
    @SerializedName("AvgCostTime")
    @Expose
    private Float AvgCostTime;

    /**
    * 在选定时间范围内，慢SQL第一条开始执行的时间戳
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * 在选定时间范围内，慢SQL最后一条开始执行的时间戳
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
     * Get 慢SQL查询的数据库名 
     * @return DatabaseName 慢SQL查询的数据库名
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 慢SQL查询的数据库名
     * @param DatabaseName 慢SQL查询的数据库名
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 慢SQL执行的用户名 
     * @return UserName 慢SQL执行的用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 慢SQL执行的用户名
     * @param UserName 慢SQL执行的用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 抽象参数之后的慢SQL 
     * @return NormalQuery 抽象参数之后的慢SQL
     */
    public String getNormalQuery() {
        return this.NormalQuery;
    }

    /**
     * Set 抽象参数之后的慢SQL
     * @param NormalQuery 抽象参数之后的慢SQL
     */
    public void setNormalQuery(String NormalQuery) {
        this.NormalQuery = NormalQuery;
    }

    /**
     * Get 慢SQL执行的客户端地址 
     * @return ClientAddr 慢SQL执行的客户端地址
     */
    public String getClientAddr() {
        return this.ClientAddr;
    }

    /**
     * Set 慢SQL执行的客户端地址
     * @param ClientAddr 慢SQL执行的客户端地址
     */
    public void setClientAddr(String ClientAddr) {
        this.ClientAddr = ClientAddr;
    }

    /**
     * Get 在选定时间范围内慢SQL语句执行的次数 
     * @return CallNum 在选定时间范围内慢SQL语句执行的次数
     */
    public Long getCallNum() {
        return this.CallNum;
    }

    /**
     * Set 在选定时间范围内慢SQL语句执行的次数
     * @param CallNum 在选定时间范围内慢SQL语句执行的次数
     */
    public void setCallNum(Long CallNum) {
        this.CallNum = CallNum;
    }

    /**
     * Get 在选定时间范围内，慢SQL语句执行的次数占所有慢SQL的比例（小数返回） 
     * @return CallPercent 在选定时间范围内，慢SQL语句执行的次数占所有慢SQL的比例（小数返回）
     */
    public Float getCallPercent() {
        return this.CallPercent;
    }

    /**
     * Set 在选定时间范围内，慢SQL语句执行的次数占所有慢SQL的比例（小数返回）
     * @param CallPercent 在选定时间范围内，慢SQL语句执行的次数占所有慢SQL的比例（小数返回）
     */
    public void setCallPercent(Float CallPercent) {
        this.CallPercent = CallPercent;
    }

    /**
     * Get 在选定时间范围内，慢SQL执行的总时间 
     * @return CostTime 在选定时间范围内，慢SQL执行的总时间
     */
    public Float getCostTime() {
        return this.CostTime;
    }

    /**
     * Set 在选定时间范围内，慢SQL执行的总时间
     * @param CostTime 在选定时间范围内，慢SQL执行的总时间
     */
    public void setCostTime(Float CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get 在选定时间范围内，慢SQL语句执行的总时间占所有慢SQL的比例（小数返回） 
     * @return CostPercent 在选定时间范围内，慢SQL语句执行的总时间占所有慢SQL的比例（小数返回）
     */
    public Float getCostPercent() {
        return this.CostPercent;
    }

    /**
     * Set 在选定时间范围内，慢SQL语句执行的总时间占所有慢SQL的比例（小数返回）
     * @param CostPercent 在选定时间范围内，慢SQL语句执行的总时间占所有慢SQL的比例（小数返回）
     */
    public void setCostPercent(Float CostPercent) {
        this.CostPercent = CostPercent;
    }

    /**
     * Get 在选定时间范围内，慢SQL语句执行的耗时最短的时间（单位：ms） 
     * @return MinCostTime 在选定时间范围内，慢SQL语句执行的耗时最短的时间（单位：ms）
     */
    public Float getMinCostTime() {
        return this.MinCostTime;
    }

    /**
     * Set 在选定时间范围内，慢SQL语句执行的耗时最短的时间（单位：ms）
     * @param MinCostTime 在选定时间范围内，慢SQL语句执行的耗时最短的时间（单位：ms）
     */
    public void setMinCostTime(Float MinCostTime) {
        this.MinCostTime = MinCostTime;
    }

    /**
     * Get 在选定时间范围内，慢SQL语句执行的耗时最长的时间（单位：ms） 
     * @return MaxCostTime 在选定时间范围内，慢SQL语句执行的耗时最长的时间（单位：ms）
     */
    public Float getMaxCostTime() {
        return this.MaxCostTime;
    }

    /**
     * Set 在选定时间范围内，慢SQL语句执行的耗时最长的时间（单位：ms）
     * @param MaxCostTime 在选定时间范围内，慢SQL语句执行的耗时最长的时间（单位：ms）
     */
    public void setMaxCostTime(Float MaxCostTime) {
        this.MaxCostTime = MaxCostTime;
    }

    /**
     * Get 在选定时间范围内，慢SQL语句执行的耗时平均时间（单位：ms） 
     * @return AvgCostTime 在选定时间范围内，慢SQL语句执行的耗时平均时间（单位：ms）
     */
    public Float getAvgCostTime() {
        return this.AvgCostTime;
    }

    /**
     * Set 在选定时间范围内，慢SQL语句执行的耗时平均时间（单位：ms）
     * @param AvgCostTime 在选定时间范围内，慢SQL语句执行的耗时平均时间（单位：ms）
     */
    public void setAvgCostTime(Float AvgCostTime) {
        this.AvgCostTime = AvgCostTime;
    }

    /**
     * Get 在选定时间范围内，慢SQL第一条开始执行的时间戳 
     * @return FirstTime 在选定时间范围内，慢SQL第一条开始执行的时间戳
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set 在选定时间范围内，慢SQL第一条开始执行的时间戳
     * @param FirstTime 在选定时间范围内，慢SQL第一条开始执行的时间戳
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get 在选定时间范围内，慢SQL最后一条开始执行的时间戳 
     * @return LastTime 在选定时间范围内，慢SQL最后一条开始执行的时间戳
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set 在选定时间范围内，慢SQL最后一条开始执行的时间戳
     * @param LastTime 在选定时间范围内，慢SQL最后一条开始执行的时间戳
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    public AnalysisItems() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalysisItems(AnalysisItems source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.NormalQuery != null) {
            this.NormalQuery = new String(source.NormalQuery);
        }
        if (source.ClientAddr != null) {
            this.ClientAddr = new String(source.ClientAddr);
        }
        if (source.CallNum != null) {
            this.CallNum = new Long(source.CallNum);
        }
        if (source.CallPercent != null) {
            this.CallPercent = new Float(source.CallPercent);
        }
        if (source.CostTime != null) {
            this.CostTime = new Float(source.CostTime);
        }
        if (source.CostPercent != null) {
            this.CostPercent = new Float(source.CostPercent);
        }
        if (source.MinCostTime != null) {
            this.MinCostTime = new Float(source.MinCostTime);
        }
        if (source.MaxCostTime != null) {
            this.MaxCostTime = new Float(source.MaxCostTime);
        }
        if (source.AvgCostTime != null) {
            this.AvgCostTime = new Float(source.AvgCostTime);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "NormalQuery", this.NormalQuery);
        this.setParamSimple(map, prefix + "ClientAddr", this.ClientAddr);
        this.setParamSimple(map, prefix + "CallNum", this.CallNum);
        this.setParamSimple(map, prefix + "CallPercent", this.CallPercent);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "CostPercent", this.CostPercent);
        this.setParamSimple(map, prefix + "MinCostTime", this.MinCostTime);
        this.setParamSimple(map, prefix + "MaxCostTime", this.MaxCostTime);
        this.setParamSimple(map, prefix + "AvgCostTime", this.AvgCostTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);

    }
}

