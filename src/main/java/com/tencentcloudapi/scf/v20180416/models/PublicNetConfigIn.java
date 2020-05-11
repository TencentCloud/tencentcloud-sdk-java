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

public class PublicNetConfigIn extends AbstractModel{

    /**
    * 是否开启公网访问能力取值['DISABLE','ENABLE']
    */
    @SerializedName("PublicNetStatus")
    @Expose
    private String PublicNetStatus;

    /**
    * Eip配置
    */
    @SerializedName("EipConfig")
    @Expose
    private EipConfigIn EipConfig;

    /**
     * Get 是否开启公网访问能力取值['DISABLE','ENABLE'] 
     * @return PublicNetStatus 是否开启公网访问能力取值['DISABLE','ENABLE']
     */
    public String getPublicNetStatus() {
        return this.PublicNetStatus;
    }

    /**
     * Set 是否开启公网访问能力取值['DISABLE','ENABLE']
     * @param PublicNetStatus 是否开启公网访问能力取值['DISABLE','ENABLE']
     */
    public void setPublicNetStatus(String PublicNetStatus) {
        this.PublicNetStatus = PublicNetStatus;
    }

    /**
     * Get Eip配置 
     * @return EipConfig Eip配置
     */
    public EipConfigIn getEipConfig() {
        return this.EipConfig;
    }

    /**
     * Set Eip配置
     * @param EipConfig Eip配置
     */
    public void setEipConfig(EipConfigIn EipConfig) {
        this.EipConfig = EipConfig;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicNetStatus", this.PublicNetStatus);
        this.setParamObj(map, prefix + "EipConfig.", this.EipConfig);

    }
}

