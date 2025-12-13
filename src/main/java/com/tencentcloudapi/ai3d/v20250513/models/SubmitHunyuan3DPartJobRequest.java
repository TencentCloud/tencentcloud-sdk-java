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
package com.tencentcloudapi.ai3d.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitHunyuan3DPartJobRequest extends AbstractModel {

    /**
    * 需进行组件生成的3D模型文件，仅支持FBX格式。
    */
    @SerializedName("File")
    @Expose
    private InputFile3D File;

    /**
     * Get 需进行组件生成的3D模型文件，仅支持FBX格式。 
     * @return File 需进行组件生成的3D模型文件，仅支持FBX格式。
     */
    public InputFile3D getFile() {
        return this.File;
    }

    /**
     * Set 需进行组件生成的3D模型文件，仅支持FBX格式。
     * @param File 需进行组件生成的3D模型文件，仅支持FBX格式。
     */
    public void setFile(InputFile3D File) {
        this.File = File;
    }

    public SubmitHunyuan3DPartJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitHunyuan3DPartJobRequest(SubmitHunyuan3DPartJobRequest source) {
        if (source.File != null) {
            this.File = new InputFile3D(source.File);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "File.", this.File);

    }
}

