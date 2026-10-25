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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteVolumeRsp extends AbstractModel {

    /**
    * 是否删除成功
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
     * Get 是否删除成功 
     * @return Result 是否删除成功
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set 是否删除成功
     * @param Result 是否删除成功
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    public DeleteVolumeRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteVolumeRsp(DeleteVolumeRsp source) {
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

