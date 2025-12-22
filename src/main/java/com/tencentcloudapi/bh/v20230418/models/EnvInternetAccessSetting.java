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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvInternetAccessSetting extends AbstractModel {

    /**
    * true：不能访问公网
    */
    @SerializedName("DisableExternalAccess")
    @Expose
    private Boolean DisableExternalAccess;

    /**
    * true：不能创建数据下载权限
    */
    @SerializedName("DisableDownloadDataAcl")
    @Expose
    private Boolean DisableDownloadDataAcl;

    /**
     * Get true：不能访问公网 
     * @return DisableExternalAccess true：不能访问公网
     */
    public Boolean getDisableExternalAccess() {
        return this.DisableExternalAccess;
    }

    /**
     * Set true：不能访问公网
     * @param DisableExternalAccess true：不能访问公网
     */
    public void setDisableExternalAccess(Boolean DisableExternalAccess) {
        this.DisableExternalAccess = DisableExternalAccess;
    }

    /**
     * Get true：不能创建数据下载权限 
     * @return DisableDownloadDataAcl true：不能创建数据下载权限
     */
    public Boolean getDisableDownloadDataAcl() {
        return this.DisableDownloadDataAcl;
    }

    /**
     * Set true：不能创建数据下载权限
     * @param DisableDownloadDataAcl true：不能创建数据下载权限
     */
    public void setDisableDownloadDataAcl(Boolean DisableDownloadDataAcl) {
        this.DisableDownloadDataAcl = DisableDownloadDataAcl;
    }

    public EnvInternetAccessSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvInternetAccessSetting(EnvInternetAccessSetting source) {
        if (source.DisableExternalAccess != null) {
            this.DisableExternalAccess = new Boolean(source.DisableExternalAccess);
        }
        if (source.DisableDownloadDataAcl != null) {
            this.DisableDownloadDataAcl = new Boolean(source.DisableDownloadDataAcl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisableExternalAccess", this.DisableExternalAccess);
        this.setParamSimple(map, prefix + "DisableDownloadDataAcl", this.DisableDownloadDataAcl);

    }
}

