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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceSSLConfigRequest extends AbstractModel {

    /**
    * <p>实例 ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>开启或关闭SSL。true - 开启 ；false - 关闭。</p>
    */
    @SerializedName("SSLEnabled")
    @Expose
    private Boolean SSLEnabled;

    /**
    * <p>SSL证书保护的唯一连接地址，若为主实例，可设置为内外网IP地址；若为只读实例，可设置为实例IP或只读组IP。在开启SSL或修改SSL保护的连接地址时，该参数为必传项；在关闭SSL时，该参数将被忽略。</p>
    */
    @SerializedName("ConnectAddress")
    @Expose
    private String ConnectAddress;

    /**
    * <p>SSL证书来源。</p><p>枚举值：</p><ul><li>cloud： 平台自签发的云端证书</li><li>custom： 腾讯云SSL证书产品托管的用户自有证书</li></ul>
    */
    @SerializedName("CertSource")
    @Expose
    private String CertSource;

    /**
    * <p>腾讯云 SSL 证书产品的证书 ID。证书类型为custom时必须填写。</p>
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
     * Get <p>实例 ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p> 
     * @return DBInstanceId <p>实例 ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>实例 ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     * @param DBInstanceId <p>实例 ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>开启或关闭SSL。true - 开启 ；false - 关闭。</p> 
     * @return SSLEnabled <p>开启或关闭SSL。true - 开启 ；false - 关闭。</p>
     */
    public Boolean getSSLEnabled() {
        return this.SSLEnabled;
    }

    /**
     * Set <p>开启或关闭SSL。true - 开启 ；false - 关闭。</p>
     * @param SSLEnabled <p>开启或关闭SSL。true - 开启 ；false - 关闭。</p>
     */
    public void setSSLEnabled(Boolean SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
    }

    /**
     * Get <p>SSL证书保护的唯一连接地址，若为主实例，可设置为内外网IP地址；若为只读实例，可设置为实例IP或只读组IP。在开启SSL或修改SSL保护的连接地址时，该参数为必传项；在关闭SSL时，该参数将被忽略。</p> 
     * @return ConnectAddress <p>SSL证书保护的唯一连接地址，若为主实例，可设置为内外网IP地址；若为只读实例，可设置为实例IP或只读组IP。在开启SSL或修改SSL保护的连接地址时，该参数为必传项；在关闭SSL时，该参数将被忽略。</p>
     */
    public String getConnectAddress() {
        return this.ConnectAddress;
    }

    /**
     * Set <p>SSL证书保护的唯一连接地址，若为主实例，可设置为内外网IP地址；若为只读实例，可设置为实例IP或只读组IP。在开启SSL或修改SSL保护的连接地址时，该参数为必传项；在关闭SSL时，该参数将被忽略。</p>
     * @param ConnectAddress <p>SSL证书保护的唯一连接地址，若为主实例，可设置为内外网IP地址；若为只读实例，可设置为实例IP或只读组IP。在开启SSL或修改SSL保护的连接地址时，该参数为必传项；在关闭SSL时，该参数将被忽略。</p>
     */
    public void setConnectAddress(String ConnectAddress) {
        this.ConnectAddress = ConnectAddress;
    }

    /**
     * Get <p>SSL证书来源。</p><p>枚举值：</p><ul><li>cloud： 平台自签发的云端证书</li><li>custom： 腾讯云SSL证书产品托管的用户自有证书</li></ul> 
     * @return CertSource <p>SSL证书来源。</p><p>枚举值：</p><ul><li>cloud： 平台自签发的云端证书</li><li>custom： 腾讯云SSL证书产品托管的用户自有证书</li></ul>
     */
    public String getCertSource() {
        return this.CertSource;
    }

    /**
     * Set <p>SSL证书来源。</p><p>枚举值：</p><ul><li>cloud： 平台自签发的云端证书</li><li>custom： 腾讯云SSL证书产品托管的用户自有证书</li></ul>
     * @param CertSource <p>SSL证书来源。</p><p>枚举值：</p><ul><li>cloud： 平台自签发的云端证书</li><li>custom： 腾讯云SSL证书产品托管的用户自有证书</li></ul>
     */
    public void setCertSource(String CertSource) {
        this.CertSource = CertSource;
    }

    /**
     * Get <p>腾讯云 SSL 证书产品的证书 ID。证书类型为custom时必须填写。</p> 
     * @return CertificateId <p>腾讯云 SSL 证书产品的证书 ID。证书类型为custom时必须填写。</p>
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set <p>腾讯云 SSL 证书产品的证书 ID。证书类型为custom时必须填写。</p>
     * @param CertificateId <p>腾讯云 SSL 证书产品的证书 ID。证书类型为custom时必须填写。</p>
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    public ModifyDBInstanceSSLConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceSSLConfigRequest(ModifyDBInstanceSSLConfigRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.SSLEnabled != null) {
            this.SSLEnabled = new Boolean(source.SSLEnabled);
        }
        if (source.ConnectAddress != null) {
            this.ConnectAddress = new String(source.ConnectAddress);
        }
        if (source.CertSource != null) {
            this.CertSource = new String(source.CertSource);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "SSLEnabled", this.SSLEnabled);
        this.setParamSimple(map, prefix + "ConnectAddress", this.ConnectAddress);
        this.setParamSimple(map, prefix + "CertSource", this.CertSource);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);

    }
}

