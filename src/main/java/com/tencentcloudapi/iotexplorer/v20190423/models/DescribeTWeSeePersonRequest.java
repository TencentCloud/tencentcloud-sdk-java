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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTWeSeePersonRequest extends AbstractModel {

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 人员 ID
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 产品 ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 通道 ID，默认值为 0
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * 返回的代表人脸数量，取值范围为 1 到 5，默认值为 1
    */
    @SerializedName("FaceLimit")
    @Expose
    private Long FaceLimit;

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 人员 ID 
     * @return PersonId 人员 ID
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员 ID
     * @param PersonId 人员 ID
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 产品 ID 
     * @return ProductId 产品 ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品 ID
     * @param ProductId 产品 ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 通道 ID，默认值为 0 
     * @return ChannelId 通道 ID，默认值为 0
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道 ID，默认值为 0
     * @param ChannelId 通道 ID，默认值为 0
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 返回的代表人脸数量，取值范围为 1 到 5，默认值为 1 
     * @return FaceLimit 返回的代表人脸数量，取值范围为 1 到 5，默认值为 1
     */
    public Long getFaceLimit() {
        return this.FaceLimit;
    }

    /**
     * Set 返回的代表人脸数量，取值范围为 1 到 5，默认值为 1
     * @param FaceLimit 返回的代表人脸数量，取值范围为 1 到 5，默认值为 1
     */
    public void setFaceLimit(Long FaceLimit) {
        this.FaceLimit = FaceLimit;
    }

    public DescribeTWeSeePersonRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTWeSeePersonRequest(DescribeTWeSeePersonRequest source) {
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.FaceLimit != null) {
            this.FaceLimit = new Long(source.FaceLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "FaceLimit", this.FaceLimit);

    }
}

