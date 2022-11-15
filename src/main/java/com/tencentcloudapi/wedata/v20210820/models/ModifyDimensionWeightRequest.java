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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDimensionWeightRequest extends AbstractModel{

    /**
    * 权重信息列表
    */
    @SerializedName("WeightInfoList")
    @Expose
    private WeightInfo [] WeightInfoList;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 是否重刷历史数据
    */
    @SerializedName("Refresh")
    @Expose
    private Boolean Refresh;

    /**
     * Get 权重信息列表 
     * @return WeightInfoList 权重信息列表
     */
    public WeightInfo [] getWeightInfoList() {
        return this.WeightInfoList;
    }

    /**
     * Set 权重信息列表
     * @param WeightInfoList 权重信息列表
     */
    public void setWeightInfoList(WeightInfo [] WeightInfoList) {
        this.WeightInfoList = WeightInfoList;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 是否重刷历史数据 
     * @return Refresh 是否重刷历史数据
     */
    public Boolean getRefresh() {
        return this.Refresh;
    }

    /**
     * Set 是否重刷历史数据
     * @param Refresh 是否重刷历史数据
     */
    public void setRefresh(Boolean Refresh) {
        this.Refresh = Refresh;
    }

    public ModifyDimensionWeightRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDimensionWeightRequest(ModifyDimensionWeightRequest source) {
        if (source.WeightInfoList != null) {
            this.WeightInfoList = new WeightInfo[source.WeightInfoList.length];
            for (int i = 0; i < source.WeightInfoList.length; i++) {
                this.WeightInfoList[i] = new WeightInfo(source.WeightInfoList[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Refresh != null) {
            this.Refresh = new Boolean(source.Refresh);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "WeightInfoList.", this.WeightInfoList);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Refresh", this.Refresh);

    }
}

