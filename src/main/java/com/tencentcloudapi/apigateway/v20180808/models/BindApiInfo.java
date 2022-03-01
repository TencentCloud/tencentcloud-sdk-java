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

public class BindApiInfo extends AbstractModel{

    /**
    * api唯一id
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * Service唯一id
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * api名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * 服务名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 绑定时间
    */
    @SerializedName("BindTime")
    @Expose
    private String BindTime;

    /**
     * Get api唯一id 
     * @return ApiId api唯一id
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set api唯一id
     * @param ApiId api唯一id
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get Service唯一id 
     * @return ServiceId Service唯一id
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Service唯一id
     * @param ServiceId Service唯一id
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get api名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiName api名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set api名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiName api名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get 服务名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName 服务名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName 服务名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 绑定时间 
     * @return BindTime 绑定时间
     */
    public String getBindTime() {
        return this.BindTime;
    }

    /**
     * Set 绑定时间
     * @param BindTime 绑定时间
     */
    public void setBindTime(String BindTime) {
        this.BindTime = BindTime;
    }

    public BindApiInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindApiInfo(BindApiInfo source) {
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.BindTime != null) {
            this.BindTime = new String(source.BindTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "BindTime", this.BindTime);

    }
}

