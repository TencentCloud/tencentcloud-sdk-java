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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginWhiteCombinedInfo extends AbstractModel {

    /**
    * <p>白名单地域</p>
    */
    @SerializedName("Places")
    @Expose
    private Place [] Places;

    /**
    * <p>白名单用户（多个用户逗号隔开）</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>白名单IP（多个IP逗号隔开）</p>
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * <p>地域字符串</p>
    */
    @SerializedName("Locale")
    @Expose
    private String Locale;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

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
    * <p>是否对全局生效, 1：全局有效 0: 对指定主机列表生效&#39;</p>
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * <p>白名单名字：IsLocal=1时固定为：全部服务器；单台机器时为机器内网IP，多台服务器时为服务器数量，如：11台</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>仅在单台服务器时，返回服务器名称</p>
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * <p>白名单ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最近修改时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>服务器Uuid</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>登录地</p>
    */
    @SerializedName("Locations")
    @Expose
    private String Locations;

    /**
     * Get <p>白名单地域</p> 
     * @return Places <p>白名单地域</p>
     */
    public Place [] getPlaces() {
        return this.Places;
    }

    /**
     * Set <p>白名单地域</p>
     * @param Places <p>白名单地域</p>
     */
    public void setPlaces(Place [] Places) {
        this.Places = Places;
    }

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
     * Get <p>白名单IP（多个IP逗号隔开）</p> 
     * @return SrcIp <p>白名单IP（多个IP逗号隔开）</p>
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set <p>白名单IP（多个IP逗号隔开）</p>
     * @param SrcIp <p>白名单IP（多个IP逗号隔开）</p>
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get <p>地域字符串</p> 
     * @return Locale <p>地域字符串</p>
     */
    public String getLocale() {
        return this.Locale;
    }

    /**
     * Set <p>地域字符串</p>
     * @param Locale <p>地域字符串</p>
     */
    public void setLocale(String Locale) {
        this.Locale = Locale;
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
     * Get <p>是否对全局生效, 1：全局有效 0: 对指定主机列表生效&#39;</p> 
     * @return IsGlobal <p>是否对全局生效, 1：全局有效 0: 对指定主机列表生效&#39;</p>
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set <p>是否对全局生效, 1：全局有效 0: 对指定主机列表生效&#39;</p>
     * @param IsGlobal <p>是否对全局生效, 1：全局有效 0: 对指定主机列表生效&#39;</p>
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get <p>白名单名字：IsLocal=1时固定为：全部服务器；单台机器时为机器内网IP，多台服务器时为服务器数量，如：11台</p> 
     * @return Name <p>白名单名字：IsLocal=1时固定为：全部服务器；单台机器时为机器内网IP，多台服务器时为服务器数量，如：11台</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>白名单名字：IsLocal=1时固定为：全部服务器；单台机器时为机器内网IP，多台服务器时为服务器数量，如：11台</p>
     * @param Name <p>白名单名字：IsLocal=1时固定为：全部服务器；单台机器时为机器内网IP，多台服务器时为服务器数量，如：11台</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>仅在单台服务器时，返回服务器名称</p> 
     * @return Desc <p>仅在单台服务器时，返回服务器名称</p>
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set <p>仅在单台服务器时，返回服务器名称</p>
     * @param Desc <p>仅在单台服务器时，返回服务器名称</p>
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
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
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最近修改时间</p> 
     * @return ModifyTime <p>最近修改时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>最近修改时间</p>
     * @param ModifyTime <p>最近修改时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>服务器Uuid</p> 
     * @return Uuid <p>服务器Uuid</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>服务器Uuid</p>
     * @param Uuid <p>服务器Uuid</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>登录地</p> 
     * @return Locations <p>登录地</p>
     */
    public String getLocations() {
        return this.Locations;
    }

    /**
     * Set <p>登录地</p>
     * @param Locations <p>登录地</p>
     */
    public void setLocations(String Locations) {
        this.Locations = Locations;
    }

    public LoginWhiteCombinedInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginWhiteCombinedInfo(LoginWhiteCombinedInfo source) {
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
        if (source.Locale != null) {
            this.Locale = new String(source.Locale);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Locations != null) {
            this.Locations = new String(source.Locations);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Places.", this.Places);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "Locale", this.Locale);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Locations", this.Locations);

    }
}

