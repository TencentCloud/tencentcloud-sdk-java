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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginWhiteCombinedInfo extends AbstractModel{

    /**
    * 白名单地域
注意：此字段可能返回 null，表示取不到有效值。
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
    * 地域字符串
    */
    @SerializedName("Locale")
    @Expose
    private String Locale;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

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
    * 是否对全局生效, 1：全局有效 0: 对指定主机列表生效'
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * 白名单名字：IsLocal=1时固定为：全部服务器；单台机器时为机器内网IP，多台服务器时为服务器数量，如：11台
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 仅在单台服务器时，返回服务器名称
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 白名单ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 服务器Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
     * Get 白名单地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Places 白名单地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Place [] getPlaces() {
        return this.Places;
    }

    /**
     * Set 白名单地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Places 白名单地域
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 地域字符串 
     * @return Locale 地域字符串
     */
    public String getLocale() {
        return this.Locale;
    }

    /**
     * Set 地域字符串
     * @param Locale 地域字符串
     */
    public void setLocale(String Locale) {
        this.Locale = Locale;
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
     * Get 是否对全局生效, 1：全局有效 0: 对指定主机列表生效' 
     * @return IsGlobal 是否对全局生效, 1：全局有效 0: 对指定主机列表生效'
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 是否对全局生效, 1：全局有效 0: 对指定主机列表生效'
     * @param IsGlobal 是否对全局生效, 1：全局有效 0: 对指定主机列表生效'
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get 白名单名字：IsLocal=1时固定为：全部服务器；单台机器时为机器内网IP，多台服务器时为服务器数量，如：11台 
     * @return Name 白名单名字：IsLocal=1时固定为：全部服务器；单台机器时为机器内网IP，多台服务器时为服务器数量，如：11台
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 白名单名字：IsLocal=1时固定为：全部服务器；单台机器时为机器内网IP，多台服务器时为服务器数量，如：11台
     * @param Name 白名单名字：IsLocal=1时固定为：全部服务器；单台机器时为机器内网IP，多台服务器时为服务器数量，如：11台
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 仅在单台服务器时，返回服务器名称 
     * @return Desc 仅在单台服务器时，返回服务器名称
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 仅在单台服务器时，返回服务器名称
     * @param Desc 仅在单台服务器时，返回服务器名称
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
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
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近修改时间 
     * @return ModifyTime 最近修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 最近修改时间
     * @param ModifyTime 最近修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 服务器Uuid 
     * @return Uuid 服务器Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 服务器Uuid
     * @param Uuid 服务器Uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
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

    }
}

