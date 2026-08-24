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

public class ListTWeSeePersonsRequest extends AbstractModel {

    /**
    * 产品 ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 分页拉取数量，取值范围为 1 到 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页拉取偏移，默认值为 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 通道 ID，默认值为 0
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * 每个人员返回的代表人脸数量，取值范围为 1 到 5，默认值为 1
    */
    @SerializedName("FaceLimit")
    @Expose
    private Long FaceLimit;

    /**
    * 人员记忆状态。true：仅查询持久记忆人员；false：仅查询非持久记忆人员；不传时查询全部人员
    */
    @SerializedName("IsRemembered")
    @Expose
    private Boolean IsRemembered;

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
     * Get 分页拉取数量，取值范围为 1 到 100 
     * @return Limit 分页拉取数量，取值范围为 1 到 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页拉取数量，取值范围为 1 到 100
     * @param Limit 分页拉取数量，取值范围为 1 到 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页拉取偏移，默认值为 0 
     * @return Offset 分页拉取偏移，默认值为 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页拉取偏移，默认值为 0
     * @param Offset 分页拉取偏移，默认值为 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
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
     * Get 每个人员返回的代表人脸数量，取值范围为 1 到 5，默认值为 1 
     * @return FaceLimit 每个人员返回的代表人脸数量，取值范围为 1 到 5，默认值为 1
     */
    public Long getFaceLimit() {
        return this.FaceLimit;
    }

    /**
     * Set 每个人员返回的代表人脸数量，取值范围为 1 到 5，默认值为 1
     * @param FaceLimit 每个人员返回的代表人脸数量，取值范围为 1 到 5，默认值为 1
     */
    public void setFaceLimit(Long FaceLimit) {
        this.FaceLimit = FaceLimit;
    }

    /**
     * Get 人员记忆状态。true：仅查询持久记忆人员；false：仅查询非持久记忆人员；不传时查询全部人员 
     * @return IsRemembered 人员记忆状态。true：仅查询持久记忆人员；false：仅查询非持久记忆人员；不传时查询全部人员
     */
    public Boolean getIsRemembered() {
        return this.IsRemembered;
    }

    /**
     * Set 人员记忆状态。true：仅查询持久记忆人员；false：仅查询非持久记忆人员；不传时查询全部人员
     * @param IsRemembered 人员记忆状态。true：仅查询持久记忆人员；false：仅查询非持久记忆人员；不传时查询全部人员
     */
    public void setIsRemembered(Boolean IsRemembered) {
        this.IsRemembered = IsRemembered;
    }

    public ListTWeSeePersonsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTWeSeePersonsRequest(ListTWeSeePersonsRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.FaceLimit != null) {
            this.FaceLimit = new Long(source.FaceLimit);
        }
        if (source.IsRemembered != null) {
            this.IsRemembered = new Boolean(source.IsRemembered);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "FaceLimit", this.FaceLimit);
        this.setParamSimple(map, prefix + "IsRemembered", this.IsRemembered);

    }
}

