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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDevTokenRequest extends AbstractModel{

    /**
    * 客户的终端用户在IoT Video上的唯一标识ID
    */
    @SerializedName("AccessId")
    @Expose
    private String AccessId;

    /**
    * 设备TID列表,0<元素数量<=100
    */
    @SerializedName("Tids")
    @Expose
    private String [] Tids;

    /**
    * Token的TTL(time to alive)分钟数
    */
    @SerializedName("TtlMinutes")
    @Expose
    private Long TtlMinutes;

    /**
     * Get 客户的终端用户在IoT Video上的唯一标识ID 
     * @return AccessId 客户的终端用户在IoT Video上的唯一标识ID
     */
    public String getAccessId() {
        return this.AccessId;
    }

    /**
     * Set 客户的终端用户在IoT Video上的唯一标识ID
     * @param AccessId 客户的终端用户在IoT Video上的唯一标识ID
     */
    public void setAccessId(String AccessId) {
        this.AccessId = AccessId;
    }

    /**
     * Get 设备TID列表,0<元素数量<=100 
     * @return Tids 设备TID列表,0<元素数量<=100
     */
    public String [] getTids() {
        return this.Tids;
    }

    /**
     * Set 设备TID列表,0<元素数量<=100
     * @param Tids 设备TID列表,0<元素数量<=100
     */
    public void setTids(String [] Tids) {
        this.Tids = Tids;
    }

    /**
     * Get Token的TTL(time to alive)分钟数 
     * @return TtlMinutes Token的TTL(time to alive)分钟数
     */
    public Long getTtlMinutes() {
        return this.TtlMinutes;
    }

    /**
     * Set Token的TTL(time to alive)分钟数
     * @param TtlMinutes Token的TTL(time to alive)分钟数
     */
    public void setTtlMinutes(Long TtlMinutes) {
        this.TtlMinutes = TtlMinutes;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessId", this.AccessId);
        this.setParamArraySimple(map, prefix + "Tids.", this.Tids);
        this.setParamSimple(map, prefix + "TtlMinutes", this.TtlMinutes);

    }
}

