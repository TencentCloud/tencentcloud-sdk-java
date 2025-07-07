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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBPOfflineTicketRequest extends AbstractModel {

    /**
    * 仿冒网址ID
    */
    @SerializedName("FakeURLId")
    @Expose
    private Long FakeURLId;

    /**
     * Get 仿冒网址ID 
     * @return FakeURLId 仿冒网址ID
     */
    public Long getFakeURLId() {
        return this.FakeURLId;
    }

    /**
     * Set 仿冒网址ID
     * @param FakeURLId 仿冒网址ID
     */
    public void setFakeURLId(Long FakeURLId) {
        this.FakeURLId = FakeURLId;
    }

    public CreateBPOfflineTicketRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBPOfflineTicketRequest(CreateBPOfflineTicketRequest source) {
        if (source.FakeURLId != null) {
            this.FakeURLId = new Long(source.FakeURLId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FakeURLId", this.FakeURLId);

    }
}

