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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateServerModelRequest extends AbstractModel {

    /**
    * 设备型号详情
    */
    @SerializedName("ModelDetail")
    @Expose
    private ServerModel ModelDetail;

    /**
     * Get 设备型号详情 
     * @return ModelDetail 设备型号详情
     */
    public ServerModel getModelDetail() {
        return this.ModelDetail;
    }

    /**
     * Set 设备型号详情
     * @param ModelDetail 设备型号详情
     */
    public void setModelDetail(ServerModel ModelDetail) {
        this.ModelDetail = ModelDetail;
    }

    public CreateServerModelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateServerModelRequest(CreateServerModelRequest source) {
        if (source.ModelDetail != null) {
            this.ModelDetail = new ServerModel(source.ModelDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ModelDetail.", this.ModelDetail);

    }
}

