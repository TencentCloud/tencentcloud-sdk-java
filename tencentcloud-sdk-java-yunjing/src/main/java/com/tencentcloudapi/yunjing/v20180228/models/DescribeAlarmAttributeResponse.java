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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmAttributeResponse extends AbstractModel{

    /**
    * 防护软件离线告警状态：
<li>OPEN：告警已开启</li>
<li>CLOSE： 告警已关闭</li>
    */
    @SerializedName("Offline")
    @Expose
    private String Offline;

    /**
    * 发现木马告警状态：
<li>OPEN：告警已开启</li>
<li>CLOSE： 告警已关闭</li>
    */
    @SerializedName("Malware")
    @Expose
    private String Malware;

    /**
    * 发现异地登录告警状态：
<li>OPEN：告警已开启</li>
<li>CLOSE： 告警已关闭</li>
    */
    @SerializedName("NonlocalLogin")
    @Expose
    private String NonlocalLogin;

    /**
    * 被暴力破解成功告警状态：
<li>OPEN：告警已开启</li>
<li>CLOSE： 告警已关闭</li>
    */
    @SerializedName("CrackSuccess")
    @Expose
    private String CrackSuccess;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 防护软件离线告警状态：
<li>OPEN：告警已开启</li>
<li>CLOSE： 告警已关闭</li> 
     * @return Offline 防护软件离线告警状态：
<li>OPEN：告警已开启</li>
<li>CLOSE： 告警已关闭</li>
     */
    public String getOffline() {
        return this.Offline;
    }

    /**
     * Set 防护软件离线告警状态：
<li>OPEN：告警已开启</li>
<li>CLOSE： 告警已关闭</li>
     * @param Offline 防护软件离线告警状态：
<li>OPEN：告警已开启</li>
<li>CLOSE： 告警已关闭</li>
     */
    public void setOffline(String Offline) {
        this.Offline = Offline;
    }

    /**
     * Get 发现木马告警状态：
<li>OPEN：告警已开启</li>
<li>CLOSE： 告警已关闭</li> 
     * @return Malware 发现木马告警状态：
<li>OPEN：告警已开启</li>
<li>CLOSE： 告警已关闭</li>
     */
    public String getMalware() {
        return this.Malware;
    }

    /**
     * Set 发现木马告警状态：
<li>OPEN：告警已开启</li>
<li>CLOSE： 告警已关闭</li>
     * @param Malware 发现木马告警状态：
<li>OPEN：告警已开启</li>
<li>CLOSE： 告警已关闭</li>
     */
    public void setMalware(String Malware) {
        this.Malware = Malware;
    }

    /**
     * Get 发现异地登录告警状态：
<li>OPEN：告警已开启</li>
<li>CLOSE： 告警已关闭</li> 
     * @return NonlocalLogin 发现异地登录告警状态：
<li>OPEN：告警已开启</li>
<li>CLOSE： 告警已关闭</li>
     */
    public String getNonlocalLogin() {
        return this.NonlocalLogin;
    }

    /**
     * Set 发现异地登录告警状态：
<li>OPEN：告警已开启</li>
<li>CLOSE： 告警已关闭</li>
     * @param NonlocalLogin 发现异地登录告警状态：
<li>OPEN：告警已开启</li>
<li>CLOSE： 告警已关闭</li>
     */
    public void setNonlocalLogin(String NonlocalLogin) {
        this.NonlocalLogin = NonlocalLogin;
    }

    /**
     * Get 被暴力破解成功告警状态：
<li>OPEN：告警已开启</li>
<li>CLOSE： 告警已关闭</li> 
     * @return CrackSuccess 被暴力破解成功告警状态：
<li>OPEN：告警已开启</li>
<li>CLOSE： 告警已关闭</li>
     */
    public String getCrackSuccess() {
        return this.CrackSuccess;
    }

    /**
     * Set 被暴力破解成功告警状态：
<li>OPEN：告警已开启</li>
<li>CLOSE： 告警已关闭</li>
     * @param CrackSuccess 被暴力破解成功告警状态：
<li>OPEN：告警已开启</li>
<li>CLOSE： 告警已关闭</li>
     */
    public void setCrackSuccess(String CrackSuccess) {
        this.CrackSuccess = CrackSuccess;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offline", this.Offline);
        this.setParamSimple(map, prefix + "Malware", this.Malware);
        this.setParamSimple(map, prefix + "NonlocalLogin", this.NonlocalLogin);
        this.setParamSimple(map, prefix + "CrackSuccess", this.CrackSuccess);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

