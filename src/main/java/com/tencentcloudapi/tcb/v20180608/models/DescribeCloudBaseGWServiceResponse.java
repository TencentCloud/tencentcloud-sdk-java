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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudBaseGWServiceResponse extends AbstractModel {

    /**
    * 服务列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceSet")
    @Expose
    private CloudBaseGWService [] ServiceSet;

    /**
    * 是否开启服务
    */
    @SerializedName("EnableService")
    @Expose
    private Boolean EnableService;

    /**
    * 默认域名信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultDomain")
    @Expose
    private String DefaultDomain;

    /**
    * 是否开启CDN迁移
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableUnion")
    @Expose
    private Boolean EnableUnion;

    /**
    * 是否开启跨域校验，默认开启 true
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableCheckAcrossDomain")
    @Expose
    private Boolean EnableCheckAcrossDomain;

    /**
    * 自定义路由规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomRoutingRules")
    @Expose
    private String CustomRoutingRules;

    /**
    * 默认域名绑定类型，1绑定TCB-CDN，2绑定tcbingres（不经过cdn）
    */
    @SerializedName("AccessFlag")
    @Expose
    private Long AccessFlag;

    /**
    * 云接入源站域名
    */
    @SerializedName("OriginDomain")
    @Expose
    private String OriginDomain;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 服务列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceSet 服务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudBaseGWService [] getServiceSet() {
        return this.ServiceSet;
    }

    /**
     * Set 服务列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceSet 服务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceSet(CloudBaseGWService [] ServiceSet) {
        this.ServiceSet = ServiceSet;
    }

    /**
     * Get 是否开启服务 
     * @return EnableService 是否开启服务
     */
    public Boolean getEnableService() {
        return this.EnableService;
    }

    /**
     * Set 是否开启服务
     * @param EnableService 是否开启服务
     */
    public void setEnableService(Boolean EnableService) {
        this.EnableService = EnableService;
    }

    /**
     * Get 默认域名信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultDomain 默认域名信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultDomain() {
        return this.DefaultDomain;
    }

    /**
     * Set 默认域名信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultDomain 默认域名信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultDomain(String DefaultDomain) {
        this.DefaultDomain = DefaultDomain;
    }

    /**
     * Get 是否开启CDN迁移
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableUnion 是否开启CDN迁移
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableUnion() {
        return this.EnableUnion;
    }

    /**
     * Set 是否开启CDN迁移
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableUnion 是否开启CDN迁移
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableUnion(Boolean EnableUnion) {
        this.EnableUnion = EnableUnion;
    }

    /**
     * Get 是否开启跨域校验，默认开启 true
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableCheckAcrossDomain 是否开启跨域校验，默认开启 true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableCheckAcrossDomain() {
        return this.EnableCheckAcrossDomain;
    }

    /**
     * Set 是否开启跨域校验，默认开启 true
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableCheckAcrossDomain 是否开启跨域校验，默认开启 true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableCheckAcrossDomain(Boolean EnableCheckAcrossDomain) {
        this.EnableCheckAcrossDomain = EnableCheckAcrossDomain;
    }

    /**
     * Get 自定义路由规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomRoutingRules 自定义路由规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomRoutingRules() {
        return this.CustomRoutingRules;
    }

    /**
     * Set 自定义路由规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomRoutingRules 自定义路由规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomRoutingRules(String CustomRoutingRules) {
        this.CustomRoutingRules = CustomRoutingRules;
    }

    /**
     * Get 默认域名绑定类型，1绑定TCB-CDN，2绑定tcbingres（不经过cdn） 
     * @return AccessFlag 默认域名绑定类型，1绑定TCB-CDN，2绑定tcbingres（不经过cdn）
     */
    public Long getAccessFlag() {
        return this.AccessFlag;
    }

    /**
     * Set 默认域名绑定类型，1绑定TCB-CDN，2绑定tcbingres（不经过cdn）
     * @param AccessFlag 默认域名绑定类型，1绑定TCB-CDN，2绑定tcbingres（不经过cdn）
     */
    public void setAccessFlag(Long AccessFlag) {
        this.AccessFlag = AccessFlag;
    }

    /**
     * Get 云接入源站域名 
     * @return OriginDomain 云接入源站域名
     */
    public String getOriginDomain() {
        return this.OriginDomain;
    }

    /**
     * Set 云接入源站域名
     * @param OriginDomain 云接入源站域名
     */
    public void setOriginDomain(String OriginDomain) {
        this.OriginDomain = OriginDomain;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCloudBaseGWServiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudBaseGWServiceResponse(DescribeCloudBaseGWServiceResponse source) {
        if (source.ServiceSet != null) {
            this.ServiceSet = new CloudBaseGWService[source.ServiceSet.length];
            for (int i = 0; i < source.ServiceSet.length; i++) {
                this.ServiceSet[i] = new CloudBaseGWService(source.ServiceSet[i]);
            }
        }
        if (source.EnableService != null) {
            this.EnableService = new Boolean(source.EnableService);
        }
        if (source.DefaultDomain != null) {
            this.DefaultDomain = new String(source.DefaultDomain);
        }
        if (source.EnableUnion != null) {
            this.EnableUnion = new Boolean(source.EnableUnion);
        }
        if (source.EnableCheckAcrossDomain != null) {
            this.EnableCheckAcrossDomain = new Boolean(source.EnableCheckAcrossDomain);
        }
        if (source.CustomRoutingRules != null) {
            this.CustomRoutingRules = new String(source.CustomRoutingRules);
        }
        if (source.AccessFlag != null) {
            this.AccessFlag = new Long(source.AccessFlag);
        }
        if (source.OriginDomain != null) {
            this.OriginDomain = new String(source.OriginDomain);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ServiceSet.", this.ServiceSet);
        this.setParamSimple(map, prefix + "EnableService", this.EnableService);
        this.setParamSimple(map, prefix + "DefaultDomain", this.DefaultDomain);
        this.setParamSimple(map, prefix + "EnableUnion", this.EnableUnion);
        this.setParamSimple(map, prefix + "EnableCheckAcrossDomain", this.EnableCheckAcrossDomain);
        this.setParamSimple(map, prefix + "CustomRoutingRules", this.CustomRoutingRules);
        this.setParamSimple(map, prefix + "AccessFlag", this.AccessFlag);
        this.setParamSimple(map, prefix + "OriginDomain", this.OriginDomain);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

