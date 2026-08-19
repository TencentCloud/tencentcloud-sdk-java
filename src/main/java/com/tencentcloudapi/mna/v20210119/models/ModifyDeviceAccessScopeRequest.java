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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDeviceAccessScopeRequest extends AbstractModel {

    /**
    * <p>设备ID</p>
    */
    @SerializedName("DeviceIds")
    @Expose
    private String [] DeviceIds;

    /**
    * <p>接入网关类型</p><p>枚举值：</p><ul><li>0： 公有云网关</li><li>1： 客户私有网关</li></ul><p>默认值：0</p><p>如果不传，则默认修改为接入公有云网关。</p>
    */
    @SerializedName("AccessScope")
    @Expose
    private Long AccessScope;

    /**
     * Get <p>设备ID</p> 
     * @return DeviceIds <p>设备ID</p>
     */
    public String [] getDeviceIds() {
        return this.DeviceIds;
    }

    /**
     * Set <p>设备ID</p>
     * @param DeviceIds <p>设备ID</p>
     */
    public void setDeviceIds(String [] DeviceIds) {
        this.DeviceIds = DeviceIds;
    }

    /**
     * Get <p>接入网关类型</p><p>枚举值：</p><ul><li>0： 公有云网关</li><li>1： 客户私有网关</li></ul><p>默认值：0</p><p>如果不传，则默认修改为接入公有云网关。</p> 
     * @return AccessScope <p>接入网关类型</p><p>枚举值：</p><ul><li>0： 公有云网关</li><li>1： 客户私有网关</li></ul><p>默认值：0</p><p>如果不传，则默认修改为接入公有云网关。</p>
     */
    public Long getAccessScope() {
        return this.AccessScope;
    }

    /**
     * Set <p>接入网关类型</p><p>枚举值：</p><ul><li>0： 公有云网关</li><li>1： 客户私有网关</li></ul><p>默认值：0</p><p>如果不传，则默认修改为接入公有云网关。</p>
     * @param AccessScope <p>接入网关类型</p><p>枚举值：</p><ul><li>0： 公有云网关</li><li>1： 客户私有网关</li></ul><p>默认值：0</p><p>如果不传，则默认修改为接入公有云网关。</p>
     */
    public void setAccessScope(Long AccessScope) {
        this.AccessScope = AccessScope;
    }

    public ModifyDeviceAccessScopeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDeviceAccessScopeRequest(ModifyDeviceAccessScopeRequest source) {
        if (source.DeviceIds != null) {
            this.DeviceIds = new String[source.DeviceIds.length];
            for (int i = 0; i < source.DeviceIds.length; i++) {
                this.DeviceIds[i] = new String(source.DeviceIds[i]);
            }
        }
        if (source.AccessScope != null) {
            this.AccessScope = new Long(source.AccessScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DeviceIds.", this.DeviceIds);
        this.setParamSimple(map, prefix + "AccessScope", this.AccessScope);

    }
}

