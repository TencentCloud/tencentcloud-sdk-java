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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DvAuthDetail extends AbstractModel {

    /**
    * 证书域名验证记录Key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuthKey")
    @Expose
    private String DvAuthKey;

    /**
    * 证书域名验证记录值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuthValue")
    @Expose
    private String DvAuthValue;

    /**
    * 证书域名验证域名值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuthDomain")
    @Expose
    private String DvAuthDomain;

    /**
    * 证书域名验证文件路径， 仅FILE、FILE_PROXY使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuthPath")
    @Expose
    private String DvAuthPath;

    /**
    * 证书域名验证子域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuthKeySubDomain")
    @Expose
    private String DvAuthKeySubDomain;

    /**
    * 证书域名验证信息， 存在多个域名验证使用本字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuths")
    @Expose
    private DvAuths [] DvAuths;

    /**
     * Get 证书域名验证记录Key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuthKey 证书域名验证记录Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDvAuthKey() {
        return this.DvAuthKey;
    }

    /**
     * Set 证书域名验证记录Key
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthKey 证书域名验证记录Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuthKey(String DvAuthKey) {
        this.DvAuthKey = DvAuthKey;
    }

    /**
     * Get 证书域名验证记录值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuthValue 证书域名验证记录值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDvAuthValue() {
        return this.DvAuthValue;
    }

    /**
     * Set 证书域名验证记录值
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthValue 证书域名验证记录值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuthValue(String DvAuthValue) {
        this.DvAuthValue = DvAuthValue;
    }

    /**
     * Get 证书域名验证域名值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuthDomain 证书域名验证域名值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDvAuthDomain() {
        return this.DvAuthDomain;
    }

    /**
     * Set 证书域名验证域名值
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthDomain 证书域名验证域名值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuthDomain(String DvAuthDomain) {
        this.DvAuthDomain = DvAuthDomain;
    }

    /**
     * Get 证书域名验证文件路径， 仅FILE、FILE_PROXY使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuthPath 证书域名验证文件路径， 仅FILE、FILE_PROXY使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDvAuthPath() {
        return this.DvAuthPath;
    }

    /**
     * Set 证书域名验证文件路径， 仅FILE、FILE_PROXY使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthPath 证书域名验证文件路径， 仅FILE、FILE_PROXY使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuthPath(String DvAuthPath) {
        this.DvAuthPath = DvAuthPath;
    }

    /**
     * Get 证书域名验证子域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuthKeySubDomain 证书域名验证子域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDvAuthKeySubDomain() {
        return this.DvAuthKeySubDomain;
    }

    /**
     * Set 证书域名验证子域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthKeySubDomain 证书域名验证子域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuthKeySubDomain(String DvAuthKeySubDomain) {
        this.DvAuthKeySubDomain = DvAuthKeySubDomain;
    }

    /**
     * Get 证书域名验证信息， 存在多个域名验证使用本字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuths 证书域名验证信息， 存在多个域名验证使用本字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DvAuths [] getDvAuths() {
        return this.DvAuths;
    }

    /**
     * Set 证书域名验证信息， 存在多个域名验证使用本字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuths 证书域名验证信息， 存在多个域名验证使用本字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuths(DvAuths [] DvAuths) {
        this.DvAuths = DvAuths;
    }

    public DvAuthDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DvAuthDetail(DvAuthDetail source) {
        if (source.DvAuthKey != null) {
            this.DvAuthKey = new String(source.DvAuthKey);
        }
        if (source.DvAuthValue != null) {
            this.DvAuthValue = new String(source.DvAuthValue);
        }
        if (source.DvAuthDomain != null) {
            this.DvAuthDomain = new String(source.DvAuthDomain);
        }
        if (source.DvAuthPath != null) {
            this.DvAuthPath = new String(source.DvAuthPath);
        }
        if (source.DvAuthKeySubDomain != null) {
            this.DvAuthKeySubDomain = new String(source.DvAuthKeySubDomain);
        }
        if (source.DvAuths != null) {
            this.DvAuths = new DvAuths[source.DvAuths.length];
            for (int i = 0; i < source.DvAuths.length; i++) {
                this.DvAuths[i] = new DvAuths(source.DvAuths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DvAuthKey", this.DvAuthKey);
        this.setParamSimple(map, prefix + "DvAuthValue", this.DvAuthValue);
        this.setParamSimple(map, prefix + "DvAuthDomain", this.DvAuthDomain);
        this.setParamSimple(map, prefix + "DvAuthPath", this.DvAuthPath);
        this.setParamSimple(map, prefix + "DvAuthKeySubDomain", this.DvAuthKeySubDomain);
        this.setParamArrayObj(map, prefix + "DvAuths.", this.DvAuths);

    }
}

