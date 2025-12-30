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

public class MQTTInstanceDetail extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例状态
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 不匹配的域名列表
    */
    @SerializedName("NoMatchDomains")
    @Expose
    private String [] NoMatchDomains;

    /**
    * 服务端证书列表
    */
    @SerializedName("ServerCertIdList")
    @Expose
    private String [] ServerCertIdList;

    /**
    * ca证书列表
    */
    @SerializedName("CaCertIdList")
    @Expose
    private String [] CaCertIdList;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例状态 
     * @return InstanceStatus 实例状态
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 实例状态
     * @param InstanceStatus 实例状态
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
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
     * Get 服务端证书列表 
     * @return ServerCertIdList 服务端证书列表
     */
    public String [] getServerCertIdList() {
        return this.ServerCertIdList;
    }

    /**
     * Set 服务端证书列表
     * @param ServerCertIdList 服务端证书列表
     */
    public void setServerCertIdList(String [] ServerCertIdList) {
        this.ServerCertIdList = ServerCertIdList;
    }

    /**
     * Get ca证书列表 
     * @return CaCertIdList ca证书列表
     */
    public String [] getCaCertIdList() {
        return this.CaCertIdList;
    }

    /**
     * Set ca证书列表
     * @param CaCertIdList ca证书列表
     */
    public void setCaCertIdList(String [] CaCertIdList) {
        this.CaCertIdList = CaCertIdList;
    }

    public MQTTInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MQTTInstanceDetail(MQTTInstanceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.NoMatchDomains != null) {
            this.NoMatchDomains = new String[source.NoMatchDomains.length];
            for (int i = 0; i < source.NoMatchDomains.length; i++) {
                this.NoMatchDomains[i] = new String(source.NoMatchDomains[i]);
            }
        }
        if (source.ServerCertIdList != null) {
            this.ServerCertIdList = new String[source.ServerCertIdList.length];
            for (int i = 0; i < source.ServerCertIdList.length; i++) {
                this.ServerCertIdList[i] = new String(source.ServerCertIdList[i]);
            }
        }
        if (source.CaCertIdList != null) {
            this.CaCertIdList = new String[source.CaCertIdList.length];
            for (int i = 0; i < source.CaCertIdList.length; i++) {
                this.CaCertIdList[i] = new String(source.CaCertIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamArraySimple(map, prefix + "NoMatchDomains.", this.NoMatchDomains);
        this.setParamArraySimple(map, prefix + "ServerCertIdList.", this.ServerCertIdList);
        this.setParamArraySimple(map, prefix + "CaCertIdList.", this.CaCertIdList);

    }
}

