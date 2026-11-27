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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchServerlessSpaceDataRequest extends AbstractModel {

    /**
    * <p>space空间id</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>请求url</p>
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
    * <p>method</p><p>枚举值：</p><ul><li>GET： get请求</li><li>POST： post请求</li><li>PUT： put请求</li></ul>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>请求体</p>
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
     * Get <p>space空间id</p> 
     * @return SpaceId <p>space空间id</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>space空间id</p>
     * @param SpaceId <p>space空间id</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>请求url</p> 
     * @return Uri <p>请求url</p>
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set <p>请求url</p>
     * @param Uri <p>请求url</p>
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    /**
     * Get <p>method</p><p>枚举值：</p><ul><li>GET： get请求</li><li>POST： post请求</li><li>PUT： put请求</li></ul> 
     * @return Method <p>method</p><p>枚举值：</p><ul><li>GET： get请求</li><li>POST： post请求</li><li>PUT： put请求</li></ul>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>method</p><p>枚举值：</p><ul><li>GET： get请求</li><li>POST： post请求</li><li>PUT： put请求</li></ul>
     * @param Method <p>method</p><p>枚举值：</p><ul><li>GET： get请求</li><li>POST： post请求</li><li>PUT： put请求</li></ul>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>请求体</p> 
     * @return Body <p>请求体</p>
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set <p>请求体</p>
     * @param Body <p>请求体</p>
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    public SearchServerlessSpaceDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchServerlessSpaceDataRequest(SearchServerlessSpaceDataRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.Uri != null) {
            this.Uri = new String(source.Uri);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "Uri", this.Uri);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Body", this.Body);

    }
}

