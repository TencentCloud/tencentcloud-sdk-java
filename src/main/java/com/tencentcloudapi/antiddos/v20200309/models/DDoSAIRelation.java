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

public class DDoSAIRelation extends AbstractModel{

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
    * AI防护开关所属的资源实例
    */
    @SerializedName("InstanceDetailList")
    @Expose
    private InstanceRelation [] InstanceDetailList;

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

    /**
     * Get AI防护开关所属的资源实例 
     * @return InstanceDetailList AI防护开关所属的资源实例
     */
    public InstanceRelation [] getInstanceDetailList() {
        return this.InstanceDetailList;
    }

    /**
     * Set AI防护开关所属的资源实例
     * @param InstanceDetailList AI防护开关所属的资源实例
     */
    public void setInstanceDetailList(InstanceRelation [] InstanceDetailList) {
        this.InstanceDetailList = InstanceDetailList;
    }

    public DDoSAIRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSAIRelation(DDoSAIRelation source) {
        if (source.DDoSAI != null) {
            this.DDoSAI = new String(source.DDoSAI);
        }
        if (source.InstanceDetailList != null) {
            this.InstanceDetailList = new InstanceRelation[source.InstanceDetailList.length];
            for (int i = 0; i < source.InstanceDetailList.length; i++) {
                this.InstanceDetailList[i] = new InstanceRelation(source.InstanceDetailList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DDoSAI", this.DDoSAI);
        this.setParamArrayObj(map, prefix + "InstanceDetailList.", this.InstanceDetailList);

    }
}

