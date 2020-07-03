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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionMapRelation extends AbstractModel{

    /**
    * 区域ID。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 子区域ID列表
    */
    @SerializedName("SubRegionIdList")
    @Expose
    private Long [] SubRegionIdList;

    /**
     * Get 区域ID。 
     * @return RegionId 区域ID。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 区域ID。
     * @param RegionId 区域ID。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 子区域ID列表 
     * @return SubRegionIdList 子区域ID列表
     */
    public Long [] getSubRegionIdList() {
        return this.SubRegionIdList;
    }

    /**
     * Set 子区域ID列表
     * @param SubRegionIdList 子区域ID列表
     */
    public void setSubRegionIdList(Long [] SubRegionIdList) {
        this.SubRegionIdList = SubRegionIdList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamArraySimple(map, prefix + "SubRegionIdList.", this.SubRegionIdList);

    }
}

