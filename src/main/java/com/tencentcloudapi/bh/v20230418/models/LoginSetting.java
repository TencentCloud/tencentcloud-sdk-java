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
    * <p>登录会话超时，10分钟，20分钟，30分钟，默认20分钟</p>
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
    * <p>连续密码错误次数，超过锁定账号，3-5</p>
    */
    @SerializedName("LockThreshold")
    @Expose
    private Long LockThreshold;

    /**
    * <p>账号锁定时长，10分钟，20分钟，30分钟</p>
    */
    @SerializedName("LockTime")
    @Expose
    private Long LockTime;

    /**
    * <p>用户多少天不活跃，账号自动锁定</p>
    */
    @SerializedName("InactiveUserLock")
    @Expose
    private Long InactiveUserLock;

    /**
    * <p>运维账号单点登录开关：0-关闭，1-开启</p>
    */
    @SerializedName("EnableSingleLogin")
    @Expose
    private Long EnableSingleLogin;

    /**
     * Get <p>登录会话超时，10分钟，20分钟，30分钟，默认20分钟</p> 
     * @return TimeOut <p>登录会话超时，10分钟，20分钟，30分钟，默认20分钟</p>
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * Set <p>登录会话超时，10分钟，20分钟，30分钟，默认20分钟</p>
     * @param TimeOut <p>登录会话超时，10分钟，20分钟，30分钟，默认20分钟</p>
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * Get <p>连续密码错误次数，超过锁定账号，3-5</p> 
     * @return LockThreshold <p>连续密码错误次数，超过锁定账号，3-5</p>
     */
    public Long getLockThreshold() {
        return this.LockThreshold;
    }

    /**
     * Set <p>连续密码错误次数，超过锁定账号，3-5</p>
     * @param LockThreshold <p>连续密码错误次数，超过锁定账号，3-5</p>
     */
    public void setLockThreshold(Long LockThreshold) {
        this.LockThreshold = LockThreshold;
    }

    /**
     * Get <p>账号锁定时长，10分钟，20分钟，30分钟</p> 
     * @return LockTime <p>账号锁定时长，10分钟，20分钟，30分钟</p>
     */
    public Long getLockTime() {
        return this.LockTime;
    }

    /**
     * Set <p>账号锁定时长，10分钟，20分钟，30分钟</p>
     * @param LockTime <p>账号锁定时长，10分钟，20分钟，30分钟</p>
     */
    public void setLockTime(Long LockTime) {
        this.LockTime = LockTime;
    }

    /**
     * Get <p>用户多少天不活跃，账号自动锁定</p> 
     * @return InactiveUserLock <p>用户多少天不活跃，账号自动锁定</p>
     */
    public Long getInactiveUserLock() {
        return this.InactiveUserLock;
    }

    /**
     * Set <p>用户多少天不活跃，账号自动锁定</p>
     * @param InactiveUserLock <p>用户多少天不活跃，账号自动锁定</p>
     */
    public void setInactiveUserLock(Long InactiveUserLock) {
        this.InactiveUserLock = InactiveUserLock;
    }

    /**
     * Get <p>运维账号单点登录开关：0-关闭，1-开启</p> 
     * @return EnableSingleLogin <p>运维账号单点登录开关：0-关闭，1-开启</p>
     */
    public Long getEnableSingleLogin() {
        return this.EnableSingleLogin;
    }

    /**
     * Set <p>运维账号单点登录开关：0-关闭，1-开启</p>
     * @param EnableSingleLogin <p>运维账号单点登录开关：0-关闭，1-开启</p>
     */
    public void setEnableSingleLogin(Long EnableSingleLogin) {
        this.EnableSingleLogin = EnableSingleLogin;
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
        if (source.EnableSingleLogin != null) {
            this.EnableSingleLogin = new Long(source.EnableSingleLogin);
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
        this.setParamSimple(map, prefix + "EnableSingleLogin", this.EnableSingleLogin);

    }
}

