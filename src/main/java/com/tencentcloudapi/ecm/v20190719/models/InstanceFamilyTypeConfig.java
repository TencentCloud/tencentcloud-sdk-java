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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceFamilyTypeConfig extends AbstractModel {

    /**
    * 实例机型系列类型Id
    */
    @SerializedName("InstanceFamilyType")
    @Expose
    private String InstanceFamilyType;

    /**
    * 实例机型系列类型名称
    */
    @SerializedName("InstanceFamilyTypeName")
    @Expose
    private String InstanceFamilyTypeName;

    /**
     * Get 实例机型系列类型Id 
     * @return InstanceFamilyType 实例机型系列类型Id
     */
    public String getInstanceFamilyType() {
        return this.InstanceFamilyType;
    }

    /**
     * Set 实例机型系列类型Id
     * @param InstanceFamilyType 实例机型系列类型Id
     */
    public void setInstanceFamilyType(String InstanceFamilyType) {
        this.InstanceFamilyType = InstanceFamilyType;
    }

    /**
     * Get 实例机型系列类型名称 
     * @return InstanceFamilyTypeName 实例机型系列类型名称
     */
    public String getInstanceFamilyTypeName() {
        return this.InstanceFamilyTypeName;
    }

    /**
     * Set 实例机型系列类型名称
     * @param InstanceFamilyTypeName 实例机型系列类型名称
     */
    public void setInstanceFamilyTypeName(String InstanceFamilyTypeName) {
        this.InstanceFamilyTypeName = InstanceFamilyTypeName;
    }

    public InstanceFamilyTypeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceFamilyTypeConfig(InstanceFamilyTypeConfig source) {
        if (source.InstanceFamilyType != null) {
            this.InstanceFamilyType = new String(source.InstanceFamilyType);
        }
        if (source.InstanceFamilyTypeName != null) {
            this.InstanceFamilyTypeName = new String(source.InstanceFamilyTypeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceFamilyType", this.InstanceFamilyType);
        this.setParamSimple(map, prefix + "InstanceFamilyTypeName", this.InstanceFamilyTypeName);

    }
}

