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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCopyPairsRequest extends AbstractModel {

    /**
    * 要删除的复制对ID列表（长度 1~10）
    */
    @SerializedName("CopyPairIds")
    @Expose
    private String [] CopyPairIds;

    /**
    * 要删除复制对的类型，可选值：DISK、INSTANCE、CFS
    */
    @SerializedName("CopyPairType")
    @Expose
    private String CopyPairType;

    /**
    * 是否一并删除容灾站点云盘，默认 true（容灾盘数据可能处于中间状态，保留也无法正常使用）
    */
    @SerializedName("DeleteTargetResource")
    @Expose
    private Boolean DeleteTargetResource;

    /**
     * Get 要删除的复制对ID列表（长度 1~10） 
     * @return CopyPairIds 要删除的复制对ID列表（长度 1~10）
     */
    public String [] getCopyPairIds() {
        return this.CopyPairIds;
    }

    /**
     * Set 要删除的复制对ID列表（长度 1~10）
     * @param CopyPairIds 要删除的复制对ID列表（长度 1~10）
     */
    public void setCopyPairIds(String [] CopyPairIds) {
        this.CopyPairIds = CopyPairIds;
    }

    /**
     * Get 要删除复制对的类型，可选值：DISK、INSTANCE、CFS 
     * @return CopyPairType 要删除复制对的类型，可选值：DISK、INSTANCE、CFS
     */
    public String getCopyPairType() {
        return this.CopyPairType;
    }

    /**
     * Set 要删除复制对的类型，可选值：DISK、INSTANCE、CFS
     * @param CopyPairType 要删除复制对的类型，可选值：DISK、INSTANCE、CFS
     */
    public void setCopyPairType(String CopyPairType) {
        this.CopyPairType = CopyPairType;
    }

    /**
     * Get 是否一并删除容灾站点云盘，默认 true（容灾盘数据可能处于中间状态，保留也无法正常使用） 
     * @return DeleteTargetResource 是否一并删除容灾站点云盘，默认 true（容灾盘数据可能处于中间状态，保留也无法正常使用）
     */
    public Boolean getDeleteTargetResource() {
        return this.DeleteTargetResource;
    }

    /**
     * Set 是否一并删除容灾站点云盘，默认 true（容灾盘数据可能处于中间状态，保留也无法正常使用）
     * @param DeleteTargetResource 是否一并删除容灾站点云盘，默认 true（容灾盘数据可能处于中间状态，保留也无法正常使用）
     */
    public void setDeleteTargetResource(Boolean DeleteTargetResource) {
        this.DeleteTargetResource = DeleteTargetResource;
    }

    public DeleteCopyPairsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCopyPairsRequest(DeleteCopyPairsRequest source) {
        if (source.CopyPairIds != null) {
            this.CopyPairIds = new String[source.CopyPairIds.length];
            for (int i = 0; i < source.CopyPairIds.length; i++) {
                this.CopyPairIds[i] = new String(source.CopyPairIds[i]);
            }
        }
        if (source.CopyPairType != null) {
            this.CopyPairType = new String(source.CopyPairType);
        }
        if (source.DeleteTargetResource != null) {
            this.DeleteTargetResource = new Boolean(source.DeleteTargetResource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CopyPairIds.", this.CopyPairIds);
        this.setParamSimple(map, prefix + "CopyPairType", this.CopyPairType);
        this.setParamSimple(map, prefix + "DeleteTargetResource", this.DeleteTargetResource);

    }
}

