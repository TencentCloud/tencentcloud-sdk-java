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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpCallbackConfig extends AbstractModel {

    /**
    * <p>http 标准 url</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>http header 参数</p>
    */
    @SerializedName("HeaderParams")
    @Expose
    private HeaderParams [] HeaderParams;

    /**
    * <p>http 请求包参数</p>
    */
    @SerializedName("Params")
    @Expose
    private HttpParams [] Params;

    /**
    * <p>对端输出值，由对端 url 返回的 json 包里包含该字段就行</p>
    */
    @SerializedName("Returns")
    @Expose
    private ReturnKey [] Returns;

    /**
    * <p>是否异步</p>
    */
    @SerializedName("Async")
    @Expose
    private Boolean Async;

    /**
    * <p>是否鉴权</p><p>枚举值：</p><ul><li>0： 不开启鉴权</li><li>1： 启用鉴权</li></ul>
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * <p>basic token 鉴权</p>
    */
    @SerializedName("BasicAuth")
    @Expose
    private BasicAuth BasicAuth;

    /**
    * <p>bearer token 鉴权</p>
    */
    @SerializedName("BearerAuth")
    @Expose
    private BearerAuth BearerAuth;

    /**
    * <p>自定义鉴权</p>
    */
    @SerializedName("CustomAuth")
    @Expose
    private HttpParams CustomAuth;

    /**
    * <p>oauth2 鉴权</p>
    */
    @SerializedName("Oauth2Auth")
    @Expose
    private OauthConfig Oauth2Auth;

    /**
     * Get <p>http 标准 url</p> 
     * @return Url <p>http 标准 url</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>http 标准 url</p>
     * @param Url <p>http 标准 url</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>http header 参数</p> 
     * @return HeaderParams <p>http header 参数</p>
     */
    public HeaderParams [] getHeaderParams() {
        return this.HeaderParams;
    }

    /**
     * Set <p>http header 参数</p>
     * @param HeaderParams <p>http header 参数</p>
     */
    public void setHeaderParams(HeaderParams [] HeaderParams) {
        this.HeaderParams = HeaderParams;
    }

    /**
     * Get <p>http 请求包参数</p> 
     * @return Params <p>http 请求包参数</p>
     */
    public HttpParams [] getParams() {
        return this.Params;
    }

    /**
     * Set <p>http 请求包参数</p>
     * @param Params <p>http 请求包参数</p>
     */
    public void setParams(HttpParams [] Params) {
        this.Params = Params;
    }

    /**
     * Get <p>对端输出值，由对端 url 返回的 json 包里包含该字段就行</p> 
     * @return Returns <p>对端输出值，由对端 url 返回的 json 包里包含该字段就行</p>
     */
    public ReturnKey [] getReturns() {
        return this.Returns;
    }

    /**
     * Set <p>对端输出值，由对端 url 返回的 json 包里包含该字段就行</p>
     * @param Returns <p>对端输出值，由对端 url 返回的 json 包里包含该字段就行</p>
     */
    public void setReturns(ReturnKey [] Returns) {
        this.Returns = Returns;
    }

    /**
     * Get <p>是否异步</p> 
     * @return Async <p>是否异步</p>
     */
    public Boolean getAsync() {
        return this.Async;
    }

    /**
     * Set <p>是否异步</p>
     * @param Async <p>是否异步</p>
     */
    public void setAsync(Boolean Async) {
        this.Async = Async;
    }

    /**
     * Get <p>是否鉴权</p><p>枚举值：</p><ul><li>0： 不开启鉴权</li><li>1： 启用鉴权</li></ul> 
     * @return AuthType <p>是否鉴权</p><p>枚举值：</p><ul><li>0： 不开启鉴权</li><li>1： 启用鉴权</li></ul>
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>是否鉴权</p><p>枚举值：</p><ul><li>0： 不开启鉴权</li><li>1： 启用鉴权</li></ul>
     * @param AuthType <p>是否鉴权</p><p>枚举值：</p><ul><li>0： 不开启鉴权</li><li>1： 启用鉴权</li></ul>
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>basic token 鉴权</p> 
     * @return BasicAuth <p>basic token 鉴权</p>
     */
    public BasicAuth getBasicAuth() {
        return this.BasicAuth;
    }

    /**
     * Set <p>basic token 鉴权</p>
     * @param BasicAuth <p>basic token 鉴权</p>
     */
    public void setBasicAuth(BasicAuth BasicAuth) {
        this.BasicAuth = BasicAuth;
    }

    /**
     * Get <p>bearer token 鉴权</p> 
     * @return BearerAuth <p>bearer token 鉴权</p>
     */
    public BearerAuth getBearerAuth() {
        return this.BearerAuth;
    }

    /**
     * Set <p>bearer token 鉴权</p>
     * @param BearerAuth <p>bearer token 鉴权</p>
     */
    public void setBearerAuth(BearerAuth BearerAuth) {
        this.BearerAuth = BearerAuth;
    }

    /**
     * Get <p>自定义鉴权</p> 
     * @return CustomAuth <p>自定义鉴权</p>
     */
    public HttpParams getCustomAuth() {
        return this.CustomAuth;
    }

    /**
     * Set <p>自定义鉴权</p>
     * @param CustomAuth <p>自定义鉴权</p>
     */
    public void setCustomAuth(HttpParams CustomAuth) {
        this.CustomAuth = CustomAuth;
    }

    /**
     * Get <p>oauth2 鉴权</p> 
     * @return Oauth2Auth <p>oauth2 鉴权</p>
     */
    public OauthConfig getOauth2Auth() {
        return this.Oauth2Auth;
    }

    /**
     * Set <p>oauth2 鉴权</p>
     * @param Oauth2Auth <p>oauth2 鉴权</p>
     */
    public void setOauth2Auth(OauthConfig Oauth2Auth) {
        this.Oauth2Auth = Oauth2Auth;
    }

    public HttpCallbackConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HttpCallbackConfig(HttpCallbackConfig source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.HeaderParams != null) {
            this.HeaderParams = new HeaderParams[source.HeaderParams.length];
            for (int i = 0; i < source.HeaderParams.length; i++) {
                this.HeaderParams[i] = new HeaderParams(source.HeaderParams[i]);
            }
        }
        if (source.Params != null) {
            this.Params = new HttpParams[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new HttpParams(source.Params[i]);
            }
        }
        if (source.Returns != null) {
            this.Returns = new ReturnKey[source.Returns.length];
            for (int i = 0; i < source.Returns.length; i++) {
                this.Returns[i] = new ReturnKey(source.Returns[i]);
            }
        }
        if (source.Async != null) {
            this.Async = new Boolean(source.Async);
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.BasicAuth != null) {
            this.BasicAuth = new BasicAuth(source.BasicAuth);
        }
        if (source.BearerAuth != null) {
            this.BearerAuth = new BearerAuth(source.BearerAuth);
        }
        if (source.CustomAuth != null) {
            this.CustomAuth = new HttpParams(source.CustomAuth);
        }
        if (source.Oauth2Auth != null) {
            this.Oauth2Auth = new OauthConfig(source.Oauth2Auth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArrayObj(map, prefix + "HeaderParams.", this.HeaderParams);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamArrayObj(map, prefix + "Returns.", this.Returns);
        this.setParamSimple(map, prefix + "Async", this.Async);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamObj(map, prefix + "BasicAuth.", this.BasicAuth);
        this.setParamObj(map, prefix + "BearerAuth.", this.BearerAuth);
        this.setParamObj(map, prefix + "CustomAuth.", this.CustomAuth);
        this.setParamObj(map, prefix + "Oauth2Auth.", this.Oauth2Auth);

    }
}

