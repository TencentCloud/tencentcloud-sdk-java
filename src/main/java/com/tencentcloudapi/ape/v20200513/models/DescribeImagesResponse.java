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
package com.tencentcloudapi.ape.v20200513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImagesResponse extends AbstractModel{

    /**
    * 页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 总条数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 是否有下一页
    */
    @SerializedName("HaveMore")
    @Expose
    private Boolean HaveMore;

    /**
    * 图片信息数组
    */
    @SerializedName("Items")
    @Expose
    private ImageItem [] Items;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 页偏移量 
     * @return Offset 页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页偏移量
     * @param Offset 页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 页大小 
     * @return Limit 页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 页大小
     * @param Limit 页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 总条数 
     * @return Total 总条数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总条数
     * @param Total 总条数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 是否有下一页 
     * @return HaveMore 是否有下一页
     */
    public Boolean getHaveMore() {
        return this.HaveMore;
    }

    /**
     * Set 是否有下一页
     * @param HaveMore 是否有下一页
     */
    public void setHaveMore(Boolean HaveMore) {
        this.HaveMore = HaveMore;
    }

    /**
     * Get 图片信息数组 
     * @return Items 图片信息数组
     */
    public ImageItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 图片信息数组
     * @param Items 图片信息数组
     */
    public void setItems(ImageItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeImagesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImagesResponse(DescribeImagesResponse source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.HaveMore != null) {
            this.HaveMore = new Boolean(source.HaveMore);
        }
        if (source.Items != null) {
            this.Items = new ImageItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new ImageItem(source.Items[i]);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "HaveMore", this.HaveMore);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

