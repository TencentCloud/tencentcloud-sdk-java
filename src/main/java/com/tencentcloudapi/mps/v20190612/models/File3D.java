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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class File3D extends AbstractModel {

    /**
    * <p>文件类型，OBJ / GLB / FBX / STL / USDZ</p><p>枚举值：</p><ul><li>OBJ： 3D 通用交换格式</li><li>GLB： glTF 2.0 二进制（&quot;3D 界的 JPEG&quot;）</li><li>FBX： Autodesk 影视/游戏工业标准</li><li>STL： 3D 打印/CAD 三角面片</li><li>USDZ： Pixar/Apple 打包场景描述</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>文件下载 URL（临时签名，TTL 一般 24h）</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>预览图 URL（若有）</p>
    */
    @SerializedName("PreviewImageUrl")
    @Expose
    private String PreviewImageUrl;

    /**
     * Get <p>文件类型，OBJ / GLB / FBX / STL / USDZ</p><p>枚举值：</p><ul><li>OBJ： 3D 通用交换格式</li><li>GLB： glTF 2.0 二进制（&quot;3D 界的 JPEG&quot;）</li><li>FBX： Autodesk 影视/游戏工业标准</li><li>STL： 3D 打印/CAD 三角面片</li><li>USDZ： Pixar/Apple 打包场景描述</li></ul> 
     * @return Type <p>文件类型，OBJ / GLB / FBX / STL / USDZ</p><p>枚举值：</p><ul><li>OBJ： 3D 通用交换格式</li><li>GLB： glTF 2.0 二进制（&quot;3D 界的 JPEG&quot;）</li><li>FBX： Autodesk 影视/游戏工业标准</li><li>STL： 3D 打印/CAD 三角面片</li><li>USDZ： Pixar/Apple 打包场景描述</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>文件类型，OBJ / GLB / FBX / STL / USDZ</p><p>枚举值：</p><ul><li>OBJ： 3D 通用交换格式</li><li>GLB： glTF 2.0 二进制（&quot;3D 界的 JPEG&quot;）</li><li>FBX： Autodesk 影视/游戏工业标准</li><li>STL： 3D 打印/CAD 三角面片</li><li>USDZ： Pixar/Apple 打包场景描述</li></ul>
     * @param Type <p>文件类型，OBJ / GLB / FBX / STL / USDZ</p><p>枚举值：</p><ul><li>OBJ： 3D 通用交换格式</li><li>GLB： glTF 2.0 二进制（&quot;3D 界的 JPEG&quot;）</li><li>FBX： Autodesk 影视/游戏工业标准</li><li>STL： 3D 打印/CAD 三角面片</li><li>USDZ： Pixar/Apple 打包场景描述</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>文件下载 URL（临时签名，TTL 一般 24h）</p> 
     * @return Url <p>文件下载 URL（临时签名，TTL 一般 24h）</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>文件下载 URL（临时签名，TTL 一般 24h）</p>
     * @param Url <p>文件下载 URL（临时签名，TTL 一般 24h）</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>预览图 URL（若有）</p> 
     * @return PreviewImageUrl <p>预览图 URL（若有）</p>
     */
    public String getPreviewImageUrl() {
        return this.PreviewImageUrl;
    }

    /**
     * Set <p>预览图 URL（若有）</p>
     * @param PreviewImageUrl <p>预览图 URL（若有）</p>
     */
    public void setPreviewImageUrl(String PreviewImageUrl) {
        this.PreviewImageUrl = PreviewImageUrl;
    }

    public File3D() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public File3D(File3D source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.PreviewImageUrl != null) {
            this.PreviewImageUrl = new String(source.PreviewImageUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "PreviewImageUrl", this.PreviewImageUrl);

    }
}

