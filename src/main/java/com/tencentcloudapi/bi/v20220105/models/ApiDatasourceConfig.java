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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiDatasourceConfig extends AbstractModel {

    /**
    * API数据源解析结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldsJsonData")
    @Expose
    private String FieldsJsonData;

    /**
    * 连接类型1:直连 2:抽取
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectionType")
    @Expose
    private Long ConnectionType;

    /**
    * 抽取频率配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrequencyConfig")
    @Expose
    private FrequencyConfig FrequencyConfig;

    /**
    * 请求URL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 1:GET 2:POST
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestMethod")
    @Expose
    private Long RequestMethod;

    /**
    * 请求头
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestHeader")
    @Expose
    private String RequestHeader;

    /**
    * 请求参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestParams")
    @Expose
    private String RequestParams;

    /**
    * 请求体
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestBody")
    @Expose
    private String RequestBody;

    /**
    * 用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 1: 无鉴权 2:BASIC_AUTH
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthorizationType")
    @Expose
    private Long AuthorizationType;

    /**
    * 表id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableId")
    @Expose
    private Long TableId;

    /**
    * 路径DbName映射
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JsonPathDbNameMap")
    @Expose
    private String JsonPathDbNameMap;

    /**
    * 鉴权API
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthApi")
    @Expose
    private String AuthApi;

    /**
    * 应用Key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppKey")
    @Expose
    private String AppKey;

    /**
    * 应用密钥
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppSecret")
    @Expose
    private String AppSecret;

    /**
    * 数据密钥Key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * 数据密钥初始化向量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretIv")
    @Expose
    private String SecretIv;

    /**
     * Get API数据源解析结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FieldsJsonData API数据源解析结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFieldsJsonData() {
        return this.FieldsJsonData;
    }

    /**
     * Set API数据源解析结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldsJsonData API数据源解析结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldsJsonData(String FieldsJsonData) {
        this.FieldsJsonData = FieldsJsonData;
    }

    /**
     * Get 连接类型1:直连 2:抽取
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectionType 连接类型1:直连 2:抽取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConnectionType() {
        return this.ConnectionType;
    }

    /**
     * Set 连接类型1:直连 2:抽取
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectionType 连接类型1:直连 2:抽取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectionType(Long ConnectionType) {
        this.ConnectionType = ConnectionType;
    }

    /**
     * Get 抽取频率配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrequencyConfig 抽取频率配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FrequencyConfig getFrequencyConfig() {
        return this.FrequencyConfig;
    }

    /**
     * Set 抽取频率配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrequencyConfig 抽取频率配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrequencyConfig(FrequencyConfig FrequencyConfig) {
        this.FrequencyConfig = FrequencyConfig;
    }

    /**
     * Get 请求URL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 请求URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 请求URL
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 请求URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 1:GET 2:POST
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestMethod 1:GET 2:POST
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRequestMethod() {
        return this.RequestMethod;
    }

    /**
     * Set 1:GET 2:POST
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestMethod 1:GET 2:POST
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestMethod(Long RequestMethod) {
        this.RequestMethod = RequestMethod;
    }

    /**
     * Get 请求头
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestHeader 请求头
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestHeader() {
        return this.RequestHeader;
    }

    /**
     * Set 请求头
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestHeader 请求头
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestHeader(String RequestHeader) {
        this.RequestHeader = RequestHeader;
    }

    /**
     * Get 请求参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestParams 请求参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestParams() {
        return this.RequestParams;
    }

    /**
     * Set 请求参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestParams 请求参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestParams(String RequestParams) {
        this.RequestParams = RequestParams;
    }

    /**
     * Get 请求体
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestBody 请求体
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestBody() {
        return this.RequestBody;
    }

    /**
     * Set 请求体
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestBody 请求体
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestBody(String RequestBody) {
        this.RequestBody = RequestBody;
    }

    /**
     * Get 用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password 密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password 密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 1: 无鉴权 2:BASIC_AUTH
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthorizationType 1: 无鉴权 2:BASIC_AUTH
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAuthorizationType() {
        return this.AuthorizationType;
    }

    /**
     * Set 1: 无鉴权 2:BASIC_AUTH
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthorizationType 1: 无鉴权 2:BASIC_AUTH
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthorizationType(Long AuthorizationType) {
        this.AuthorizationType = AuthorizationType;
    }

    /**
     * Get 表id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableId 表id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTableId() {
        return this.TableId;
    }

    /**
     * Set 表id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableId 表id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableId(Long TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 路径DbName映射
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JsonPathDbNameMap 路径DbName映射
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJsonPathDbNameMap() {
        return this.JsonPathDbNameMap;
    }

    /**
     * Set 路径DbName映射
注意：此字段可能返回 null，表示取不到有效值。
     * @param JsonPathDbNameMap 路径DbName映射
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJsonPathDbNameMap(String JsonPathDbNameMap) {
        this.JsonPathDbNameMap = JsonPathDbNameMap;
    }

    /**
     * Get 鉴权API
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthApi 鉴权API
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthApi() {
        return this.AuthApi;
    }

    /**
     * Set 鉴权API
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthApi 鉴权API
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthApi(String AuthApi) {
        this.AuthApi = AuthApi;
    }

    /**
     * Get 应用Key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppKey 应用Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppKey() {
        return this.AppKey;
    }

    /**
     * Set 应用Key
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppKey 应用Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppKey(String AppKey) {
        this.AppKey = AppKey;
    }

    /**
     * Get 应用密钥
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppSecret 应用密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppSecret() {
        return this.AppSecret;
    }

    /**
     * Set 应用密钥
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppSecret 应用密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppSecret(String AppSecret) {
        this.AppSecret = AppSecret;
    }

    /**
     * Get 数据密钥Key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretKey 数据密钥Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 数据密钥Key
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretKey 数据密钥Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get 数据密钥初始化向量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretIv 数据密钥初始化向量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretIv() {
        return this.SecretIv;
    }

    /**
     * Set 数据密钥初始化向量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretIv 数据密钥初始化向量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretIv(String SecretIv) {
        this.SecretIv = SecretIv;
    }

    public ApiDatasourceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiDatasourceConfig(ApiDatasourceConfig source) {
        if (source.FieldsJsonData != null) {
            this.FieldsJsonData = new String(source.FieldsJsonData);
        }
        if (source.ConnectionType != null) {
            this.ConnectionType = new Long(source.ConnectionType);
        }
        if (source.FrequencyConfig != null) {
            this.FrequencyConfig = new FrequencyConfig(source.FrequencyConfig);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.RequestMethod != null) {
            this.RequestMethod = new Long(source.RequestMethod);
        }
        if (source.RequestHeader != null) {
            this.RequestHeader = new String(source.RequestHeader);
        }
        if (source.RequestParams != null) {
            this.RequestParams = new String(source.RequestParams);
        }
        if (source.RequestBody != null) {
            this.RequestBody = new String(source.RequestBody);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.AuthorizationType != null) {
            this.AuthorizationType = new Long(source.AuthorizationType);
        }
        if (source.TableId != null) {
            this.TableId = new Long(source.TableId);
        }
        if (source.JsonPathDbNameMap != null) {
            this.JsonPathDbNameMap = new String(source.JsonPathDbNameMap);
        }
        if (source.AuthApi != null) {
            this.AuthApi = new String(source.AuthApi);
        }
        if (source.AppKey != null) {
            this.AppKey = new String(source.AppKey);
        }
        if (source.AppSecret != null) {
            this.AppSecret = new String(source.AppSecret);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.SecretIv != null) {
            this.SecretIv = new String(source.SecretIv);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldsJsonData", this.FieldsJsonData);
        this.setParamSimple(map, prefix + "ConnectionType", this.ConnectionType);
        this.setParamObj(map, prefix + "FrequencyConfig.", this.FrequencyConfig);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "RequestMethod", this.RequestMethod);
        this.setParamSimple(map, prefix + "RequestHeader", this.RequestHeader);
        this.setParamSimple(map, prefix + "RequestParams", this.RequestParams);
        this.setParamSimple(map, prefix + "RequestBody", this.RequestBody);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "AuthorizationType", this.AuthorizationType);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "JsonPathDbNameMap", this.JsonPathDbNameMap);
        this.setParamSimple(map, prefix + "AuthApi", this.AuthApi);
        this.setParamSimple(map, prefix + "AppKey", this.AppKey);
        this.setParamSimple(map, prefix + "AppSecret", this.AppSecret);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "SecretIv", this.SecretIv);

    }
}

