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

public class SearchSessionRequest extends AbstractModel{

    /**
    * 内部Ip
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 外部Ip
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 用户名，长度不超过20
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 账号，长度不超过64
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 来源Ip
    */
    @SerializedName("FromIp")
    @Expose
    private String FromIp;

    /**
    * 搜索区间的开始时间。若入参是Id，则非必传，否则为必传。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 搜索区间的结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 会话协议类型，只能是1、2、3或4 对应关系为1-tui 2-gui 3-file 4-数据库。若入参是Id，则非必传，否则为必传。
    */
    @SerializedName("Kind")
    @Expose
    private Long Kind;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页的页内记录数，默认为20，最大200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 姓名，长度不超过20
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * 主机名，长度不超过64
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 状态，1为活跃，2为结束，3为强制离线，4为其他错误
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 若入参为Id，则其他入参字段不作为搜索依据，仅按照Id来搜索会话
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 内部Ip 
     * @return PrivateIp 内部Ip
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内部Ip
     * @param PrivateIp 内部Ip
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 外部Ip 
     * @return PublicIp 外部Ip
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 外部Ip
     * @param PublicIp 外部Ip
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 用户名，长度不超过20 
     * @return UserName 用户名，长度不超过20
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名，长度不超过20
     * @param UserName 用户名，长度不超过20
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 账号，长度不超过64 
     * @return Account 账号，长度不超过64
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 账号，长度不超过64
     * @param Account 账号，长度不超过64
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 来源Ip 
     * @return FromIp 来源Ip
     */
    public String getFromIp() {
        return this.FromIp;
    }

    /**
     * Set 来源Ip
     * @param FromIp 来源Ip
     */
    public void setFromIp(String FromIp) {
        this.FromIp = FromIp;
    }

    /**
     * Get 搜索区间的开始时间。若入参是Id，则非必传，否则为必传。 
     * @return StartTime 搜索区间的开始时间。若入参是Id，则非必传，否则为必传。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 搜索区间的开始时间。若入参是Id，则非必传，否则为必传。
     * @param StartTime 搜索区间的开始时间。若入参是Id，则非必传，否则为必传。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 搜索区间的结束时间 
     * @return EndTime 搜索区间的结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 搜索区间的结束时间
     * @param EndTime 搜索区间的结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 会话协议类型，只能是1、2、3或4 对应关系为1-tui 2-gui 3-file 4-数据库。若入参是Id，则非必传，否则为必传。 
     * @return Kind 会话协议类型，只能是1、2、3或4 对应关系为1-tui 2-gui 3-file 4-数据库。若入参是Id，则非必传，否则为必传。
     */
    public Long getKind() {
        return this.Kind;
    }

    /**
     * Set 会话协议类型，只能是1、2、3或4 对应关系为1-tui 2-gui 3-file 4-数据库。若入参是Id，则非必传，否则为必传。
     * @param Kind 会话协议类型，只能是1、2、3或4 对应关系为1-tui 2-gui 3-file 4-数据库。若入参是Id，则非必传，否则为必传。
     */
    public void setKind(Long Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页的页内记录数，默认为20，最大200 
     * @return Limit 分页的页内记录数，默认为20，最大200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页的页内记录数，默认为20，最大200
     * @param Limit 分页的页内记录数，默认为20，最大200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 姓名，长度不超过20 
     * @return RealName 姓名，长度不超过20
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set 姓名，长度不超过20
     * @param RealName 姓名，长度不超过20
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get 主机名，长度不超过64 
     * @return DeviceName 主机名，长度不超过64
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 主机名，长度不超过64
     * @param DeviceName 主机名，长度不超过64
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 状态，1为活跃，2为结束，3为强制离线，4为其他错误 
     * @return Status 状态，1为活跃，2为结束，3为强制离线，4为其他错误
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，1为活跃，2为结束，3为强制离线，4为其他错误
     * @param Status 状态，1为活跃，2为结束，3为强制离线，4为其他错误
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 若入参为Id，则其他入参字段不作为搜索依据，仅按照Id来搜索会话 
     * @return Id 若入参为Id，则其他入参字段不作为搜索依据，仅按照Id来搜索会话
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 若入参为Id，则其他入参字段不作为搜索依据，仅按照Id来搜索会话
     * @param Id 若入参为Id，则其他入参字段不作为搜索依据，仅按照Id来搜索会话
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public SearchSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchSessionRequest(SearchSessionRequest source) {
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.FromIp != null) {
            this.FromIp = new String(source.FromIp);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Kind != null) {
            this.Kind = new Long(source.Kind);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.RealName != null) {
            this.RealName = new String(source.RealName);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "FromIp", this.FromIp);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

