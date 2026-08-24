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

public class DeleteDisasterRecoveryVpcMappingRequest extends AbstractModel {

    /**
    * 删除容灾vpc映射主键id列表
    */
    @SerializedName("VpcMappingIds")
    @Expose
    private Long [] VpcMappingIds;

    /**
     * Get 删除容灾vpc映射主键id列表 
     * @return VpcMappingIds 删除容灾vpc映射主键id列表
     */
    public Long [] getVpcMappingIds() {
        return this.VpcMappingIds;
    }

    /**
     * Set 删除容灾vpc映射主键id列表
     * @param VpcMappingIds 删除容灾vpc映射主键id列表
     */
    public void setVpcMappingIds(Long [] VpcMappingIds) {
        this.VpcMappingIds = VpcMappingIds;
    }

    public DeleteDisasterRecoveryVpcMappingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDisasterRecoveryVpcMappingRequest(DeleteDisasterRecoveryVpcMappingRequest source) {
        if (source.VpcMappingIds != null) {
            this.VpcMappingIds = new Long[source.VpcMappingIds.length];
            for (int i = 0; i < source.VpcMappingIds.length; i++) {
                this.VpcMappingIds[i] = new Long(source.VpcMappingIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VpcMappingIds.", this.VpcMappingIds);

    }
}

