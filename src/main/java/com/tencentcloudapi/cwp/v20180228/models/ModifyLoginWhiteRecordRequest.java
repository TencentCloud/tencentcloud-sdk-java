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
    * <p>白名单用户（多个用户逗号隔开）</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>更新后记录的白名单维度信息</p>
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>是否对所有服务器生效，0-否，1-是</p>
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * <p>白名单ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>服务器列表</p>
    */
    @SerializedName("Hosts")
    @Expose
    private HostInfo [] Hosts;

    /**
    * <p>地域列表</p>
    */
    @SerializedName("Places")
    @Expose
    private Place [] Places;

    /**
     * Get <p>白名单用户（多个用户逗号隔开）</p> 
     * @return UserName <p>白名单用户（多个用户逗号隔开）</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>白名单用户（多个用户逗号隔开）</p>
     * @param UserName <p>白名单用户（多个用户逗号隔开）</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>更新后记录的白名单维度信息</p> 
     * @return SrcIp <p>更新后记录的白名单维度信息</p>
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set <p>更新后记录的白名单维度信息</p>
     * @param SrcIp <p>更新后记录的白名单维度信息</p>
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>是否对所有服务器生效，0-否，1-是</p> 
     * @return IsGlobal <p>是否对所有服务器生效，0-否，1-是</p>
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set <p>是否对所有服务器生效，0-否，1-是</p>
     * @param IsGlobal <p>是否对所有服务器生效，0-否，1-是</p>
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get <p>白名单ID</p> 
     * @return Id <p>白名单ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>白名单ID</p>
     * @param Id <p>白名单ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>服务器列表</p> 
     * @return Hosts <p>服务器列表</p>
     */
    public HostInfo [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set <p>服务器列表</p>
     * @param Hosts <p>服务器列表</p>
     */
    public void setHosts(HostInfo [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get <p>地域列表</p> 
     * @return Places <p>地域列表</p>
     */
    public Place [] getPlaces() {
        return this.Places;
    }

    /**
     * Set <p>地域列表</p>
     * @param Places <p>地域列表</p>
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

