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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetOS extends AbstractModel {

    /**
    * 目标操作系统类型
    */
    @SerializedName("TargetOSType")
    @Expose
    private String TargetOSType;

    /**
    * 目标操作系统版本
    */
    @SerializedName("TargetOSVersion")
    @Expose
    private String TargetOSVersion;

    /**
     * Get 目标操作系统类型 
     * @return TargetOSType 目标操作系统类型
     */
    public String getTargetOSType() {
        return this.TargetOSType;
    }

    /**
     * Set 目标操作系统类型
     * @param TargetOSType 目标操作系统类型
     */
    public void setTargetOSType(String TargetOSType) {
        this.TargetOSType = TargetOSType;
    }

    /**
     * Get 目标操作系统版本 
     * @return TargetOSVersion 目标操作系统版本
     */
    public String getTargetOSVersion() {
        return this.TargetOSVersion;
    }

    /**
     * Set 目标操作系统版本
     * @param TargetOSVersion 目标操作系统版本
     */
    public void setTargetOSVersion(String TargetOSVersion) {
        this.TargetOSVersion = TargetOSVersion;
    }

    public TargetOS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetOS(TargetOS source) {
        if (source.TargetOSType != null) {
            this.TargetOSType = new String(source.TargetOSType);
        }
        if (source.TargetOSVersion != null) {
            this.TargetOSVersion = new String(source.TargetOSVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetOSType", this.TargetOSType);
        this.setParamSimple(map, prefix + "TargetOSVersion", this.TargetOSVersion);

    }
}

