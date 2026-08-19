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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IcebergConnectParam extends AbstractModel {

    /**
    * <p>EMR实例的HiveMetaStore节点IP</p><p>参数格式：多个使用英文分号;分隔</p><p>创建连接时必选，编辑连接时不接收该参数</p>
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * <p>EMR实例ID</p><p>创建连接时必选，编辑连接时不接收该参数</p>
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * <p>EMR实例的集群网络vpcId</p><p>创建连接时必选，编辑连接时不接收该参数</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>认证类型</p><p>枚举值：</p><ul><li>NONE： 无认证</li><li>KERBEROS： Kerberos认证</li></ul><p>开启Kerberos认证的EMR实例，此处需传入KERBEROS，创建连接时必选，编辑连接时非必选</p>
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * <p>EMR实例的HiveMetaStore节点IP绑定的弹性网卡Id列表</p><p>数量和顺序必须与ServiceVip字段中的多个IP对应，创建连接时必选，编辑连接时不接收该参数</p>
    */
    @SerializedName("EniIdList")
    @Expose
    private String [] EniIdList;

    /**
    * <p>Catalog数据目录类型</p><p>枚举值：</p><ul><li>HIVE： Hive Catalog</li></ul><p>默认值：HIVE</p><p>仅支持Hive Catalog</p>
    */
    @SerializedName("CatalogType")
    @Expose
    private String CatalogType;

    /**
    * <p>用于Kerberos认证的user.keytab文件的内容</p><p>入参限制：文件内容需使用Base64编码</p><p>AuthType为KERBEROS时必传</p>
    */
    @SerializedName("KeyTabContent")
    @Expose
    private String KeyTabContent;

    /**
    * <p>用于Kerberos认证的krb5.conf文件的内容</p><p>入参限制：文件内容需使用Base64编码</p><p>AuthType为KERBEROS时必传</p>
    */
    @SerializedName("KRB5ConfContent")
    @Expose
    private String KRB5ConfContent;

    /**
    * <p>用户的Kerberos身份凭证</p>
    */
    @SerializedName("KerberosUserPrincipal")
    @Expose
    private String KerberosUserPrincipal;

    /**
    * <p>HiveMetastore服务端配置的Kerberos Principal</p><p>hive-site.xml中hive.metastore.kerberos.principal的值</p>
    */
    @SerializedName("KerberosPrincipal")
    @Expose
    private String KerberosPrincipal;

    /**
    * <p>是否更新并重启所有关联的连接器任务</p><p>编辑连接时使用，如果不传，则根据认证类型及认证参数是否发生变化，来判断是否更新并重启所有关联的连接器任务</p>
    */
    @SerializedName("IsUpdate")
    @Expose
    private Boolean IsUpdate;

    /**
     * Get <p>EMR实例的HiveMetaStore节点IP</p><p>参数格式：多个使用英文分号;分隔</p><p>创建连接时必选，编辑连接时不接收该参数</p> 
     * @return ServiceVip <p>EMR实例的HiveMetaStore节点IP</p><p>参数格式：多个使用英文分号;分隔</p><p>创建连接时必选，编辑连接时不接收该参数</p>
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set <p>EMR实例的HiveMetaStore节点IP</p><p>参数格式：多个使用英文分号;分隔</p><p>创建连接时必选，编辑连接时不接收该参数</p>
     * @param ServiceVip <p>EMR实例的HiveMetaStore节点IP</p><p>参数格式：多个使用英文分号;分隔</p><p>创建连接时必选，编辑连接时不接收该参数</p>
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get <p>EMR实例ID</p><p>创建连接时必选，编辑连接时不接收该参数</p> 
     * @return Resource <p>EMR实例ID</p><p>创建连接时必选，编辑连接时不接收该参数</p>
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set <p>EMR实例ID</p><p>创建连接时必选，编辑连接时不接收该参数</p>
     * @param Resource <p>EMR实例ID</p><p>创建连接时必选，编辑连接时不接收该参数</p>
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get <p>EMR实例的集群网络vpcId</p><p>创建连接时必选，编辑连接时不接收该参数</p> 
     * @return UniqVpcId <p>EMR实例的集群网络vpcId</p><p>创建连接时必选，编辑连接时不接收该参数</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>EMR实例的集群网络vpcId</p><p>创建连接时必选，编辑连接时不接收该参数</p>
     * @param UniqVpcId <p>EMR实例的集群网络vpcId</p><p>创建连接时必选，编辑连接时不接收该参数</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>认证类型</p><p>枚举值：</p><ul><li>NONE： 无认证</li><li>KERBEROS： Kerberos认证</li></ul><p>开启Kerberos认证的EMR实例，此处需传入KERBEROS，创建连接时必选，编辑连接时非必选</p> 
     * @return AuthType <p>认证类型</p><p>枚举值：</p><ul><li>NONE： 无认证</li><li>KERBEROS： Kerberos认证</li></ul><p>开启Kerberos认证的EMR实例，此处需传入KERBEROS，创建连接时必选，编辑连接时非必选</p>
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>认证类型</p><p>枚举值：</p><ul><li>NONE： 无认证</li><li>KERBEROS： Kerberos认证</li></ul><p>开启Kerberos认证的EMR实例，此处需传入KERBEROS，创建连接时必选，编辑连接时非必选</p>
     * @param AuthType <p>认证类型</p><p>枚举值：</p><ul><li>NONE： 无认证</li><li>KERBEROS： Kerberos认证</li></ul><p>开启Kerberos认证的EMR实例，此处需传入KERBEROS，创建连接时必选，编辑连接时非必选</p>
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>EMR实例的HiveMetaStore节点IP绑定的弹性网卡Id列表</p><p>数量和顺序必须与ServiceVip字段中的多个IP对应，创建连接时必选，编辑连接时不接收该参数</p> 
     * @return EniIdList <p>EMR实例的HiveMetaStore节点IP绑定的弹性网卡Id列表</p><p>数量和顺序必须与ServiceVip字段中的多个IP对应，创建连接时必选，编辑连接时不接收该参数</p>
     */
    public String [] getEniIdList() {
        return this.EniIdList;
    }

    /**
     * Set <p>EMR实例的HiveMetaStore节点IP绑定的弹性网卡Id列表</p><p>数量和顺序必须与ServiceVip字段中的多个IP对应，创建连接时必选，编辑连接时不接收该参数</p>
     * @param EniIdList <p>EMR实例的HiveMetaStore节点IP绑定的弹性网卡Id列表</p><p>数量和顺序必须与ServiceVip字段中的多个IP对应，创建连接时必选，编辑连接时不接收该参数</p>
     */
    public void setEniIdList(String [] EniIdList) {
        this.EniIdList = EniIdList;
    }

    /**
     * Get <p>Catalog数据目录类型</p><p>枚举值：</p><ul><li>HIVE： Hive Catalog</li></ul><p>默认值：HIVE</p><p>仅支持Hive Catalog</p> 
     * @return CatalogType <p>Catalog数据目录类型</p><p>枚举值：</p><ul><li>HIVE： Hive Catalog</li></ul><p>默认值：HIVE</p><p>仅支持Hive Catalog</p>
     */
    public String getCatalogType() {
        return this.CatalogType;
    }

    /**
     * Set <p>Catalog数据目录类型</p><p>枚举值：</p><ul><li>HIVE： Hive Catalog</li></ul><p>默认值：HIVE</p><p>仅支持Hive Catalog</p>
     * @param CatalogType <p>Catalog数据目录类型</p><p>枚举值：</p><ul><li>HIVE： Hive Catalog</li></ul><p>默认值：HIVE</p><p>仅支持Hive Catalog</p>
     */
    public void setCatalogType(String CatalogType) {
        this.CatalogType = CatalogType;
    }

    /**
     * Get <p>用于Kerberos认证的user.keytab文件的内容</p><p>入参限制：文件内容需使用Base64编码</p><p>AuthType为KERBEROS时必传</p> 
     * @return KeyTabContent <p>用于Kerberos认证的user.keytab文件的内容</p><p>入参限制：文件内容需使用Base64编码</p><p>AuthType为KERBEROS时必传</p>
     */
    public String getKeyTabContent() {
        return this.KeyTabContent;
    }

    /**
     * Set <p>用于Kerberos认证的user.keytab文件的内容</p><p>入参限制：文件内容需使用Base64编码</p><p>AuthType为KERBEROS时必传</p>
     * @param KeyTabContent <p>用于Kerberos认证的user.keytab文件的内容</p><p>入参限制：文件内容需使用Base64编码</p><p>AuthType为KERBEROS时必传</p>
     */
    public void setKeyTabContent(String KeyTabContent) {
        this.KeyTabContent = KeyTabContent;
    }

    /**
     * Get <p>用于Kerberos认证的krb5.conf文件的内容</p><p>入参限制：文件内容需使用Base64编码</p><p>AuthType为KERBEROS时必传</p> 
     * @return KRB5ConfContent <p>用于Kerberos认证的krb5.conf文件的内容</p><p>入参限制：文件内容需使用Base64编码</p><p>AuthType为KERBEROS时必传</p>
     */
    public String getKRB5ConfContent() {
        return this.KRB5ConfContent;
    }

    /**
     * Set <p>用于Kerberos认证的krb5.conf文件的内容</p><p>入参限制：文件内容需使用Base64编码</p><p>AuthType为KERBEROS时必传</p>
     * @param KRB5ConfContent <p>用于Kerberos认证的krb5.conf文件的内容</p><p>入参限制：文件内容需使用Base64编码</p><p>AuthType为KERBEROS时必传</p>
     */
    public void setKRB5ConfContent(String KRB5ConfContent) {
        this.KRB5ConfContent = KRB5ConfContent;
    }

    /**
     * Get <p>用户的Kerberos身份凭证</p> 
     * @return KerberosUserPrincipal <p>用户的Kerberos身份凭证</p>
     */
    public String getKerberosUserPrincipal() {
        return this.KerberosUserPrincipal;
    }

    /**
     * Set <p>用户的Kerberos身份凭证</p>
     * @param KerberosUserPrincipal <p>用户的Kerberos身份凭证</p>
     */
    public void setKerberosUserPrincipal(String KerberosUserPrincipal) {
        this.KerberosUserPrincipal = KerberosUserPrincipal;
    }

    /**
     * Get <p>HiveMetastore服务端配置的Kerberos Principal</p><p>hive-site.xml中hive.metastore.kerberos.principal的值</p> 
     * @return KerberosPrincipal <p>HiveMetastore服务端配置的Kerberos Principal</p><p>hive-site.xml中hive.metastore.kerberos.principal的值</p>
     */
    public String getKerberosPrincipal() {
        return this.KerberosPrincipal;
    }

    /**
     * Set <p>HiveMetastore服务端配置的Kerberos Principal</p><p>hive-site.xml中hive.metastore.kerberos.principal的值</p>
     * @param KerberosPrincipal <p>HiveMetastore服务端配置的Kerberos Principal</p><p>hive-site.xml中hive.metastore.kerberos.principal的值</p>
     */
    public void setKerberosPrincipal(String KerberosPrincipal) {
        this.KerberosPrincipal = KerberosPrincipal;
    }

    /**
     * Get <p>是否更新并重启所有关联的连接器任务</p><p>编辑连接时使用，如果不传，则根据认证类型及认证参数是否发生变化，来判断是否更新并重启所有关联的连接器任务</p> 
     * @return IsUpdate <p>是否更新并重启所有关联的连接器任务</p><p>编辑连接时使用，如果不传，则根据认证类型及认证参数是否发生变化，来判断是否更新并重启所有关联的连接器任务</p>
     */
    public Boolean getIsUpdate() {
        return this.IsUpdate;
    }

    /**
     * Set <p>是否更新并重启所有关联的连接器任务</p><p>编辑连接时使用，如果不传，则根据认证类型及认证参数是否发生变化，来判断是否更新并重启所有关联的连接器任务</p>
     * @param IsUpdate <p>是否更新并重启所有关联的连接器任务</p><p>编辑连接时使用，如果不传，则根据认证类型及认证参数是否发生变化，来判断是否更新并重启所有关联的连接器任务</p>
     */
    public void setIsUpdate(Boolean IsUpdate) {
        this.IsUpdate = IsUpdate;
    }

    public IcebergConnectParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IcebergConnectParam(IcebergConnectParam source) {
        if (source.ServiceVip != null) {
            this.ServiceVip = new String(source.ServiceVip);
        }
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.EniIdList != null) {
            this.EniIdList = new String[source.EniIdList.length];
            for (int i = 0; i < source.EniIdList.length; i++) {
                this.EniIdList[i] = new String(source.EniIdList[i]);
            }
        }
        if (source.CatalogType != null) {
            this.CatalogType = new String(source.CatalogType);
        }
        if (source.KeyTabContent != null) {
            this.KeyTabContent = new String(source.KeyTabContent);
        }
        if (source.KRB5ConfContent != null) {
            this.KRB5ConfContent = new String(source.KRB5ConfContent);
        }
        if (source.KerberosUserPrincipal != null) {
            this.KerberosUserPrincipal = new String(source.KerberosUserPrincipal);
        }
        if (source.KerberosPrincipal != null) {
            this.KerberosPrincipal = new String(source.KerberosPrincipal);
        }
        if (source.IsUpdate != null) {
            this.IsUpdate = new Boolean(source.IsUpdate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceVip", this.ServiceVip);
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamArraySimple(map, prefix + "EniIdList.", this.EniIdList);
        this.setParamSimple(map, prefix + "CatalogType", this.CatalogType);
        this.setParamSimple(map, prefix + "KeyTabContent", this.KeyTabContent);
        this.setParamSimple(map, prefix + "KRB5ConfContent", this.KRB5ConfContent);
        this.setParamSimple(map, prefix + "KerberosUserPrincipal", this.KerberosUserPrincipal);
        this.setParamSimple(map, prefix + "KerberosPrincipal", this.KerberosPrincipal);
        this.setParamSimple(map, prefix + "IsUpdate", this.IsUpdate);

    }
}

