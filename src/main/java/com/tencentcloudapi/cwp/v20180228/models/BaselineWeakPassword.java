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

public class BaselineWeakPassword extends AbstractModel{

    /**
    * 密码Id
    */
    @SerializedName("PasswordId")
    @Expose
    private Long PasswordId;

    /**
    * 密码
    */
    @SerializedName("WeakPassword")
    @Expose
    private String WeakPassword;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 密码Id 
     * @return PasswordId 密码Id
     */
    public Long getPasswordId() {
        return this.PasswordId;
    }

    /**
     * Set 密码Id
     * @param PasswordId 密码Id
     */
    public void setPasswordId(Long PasswordId) {
        this.PasswordId = PasswordId;
    }

    /**
     * Get 密码 
     * @return WeakPassword 密码
     */
    public String getWeakPassword() {
        return this.WeakPassword;
    }

    /**
     * Set 密码
     * @param WeakPassword 密码
     */
    public void setWeakPassword(String WeakPassword) {
        this.WeakPassword = WeakPassword;
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
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public BaselineWeakPassword() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineWeakPassword(BaselineWeakPassword source) {
        if (source.PasswordId != null) {
            this.PasswordId = new Long(source.PasswordId);
        }
        if (source.WeakPassword != null) {
            this.WeakPassword = new String(source.WeakPassword);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PasswordId", this.PasswordId);
        this.setParamSimple(map, prefix + "WeakPassword", this.WeakPassword);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

