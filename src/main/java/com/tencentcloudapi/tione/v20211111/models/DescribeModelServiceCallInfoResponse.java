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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelServiceCallInfoResponse extends AbstractModel {

    /**
    * 服务调用信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceCallInfo")
    @Expose
    private ServiceCallInfo ServiceCallInfo;

    /**
    * 升级网关调用信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InferGatewayCallInfo")
    @Expose
    private InferGatewayCallInfo InferGatewayCallInfo;

    /**
    * 默认nginx网关的调用信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultNginxGatewayCallInfo")
    @Expose
    private DefaultNginxGatewayCallInfo DefaultNginxGatewayCallInfo;

    /**
    * 太极服务的调用信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TJCallInfo")
    @Expose
    private TJCallInfo TJCallInfo;

    /**
    * 内网调用信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntranetCallInfo")
    @Expose
    private IntranetCallInfo IntranetCallInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 服务调用信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceCallInfo 服务调用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceCallInfo getServiceCallInfo() {
        return this.ServiceCallInfo;
    }

    /**
     * Set 服务调用信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceCallInfo 服务调用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceCallInfo(ServiceCallInfo ServiceCallInfo) {
        this.ServiceCallInfo = ServiceCallInfo;
    }

    /**
     * Get 升级网关调用信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InferGatewayCallInfo 升级网关调用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InferGatewayCallInfo getInferGatewayCallInfo() {
        return this.InferGatewayCallInfo;
    }

    /**
     * Set 升级网关调用信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InferGatewayCallInfo 升级网关调用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInferGatewayCallInfo(InferGatewayCallInfo InferGatewayCallInfo) {
        this.InferGatewayCallInfo = InferGatewayCallInfo;
    }

    /**
     * Get 默认nginx网关的调用信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultNginxGatewayCallInfo 默认nginx网关的调用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DefaultNginxGatewayCallInfo getDefaultNginxGatewayCallInfo() {
        return this.DefaultNginxGatewayCallInfo;
    }

    /**
     * Set 默认nginx网关的调用信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultNginxGatewayCallInfo 默认nginx网关的调用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultNginxGatewayCallInfo(DefaultNginxGatewayCallInfo DefaultNginxGatewayCallInfo) {
        this.DefaultNginxGatewayCallInfo = DefaultNginxGatewayCallInfo;
    }

    /**
     * Get 太极服务的调用信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TJCallInfo 太极服务的调用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TJCallInfo getTJCallInfo() {
        return this.TJCallInfo;
    }

    /**
     * Set 太极服务的调用信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TJCallInfo 太极服务的调用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTJCallInfo(TJCallInfo TJCallInfo) {
        this.TJCallInfo = TJCallInfo;
    }

    /**
     * Get 内网调用信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntranetCallInfo 内网调用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntranetCallInfo getIntranetCallInfo() {
        return this.IntranetCallInfo;
    }

    /**
     * Set 内网调用信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntranetCallInfo 内网调用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntranetCallInfo(IntranetCallInfo IntranetCallInfo) {
        this.IntranetCallInfo = IntranetCallInfo;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeModelServiceCallInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelServiceCallInfoResponse(DescribeModelServiceCallInfoResponse source) {
        if (source.ServiceCallInfo != null) {
            this.ServiceCallInfo = new ServiceCallInfo(source.ServiceCallInfo);
        }
        if (source.InferGatewayCallInfo != null) {
            this.InferGatewayCallInfo = new InferGatewayCallInfo(source.InferGatewayCallInfo);
        }
        if (source.DefaultNginxGatewayCallInfo != null) {
            this.DefaultNginxGatewayCallInfo = new DefaultNginxGatewayCallInfo(source.DefaultNginxGatewayCallInfo);
        }
        if (source.TJCallInfo != null) {
            this.TJCallInfo = new TJCallInfo(source.TJCallInfo);
        }
        if (source.IntranetCallInfo != null) {
            this.IntranetCallInfo = new IntranetCallInfo(source.IntranetCallInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ServiceCallInfo.", this.ServiceCallInfo);
        this.setParamObj(map, prefix + "InferGatewayCallInfo.", this.InferGatewayCallInfo);
        this.setParamObj(map, prefix + "DefaultNginxGatewayCallInfo.", this.DefaultNginxGatewayCallInfo);
        this.setParamObj(map, prefix + "TJCallInfo.", this.TJCallInfo);
        this.setParamObj(map, prefix + "IntranetCallInfo.", this.IntranetCallInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

