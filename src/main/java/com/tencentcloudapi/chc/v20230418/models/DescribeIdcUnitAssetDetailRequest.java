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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIdcUnitAssetDetailRequest extends AbstractModel {

    /**
    * 机房管理单元ID
    */
    @SerializedName("IdcUnitId")
    @Expose
    private Long IdcUnitId;

    /**
     * Get 机房管理单元ID 
     * @return IdcUnitId 机房管理单元ID
     */
    public Long getIdcUnitId() {
        return this.IdcUnitId;
    }

    /**
     * Set 机房管理单元ID
     * @param IdcUnitId 机房管理单元ID
     */
    public void setIdcUnitId(Long IdcUnitId) {
        this.IdcUnitId = IdcUnitId;
    }

    public DescribeIdcUnitAssetDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIdcUnitAssetDetailRequest(DescribeIdcUnitAssetDetailRequest source) {
        if (source.IdcUnitId != null) {
            this.IdcUnitId = new Long(source.IdcUnitId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdcUnitId", this.IdcUnitId);

    }
}

