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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelList extends AbstractModel {

    /**
    * <p>模型版本名称</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>模型厂商</p>
    */
    @SerializedName("Vendor")
    @Expose
    private String Vendor;

    /**
     * Get <p>模型版本名称</p> 
     * @return Model <p>模型版本名称</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型版本名称</p>
     * @param Model <p>模型版本名称</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>模型厂商</p> 
     * @return Vendor <p>模型厂商</p>
     */
    public String getVendor() {
        return this.Vendor;
    }

    /**
     * Set <p>模型厂商</p>
     * @param Vendor <p>模型厂商</p>
     */
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    public ModelList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelList(ModelList source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Vendor != null) {
            this.Vendor = new String(source.Vendor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);

    }
}

