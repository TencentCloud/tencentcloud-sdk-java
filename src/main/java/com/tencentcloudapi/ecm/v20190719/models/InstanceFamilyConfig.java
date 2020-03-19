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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceFamilyConfig extends AbstractModel{

    /**
    * 机型名称
    */
    @SerializedName("InstanceFamilyName")
    @Expose
    private String InstanceFamilyName;

    /**
    * 机型ID
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
     * Get 机型名称 
     * @return InstanceFamilyName 机型名称
     */
    public String getInstanceFamilyName() {
        return this.InstanceFamilyName;
    }

    /**
     * Set 机型名称
     * @param InstanceFamilyName 机型名称
     */
    public void setInstanceFamilyName(String InstanceFamilyName) {
        this.InstanceFamilyName = InstanceFamilyName;
    }

    /**
     * Get 机型ID 
     * @return InstanceFamily 机型ID
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set 机型ID
     * @param InstanceFamily 机型ID
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceFamilyName", this.InstanceFamilyName);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);

    }
}

