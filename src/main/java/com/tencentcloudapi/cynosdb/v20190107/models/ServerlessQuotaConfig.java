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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerlessQuotaConfig extends AbstractModel {

    /**
    * <p>实例类型</p><p>枚举值：</p><ul><li>rw： 读写</li><li>ro： 只读</li></ul>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>最大CCU</p>
    */
    @SerializedName("MaxCcu")
    @Expose
    private Float MaxCcu;

    /**
    * <p>开关</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get <p>实例类型</p><p>枚举值：</p><ul><li>rw： 读写</li><li>ro： 只读</li></ul> 
     * @return InstanceType <p>实例类型</p><p>枚举值：</p><ul><li>rw： 读写</li><li>ro： 只读</li></ul>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型</p><p>枚举值：</p><ul><li>rw： 读写</li><li>ro： 只读</li></ul>
     * @param InstanceType <p>实例类型</p><p>枚举值：</p><ul><li>rw： 读写</li><li>ro： 只读</li></ul>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>最大CCU</p> 
     * @return MaxCcu <p>最大CCU</p>
     */
    public Float getMaxCcu() {
        return this.MaxCcu;
    }

    /**
     * Set <p>最大CCU</p>
     * @param MaxCcu <p>最大CCU</p>
     */
    public void setMaxCcu(Float MaxCcu) {
        this.MaxCcu = MaxCcu;
    }

    /**
     * Get <p>开关</p> 
     * @return Enabled <p>开关</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>开关</p>
     * @param Enabled <p>开关</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public ServerlessQuotaConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerlessQuotaConfig(ServerlessQuotaConfig source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.MaxCcu != null) {
            this.MaxCcu = new Float(source.MaxCcu);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "MaxCcu", this.MaxCcu);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

