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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CVMOption extends AbstractModel{

    /**
    * 云服务器可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 云服务器实例规格。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get 云服务器可用区。 
     * @return Zone 云服务器可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 云服务器可用区。
     * @param Zone 云服务器可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 云服务器实例规格。 
     * @return InstanceType 云服务器实例规格。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 云服务器实例规格。
     * @param InstanceType 云服务器实例规格。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    public CVMOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CVMOption(CVMOption source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

