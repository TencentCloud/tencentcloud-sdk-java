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

public class Convert3DFormatRequest extends AbstractModel {

    /**
    * 3D文件url地址，模型文件大小≤60m，支持fbx，obj，glb格式3D文件输入。
    */
    @SerializedName("File3D")
    @Expose
    private String File3D;

    /**
    * 返回的3D文件格式，参考值：STL, USDZ, FBX, MP4, GIF。
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
     * Get 3D文件url地址，模型文件大小≤60m，支持fbx，obj，glb格式3D文件输入。 
     * @return File3D 3D文件url地址，模型文件大小≤60m，支持fbx，obj，glb格式3D文件输入。
     */
    public String getFile3D() {
        return this.File3D;
    }

    /**
     * Set 3D文件url地址，模型文件大小≤60m，支持fbx，obj，glb格式3D文件输入。
     * @param File3D 3D文件url地址，模型文件大小≤60m，支持fbx，obj，glb格式3D文件输入。
     */
    public void setFile3D(String File3D) {
        this.File3D = File3D;
    }

    /**
     * Get 返回的3D文件格式，参考值：STL, USDZ, FBX, MP4, GIF。 
     * @return Format 返回的3D文件格式，参考值：STL, USDZ, FBX, MP4, GIF。
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 返回的3D文件格式，参考值：STL, USDZ, FBX, MP4, GIF。
     * @param Format 返回的3D文件格式，参考值：STL, USDZ, FBX, MP4, GIF。
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    public Convert3DFormatRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Convert3DFormatRequest(Convert3DFormatRequest source) {
        if (source.File3D != null) {
            this.File3D = new String(source.File3D);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "File3D", this.File3D);
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}

