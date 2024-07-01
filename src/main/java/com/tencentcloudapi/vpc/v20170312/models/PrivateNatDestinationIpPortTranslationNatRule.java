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

public class PrivateNatDestinationIpPortTranslationNatRule extends AbstractModel {

    /**
    * 协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 原端口
    */
    @SerializedName("OriginalPort")
    @Expose
    private Long OriginalPort;

    /**
    * 原IP
    */
    @SerializedName("OriginalIp")
    @Expose
    private String OriginalIp;

    /**
    * 映射端口
    */
    @SerializedName("TranslationPort")
    @Expose
    private Long TranslationPort;

    /**
    * 映射IP
    */
    @SerializedName("TranslationIp")
    @Expose
    private String TranslationIp;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

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
     * Get 原端口 
     * @return OriginalPort 原端口
     */
    public Long getOriginalPort() {
        return this.OriginalPort;
    }

    /**
     * Set 原端口
     * @param OriginalPort 原端口
     */
    public void setOriginalPort(Long OriginalPort) {
        this.OriginalPort = OriginalPort;
    }

    /**
     * Get 原IP 
     * @return OriginalIp 原IP
     */
    public String getOriginalIp() {
        return this.OriginalIp;
    }

    /**
     * Set 原IP
     * @param OriginalIp 原IP
     */
    public void setOriginalIp(String OriginalIp) {
        this.OriginalIp = OriginalIp;
    }

    /**
     * Get 映射端口 
     * @return TranslationPort 映射端口
     */
    public Long getTranslationPort() {
        return this.TranslationPort;
    }

    /**
     * Set 映射端口
     * @param TranslationPort 映射端口
     */
    public void setTranslationPort(Long TranslationPort) {
        this.TranslationPort = TranslationPort;
    }

    /**
     * Get 映射IP 
     * @return TranslationIp 映射IP
     */
    public String getTranslationIp() {
        return this.TranslationIp;
    }

    /**
     * Set 映射IP
     * @param TranslationIp 映射IP
     */
    public void setTranslationIp(String TranslationIp) {
        this.TranslationIp = TranslationIp;
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

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间。 
     * @return UpdateTime 更新时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。
     * @param UpdateTime 更新时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public PrivateNatDestinationIpPortTranslationNatRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivateNatDestinationIpPortTranslationNatRule(PrivateNatDestinationIpPortTranslationNatRule source) {
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
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
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
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

