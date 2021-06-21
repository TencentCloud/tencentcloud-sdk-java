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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListenerCcThreholdConfig extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 协议（可取值htttps）
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 开关状态（0：关闭，1：开启）
    */
    @SerializedName("CCEnable")
    @Expose
    private Long CCEnable;

    /**
    * cc防护阈值
    */
    @SerializedName("CCThreshold")
    @Expose
    private Long CCThreshold;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 协议（可取值htttps） 
     * @return Protocol 协议（可取值htttps）
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议（可取值htttps）
     * @param Protocol 协议（可取值htttps）
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 开关状态（0：关闭，1：开启） 
     * @return CCEnable 开关状态（0：关闭，1：开启）
     */
    public Long getCCEnable() {
        return this.CCEnable;
    }

    /**
     * Set 开关状态（0：关闭，1：开启）
     * @param CCEnable 开关状态（0：关闭，1：开启）
     */
    public void setCCEnable(Long CCEnable) {
        this.CCEnable = CCEnable;
    }

    /**
     * Get cc防护阈值 
     * @return CCThreshold cc防护阈值
     */
    public Long getCCThreshold() {
        return this.CCThreshold;
    }

    /**
     * Set cc防护阈值
     * @param CCThreshold cc防护阈值
     */
    public void setCCThreshold(Long CCThreshold) {
        this.CCThreshold = CCThreshold;
    }

    public ListenerCcThreholdConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListenerCcThreholdConfig(ListenerCcThreholdConfig source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.CCEnable != null) {
            this.CCEnable = new Long(source.CCEnable);
        }
        if (source.CCThreshold != null) {
            this.CCThreshold = new Long(source.CCThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "CCEnable", this.CCEnable);
        this.setParamSimple(map, prefix + "CCThreshold", this.CCThreshold);

    }
}

