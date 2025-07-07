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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRunSyncAssetRequest extends AbstractModel {

    /**
    * 0: 互联网防火墙开关，1：vpc 防火墙开关
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 0: 互联网防火墙开关，1：vpc 防火墙开关 
     * @return Type 0: 互联网防火墙开关，1：vpc 防火墙开关
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0: 互联网防火墙开关，1：vpc 防火墙开关
     * @param Type 0: 互联网防火墙开关，1：vpc 防火墙开关
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public ModifyRunSyncAssetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRunSyncAssetRequest(ModifyRunSyncAssetRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

