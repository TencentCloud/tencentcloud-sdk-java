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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoutingConfig extends AbstractModel{

    /**
    * 随机权重路由附加版本
    */
    @SerializedName("AdditionalVersionWeights")
    @Expose
    private VersionWeight [] AdditionalVersionWeights;

    /**
    * 规则路由附加版本
    */
    @SerializedName("AddtionVersionMatchs")
    @Expose
    private VersionMatch [] AddtionVersionMatchs;

    /**
     * Get 随机权重路由附加版本 
     * @return AdditionalVersionWeights 随机权重路由附加版本
     */
    public VersionWeight [] getAdditionalVersionWeights() {
        return this.AdditionalVersionWeights;
    }

    /**
     * Set 随机权重路由附加版本
     * @param AdditionalVersionWeights 随机权重路由附加版本
     */
    public void setAdditionalVersionWeights(VersionWeight [] AdditionalVersionWeights) {
        this.AdditionalVersionWeights = AdditionalVersionWeights;
    }

    /**
     * Get 规则路由附加版本 
     * @return AddtionVersionMatchs 规则路由附加版本
     */
    public VersionMatch [] getAddtionVersionMatchs() {
        return this.AddtionVersionMatchs;
    }

    /**
     * Set 规则路由附加版本
     * @param AddtionVersionMatchs 规则路由附加版本
     */
    public void setAddtionVersionMatchs(VersionMatch [] AddtionVersionMatchs) {
        this.AddtionVersionMatchs = AddtionVersionMatchs;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AdditionalVersionWeights.", this.AdditionalVersionWeights);
        this.setParamArrayObj(map, prefix + "AddtionVersionMatchs.", this.AddtionVersionMatchs);

    }
}

