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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosConfig extends AbstractModel{

    /**
    * API调用后端COS的方式，前端请求方法与Action的可选值为：
GET：GetObject
PUT：PutObject
POST：PostObject、AppendObject
HEAD： HeadObject
DELETE： DeleteObject。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * API后端COS的存储桶名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * API调用后端COS的签名开关，默认为false。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Authorization")
    @Expose
    private Boolean Authorization;

    /**
    * API后端COS的路径匹配模式，可选值：
BackEndPath ： 后端路径匹配
FullPath ： 全路径匹配

默认值为：BackEndPath
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PathMatchMode")
    @Expose
    private String PathMatchMode;

    /**
     * Get API调用后端COS的方式，前端请求方法与Action的可选值为：
GET：GetObject
PUT：PutObject
POST：PostObject、AppendObject
HEAD： HeadObject
DELETE： DeleteObject。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action API调用后端COS的方式，前端请求方法与Action的可选值为：
GET：GetObject
PUT：PutObject
POST：PostObject、AppendObject
HEAD： HeadObject
DELETE： DeleteObject。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set API调用后端COS的方式，前端请求方法与Action的可选值为：
GET：GetObject
PUT：PutObject
POST：PostObject、AppendObject
HEAD： HeadObject
DELETE： DeleteObject。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action API调用后端COS的方式，前端请求方法与Action的可选值为：
GET：GetObject
PUT：PutObject
POST：PostObject、AppendObject
HEAD： HeadObject
DELETE： DeleteObject。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get API后端COS的存储桶名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BucketName API后端COS的存储桶名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set API后端COS的存储桶名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BucketName API后端COS的存储桶名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get API调用后端COS的签名开关，默认为false。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Authorization API调用后端COS的签名开关，默认为false。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAuthorization() {
        return this.Authorization;
    }

    /**
     * Set API调用后端COS的签名开关，默认为false。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Authorization API调用后端COS的签名开关，默认为false。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthorization(Boolean Authorization) {
        this.Authorization = Authorization;
    }

    /**
     * Get API后端COS的路径匹配模式，可选值：
BackEndPath ： 后端路径匹配
FullPath ： 全路径匹配

默认值为：BackEndPath
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PathMatchMode API后端COS的路径匹配模式，可选值：
BackEndPath ： 后端路径匹配
FullPath ： 全路径匹配

默认值为：BackEndPath
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPathMatchMode() {
        return this.PathMatchMode;
    }

    /**
     * Set API后端COS的路径匹配模式，可选值：
BackEndPath ： 后端路径匹配
FullPath ： 全路径匹配

默认值为：BackEndPath
注意：此字段可能返回 null，表示取不到有效值。
     * @param PathMatchMode API后端COS的路径匹配模式，可选值：
BackEndPath ： 后端路径匹配
FullPath ： 全路径匹配

默认值为：BackEndPath
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPathMatchMode(String PathMatchMode) {
        this.PathMatchMode = PathMatchMode;
    }

    public CosConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosConfig(CosConfig source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.Authorization != null) {
            this.Authorization = new Boolean(source.Authorization);
        }
        if (source.PathMatchMode != null) {
            this.PathMatchMode = new String(source.PathMatchMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "Authorization", this.Authorization);
        this.setParamSimple(map, prefix + "PathMatchMode", this.PathMatchMode);

    }
}

