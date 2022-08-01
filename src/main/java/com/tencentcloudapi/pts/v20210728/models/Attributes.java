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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Attributes extends AbstractModel{

    /**
    * 采用请求返回码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 采样请求结果码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 采样请求API
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 采样请求调用方法
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 采样请求延时时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
     * Get 采用请求返回码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 采用请求返回码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 采用请求返回码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 采用请求返回码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 采样请求结果码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 采样请求结果码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 采样请求结果码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 采样请求结果码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 采样请求API
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Service 采样请求API
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 采样请求API
注意：此字段可能返回 null，表示取不到有效值。
     * @param Service 采样请求API
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 采样请求调用方法
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Method 采样请求调用方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 采样请求调用方法
注意：此字段可能返回 null，表示取不到有效值。
     * @param Method 采样请求调用方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 采样请求延时时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 采样请求延时时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 采样请求延时时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 采样请求延时时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public Attributes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Attributes(Attributes source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

