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

public class SqlLogItem extends AbstractModel{

    /**
    * 本条日志在消息队列中的偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 执行本条sql的用户。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 执行本条sql的客户端IP+端口。
    */
    @SerializedName("Client")
    @Expose
    private String Client;

    /**
    * 数据库名称。
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 执行的sql语句。
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * 返回的数据行数。
    */
    @SerializedName("SelectRowNum")
    @Expose
    private Long SelectRowNum;

    /**
    * 影响行数。
    */
    @SerializedName("AffectRowNum")
    @Expose
    private Long AffectRowNum;

    /**
    * Sql执行时间戳。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Sql耗时，单位为毫秒。
    */
    @SerializedName("TimeCostMs")
    @Expose
    private Long TimeCostMs;

    /**
    * Sql返回码，0为成功。
    */
    @SerializedName("ResultCode")
    @Expose
    private Long ResultCode;

    /**
     * Get 本条日志在消息队列中的偏移量。 
     * @return Offset 本条日志在消息队列中的偏移量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 本条日志在消息队列中的偏移量。
     * @param Offset 本条日志在消息队列中的偏移量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 执行本条sql的用户。 
     * @return User 执行本条sql的用户。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 执行本条sql的用户。
     * @param User 执行本条sql的用户。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 执行本条sql的客户端IP+端口。 
     * @return Client 执行本条sql的客户端IP+端口。
     */
    public String getClient() {
        return this.Client;
    }

    /**
     * Set 执行本条sql的客户端IP+端口。
     * @param Client 执行本条sql的客户端IP+端口。
     */
    public void setClient(String Client) {
        this.Client = Client;
    }

    /**
     * Get 数据库名称。 
     * @return DbName 数据库名称。
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名称。
     * @param DbName 数据库名称。
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 执行的sql语句。 
     * @return Sql 执行的sql语句。
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set 执行的sql语句。
     * @param Sql 执行的sql语句。
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get 返回的数据行数。 
     * @return SelectRowNum 返回的数据行数。
     */
    public Long getSelectRowNum() {
        return this.SelectRowNum;
    }

    /**
     * Set 返回的数据行数。
     * @param SelectRowNum 返回的数据行数。
     */
    public void setSelectRowNum(Long SelectRowNum) {
        this.SelectRowNum = SelectRowNum;
    }

    /**
     * Get 影响行数。 
     * @return AffectRowNum 影响行数。
     */
    public Long getAffectRowNum() {
        return this.AffectRowNum;
    }

    /**
     * Set 影响行数。
     * @param AffectRowNum 影响行数。
     */
    public void setAffectRowNum(Long AffectRowNum) {
        this.AffectRowNum = AffectRowNum;
    }

    /**
     * Get Sql执行时间戳。 
     * @return Timestamp Sql执行时间戳。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Sql执行时间戳。
     * @param Timestamp Sql执行时间戳。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Sql耗时，单位为毫秒。 
     * @return TimeCostMs Sql耗时，单位为毫秒。
     */
    public Long getTimeCostMs() {
        return this.TimeCostMs;
    }

    /**
     * Set Sql耗时，单位为毫秒。
     * @param TimeCostMs Sql耗时，单位为毫秒。
     */
    public void setTimeCostMs(Long TimeCostMs) {
        this.TimeCostMs = TimeCostMs;
    }

    /**
     * Get Sql返回码，0为成功。 
     * @return ResultCode Sql返回码，0为成功。
     */
    public Long getResultCode() {
        return this.ResultCode;
    }

    /**
     * Set Sql返回码，0为成功。
     * @param ResultCode Sql返回码，0为成功。
     */
    public void setResultCode(Long ResultCode) {
        this.ResultCode = ResultCode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Client", this.Client);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "SelectRowNum", this.SelectRowNum);
        this.setParamSimple(map, prefix + "AffectRowNum", this.AffectRowNum);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "TimeCostMs", this.TimeCostMs);
        this.setParamSimple(map, prefix + "ResultCode", this.ResultCode);

    }
}

