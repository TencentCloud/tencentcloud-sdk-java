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

public class FunctionPublicNetConfig extends AbstractModel {

    /**
    * 是否开启公网访问能力取值['DISABLE','ENABLE']
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicNetStatus")
    @Expose
    private String PublicNetStatus;

    /**
    * Eip配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EipConfig")
    @Expose
    private FunctionEipConfig EipConfig;

    /**
     * Get 是否开启公网访问能力取值['DISABLE','ENABLE']
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicNetStatus 是否开启公网访问能力取值['DISABLE','ENABLE']
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicNetStatus() {
        return this.PublicNetStatus;
    }

    /**
     * Set 是否开启公网访问能力取值['DISABLE','ENABLE']
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicNetStatus 是否开启公网访问能力取值['DISABLE','ENABLE']
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicNetStatus(String PublicNetStatus) {
        this.PublicNetStatus = PublicNetStatus;
    }

    /**
     * Get Eip配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EipConfig Eip配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FunctionEipConfig getEipConfig() {
        return this.EipConfig;
    }

    /**
     * Set Eip配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param EipConfig Eip配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEipConfig(FunctionEipConfig EipConfig) {
        this.EipConfig = EipConfig;
    }

    public FunctionPublicNetConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionPublicNetConfig(FunctionPublicNetConfig source) {
        if (source.PublicNetStatus != null) {
            this.PublicNetStatus = new String(source.PublicNetStatus);
        }
        if (source.EipConfig != null) {
            this.EipConfig = new FunctionEipConfig(source.EipConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicNetStatus", this.PublicNetStatus);
        this.setParamObj(map, prefix + "EipConfig.", this.EipConfig);

    }
}

