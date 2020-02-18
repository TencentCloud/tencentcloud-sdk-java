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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePersonInfoByFacePictureRequest extends AbstractModel{

    /**
    * 优mall集团id，通过"指定身份标识获取客户门店列表"接口获取
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 优mall店铺id，通过"指定身份标识获取客户门店列表"接口获取
    */
    @SerializedName("ShopId")
    @Expose
    private Long ShopId;

    /**
    * 人脸图片BASE编码
    */
    @SerializedName("Picture")
    @Expose
    private String Picture;

    /**
     * Get 优mall集团id，通过"指定身份标识获取客户门店列表"接口获取 
     * @return CompanyId 优mall集团id，通过"指定身份标识获取客户门店列表"接口获取
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 优mall集团id，通过"指定身份标识获取客户门店列表"接口获取
     * @param CompanyId 优mall集团id，通过"指定身份标识获取客户门店列表"接口获取
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 优mall店铺id，通过"指定身份标识获取客户门店列表"接口获取 
     * @return ShopId 优mall店铺id，通过"指定身份标识获取客户门店列表"接口获取
     */
    public Long getShopId() {
        return this.ShopId;
    }

    /**
     * Set 优mall店铺id，通过"指定身份标识获取客户门店列表"接口获取
     * @param ShopId 优mall店铺id，通过"指定身份标识获取客户门店列表"接口获取
     */
    public void setShopId(Long ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * Get 人脸图片BASE编码 
     * @return Picture 人脸图片BASE编码
     */
    public String getPicture() {
        return this.Picture;
    }

    /**
     * Set 人脸图片BASE编码
     * @param Picture 人脸图片BASE编码
     */
    public void setPicture(String Picture) {
        this.Picture = Picture;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "Picture", this.Picture);

    }
}

