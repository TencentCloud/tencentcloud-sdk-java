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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientConnection extends AbstractModel{

    /**
    * 连接的客户端IP
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 对应客户端IP的连接数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 是否为内部ip
    */
    @SerializedName("InternalService")
    @Expose
    private Boolean InternalService;

    /**
     * Get 连接的客户端IP 
     * @return IP 连接的客户端IP
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 连接的客户端IP
     * @param IP 连接的客户端IP
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 对应客户端IP的连接数 
     * @return Count 对应客户端IP的连接数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 对应客户端IP的连接数
     * @param Count 对应客户端IP的连接数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 是否为内部ip 
     * @return InternalService 是否为内部ip
     */
    public Boolean getInternalService() {
        return this.InternalService;
    }

    /**
     * Set 是否为内部ip
     * @param InternalService 是否为内部ip
     */
    public void setInternalService(Boolean InternalService) {
        this.InternalService = InternalService;
    }

    public ClientConnection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientConnection(ClientConnection source) {
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.InternalService != null) {
            this.InternalService = new Boolean(source.InternalService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "InternalService", this.InternalService);

    }
}

