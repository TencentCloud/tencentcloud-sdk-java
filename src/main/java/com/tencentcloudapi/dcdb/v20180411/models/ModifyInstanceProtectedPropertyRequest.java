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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceProtectedPropertyRequest extends AbstractModel {

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 0-允许删除，无销毁保护，1-禁止删除，有销毁保护
    */
    @SerializedName("ProtectedProperty")
    @Expose
    private Long ProtectedProperty;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 0-允许删除，无销毁保护，1-禁止删除，有销毁保护 
     * @return ProtectedProperty 0-允许删除，无销毁保护，1-禁止删除，有销毁保护
     */
    public Long getProtectedProperty() {
        return this.ProtectedProperty;
    }

    /**
     * Set 0-允许删除，无销毁保护，1-禁止删除，有销毁保护
     * @param ProtectedProperty 0-允许删除，无销毁保护，1-禁止删除，有销毁保护
     */
    public void setProtectedProperty(Long ProtectedProperty) {
        this.ProtectedProperty = ProtectedProperty;
    }

    public ModifyInstanceProtectedPropertyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceProtectedPropertyRequest(ModifyInstanceProtectedPropertyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProtectedProperty != null) {
            this.ProtectedProperty = new Long(source.ProtectedProperty);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ProtectedProperty", this.ProtectedProperty);

    }
}

