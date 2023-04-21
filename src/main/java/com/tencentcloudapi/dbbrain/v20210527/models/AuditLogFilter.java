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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLogFilter extends AbstractModel{

    /**
    * 客户端地址。
    */
    @SerializedName("Host")
    @Expose
    private String [] Host;

    /**
    * 数据库名称。
    */
    @SerializedName("DBName")
    @Expose
    private String [] DBName;

    /**
    * 用户名。
    */
    @SerializedName("User")
    @Expose
    private String [] User;

    /**
    * 返回行数。表示筛选返回行数大于该值的审计日志。
    */
    @SerializedName("SentRows")
    @Expose
    private Long SentRows;

    /**
    * 影响行数。表示筛选影响行数大于该值的审计日志。
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * 执行时间。单位为：µs。表示筛选执行时间大于该值的审计日志。
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
     * Get 客户端地址。 
     * @return Host 客户端地址。
     */
    public String [] getHost() {
        return this.Host;
    }

    /**
     * Set 客户端地址。
     * @param Host 客户端地址。
     */
    public void setHost(String [] Host) {
        this.Host = Host;
    }

    /**
     * Get 数据库名称。 
     * @return DBName 数据库名称。
     */
    public String [] getDBName() {
        return this.DBName;
    }

    /**
     * Set 数据库名称。
     * @param DBName 数据库名称。
     */
    public void setDBName(String [] DBName) {
        this.DBName = DBName;
    }

    /**
     * Get 用户名。 
     * @return User 用户名。
     */
    public String [] getUser() {
        return this.User;
    }

    /**
     * Set 用户名。
     * @param User 用户名。
     */
    public void setUser(String [] User) {
        this.User = User;
    }

    /**
     * Get 返回行数。表示筛选返回行数大于该值的审计日志。 
     * @return SentRows 返回行数。表示筛选返回行数大于该值的审计日志。
     */
    public Long getSentRows() {
        return this.SentRows;
    }

    /**
     * Set 返回行数。表示筛选返回行数大于该值的审计日志。
     * @param SentRows 返回行数。表示筛选返回行数大于该值的审计日志。
     */
    public void setSentRows(Long SentRows) {
        this.SentRows = SentRows;
    }

    /**
     * Get 影响行数。表示筛选影响行数大于该值的审计日志。 
     * @return AffectRows 影响行数。表示筛选影响行数大于该值的审计日志。
     */
    public Long getAffectRows() {
        return this.AffectRows;
    }

    /**
     * Set 影响行数。表示筛选影响行数大于该值的审计日志。
     * @param AffectRows 影响行数。表示筛选影响行数大于该值的审计日志。
     */
    public void setAffectRows(Long AffectRows) {
        this.AffectRows = AffectRows;
    }

    /**
     * Get 执行时间。单位为：µs。表示筛选执行时间大于该值的审计日志。 
     * @return ExecTime 执行时间。单位为：µs。表示筛选执行时间大于该值的审计日志。
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set 执行时间。单位为：µs。表示筛选执行时间大于该值的审计日志。
     * @param ExecTime 执行时间。单位为：µs。表示筛选执行时间大于该值的审计日志。
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    public AuditLogFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLogFilter(AuditLogFilter source) {
        if (source.Host != null) {
            this.Host = new String[source.Host.length];
            for (int i = 0; i < source.Host.length; i++) {
                this.Host[i] = new String(source.Host[i]);
            }
        }
        if (source.DBName != null) {
            this.DBName = new String[source.DBName.length];
            for (int i = 0; i < source.DBName.length; i++) {
                this.DBName[i] = new String(source.DBName[i]);
            }
        }
        if (source.User != null) {
            this.User = new String[source.User.length];
            for (int i = 0; i < source.User.length; i++) {
                this.User[i] = new String(source.User[i]);
            }
        }
        if (source.SentRows != null) {
            this.SentRows = new Long(source.SentRows);
        }
        if (source.AffectRows != null) {
            this.AffectRows = new Long(source.AffectRows);
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Host.", this.Host);
        this.setParamArraySimple(map, prefix + "DBName.", this.DBName);
        this.setParamArraySimple(map, prefix + "User.", this.User);
        this.setParamSimple(map, prefix + "SentRows", this.SentRows);
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);

    }
}

