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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Whitelist extends AbstractModel {

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>截止时间</p>
    */
    @SerializedName("Ttl")
    @Expose
    private String Ttl;

    /**
    * <p>白名单自增ID</p>
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>业务唯一标识</p>
    */
    @SerializedName("WhitelistUin")
    @Expose
    private String WhitelistUin;

    /**
    * <p>创建者ID</p>
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * <p>aid标识</p>
    */
    @SerializedName("Aid")
    @Expose
    private String Aid;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>白名单创建时刻。由原始time.Time同源生成带偏移RFC3339，旧CreateTime原值及十二小时显示格式保持；缺失原始时刻时省略本成员。</p>
    */
    @SerializedName("CreateDatetime")
    @Expose
    private String CreateDatetime;

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
     * Get <p>实例ID</p> 
     * @return InstanceID <p>实例ID</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceID <p>实例ID</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>截止时间</p> 
     * @return Ttl <p>截止时间</p>
     */
    public String getTtl() {
        return this.Ttl;
    }

    /**
     * Set <p>截止时间</p>
     * @param Ttl <p>截止时间</p>
     */
    public void setTtl(String Ttl) {
        this.Ttl = Ttl;
    }

    /**
     * Get <p>白名单自增ID</p> 
     * @return ID <p>白名单自增ID</p>
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>白名单自增ID</p>
     * @param ID <p>白名单自增ID</p>
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>业务唯一标识</p> 
     * @return WhitelistUin <p>业务唯一标识</p>
     */
    public String getWhitelistUin() {
        return this.WhitelistUin;
    }

    /**
     * Set <p>业务唯一标识</p>
     * @param WhitelistUin <p>业务唯一标识</p>
     */
    public void setWhitelistUin(String WhitelistUin) {
        this.WhitelistUin = WhitelistUin;
    }

    /**
     * Get <p>创建者ID</p> 
     * @return CreateUser <p>创建者ID</p>
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set <p>创建者ID</p>
     * @param CreateUser <p>创建者ID</p>
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get <p>aid标识</p> 
     * @return Aid <p>aid标识</p>
     */
    public String getAid() {
        return this.Aid;
    }

    /**
     * Set <p>aid标识</p>
     * @param Aid <p>aid标识</p>
     */
    public void setAid(String Aid) {
        this.Aid = Aid;
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
     * Get <p>白名单创建时刻。由原始time.Time同源生成带偏移RFC3339，旧CreateTime原值及十二小时显示格式保持；缺失原始时刻时省略本成员。</p> 
     * @return CreateDatetime <p>白名单创建时刻。由原始time.Time同源生成带偏移RFC3339，旧CreateTime原值及十二小时显示格式保持；缺失原始时刻时省略本成员。</p>
     */
    public String getCreateDatetime() {
        return this.CreateDatetime;
    }

    /**
     * Set <p>白名单创建时刻。由原始time.Time同源生成带偏移RFC3339，旧CreateTime原值及十二小时显示格式保持；缺失原始时刻时省略本成员。</p>
     * @param CreateDatetime <p>白名单创建时刻。由原始time.Time同源生成带偏移RFC3339，旧CreateTime原值及十二小时显示格式保持；缺失原始时刻时省略本成员。</p>
     */
    public void setCreateDatetime(String CreateDatetime) {
        this.CreateDatetime = CreateDatetime;
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
        if (source.CreateDatetime != null) {
            this.CreateDatetime = new String(source.CreateDatetime);
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
        this.setParamSimple(map, prefix + "CreateDatetime", this.CreateDatetime);

    }
}

