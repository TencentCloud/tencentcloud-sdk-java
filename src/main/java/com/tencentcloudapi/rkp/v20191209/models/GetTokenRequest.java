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
package com.tencentcloudapi.rkp.v20191209.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTokenRequest extends AbstractModel{

    /**
    * 业务ID
    */
    @SerializedName("BusinessId")
    @Expose
    private Long BusinessId;

    /**
    * 业务子场景
    */
    @SerializedName("Scene")
    @Expose
    private Long Scene;

    /**
    * 业务侧账号体系下的用户ID
    */
    @SerializedName("BusinessUserId")
    @Expose
    private String BusinessUserId;

    /**
    * 用户侧的IP
    */
    @SerializedName("AppClientIp")
    @Expose
    private String AppClientIp;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 上一个token
    */
    @SerializedName("OldToken")
    @Expose
    private String OldToken;

    /**
     * Get 业务ID 
     * @return BusinessId 业务ID
     */
    public Long getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 业务ID
     * @param BusinessId 业务ID
     */
    public void setBusinessId(Long BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 业务子场景 
     * @return Scene 业务子场景
     */
    public Long getScene() {
        return this.Scene;
    }

    /**
     * Set 业务子场景
     * @param Scene 业务子场景
     */
    public void setScene(Long Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 业务侧账号体系下的用户ID 
     * @return BusinessUserId 业务侧账号体系下的用户ID
     */
    public String getBusinessUserId() {
        return this.BusinessUserId;
    }

    /**
     * Set 业务侧账号体系下的用户ID
     * @param BusinessUserId 业务侧账号体系下的用户ID
     */
    public void setBusinessUserId(String BusinessUserId) {
        this.BusinessUserId = BusinessUserId;
    }

    /**
     * Get 用户侧的IP 
     * @return AppClientIp 用户侧的IP
     */
    public String getAppClientIp() {
        return this.AppClientIp;
    }

    /**
     * Set 用户侧的IP
     * @param AppClientIp 用户侧的IP
     */
    public void setAppClientIp(String AppClientIp) {
        this.AppClientIp = AppClientIp;
    }

    /**
     * Get 过期时间 
     * @return ExpireTime 过期时间
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 上一个token 
     * @return OldToken 上一个token
     */
    public String getOldToken() {
        return this.OldToken;
    }

    /**
     * Set 上一个token
     * @param OldToken 上一个token
     */
    public void setOldToken(String OldToken) {
        this.OldToken = OldToken;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "BusinessUserId", this.BusinessUserId);
        this.setParamSimple(map, prefix + "AppClientIp", this.AppClientIp);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "OldToken", this.OldToken);

    }
}

