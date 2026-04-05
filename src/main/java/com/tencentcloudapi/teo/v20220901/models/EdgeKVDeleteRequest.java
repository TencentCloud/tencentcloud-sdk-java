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

public class EdgeKVDeleteRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 命名空间名称。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 键名列表。数组长度上限为 20。每个键名不能为空，长度为 1-512 个字符，允许的字符为字母、数字、中划线和下划线。删除单个键时传入包含一个元素的数组。
    */
    @SerializedName("Keys")
    @Expose
    private String [] Keys;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 命名空间名称。 
     * @return Namespace 命名空间名称。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间名称。
     * @param Namespace 命名空间名称。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 键名列表。数组长度上限为 20。每个键名不能为空，长度为 1-512 个字符，允许的字符为字母、数字、中划线和下划线。删除单个键时传入包含一个元素的数组。 
     * @return Keys 键名列表。数组长度上限为 20。每个键名不能为空，长度为 1-512 个字符，允许的字符为字母、数字、中划线和下划线。删除单个键时传入包含一个元素的数组。
     */
    public String [] getKeys() {
        return this.Keys;
    }

    /**
     * Set 键名列表。数组长度上限为 20。每个键名不能为空，长度为 1-512 个字符，允许的字符为字母、数字、中划线和下划线。删除单个键时传入包含一个元素的数组。
     * @param Keys 键名列表。数组长度上限为 20。每个键名不能为空，长度为 1-512 个字符，允许的字符为字母、数字、中划线和下划线。删除单个键时传入包含一个元素的数组。
     */
    public void setKeys(String [] Keys) {
        this.Keys = Keys;
    }

    public EdgeKVDeleteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeKVDeleteRequest(EdgeKVDeleteRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Keys != null) {
            this.Keys = new String[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new String(source.Keys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamArraySimple(map, prefix + "Keys.", this.Keys);

    }
}

