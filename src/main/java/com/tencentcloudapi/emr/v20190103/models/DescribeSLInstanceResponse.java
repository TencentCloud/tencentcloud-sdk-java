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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSLInstanceResponse extends AbstractModel {

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例计费模式。0表示后付费，即按量计费，1表示预付费，即包年包月。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 实例存储类型。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 实例单节点磁盘容量，单位GB。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 实例节点规格。
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 实例可用区详细配置，包含可用区名称，VPC信息、节点数量。
    */
    @SerializedName("ZoneSettings")
    @Expose
    private ZoneSetting [] ZoneSettings;

    /**
    * 实例绑定的标签列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例计费模式。0表示后付费，即按量计费，1表示预付费，即包年包月。 
     * @return PayMode 实例计费模式。0表示后付费，即按量计费，1表示预付费，即包年包月。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 实例计费模式。0表示后付费，即按量计费，1表示预付费，即包年包月。
     * @param PayMode 实例计费模式。0表示后付费，即按量计费，1表示预付费，即包年包月。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 实例存储类型。 
     * @return DiskType 实例存储类型。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 实例存储类型。
     * @param DiskType 实例存储类型。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 实例单节点磁盘容量，单位GB。 
     * @return DiskSize 实例单节点磁盘容量，单位GB。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 实例单节点磁盘容量，单位GB。
     * @param DiskSize 实例单节点磁盘容量，单位GB。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 实例节点规格。 
     * @return NodeType 实例节点规格。
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 实例节点规格。
     * @param NodeType 实例节点规格。
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 实例可用区详细配置，包含可用区名称，VPC信息、节点数量。 
     * @return ZoneSettings 实例可用区详细配置，包含可用区名称，VPC信息、节点数量。
     */
    public ZoneSetting [] getZoneSettings() {
        return this.ZoneSettings;
    }

    /**
     * Set 实例可用区详细配置，包含可用区名称，VPC信息、节点数量。
     * @param ZoneSettings 实例可用区详细配置，包含可用区名称，VPC信息、节点数量。
     */
    public void setZoneSettings(ZoneSetting [] ZoneSettings) {
        this.ZoneSettings = ZoneSettings;
    }

    /**
     * Get 实例绑定的标签列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 实例绑定的标签列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 实例绑定的标签列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 实例绑定的标签列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
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

    public DescribeSLInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSLInstanceResponse(DescribeSLInstanceResponse source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.ZoneSettings != null) {
            this.ZoneSettings = new ZoneSetting[source.ZoneSettings.length];
            for (int i = 0; i < source.ZoneSettings.length; i++) {
                this.ZoneSettings[i] = new ZoneSetting(source.ZoneSettings[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamArrayObj(map, prefix + "ZoneSettings.", this.ZoneSettings);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

