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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecretAccountInfo extends AbstractModel {

    /**
    * <p>账户名称</p>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>账户登录主机</p>
    */
    @SerializedName("Host")
    @Expose
    private String [] Host;

    /**
    * <p>账号状态（生效中/待轮转）</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>账号轮转时间</p>
    */
    @SerializedName("RotatedTime")
    @Expose
    private String RotatedTime;

    /**
     * Get <p>账户名称</p> 
     * @return AccountName <p>账户名称</p>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>账户名称</p>
     * @param AccountName <p>账户名称</p>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>账户登录主机</p> 
     * @return Host <p>账户登录主机</p>
     */
    public String [] getHost() {
        return this.Host;
    }

    /**
     * Set <p>账户登录主机</p>
     * @param Host <p>账户登录主机</p>
     */
    public void setHost(String [] Host) {
        this.Host = Host;
    }

    /**
     * Get <p>账号状态（生效中/待轮转）</p> 
     * @return Version <p>账号状态（生效中/待轮转）</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>账号状态（生效中/待轮转）</p>
     * @param Version <p>账号状态（生效中/待轮转）</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>账号轮转时间</p> 
     * @return RotatedTime <p>账号轮转时间</p>
     */
    public String getRotatedTime() {
        return this.RotatedTime;
    }

    /**
     * Set <p>账号轮转时间</p>
     * @param RotatedTime <p>账号轮转时间</p>
     */
    public void setRotatedTime(String RotatedTime) {
        this.RotatedTime = RotatedTime;
    }

    public SecretAccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecretAccountInfo(SecretAccountInfo source) {
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Host != null) {
            this.Host = new String[source.Host.length];
            for (int i = 0; i < source.Host.length; i++) {
                this.Host[i] = new String(source.Host[i]);
            }
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.RotatedTime != null) {
            this.RotatedTime = new String(source.RotatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamArraySimple(map, prefix + "Host.", this.Host);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "RotatedTime", this.RotatedTime);

    }
}

