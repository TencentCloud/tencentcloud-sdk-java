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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Whitelist extends AbstractModel{

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 实例ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 截止时间
    */
    @SerializedName("Ttl")
    @Expose
    private String Ttl;

    /**
    * 白名单自增ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 业务唯一标识
    */
    @SerializedName("WhitelistUin")
    @Expose
    private String WhitelistUin;

    /**
    * 创建者ID
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * aid标识
    */
    @SerializedName("Aid")
    @Expose
    private String Aid;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

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
     * Get 实例ID 
     * @return InstanceID 实例ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例ID
     * @param InstanceID 实例ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 截止时间 
     * @return Ttl 截止时间
     */
    public String getTtl() {
        return this.Ttl;
    }

    /**
     * Set 截止时间
     * @param Ttl 截止时间
     */
    public void setTtl(String Ttl) {
        this.Ttl = Ttl;
    }

    /**
     * Get 白名单自增ID 
     * @return ID 白名单自增ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 白名单自增ID
     * @param ID 白名单自增ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 业务唯一标识 
     * @return WhitelistUin 业务唯一标识
     */
    public String getWhitelistUin() {
        return this.WhitelistUin;
    }

    /**
     * Set 业务唯一标识
     * @param WhitelistUin 业务唯一标识
     */
    public void setWhitelistUin(String WhitelistUin) {
        this.WhitelistUin = WhitelistUin;
    }

    /**
     * Get 创建者ID 
     * @return CreateUser 创建者ID
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set 创建者ID
     * @param CreateUser 创建者ID
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get aid标识 
     * @return Aid aid标识
     */
    public String getAid() {
        return this.Aid;
    }

    /**
     * Set aid标识
     * @param Aid aid标识
     */
    public void setAid(String Aid) {
        this.Aid = Aid;
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

    public Whitelist() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Whitelist(Whitelist source) {
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Ttl != null) {
            this.Ttl = new String(source.Ttl);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.WhitelistUin != null) {
            this.WhitelistUin = new String(source.WhitelistUin);
        }
        if (source.CreateUser != null) {
            this.CreateUser = new String(source.CreateUser);
        }
        if (source.Aid != null) {
            this.Aid = new String(source.Aid);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Ttl", this.Ttl);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "WhitelistUin", this.WhitelistUin);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "Aid", this.Aid);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

