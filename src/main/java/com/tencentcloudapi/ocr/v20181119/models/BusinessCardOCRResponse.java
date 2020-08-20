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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BusinessCardOCRResponse extends AbstractModel{

    /**
    * 名片识别结果，具体内容请点击左侧链接。
    */
    @SerializedName("BusinessCardInfos")
    @Expose
    private BusinessCardInfo [] BusinessCardInfos;

    /**
    * 返回图像预处理后的图片，图像预处理未开启时返回内容为空。
    */
    @SerializedName("RetImageBase64")
    @Expose
    private String RetImageBase64;

    /**
    * 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。点击查看<a href="https://cloud.tencent.com/document/product/866/45139">如何纠正倾斜文本</a>
    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 名片识别结果，具体内容请点击左侧链接。 
     * @return BusinessCardInfos 名片识别结果，具体内容请点击左侧链接。
     */
    public BusinessCardInfo [] getBusinessCardInfos() {
        return this.BusinessCardInfos;
    }

    /**
     * Set 名片识别结果，具体内容请点击左侧链接。
     * @param BusinessCardInfos 名片识别结果，具体内容请点击左侧链接。
     */
    public void setBusinessCardInfos(BusinessCardInfo [] BusinessCardInfos) {
        this.BusinessCardInfos = BusinessCardInfos;
    }

    /**
     * Get 返回图像预处理后的图片，图像预处理未开启时返回内容为空。 
     * @return RetImageBase64 返回图像预处理后的图片，图像预处理未开启时返回内容为空。
     */
    public String getRetImageBase64() {
        return this.RetImageBase64;
    }

    /**
     * Set 返回图像预处理后的图片，图像预处理未开启时返回内容为空。
     * @param RetImageBase64 返回图像预处理后的图片，图像预处理未开启时返回内容为空。
     */
    public void setRetImageBase64(String RetImageBase64) {
        this.RetImageBase64 = RetImageBase64;
    }

    /**
     * Get 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。点击查看<a href="https://cloud.tencent.com/document/product/866/45139">如何纠正倾斜文本</a> 
     * @return Angle 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。点击查看<a href="https://cloud.tencent.com/document/product/866/45139">如何纠正倾斜文本</a>
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * Set 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。点击查看<a href="https://cloud.tencent.com/document/product/866/45139">如何纠正倾斜文本</a>
     * @param Angle 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。点击查看<a href="https://cloud.tencent.com/document/product/866/45139">如何纠正倾斜文本</a>
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
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
        this.setParamArrayObj(map, prefix + "BusinessCardInfos.", this.BusinessCardInfos);
        this.setParamSimple(map, prefix + "RetImageBase64", this.RetImageBase64);
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

