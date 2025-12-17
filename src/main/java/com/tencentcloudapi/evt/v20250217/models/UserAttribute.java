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
package com.tencentcloudapi.evt.v20250217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserAttribute extends AbstractModel {

    /**
    * <p>自定义角色体系中用户属性的ID</p><p>属性键名</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>自定义角色体系中的用户属性值，只支持传入对应用户属性支持的角色ID</p><p>属性值</p>
    */
    @SerializedName("Value")
    @Expose
    private Long [] Value;

    /**
     * Get <p>自定义角色体系中用户属性的ID</p><p>属性键名</p> 
     * @return Key <p>自定义角色体系中用户属性的ID</p><p>属性键名</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>自定义角色体系中用户属性的ID</p><p>属性键名</p>
     * @param Key <p>自定义角色体系中用户属性的ID</p><p>属性键名</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>自定义角色体系中的用户属性值，只支持传入对应用户属性支持的角色ID</p><p>属性值</p> 
     * @return Value <p>自定义角色体系中的用户属性值，只支持传入对应用户属性支持的角色ID</p><p>属性值</p>
     */
    public Long [] getValue() {
        return this.Value;
    }

    /**
     * Set <p>自定义角色体系中的用户属性值，只支持传入对应用户属性支持的角色ID</p><p>属性值</p>
     * @param Value <p>自定义角色体系中的用户属性值，只支持传入对应用户属性支持的角色ID</p><p>属性值</p>
     */
    public void setValue(Long [] Value) {
        this.Value = Value;
    }

    public UserAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserAttribute(UserAttribute source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new Long[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new Long(source.Value[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamArraySimple(map, prefix + "Value.", this.Value);

    }
}

