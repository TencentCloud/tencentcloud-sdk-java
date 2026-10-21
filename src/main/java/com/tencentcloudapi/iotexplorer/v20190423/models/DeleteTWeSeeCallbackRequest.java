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

public class DeleteTWeSeeCallbackRequest extends AbstractModel {

    /**
    * <p>回调目标 ID</p>
    */
    @SerializedName("CallbackId")
    @Expose
    private String CallbackId;

    /**
     * Get <p>回调目标 ID</p> 
     * @return CallbackId <p>回调目标 ID</p>
     */
    public String getCallbackId() {
        return this.CallbackId;
    }

    /**
     * Set <p>回调目标 ID</p>
     * @param CallbackId <p>回调目标 ID</p>
     */
    public void setCallbackId(String CallbackId) {
        this.CallbackId = CallbackId;
    }

    public DeleteTWeSeeCallbackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTWeSeeCallbackRequest(DeleteTWeSeeCallbackRequest source) {
        if (source.CallbackId != null) {
            this.CallbackId = new String(source.CallbackId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallbackId", this.CallbackId);

    }
}

