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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReservedDomainInfo extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 注册时间
    */
    @SerializedName("RegTime")
    @Expose
    private String RegTime;

    /**
    * 到期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 续费时间结束
    */
    @SerializedName("RenewEndTime")
    @Expose
    private String RenewEndTime;

    /**
    * 赎回结束时间
    */
    @SerializedName("RestoreEndTime")
    @Expose
    private String RestoreEndTime;

    /**
    * 域名预约结束时间
    */
    @SerializedName("ReservedEndTime")
    @Expose
    private String ReservedEndTime;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 注册时间 
     * @return RegTime 注册时间
     */
    public String getRegTime() {
        return this.RegTime;
    }

    /**
     * Set 注册时间
     * @param RegTime 注册时间
     */
    public void setRegTime(String RegTime) {
        this.RegTime = RegTime;
    }

    /**
     * Get 到期时间 
     * @return ExpireTime 到期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 到期时间
     * @param ExpireTime 到期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 续费时间结束 
     * @return RenewEndTime 续费时间结束
     */
    public String getRenewEndTime() {
        return this.RenewEndTime;
    }

    /**
     * Set 续费时间结束
     * @param RenewEndTime 续费时间结束
     */
    public void setRenewEndTime(String RenewEndTime) {
        this.RenewEndTime = RenewEndTime;
    }

    /**
     * Get 赎回结束时间 
     * @return RestoreEndTime 赎回结束时间
     */
    public String getRestoreEndTime() {
        return this.RestoreEndTime;
    }

    /**
     * Set 赎回结束时间
     * @param RestoreEndTime 赎回结束时间
     */
    public void setRestoreEndTime(String RestoreEndTime) {
        this.RestoreEndTime = RestoreEndTime;
    }

    /**
     * Get 域名预约结束时间 
     * @return ReservedEndTime 域名预约结束时间
     */
    public String getReservedEndTime() {
        return this.ReservedEndTime;
    }

    /**
     * Set 域名预约结束时间
     * @param ReservedEndTime 域名预约结束时间
     */
    public void setReservedEndTime(String ReservedEndTime) {
        this.ReservedEndTime = ReservedEndTime;
    }

    public ReservedDomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReservedDomainInfo(ReservedDomainInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RegTime != null) {
            this.RegTime = new String(source.RegTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.RenewEndTime != null) {
            this.RenewEndTime = new String(source.RenewEndTime);
        }
        if (source.RestoreEndTime != null) {
            this.RestoreEndTime = new String(source.RestoreEndTime);
        }
        if (source.ReservedEndTime != null) {
            this.ReservedEndTime = new String(source.ReservedEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RegTime", this.RegTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "RenewEndTime", this.RenewEndTime);
        this.setParamSimple(map, prefix + "RestoreEndTime", this.RestoreEndTime);
        this.setParamSimple(map, prefix + "ReservedEndTime", this.ReservedEndTime);

    }
}

