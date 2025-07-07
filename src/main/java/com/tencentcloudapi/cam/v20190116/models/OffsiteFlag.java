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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OffsiteFlag extends AbstractModel {

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
    * 提示
    */
    @SerializedName("Tips")
    @Expose
    private Long Tips;

    /**
     * Get 验证标识 
     * @return VerifyFlag 验证标识
     */
    public Long getVerifyFlag() {
        return this.VerifyFlag;
    }

    /**
     * Set 验证标识
     * @param VerifyFlag 验证标识
     */
    public void setVerifyFlag(Long VerifyFlag) {
        this.VerifyFlag = VerifyFlag;
    }

    /**
     * Get 手机通知 
     * @return NotifyPhone 手机通知
     */
    public Long getNotifyPhone() {
        return this.NotifyPhone;
    }

    /**
     * Set 手机通知
     * @param NotifyPhone 手机通知
     */
    public void setNotifyPhone(Long NotifyPhone) {
        this.NotifyPhone = NotifyPhone;
    }

    /**
     * Get 邮箱通知 
     * @return NotifyEmail 邮箱通知
     */
    public Long getNotifyEmail() {
        return this.NotifyEmail;
    }

    /**
     * Set 邮箱通知
     * @param NotifyEmail 邮箱通知
     */
    public void setNotifyEmail(Long NotifyEmail) {
        this.NotifyEmail = NotifyEmail;
    }

    /**
     * Get 微信通知 
     * @return NotifyWechat 微信通知
     */
    public Long getNotifyWechat() {
        return this.NotifyWechat;
    }

    /**
     * Set 微信通知
     * @param NotifyWechat 微信通知
     */
    public void setNotifyWechat(Long NotifyWechat) {
        this.NotifyWechat = NotifyWechat;
    }

    /**
     * Get 提示 
     * @return Tips 提示
     */
    public Long getTips() {
        return this.Tips;
    }

    /**
     * Set 提示
     * @param Tips 提示
     */
    public void setTips(Long Tips) {
        this.Tips = Tips;
    }

    public OffsiteFlag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OffsiteFlag(OffsiteFlag source) {
        if (source.VerifyFlag != null) {
            this.VerifyFlag = new Long(source.VerifyFlag);
        }
        if (source.NotifyPhone != null) {
            this.NotifyPhone = new Long(source.NotifyPhone);
        }
        if (source.NotifyEmail != null) {
            this.NotifyEmail = new Long(source.NotifyEmail);
        }
        if (source.NotifyWechat != null) {
            this.NotifyWechat = new Long(source.NotifyWechat);
        }
        if (source.Tips != null) {
            this.Tips = new Long(source.Tips);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VerifyFlag", this.VerifyFlag);
        this.setParamSimple(map, prefix + "NotifyPhone", this.NotifyPhone);
        this.setParamSimple(map, prefix + "NotifyEmail", this.NotifyEmail);
        this.setParamSimple(map, prefix + "NotifyWechat", this.NotifyWechat);
        this.setParamSimple(map, prefix + "Tips", this.Tips);

    }
}

