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
package com.tencentcloudapi.mongodb.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientConnection  extends AbstractModel{

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
    private Integer Count;

    /**
     * 获取连接的客户端IP
     * @return IP 连接的客户端IP
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * 设置连接的客户端IP
     * @param IP 连接的客户端IP
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * 获取对应客户端IP的连接数
     * @return Count 对应客户端IP的连接数
     */
    public Integer getCount() {
        return this.Count;
    }

    /**
     * 设置对应客户端IP的连接数
     * @param Count 对应客户端IP的连接数
     */
    public void setCount(Integer Count) {
        this.Count = Count;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

