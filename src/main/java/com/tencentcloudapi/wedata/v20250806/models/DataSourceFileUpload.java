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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataSourceFileUpload extends AbstractModel {

    /**
    * Truststore认证文件，默认文件名truststore.jks
    */
    @SerializedName("TrustStore")
    @Expose
    private String TrustStore;

    /**
    * Keystore认证文件，默认文件名keystore.jks
    */
    @SerializedName("KeyStore")
    @Expose
    private String KeyStore;

    /**
    * core-site.xml文件
    */
    @SerializedName("CoreSite")
    @Expose
    private String CoreSite;

    /**
    * hdfs-site.xml文件
    */
    @SerializedName("HdfsSite")
    @Expose
    private String HdfsSite;

    /**
    * hive-site.xml文件
    */
    @SerializedName("HiveSite")
    @Expose
    private String HiveSite;

    /**
    * hbase-site文件
    */
    @SerializedName("HBASESite")
    @Expose
    private String HBASESite;

    /**
    * keytab文件，默认文件名[数据源名].keytab
    */
    @SerializedName("KeyTab")
    @Expose
    private String KeyTab;

    /**
    * krb5.conf文件
    */
    @SerializedName("KRB5Conf")
    @Expose
    private String KRB5Conf;

    /**
    * 私钥,默认文件名private_key.pem
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * 公钥,默认文件名public_key.pem
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
     * Get Truststore认证文件，默认文件名truststore.jks 
     * @return TrustStore Truststore认证文件，默认文件名truststore.jks
     */
    public String getTrustStore() {
        return this.TrustStore;
    }

    /**
     * Set Truststore认证文件，默认文件名truststore.jks
     * @param TrustStore Truststore认证文件，默认文件名truststore.jks
     */
    public void setTrustStore(String TrustStore) {
        this.TrustStore = TrustStore;
    }

    /**
     * Get Keystore认证文件，默认文件名keystore.jks 
     * @return KeyStore Keystore认证文件，默认文件名keystore.jks
     */
    public String getKeyStore() {
        return this.KeyStore;
    }

    /**
     * Set Keystore认证文件，默认文件名keystore.jks
     * @param KeyStore Keystore认证文件，默认文件名keystore.jks
     */
    public void setKeyStore(String KeyStore) {
        this.KeyStore = KeyStore;
    }

    /**
     * Get core-site.xml文件 
     * @return CoreSite core-site.xml文件
     */
    public String getCoreSite() {
        return this.CoreSite;
    }

    /**
     * Set core-site.xml文件
     * @param CoreSite core-site.xml文件
     */
    public void setCoreSite(String CoreSite) {
        this.CoreSite = CoreSite;
    }

    /**
     * Get hdfs-site.xml文件 
     * @return HdfsSite hdfs-site.xml文件
     */
    public String getHdfsSite() {
        return this.HdfsSite;
    }

    /**
     * Set hdfs-site.xml文件
     * @param HdfsSite hdfs-site.xml文件
     */
    public void setHdfsSite(String HdfsSite) {
        this.HdfsSite = HdfsSite;
    }

    /**
     * Get hive-site.xml文件 
     * @return HiveSite hive-site.xml文件
     */
    public String getHiveSite() {
        return this.HiveSite;
    }

    /**
     * Set hive-site.xml文件
     * @param HiveSite hive-site.xml文件
     */
    public void setHiveSite(String HiveSite) {
        this.HiveSite = HiveSite;
    }

    /**
     * Get hbase-site文件 
     * @return HBASESite hbase-site文件
     */
    public String getHBASESite() {
        return this.HBASESite;
    }

    /**
     * Set hbase-site文件
     * @param HBASESite hbase-site文件
     */
    public void setHBASESite(String HBASESite) {
        this.HBASESite = HBASESite;
    }

    /**
     * Get keytab文件，默认文件名[数据源名].keytab 
     * @return KeyTab keytab文件，默认文件名[数据源名].keytab
     */
    public String getKeyTab() {
        return this.KeyTab;
    }

    /**
     * Set keytab文件，默认文件名[数据源名].keytab
     * @param KeyTab keytab文件，默认文件名[数据源名].keytab
     */
    public void setKeyTab(String KeyTab) {
        this.KeyTab = KeyTab;
    }

    /**
     * Get krb5.conf文件 
     * @return KRB5Conf krb5.conf文件
     */
    public String getKRB5Conf() {
        return this.KRB5Conf;
    }

    /**
     * Set krb5.conf文件
     * @param KRB5Conf krb5.conf文件
     */
    public void setKRB5Conf(String KRB5Conf) {
        this.KRB5Conf = KRB5Conf;
    }

    /**
     * Get 私钥,默认文件名private_key.pem 
     * @return PrivateKey 私钥,默认文件名private_key.pem
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set 私钥,默认文件名private_key.pem
     * @param PrivateKey 私钥,默认文件名private_key.pem
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get 公钥,默认文件名public_key.pem 
     * @return PublicKey 公钥,默认文件名public_key.pem
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set 公钥,默认文件名public_key.pem
     * @param PublicKey 公钥,默认文件名public_key.pem
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    public DataSourceFileUpload() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSourceFileUpload(DataSourceFileUpload source) {
        if (source.TrustStore != null) {
            this.TrustStore = new String(source.TrustStore);
        }
        if (source.KeyStore != null) {
            this.KeyStore = new String(source.KeyStore);
        }
        if (source.CoreSite != null) {
            this.CoreSite = new String(source.CoreSite);
        }
        if (source.HdfsSite != null) {
            this.HdfsSite = new String(source.HdfsSite);
        }
        if (source.HiveSite != null) {
            this.HiveSite = new String(source.HiveSite);
        }
        if (source.HBASESite != null) {
            this.HBASESite = new String(source.HBASESite);
        }
        if (source.KeyTab != null) {
            this.KeyTab = new String(source.KeyTab);
        }
        if (source.KRB5Conf != null) {
            this.KRB5Conf = new String(source.KRB5Conf);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrustStore", this.TrustStore);
        this.setParamSimple(map, prefix + "KeyStore", this.KeyStore);
        this.setParamSimple(map, prefix + "CoreSite", this.CoreSite);
        this.setParamSimple(map, prefix + "HdfsSite", this.HdfsSite);
        this.setParamSimple(map, prefix + "HiveSite", this.HiveSite);
        this.setParamSimple(map, prefix + "HBASESite", this.HBASESite);
        this.setParamSimple(map, prefix + "KeyTab", this.KeyTab);
        this.setParamSimple(map, prefix + "KRB5Conf", this.KRB5Conf);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);

    }
}

