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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDDoSAIRequest extends AbstractModel{

    /**
    * 资源实例ID列表
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
    * AI防护开关，取值[
on(开启)
off(关闭)
]
    */
    @SerializedName("DDoSAI")
    @Expose
    private String DDoSAI;

    /**
     * Get 资源实例ID列表 
     * @return InstanceIdList 资源实例ID列表
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set 资源实例ID列表
     * @param InstanceIdList 资源实例ID列表
     */
    public void setInstanceIdList(String [] InstanceIdList) {
        this.InstanceIdList = InstanceIdList;
    }

    /**
     * Get AI防护开关，取值[
on(开启)
off(关闭)
] 
     * @return DDoSAI AI防护开关，取值[
on(开启)
off(关闭)
]
     */
    public String getDDoSAI() {
        return this.DDoSAI;
    }

    /**
     * Set AI防护开关，取值[
on(开启)
off(关闭)
]
     * @param DDoSAI AI防护开关，取值[
on(开启)
off(关闭)
]
     */
    public void setDDoSAI(String DDoSAI) {
        this.DDoSAI = DDoSAI;
    }

    public CreateDDoSAIRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDDoSAIRequest(CreateDDoSAIRequest source) {
        if (source.InstanceIdList != null) {
            this.InstanceIdList = new String[source.InstanceIdList.length];
            for (int i = 0; i < source.InstanceIdList.length; i++) {
                this.InstanceIdList[i] = new String(source.InstanceIdList[i]);
            }
        }
        if (source.DDoSAI != null) {
            this.DDoSAI = new String(source.DDoSAI);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdList.", this.InstanceIdList);
        this.setParamSimple(map, prefix + "DDoSAI", this.DDoSAI);

    }
}

