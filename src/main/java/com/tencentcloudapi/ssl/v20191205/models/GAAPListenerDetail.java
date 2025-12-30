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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GAAPListenerDetail extends AbstractModel {

    /**
    * 监听器状态
    */
    @SerializedName("ListenerStatus")
    @Expose
    private String ListenerStatus;

    /**
    * 监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 监听器名称
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 不匹配的域名列表
    */
    @SerializedName("NoMatchDomains")
    @Expose
    private String [] NoMatchDomains;

    /**
    * 实例绑定的证书列表	
    */
    @SerializedName("CertIdList")
    @Expose
    private String [] CertIdList;

    /**
    * 监听器协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get 监听器状态 
     * @return ListenerStatus 监听器状态
     */
    public String getListenerStatus() {
        return this.ListenerStatus;
    }

    /**
     * Set 监听器状态
     * @param ListenerStatus 监听器状态
     */
    public void setListenerStatus(String ListenerStatus) {
        this.ListenerStatus = ListenerStatus;
    }

    /**
     * Get 监听器ID 
     * @return ListenerId 监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID
     * @param ListenerId 监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 监听器名称 
     * @return ListenerName 监听器名称
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 监听器名称
     * @param ListenerName 监听器名称
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 不匹配的域名列表 
     * @return NoMatchDomains 不匹配的域名列表
     */
    public String [] getNoMatchDomains() {
        return this.NoMatchDomains;
    }

    /**
     * Set 不匹配的域名列表
     * @param NoMatchDomains 不匹配的域名列表
     */
    public void setNoMatchDomains(String [] NoMatchDomains) {
        this.NoMatchDomains = NoMatchDomains;
    }

    /**
     * Get 实例绑定的证书列表	 
     * @return CertIdList 实例绑定的证书列表	
     */
    public String [] getCertIdList() {
        return this.CertIdList;
    }

    /**
     * Set 实例绑定的证书列表	
     * @param CertIdList 实例绑定的证书列表	
     */
    public void setCertIdList(String [] CertIdList) {
        this.CertIdList = CertIdList;
    }

    /**
     * Get 监听器协议 
     * @return Protocol 监听器协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 监听器协议
     * @param Protocol 监听器协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public GAAPListenerDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GAAPListenerDetail(GAAPListenerDetail source) {
        if (source.ListenerStatus != null) {
            this.ListenerStatus = new String(source.ListenerStatus);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.NoMatchDomains != null) {
            this.NoMatchDomains = new String[source.NoMatchDomains.length];
            for (int i = 0; i < source.NoMatchDomains.length; i++) {
                this.NoMatchDomains[i] = new String(source.NoMatchDomains[i]);
            }
        }
        if (source.CertIdList != null) {
            this.CertIdList = new String[source.CertIdList.length];
            for (int i = 0; i < source.CertIdList.length; i++) {
                this.CertIdList[i] = new String(source.CertIdList[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerStatus", this.ListenerStatus);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamArraySimple(map, prefix + "NoMatchDomains.", this.NoMatchDomains);
        this.setParamArraySimple(map, prefix + "CertIdList.", this.CertIdList);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

