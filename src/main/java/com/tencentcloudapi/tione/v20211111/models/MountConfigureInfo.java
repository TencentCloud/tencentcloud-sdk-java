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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MountConfigureInfo extends AbstractModel {

    /**
    * 数据源的相对路径，支持<@subaccount>这样的占位符
    */
    @SerializedName("WorkDir")
    @Expose
    private String WorkDir;

    /**
     * Get 数据源的相对路径，支持<@subaccount>这样的占位符 
     * @return WorkDir 数据源的相对路径，支持<@subaccount>这样的占位符
     */
    public String getWorkDir() {
        return this.WorkDir;
    }

    /**
     * Set 数据源的相对路径，支持<@subaccount>这样的占位符
     * @param WorkDir 数据源的相对路径，支持<@subaccount>这样的占位符
     */
    public void setWorkDir(String WorkDir) {
        this.WorkDir = WorkDir;
    }

    public MountConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MountConfigureInfo(MountConfigureInfo source) {
        if (source.WorkDir != null) {
            this.WorkDir = new String(source.WorkDir);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkDir", this.WorkDir);

    }
}

