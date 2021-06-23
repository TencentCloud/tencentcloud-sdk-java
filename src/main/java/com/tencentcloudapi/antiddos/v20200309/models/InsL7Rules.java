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

public class InsL7Rules extends AbstractModel{

    /**
    * 规则状态，0: 正常运行中, 1: 配置规则中(配置生效中), 2: 配置规则失败（配置生效失败）, 3: 删除规则中(删除生效中), 5: 删除规则失败(删除失败), 6: 等待添加规则, 7: 等待删除规则, 8: 等待上传证书, 9: 规则对应的资源不存在，被隔离, 10:等待修改规则, 11:配置修改中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 实例ID
    */
    @SerializedName("InsId")
    @Expose
    private String InsId;

    /**
    * 用户AppID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 高防端口
    */
    @SerializedName("VirtualPort")
    @Expose
    private String VirtualPort;

    /**
    * 证书ID
    */
    @SerializedName("SSLId")
    @Expose
    private String SSLId;

    /**
     * Get 规则状态，0: 正常运行中, 1: 配置规则中(配置生效中), 2: 配置规则失败（配置生效失败）, 3: 删除规则中(删除生效中), 5: 删除规则失败(删除失败), 6: 等待添加规则, 7: 等待删除规则, 8: 等待上传证书, 9: 规则对应的资源不存在，被隔离, 10:等待修改规则, 11:配置修改中 
     * @return Status 规则状态，0: 正常运行中, 1: 配置规则中(配置生效中), 2: 配置规则失败（配置生效失败）, 3: 删除规则中(删除生效中), 5: 删除规则失败(删除失败), 6: 等待添加规则, 7: 等待删除规则, 8: 等待上传证书, 9: 规则对应的资源不存在，被隔离, 10:等待修改规则, 11:配置修改中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态，0: 正常运行中, 1: 配置规则中(配置生效中), 2: 配置规则失败（配置生效失败）, 3: 删除规则中(删除生效中), 5: 删除规则失败(删除失败), 6: 等待添加规则, 7: 等待删除规则, 8: 等待上传证书, 9: 规则对应的资源不存在，被隔离, 10:等待修改规则, 11:配置修改中
     * @param Status 规则状态，0: 正常运行中, 1: 配置规则中(配置生效中), 2: 配置规则失败（配置生效失败）, 3: 删除规则中(删除生效中), 5: 删除规则失败(删除失败), 6: 等待添加规则, 7: 等待删除规则, 8: 等待上传证书, 9: 规则对应的资源不存在，被隔离, 10:等待修改规则, 11:配置修改中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

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
     * Get 实例ID 
     * @return InsId 实例ID
     */
    public String getInsId() {
        return this.InsId;
    }

    /**
     * Set 实例ID
     * @param InsId 实例ID
     */
    public void setInsId(String InsId) {
        this.InsId = InsId;
    }

    /**
     * Get 用户AppID 
     * @return AppId 用户AppID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户AppID
     * @param AppId 用户AppID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 高防端口 
     * @return VirtualPort 高防端口
     */
    public String getVirtualPort() {
        return this.VirtualPort;
    }

    /**
     * Set 高防端口
     * @param VirtualPort 高防端口
     */
    public void setVirtualPort(String VirtualPort) {
        this.VirtualPort = VirtualPort;
    }

    /**
     * Get 证书ID 
     * @return SSLId 证书ID
     */
    public String getSSLId() {
        return this.SSLId;
    }

    /**
     * Set 证书ID
     * @param SSLId 证书ID
     */
    public void setSSLId(String SSLId) {
        this.SSLId = SSLId;
    }

    public InsL7Rules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InsL7Rules(InsL7Rules source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.InsId != null) {
            this.InsId = new String(source.InsId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.VirtualPort != null) {
            this.VirtualPort = new String(source.VirtualPort);
        }
        if (source.SSLId != null) {
            this.SSLId = new String(source.SSLId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "InsId", this.InsId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "VirtualPort", this.VirtualPort);
        this.setParamSimple(map, prefix + "SSLId", this.SSLId);

    }
}

