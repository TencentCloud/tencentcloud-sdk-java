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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OffsiteFlag  extends AbstractModel{

    /**
    * 验证标识
    */
    @SerializedName("VerifyFlag")
    @Expose
    private Long VerifyFlag;

    /**
    * 手机通知
    */
    @SerializedName("NotifyPhone")
    @Expose
    private Long NotifyPhone;

    /**
    * 邮箱通知
    */
    @SerializedName("NotifyEmail")
    @Expose
    private Long NotifyEmail;

    /**
    * 微信通知
    */
    @SerializedName("NotifyWechat")
    @Expose
    private Long NotifyWechat;

    /**
     * 获取验证标识
     * @return VerifyFlag 验证标识
     */
    public Long getVerifyFlag() {
        return this.VerifyFlag;
    }

    /**
     * 设置验证标识
     * @param VerifyFlag 验证标识
     */
    public void setVerifyFlag(Long VerifyFlag) {
        this.VerifyFlag = VerifyFlag;
    }

    /**
     * 获取手机通知
     * @return NotifyPhone 手机通知
     */
    public Long getNotifyPhone() {
        return this.NotifyPhone;
    }

    /**
     * 设置手机通知
     * @param NotifyPhone 手机通知
     */
    public void setNotifyPhone(Long NotifyPhone) {
        this.NotifyPhone = NotifyPhone;
    }

    /**
     * 获取邮箱通知
     * @return NotifyEmail 邮箱通知
     */
    public Long getNotifyEmail() {
        return this.NotifyEmail;
    }

    /**
     * 设置邮箱通知
     * @param NotifyEmail 邮箱通知
     */
    public void setNotifyEmail(Long NotifyEmail) {
        this.NotifyEmail = NotifyEmail;
    }

    /**
     * 获取微信通知
     * @return NotifyWechat 微信通知
     */
    public Long getNotifyWechat() {
        return this.NotifyWechat;
    }

    /**
     * 设置微信通知
     * @param NotifyWechat 微信通知
     */
    public void setNotifyWechat(Long NotifyWechat) {
        this.NotifyWechat = NotifyWechat;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VerifyFlag", this.VerifyFlag);
        this.setParamSimple(map, prefix + "NotifyPhone", this.NotifyPhone);
        this.setParamSimple(map, prefix + "NotifyEmail", this.NotifyEmail);
        this.setParamSimple(map, prefix + "NotifyWechat", this.NotifyWechat);

    }
}

