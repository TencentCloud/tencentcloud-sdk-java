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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAssetImageVirusExportJobRequest extends AbstractModel {

    /**
    * 导出字段
    */
    @SerializedName("ExportField")
    @Expose
    private String [] ExportField;

    /**
    * 镜像id
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * 需要返回的数量，默认为10，最大值为10000
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤参数,"Filters":[{"Name":"Status","Values":["2"]}]
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序字段
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 升序降序,asc desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 导出字段 
     * @return ExportField 导出字段
     */
    public String [] getExportField() {
        return this.ExportField;
    }

    /**
     * Set 导出字段
     * @param ExportField 导出字段
     */
    public void setExportField(String [] ExportField) {
        this.ExportField = ExportField;
    }

    /**
     * Get 镜像id 
     * @return ImageID 镜像id
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set 镜像id
     * @param ImageID 镜像id
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get 需要返回的数量，默认为10，最大值为10000 
     * @return Filters 需要返回的数量，默认为10，最大值为10000
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 需要返回的数量，默认为10，最大值为10000
     * @param Filters 需要返回的数量，默认为10，最大值为10000
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Limit 偏移量，默认为0。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Limit 偏移量，默认为0。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤参数,"Filters":[{"Name":"Status","Values":["2"]}] 
     * @return Offset 过滤参数,"Filters":[{"Name":"Status","Values":["2"]}]
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 过滤参数,"Filters":[{"Name":"Status","Values":["2"]}]
     * @param Offset 过滤参数,"Filters":[{"Name":"Status","Values":["2"]}]
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序字段 
     * @return By 排序字段
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段
     * @param By 排序字段
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 升序降序,asc desc 
     * @return Order 升序降序,asc desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 升序降序,asc desc
     * @param Order 升序降序,asc desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public CreateAssetImageVirusExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAssetImageVirusExportJobRequest(CreateAssetImageVirusExportJobRequest source) {
        if (source.ExportField != null) {
            this.ExportField = new String[source.ExportField.length];
            for (int i = 0; i < source.ExportField.length; i++) {
                this.ExportField[i] = new String(source.ExportField[i]);
            }
        }
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ExportField.", this.ExportField);
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

