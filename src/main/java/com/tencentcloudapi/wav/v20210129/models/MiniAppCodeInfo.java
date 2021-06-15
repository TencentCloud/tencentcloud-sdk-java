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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MiniAppCodeInfo extends AbstractModel{

    /**
    * 主键id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 小程序名称
    */
    @SerializedName("MiniAppName")
    @Expose
    private String MiniAppName;

    /**
    * 小程序logo
    */
    @SerializedName("MiniAppLogo")
    @Expose
    private String MiniAppLogo;

    /**
    * 小程序管理端地址
    */
    @SerializedName("MiniAdminUrl")
    @Expose
    private String MiniAdminUrl;

    /**
    * 状态：0正常，1删除
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 创建时间戳，单位为秒
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间戳，单位为秒
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 主键id 
     * @return Id 主键id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 主键id
     * @param Id 主键id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 小程序名称 
     * @return MiniAppName 小程序名称
     */
    public String getMiniAppName() {
        return this.MiniAppName;
    }

    /**
     * Set 小程序名称
     * @param MiniAppName 小程序名称
     */
    public void setMiniAppName(String MiniAppName) {
        this.MiniAppName = MiniAppName;
    }

    /**
     * Get 小程序logo 
     * @return MiniAppLogo 小程序logo
     */
    public String getMiniAppLogo() {
        return this.MiniAppLogo;
    }

    /**
     * Set 小程序logo
     * @param MiniAppLogo 小程序logo
     */
    public void setMiniAppLogo(String MiniAppLogo) {
        this.MiniAppLogo = MiniAppLogo;
    }

    /**
     * Get 小程序管理端地址 
     * @return MiniAdminUrl 小程序管理端地址
     */
    public String getMiniAdminUrl() {
        return this.MiniAdminUrl;
    }

    /**
     * Set 小程序管理端地址
     * @param MiniAdminUrl 小程序管理端地址
     */
    public void setMiniAdminUrl(String MiniAdminUrl) {
        this.MiniAdminUrl = MiniAdminUrl;
    }

    /**
     * Get 状态：0正常，1删除 
     * @return State 状态：0正常，1删除
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 状态：0正常，1删除
     * @param State 状态：0正常，1删除
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 创建时间戳，单位为秒 
     * @return CreateTime 创建时间戳，单位为秒
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间戳，单位为秒
     * @param CreateTime 创建时间戳，单位为秒
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间戳，单位为秒 
     * @return UpdateTime 更新时间戳，单位为秒
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间戳，单位为秒
     * @param UpdateTime 更新时间戳，单位为秒
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public MiniAppCodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MiniAppCodeInfo(MiniAppCodeInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.MiniAppName != null) {
            this.MiniAppName = new String(source.MiniAppName);
        }
        if (source.MiniAppLogo != null) {
            this.MiniAppLogo = new String(source.MiniAppLogo);
        }
        if (source.MiniAdminUrl != null) {
            this.MiniAdminUrl = new String(source.MiniAdminUrl);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MiniAppName", this.MiniAppName);
        this.setParamSimple(map, prefix + "MiniAppLogo", this.MiniAppLogo);
        this.setParamSimple(map, prefix + "MiniAdminUrl", this.MiniAdminUrl);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

