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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginWhiteLists extends AbstractModel {

    /**
    * 记录ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机安全uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 白名单地域
    */
    @SerializedName("Places")
    @Expose
    private Place [] Places;

    /**
    * 白名单用户（多个用户逗号隔开）
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 白名单IP（多个IP逗号隔开）
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * 是否为全局规则
    */
    @SerializedName("IsGlobal")
    @Expose
    private Boolean IsGlobal;

    /**
    * 创建白名单时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改白名单时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 机器名
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 机器IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 起始时间
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
     * Get 记录ID 
     * @return Id 记录ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 记录ID
     * @param Id 记录ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 主机安全uuid 
     * @return Uuid 主机安全uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机安全uuid
     * @param Uuid 主机安全uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 白名单地域 
     * @return Places 白名单地域
     */
    public Place [] getPlaces() {
        return this.Places;
    }

    /**
     * Set 白名单地域
     * @param Places 白名单地域
     */
    public void setPlaces(Place [] Places) {
        this.Places = Places;
    }

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
     * Get 白名单IP（多个IP逗号隔开） 
     * @return SrcIp 白名单IP（多个IP逗号隔开）
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 白名单IP（多个IP逗号隔开）
     * @param SrcIp 白名单IP（多个IP逗号隔开）
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get 是否为全局规则 
     * @return IsGlobal 是否为全局规则
     */
    public Boolean getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 是否为全局规则
     * @param IsGlobal 是否为全局规则
     */
    public void setIsGlobal(Boolean IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get 创建白名单时间 
     * @return CreateTime 创建白名单时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建白名单时间
     * @param CreateTime 创建白名单时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改白名单时间 
     * @return ModifyTime 修改白名单时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改白名单时间
     * @param ModifyTime 修改白名单时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 机器名 
     * @return MachineName 机器名
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 机器名
     * @param MachineName 机器名
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 机器IP 
     * @return HostIp 机器IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 机器IP
     * @param HostIp 机器IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 起始时间 
     * @return StartTime 起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间
     * @param StartTime 起始时间
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

    public LoginWhiteLists() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginWhiteLists(LoginWhiteLists source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Places != null) {
            this.Places = new Place[source.Places.length];
            for (int i = 0; i < source.Places.length; i++) {
                this.Places[i] = new Place(source.Places[i]);
            }
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Boolean(source.IsGlobal);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamArrayObj(map, prefix + "Places.", this.Places);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

