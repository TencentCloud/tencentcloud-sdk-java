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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectProductBetaResponse extends AbstractModel{

    /**
    * 检测到的图片中的商品位置和品类预测。 
当图片中存在多个商品时，输出多组坐标，按照__显著性__排序（综合考虑面积、是否在中心、检测算法置信度）。 
最多可以输出__3组__检测结果。
    */
    @SerializedName("RegionDetected")
    @Expose
    private RegionDetected [] RegionDetected;

    /**
    * 图像识别出的商品的详细信息。 
当图像中检测到多个物品时，会对显著性最高的进行识别。
    */
    @SerializedName("ProductInfo")
    @Expose
    private ProductInfo ProductInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 检测到的图片中的商品位置和品类预测。 
当图片中存在多个商品时，输出多组坐标，按照__显著性__排序（综合考虑面积、是否在中心、检测算法置信度）。 
最多可以输出__3组__检测结果。 
     * @return RegionDetected 检测到的图片中的商品位置和品类预测。 
当图片中存在多个商品时，输出多组坐标，按照__显著性__排序（综合考虑面积、是否在中心、检测算法置信度）。 
最多可以输出__3组__检测结果。
     */
    public RegionDetected [] getRegionDetected() {
        return this.RegionDetected;
    }

    /**
     * Set 检测到的图片中的商品位置和品类预测。 
当图片中存在多个商品时，输出多组坐标，按照__显著性__排序（综合考虑面积、是否在中心、检测算法置信度）。 
最多可以输出__3组__检测结果。
     * @param RegionDetected 检测到的图片中的商品位置和品类预测。 
当图片中存在多个商品时，输出多组坐标，按照__显著性__排序（综合考虑面积、是否在中心、检测算法置信度）。 
最多可以输出__3组__检测结果。
     */
    public void setRegionDetected(RegionDetected [] RegionDetected) {
        this.RegionDetected = RegionDetected;
    }

    /**
     * Get 图像识别出的商品的详细信息。 
当图像中检测到多个物品时，会对显著性最高的进行识别。 
     * @return ProductInfo 图像识别出的商品的详细信息。 
当图像中检测到多个物品时，会对显著性最高的进行识别。
     */
    public ProductInfo getProductInfo() {
        return this.ProductInfo;
    }

    /**
     * Set 图像识别出的商品的详细信息。 
当图像中检测到多个物品时，会对显著性最高的进行识别。
     * @param ProductInfo 图像识别出的商品的详细信息。 
当图像中检测到多个物品时，会对显著性最高的进行识别。
     */
    public void setProductInfo(ProductInfo ProductInfo) {
        this.ProductInfo = ProductInfo;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RegionDetected.", this.RegionDetected);
        this.setParamObj(map, prefix + "ProductInfo.", this.ProductInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

