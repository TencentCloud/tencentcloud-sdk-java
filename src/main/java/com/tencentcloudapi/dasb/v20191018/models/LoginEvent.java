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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginEvent extends AbstractModel{

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 姓名
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * 操作时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 来源IP
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * 登录入口：1-字符界面,2-图形界面，3-web页面, 4-API
    */
    @SerializedName("Entry")
    @Expose
    private Long Entry;

    /**
    * 操作结果，1-成功，2-失败
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 姓名 
     * @return RealName 姓名
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set 姓名
     * @param RealName 姓名
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get 操作时间 
     * @return Time 操作时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 操作时间
     * @param Time 操作时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 来源IP 
     * @return SourceIp 来源IP
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set 来源IP
     * @param SourceIp 来源IP
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get 登录入口：1-字符界面,2-图形界面，3-web页面, 4-API 
     * @return Entry 登录入口：1-字符界面,2-图形界面，3-web页面, 4-API
     */
    public Long getEntry() {
        return this.Entry;
    }

    /**
     * Set 登录入口：1-字符界面,2-图形界面，3-web页面, 4-API
     * @param Entry 登录入口：1-字符界面,2-图形界面，3-web页面, 4-API
     */
    public void setEntry(Long Entry) {
        this.Entry = Entry;
    }

    /**
     * Get 操作结果，1-成功，2-失败 
     * @return Result 操作结果，1-成功，2-失败
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 操作结果，1-成功，2-失败
     * @param Result 操作结果，1-成功，2-失败
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    public LoginEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginEvent(LoginEvent source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.RealName != null) {
            this.RealName = new String(source.RealName);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.Entry != null) {
            this.Entry = new Long(source.Entry);
        }
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "Entry", this.Entry);
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

