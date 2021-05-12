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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigResponse extends AbstractModel{

    /**
    * 网络带宽硬盘大小的范围信息。
    */
    @SerializedName("NetworkStorageRange")
    @Expose
    private NetworkStorageRange NetworkStorageRange;

    /**
    * 镜像操作系统白名单。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageWhiteSet")
    @Expose
    private String [] ImageWhiteSet;

    /**
    * 网络限额信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceNetworkLimitConfigs")
    @Expose
    private InstanceNetworkLimitConfig [] InstanceNetworkLimitConfigs;

    /**
    * 镜像限额信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageLimits")
    @Expose
    private ImageLimitConfig ImageLimits;

    /**
    * 默认是否IP直通，用于模块创建，虚机购买等具有直通参数场景时的默认参数。
    */
    @SerializedName("DefaultIPDirect")
    @Expose
    private Boolean DefaultIPDirect;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 网络带宽硬盘大小的范围信息。 
     * @return NetworkStorageRange 网络带宽硬盘大小的范围信息。
     */
    public NetworkStorageRange getNetworkStorageRange() {
        return this.NetworkStorageRange;
    }

    /**
     * Set 网络带宽硬盘大小的范围信息。
     * @param NetworkStorageRange 网络带宽硬盘大小的范围信息。
     */
    public void setNetworkStorageRange(NetworkStorageRange NetworkStorageRange) {
        this.NetworkStorageRange = NetworkStorageRange;
    }

    /**
     * Get 镜像操作系统白名单。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageWhiteSet 镜像操作系统白名单。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getImageWhiteSet() {
        return this.ImageWhiteSet;
    }

    /**
     * Set 镜像操作系统白名单。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageWhiteSet 镜像操作系统白名单。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageWhiteSet(String [] ImageWhiteSet) {
        this.ImageWhiteSet = ImageWhiteSet;
    }

    /**
     * Get 网络限额信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceNetworkLimitConfigs 网络限额信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceNetworkLimitConfig [] getInstanceNetworkLimitConfigs() {
        return this.InstanceNetworkLimitConfigs;
    }

    /**
     * Set 网络限额信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceNetworkLimitConfigs 网络限额信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceNetworkLimitConfigs(InstanceNetworkLimitConfig [] InstanceNetworkLimitConfigs) {
        this.InstanceNetworkLimitConfigs = InstanceNetworkLimitConfigs;
    }

    /**
     * Get 镜像限额信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageLimits 镜像限额信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageLimitConfig getImageLimits() {
        return this.ImageLimits;
    }

    /**
     * Set 镜像限额信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageLimits 镜像限额信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageLimits(ImageLimitConfig ImageLimits) {
        this.ImageLimits = ImageLimits;
    }

    /**
     * Get 默认是否IP直通，用于模块创建，虚机购买等具有直通参数场景时的默认参数。 
     * @return DefaultIPDirect 默认是否IP直通，用于模块创建，虚机购买等具有直通参数场景时的默认参数。
     */
    public Boolean getDefaultIPDirect() {
        return this.DefaultIPDirect;
    }

    /**
     * Set 默认是否IP直通，用于模块创建，虚机购买等具有直通参数场景时的默认参数。
     * @param DefaultIPDirect 默认是否IP直通，用于模块创建，虚机购买等具有直通参数场景时的默认参数。
     */
    public void setDefaultIPDirect(Boolean DefaultIPDirect) {
        this.DefaultIPDirect = DefaultIPDirect;
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

    public DescribeConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigResponse(DescribeConfigResponse source) {
        if (source.NetworkStorageRange != null) {
            this.NetworkStorageRange = new NetworkStorageRange(source.NetworkStorageRange);
        }
        if (source.ImageWhiteSet != null) {
            this.ImageWhiteSet = new String[source.ImageWhiteSet.length];
            for (int i = 0; i < source.ImageWhiteSet.length; i++) {
                this.ImageWhiteSet[i] = new String(source.ImageWhiteSet[i]);
            }
        }
        if (source.InstanceNetworkLimitConfigs != null) {
            this.InstanceNetworkLimitConfigs = new InstanceNetworkLimitConfig[source.InstanceNetworkLimitConfigs.length];
            for (int i = 0; i < source.InstanceNetworkLimitConfigs.length; i++) {
                this.InstanceNetworkLimitConfigs[i] = new InstanceNetworkLimitConfig(source.InstanceNetworkLimitConfigs[i]);
            }
        }
        if (source.ImageLimits != null) {
            this.ImageLimits = new ImageLimitConfig(source.ImageLimits);
        }
        if (source.DefaultIPDirect != null) {
            this.DefaultIPDirect = new Boolean(source.DefaultIPDirect);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "NetworkStorageRange.", this.NetworkStorageRange);
        this.setParamArraySimple(map, prefix + "ImageWhiteSet.", this.ImageWhiteSet);
        this.setParamArrayObj(map, prefix + "InstanceNetworkLimitConfigs.", this.InstanceNetworkLimitConfigs);
        this.setParamObj(map, prefix + "ImageLimits.", this.ImageLimits);
        this.setParamSimple(map, prefix + "DefaultIPDirect", this.DefaultIPDirect);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

