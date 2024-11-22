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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyConnectionConfigRequest extends AbstractModel {

    /**
    * 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 附加带宽，大于0，单位MB。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 单分片的总连接数。
- 未开启副本只读时，下限为10000，上限为40000。
- 开启副本只读时，下限为10000，上限为10000×(只读副本数+3)。
    */
    @SerializedName("ClientLimit")
    @Expose
    private Long ClientLimit;

    /**
     * Get 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。 
     * @return InstanceId 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     * @param InstanceId 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 附加带宽，大于0，单位MB。 
     * @return Bandwidth 附加带宽，大于0，单位MB。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 附加带宽，大于0，单位MB。
     * @param Bandwidth 附加带宽，大于0，单位MB。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 单分片的总连接数。
- 未开启副本只读时，下限为10000，上限为40000。
- 开启副本只读时，下限为10000，上限为10000×(只读副本数+3)。 
     * @return ClientLimit 单分片的总连接数。
- 未开启副本只读时，下限为10000，上限为40000。
- 开启副本只读时，下限为10000，上限为10000×(只读副本数+3)。
     */
    public Long getClientLimit() {
        return this.ClientLimit;
    }

    /**
     * Set 单分片的总连接数。
- 未开启副本只读时，下限为10000，上限为40000。
- 开启副本只读时，下限为10000，上限为10000×(只读副本数+3)。
     * @param ClientLimit 单分片的总连接数。
- 未开启副本只读时，下限为10000，上限为40000。
- 开启副本只读时，下限为10000，上限为10000×(只读副本数+3)。
     */
    public void setClientLimit(Long ClientLimit) {
        this.ClientLimit = ClientLimit;
    }

    public ModifyConnectionConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConnectionConfigRequest(ModifyConnectionConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.ClientLimit != null) {
            this.ClientLimit = new Long(source.ClientLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "ClientLimit", this.ClientLimit);

    }
}

