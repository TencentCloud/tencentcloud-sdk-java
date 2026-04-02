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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReferenceHolder extends AbstractModel {

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 实例类型，取值如下：
<li>acceleration-domain：加速域名；</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 被引用/引用的实例信息。
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
     * Get 站点ID。 
     * @return ZoneId 站点ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID。
     * @param ZoneId 站点ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 实例类型，取值如下：
<li>acceleration-domain：加速域名；</li> 
     * @return Type 实例类型，取值如下：
<li>acceleration-domain：加速域名；</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 实例类型，取值如下：
<li>acceleration-domain：加速域名；</li>
     * @param Type 实例类型，取值如下：
<li>acceleration-domain：加速域名；</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 被引用/引用的实例信息。 
     * @return Instance 被引用/引用的实例信息。
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set 被引用/引用的实例信息。
     * @param Instance 被引用/引用的实例信息。
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    public ReferenceHolder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReferenceHolder(ReferenceHolder source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Instance != null) {
            this.Instance = new String(source.Instance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Instance", this.Instance);

    }
}

