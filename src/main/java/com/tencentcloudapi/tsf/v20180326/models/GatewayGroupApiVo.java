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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GatewayGroupApiVo extends AbstractModel{

    /**
    * API ID
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * API 请求路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * API 微服务名称
    */
    @SerializedName("MicroserviceName")
    @Expose
    private String MicroserviceName;

    /**
    * API 请求方法
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
     * Get API ID 
     * @return ApiId API ID
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set API ID
     * @param ApiId API ID
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get API 请求路径 
     * @return Path API 请求路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API 请求路径
     * @param Path API 请求路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get API 微服务名称 
     * @return MicroserviceName API 微服务名称
     */
    public String getMicroserviceName() {
        return this.MicroserviceName;
    }

    /**
     * Set API 微服务名称
     * @param MicroserviceName API 微服务名称
     */
    public void setMicroserviceName(String MicroserviceName) {
        this.MicroserviceName = MicroserviceName;
    }

    /**
     * Get API 请求方法
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Method API 请求方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set API 请求方法
注意：此字段可能返回 null，表示取不到有效值。
     * @param Method API 请求方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceName 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceName 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    public GatewayGroupApiVo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatewayGroupApiVo(GatewayGroupApiVo source) {
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.MicroserviceName != null) {
            this.MicroserviceName = new String(source.MicroserviceName);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "MicroserviceName", this.MicroserviceName);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);

    }
}

