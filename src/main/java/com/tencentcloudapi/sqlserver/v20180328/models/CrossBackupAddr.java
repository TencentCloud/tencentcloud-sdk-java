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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CrossBackupAddr extends AbstractModel{

    /**
    * 跨地域备份目标地域
    */
    @SerializedName("CrossRegion")
    @Expose
    private String CrossRegion;

    /**
    * 跨地域备份内网下载地址
    */
    @SerializedName("CrossInternalAddr")
    @Expose
    private String CrossInternalAddr;

    /**
    * 跨地域备份外网下载地址
    */
    @SerializedName("CrossExternalAddr")
    @Expose
    private String CrossExternalAddr;

    /**
     * Get 跨地域备份目标地域 
     * @return CrossRegion 跨地域备份目标地域
     */
    public String getCrossRegion() {
        return this.CrossRegion;
    }

    /**
     * Set 跨地域备份目标地域
     * @param CrossRegion 跨地域备份目标地域
     */
    public void setCrossRegion(String CrossRegion) {
        this.CrossRegion = CrossRegion;
    }

    /**
     * Get 跨地域备份内网下载地址 
     * @return CrossInternalAddr 跨地域备份内网下载地址
     */
    public String getCrossInternalAddr() {
        return this.CrossInternalAddr;
    }

    /**
     * Set 跨地域备份内网下载地址
     * @param CrossInternalAddr 跨地域备份内网下载地址
     */
    public void setCrossInternalAddr(String CrossInternalAddr) {
        this.CrossInternalAddr = CrossInternalAddr;
    }

    /**
     * Get 跨地域备份外网下载地址 
     * @return CrossExternalAddr 跨地域备份外网下载地址
     */
    public String getCrossExternalAddr() {
        return this.CrossExternalAddr;
    }

    /**
     * Set 跨地域备份外网下载地址
     * @param CrossExternalAddr 跨地域备份外网下载地址
     */
    public void setCrossExternalAddr(String CrossExternalAddr) {
        this.CrossExternalAddr = CrossExternalAddr;
    }

    public CrossBackupAddr() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CrossBackupAddr(CrossBackupAddr source) {
        if (source.CrossRegion != null) {
            this.CrossRegion = new String(source.CrossRegion);
        }
        if (source.CrossInternalAddr != null) {
            this.CrossInternalAddr = new String(source.CrossInternalAddr);
        }
        if (source.CrossExternalAddr != null) {
            this.CrossExternalAddr = new String(source.CrossExternalAddr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CrossRegion", this.CrossRegion);
        this.setParamSimple(map, prefix + "CrossInternalAddr", this.CrossInternalAddr);
        this.setParamSimple(map, prefix + "CrossExternalAddr", this.CrossExternalAddr);

    }
}

