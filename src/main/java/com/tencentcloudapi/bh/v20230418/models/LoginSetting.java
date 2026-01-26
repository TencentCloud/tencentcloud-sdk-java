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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginSetting extends AbstractModel {

    /**
    * 登录会话超时，10分钟，20分钟，30分钟，默认20分钟
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
    * 连续密码错误次数，超过锁定账号，3-5
    */
    @SerializedName("LockThreshold")
    @Expose
    private Long LockThreshold;

    /**
    * 账号锁定时长，10分钟，20分钟，30分钟
    */
    @SerializedName("LockTime")
    @Expose
    private Long LockTime;

    /**
    * 用户多少天不活跃，账号自动锁定
    */
    @SerializedName("InactiveUserLock")
    @Expose
    private Long InactiveUserLock;

    /**
     * Get 登录会话超时，10分钟，20分钟，30分钟，默认20分钟 
     * @return TimeOut 登录会话超时，10分钟，20分钟，30分钟，默认20分钟
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * Set 登录会话超时，10分钟，20分钟，30分钟，默认20分钟
     * @param TimeOut 登录会话超时，10分钟，20分钟，30分钟，默认20分钟
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * Get 连续密码错误次数，超过锁定账号，3-5 
     * @return LockThreshold 连续密码错误次数，超过锁定账号，3-5
     */
    public Long getLockThreshold() {
        return this.LockThreshold;
    }

    /**
     * Set 连续密码错误次数，超过锁定账号，3-5
     * @param LockThreshold 连续密码错误次数，超过锁定账号，3-5
     */
    public void setLockThreshold(Long LockThreshold) {
        this.LockThreshold = LockThreshold;
    }

    /**
     * Get 账号锁定时长，10分钟，20分钟，30分钟 
     * @return LockTime 账号锁定时长，10分钟，20分钟，30分钟
     */
    public Long getLockTime() {
        return this.LockTime;
    }

    /**
     * Set 账号锁定时长，10分钟，20分钟，30分钟
     * @param LockTime 账号锁定时长，10分钟，20分钟，30分钟
     */
    public void setLockTime(Long LockTime) {
        this.LockTime = LockTime;
    }

    /**
     * Get 用户多少天不活跃，账号自动锁定 
     * @return InactiveUserLock 用户多少天不活跃，账号自动锁定
     */
    public Long getInactiveUserLock() {
        return this.InactiveUserLock;
    }

    /**
     * Set 用户多少天不活跃，账号自动锁定
     * @param InactiveUserLock 用户多少天不活跃，账号自动锁定
     */
    public void setInactiveUserLock(Long InactiveUserLock) {
        this.InactiveUserLock = InactiveUserLock;
    }

    public LoginSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginSetting(LoginSetting source) {
        if (source.TimeOut != null) {
            this.TimeOut = new Long(source.TimeOut);
        }
        if (source.LockThreshold != null) {
            this.LockThreshold = new Long(source.LockThreshold);
        }
        if (source.LockTime != null) {
            this.LockTime = new Long(source.LockTime);
        }
        if (source.InactiveUserLock != null) {
            this.InactiveUserLock = new Long(source.InactiveUserLock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeOut", this.TimeOut);
        this.setParamSimple(map, prefix + "LockThreshold", this.LockThreshold);
        this.setParamSimple(map, prefix + "LockTime", this.LockTime);
        this.setParamSimple(map, prefix + "InactiveUserLock", this.InactiveUserLock);

    }
}

