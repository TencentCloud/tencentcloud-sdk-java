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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VolumeHostPath extends AbstractModel {

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 路径 
     * @return Path 路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 路径
     * @param Path 路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public VolumeHostPath() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VolumeHostPath(VolumeHostPath source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

