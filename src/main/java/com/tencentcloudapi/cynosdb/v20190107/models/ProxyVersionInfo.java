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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyVersionInfo extends AbstractModel {

    /**
    * proxy版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyVersion")
    @Expose
    private String ProxyVersion;

    /**
    * 版本描述：GA:稳定版  BETA:尝鲜版，DEPRECATED:过旧，
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyVersionType")
    @Expose
    private String ProxyVersionType;

    /**
     * Get proxy版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyVersion proxy版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyVersion() {
        return this.ProxyVersion;
    }

    /**
     * Set proxy版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyVersion proxy版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyVersion(String ProxyVersion) {
        this.ProxyVersion = ProxyVersion;
    }

    /**
     * Get 版本描述：GA:稳定版  BETA:尝鲜版，DEPRECATED:过旧，
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyVersionType 版本描述：GA:稳定版  BETA:尝鲜版，DEPRECATED:过旧，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyVersionType() {
        return this.ProxyVersionType;
    }

    /**
     * Set 版本描述：GA:稳定版  BETA:尝鲜版，DEPRECATED:过旧，
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyVersionType 版本描述：GA:稳定版  BETA:尝鲜版，DEPRECATED:过旧，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyVersionType(String ProxyVersionType) {
        this.ProxyVersionType = ProxyVersionType;
    }

    public ProxyVersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyVersionInfo(ProxyVersionInfo source) {
        if (source.ProxyVersion != null) {
            this.ProxyVersion = new String(source.ProxyVersion);
        }
        if (source.ProxyVersionType != null) {
            this.ProxyVersionType = new String(source.ProxyVersionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyVersion", this.ProxyVersion);
        this.setParamSimple(map, prefix + "ProxyVersionType", this.ProxyVersionType);

    }
}

