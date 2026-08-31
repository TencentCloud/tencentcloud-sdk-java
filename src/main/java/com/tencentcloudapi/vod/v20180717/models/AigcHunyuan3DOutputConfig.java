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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcHunyuan3DOutputConfig extends AbstractModel {

    /**
    * <p>存储模式。取值有： <li>Temporary：临时存储；</li>默认值：Temporary</p>
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
     * Get <p>存储模式。取值有： <li>Temporary：临时存储；</li>默认值：Temporary</p> 
     * @return StorageMode <p>存储模式。取值有： <li>Temporary：临时存储；</li>默认值：Temporary</p>
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set <p>存储模式。取值有： <li>Temporary：临时存储；</li>默认值：Temporary</p>
     * @param StorageMode <p>存储模式。取值有： <li>Temporary：临时存储；</li>默认值：Temporary</p>
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    public AigcHunyuan3DOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcHunyuan3DOutputConfig(AigcHunyuan3DOutputConfig source) {
        if (source.StorageMode != null) {
            this.StorageMode = new String(source.StorageMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageMode", this.StorageMode);

    }
}

