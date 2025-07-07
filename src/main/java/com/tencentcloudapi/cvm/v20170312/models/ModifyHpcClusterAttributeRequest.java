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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyHpcClusterAttributeRequest extends AbstractModel {

    /**
    * 高性能计算集群ID。集群ID可通过 [查询高性能集群信息](https://cloud.tencent.com/document/api/213/83220) 接口获取。
    */
    @SerializedName("HpcClusterId")
    @Expose
    private String HpcClusterId;

    /**
    * 高性能计算集群新名称，长度限制[1-60]。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 高性能计算集群新备注，长度[1-256]。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 高性能计算集群ID。集群ID可通过 [查询高性能集群信息](https://cloud.tencent.com/document/api/213/83220) 接口获取。 
     * @return HpcClusterId 高性能计算集群ID。集群ID可通过 [查询高性能集群信息](https://cloud.tencent.com/document/api/213/83220) 接口获取。
     */
    public String getHpcClusterId() {
        return this.HpcClusterId;
    }

    /**
     * Set 高性能计算集群ID。集群ID可通过 [查询高性能集群信息](https://cloud.tencent.com/document/api/213/83220) 接口获取。
     * @param HpcClusterId 高性能计算集群ID。集群ID可通过 [查询高性能集群信息](https://cloud.tencent.com/document/api/213/83220) 接口获取。
     */
    public void setHpcClusterId(String HpcClusterId) {
        this.HpcClusterId = HpcClusterId;
    }

    /**
     * Get 高性能计算集群新名称，长度限制[1-60]。 
     * @return Name 高性能计算集群新名称，长度限制[1-60]。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 高性能计算集群新名称，长度限制[1-60]。
     * @param Name 高性能计算集群新名称，长度限制[1-60]。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 高性能计算集群新备注，长度[1-256]。 
     * @return Remark 高性能计算集群新备注，长度[1-256]。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 高性能计算集群新备注，长度[1-256]。
     * @param Remark 高性能计算集群新备注，长度[1-256]。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyHpcClusterAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyHpcClusterAttributeRequest(ModifyHpcClusterAttributeRequest source) {
        if (source.HpcClusterId != null) {
            this.HpcClusterId = new String(source.HpcClusterId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HpcClusterId", this.HpcClusterId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

