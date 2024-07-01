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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DestinationIpPortTranslationNatRuleDiff extends AbstractModel {

    /**
    * 协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 源端口
    */
    @SerializedName("OriginalPort")
    @Expose
    private Long OriginalPort;

    /**
    * 源IP
    */
    @SerializedName("OriginalIp")
    @Expose
    private String OriginalIp;

    /**
    * 目的端口
    */
    @SerializedName("TranslationPort")
    @Expose
    private Long TranslationPort;

    /**
    * 目的IP
    */
    @SerializedName("TranslationIp")
    @Expose
    private String TranslationIp;

    /**
    * 旧协议。
    */
    @SerializedName("OldProtocol")
    @Expose
    private String OldProtocol;

    /**
    * 旧源端口
    */
    @SerializedName("OldOriginalPort")
    @Expose
    private Long OldOriginalPort;

    /**
    * 旧源IP
    */
    @SerializedName("OldOriginalIp")
    @Expose
    private String OldOriginalIp;

    /**
    * 旧目的端口
    */
    @SerializedName("OldTranslationPort")
    @Expose
    private Long OldTranslationPort;

    /**
    * 旧目的IP
    */
    @SerializedName("OldTranslationIp")
    @Expose
    private String OldTranslationIp;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 协议 
     * @return Protocol 协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议
     * @param Protocol 协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 源端口 
     * @return OriginalPort 源端口
     */
    public Long getOriginalPort() {
        return this.OriginalPort;
    }

    /**
     * Set 源端口
     * @param OriginalPort 源端口
     */
    public void setOriginalPort(Long OriginalPort) {
        this.OriginalPort = OriginalPort;
    }

    /**
     * Get 源IP 
     * @return OriginalIp 源IP
     */
    public String getOriginalIp() {
        return this.OriginalIp;
    }

    /**
     * Set 源IP
     * @param OriginalIp 源IP
     */
    public void setOriginalIp(String OriginalIp) {
        this.OriginalIp = OriginalIp;
    }

    /**
     * Get 目的端口 
     * @return TranslationPort 目的端口
     */
    public Long getTranslationPort() {
        return this.TranslationPort;
    }

    /**
     * Set 目的端口
     * @param TranslationPort 目的端口
     */
    public void setTranslationPort(Long TranslationPort) {
        this.TranslationPort = TranslationPort;
    }

    /**
     * Get 目的IP 
     * @return TranslationIp 目的IP
     */
    public String getTranslationIp() {
        return this.TranslationIp;
    }

    /**
     * Set 目的IP
     * @param TranslationIp 目的IP
     */
    public void setTranslationIp(String TranslationIp) {
        this.TranslationIp = TranslationIp;
    }

    /**
     * Get 旧协议。 
     * @return OldProtocol 旧协议。
     */
    public String getOldProtocol() {
        return this.OldProtocol;
    }

    /**
     * Set 旧协议。
     * @param OldProtocol 旧协议。
     */
    public void setOldProtocol(String OldProtocol) {
        this.OldProtocol = OldProtocol;
    }

    /**
     * Get 旧源端口 
     * @return OldOriginalPort 旧源端口
     */
    public Long getOldOriginalPort() {
        return this.OldOriginalPort;
    }

    /**
     * Set 旧源端口
     * @param OldOriginalPort 旧源端口
     */
    public void setOldOriginalPort(Long OldOriginalPort) {
        this.OldOriginalPort = OldOriginalPort;
    }

    /**
     * Get 旧源IP 
     * @return OldOriginalIp 旧源IP
     */
    public String getOldOriginalIp() {
        return this.OldOriginalIp;
    }

    /**
     * Set 旧源IP
     * @param OldOriginalIp 旧源IP
     */
    public void setOldOriginalIp(String OldOriginalIp) {
        this.OldOriginalIp = OldOriginalIp;
    }

    /**
     * Get 旧目的端口 
     * @return OldTranslationPort 旧目的端口
     */
    public Long getOldTranslationPort() {
        return this.OldTranslationPort;
    }

    /**
     * Set 旧目的端口
     * @param OldTranslationPort 旧目的端口
     */
    public void setOldTranslationPort(Long OldTranslationPort) {
        this.OldTranslationPort = OldTranslationPort;
    }

    /**
     * Get 旧目的IP 
     * @return OldTranslationIp 旧目的IP
     */
    public String getOldTranslationIp() {
        return this.OldTranslationIp;
    }

    /**
     * Set 旧目的IP
     * @param OldTranslationIp 旧目的IP
     */
    public void setOldTranslationIp(String OldTranslationIp) {
        this.OldTranslationIp = OldTranslationIp;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public DestinationIpPortTranslationNatRuleDiff() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DestinationIpPortTranslationNatRuleDiff(DestinationIpPortTranslationNatRuleDiff source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.OriginalPort != null) {
            this.OriginalPort = new Long(source.OriginalPort);
        }
        if (source.OriginalIp != null) {
            this.OriginalIp = new String(source.OriginalIp);
        }
        if (source.TranslationPort != null) {
            this.TranslationPort = new Long(source.TranslationPort);
        }
        if (source.TranslationIp != null) {
            this.TranslationIp = new String(source.TranslationIp);
        }
        if (source.OldProtocol != null) {
            this.OldProtocol = new String(source.OldProtocol);
        }
        if (source.OldOriginalPort != null) {
            this.OldOriginalPort = new Long(source.OldOriginalPort);
        }
        if (source.OldOriginalIp != null) {
            this.OldOriginalIp = new String(source.OldOriginalIp);
        }
        if (source.OldTranslationPort != null) {
            this.OldTranslationPort = new Long(source.OldTranslationPort);
        }
        if (source.OldTranslationIp != null) {
            this.OldTranslationIp = new String(source.OldTranslationIp);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "OriginalPort", this.OriginalPort);
        this.setParamSimple(map, prefix + "OriginalIp", this.OriginalIp);
        this.setParamSimple(map, prefix + "TranslationPort", this.TranslationPort);
        this.setParamSimple(map, prefix + "TranslationIp", this.TranslationIp);
        this.setParamSimple(map, prefix + "OldProtocol", this.OldProtocol);
        this.setParamSimple(map, prefix + "OldOriginalPort", this.OldOriginalPort);
        this.setParamSimple(map, prefix + "OldOriginalIp", this.OldOriginalIp);
        this.setParamSimple(map, prefix + "OldTranslationPort", this.OldTranslationPort);
        this.setParamSimple(map, prefix + "OldTranslationIp", this.OldTranslationIp);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

