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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKongCORSResult extends AbstractModel {

    /**
    * 资源类型
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 资源id
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * 是否启用
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 跨域 Origins
    */
    @SerializedName("Origins")
    @Expose
    private String [] Origins;

    /**
    * 跨域 Headers
    */
    @SerializedName("Headers")
    @Expose
    private String [] Headers;

    /**
    * 跨域 Methods
    */
    @SerializedName("Methods")
    @Expose
    private String [] Methods;

    /**
    * 跨域 ExposedHeaders
    */
    @SerializedName("ExposedHeaders")
    @Expose
    private String [] ExposedHeaders;

    /**
    * 跨域OPTIONS请求缓存时间
    */
    @SerializedName("MaxAge")
    @Expose
    private Long MaxAge;

    /**
    * 跨域请求是否允许携带身份信息
    */
    @SerializedName("Credentials")
    @Expose
    private Boolean Credentials;

    /**
    * 跨域请求是否透传后端
    */
    @SerializedName("PreFlightContinue")
    @Expose
    private Boolean PreFlightContinue;

    /**
     * Get 资源类型 
     * @return SourceType 资源类型
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 资源类型
     * @param SourceType 资源类型
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 资源id 
     * @return SourceId 资源id
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set 资源id
     * @param SourceId 资源id
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get 是否启用 
     * @return Enabled 是否启用
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用
     * @param Enabled 是否启用
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 跨域 Origins 
     * @return Origins 跨域 Origins
     */
    public String [] getOrigins() {
        return this.Origins;
    }

    /**
     * Set 跨域 Origins
     * @param Origins 跨域 Origins
     */
    public void setOrigins(String [] Origins) {
        this.Origins = Origins;
    }

    /**
     * Get 跨域 Headers 
     * @return Headers 跨域 Headers
     */
    public String [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set 跨域 Headers
     * @param Headers 跨域 Headers
     */
    public void setHeaders(String [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get 跨域 Methods 
     * @return Methods 跨域 Methods
     */
    public String [] getMethods() {
        return this.Methods;
    }

    /**
     * Set 跨域 Methods
     * @param Methods 跨域 Methods
     */
    public void setMethods(String [] Methods) {
        this.Methods = Methods;
    }

    /**
     * Get 跨域 ExposedHeaders 
     * @return ExposedHeaders 跨域 ExposedHeaders
     */
    public String [] getExposedHeaders() {
        return this.ExposedHeaders;
    }

    /**
     * Set 跨域 ExposedHeaders
     * @param ExposedHeaders 跨域 ExposedHeaders
     */
    public void setExposedHeaders(String [] ExposedHeaders) {
        this.ExposedHeaders = ExposedHeaders;
    }

    /**
     * Get 跨域OPTIONS请求缓存时间 
     * @return MaxAge 跨域OPTIONS请求缓存时间
     */
    public Long getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set 跨域OPTIONS请求缓存时间
     * @param MaxAge 跨域OPTIONS请求缓存时间
     */
    public void setMaxAge(Long MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get 跨域请求是否允许携带身份信息 
     * @return Credentials 跨域请求是否允许携带身份信息
     */
    public Boolean getCredentials() {
        return this.Credentials;
    }

    /**
     * Set 跨域请求是否允许携带身份信息
     * @param Credentials 跨域请求是否允许携带身份信息
     */
    public void setCredentials(Boolean Credentials) {
        this.Credentials = Credentials;
    }

    /**
     * Get 跨域请求是否透传后端 
     * @return PreFlightContinue 跨域请求是否透传后端
     */
    public Boolean getPreFlightContinue() {
        return this.PreFlightContinue;
    }

    /**
     * Set 跨域请求是否透传后端
     * @param PreFlightContinue 跨域请求是否透传后端
     */
    public void setPreFlightContinue(Boolean PreFlightContinue) {
        this.PreFlightContinue = PreFlightContinue;
    }

    public DescribeKongCORSResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKongCORSResult(DescribeKongCORSResult source) {
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Origins != null) {
            this.Origins = new String[source.Origins.length];
            for (int i = 0; i < source.Origins.length; i++) {
                this.Origins[i] = new String(source.Origins[i]);
            }
        }
        if (source.Headers != null) {
            this.Headers = new String[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new String(source.Headers[i]);
            }
        }
        if (source.Methods != null) {
            this.Methods = new String[source.Methods.length];
            for (int i = 0; i < source.Methods.length; i++) {
                this.Methods[i] = new String(source.Methods[i]);
            }
        }
        if (source.ExposedHeaders != null) {
            this.ExposedHeaders = new String[source.ExposedHeaders.length];
            for (int i = 0; i < source.ExposedHeaders.length; i++) {
                this.ExposedHeaders[i] = new String(source.ExposedHeaders[i]);
            }
        }
        if (source.MaxAge != null) {
            this.MaxAge = new Long(source.MaxAge);
        }
        if (source.Credentials != null) {
            this.Credentials = new Boolean(source.Credentials);
        }
        if (source.PreFlightContinue != null) {
            this.PreFlightContinue = new Boolean(source.PreFlightContinue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArraySimple(map, prefix + "Origins.", this.Origins);
        this.setParamArraySimple(map, prefix + "Headers.", this.Headers);
        this.setParamArraySimple(map, prefix + "Methods.", this.Methods);
        this.setParamArraySimple(map, prefix + "ExposedHeaders.", this.ExposedHeaders);
        this.setParamSimple(map, prefix + "MaxAge", this.MaxAge);
        this.setParamSimple(map, prefix + "Credentials", this.Credentials);
        this.setParamSimple(map, prefix + "PreFlightContinue", this.PreFlightContinue);

    }
}

