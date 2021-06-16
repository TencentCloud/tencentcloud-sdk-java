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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProtectServerRequest extends AbstractModel{

    /**
    * 防护目录地址
    */
    @SerializedName("ProtectDir")
    @Expose
    private String ProtectDir;

    /**
    * 防护机器 信息
    */
    @SerializedName("ProtectHostConfig")
    @Expose
    private ProtectHostConfig [] ProtectHostConfig;

    /**
     * Get 防护目录地址 
     * @return ProtectDir 防护目录地址
     */
    public String getProtectDir() {
        return this.ProtectDir;
    }

    /**
     * Set 防护目录地址
     * @param ProtectDir 防护目录地址
     */
    public void setProtectDir(String ProtectDir) {
        this.ProtectDir = ProtectDir;
    }

    /**
     * Get 防护机器 信息 
     * @return ProtectHostConfig 防护机器 信息
     */
    public ProtectHostConfig [] getProtectHostConfig() {
        return this.ProtectHostConfig;
    }

    /**
     * Set 防护机器 信息
     * @param ProtectHostConfig 防护机器 信息
     */
    public void setProtectHostConfig(ProtectHostConfig [] ProtectHostConfig) {
        this.ProtectHostConfig = ProtectHostConfig;
    }

    public CreateProtectServerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProtectServerRequest(CreateProtectServerRequest source) {
        if (source.ProtectDir != null) {
            this.ProtectDir = new String(source.ProtectDir);
        }
        if (source.ProtectHostConfig != null) {
            this.ProtectHostConfig = new ProtectHostConfig[source.ProtectHostConfig.length];
            for (int i = 0; i < source.ProtectHostConfig.length; i++) {
                this.ProtectHostConfig[i] = new ProtectHostConfig(source.ProtectHostConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectDir", this.ProtectDir);
        this.setParamArrayObj(map, prefix + "ProtectHostConfig.", this.ProtectHostConfig);

    }
}

