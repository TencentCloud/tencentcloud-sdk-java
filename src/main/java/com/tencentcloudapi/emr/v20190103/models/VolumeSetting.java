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

public class VolumeSetting extends AbstractModel {

    /**
    * 数据卷类型
<li>HOST_PATH表示支持本机路径</li>
<li>NEW_PVC表示新建PVC</li>
组件角色支持的数据卷类型可参考 EMR on TKE 集群部署说明：[部署说明](https://cloud.tencent.com/document/product/589/94254)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeType")
    @Expose
    private String VolumeType;

    /**
    * 主机路径信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostPath")
    @Expose
    private HostPathVolumeSource HostPath;

    /**
     * Get 数据卷类型
<li>HOST_PATH表示支持本机路径</li>
<li>NEW_PVC表示新建PVC</li>
组件角色支持的数据卷类型可参考 EMR on TKE 集群部署说明：[部署说明](https://cloud.tencent.com/document/product/589/94254)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeType 数据卷类型
<li>HOST_PATH表示支持本机路径</li>
<li>NEW_PVC表示新建PVC</li>
组件角色支持的数据卷类型可参考 EMR on TKE 集群部署说明：[部署说明](https://cloud.tencent.com/document/product/589/94254)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVolumeType() {
        return this.VolumeType;
    }

    /**
     * Set 数据卷类型
<li>HOST_PATH表示支持本机路径</li>
<li>NEW_PVC表示新建PVC</li>
组件角色支持的数据卷类型可参考 EMR on TKE 集群部署说明：[部署说明](https://cloud.tencent.com/document/product/589/94254)
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeType 数据卷类型
<li>HOST_PATH表示支持本机路径</li>
<li>NEW_PVC表示新建PVC</li>
组件角色支持的数据卷类型可参考 EMR on TKE 集群部署说明：[部署说明](https://cloud.tencent.com/document/product/589/94254)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeType(String VolumeType) {
        this.VolumeType = VolumeType;
    }

    /**
     * Get 主机路径信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostPath 主机路径信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HostPathVolumeSource getHostPath() {
        return this.HostPath;
    }

    /**
     * Set 主机路径信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostPath 主机路径信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostPath(HostPathVolumeSource HostPath) {
        this.HostPath = HostPath;
    }

    public VolumeSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VolumeSetting(VolumeSetting source) {
        if (source.VolumeType != null) {
            this.VolumeType = new String(source.VolumeType);
        }
        if (source.HostPath != null) {
            this.HostPath = new HostPathVolumeSource(source.HostPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeType", this.VolumeType);
        this.setParamObj(map, prefix + "HostPath.", this.HostPath);

    }
}

