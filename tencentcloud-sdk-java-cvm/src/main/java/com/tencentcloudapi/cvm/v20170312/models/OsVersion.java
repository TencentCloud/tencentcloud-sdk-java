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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OsVersion extends AbstractModel{

    /**
    * 操作系统类型
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 支持的操作系统版本
    */
    @SerializedName("OsVersions")
    @Expose
    private String [] OsVersions;

    /**
    * 支持的操作系统架构
    */
    @SerializedName("Architecture")
    @Expose
    private String [] Architecture;

    /**
     * Get 操作系统类型 
     * @return OsName 操作系统类型
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 操作系统类型
     * @param OsName 操作系统类型
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 支持的操作系统版本 
     * @return OsVersions 支持的操作系统版本
     */
    public String [] getOsVersions() {
        return this.OsVersions;
    }

    /**
     * Set 支持的操作系统版本
     * @param OsVersions 支持的操作系统版本
     */
    public void setOsVersions(String [] OsVersions) {
        this.OsVersions = OsVersions;
    }

    /**
     * Get 支持的操作系统架构 
     * @return Architecture 支持的操作系统架构
     */
    public String [] getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set 支持的操作系统架构
     * @param Architecture 支持的操作系统架构
     */
    public void setArchitecture(String [] Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamArraySimple(map, prefix + "OsVersions.", this.OsVersions);
        this.setParamArraySimple(map, prefix + "Architecture.", this.Architecture);

    }
}

