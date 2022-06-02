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

public class CreateApplicationProxyRuleRequest extends AbstractModel{

    /**
    * 站点ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 代理ID
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 协议，取值为TCP或者UDP
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
    * 端口，支持格式：
80：80端口
81-90：81至90端口
    */
    @SerializedName("Port")
    @Expose
    private String [] Port;

    /**
    * 源站类型，取值：
custom：手动添加
origins：源站组
load_balancing：负载均衡
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * 源站信息：
当OriginType=custom时，表示多个：
IP:端口
域名:端口
当OriginType=origins时，包含一个元素，表示源站组ID
当OriginType=load_balancing时，包含一个元素，表示负载均衡ID
    */
    @SerializedName("OriginValue")
    @Expose
    private String [] OriginValue;

    /**
    * 传递客户端IP，当Proto=TCP时，取值：
TOA：TOA
PPV1: Proxy Protocol传递，协议版本V1
PPV2: Proxy Protocol传递，协议版本V2
OFF：不传递
当Proto=UDP时，取值：
PPV2: Proxy Protocol传递，协议版本V2
OFF：不传递
    */
    @SerializedName("ForwardClientIp")
    @Expose
    private String ForwardClientIp;

    /**
    * 是否开启会话保持
    */
    @SerializedName("SessionPersist")
    @Expose
    private Boolean SessionPersist;

    /**
     * Get 站点ID 
     * @return ZoneId 站点ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID
     * @param ZoneId 站点ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 代理ID 
     * @return ProxyId 代理ID
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 代理ID
     * @param ProxyId 代理ID
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 协议，取值为TCP或者UDP 
     * @return Proto 协议，取值为TCP或者UDP
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set 协议，取值为TCP或者UDP
     * @param Proto 协议，取值为TCP或者UDP
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
    }

    /**
     * Get 端口，支持格式：
80：80端口
81-90：81至90端口 
     * @return Port 端口，支持格式：
80：80端口
81-90：81至90端口
     */
    public String [] getPort() {
        return this.Port;
    }

    /**
     * Set 端口，支持格式：
80：80端口
81-90：81至90端口
     * @param Port 端口，支持格式：
80：80端口
81-90：81至90端口
     */
    public void setPort(String [] Port) {
        this.Port = Port;
    }

    /**
     * Get 源站类型，取值：
custom：手动添加
origins：源站组
load_balancing：负载均衡 
     * @return OriginType 源站类型，取值：
custom：手动添加
origins：源站组
load_balancing：负载均衡
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set 源站类型，取值：
custom：手动添加
origins：源站组
load_balancing：负载均衡
     * @param OriginType 源站类型，取值：
custom：手动添加
origins：源站组
load_balancing：负载均衡
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get 源站信息：
当OriginType=custom时，表示多个：
IP:端口
域名:端口
当OriginType=origins时，包含一个元素，表示源站组ID
当OriginType=load_balancing时，包含一个元素，表示负载均衡ID 
     * @return OriginValue 源站信息：
当OriginType=custom时，表示多个：
IP:端口
域名:端口
当OriginType=origins时，包含一个元素，表示源站组ID
当OriginType=load_balancing时，包含一个元素，表示负载均衡ID
     */
    public String [] getOriginValue() {
        return this.OriginValue;
    }

    /**
     * Set 源站信息：
当OriginType=custom时，表示多个：
IP:端口
域名:端口
当OriginType=origins时，包含一个元素，表示源站组ID
当OriginType=load_balancing时，包含一个元素，表示负载均衡ID
     * @param OriginValue 源站信息：
当OriginType=custom时，表示多个：
IP:端口
域名:端口
当OriginType=origins时，包含一个元素，表示源站组ID
当OriginType=load_balancing时，包含一个元素，表示负载均衡ID
     */
    public void setOriginValue(String [] OriginValue) {
        this.OriginValue = OriginValue;
    }

    /**
     * Get 传递客户端IP，当Proto=TCP时，取值：
TOA：TOA
PPV1: Proxy Protocol传递，协议版本V1
PPV2: Proxy Protocol传递，协议版本V2
OFF：不传递
当Proto=UDP时，取值：
PPV2: Proxy Protocol传递，协议版本V2
OFF：不传递 
     * @return ForwardClientIp 传递客户端IP，当Proto=TCP时，取值：
TOA：TOA
PPV1: Proxy Protocol传递，协议版本V1
PPV2: Proxy Protocol传递，协议版本V2
OFF：不传递
当Proto=UDP时，取值：
PPV2: Proxy Protocol传递，协议版本V2
OFF：不传递
     */
    public String getForwardClientIp() {
        return this.ForwardClientIp;
    }

    /**
     * Set 传递客户端IP，当Proto=TCP时，取值：
TOA：TOA
PPV1: Proxy Protocol传递，协议版本V1
PPV2: Proxy Protocol传递，协议版本V2
OFF：不传递
当Proto=UDP时，取值：
PPV2: Proxy Protocol传递，协议版本V2
OFF：不传递
     * @param ForwardClientIp 传递客户端IP，当Proto=TCP时，取值：
TOA：TOA
PPV1: Proxy Protocol传递，协议版本V1
PPV2: Proxy Protocol传递，协议版本V2
OFF：不传递
当Proto=UDP时，取值：
PPV2: Proxy Protocol传递，协议版本V2
OFF：不传递
     */
    public void setForwardClientIp(String ForwardClientIp) {
        this.ForwardClientIp = ForwardClientIp;
    }

    /**
     * Get 是否开启会话保持 
     * @return SessionPersist 是否开启会话保持
     */
    public Boolean getSessionPersist() {
        return this.SessionPersist;
    }

    /**
     * Set 是否开启会话保持
     * @param SessionPersist 是否开启会话保持
     */
    public void setSessionPersist(Boolean SessionPersist) {
        this.SessionPersist = SessionPersist;
    }

    public CreateApplicationProxyRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApplicationProxyRuleRequest(CreateApplicationProxyRuleRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.Proto != null) {
            this.Proto = new String(source.Proto);
        }
        if (source.Port != null) {
            this.Port = new String[source.Port.length];
            for (int i = 0; i < source.Port.length; i++) {
                this.Port[i] = new String(source.Port[i]);
            }
        }
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.OriginValue != null) {
            this.OriginValue = new String[source.OriginValue.length];
            for (int i = 0; i < source.OriginValue.length; i++) {
                this.OriginValue[i] = new String(source.OriginValue[i]);
            }
        }
        if (source.ForwardClientIp != null) {
            this.ForwardClientIp = new String(source.ForwardClientIp);
        }
        if (source.SessionPersist != null) {
            this.SessionPersist = new Boolean(source.SessionPersist);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "Proto", this.Proto);
        this.setParamArraySimple(map, prefix + "Port.", this.Port);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamArraySimple(map, prefix + "OriginValue.", this.OriginValue);
        this.setParamSimple(map, prefix + "ForwardClientIp", this.ForwardClientIp);
        this.setParamSimple(map, prefix + "SessionPersist", this.SessionPersist);

    }
}

