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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SellType extends AbstractModel{

    /**
    * 售卖实例名称
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 内核版本号
    */
    @SerializedName("EngineVersion")
    @Expose
    private String [] EngineVersion;

    /**
    * 售卖规格详细配置
    */
    @SerializedName("Configs")
    @Expose
    private SellConfig [] Configs;

    /**
     * Get 售卖实例名称 
     * @return TypeName 售卖实例名称
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set 售卖实例名称
     * @param TypeName 售卖实例名称
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get 内核版本号 
     * @return EngineVersion 内核版本号
     */
    public String [] getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 内核版本号
     * @param EngineVersion 内核版本号
     */
    public void setEngineVersion(String [] EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get 售卖规格详细配置 
     * @return Configs 售卖规格详细配置
     */
    public SellConfig [] getConfigs() {
        return this.Configs;
    }

    /**
     * Set 售卖规格详细配置
     * @param Configs 售卖规格详细配置
     */
    public void setConfigs(SellConfig [] Configs) {
        this.Configs = Configs;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamArraySimple(map, prefix + "EngineVersion.", this.EngineVersion);
        this.setParamArrayObj(map, prefix + "Configs.", this.Configs);

    }
}

