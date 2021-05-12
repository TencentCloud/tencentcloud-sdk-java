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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceCreateBlueprintResponse extends AbstractModel{

    /**
    * 自定义镜像的价格参数。
    */
    @SerializedName("BlueprintPrice")
    @Expose
    private BlueprintPrice BlueprintPrice;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 自定义镜像的价格参数。 
     * @return BlueprintPrice 自定义镜像的价格参数。
     */
    public BlueprintPrice getBlueprintPrice() {
        return this.BlueprintPrice;
    }

    /**
     * Set 自定义镜像的价格参数。
     * @param BlueprintPrice 自定义镜像的价格参数。
     */
    public void setBlueprintPrice(BlueprintPrice BlueprintPrice) {
        this.BlueprintPrice = BlueprintPrice;
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

    public InquirePriceCreateBlueprintResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceCreateBlueprintResponse(InquirePriceCreateBlueprintResponse source) {
        if (source.BlueprintPrice != null) {
            this.BlueprintPrice = new BlueprintPrice(source.BlueprintPrice);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BlueprintPrice.", this.BlueprintPrice);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

