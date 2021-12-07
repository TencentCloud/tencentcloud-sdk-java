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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComplianceAssetDetailInfoResponse extends AbstractModel{

    /**
    * 某资产的详情。
    */
    @SerializedName("AssetDetailInfo")
    @Expose
    private ComplianceAssetDetailInfo AssetDetailInfo;

    /**
    * 当资产为容器时，返回此字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerDetailInfo")
    @Expose
    private ComplianceContainerDetailInfo ContainerDetailInfo;

    /**
    * 当资产为镜像时，返回此字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageDetailInfo")
    @Expose
    private ComplianceImageDetailInfo ImageDetailInfo;

    /**
    * 当资产为主机时，返回此字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostDetailInfo")
    @Expose
    private ComplianceHostDetailInfo HostDetailInfo;

    /**
    * 当资产为K8S时，返回此字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("K8SDetailInfo")
    @Expose
    private ComplianceK8SDetailInfo K8SDetailInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 某资产的详情。 
     * @return AssetDetailInfo 某资产的详情。
     */
    public ComplianceAssetDetailInfo getAssetDetailInfo() {
        return this.AssetDetailInfo;
    }

    /**
     * Set 某资产的详情。
     * @param AssetDetailInfo 某资产的详情。
     */
    public void setAssetDetailInfo(ComplianceAssetDetailInfo AssetDetailInfo) {
        this.AssetDetailInfo = AssetDetailInfo;
    }

    /**
     * Get 当资产为容器时，返回此字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerDetailInfo 当资产为容器时，返回此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ComplianceContainerDetailInfo getContainerDetailInfo() {
        return this.ContainerDetailInfo;
    }

    /**
     * Set 当资产为容器时，返回此字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerDetailInfo 当资产为容器时，返回此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerDetailInfo(ComplianceContainerDetailInfo ContainerDetailInfo) {
        this.ContainerDetailInfo = ContainerDetailInfo;
    }

    /**
     * Get 当资产为镜像时，返回此字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageDetailInfo 当资产为镜像时，返回此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ComplianceImageDetailInfo getImageDetailInfo() {
        return this.ImageDetailInfo;
    }

    /**
     * Set 当资产为镜像时，返回此字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageDetailInfo 当资产为镜像时，返回此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageDetailInfo(ComplianceImageDetailInfo ImageDetailInfo) {
        this.ImageDetailInfo = ImageDetailInfo;
    }

    /**
     * Get 当资产为主机时，返回此字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostDetailInfo 当资产为主机时，返回此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ComplianceHostDetailInfo getHostDetailInfo() {
        return this.HostDetailInfo;
    }

    /**
     * Set 当资产为主机时，返回此字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostDetailInfo 当资产为主机时，返回此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostDetailInfo(ComplianceHostDetailInfo HostDetailInfo) {
        this.HostDetailInfo = HostDetailInfo;
    }

    /**
     * Get 当资产为K8S时，返回此字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return K8SDetailInfo 当资产为K8S时，返回此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ComplianceK8SDetailInfo getK8SDetailInfo() {
        return this.K8SDetailInfo;
    }

    /**
     * Set 当资产为K8S时，返回此字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param K8SDetailInfo 当资产为K8S时，返回此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setK8SDetailInfo(ComplianceK8SDetailInfo K8SDetailInfo) {
        this.K8SDetailInfo = K8SDetailInfo;
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

    public DescribeComplianceAssetDetailInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComplianceAssetDetailInfoResponse(DescribeComplianceAssetDetailInfoResponse source) {
        if (source.AssetDetailInfo != null) {
            this.AssetDetailInfo = new ComplianceAssetDetailInfo(source.AssetDetailInfo);
        }
        if (source.ContainerDetailInfo != null) {
            this.ContainerDetailInfo = new ComplianceContainerDetailInfo(source.ContainerDetailInfo);
        }
        if (source.ImageDetailInfo != null) {
            this.ImageDetailInfo = new ComplianceImageDetailInfo(source.ImageDetailInfo);
        }
        if (source.HostDetailInfo != null) {
            this.HostDetailInfo = new ComplianceHostDetailInfo(source.HostDetailInfo);
        }
        if (source.K8SDetailInfo != null) {
            this.K8SDetailInfo = new ComplianceK8SDetailInfo(source.K8SDetailInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AssetDetailInfo.", this.AssetDetailInfo);
        this.setParamObj(map, prefix + "ContainerDetailInfo.", this.ContainerDetailInfo);
        this.setParamObj(map, prefix + "ImageDetailInfo.", this.ImageDetailInfo);
        this.setParamObj(map, prefix + "HostDetailInfo.", this.HostDetailInfo);
        this.setParamObj(map, prefix + "K8SDetailInfo.", this.K8SDetailInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

