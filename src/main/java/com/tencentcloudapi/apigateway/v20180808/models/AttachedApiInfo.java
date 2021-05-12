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

public class AttachedApiInfo extends AbstractModel{

    /**
    * API所在服务ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * API所在服务名称。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * API所在服务描述信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceDesc")
    @Expose
    private String ServiceDesc;

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
    * API描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiDesc")
    @Expose
    private String ApiDesc;

    /**
    * 插件绑定API的环境。
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * 插件和API绑定时间。
    */
    @SerializedName("AttachedTime")
    @Expose
    private String AttachedTime;

    /**
     * Get API所在服务ID。 
     * @return ServiceId API所在服务ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set API所在服务ID。
     * @param ServiceId API所在服务ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get API所在服务名称。 
     * @return ServiceName API所在服务名称。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set API所在服务名称。
     * @param ServiceName API所在服务名称。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get API所在服务描述信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceDesc API所在服务描述信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceDesc() {
        return this.ServiceDesc;
    }

    /**
     * Set API所在服务描述信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceDesc API所在服务描述信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceDesc(String ServiceDesc) {
        this.ServiceDesc = ServiceDesc;
    }

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
     * Get API描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiDesc API描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiDesc() {
        return this.ApiDesc;
    }

    /**
     * Set API描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiDesc API描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiDesc(String ApiDesc) {
        this.ApiDesc = ApiDesc;
    }

    /**
     * Get 插件绑定API的环境。 
     * @return Environment 插件绑定API的环境。
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 插件绑定API的环境。
     * @param Environment 插件绑定API的环境。
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get 插件和API绑定时间。 
     * @return AttachedTime 插件和API绑定时间。
     */
    public String getAttachedTime() {
        return this.AttachedTime;
    }

    /**
     * Set 插件和API绑定时间。
     * @param AttachedTime 插件和API绑定时间。
     */
    public void setAttachedTime(String AttachedTime) {
        this.AttachedTime = AttachedTime;
    }

    public AttachedApiInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachedApiInfo(AttachedApiInfo source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceDesc != null) {
            this.ServiceDesc = new String(source.ServiceDesc);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.ApiDesc != null) {
            this.ApiDesc = new String(source.ApiDesc);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.AttachedTime != null) {
            this.AttachedTime = new String(source.AttachedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceDesc", this.ServiceDesc);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "ApiDesc", this.ApiDesc);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamSimple(map, prefix + "AttachedTime", this.AttachedTime);

    }
}

