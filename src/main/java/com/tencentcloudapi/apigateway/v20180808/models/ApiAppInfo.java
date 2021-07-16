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

public class ApiAppInfo extends AbstractModel{

    /**
    * 应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiAppName")
    @Expose
    private String ApiAppName;

    /**
    * 应用ID
    */
    @SerializedName("ApiAppId")
    @Expose
    private String ApiAppId;

    /**
    * 应用SECRET
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiAppSecret")
    @Expose
    private String ApiAppSecret;

    /**
    * 应用描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiAppDesc")
    @Expose
    private String ApiAppDesc;

    /**
    * 创建时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 修改时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * 应用KEY
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiAppKey")
    @Expose
    private String ApiAppKey;

    /**
     * Get 应用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiAppName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiAppName() {
        return this.ApiAppName;
    }

    /**
     * Set 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiAppName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiAppName(String ApiAppName) {
        this.ApiAppName = ApiAppName;
    }

    /**
     * Get 应用ID 
     * @return ApiAppId 应用ID
     */
    public String getApiAppId() {
        return this.ApiAppId;
    }

    /**
     * Set 应用ID
     * @param ApiAppId 应用ID
     */
    public void setApiAppId(String ApiAppId) {
        this.ApiAppId = ApiAppId;
    }

    /**
     * Get 应用SECRET
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiAppSecret 应用SECRET
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiAppSecret() {
        return this.ApiAppSecret;
    }

    /**
     * Set 应用SECRET
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiAppSecret 应用SECRET
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiAppSecret(String ApiAppSecret) {
        this.ApiAppSecret = ApiAppSecret;
    }

    /**
     * Get 应用描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiAppDesc 应用描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiAppDesc() {
        return this.ApiAppDesc;
    }

    /**
     * Set 应用描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiAppDesc 应用描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiAppDesc(String ApiAppDesc) {
        this.ApiAppDesc = ApiAppDesc;
    }

    /**
     * Get 创建时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 修改时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedTime 修改时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 修改时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedTime 修改时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get 应用KEY
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiAppKey 应用KEY
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiAppKey() {
        return this.ApiAppKey;
    }

    /**
     * Set 应用KEY
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiAppKey 应用KEY
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiAppKey(String ApiAppKey) {
        this.ApiAppKey = ApiAppKey;
    }

    public ApiAppInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiAppInfo(ApiAppInfo source) {
        if (source.ApiAppName != null) {
            this.ApiAppName = new String(source.ApiAppName);
        }
        if (source.ApiAppId != null) {
            this.ApiAppId = new String(source.ApiAppId);
        }
        if (source.ApiAppSecret != null) {
            this.ApiAppSecret = new String(source.ApiAppSecret);
        }
        if (source.ApiAppDesc != null) {
            this.ApiAppDesc = new String(source.ApiAppDesc);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.ApiAppKey != null) {
            this.ApiAppKey = new String(source.ApiAppKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiAppName", this.ApiAppName);
        this.setParamSimple(map, prefix + "ApiAppId", this.ApiAppId);
        this.setParamSimple(map, prefix + "ApiAppSecret", this.ApiAppSecret);
        this.setParamSimple(map, prefix + "ApiAppDesc", this.ApiAppDesc);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "ApiAppKey", this.ApiAppKey);

    }
}

