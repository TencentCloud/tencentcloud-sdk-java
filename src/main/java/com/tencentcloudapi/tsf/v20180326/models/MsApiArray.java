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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MsApiArray extends AbstractModel {

    /**
    * <p>API 请求路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>请求方法</p>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>方法描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>API状态 0:离线 1:在线</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>API ID</p>
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * <p>API来源</p><p>枚举值：</p><ul><li>FROM_CONSUL： 服务注册</li><li>FROM_MANUAL： 手动录入</li></ul>
    */
    @SerializedName("SrcTypeName")
    @Expose
    private String SrcTypeName;

    /**
     * Get <p>API 请求路径</p> 
     * @return Path <p>API 请求路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>API 请求路径</p>
     * @param Path <p>API 请求路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>请求方法</p> 
     * @return Method <p>请求方法</p>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>请求方法</p>
     * @param Method <p>请求方法</p>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>方法描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>方法描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>方法描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>方法描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>API状态 0:离线 1:在线</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>API状态 0:离线 1:在线</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>API状态 0:离线 1:在线</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>API状态 0:离线 1:在线</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>API ID</p> 
     * @return ApiId <p>API ID</p>
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set <p>API ID</p>
     * @param ApiId <p>API ID</p>
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get <p>API来源</p><p>枚举值：</p><ul><li>FROM_CONSUL： 服务注册</li><li>FROM_MANUAL： 手动录入</li></ul> 
     * @return SrcTypeName <p>API来源</p><p>枚举值：</p><ul><li>FROM_CONSUL： 服务注册</li><li>FROM_MANUAL： 手动录入</li></ul>
     */
    public String getSrcTypeName() {
        return this.SrcTypeName;
    }

    /**
     * Set <p>API来源</p><p>枚举值：</p><ul><li>FROM_CONSUL： 服务注册</li><li>FROM_MANUAL： 手动录入</li></ul>
     * @param SrcTypeName <p>API来源</p><p>枚举值：</p><ul><li>FROM_CONSUL： 服务注册</li><li>FROM_MANUAL： 手动录入</li></ul>
     */
    public void setSrcTypeName(String SrcTypeName) {
        this.SrcTypeName = SrcTypeName;
    }

    public MsApiArray() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MsApiArray(MsApiArray source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.SrcTypeName != null) {
            this.SrcTypeName = new String(source.SrcTypeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "SrcTypeName", this.SrcTypeName);

    }
}

