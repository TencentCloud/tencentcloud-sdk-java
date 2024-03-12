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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRiskCenterAssetViewCFGRiskListResponse extends AbstractModel {

    /**
    * 总条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 资产视角的配置风险列表
    */
    @SerializedName("Data")
    @Expose
    private AssetViewCFGRisk [] Data;

    /**
    * 状态列表
    */
    @SerializedName("StatusLists")
    @Expose
    private FilterDataObject [] StatusLists;

    /**
    * 危险等级列表
    */
    @SerializedName("LevelLists")
    @Expose
    private FilterDataObject [] LevelLists;

    /**
    * 配置名列表
    */
    @SerializedName("CFGNameLists")
    @Expose
    private FilterDataObject [] CFGNameLists;

    /**
    * 检查类型列表
    */
    @SerializedName("CheckTypeLists")
    @Expose
    private FilterDataObject [] CheckTypeLists;

    /**
    * 资产类型列表
    */
    @SerializedName("InstanceTypeLists")
    @Expose
    private FilterDataObject [] InstanceTypeLists;

    /**
    * 来源列表
    */
    @SerializedName("FromLists")
    @Expose
    private FilterDataObject [] FromLists;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总条数 
     * @return TotalCount 总条数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总条数
     * @param TotalCount 总条数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 资产视角的配置风险列表 
     * @return Data 资产视角的配置风险列表
     */
    public AssetViewCFGRisk [] getData() {
        return this.Data;
    }

    /**
     * Set 资产视角的配置风险列表
     * @param Data 资产视角的配置风险列表
     */
    public void setData(AssetViewCFGRisk [] Data) {
        this.Data = Data;
    }

    /**
     * Get 状态列表 
     * @return StatusLists 状态列表
     */
    public FilterDataObject [] getStatusLists() {
        return this.StatusLists;
    }

    /**
     * Set 状态列表
     * @param StatusLists 状态列表
     */
    public void setStatusLists(FilterDataObject [] StatusLists) {
        this.StatusLists = StatusLists;
    }

    /**
     * Get 危险等级列表 
     * @return LevelLists 危险等级列表
     */
    public FilterDataObject [] getLevelLists() {
        return this.LevelLists;
    }

    /**
     * Set 危险等级列表
     * @param LevelLists 危险等级列表
     */
    public void setLevelLists(FilterDataObject [] LevelLists) {
        this.LevelLists = LevelLists;
    }

    /**
     * Get 配置名列表 
     * @return CFGNameLists 配置名列表
     */
    public FilterDataObject [] getCFGNameLists() {
        return this.CFGNameLists;
    }

    /**
     * Set 配置名列表
     * @param CFGNameLists 配置名列表
     */
    public void setCFGNameLists(FilterDataObject [] CFGNameLists) {
        this.CFGNameLists = CFGNameLists;
    }

    /**
     * Get 检查类型列表 
     * @return CheckTypeLists 检查类型列表
     */
    public FilterDataObject [] getCheckTypeLists() {
        return this.CheckTypeLists;
    }

    /**
     * Set 检查类型列表
     * @param CheckTypeLists 检查类型列表
     */
    public void setCheckTypeLists(FilterDataObject [] CheckTypeLists) {
        this.CheckTypeLists = CheckTypeLists;
    }

    /**
     * Get 资产类型列表 
     * @return InstanceTypeLists 资产类型列表
     */
    public FilterDataObject [] getInstanceTypeLists() {
        return this.InstanceTypeLists;
    }

    /**
     * Set 资产类型列表
     * @param InstanceTypeLists 资产类型列表
     */
    public void setInstanceTypeLists(FilterDataObject [] InstanceTypeLists) {
        this.InstanceTypeLists = InstanceTypeLists;
    }

    /**
     * Get 来源列表 
     * @return FromLists 来源列表
     */
    public FilterDataObject [] getFromLists() {
        return this.FromLists;
    }

    /**
     * Set 来源列表
     * @param FromLists 来源列表
     */
    public void setFromLists(FilterDataObject [] FromLists) {
        this.FromLists = FromLists;
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

    public DescribeRiskCenterAssetViewCFGRiskListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRiskCenterAssetViewCFGRiskListResponse(DescribeRiskCenterAssetViewCFGRiskListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Data != null) {
            this.Data = new AssetViewCFGRisk[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new AssetViewCFGRisk(source.Data[i]);
            }
        }
        if (source.StatusLists != null) {
            this.StatusLists = new FilterDataObject[source.StatusLists.length];
            for (int i = 0; i < source.StatusLists.length; i++) {
                this.StatusLists[i] = new FilterDataObject(source.StatusLists[i]);
            }
        }
        if (source.LevelLists != null) {
            this.LevelLists = new FilterDataObject[source.LevelLists.length];
            for (int i = 0; i < source.LevelLists.length; i++) {
                this.LevelLists[i] = new FilterDataObject(source.LevelLists[i]);
            }
        }
        if (source.CFGNameLists != null) {
            this.CFGNameLists = new FilterDataObject[source.CFGNameLists.length];
            for (int i = 0; i < source.CFGNameLists.length; i++) {
                this.CFGNameLists[i] = new FilterDataObject(source.CFGNameLists[i]);
            }
        }
        if (source.CheckTypeLists != null) {
            this.CheckTypeLists = new FilterDataObject[source.CheckTypeLists.length];
            for (int i = 0; i < source.CheckTypeLists.length; i++) {
                this.CheckTypeLists[i] = new FilterDataObject(source.CheckTypeLists[i]);
            }
        }
        if (source.InstanceTypeLists != null) {
            this.InstanceTypeLists = new FilterDataObject[source.InstanceTypeLists.length];
            for (int i = 0; i < source.InstanceTypeLists.length; i++) {
                this.InstanceTypeLists[i] = new FilterDataObject(source.InstanceTypeLists[i]);
            }
        }
        if (source.FromLists != null) {
            this.FromLists = new FilterDataObject[source.FromLists.length];
            for (int i = 0; i < source.FromLists.length; i++) {
                this.FromLists[i] = new FilterDataObject(source.FromLists[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamArrayObj(map, prefix + "StatusLists.", this.StatusLists);
        this.setParamArrayObj(map, prefix + "LevelLists.", this.LevelLists);
        this.setParamArrayObj(map, prefix + "CFGNameLists.", this.CFGNameLists);
        this.setParamArrayObj(map, prefix + "CheckTypeLists.", this.CheckTypeLists);
        this.setParamArrayObj(map, prefix + "InstanceTypeLists.", this.InstanceTypeLists);
        this.setParamArrayObj(map, prefix + "FromLists.", this.FromLists);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

