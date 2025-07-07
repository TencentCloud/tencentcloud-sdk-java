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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateBucketAccelerateOptRequest extends AbstractModel {

    /**
    * true为开启全球加速，false为关闭
    */
    @SerializedName("Allowed")
    @Expose
    private Boolean Allowed;

    /**
     * Get true为开启全球加速，false为关闭 
     * @return Allowed true为开启全球加速，false为关闭
     */
    public Boolean getAllowed() {
        return this.Allowed;
    }

    /**
     * Set true为开启全球加速，false为关闭
     * @param Allowed true为开启全球加速，false为关闭
     */
    public void setAllowed(Boolean Allowed) {
        this.Allowed = Allowed;
    }

    public UpdateBucketAccelerateOptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateBucketAccelerateOptRequest(UpdateBucketAccelerateOptRequest source) {
        if (source.Allowed != null) {
            this.Allowed = new Boolean(source.Allowed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Allowed", this.Allowed);

    }
}

