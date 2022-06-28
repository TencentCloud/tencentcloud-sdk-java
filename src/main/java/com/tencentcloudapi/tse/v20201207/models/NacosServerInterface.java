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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NacosServerInterface extends AbstractModel{

    /**
    * 接口名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Interface")
    @Expose
    private String Interface;

    /**
     * Get 接口名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Interface 接口名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInterface() {
        return this.Interface;
    }

    /**
     * Set 接口名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Interface 接口名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInterface(String Interface) {
        this.Interface = Interface;
    }

    public NacosServerInterface() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NacosServerInterface(NacosServerInterface source) {
        if (source.Interface != null) {
            this.Interface = new String(source.Interface);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Interface", this.Interface);

    }
}

