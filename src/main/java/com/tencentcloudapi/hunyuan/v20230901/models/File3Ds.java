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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class File3Ds extends AbstractModel {

    /**
    * 3D文件列表
    */
    @SerializedName("File3D")
    @Expose
    private File3D [] File3D;

    /**
     * Get 3D文件列表 
     * @return File3D 3D文件列表
     */
    public File3D [] getFile3D() {
        return this.File3D;
    }

    /**
     * Set 3D文件列表
     * @param File3D 3D文件列表
     */
    public void setFile3D(File3D [] File3D) {
        this.File3D = File3D;
    }

    public File3Ds() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public File3Ds(File3Ds source) {
        if (source.File3D != null) {
            this.File3D = new File3D[source.File3D.length];
            for (int i = 0; i < source.File3D.length; i++) {
                this.File3D[i] = new File3D(source.File3D[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "File3D.", this.File3D);

    }
}

