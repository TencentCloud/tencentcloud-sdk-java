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

public class CreateOrderAndPayRequest extends AbstractModel{

    /**
    * 图片ID
    */
    @SerializedName("ImageId")
    @Expose
    private Long ImageId;

    /**
    * 授权人ID
    */
    @SerializedName("AuthUserId")
    @Expose
    private String AuthUserId;

    /**
    * 售卖组合id
    */
    @SerializedName("MarshalId")
    @Expose
    private Long MarshalId;

    /**
     * Get 图片ID 
     * @return ImageId 图片ID
     */
    public Long getImageId() {
        return this.ImageId;
    }

    /**
     * Set 图片ID
     * @param ImageId 图片ID
     */
    public void setImageId(Long ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 授权人ID 
     * @return AuthUserId 授权人ID
     */
    public String getAuthUserId() {
        return this.AuthUserId;
    }

    /**
     * Set 授权人ID
     * @param AuthUserId 授权人ID
     */
    public void setAuthUserId(String AuthUserId) {
        this.AuthUserId = AuthUserId;
    }

    /**
     * Get 售卖组合id 
     * @return MarshalId 售卖组合id
     */
    public Long getMarshalId() {
        return this.MarshalId;
    }

    /**
     * Set 售卖组合id
     * @param MarshalId 售卖组合id
     */
    public void setMarshalId(Long MarshalId) {
        this.MarshalId = MarshalId;
    }

    public CreateOrderAndPayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrderAndPayRequest(CreateOrderAndPayRequest source) {
        if (source.ImageId != null) {
            this.ImageId = new Long(source.ImageId);
        }
        if (source.AuthUserId != null) {
            this.AuthUserId = new String(source.AuthUserId);
        }
        if (source.MarshalId != null) {
            this.MarshalId = new Long(source.MarshalId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "AuthUserId", this.AuthUserId);
        this.setParamSimple(map, prefix + "MarshalId", this.MarshalId);

    }
}

