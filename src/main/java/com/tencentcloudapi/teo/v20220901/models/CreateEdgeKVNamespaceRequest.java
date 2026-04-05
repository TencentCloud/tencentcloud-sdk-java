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

public class CreateEdgeKVNamespaceRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 命名空间名称。输入内容有以下限制：支持输入 1-50 个字符，允许的字符为 a-z、A-Z、0-9、-，且 - 不能单独注册或连续使用，不能放在开头或结尾。在同站点下，名称需保证唯一。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 命名空间描述。用于说明命名空间的用途或业务含义。最大支持 256 个字符。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

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
     * Get 命名空间名称。输入内容有以下限制：支持输入 1-50 个字符，允许的字符为 a-z、A-Z、0-9、-，且 - 不能单独注册或连续使用，不能放在开头或结尾。在同站点下，名称需保证唯一。 
     * @return Namespace 命名空间名称。输入内容有以下限制：支持输入 1-50 个字符，允许的字符为 a-z、A-Z、0-9、-，且 - 不能单独注册或连续使用，不能放在开头或结尾。在同站点下，名称需保证唯一。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间名称。输入内容有以下限制：支持输入 1-50 个字符，允许的字符为 a-z、A-Z、0-9、-，且 - 不能单独注册或连续使用，不能放在开头或结尾。在同站点下，名称需保证唯一。
     * @param Namespace 命名空间名称。输入内容有以下限制：支持输入 1-50 个字符，允许的字符为 a-z、A-Z、0-9、-，且 - 不能单独注册或连续使用，不能放在开头或结尾。在同站点下，名称需保证唯一。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 命名空间描述。用于说明命名空间的用途或业务含义。最大支持 256 个字符。 
     * @return Remark 命名空间描述。用于说明命名空间的用途或业务含义。最大支持 256 个字符。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 命名空间描述。用于说明命名空间的用途或业务含义。最大支持 256 个字符。
     * @param Remark 命名空间描述。用于说明命名空间的用途或业务含义。最大支持 256 个字符。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateEdgeKVNamespaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEdgeKVNamespaceRequest(CreateEdgeKVNamespaceRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

