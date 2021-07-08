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

public class AvailableApiInfo extends AbstractModel{

    /**
    * API ID。
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * API名称。
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * API类型。
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
    * API路径。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * API方法。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * API是否绑定其他插件。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachedOtherPlugin")
    @Expose
    private Boolean AttachedOtherPlugin;

    /**
    * API是否绑定当前插件。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAttached")
    @Expose
    private Boolean IsAttached;

    /**
     * Get API ID。 
     * @return ApiId API ID。
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set API ID。
     * @param ApiId API ID。
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get API名称。 
     * @return ApiName API名称。
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set API名称。
     * @param ApiName API名称。
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get API类型。 
     * @return ApiType API类型。
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set API类型。
     * @param ApiType API类型。
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    /**
     * Get API路径。 
     * @return Path API路径。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API路径。
     * @param Path API路径。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get API方法。 
     * @return Method API方法。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set API方法。
     * @param Method API方法。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get API是否绑定其他插件。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachedOtherPlugin API是否绑定其他插件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAttachedOtherPlugin() {
        return this.AttachedOtherPlugin;
    }

    /**
     * Set API是否绑定其他插件。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachedOtherPlugin API是否绑定其他插件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachedOtherPlugin(Boolean AttachedOtherPlugin) {
        this.AttachedOtherPlugin = AttachedOtherPlugin;
    }

    /**
     * Get API是否绑定当前插件。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAttached API是否绑定当前插件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsAttached() {
        return this.IsAttached;
    }

    /**
     * Set API是否绑定当前插件。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAttached API是否绑定当前插件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAttached(Boolean IsAttached) {
        this.IsAttached = IsAttached;
    }

    public AvailableApiInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvailableApiInfo(AvailableApiInfo source) {
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.ApiType != null) {
            this.ApiType = new String(source.ApiType);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.AttachedOtherPlugin != null) {
            this.AttachedOtherPlugin = new Boolean(source.AttachedOtherPlugin);
        }
        if (source.IsAttached != null) {
            this.IsAttached = new Boolean(source.IsAttached);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "AttachedOtherPlugin", this.AttachedOtherPlugin);
        this.setParamSimple(map, prefix + "IsAttached", this.IsAttached);

    }
}

