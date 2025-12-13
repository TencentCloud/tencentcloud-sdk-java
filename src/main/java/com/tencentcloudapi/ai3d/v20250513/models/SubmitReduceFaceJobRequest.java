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

public class SubmitReduceFaceJobRequest extends AbstractModel {

    /**
    * 源3D模型文件。其中参数 Type 和 Url 必填，参数 PreviewImageUrl 无意义，可忽略。
Type可选值：OBJ，GLB

    */
    @SerializedName("File3D")
    @Expose
    private File3D File3D;

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
     * Get 源3D模型文件。其中参数 Type 和 Url 必填，参数 PreviewImageUrl 无意义，可忽略。
Type可选值：OBJ，GLB
 
     * @return File3D 源3D模型文件。其中参数 Type 和 Url 必填，参数 PreviewImageUrl 无意义，可忽略。
Type可选值：OBJ，GLB

     */
    public File3D getFile3D() {
        return this.File3D;
    }

    /**
     * Set 源3D模型文件。其中参数 Type 和 Url 必填，参数 PreviewImageUrl 无意义，可忽略。
Type可选值：OBJ，GLB

     * @param File3D 源3D模型文件。其中参数 Type 和 Url 必填，参数 PreviewImageUrl 无意义，可忽略。
Type可选值：OBJ，GLB

     */
    public void setFile3D(File3D File3D) {
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

    public SubmitReduceFaceJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitReduceFaceJobRequest(SubmitReduceFaceJobRequest source) {
        if (source.File3D != null) {
            this.File3D = new File3D(source.File3D);
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

