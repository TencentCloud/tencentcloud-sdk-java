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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBEncryptAttributesRequest extends AbstractModel{

    /**
    * 实例Id，形如：tdsql-ow728lmc。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 是否启用数据加密，开启后暂不支持关闭。本接口的可选值为：1-开启数据加密。
    */
    @SerializedName("EncryptEnabled")
    @Expose
    private Long EncryptEnabled;

    /**
     * Get 实例Id，形如：tdsql-ow728lmc。 
     * @return InstanceId 实例Id，形如：tdsql-ow728lmc。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id，形如：tdsql-ow728lmc。
     * @param InstanceId 实例Id，形如：tdsql-ow728lmc。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 是否启用数据加密，开启后暂不支持关闭。本接口的可选值为：1-开启数据加密。 
     * @return EncryptEnabled 是否启用数据加密，开启后暂不支持关闭。本接口的可选值为：1-开启数据加密。
     */
    public Long getEncryptEnabled() {
        return this.EncryptEnabled;
    }

    /**
     * Set 是否启用数据加密，开启后暂不支持关闭。本接口的可选值为：1-开启数据加密。
     * @param EncryptEnabled 是否启用数据加密，开启后暂不支持关闭。本接口的可选值为：1-开启数据加密。
     */
    public void setEncryptEnabled(Long EncryptEnabled) {
        this.EncryptEnabled = EncryptEnabled;
    }

    public ModifyDBEncryptAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBEncryptAttributesRequest(ModifyDBEncryptAttributesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EncryptEnabled != null) {
            this.EncryptEnabled = new Long(source.EncryptEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EncryptEnabled", this.EncryptEnabled);

    }
}

