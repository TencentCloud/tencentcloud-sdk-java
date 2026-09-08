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
    * <p>源3D模型文件。其中参数 Type 和 Url 必填，参数 PreviewImageUrl 无意义，可忽略。Type可选值：OBJ，GLB，FBX</p>
    */
    @SerializedName("File3D")
    @Expose
    private File3D File3D;

    /**
    * <p>多边形类型，表示模型的表面由几边形网格构成，默认为triangle,参考值:<br>triangle:三角形面。<br>quadrilateral：四边形面。</p>
    */
    @SerializedName("PolygonType")
    @Expose
    private String PolygonType;

    /**
    * <p>减面后面数档位类型，可选值：high，medium, low。</p>
    */
    @SerializedName("FaceLevel")
    @Expose
    private String FaceLevel;

    /**
     * Get <p>源3D模型文件。其中参数 Type 和 Url 必填，参数 PreviewImageUrl 无意义，可忽略。Type可选值：OBJ，GLB，FBX</p> 
     * @return File3D <p>源3D模型文件。其中参数 Type 和 Url 必填，参数 PreviewImageUrl 无意义，可忽略。Type可选值：OBJ，GLB，FBX</p>
     */
    public File3D getFile3D() {
        return this.File3D;
    }

    /**
     * Set <p>源3D模型文件。其中参数 Type 和 Url 必填，参数 PreviewImageUrl 无意义，可忽略。Type可选值：OBJ，GLB，FBX</p>
     * @param File3D <p>源3D模型文件。其中参数 Type 和 Url 必填，参数 PreviewImageUrl 无意义，可忽略。Type可选值：OBJ，GLB，FBX</p>
     */
    public void setFile3D(File3D File3D) {
        this.File3D = File3D;
    }

    /**
     * Get <p>多边形类型，表示模型的表面由几边形网格构成，默认为triangle,参考值:<br>triangle:三角形面。<br>quadrilateral：四边形面。</p> 
     * @return PolygonType <p>多边形类型，表示模型的表面由几边形网格构成，默认为triangle,参考值:<br>triangle:三角形面。<br>quadrilateral：四边形面。</p>
     */
    public String getPolygonType() {
        return this.PolygonType;
    }

    /**
     * Set <p>多边形类型，表示模型的表面由几边形网格构成，默认为triangle,参考值:<br>triangle:三角形面。<br>quadrilateral：四边形面。</p>
     * @param PolygonType <p>多边形类型，表示模型的表面由几边形网格构成，默认为triangle,参考值:<br>triangle:三角形面。<br>quadrilateral：四边形面。</p>
     */
    public void setPolygonType(String PolygonType) {
        this.PolygonType = PolygonType;
    }

    /**
     * Get <p>减面后面数档位类型，可选值：high，medium, low。</p> 
     * @return FaceLevel <p>减面后面数档位类型，可选值：high，medium, low。</p>
     */
    public String getFaceLevel() {
        return this.FaceLevel;
    }

    /**
     * Set <p>减面后面数档位类型，可选值：high，medium, low。</p>
     * @param FaceLevel <p>减面后面数档位类型，可选值：high，medium, low。</p>
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

