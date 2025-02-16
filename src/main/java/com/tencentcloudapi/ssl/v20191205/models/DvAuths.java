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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DvAuths extends AbstractModel {

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
    @SerializedName("DvAuthSubDomain")
    @Expose
    private String DvAuthSubDomain;

    /**
    * 证书域名验证类型，取值：
TXT：DNS域名验证添加TXT记录
FILE：域名文件验证
CNAME：DNS域名验证添加CNAME记录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuthVerifyType")
    @Expose
    private String DvAuthVerifyType;

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
     * @return DvAuthSubDomain 证书域名验证子域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDvAuthSubDomain() {
        return this.DvAuthSubDomain;
    }

    /**
     * Set 证书域名验证子域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthSubDomain 证书域名验证子域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuthSubDomain(String DvAuthSubDomain) {
        this.DvAuthSubDomain = DvAuthSubDomain;
    }

    /**
     * Get 证书域名验证类型，取值：
TXT：DNS域名验证添加TXT记录
FILE：域名文件验证
CNAME：DNS域名验证添加CNAME记录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuthVerifyType 证书域名验证类型，取值：
TXT：DNS域名验证添加TXT记录
FILE：域名文件验证
CNAME：DNS域名验证添加CNAME记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDvAuthVerifyType() {
        return this.DvAuthVerifyType;
    }

    /**
     * Set 证书域名验证类型，取值：
TXT：DNS域名验证添加TXT记录
FILE：域名文件验证
CNAME：DNS域名验证添加CNAME记录
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthVerifyType 证书域名验证类型，取值：
TXT：DNS域名验证添加TXT记录
FILE：域名文件验证
CNAME：DNS域名验证添加CNAME记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuthVerifyType(String DvAuthVerifyType) {
        this.DvAuthVerifyType = DvAuthVerifyType;
    }

    public DvAuths() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DvAuths(DvAuths source) {
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
        if (source.DvAuthSubDomain != null) {
            this.DvAuthSubDomain = new String(source.DvAuthSubDomain);
        }
        if (source.DvAuthVerifyType != null) {
            this.DvAuthVerifyType = new String(source.DvAuthVerifyType);
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
        this.setParamSimple(map, prefix + "DvAuthSubDomain", this.DvAuthSubDomain);
        this.setParamSimple(map, prefix + "DvAuthVerifyType", this.DvAuthVerifyType);

    }
}

