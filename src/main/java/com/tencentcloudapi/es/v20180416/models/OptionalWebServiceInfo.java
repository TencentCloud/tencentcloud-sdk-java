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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OptionalWebServiceInfo extends AbstractModel{

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 公网url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicUrl")
    @Expose
    private String PublicUrl;

    /**
    * 内网url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateUrl")
    @Expose
    private String PrivateUrl;

    /**
    * 公网访问权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicAccess")
    @Expose
    private String PublicAccess;

    /**
    * 内网访问权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateAccess")
    @Expose
    private String PrivateAccess;

    /**
    * 版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 公网url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicUrl 公网url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicUrl() {
        return this.PublicUrl;
    }

    /**
     * Set 公网url
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicUrl 公网url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicUrl(String PublicUrl) {
        this.PublicUrl = PublicUrl;
    }

    /**
     * Get 内网url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateUrl 内网url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivateUrl() {
        return this.PrivateUrl;
    }

    /**
     * Set 内网url
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateUrl 内网url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateUrl(String PrivateUrl) {
        this.PrivateUrl = PrivateUrl;
    }

    /**
     * Get 公网访问权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicAccess 公网访问权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicAccess() {
        return this.PublicAccess;
    }

    /**
     * Set 公网访问权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicAccess 公网访问权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicAccess(String PublicAccess) {
        this.PublicAccess = PublicAccess;
    }

    /**
     * Get 内网访问权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateAccess 内网访问权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivateAccess() {
        return this.PrivateAccess;
    }

    /**
     * Set 内网访问权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateAccess 内网访问权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateAccess(String PrivateAccess) {
        this.PrivateAccess = PrivateAccess;
    }

    /**
     * Get 版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public OptionalWebServiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OptionalWebServiceInfo(OptionalWebServiceInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.PublicUrl != null) {
            this.PublicUrl = new String(source.PublicUrl);
        }
        if (source.PrivateUrl != null) {
            this.PrivateUrl = new String(source.PrivateUrl);
        }
        if (source.PublicAccess != null) {
            this.PublicAccess = new String(source.PublicAccess);
        }
        if (source.PrivateAccess != null) {
            this.PrivateAccess = new String(source.PrivateAccess);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PublicUrl", this.PublicUrl);
        this.setParamSimple(map, prefix + "PrivateUrl", this.PrivateUrl);
        this.setParamSimple(map, prefix + "PublicAccess", this.PublicAccess);
        this.setParamSimple(map, prefix + "PrivateAccess", this.PrivateAccess);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

