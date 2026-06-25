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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomMetaDBInfo extends AbstractModel {

    /**
    * <p>自定义MetaDB的JDBC连接，示例: jdbc:mysql://10.10.10.10:3306/dbname</p>
    */
    @SerializedName("MetaDataJdbcUrl")
    @Expose
    private String MetaDataJdbcUrl;

    /**
    * <p>自定义MetaDB用户名</p>
    */
    @SerializedName("MetaDataUser")
    @Expose
    private String MetaDataUser;

    /**
    * <p>自定义MetaDB密码</p>
    */
    @SerializedName("MetaDataPass")
    @Expose
    private String MetaDataPass;

    /**
    * <p>hive共享元数据库类型。取值范围：</p><li>EMR_DEFAULT_META：表示集群默认创建</li><li>EMR_EXIST_META：表示集群使用指定EMR-MetaDB。</li><li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * <p>EMR-MetaDB实例</p>
    */
    @SerializedName("UnifyMetaInstanceId")
    @Expose
    private String UnifyMetaInstanceId;

    /**
    * <p>组件</p>
    */
    @SerializedName("Components")
    @Expose
    private String [] Components;

    /**
    * <p>metadb版本</p>
    */
    @SerializedName("DefaultMetaVersion")
    @Expose
    private String DefaultMetaVersion;

    /**
    * <p>CDBId</p>
    */
    @SerializedName("LinkInstanceId")
    @Expose
    private String LinkInstanceId;

    /**
     * Get <p>自定义MetaDB的JDBC连接，示例: jdbc:mysql://10.10.10.10:3306/dbname</p> 
     * @return MetaDataJdbcUrl <p>自定义MetaDB的JDBC连接，示例: jdbc:mysql://10.10.10.10:3306/dbname</p>
     */
    public String getMetaDataJdbcUrl() {
        return this.MetaDataJdbcUrl;
    }

    /**
     * Set <p>自定义MetaDB的JDBC连接，示例: jdbc:mysql://10.10.10.10:3306/dbname</p>
     * @param MetaDataJdbcUrl <p>自定义MetaDB的JDBC连接，示例: jdbc:mysql://10.10.10.10:3306/dbname</p>
     */
    public void setMetaDataJdbcUrl(String MetaDataJdbcUrl) {
        this.MetaDataJdbcUrl = MetaDataJdbcUrl;
    }

    /**
     * Get <p>自定义MetaDB用户名</p> 
     * @return MetaDataUser <p>自定义MetaDB用户名</p>
     */
    public String getMetaDataUser() {
        return this.MetaDataUser;
    }

    /**
     * Set <p>自定义MetaDB用户名</p>
     * @param MetaDataUser <p>自定义MetaDB用户名</p>
     */
    public void setMetaDataUser(String MetaDataUser) {
        this.MetaDataUser = MetaDataUser;
    }

    /**
     * Get <p>自定义MetaDB密码</p> 
     * @return MetaDataPass <p>自定义MetaDB密码</p>
     */
    public String getMetaDataPass() {
        return this.MetaDataPass;
    }

    /**
     * Set <p>自定义MetaDB密码</p>
     * @param MetaDataPass <p>自定义MetaDB密码</p>
     */
    public void setMetaDataPass(String MetaDataPass) {
        this.MetaDataPass = MetaDataPass;
    }

    /**
     * Get <p>hive共享元数据库类型。取值范围：</p><li>EMR_DEFAULT_META：表示集群默认创建</li><li>EMR_EXIST_META：表示集群使用指定EMR-MetaDB。</li><li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li> 
     * @return MetaType <p>hive共享元数据库类型。取值范围：</p><li>EMR_DEFAULT_META：表示集群默认创建</li><li>EMR_EXIST_META：表示集群使用指定EMR-MetaDB。</li><li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set <p>hive共享元数据库类型。取值范围：</p><li>EMR_DEFAULT_META：表示集群默认创建</li><li>EMR_EXIST_META：表示集群使用指定EMR-MetaDB。</li><li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
     * @param MetaType <p>hive共享元数据库类型。取值范围：</p><li>EMR_DEFAULT_META：表示集群默认创建</li><li>EMR_EXIST_META：表示集群使用指定EMR-MetaDB。</li><li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get <p>EMR-MetaDB实例</p> 
     * @return UnifyMetaInstanceId <p>EMR-MetaDB实例</p>
     */
    public String getUnifyMetaInstanceId() {
        return this.UnifyMetaInstanceId;
    }

    /**
     * Set <p>EMR-MetaDB实例</p>
     * @param UnifyMetaInstanceId <p>EMR-MetaDB实例</p>
     */
    public void setUnifyMetaInstanceId(String UnifyMetaInstanceId) {
        this.UnifyMetaInstanceId = UnifyMetaInstanceId;
    }

    /**
     * Get <p>组件</p> 
     * @return Components <p>组件</p>
     */
    public String [] getComponents() {
        return this.Components;
    }

    /**
     * Set <p>组件</p>
     * @param Components <p>组件</p>
     */
    public void setComponents(String [] Components) {
        this.Components = Components;
    }

    /**
     * Get <p>metadb版本</p> 
     * @return DefaultMetaVersion <p>metadb版本</p>
     */
    public String getDefaultMetaVersion() {
        return this.DefaultMetaVersion;
    }

    /**
     * Set <p>metadb版本</p>
     * @param DefaultMetaVersion <p>metadb版本</p>
     */
    public void setDefaultMetaVersion(String DefaultMetaVersion) {
        this.DefaultMetaVersion = DefaultMetaVersion;
    }

    /**
     * Get <p>CDBId</p> 
     * @return LinkInstanceId <p>CDBId</p>
     */
    public String getLinkInstanceId() {
        return this.LinkInstanceId;
    }

    /**
     * Set <p>CDBId</p>
     * @param LinkInstanceId <p>CDBId</p>
     */
    public void setLinkInstanceId(String LinkInstanceId) {
        this.LinkInstanceId = LinkInstanceId;
    }

    public CustomMetaDBInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomMetaDBInfo(CustomMetaDBInfo source) {
        if (source.MetaDataJdbcUrl != null) {
            this.MetaDataJdbcUrl = new String(source.MetaDataJdbcUrl);
        }
        if (source.MetaDataUser != null) {
            this.MetaDataUser = new String(source.MetaDataUser);
        }
        if (source.MetaDataPass != null) {
            this.MetaDataPass = new String(source.MetaDataPass);
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
        if (source.UnifyMetaInstanceId != null) {
            this.UnifyMetaInstanceId = new String(source.UnifyMetaInstanceId);
        }
        if (source.Components != null) {
            this.Components = new String[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new String(source.Components[i]);
            }
        }
        if (source.DefaultMetaVersion != null) {
            this.DefaultMetaVersion = new String(source.DefaultMetaVersion);
        }
        if (source.LinkInstanceId != null) {
            this.LinkInstanceId = new String(source.LinkInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetaDataJdbcUrl", this.MetaDataJdbcUrl);
        this.setParamSimple(map, prefix + "MetaDataUser", this.MetaDataUser);
        this.setParamSimple(map, prefix + "MetaDataPass", this.MetaDataPass);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "UnifyMetaInstanceId", this.UnifyMetaInstanceId);
        this.setParamArraySimple(map, prefix + "Components.", this.Components);
        this.setParamSimple(map, prefix + "DefaultMetaVersion", this.DefaultMetaVersion);
        this.setParamSimple(map, prefix + "LinkInstanceId", this.LinkInstanceId);

    }
}

