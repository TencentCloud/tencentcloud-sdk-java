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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatasetDetailUnstructuredRequest extends AbstractModel{

    /**
    * 数据集ID
    */
    @SerializedName("DatasetId")
    @Expose
    private String DatasetId;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回个数，默认20，目前最大支持2000条数据
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 标签过滤参数，对应标签值
    */
    @SerializedName("LabelList")
    @Expose
    private String [] LabelList;

    /**
    * 标注状态过滤参数:
STATUS_ANNOTATED，已标注
STATUS_NON_ANNOTATED，未标注
STATUS_ALL，全部
默认为STATUS_ALL
    */
    @SerializedName("AnnotationStatus")
    @Expose
    private String AnnotationStatus;

    /**
    * 数据集ID列表
    */
    @SerializedName("DatasetIds")
    @Expose
    private String [] DatasetIds;

    /**
     * Get 数据集ID 
     * @return DatasetId 数据集ID
     */
    public String getDatasetId() {
        return this.DatasetId;
    }

    /**
     * Set 数据集ID
     * @param DatasetId 数据集ID
     */
    public void setDatasetId(String DatasetId) {
        this.DatasetId = DatasetId;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回个数，默认20，目前最大支持2000条数据 
     * @return Limit 返回个数，默认20，目前最大支持2000条数据
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回个数，默认20，目前最大支持2000条数据
     * @param Limit 返回个数，默认20，目前最大支持2000条数据
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 标签过滤参数，对应标签值 
     * @return LabelList 标签过滤参数，对应标签值
     */
    public String [] getLabelList() {
        return this.LabelList;
    }

    /**
     * Set 标签过滤参数，对应标签值
     * @param LabelList 标签过滤参数，对应标签值
     */
    public void setLabelList(String [] LabelList) {
        this.LabelList = LabelList;
    }

    /**
     * Get 标注状态过滤参数:
STATUS_ANNOTATED，已标注
STATUS_NON_ANNOTATED，未标注
STATUS_ALL，全部
默认为STATUS_ALL 
     * @return AnnotationStatus 标注状态过滤参数:
STATUS_ANNOTATED，已标注
STATUS_NON_ANNOTATED，未标注
STATUS_ALL，全部
默认为STATUS_ALL
     */
    public String getAnnotationStatus() {
        return this.AnnotationStatus;
    }

    /**
     * Set 标注状态过滤参数:
STATUS_ANNOTATED，已标注
STATUS_NON_ANNOTATED，未标注
STATUS_ALL，全部
默认为STATUS_ALL
     * @param AnnotationStatus 标注状态过滤参数:
STATUS_ANNOTATED，已标注
STATUS_NON_ANNOTATED，未标注
STATUS_ALL，全部
默认为STATUS_ALL
     */
    public void setAnnotationStatus(String AnnotationStatus) {
        this.AnnotationStatus = AnnotationStatus;
    }

    /**
     * Get 数据集ID列表 
     * @return DatasetIds 数据集ID列表
     */
    public String [] getDatasetIds() {
        return this.DatasetIds;
    }

    /**
     * Set 数据集ID列表
     * @param DatasetIds 数据集ID列表
     */
    public void setDatasetIds(String [] DatasetIds) {
        this.DatasetIds = DatasetIds;
    }

    public DescribeDatasetDetailUnstructuredRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatasetDetailUnstructuredRequest(DescribeDatasetDetailUnstructuredRequest source) {
        if (source.DatasetId != null) {
            this.DatasetId = new String(source.DatasetId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.LabelList != null) {
            this.LabelList = new String[source.LabelList.length];
            for (int i = 0; i < source.LabelList.length; i++) {
                this.LabelList[i] = new String(source.LabelList[i]);
            }
        }
        if (source.AnnotationStatus != null) {
            this.AnnotationStatus = new String(source.AnnotationStatus);
        }
        if (source.DatasetIds != null) {
            this.DatasetIds = new String[source.DatasetIds.length];
            for (int i = 0; i < source.DatasetIds.length; i++) {
                this.DatasetIds[i] = new String(source.DatasetIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasetId", this.DatasetId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "LabelList.", this.LabelList);
        this.setParamSimple(map, prefix + "AnnotationStatus", this.AnnotationStatus);
        this.setParamArraySimple(map, prefix + "DatasetIds.", this.DatasetIds);

    }
}

