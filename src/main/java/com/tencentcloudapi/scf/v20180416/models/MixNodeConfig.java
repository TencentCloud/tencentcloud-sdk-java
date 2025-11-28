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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MixNodeConfig extends AbstractModel {

    /**
    * GPU机型名
    */
    @SerializedName("NodeSpec")
    @Expose
    private String NodeSpec;

    /**
    * 并发个数
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
     * Get GPU机型名 
     * @return NodeSpec GPU机型名
     */
    public String getNodeSpec() {
        return this.NodeSpec;
    }

    /**
     * Set GPU机型名
     * @param NodeSpec GPU机型名
     */
    public void setNodeSpec(String NodeSpec) {
        this.NodeSpec = NodeSpec;
    }

    /**
     * Get 并发个数 
     * @return Num 并发个数
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 并发个数
     * @param Num 并发个数
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    public MixNodeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MixNodeConfig(MixNodeConfig source) {
        if (source.NodeSpec != null) {
            this.NodeSpec = new String(source.NodeSpec);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeSpec", this.NodeSpec);
        this.setParamSimple(map, prefix + "Num", this.Num);

    }
}

