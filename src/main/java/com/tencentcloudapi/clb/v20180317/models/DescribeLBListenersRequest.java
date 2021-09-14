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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLBListenersRequest extends AbstractModel{

    /**
    * 需要查询的内网ip列表
    */
    @SerializedName("Backends")
    @Expose
    private LbRsItem [] Backends;

    /**
     * Get 需要查询的内网ip列表 
     * @return Backends 需要查询的内网ip列表
     */
    public LbRsItem [] getBackends() {
        return this.Backends;
    }

    /**
     * Set 需要查询的内网ip列表
     * @param Backends 需要查询的内网ip列表
     */
    public void setBackends(LbRsItem [] Backends) {
        this.Backends = Backends;
    }

    public DescribeLBListenersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLBListenersRequest(DescribeLBListenersRequest source) {
        if (source.Backends != null) {
            this.Backends = new LbRsItem[source.Backends.length];
            for (int i = 0; i < source.Backends.length; i++) {
                this.Backends[i] = new LbRsItem(source.Backends[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Backends.", this.Backends);

    }
}

