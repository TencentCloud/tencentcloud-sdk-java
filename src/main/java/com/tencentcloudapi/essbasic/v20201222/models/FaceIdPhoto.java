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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceIdPhoto extends AbstractModel{

    /**
    * 核身结果：
0 - 通过；
1 - 未通过
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 核身失败描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 照片数据 (base64编码, 一般为JPG或PNG)
    */
    @SerializedName("Photo")
    @Expose
    private String Photo;

    /**
    * 订单号 (orderNo)
    */
    @SerializedName("OrderNumber")
    @Expose
    private String OrderNumber;

    /**
     * Get 核身结果：
0 - 通过；
1 - 未通过 
     * @return Result 核身结果：
0 - 通过；
1 - 未通过
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 核身结果：
0 - 通过；
1 - 未通过
     * @param Result 核身结果：
0 - 通过；
1 - 未通过
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 核身失败描述 
     * @return Description 核身失败描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 核身失败描述
     * @param Description 核身失败描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 照片数据 (base64编码, 一般为JPG或PNG) 
     * @return Photo 照片数据 (base64编码, 一般为JPG或PNG)
     */
    public String getPhoto() {
        return this.Photo;
    }

    /**
     * Set 照片数据 (base64编码, 一般为JPG或PNG)
     * @param Photo 照片数据 (base64编码, 一般为JPG或PNG)
     */
    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    /**
     * Get 订单号 (orderNo) 
     * @return OrderNumber 订单号 (orderNo)
     */
    public String getOrderNumber() {
        return this.OrderNumber;
    }

    /**
     * Set 订单号 (orderNo)
     * @param OrderNumber 订单号 (orderNo)
     */
    public void setOrderNumber(String OrderNumber) {
        this.OrderNumber = OrderNumber;
    }

    public FaceIdPhoto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceIdPhoto(FaceIdPhoto source) {
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Photo != null) {
            this.Photo = new String(source.Photo);
        }
        if (source.OrderNumber != null) {
            this.OrderNumber = new String(source.OrderNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Photo", this.Photo);
        this.setParamSimple(map, prefix + "OrderNumber", this.OrderNumber);

    }
}

