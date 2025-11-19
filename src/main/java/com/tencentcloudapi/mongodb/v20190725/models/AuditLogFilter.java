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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLogFilter extends AbstractModel {

    /**
    * 客户端地址。
    */
    @SerializedName("Host")
    @Expose
    private String [] Host;

    /**
    * 用户名。
    */
    @SerializedName("User")
    @Expose
    private String [] User;

    /**
    * 执行时间。单位为：ms。表示筛选执行时间大于该值的审计日志。
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * 影响行数。表示筛选影响行数大于该值的审计日志。
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * 操作类型。
    */
    @SerializedName("Atype")
    @Expose
    private String [] Atype;

    /**
    * 执行结果。
    */
    @SerializedName("Result")
    @Expose
    private String [] Result;

    /**
    * 根据此关键字过滤日志
    */
    @SerializedName("Param")
    @Expose
    private String [] Param;

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
     * Get 执行时间。单位为：ms。表示筛选执行时间大于该值的审计日志。 
     * @return ExecTime 执行时间。单位为：ms。表示筛选执行时间大于该值的审计日志。
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set 执行时间。单位为：ms。表示筛选执行时间大于该值的审计日志。
     * @param ExecTime 执行时间。单位为：ms。表示筛选执行时间大于该值的审计日志。
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
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
     * Get 操作类型。 
     * @return Atype 操作类型。
     */
    public String [] getAtype() {
        return this.Atype;
    }

    /**
     * Set 操作类型。
     * @param Atype 操作类型。
     */
    public void setAtype(String [] Atype) {
        this.Atype = Atype;
    }

    /**
     * Get 执行结果。 
     * @return Result 执行结果。
     */
    public String [] getResult() {
        return this.Result;
    }

    /**
     * Set 执行结果。
     * @param Result 执行结果。
     */
    public void setResult(String [] Result) {
        this.Result = Result;
    }

    /**
     * Get 根据此关键字过滤日志 
     * @return Param 根据此关键字过滤日志
     */
    public String [] getParam() {
        return this.Param;
    }

    /**
     * Set 根据此关键字过滤日志
     * @param Param 根据此关键字过滤日志
     */
    public void setParam(String [] Param) {
        this.Param = Param;
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
        if (source.User != null) {
            this.User = new String[source.User.length];
            for (int i = 0; i < source.User.length; i++) {
                this.User[i] = new String(source.User[i]);
            }
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.AffectRows != null) {
            this.AffectRows = new Long(source.AffectRows);
        }
        if (source.Atype != null) {
            this.Atype = new String[source.Atype.length];
            for (int i = 0; i < source.Atype.length; i++) {
                this.Atype[i] = new String(source.Atype[i]);
            }
        }
        if (source.Result != null) {
            this.Result = new String[source.Result.length];
            for (int i = 0; i < source.Result.length; i++) {
                this.Result[i] = new String(source.Result[i]);
            }
        }
        if (source.Param != null) {
            this.Param = new String[source.Param.length];
            for (int i = 0; i < source.Param.length; i++) {
                this.Param[i] = new String(source.Param[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Host.", this.Host);
        this.setParamArraySimple(map, prefix + "User.", this.User);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamArraySimple(map, prefix + "Atype.", this.Atype);
        this.setParamArraySimple(map, prefix + "Result.", this.Result);
        this.setParamArraySimple(map, prefix + "Param.", this.Param);

    }
}

