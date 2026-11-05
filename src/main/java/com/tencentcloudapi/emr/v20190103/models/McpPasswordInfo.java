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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McpPasswordInfo extends AbstractModel {

    /**
    * <p>hive是否需要密码</p>
    */
    @SerializedName("HivePasswordRequired")
    @Expose
    private Boolean HivePasswordRequired;

    /**
    * <p>trino是否需要密码</p>
    */
    @SerializedName("TrinoPasswordRequired")
    @Expose
    private Boolean TrinoPasswordRequired;

    /**
     * Get <p>hive是否需要密码</p> 
     * @return HivePasswordRequired <p>hive是否需要密码</p>
     */
    public Boolean getHivePasswordRequired() {
        return this.HivePasswordRequired;
    }

    /**
     * Set <p>hive是否需要密码</p>
     * @param HivePasswordRequired <p>hive是否需要密码</p>
     */
    public void setHivePasswordRequired(Boolean HivePasswordRequired) {
        this.HivePasswordRequired = HivePasswordRequired;
    }

    /**
     * Get <p>trino是否需要密码</p> 
     * @return TrinoPasswordRequired <p>trino是否需要密码</p>
     */
    public Boolean getTrinoPasswordRequired() {
        return this.TrinoPasswordRequired;
    }

    /**
     * Set <p>trino是否需要密码</p>
     * @param TrinoPasswordRequired <p>trino是否需要密码</p>
     */
    public void setTrinoPasswordRequired(Boolean TrinoPasswordRequired) {
        this.TrinoPasswordRequired = TrinoPasswordRequired;
    }

    public McpPasswordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McpPasswordInfo(McpPasswordInfo source) {
        if (source.HivePasswordRequired != null) {
            this.HivePasswordRequired = new Boolean(source.HivePasswordRequired);
        }
        if (source.TrinoPasswordRequired != null) {
            this.TrinoPasswordRequired = new Boolean(source.TrinoPasswordRequired);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HivePasswordRequired", this.HivePasswordRequired);
        this.setParamSimple(map, prefix + "TrinoPasswordRequired", this.TrinoPasswordRequired);

    }
}

