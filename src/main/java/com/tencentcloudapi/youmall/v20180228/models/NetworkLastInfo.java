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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkLastInfo extends AbstractModel {

    /**
    * 总数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 网络状态
    */
    @SerializedName("Infos")
    @Expose
    private NetworkAndShopInfo [] Infos;

    /**
     * Get 总数 
     * @return Count 总数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 总数
     * @param Count 总数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 网络状态 
     * @return Infos 网络状态
     */
    public NetworkAndShopInfo [] getInfos() {
        return this.Infos;
    }

    /**
     * Set 网络状态
     * @param Infos 网络状态
     */
    public void setInfos(NetworkAndShopInfo [] Infos) {
        this.Infos = Infos;
    }

    public NetworkLastInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkLastInfo(NetworkLastInfo source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Infos != null) {
            this.Infos = new NetworkAndShopInfo[source.Infos.length];
            for (int i = 0; i < source.Infos.length; i++) {
                this.Infos[i] = new NetworkAndShopInfo(source.Infos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "Infos.", this.Infos);

    }
}

