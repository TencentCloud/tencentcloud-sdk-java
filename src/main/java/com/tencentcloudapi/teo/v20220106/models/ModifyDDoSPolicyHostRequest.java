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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDDoSPolicyHostRequest extends AbstractModel{

    /**
    * 站点id
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 二级域名
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 加速开关 on-开启加速；off-关闭加速（AccelerateType：on，SecurityType：on，安全加速，未开防护增强；AccelerateType：off，SecurityType：on，安全加速，开启防护增强；AccelerateType：on，SecurityType：off，内容加速，未开防护增强）
    */
    @SerializedName("AccelerateType")
    @Expose
    private String AccelerateType;

    /**
    * 策略id
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 安全开关 on-开启安全；off-关闭安全（AccelerateType：on，SecurityType：on，安全加速，未开防护增强；AccelerateType：off，SecurityType：on，安全加速，开启防护增强；AccelerateType：on，SecurityType：off，内容加速，未开防护增强）
    */
    @SerializedName("SecurityType")
    @Expose
    private String SecurityType;

    /**
     * Get 站点id 
     * @return ZoneId 站点id
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点id
     * @param ZoneId 站点id
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 二级域名 
     * @return Host 二级域名
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 二级域名
     * @param Host 二级域名
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 加速开关 on-开启加速；off-关闭加速（AccelerateType：on，SecurityType：on，安全加速，未开防护增强；AccelerateType：off，SecurityType：on，安全加速，开启防护增强；AccelerateType：on，SecurityType：off，内容加速，未开防护增强） 
     * @return AccelerateType 加速开关 on-开启加速；off-关闭加速（AccelerateType：on，SecurityType：on，安全加速，未开防护增强；AccelerateType：off，SecurityType：on，安全加速，开启防护增强；AccelerateType：on，SecurityType：off，内容加速，未开防护增强）
     */
    public String getAccelerateType() {
        return this.AccelerateType;
    }

    /**
     * Set 加速开关 on-开启加速；off-关闭加速（AccelerateType：on，SecurityType：on，安全加速，未开防护增强；AccelerateType：off，SecurityType：on，安全加速，开启防护增强；AccelerateType：on，SecurityType：off，内容加速，未开防护增强）
     * @param AccelerateType 加速开关 on-开启加速；off-关闭加速（AccelerateType：on，SecurityType：on，安全加速，未开防护增强；AccelerateType：off，SecurityType：on，安全加速，开启防护增强；AccelerateType：on，SecurityType：off，内容加速，未开防护增强）
     */
    public void setAccelerateType(String AccelerateType) {
        this.AccelerateType = AccelerateType;
    }

    /**
     * Get 策略id 
     * @return PolicyId 策略id
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略id
     * @param PolicyId 策略id
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 安全开关 on-开启安全；off-关闭安全（AccelerateType：on，SecurityType：on，安全加速，未开防护增强；AccelerateType：off，SecurityType：on，安全加速，开启防护增强；AccelerateType：on，SecurityType：off，内容加速，未开防护增强） 
     * @return SecurityType 安全开关 on-开启安全；off-关闭安全（AccelerateType：on，SecurityType：on，安全加速，未开防护增强；AccelerateType：off，SecurityType：on，安全加速，开启防护增强；AccelerateType：on，SecurityType：off，内容加速，未开防护增强）
     */
    public String getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set 安全开关 on-开启安全；off-关闭安全（AccelerateType：on，SecurityType：on，安全加速，未开防护增强；AccelerateType：off，SecurityType：on，安全加速，开启防护增强；AccelerateType：on，SecurityType：off，内容加速，未开防护增强）
     * @param SecurityType 安全开关 on-开启安全；off-关闭安全（AccelerateType：on，SecurityType：on，安全加速，未开防护增强；AccelerateType：off，SecurityType：on，安全加速，开启防护增强；AccelerateType：on，SecurityType：off，内容加速，未开防护增强）
     */
    public void setSecurityType(String SecurityType) {
        this.SecurityType = SecurityType;
    }

    public ModifyDDoSPolicyHostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDDoSPolicyHostRequest(ModifyDDoSPolicyHostRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.AccelerateType != null) {
            this.AccelerateType = new String(source.AccelerateType);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.SecurityType != null) {
            this.SecurityType = new String(source.SecurityType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "AccelerateType", this.AccelerateType);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "SecurityType", this.SecurityType);

    }
}

