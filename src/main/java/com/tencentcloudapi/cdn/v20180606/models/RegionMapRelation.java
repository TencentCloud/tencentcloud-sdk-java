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

public class RegionMapRelation  extends AbstractModel{

    /**
    * 区域ID。
    */
    @SerializedName("RegionId")
    @Expose
    private Integer RegionId;

    /**
    * 子区域ID列表
    */
    @SerializedName("SubRegionIdList")
    @Expose
    private Integer [] SubRegionIdList;

    /**
     * 获取区域ID。
     * @return RegionId 区域ID。
     */
    public Integer getRegionId() {
        return this.RegionId;
    }

    /**
     * 设置区域ID。
     * @param RegionId 区域ID。
     */
    public void setRegionId(Integer RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * 获取子区域ID列表
     * @return SubRegionIdList 子区域ID列表
     */
    public Integer [] getSubRegionIdList() {
        return this.SubRegionIdList;
    }

    /**
     * 设置子区域ID列表
     * @param SubRegionIdList 子区域ID列表
     */
    public void setSubRegionIdList(Integer [] SubRegionIdList) {
        this.SubRegionIdList = SubRegionIdList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamArraySimple(map, prefix + "SubRegionIdList.", this.SubRegionIdList);

    }
}

