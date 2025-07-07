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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLoginWhiteRecordRequest extends AbstractModel {

    /**
    * 白名单用户（多个用户逗号隔开）
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 更新后记录的白名单维度信息
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 是否对所有服务器生效，0-否，1-是
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * 白名单ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 服务器列表
    */
    @SerializedName("Hosts")
    @Expose
    private HostInfo [] Hosts;

    /**
    * 地域列表
    */
    @SerializedName("Places")
    @Expose
    private Place [] Places;

    /**
     * Get 白名单用户（多个用户逗号隔开） 
     * @return UserName 白名单用户（多个用户逗号隔开）
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 白名单用户（多个用户逗号隔开）
     * @param UserName 白名单用户（多个用户逗号隔开）
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 更新后记录的白名单维度信息 
     * @return SrcIp 更新后记录的白名单维度信息
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 更新后记录的白名单维度信息
     * @param SrcIp 更新后记录的白名单维度信息
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 是否对所有服务器生效，0-否，1-是 
     * @return IsGlobal 是否对所有服务器生效，0-否，1-是
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 是否对所有服务器生效，0-否，1-是
     * @param IsGlobal 是否对所有服务器生效，0-否，1-是
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get 白名单ID 
     * @return Id 白名单ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 白名单ID
     * @param Id 白名单ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 服务器列表 
     * @return Hosts 服务器列表
     */
    public HostInfo [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set 服务器列表
     * @param Hosts 服务器列表
     */
    public void setHosts(HostInfo [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get 地域列表 
     * @return Places 地域列表
     */
    public Place [] getPlaces() {
        return this.Places;
    }

    /**
     * Set 地域列表
     * @param Places 地域列表
     */
    public void setPlaces(Place [] Places) {
        this.Places = Places;
    }

    public ModifyLoginWhiteRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoginWhiteRecordRequest(ModifyLoginWhiteRecordRequest source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Hosts != null) {
            this.Hosts = new HostInfo[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new HostInfo(source.Hosts[i]);
            }
        }
        if (source.Places != null) {
            this.Places = new Place[source.Places.length];
            for (int i = 0; i < source.Places.length; i++) {
                this.Places[i] = new Place(source.Places[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "Hosts.", this.Hosts);
        this.setParamArrayObj(map, prefix + "Places.", this.Places);

    }
}

