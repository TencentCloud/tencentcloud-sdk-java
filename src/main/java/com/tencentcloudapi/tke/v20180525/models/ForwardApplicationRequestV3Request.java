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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForwardApplicationRequestV3Request extends AbstractModel{

    /**
    * 请求集群addon的访问
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 请求集群addon的路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 请求集群addon后允许接收的数据格式
    */
    @SerializedName("Accept")
    @Expose
    private String Accept;

    /**
    * 请求集群addon的数据格式
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * 请求集群addon的数据
    */
    @SerializedName("RequestBody")
    @Expose
    private String RequestBody;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 是否编码请求内容
    */
    @SerializedName("EncodedBody")
    @Expose
    private String EncodedBody;

    /**
     * Get 请求集群addon的访问 
     * @return Method 请求集群addon的访问
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 请求集群addon的访问
     * @param Method 请求集群addon的访问
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 请求集群addon的路径 
     * @return Path 请求集群addon的路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 请求集群addon的路径
     * @param Path 请求集群addon的路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 请求集群addon后允许接收的数据格式 
     * @return Accept 请求集群addon后允许接收的数据格式
     */
    public String getAccept() {
        return this.Accept;
    }

    /**
     * Set 请求集群addon后允许接收的数据格式
     * @param Accept 请求集群addon后允许接收的数据格式
     */
    public void setAccept(String Accept) {
        this.Accept = Accept;
    }

    /**
     * Get 请求集群addon的数据格式 
     * @return ContentType 请求集群addon的数据格式
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set 请求集群addon的数据格式
     * @param ContentType 请求集群addon的数据格式
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 请求集群addon的数据 
     * @return RequestBody 请求集群addon的数据
     */
    public String getRequestBody() {
        return this.RequestBody;
    }

    /**
     * Set 请求集群addon的数据
     * @param RequestBody 请求集群addon的数据
     */
    public void setRequestBody(String RequestBody) {
        this.RequestBody = RequestBody;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 是否编码请求内容 
     * @return EncodedBody 是否编码请求内容
     */
    public String getEncodedBody() {
        return this.EncodedBody;
    }

    /**
     * Set 是否编码请求内容
     * @param EncodedBody 是否编码请求内容
     */
    public void setEncodedBody(String EncodedBody) {
        this.EncodedBody = EncodedBody;
    }

    public ForwardApplicationRequestV3Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForwardApplicationRequestV3Request(ForwardApplicationRequestV3Request source) {
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Accept != null) {
            this.Accept = new String(source.Accept);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.RequestBody != null) {
            this.RequestBody = new String(source.RequestBody);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.EncodedBody != null) {
            this.EncodedBody = new String(source.EncodedBody);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Accept", this.Accept);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "RequestBody", this.RequestBody);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "EncodedBody", this.EncodedBody);

    }
}

