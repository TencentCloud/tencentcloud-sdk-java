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

public class AuditLog extends AbstractModel {

    /**
    * 影响行数
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * 操作类型。如：grantRolesToRole、dropRole等。
    */
    @SerializedName("Atype")
    @Expose
    private String Atype;

    /**
    * 执行时间。单位为：ms。
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * 客户端地址。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 操作参数。包含操作的详细参数信息。
    */
    @SerializedName("Param")
    @Expose
    private String Param;

    /**
    * 执行结果。0表示成功，非0表示失败。
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 用户角色列表。格式为：role@db,role@db。
    */
    @SerializedName("Roles")
    @Expose
    private String Roles;

    /**
    * 操作时间戳。格式为：YYYY-MM-DD HH:mm:ss。
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * 用户名。格式为：user@db。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
     * Get 影响行数 
     * @return AffectRows 影响行数
     */
    public Long getAffectRows() {
        return this.AffectRows;
    }

    /**
     * Set 影响行数
     * @param AffectRows 影响行数
     */
    public void setAffectRows(Long AffectRows) {
        this.AffectRows = AffectRows;
    }

    /**
     * Get 操作类型。如：grantRolesToRole、dropRole等。 
     * @return Atype 操作类型。如：grantRolesToRole、dropRole等。
     */
    public String getAtype() {
        return this.Atype;
    }

    /**
     * Set 操作类型。如：grantRolesToRole、dropRole等。
     * @param Atype 操作类型。如：grantRolesToRole、dropRole等。
     */
    public void setAtype(String Atype) {
        this.Atype = Atype;
    }

    /**
     * Get 执行时间。单位为：ms。 
     * @return ExecTime 执行时间。单位为：ms。
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set 执行时间。单位为：ms。
     * @param ExecTime 执行时间。单位为：ms。
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get 客户端地址。 
     * @return Host 客户端地址。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 客户端地址。
     * @param Host 客户端地址。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 操作参数。包含操作的详细参数信息。 
     * @return Param 操作参数。包含操作的详细参数信息。
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * Set 操作参数。包含操作的详细参数信息。
     * @param Param 操作参数。包含操作的详细参数信息。
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * Get 执行结果。0表示成功，非0表示失败。 
     * @return Result 执行结果。0表示成功，非0表示失败。
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 执行结果。0表示成功，非0表示失败。
     * @param Result 执行结果。0表示成功，非0表示失败。
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 用户角色列表。格式为：role@db,role@db。 
     * @return Roles 用户角色列表。格式为：role@db,role@db。
     */
    public String getRoles() {
        return this.Roles;
    }

    /**
     * Set 用户角色列表。格式为：role@db,role@db。
     * @param Roles 用户角色列表。格式为：role@db,role@db。
     */
    public void setRoles(String Roles) {
        this.Roles = Roles;
    }

    /**
     * Get 操作时间戳。格式为：YYYY-MM-DD HH:mm:ss。 
     * @return Timestamp 操作时间戳。格式为：YYYY-MM-DD HH:mm:ss。
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 操作时间戳。格式为：YYYY-MM-DD HH:mm:ss。
     * @param Timestamp 操作时间戳。格式为：YYYY-MM-DD HH:mm:ss。
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 用户名。格式为：user@db。 
     * @return User 用户名。格式为：user@db。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户名。格式为：user@db。
     * @param User 用户名。格式为：user@db。
     */
    public void setUser(String User) {
        this.User = User;
    }

    public AuditLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLog(AuditLog source) {
        if (source.AffectRows != null) {
            this.AffectRows = new Long(source.AffectRows);
        }
        if (source.Atype != null) {
            this.Atype = new String(source.Atype);
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Param != null) {
            this.Param = new String(source.Param);
        }
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.Roles != null) {
            this.Roles = new String(source.Roles);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamSimple(map, prefix + "Atype", this.Atype);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Roles", this.Roles);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "User", this.User);

    }
}

