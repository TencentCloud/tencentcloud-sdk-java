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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScenariosRequest extends AbstractModel{

    /**
    * 场景ID数组
    */
    @SerializedName("ScenarioIds")
    @Expose
    private String [] ScenarioIds;

    /**
    * 场景名
    */
    @SerializedName("ScenarioName")
    @Expose
    private String ScenarioName;

    /**
    * 场景状态数组
    */
    @SerializedName("ScenarioStatus")
    @Expose
    private Long [] ScenarioStatus;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序的列
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 是否正序
    */
    @SerializedName("Ascend")
    @Expose
    private Boolean Ascend;

    /**
    * 项目ID数组
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * 场景类型
    */
    @SerializedName("ScenarioType")
    @Expose
    private String ScenarioType;

    /**
     * Get 场景ID数组 
     * @return ScenarioIds 场景ID数组
     */
    public String [] getScenarioIds() {
        return this.ScenarioIds;
    }

    /**
     * Set 场景ID数组
     * @param ScenarioIds 场景ID数组
     */
    public void setScenarioIds(String [] ScenarioIds) {
        this.ScenarioIds = ScenarioIds;
    }

    /**
     * Get 场景名 
     * @return ScenarioName 场景名
     */
    public String getScenarioName() {
        return this.ScenarioName;
    }

    /**
     * Set 场景名
     * @param ScenarioName 场景名
     */
    public void setScenarioName(String ScenarioName) {
        this.ScenarioName = ScenarioName;
    }

    /**
     * Get 场景状态数组 
     * @return ScenarioStatus 场景状态数组
     */
    public Long [] getScenarioStatus() {
        return this.ScenarioStatus;
    }

    /**
     * Set 场景状态数组
     * @param ScenarioStatus 场景状态数组
     */
    public void setScenarioStatus(Long [] ScenarioStatus) {
        this.ScenarioStatus = ScenarioStatus;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大为100 
     * @return Limit 返回数量，默认为20，最大为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大为100
     * @param Limit 返回数量，默认为20，最大为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序的列 
     * @return OrderBy 排序的列
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序的列
     * @param OrderBy 排序的列
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 是否正序 
     * @return Ascend 是否正序
     */
    public Boolean getAscend() {
        return this.Ascend;
    }

    /**
     * Set 是否正序
     * @param Ascend 是否正序
     */
    public void setAscend(Boolean Ascend) {
        this.Ascend = Ascend;
    }

    /**
     * Get 项目ID数组 
     * @return ProjectIds 项目ID数组
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目ID数组
     * @param ProjectIds 项目ID数组
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 场景类型 
     * @return ScenarioType 场景类型
     */
    public String getScenarioType() {
        return this.ScenarioType;
    }

    /**
     * Set 场景类型
     * @param ScenarioType 场景类型
     */
    public void setScenarioType(String ScenarioType) {
        this.ScenarioType = ScenarioType;
    }

    public DescribeScenariosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScenariosRequest(DescribeScenariosRequest source) {
        if (source.ScenarioIds != null) {
            this.ScenarioIds = new String[source.ScenarioIds.length];
            for (int i = 0; i < source.ScenarioIds.length; i++) {
                this.ScenarioIds[i] = new String(source.ScenarioIds[i]);
            }
        }
        if (source.ScenarioName != null) {
            this.ScenarioName = new String(source.ScenarioName);
        }
        if (source.ScenarioStatus != null) {
            this.ScenarioStatus = new Long[source.ScenarioStatus.length];
            for (int i = 0; i < source.ScenarioStatus.length; i++) {
                this.ScenarioStatus[i] = new Long(source.ScenarioStatus[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Ascend != null) {
            this.Ascend = new Boolean(source.Ascend);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.ScenarioType != null) {
            this.ScenarioType = new String(source.ScenarioType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ScenarioIds.", this.ScenarioIds);
        this.setParamSimple(map, prefix + "ScenarioName", this.ScenarioName);
        this.setParamArraySimple(map, prefix + "ScenarioStatus.", this.ScenarioStatus);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Ascend", this.Ascend);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "ScenarioType", this.ScenarioType);

    }
}

