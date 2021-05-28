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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HsmInfo extends AbstractModel{

    /**
    * 加密机型号
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 此类型的加密机所支持的VSM类型列表
    */
    @SerializedName("VsmTypes")
    @Expose
    private VsmInfo [] VsmTypes;

    /**
     * Get 加密机型号 
     * @return Model 加密机型号
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 加密机型号
     * @param Model 加密机型号
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 此类型的加密机所支持的VSM类型列表 
     * @return VsmTypes 此类型的加密机所支持的VSM类型列表
     */
    public VsmInfo [] getVsmTypes() {
        return this.VsmTypes;
    }

    /**
     * Set 此类型的加密机所支持的VSM类型列表
     * @param VsmTypes 此类型的加密机所支持的VSM类型列表
     */
    public void setVsmTypes(VsmInfo [] VsmTypes) {
        this.VsmTypes = VsmTypes;
    }

    public HsmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HsmInfo(HsmInfo source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.VsmTypes != null) {
            this.VsmTypes = new VsmInfo[source.VsmTypes.length];
            for (int i = 0; i < source.VsmTypes.length; i++) {
                this.VsmTypes[i] = new VsmInfo(source.VsmTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArrayObj(map, prefix + "VsmTypes.", this.VsmTypes);

    }
}

