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
package com.tencentcloudapi.trdp.v20220726.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EvaluateUserRiskRequest extends AbstractModel{

    /**
    * 账号信息
    */
    @SerializedName("Account")
    @Expose
    private AccountInfo Account;

    /**
    * 用户信息
    */
    @SerializedName("User")
    @Expose
    private UserInfo User;

    /**
    * 模型ID
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 设备指纹信息
    */
    @SerializedName("DeviceFingerprint")
    @Expose
    private DeviceFingerprintInfo DeviceFingerprint;

    /**
    * 场景Code，不传默认活动防刷；
e_activity_antirush；活动防刷场景
e_login_protection；登录保护场景
e_register_protection：注册保护场景
    */
    @SerializedName("SceneCode")
    @Expose
    private String SceneCode;

    /**
    * 设备详情
    */
    @SerializedName("DeviceDetail")
    @Expose
    private DeviceDetailInfo DeviceDetail;

    /**
    * 营销信息
    */
    @SerializedName("Marketing")
    @Expose
    private MarketingInfo Marketing;

    /**
     * Get 账号信息 
     * @return Account 账号信息
     */
    public AccountInfo getAccount() {
        return this.Account;
    }

    /**
     * Set 账号信息
     * @param Account 账号信息
     */
    public void setAccount(AccountInfo Account) {
        this.Account = Account;
    }

    /**
     * Get 用户信息 
     * @return User 用户信息
     */
    public UserInfo getUser() {
        return this.User;
    }

    /**
     * Set 用户信息
     * @param User 用户信息
     */
    public void setUser(UserInfo User) {
        this.User = User;
    }

    /**
     * Get 模型ID 
     * @return ModelId 模型ID
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模型ID
     * @param ModelId 模型ID
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 设备指纹信息 
     * @return DeviceFingerprint 设备指纹信息
     */
    public DeviceFingerprintInfo getDeviceFingerprint() {
        return this.DeviceFingerprint;
    }

    /**
     * Set 设备指纹信息
     * @param DeviceFingerprint 设备指纹信息
     */
    public void setDeviceFingerprint(DeviceFingerprintInfo DeviceFingerprint) {
        this.DeviceFingerprint = DeviceFingerprint;
    }

    /**
     * Get 场景Code，不传默认活动防刷；
e_activity_antirush；活动防刷场景
e_login_protection；登录保护场景
e_register_protection：注册保护场景 
     * @return SceneCode 场景Code，不传默认活动防刷；
e_activity_antirush；活动防刷场景
e_login_protection；登录保护场景
e_register_protection：注册保护场景
     */
    public String getSceneCode() {
        return this.SceneCode;
    }

    /**
     * Set 场景Code，不传默认活动防刷；
e_activity_antirush；活动防刷场景
e_login_protection；登录保护场景
e_register_protection：注册保护场景
     * @param SceneCode 场景Code，不传默认活动防刷；
e_activity_antirush；活动防刷场景
e_login_protection；登录保护场景
e_register_protection：注册保护场景
     */
    public void setSceneCode(String SceneCode) {
        this.SceneCode = SceneCode;
    }

    /**
     * Get 设备详情 
     * @return DeviceDetail 设备详情
     */
    public DeviceDetailInfo getDeviceDetail() {
        return this.DeviceDetail;
    }

    /**
     * Set 设备详情
     * @param DeviceDetail 设备详情
     */
    public void setDeviceDetail(DeviceDetailInfo DeviceDetail) {
        this.DeviceDetail = DeviceDetail;
    }

    /**
     * Get 营销信息 
     * @return Marketing 营销信息
     */
    public MarketingInfo getMarketing() {
        return this.Marketing;
    }

    /**
     * Set 营销信息
     * @param Marketing 营销信息
     */
    public void setMarketing(MarketingInfo Marketing) {
        this.Marketing = Marketing;
    }

    public EvaluateUserRiskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EvaluateUserRiskRequest(EvaluateUserRiskRequest source) {
        if (source.Account != null) {
            this.Account = new AccountInfo(source.Account);
        }
        if (source.User != null) {
            this.User = new UserInfo(source.User);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.DeviceFingerprint != null) {
            this.DeviceFingerprint = new DeviceFingerprintInfo(source.DeviceFingerprint);
        }
        if (source.SceneCode != null) {
            this.SceneCode = new String(source.SceneCode);
        }
        if (source.DeviceDetail != null) {
            this.DeviceDetail = new DeviceDetailInfo(source.DeviceDetail);
        }
        if (source.Marketing != null) {
            this.Marketing = new MarketingInfo(source.Marketing);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Account.", this.Account);
        this.setParamObj(map, prefix + "User.", this.User);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamObj(map, prefix + "DeviceFingerprint.", this.DeviceFingerprint);
        this.setParamSimple(map, prefix + "SceneCode", this.SceneCode);
        this.setParamObj(map, prefix + "DeviceDetail.", this.DeviceDetail);
        this.setParamObj(map, prefix + "Marketing.", this.Marketing);

    }
}

