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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpendThirdAccessUserInfo extends AbstractModel {

    /**
    * id信息
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 用户主UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 用户AppId
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 开通时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get id信息 
     * @return Id id信息
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set id信息
     * @param Id id信息
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 用户主UIN 
     * @return Uin 用户主UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户主UIN
     * @param Uin 用户主UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 用户AppId 
     * @return AppId 用户AppId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户AppId
     * @param AppId 用户AppId
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 开通时间 
     * @return CreateTime 开通时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 开通时间
     * @param CreateTime 开通时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public OpendThirdAccessUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpendThirdAccessUserInfo(OpendThirdAccessUserInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

