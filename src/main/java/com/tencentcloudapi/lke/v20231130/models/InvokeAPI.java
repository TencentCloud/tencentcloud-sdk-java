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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeAPI extends AbstractModel {

    /**
    * 请求方法，如GET/POST等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 请求地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * header参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeaderValues")
    @Expose
    private StrValue [] HeaderValues;

    /**
    * 入参Query
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryValues")
    @Expose
    private StrValue [] QueryValues;

    /**
    * Post请求的原始数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestPostBody")
    @Expose
    private String RequestPostBody;

    /**
    * 返回的原始数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseBody")
    @Expose
    private String ResponseBody;

    /**
    * 出参
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseValues")
    @Expose
    private ValueInfo [] ResponseValues;

    /**
    * 异常信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailMessage")
    @Expose
    private String FailMessage;

    /**
     * Get 请求方法，如GET/POST等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Method 请求方法，如GET/POST等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 请求方法，如GET/POST等
注意：此字段可能返回 null，表示取不到有效值。
     * @param Method 请求方法，如GET/POST等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 请求地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 请求地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 请求地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 请求地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get header参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeaderValues header参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StrValue [] getHeaderValues() {
        return this.HeaderValues;
    }

    /**
     * Set header参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeaderValues header参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaderValues(StrValue [] HeaderValues) {
        this.HeaderValues = HeaderValues;
    }

    /**
     * Get 入参Query
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryValues 入参Query
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StrValue [] getQueryValues() {
        return this.QueryValues;
    }

    /**
     * Set 入参Query
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryValues 入参Query
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryValues(StrValue [] QueryValues) {
        this.QueryValues = QueryValues;
    }

    /**
     * Get Post请求的原始数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestPostBody Post请求的原始数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestPostBody() {
        return this.RequestPostBody;
    }

    /**
     * Set Post请求的原始数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestPostBody Post请求的原始数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestPostBody(String RequestPostBody) {
        this.RequestPostBody = RequestPostBody;
    }

    /**
     * Get 返回的原始数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseBody 返回的原始数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResponseBody() {
        return this.ResponseBody;
    }

    /**
     * Set 返回的原始数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseBody 返回的原始数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseBody(String ResponseBody) {
        this.ResponseBody = ResponseBody;
    }

    /**
     * Get 出参
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseValues 出参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ValueInfo [] getResponseValues() {
        return this.ResponseValues;
    }

    /**
     * Set 出参
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseValues 出参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseValues(ValueInfo [] ResponseValues) {
        this.ResponseValues = ResponseValues;
    }

    /**
     * Get 异常信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailMessage 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailMessage() {
        return this.FailMessage;
    }

    /**
     * Set 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailMessage 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailMessage(String FailMessage) {
        this.FailMessage = FailMessage;
    }

    public InvokeAPI() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeAPI(InvokeAPI source) {
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.HeaderValues != null) {
            this.HeaderValues = new StrValue[source.HeaderValues.length];
            for (int i = 0; i < source.HeaderValues.length; i++) {
                this.HeaderValues[i] = new StrValue(source.HeaderValues[i]);
            }
        }
        if (source.QueryValues != null) {
            this.QueryValues = new StrValue[source.QueryValues.length];
            for (int i = 0; i < source.QueryValues.length; i++) {
                this.QueryValues[i] = new StrValue(source.QueryValues[i]);
            }
        }
        if (source.RequestPostBody != null) {
            this.RequestPostBody = new String(source.RequestPostBody);
        }
        if (source.ResponseBody != null) {
            this.ResponseBody = new String(source.ResponseBody);
        }
        if (source.ResponseValues != null) {
            this.ResponseValues = new ValueInfo[source.ResponseValues.length];
            for (int i = 0; i < source.ResponseValues.length; i++) {
                this.ResponseValues[i] = new ValueInfo(source.ResponseValues[i]);
            }
        }
        if (source.FailMessage != null) {
            this.FailMessage = new String(source.FailMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArrayObj(map, prefix + "HeaderValues.", this.HeaderValues);
        this.setParamArrayObj(map, prefix + "QueryValues.", this.QueryValues);
        this.setParamSimple(map, prefix + "RequestPostBody", this.RequestPostBody);
        this.setParamSimple(map, prefix + "ResponseBody", this.ResponseBody);
        this.setParamArrayObj(map, prefix + "ResponseValues.", this.ResponseValues);
        this.setParamSimple(map, prefix + "FailMessage", this.FailMessage);

    }
}

