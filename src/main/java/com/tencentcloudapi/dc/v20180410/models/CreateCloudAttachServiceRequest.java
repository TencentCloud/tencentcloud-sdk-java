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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloudAttachServiceRequest extends AbstractModel {

    /**
    * 创建敏捷上云入参
    */
    @SerializedName("Data")
    @Expose
    private CreateCasInput Data;

    /**
     * Get 创建敏捷上云入参 
     * @return Data 创建敏捷上云入参
     */
    public CreateCasInput getData() {
        return this.Data;
    }

    /**
     * Set 创建敏捷上云入参
     * @param Data 创建敏捷上云入参
     */
    public void setData(CreateCasInput Data) {
        this.Data = Data;
    }

    public CreateCloudAttachServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudAttachServiceRequest(CreateCloudAttachServiceRequest source) {
        if (source.Data != null) {
            this.Data = new CreateCasInput(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Data.", this.Data);

    }
}

