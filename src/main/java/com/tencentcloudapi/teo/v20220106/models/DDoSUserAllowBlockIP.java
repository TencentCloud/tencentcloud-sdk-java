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

public class DDoSUserAllowBlockIP extends AbstractModel{

    /**
    * 客户端IP。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 掩码。
    */
    @SerializedName("Mask")
    @Expose
    private Long Mask;

    /**
    * 类型，取值有：
<li>block ：丢弃 ；</li>
<li>allow ：允许。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 10位时间戳，例如1199116800。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 客户端IP2，设置IP范围时使用，例如 1.1.1.1-1.1.1.2。
    */
    @SerializedName("Ip2")
    @Expose
    private String Ip2;

    /**
    * 掩码2，设置IP网段范围时使用，例如 1.1.1.0/24-1.1.2.0/24。
    */
    @SerializedName("Mask2")
    @Expose
    private Long Mask2;

    /**
     * Get 客户端IP。 
     * @return Ip 客户端IP。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 客户端IP。
     * @param Ip 客户端IP。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 掩码。 
     * @return Mask 掩码。
     */
    public Long getMask() {
        return this.Mask;
    }

    /**
     * Set 掩码。
     * @param Mask 掩码。
     */
    public void setMask(Long Mask) {
        this.Mask = Mask;
    }

    /**
     * Get 类型，取值有：
<li>block ：丢弃 ；</li>
<li>allow ：允许。</li> 
     * @return Type 类型，取值有：
<li>block ：丢弃 ；</li>
<li>allow ：允许。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型，取值有：
<li>block ：丢弃 ；</li>
<li>allow ：允许。</li>
     * @param Type 类型，取值有：
<li>block ：丢弃 ；</li>
<li>allow ：允许。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 10位时间戳，例如1199116800。 
     * @return UpdateTime 10位时间戳，例如1199116800。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 10位时间戳，例如1199116800。
     * @param UpdateTime 10位时间戳，例如1199116800。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 客户端IP2，设置IP范围时使用，例如 1.1.1.1-1.1.1.2。 
     * @return Ip2 客户端IP2，设置IP范围时使用，例如 1.1.1.1-1.1.1.2。
     */
    public String getIp2() {
        return this.Ip2;
    }

    /**
     * Set 客户端IP2，设置IP范围时使用，例如 1.1.1.1-1.1.1.2。
     * @param Ip2 客户端IP2，设置IP范围时使用，例如 1.1.1.1-1.1.1.2。
     */
    public void setIp2(String Ip2) {
        this.Ip2 = Ip2;
    }

    /**
     * Get 掩码2，设置IP网段范围时使用，例如 1.1.1.0/24-1.1.2.0/24。 
     * @return Mask2 掩码2，设置IP网段范围时使用，例如 1.1.1.0/24-1.1.2.0/24。
     */
    public Long getMask2() {
        return this.Mask2;
    }

    /**
     * Set 掩码2，设置IP网段范围时使用，例如 1.1.1.0/24-1.1.2.0/24。
     * @param Mask2 掩码2，设置IP网段范围时使用，例如 1.1.1.0/24-1.1.2.0/24。
     */
    public void setMask2(Long Mask2) {
        this.Mask2 = Mask2;
    }

    public DDoSUserAllowBlockIP() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSUserAllowBlockIP(DDoSUserAllowBlockIP source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Mask != null) {
            this.Mask = new Long(source.Mask);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Ip2 != null) {
            this.Ip2 = new String(source.Ip2);
        }
        if (source.Mask2 != null) {
            this.Mask2 = new Long(source.Mask2);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Mask", this.Mask);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Ip2", this.Ip2);
        this.setParamSimple(map, prefix + "Mask2", this.Mask2);

    }
}

