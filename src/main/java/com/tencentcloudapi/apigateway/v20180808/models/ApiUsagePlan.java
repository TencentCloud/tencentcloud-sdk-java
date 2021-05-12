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

public class ApiUsagePlan extends AbstractModel{

    /**
    * 服务唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * API 唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * API 名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * API 路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * API 方法。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 使用计划的唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsagePlanId")
    @Expose
    private String UsagePlanId;

    /**
    * 使用计划的名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsagePlanName")
    @Expose
    private String UsagePlanName;

    /**
    * 使用计划的描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsagePlanDesc")
    @Expose
    private String UsagePlanDesc;

    /**
    * 使用计划绑定的服务环境。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * 已经使用的配额。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InUseRequestNum")
    @Expose
    private Long InUseRequestNum;

    /**
    * 请求配额总量，-1表示没有限制。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRequestNum")
    @Expose
    private Long MaxRequestNum;

    /**
    * 请求 QPS 上限，-1 表示没有限制。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRequestNumPreSec")
    @Expose
    private Long MaxRequestNumPreSec;

    /**
    * 使用计划创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 使用计划最后修改时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * 服务名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
     * Get 服务唯一ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceId 服务唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceId 服务唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get API 唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiId API 唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set API 唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiId API 唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get API 名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiName API 名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set API 名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiName API 名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get API 路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path API 路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API 路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path API 路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get API 方法。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Method API 方法。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set API 方法。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Method API 方法。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 使用计划的唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsagePlanId 使用计划的唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsagePlanId() {
        return this.UsagePlanId;
    }

    /**
     * Set 使用计划的唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsagePlanId 使用计划的唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsagePlanId(String UsagePlanId) {
        this.UsagePlanId = UsagePlanId;
    }

    /**
     * Get 使用计划的名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsagePlanName 使用计划的名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsagePlanName() {
        return this.UsagePlanName;
    }

    /**
     * Set 使用计划的名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsagePlanName 使用计划的名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsagePlanName(String UsagePlanName) {
        this.UsagePlanName = UsagePlanName;
    }

    /**
     * Get 使用计划的描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsagePlanDesc 使用计划的描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsagePlanDesc() {
        return this.UsagePlanDesc;
    }

    /**
     * Set 使用计划的描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsagePlanDesc 使用计划的描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsagePlanDesc(String UsagePlanDesc) {
        this.UsagePlanDesc = UsagePlanDesc;
    }

    /**
     * Get 使用计划绑定的服务环境。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Environment 使用计划绑定的服务环境。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 使用计划绑定的服务环境。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Environment 使用计划绑定的服务环境。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get 已经使用的配额。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InUseRequestNum 已经使用的配额。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInUseRequestNum() {
        return this.InUseRequestNum;
    }

    /**
     * Set 已经使用的配额。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InUseRequestNum 已经使用的配额。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInUseRequestNum(Long InUseRequestNum) {
        this.InUseRequestNum = InUseRequestNum;
    }

    /**
     * Get 请求配额总量，-1表示没有限制。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRequestNum 请求配额总量，-1表示没有限制。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxRequestNum() {
        return this.MaxRequestNum;
    }

    /**
     * Set 请求配额总量，-1表示没有限制。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRequestNum 请求配额总量，-1表示没有限制。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxRequestNum(Long MaxRequestNum) {
        this.MaxRequestNum = MaxRequestNum;
    }

    /**
     * Get 请求 QPS 上限，-1 表示没有限制。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRequestNumPreSec 请求 QPS 上限，-1 表示没有限制。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxRequestNumPreSec() {
        return this.MaxRequestNumPreSec;
    }

    /**
     * Set 请求 QPS 上限，-1 表示没有限制。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRequestNumPreSec 请求 QPS 上限，-1 表示没有限制。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxRequestNumPreSec(Long MaxRequestNumPreSec) {
        this.MaxRequestNumPreSec = MaxRequestNumPreSec;
    }

    /**
     * Get 使用计划创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 使用计划创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 使用计划创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 使用计划创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 使用计划最后修改时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedTime 使用计划最后修改时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 使用计划最后修改时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedTime 使用计划最后修改时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get 服务名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName 服务名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName 服务名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    public ApiUsagePlan() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiUsagePlan(ApiUsagePlan source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.UsagePlanId != null) {
            this.UsagePlanId = new String(source.UsagePlanId);
        }
        if (source.UsagePlanName != null) {
            this.UsagePlanName = new String(source.UsagePlanName);
        }
        if (source.UsagePlanDesc != null) {
            this.UsagePlanDesc = new String(source.UsagePlanDesc);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.InUseRequestNum != null) {
            this.InUseRequestNum = new Long(source.InUseRequestNum);
        }
        if (source.MaxRequestNum != null) {
            this.MaxRequestNum = new Long(source.MaxRequestNum);
        }
        if (source.MaxRequestNumPreSec != null) {
            this.MaxRequestNumPreSec = new Long(source.MaxRequestNumPreSec);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "UsagePlanId", this.UsagePlanId);
        this.setParamSimple(map, prefix + "UsagePlanName", this.UsagePlanName);
        this.setParamSimple(map, prefix + "UsagePlanDesc", this.UsagePlanDesc);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamSimple(map, prefix + "InUseRequestNum", this.InUseRequestNum);
        this.setParamSimple(map, prefix + "MaxRequestNum", this.MaxRequestNum);
        this.setParamSimple(map, prefix + "MaxRequestNumPreSec", this.MaxRequestNumPreSec);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);

    }
}

