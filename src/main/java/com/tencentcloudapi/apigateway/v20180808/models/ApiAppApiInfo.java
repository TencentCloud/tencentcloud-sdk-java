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

public class ApiAppApiInfo extends AbstractModel{

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
    * Api的ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * Api名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * 服务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 授权绑定时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthorizedTime")
    @Expose
    private String AuthorizedTime;

    /**
    * Api所属地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiRegion")
    @Expose
    private String ApiRegion;

    /**
    * 授权绑定的环境
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

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
     * Get Api的ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiId Api的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set Api的ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiId Api的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get Api名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiName Api名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set Api名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiName Api名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get 服务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceId 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceId 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 授权绑定时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthorizedTime 授权绑定时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthorizedTime() {
        return this.AuthorizedTime;
    }

    /**
     * Set 授权绑定时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthorizedTime 授权绑定时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthorizedTime(String AuthorizedTime) {
        this.AuthorizedTime = AuthorizedTime;
    }

    /**
     * Get Api所属地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiRegion Api所属地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiRegion() {
        return this.ApiRegion;
    }

    /**
     * Set Api所属地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiRegion Api所属地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiRegion(String ApiRegion) {
        this.ApiRegion = ApiRegion;
    }

    /**
     * Get 授权绑定的环境
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvironmentName 授权绑定的环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set 授权绑定的环境
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvironmentName 授权绑定的环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    public ApiAppApiInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiAppApiInfo(ApiAppApiInfo source) {
        if (source.ApiAppName != null) {
            this.ApiAppName = new String(source.ApiAppName);
        }
        if (source.ApiAppId != null) {
            this.ApiAppId = new String(source.ApiAppId);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.AuthorizedTime != null) {
            this.AuthorizedTime = new String(source.AuthorizedTime);
        }
        if (source.ApiRegion != null) {
            this.ApiRegion = new String(source.ApiRegion);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiAppName", this.ApiAppName);
        this.setParamSimple(map, prefix + "ApiAppId", this.ApiAppId);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "AuthorizedTime", this.AuthorizedTime);
        this.setParamSimple(map, prefix + "ApiRegion", this.ApiRegion);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);

    }
}

