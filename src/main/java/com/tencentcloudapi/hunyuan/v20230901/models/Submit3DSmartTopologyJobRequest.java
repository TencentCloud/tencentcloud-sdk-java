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

public class Submit3DSmartTopologyJobRequest extends AbstractModel {

    /**
    * 源3D文件模型链接，参考值：
Type：glb，obj格式文件必选其一。
Url：文件大小不超过200MB。
3D模型要求：复杂模型和拓扑过的模型暂无法支持减面操作，建议输入未拓扑过的高模，比如混元3D生成的模型，适用度比较高的类别：硬表面、游戏角色、道具、日常生活用品等。
    */
    @SerializedName("File3D")
    @Expose
    private InputFile3D File3D;

    /**
    * 多边形类型，表示模型的表面由几边形网格构成，默认为triangle,参考值:
triangle:三角形面。
quadrilateral：四边形面。
    */
    @SerializedName("PolygonType")
    @Expose
    private String PolygonType;

    /**
    * 减面后面数档位类型，可选值：high，medium, low。
    */
    @SerializedName("FaceLevel")
    @Expose
    private String FaceLevel;

    /**
     * Get 源3D文件模型链接，参考值：
Type：glb，obj格式文件必选其一。
Url：文件大小不超过200MB。
3D模型要求：复杂模型和拓扑过的模型暂无法支持减面操作，建议输入未拓扑过的高模，比如混元3D生成的模型，适用度比较高的类别：硬表面、游戏角色、道具、日常生活用品等。 
     * @return File3D 源3D文件模型链接，参考值：
Type：glb，obj格式文件必选其一。
Url：文件大小不超过200MB。
3D模型要求：复杂模型和拓扑过的模型暂无法支持减面操作，建议输入未拓扑过的高模，比如混元3D生成的模型，适用度比较高的类别：硬表面、游戏角色、道具、日常生活用品等。
     */
    public InputFile3D getFile3D() {
        return this.File3D;
    }

    /**
     * Set 源3D文件模型链接，参考值：
Type：glb，obj格式文件必选其一。
Url：文件大小不超过200MB。
3D模型要求：复杂模型和拓扑过的模型暂无法支持减面操作，建议输入未拓扑过的高模，比如混元3D生成的模型，适用度比较高的类别：硬表面、游戏角色、道具、日常生活用品等。
     * @param File3D 源3D文件模型链接，参考值：
Type：glb，obj格式文件必选其一。
Url：文件大小不超过200MB。
3D模型要求：复杂模型和拓扑过的模型暂无法支持减面操作，建议输入未拓扑过的高模，比如混元3D生成的模型，适用度比较高的类别：硬表面、游戏角色、道具、日常生活用品等。
     */
    public void setFile3D(InputFile3D File3D) {
        this.File3D = File3D;
    }

    /**
     * Get 多边形类型，表示模型的表面由几边形网格构成，默认为triangle,参考值:
triangle:三角形面。
quadrilateral：四边形面。 
     * @return PolygonType 多边形类型，表示模型的表面由几边形网格构成，默认为triangle,参考值:
triangle:三角形面。
quadrilateral：四边形面。
     */
    public String getPolygonType() {
        return this.PolygonType;
    }

    /**
     * Set 多边形类型，表示模型的表面由几边形网格构成，默认为triangle,参考值:
triangle:三角形面。
quadrilateral：四边形面。
     * @param PolygonType 多边形类型，表示模型的表面由几边形网格构成，默认为triangle,参考值:
triangle:三角形面。
quadrilateral：四边形面。
     */
    public void setPolygonType(String PolygonType) {
        this.PolygonType = PolygonType;
    }

    /**
     * Get 减面后面数档位类型，可选值：high，medium, low。 
     * @return FaceLevel 减面后面数档位类型，可选值：high，medium, low。
     */
    public String getFaceLevel() {
        return this.FaceLevel;
    }

    /**
     * Set 减面后面数档位类型，可选值：high，medium, low。
     * @param FaceLevel 减面后面数档位类型，可选值：high，medium, low。
     */
    public void setFaceLevel(String FaceLevel) {
        this.FaceLevel = FaceLevel;
    }

    public Submit3DSmartTopologyJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Submit3DSmartTopologyJobRequest(Submit3DSmartTopologyJobRequest source) {
        if (source.File3D != null) {
            this.File3D = new InputFile3D(source.File3D);
        }
        if (source.PolygonType != null) {
            this.PolygonType = new String(source.PolygonType);
        }
        if (source.FaceLevel != null) {
            this.FaceLevel = new String(source.FaceLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "File3D.", this.File3D);
        this.setParamSimple(map, prefix + "PolygonType", this.PolygonType);
        this.setParamSimple(map, prefix + "FaceLevel", this.FaceLevel);

    }
}

