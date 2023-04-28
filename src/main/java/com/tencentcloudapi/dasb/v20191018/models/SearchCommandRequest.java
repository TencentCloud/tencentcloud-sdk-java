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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchCommandRequest extends AbstractModel{

    /**
    * 搜索区间的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 搜索区间的结束时间，不填默认为开始时间到现在为止
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 姓名
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * 资产实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 资产名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 资产的公网IP
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 资产的内网IP
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 执行的命令
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * Cmd字段是前端传值是否进行base64.
0:否，1：是
    */
    @SerializedName("Encoding")
    @Expose
    private Long Encoding;

    /**
    * 根据拦截状态进行过滤：1 - 已执行，2 - 被阻断
    */
    @SerializedName("AuditAction")
    @Expose
    private Long [] AuditAction;

    /**
    * 每页容量，默认20，最大200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移位置，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 搜索区间的开始时间 
     * @return StartTime 搜索区间的开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 搜索区间的开始时间
     * @param StartTime 搜索区间的开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 搜索区间的结束时间，不填默认为开始时间到现在为止 
     * @return EndTime 搜索区间的结束时间，不填默认为开始时间到现在为止
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 搜索区间的结束时间，不填默认为开始时间到现在为止
     * @param EndTime 搜索区间的结束时间，不填默认为开始时间到现在为止
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get 姓名 
     * @return RealName 姓名
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set 姓名
     * @param RealName 姓名
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get 资产实例ID 
     * @return InstanceId 资产实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资产实例ID
     * @param InstanceId 资产实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 资产名称 
     * @return DeviceName 资产名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 资产名称
     * @param DeviceName 资产名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 资产的公网IP 
     * @return PublicIp 资产的公网IP
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 资产的公网IP
     * @param PublicIp 资产的公网IP
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 资产的内网IP 
     * @return PrivateIp 资产的内网IP
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 资产的内网IP
     * @param PrivateIp 资产的内网IP
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 执行的命令 
     * @return Cmd 执行的命令
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set 执行的命令
     * @param Cmd 执行的命令
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get Cmd字段是前端传值是否进行base64.
0:否，1：是 
     * @return Encoding Cmd字段是前端传值是否进行base64.
0:否，1：是
     */
    public Long getEncoding() {
        return this.Encoding;
    }

    /**
     * Set Cmd字段是前端传值是否进行base64.
0:否，1：是
     * @param Encoding Cmd字段是前端传值是否进行base64.
0:否，1：是
     */
    public void setEncoding(Long Encoding) {
        this.Encoding = Encoding;
    }

    /**
     * Get 根据拦截状态进行过滤：1 - 已执行，2 - 被阻断 
     * @return AuditAction 根据拦截状态进行过滤：1 - 已执行，2 - 被阻断
     */
    public Long [] getAuditAction() {
        return this.AuditAction;
    }

    /**
     * Set 根据拦截状态进行过滤：1 - 已执行，2 - 被阻断
     * @param AuditAction 根据拦截状态进行过滤：1 - 已执行，2 - 被阻断
     */
    public void setAuditAction(Long [] AuditAction) {
        this.AuditAction = AuditAction;
    }

    /**
     * Get 每页容量，默认20，最大200 
     * @return Limit 每页容量，默认20，最大200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页容量，默认20，最大200
     * @param Limit 每页容量，默认20，最大200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移位置，默认值为0 
     * @return Offset 分页偏移位置，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移位置，默认值为0
     * @param Offset 分页偏移位置，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public SearchCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchCommandRequest(SearchCommandRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.RealName != null) {
            this.RealName = new String(source.RealName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.Cmd != null) {
            this.Cmd = new String(source.Cmd);
        }
        if (source.Encoding != null) {
            this.Encoding = new Long(source.Encoding);
        }
        if (source.AuditAction != null) {
            this.AuditAction = new Long[source.AuditAction.length];
            for (int i = 0; i < source.AuditAction.length; i++) {
                this.AuditAction[i] = new Long(source.AuditAction[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);
        this.setParamSimple(map, prefix + "Encoding", this.Encoding);
        this.setParamArraySimple(map, prefix + "AuditAction.", this.AuditAction);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

