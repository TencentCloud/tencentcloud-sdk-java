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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageReviewUsageDataResponse extends AbstractModel{

    /**
    * 图片智能识别次数统计数据，展示查询时间范围内的图片智能识别次数的概览数据。
    */
    @SerializedName("ImageReviewUsageDataSet")
    @Expose
    private ImageReviewUsageDataItem [] ImageReviewUsageDataSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 图片智能识别次数统计数据，展示查询时间范围内的图片智能识别次数的概览数据。 
     * @return ImageReviewUsageDataSet 图片智能识别次数统计数据，展示查询时间范围内的图片智能识别次数的概览数据。
     */
    public ImageReviewUsageDataItem [] getImageReviewUsageDataSet() {
        return this.ImageReviewUsageDataSet;
    }

    /**
     * Set 图片智能识别次数统计数据，展示查询时间范围内的图片智能识别次数的概览数据。
     * @param ImageReviewUsageDataSet 图片智能识别次数统计数据，展示查询时间范围内的图片智能识别次数的概览数据。
     */
    public void setImageReviewUsageDataSet(ImageReviewUsageDataItem [] ImageReviewUsageDataSet) {
        this.ImageReviewUsageDataSet = ImageReviewUsageDataSet;
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

    public DescribeImageReviewUsageDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageReviewUsageDataResponse(DescribeImageReviewUsageDataResponse source) {
        if (source.ImageReviewUsageDataSet != null) {
            this.ImageReviewUsageDataSet = new ImageReviewUsageDataItem[source.ImageReviewUsageDataSet.length];
            for (int i = 0; i < source.ImageReviewUsageDataSet.length; i++) {
                this.ImageReviewUsageDataSet[i] = new ImageReviewUsageDataItem(source.ImageReviewUsageDataSet[i]);
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
        this.setParamArrayObj(map, prefix + "ImageReviewUsageDataSet.", this.ImageReviewUsageDataSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

