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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KVNamespaceParameters extends AbstractModel {

    /**
    * KV 命名空间所属的站点 ID。指定要绑定的 KV 命名空间所在的站点，支持跨站点绑定。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * KV 命名空间名称。指定要绑定的具体命名空间，可通过 DescribeKVNamespace 接口获取站点下的命名空间列表。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * Get KV 命名空间所属的站点 ID。指定要绑定的 KV 命名空间所在的站点，支持跨站点绑定。 
     * @return ZoneId KV 命名空间所属的站点 ID。指定要绑定的 KV 命名空间所在的站点，支持跨站点绑定。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set KV 命名空间所属的站点 ID。指定要绑定的 KV 命名空间所在的站点，支持跨站点绑定。
     * @param ZoneId KV 命名空间所属的站点 ID。指定要绑定的 KV 命名空间所在的站点，支持跨站点绑定。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get KV 命名空间名称。指定要绑定的具体命名空间，可通过 DescribeKVNamespace 接口获取站点下的命名空间列表。 
     * @return Namespace KV 命名空间名称。指定要绑定的具体命名空间，可通过 DescribeKVNamespace 接口获取站点下的命名空间列表。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set KV 命名空间名称。指定要绑定的具体命名空间，可通过 DescribeKVNamespace 接口获取站点下的命名空间列表。
     * @param Namespace KV 命名空间名称。指定要绑定的具体命名空间，可通过 DescribeKVNamespace 接口获取站点下的命名空间列表。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    public KVNamespaceParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KVNamespaceParameters(KVNamespaceParameters source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

