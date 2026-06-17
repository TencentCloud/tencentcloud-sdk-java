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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateGrafanaConfigRequest extends AbstractModel {

    /**
    * <p>实例 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>JSON 编码后的字符串，如 &quot;{&quot;server&quot;:{&quot;root_url&quot;:&quot;http://custom.domain&quot;}}&quot;</p>
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
     * Get <p>实例 ID</p> 
     * @return InstanceId <p>实例 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID</p>
     * @param InstanceId <p>实例 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>JSON 编码后的字符串，如 &quot;{&quot;server&quot;:{&quot;root_url&quot;:&quot;http://custom.domain&quot;}}&quot;</p> 
     * @return Config <p>JSON 编码后的字符串，如 &quot;{&quot;server&quot;:{&quot;root_url&quot;:&quot;http://custom.domain&quot;}}&quot;</p>
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set <p>JSON 编码后的字符串，如 &quot;{&quot;server&quot;:{&quot;root_url&quot;:&quot;http://custom.domain&quot;}}&quot;</p>
     * @param Config <p>JSON 编码后的字符串，如 &quot;{&quot;server&quot;:{&quot;root_url&quot;:&quot;http://custom.domain&quot;}}&quot;</p>
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    public UpdateGrafanaConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateGrafanaConfigRequest(UpdateGrafanaConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Config", this.Config);

    }
}

