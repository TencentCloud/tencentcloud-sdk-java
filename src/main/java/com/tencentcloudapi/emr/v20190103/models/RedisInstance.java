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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedisInstance extends AbstractModel {

    /**
    * redis实例id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 实例 ip
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 实例端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get redis实例id 
     * @return Id redis实例id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set redis实例id
     * @param Id redis实例id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 实例 ip 
     * @return Host 实例 ip
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 实例 ip
     * @param Host 实例 ip
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 实例端口 
     * @return Port 实例端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 实例端口
     * @param Port 实例端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public RedisInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedisInstance(RedisInstance source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

