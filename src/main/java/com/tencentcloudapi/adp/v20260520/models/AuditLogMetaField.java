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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLogMetaField extends AbstractModel {

    /**
    * <p>操作日志元数据key</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>操作日志元数据Name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>操作日志元数据key</p> 
     * @return Key <p>操作日志元数据key</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>操作日志元数据key</p>
     * @param Key <p>操作日志元数据key</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>操作日志元数据Name</p> 
     * @return Name <p>操作日志元数据Name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>操作日志元数据Name</p>
     * @param Name <p>操作日志元数据Name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public AuditLogMetaField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLogMetaField(AuditLogMetaField source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

