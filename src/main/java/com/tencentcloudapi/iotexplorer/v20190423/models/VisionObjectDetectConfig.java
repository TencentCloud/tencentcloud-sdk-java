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

public class VisionObjectDetectConfig extends AbstractModel {

    /**
    * 检测类别，可选值：
- `adult`：成年人
- `child`：儿童
    */
    @SerializedName("DetectTypes")
    @Expose
    private String [] DetectTypes;

    /**
     * Get 检测类别，可选值：
- `adult`：成年人
- `child`：儿童 
     * @return DetectTypes 检测类别，可选值：
- `adult`：成年人
- `child`：儿童
     */
    public String [] getDetectTypes() {
        return this.DetectTypes;
    }

    /**
     * Set 检测类别，可选值：
- `adult`：成年人
- `child`：儿童
     * @param DetectTypes 检测类别，可选值：
- `adult`：成年人
- `child`：儿童
     */
    public void setDetectTypes(String [] DetectTypes) {
        this.DetectTypes = DetectTypes;
    }

    public VisionObjectDetectConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VisionObjectDetectConfig(VisionObjectDetectConfig source) {
        if (source.DetectTypes != null) {
            this.DetectTypes = new String[source.DetectTypes.length];
            for (int i = 0; i < source.DetectTypes.length; i++) {
                this.DetectTypes[i] = new String(source.DetectTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DetectTypes.", this.DetectTypes);

    }
}

