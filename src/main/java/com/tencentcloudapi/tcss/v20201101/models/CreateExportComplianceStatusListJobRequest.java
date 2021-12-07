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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateExportComplianceStatusListJobRequest extends AbstractModel{

    /**
    * 要导出信息的资产类型
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 按照检测项导出，还是按照资产导出。true: 按照资产导出；false: 按照检测项导出。
    */
    @SerializedName("ExportByAsset")
    @Expose
    private Boolean ExportByAsset;

    /**
    * true, 全部导出；false, 根据IdList来导出数据。
    */
    @SerializedName("ExportAll")
    @Expose
    private Boolean ExportAll;

    /**
    * 要导出的资产ID列表或检测项ID列表，由ExportByAsset的取值决定。
    */
    @SerializedName("IdList")
    @Expose
    private Long [] IdList;

    /**
     * Get 要导出信息的资产类型 
     * @return AssetType 要导出信息的资产类型
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 要导出信息的资产类型
     * @param AssetType 要导出信息的资产类型
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 按照检测项导出，还是按照资产导出。true: 按照资产导出；false: 按照检测项导出。 
     * @return ExportByAsset 按照检测项导出，还是按照资产导出。true: 按照资产导出；false: 按照检测项导出。
     */
    public Boolean getExportByAsset() {
        return this.ExportByAsset;
    }

    /**
     * Set 按照检测项导出，还是按照资产导出。true: 按照资产导出；false: 按照检测项导出。
     * @param ExportByAsset 按照检测项导出，还是按照资产导出。true: 按照资产导出；false: 按照检测项导出。
     */
    public void setExportByAsset(Boolean ExportByAsset) {
        this.ExportByAsset = ExportByAsset;
    }

    /**
     * Get true, 全部导出；false, 根据IdList来导出数据。 
     * @return ExportAll true, 全部导出；false, 根据IdList来导出数据。
     */
    public Boolean getExportAll() {
        return this.ExportAll;
    }

    /**
     * Set true, 全部导出；false, 根据IdList来导出数据。
     * @param ExportAll true, 全部导出；false, 根据IdList来导出数据。
     */
    public void setExportAll(Boolean ExportAll) {
        this.ExportAll = ExportAll;
    }

    /**
     * Get 要导出的资产ID列表或检测项ID列表，由ExportByAsset的取值决定。 
     * @return IdList 要导出的资产ID列表或检测项ID列表，由ExportByAsset的取值决定。
     */
    public Long [] getIdList() {
        return this.IdList;
    }

    /**
     * Set 要导出的资产ID列表或检测项ID列表，由ExportByAsset的取值决定。
     * @param IdList 要导出的资产ID列表或检测项ID列表，由ExportByAsset的取值决定。
     */
    public void setIdList(Long [] IdList) {
        this.IdList = IdList;
    }

    public CreateExportComplianceStatusListJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateExportComplianceStatusListJobRequest(CreateExportComplianceStatusListJobRequest source) {
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.ExportByAsset != null) {
            this.ExportByAsset = new Boolean(source.ExportByAsset);
        }
        if (source.ExportAll != null) {
            this.ExportAll = new Boolean(source.ExportAll);
        }
        if (source.IdList != null) {
            this.IdList = new Long[source.IdList.length];
            for (int i = 0; i < source.IdList.length; i++) {
                this.IdList[i] = new Long(source.IdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "ExportByAsset", this.ExportByAsset);
        this.setParamSimple(map, prefix + "ExportAll", this.ExportAll);
        this.setParamArraySimple(map, prefix + "IdList.", this.IdList);

    }
}

