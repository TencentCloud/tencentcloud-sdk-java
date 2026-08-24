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

public class CreateTWeSeePersonRequest extends AbstractModel {

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
    * 人员名称，最多 64 个字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 人脸 ID 列表，最多 5 个
    */
    @SerializedName("FaceIds")
    @Expose
    private String [] FaceIds;

    /**
    * 通道 ID，默认值为 0
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

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
     * Get 人员名称，最多 64 个字符 
     * @return Name 人员名称，最多 64 个字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 人员名称，最多 64 个字符
     * @param Name 人员名称，最多 64 个字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 人脸 ID 列表，最多 5 个 
     * @return FaceIds 人脸 ID 列表，最多 5 个
     */
    public String [] getFaceIds() {
        return this.FaceIds;
    }

    /**
     * Set 人脸 ID 列表，最多 5 个
     * @param FaceIds 人脸 ID 列表，最多 5 个
     */
    public void setFaceIds(String [] FaceIds) {
        this.FaceIds = FaceIds;
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

    public CreateTWeSeePersonRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTWeSeePersonRequest(CreateTWeSeePersonRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.FaceIds != null) {
            this.FaceIds = new String[source.FaceIds.length];
            for (int i = 0; i < source.FaceIds.length; i++) {
                this.FaceIds[i] = new String(source.FaceIds[i]);
            }
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "FaceIds.", this.FaceIds);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);

    }
}

