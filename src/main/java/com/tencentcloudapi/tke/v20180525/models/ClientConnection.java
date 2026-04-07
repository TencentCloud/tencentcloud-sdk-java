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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientConnection extends AbstractModel {

    /**
    * 客户端与服务器连接时每秒允许的最大查询数
    */
    @SerializedName("QPS")
    @Expose
    private Float QPS;

    /**
    * 客户端在短时间内超过QPS限制的突发请求数量
    */
    @SerializedName("Burst")
    @Expose
    private Long Burst;

    /**
     * Get 客户端与服务器连接时每秒允许的最大查询数 
     * @return QPS 客户端与服务器连接时每秒允许的最大查询数
     */
    public Float getQPS() {
        return this.QPS;
    }

    /**
     * Set 客户端与服务器连接时每秒允许的最大查询数
     * @param QPS 客户端与服务器连接时每秒允许的最大查询数
     */
    public void setQPS(Float QPS) {
        this.QPS = QPS;
    }

    /**
     * Get 客户端在短时间内超过QPS限制的突发请求数量 
     * @return Burst 客户端在短时间内超过QPS限制的突发请求数量
     */
    public Long getBurst() {
        return this.Burst;
    }

    /**
     * Set 客户端在短时间内超过QPS限制的突发请求数量
     * @param Burst 客户端在短时间内超过QPS限制的突发请求数量
     */
    public void setBurst(Long Burst) {
        this.Burst = Burst;
    }

    public ClientConnection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientConnection(ClientConnection source) {
        if (source.QPS != null) {
            this.QPS = new Float(source.QPS);
        }
        if (source.Burst != null) {
            this.Burst = new Long(source.Burst);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QPS", this.QPS);
        this.setParamSimple(map, prefix + "Burst", this.Burst);

    }
}

