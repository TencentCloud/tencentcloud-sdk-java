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
package com.tencentcloudapi.sslpod.v20190605.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDomainRequest extends AbstractModel{

    /**
    * 监控的服务器类型 Enums(0,1,2,3)
    */
    @SerializedName("ServerType")
    @Expose
    private Long ServerType;

    /**
    * 添加的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 添加的端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 指定域名的IP
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 是否开启通知告警
    */
    @SerializedName("Notice")
    @Expose
    private Boolean Notice;

    /**
    * 给域名添加标签，多个以逗号隔开
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
     * Get 监控的服务器类型 Enums(0,1,2,3) 
     * @return ServerType 监控的服务器类型 Enums(0,1,2,3)
     */
    public Long getServerType() {
        return this.ServerType;
    }

    /**
     * Set 监控的服务器类型 Enums(0,1,2,3)
     * @param ServerType 监控的服务器类型 Enums(0,1,2,3)
     */
    public void setServerType(Long ServerType) {
        this.ServerType = ServerType;
    }

    /**
     * Get 添加的域名 
     * @return Domain 添加的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 添加的域名
     * @param Domain 添加的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 添加的端口 
     * @return Port 添加的端口
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 添加的端口
     * @param Port 添加的端口
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 指定域名的IP 
     * @return IP 指定域名的IP
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 指定域名的IP
     * @param IP 指定域名的IP
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 是否开启通知告警 
     * @return Notice 是否开启通知告警
     */
    public Boolean getNotice() {
        return this.Notice;
    }

    /**
     * Set 是否开启通知告警
     * @param Notice 是否开启通知告警
     */
    public void setNotice(Boolean Notice) {
        this.Notice = Notice;
    }

    /**
     * Get 给域名添加标签，多个以逗号隔开 
     * @return Tags 给域名添加标签，多个以逗号隔开
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set 给域名添加标签，多个以逗号隔开
     * @param Tags 给域名添加标签，多个以逗号隔开
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServerType", this.ServerType);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Notice", this.Notice);
        this.setParamSimple(map, prefix + "Tags", this.Tags);

    }
}

