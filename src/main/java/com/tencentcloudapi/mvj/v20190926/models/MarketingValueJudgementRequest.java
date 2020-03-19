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
package com.tencentcloudapi.mvj.v20190926.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MarketingValueJudgementRequest extends AbstractModel{

    /**
    * 手机账号类型填写4
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * 填写手机号码，如15317537488
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 用户请求时的客户端外网IP
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 用户操作时间戳，单位秒（格林威治时间精确到秒，如1501590972）
    */
    @SerializedName("PostTime")
    @Expose
    private Long PostTime;

    /**
    * 用户设备号imei/idfa(建议填写)
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
    * 活动链接(建议填写)
    */
    @SerializedName("Referer")
    @Expose
    private String Referer;

    /**
     * Get 手机账号类型填写4 
     * @return AccountType 手机账号类型填写4
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 手机账号类型填写4
     * @param AccountType 手机账号类型填写4
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 填写手机号码，如15317537488 
     * @return Uid 填写手机号码，如15317537488
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 填写手机号码，如15317537488
     * @param Uid 填写手机号码，如15317537488
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 用户请求时的客户端外网IP 
     * @return UserIp 用户请求时的客户端外网IP
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 用户请求时的客户端外网IP
     * @param UserIp 用户请求时的客户端外网IP
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get 用户操作时间戳，单位秒（格林威治时间精确到秒，如1501590972） 
     * @return PostTime 用户操作时间戳，单位秒（格林威治时间精确到秒，如1501590972）
     */
    public Long getPostTime() {
        return this.PostTime;
    }

    /**
     * Set 用户操作时间戳，单位秒（格林威治时间精确到秒，如1501590972）
     * @param PostTime 用户操作时间戳，单位秒（格林威治时间精确到秒，如1501590972）
     */
    public void setPostTime(Long PostTime) {
        this.PostTime = PostTime;
    }

    /**
     * Get 用户设备号imei/idfa(建议填写) 
     * @return Imei 用户设备号imei/idfa(建议填写)
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * Set 用户设备号imei/idfa(建议填写)
     * @param Imei 用户设备号imei/idfa(建议填写)
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * Get 活动链接(建议填写) 
     * @return Referer 活动链接(建议填写)
     */
    public String getReferer() {
        return this.Referer;
    }

    /**
     * Set 活动链接(建议填写)
     * @param Referer 活动链接(建议填写)
     */
    public void setReferer(String Referer) {
        this.Referer = Referer;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "PostTime", this.PostTime);
        this.setParamSimple(map, prefix + "Imei", this.Imei);
        this.setParamSimple(map, prefix + "Referer", this.Referer);

    }
}

