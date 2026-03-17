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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UuidHostip extends AbstractModel {

    /**
    * 服务器id
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 服务器ip
    */
    @SerializedName("Hostip")
    @Expose
    private String Hostip;

    /**
     * Get 服务器id 
     * @return Uuid 服务器id
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 服务器id
     * @param Uuid 服务器id
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 服务器ip 
     * @return Hostip 服务器ip
     */
    public String getHostip() {
        return this.Hostip;
    }

    /**
     * Set 服务器ip
     * @param Hostip 服务器ip
     */
    public void setHostip(String Hostip) {
        this.Hostip = Hostip;
    }

    public UuidHostip() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UuidHostip(UuidHostip source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Hostip != null) {
            this.Hostip = new String(source.Hostip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Hostip", this.Hostip);

    }
}

