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

public class OriginACLEntity extends AbstractModel {

    /**
    * 实例类型，取值有：
- l7：七层加速域名；
- l4：四层代理实例。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 实例详情，取值有：
- 当 Type = l7 时，请填写七层加速域名；
- 当 Type = l4 时，请填写四层代理实例 ID。
    */
    @SerializedName("Instances")
    @Expose
    private String [] Instances;

    /**
    * 操作模式，取值有：
<li>enable：启用；</li>
<li>disable：停用。</li>
    */
    @SerializedName("OperationMode")
    @Expose
    private String OperationMode;

    /**
     * Get 实例类型，取值有：
- l7：七层加速域名；
- l4：四层代理实例。 
     * @return Type 实例类型，取值有：
- l7：七层加速域名；
- l4：四层代理实例。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 实例类型，取值有：
- l7：七层加速域名；
- l4：四层代理实例。
     * @param Type 实例类型，取值有：
- l7：七层加速域名；
- l4：四层代理实例。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 实例详情，取值有：
- 当 Type = l7 时，请填写七层加速域名；
- 当 Type = l4 时，请填写四层代理实例 ID。 
     * @return Instances 实例详情，取值有：
- 当 Type = l7 时，请填写七层加速域名；
- 当 Type = l4 时，请填写四层代理实例 ID。
     */
    public String [] getInstances() {
        return this.Instances;
    }

    /**
     * Set 实例详情，取值有：
- 当 Type = l7 时，请填写七层加速域名；
- 当 Type = l4 时，请填写四层代理实例 ID。
     * @param Instances 实例详情，取值有：
- 当 Type = l7 时，请填写七层加速域名；
- 当 Type = l4 时，请填写四层代理实例 ID。
     */
    public void setInstances(String [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Get 操作模式，取值有：
<li>enable：启用；</li>
<li>disable：停用。</li> 
     * @return OperationMode 操作模式，取值有：
<li>enable：启用；</li>
<li>disable：停用。</li>
     */
    public String getOperationMode() {
        return this.OperationMode;
    }

    /**
     * Set 操作模式，取值有：
<li>enable：启用；</li>
<li>disable：停用。</li>
     * @param OperationMode 操作模式，取值有：
<li>enable：启用；</li>
<li>disable：停用。</li>
     */
    public void setOperationMode(String OperationMode) {
        this.OperationMode = OperationMode;
    }

    public OriginACLEntity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginACLEntity(OriginACLEntity source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Instances != null) {
            this.Instances = new String[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new String(source.Instances[i]);
            }
        }
        if (source.OperationMode != null) {
            this.OperationMode = new String(source.OperationMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Instances.", this.Instances);
        this.setParamSimple(map, prefix + "OperationMode", this.OperationMode);

    }
}

