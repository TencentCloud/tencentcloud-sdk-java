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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FunctionLayer extends AbstractModel {

    /**
    * <p>层名称</p>
    */
    @SerializedName("LayerName")
    @Expose
    private String LayerName;

    /**
    * <p>层版本号</p>
    */
    @SerializedName("LayerVersion")
    @Expose
    private Long LayerVersion;

    /**
     * Get <p>层名称</p> 
     * @return LayerName <p>层名称</p>
     */
    public String getLayerName() {
        return this.LayerName;
    }

    /**
     * Set <p>层名称</p>
     * @param LayerName <p>层名称</p>
     */
    public void setLayerName(String LayerName) {
        this.LayerName = LayerName;
    }

    /**
     * Get <p>层版本号</p> 
     * @return LayerVersion <p>层版本号</p>
     */
    public Long getLayerVersion() {
        return this.LayerVersion;
    }

    /**
     * Set <p>层版本号</p>
     * @param LayerVersion <p>层版本号</p>
     */
    public void setLayerVersion(Long LayerVersion) {
        this.LayerVersion = LayerVersion;
    }

    public FunctionLayer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionLayer(FunctionLayer source) {
        if (source.LayerName != null) {
            this.LayerName = new String(source.LayerName);
        }
        if (source.LayerVersion != null) {
            this.LayerVersion = new Long(source.LayerVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LayerName", this.LayerName);
        this.setParamSimple(map, prefix + "LayerVersion", this.LayerVersion);

    }
}

