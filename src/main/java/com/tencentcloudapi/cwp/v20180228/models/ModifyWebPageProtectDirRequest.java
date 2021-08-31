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

public class ModifyWebPageProtectDirRequest extends AbstractModel{

    /**
    * 网站防护目录地址
    */
    @SerializedName("ProtectDirAddr")
    @Expose
    private String ProtectDirAddr;

    /**
    * 网站防护目录名称
    */
    @SerializedName("ProtectDirName")
    @Expose
    private String ProtectDirName;

    /**
    * 防护文件类型,分号分割 ;
    */
    @SerializedName("ProtectFileType")
    @Expose
    private String ProtectFileType;

    /**
    * 防护机器列表信息
    */
    @SerializedName("HostConfig")
    @Expose
    private ProtectHostConfig [] HostConfig;

    /**
     * Get 网站防护目录地址 
     * @return ProtectDirAddr 网站防护目录地址
     */
    public String getProtectDirAddr() {
        return this.ProtectDirAddr;
    }

    /**
     * Set 网站防护目录地址
     * @param ProtectDirAddr 网站防护目录地址
     */
    public void setProtectDirAddr(String ProtectDirAddr) {
        this.ProtectDirAddr = ProtectDirAddr;
    }

    /**
     * Get 网站防护目录名称 
     * @return ProtectDirName 网站防护目录名称
     */
    public String getProtectDirName() {
        return this.ProtectDirName;
    }

    /**
     * Set 网站防护目录名称
     * @param ProtectDirName 网站防护目录名称
     */
    public void setProtectDirName(String ProtectDirName) {
        this.ProtectDirName = ProtectDirName;
    }

    /**
     * Get 防护文件类型,分号分割 ; 
     * @return ProtectFileType 防护文件类型,分号分割 ;
     */
    public String getProtectFileType() {
        return this.ProtectFileType;
    }

    /**
     * Set 防护文件类型,分号分割 ;
     * @param ProtectFileType 防护文件类型,分号分割 ;
     */
    public void setProtectFileType(String ProtectFileType) {
        this.ProtectFileType = ProtectFileType;
    }

    /**
     * Get 防护机器列表信息 
     * @return HostConfig 防护机器列表信息
     */
    public ProtectHostConfig [] getHostConfig() {
        return this.HostConfig;
    }

    /**
     * Set 防护机器列表信息
     * @param HostConfig 防护机器列表信息
     */
    public void setHostConfig(ProtectHostConfig [] HostConfig) {
        this.HostConfig = HostConfig;
    }

    public ModifyWebPageProtectDirRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWebPageProtectDirRequest(ModifyWebPageProtectDirRequest source) {
        if (source.ProtectDirAddr != null) {
            this.ProtectDirAddr = new String(source.ProtectDirAddr);
        }
        if (source.ProtectDirName != null) {
            this.ProtectDirName = new String(source.ProtectDirName);
        }
        if (source.ProtectFileType != null) {
            this.ProtectFileType = new String(source.ProtectFileType);
        }
        if (source.HostConfig != null) {
            this.HostConfig = new ProtectHostConfig[source.HostConfig.length];
            for (int i = 0; i < source.HostConfig.length; i++) {
                this.HostConfig[i] = new ProtectHostConfig(source.HostConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectDirAddr", this.ProtectDirAddr);
        this.setParamSimple(map, prefix + "ProtectDirName", this.ProtectDirName);
        this.setParamSimple(map, prefix + "ProtectFileType", this.ProtectFileType);
        this.setParamArrayObj(map, prefix + "HostConfig.", this.HostConfig);

    }
}

