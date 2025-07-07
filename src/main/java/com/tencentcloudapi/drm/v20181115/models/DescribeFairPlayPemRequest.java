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
package com.tencentcloudapi.drm.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFairPlayPemRequest extends AbstractModel {

    /**
    * 委托者Id,适用于托管自身证书的客户。普通客户无需填该字段。
    */
    @SerializedName("BailorId")
    @Expose
    private Long BailorId;

    /**
    * 需要查询的pem id。
当该值未填入时，将返回所有的私钥信息。
    */
    @SerializedName("FairPlayPemId")
    @Expose
    private Long FairPlayPemId;

    /**
     * Get 委托者Id,适用于托管自身证书的客户。普通客户无需填该字段。 
     * @return BailorId 委托者Id,适用于托管自身证书的客户。普通客户无需填该字段。
     */
    public Long getBailorId() {
        return this.BailorId;
    }

    /**
     * Set 委托者Id,适用于托管自身证书的客户。普通客户无需填该字段。
     * @param BailorId 委托者Id,适用于托管自身证书的客户。普通客户无需填该字段。
     */
    public void setBailorId(Long BailorId) {
        this.BailorId = BailorId;
    }

    /**
     * Get 需要查询的pem id。
当该值未填入时，将返回所有的私钥信息。 
     * @return FairPlayPemId 需要查询的pem id。
当该值未填入时，将返回所有的私钥信息。
     */
    public Long getFairPlayPemId() {
        return this.FairPlayPemId;
    }

    /**
     * Set 需要查询的pem id。
当该值未填入时，将返回所有的私钥信息。
     * @param FairPlayPemId 需要查询的pem id。
当该值未填入时，将返回所有的私钥信息。
     */
    public void setFairPlayPemId(Long FairPlayPemId) {
        this.FairPlayPemId = FairPlayPemId;
    }

    public DescribeFairPlayPemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFairPlayPemRequest(DescribeFairPlayPemRequest source) {
        if (source.BailorId != null) {
            this.BailorId = new Long(source.BailorId);
        }
        if (source.FairPlayPemId != null) {
            this.FairPlayPemId = new Long(source.FairPlayPemId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BailorId", this.BailorId);
        this.setParamSimple(map, prefix + "FairPlayPemId", this.FairPlayPemId);

    }
}

