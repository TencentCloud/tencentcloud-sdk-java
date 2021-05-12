/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.facefusion.v20181201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaterialFaceList extends AbstractModel{

    /**
    * 人脸序号
    */
    @SerializedName("FaceId")
    @Expose
    private String FaceId;

    /**
    * 人脸框信息
    */
    @SerializedName("FaceInfo")
    @Expose
    private FaceInfo FaceInfo;

    /**
     * Get 人脸序号 
     * @return FaceId 人脸序号
     */
    public String getFaceId() {
        return this.FaceId;
    }

    /**
     * Set 人脸序号
     * @param FaceId 人脸序号
     */
    public void setFaceId(String FaceId) {
        this.FaceId = FaceId;
    }

    /**
     * Get 人脸框信息 
     * @return FaceInfo 人脸框信息
     */
    public FaceInfo getFaceInfo() {
        return this.FaceInfo;
    }

    /**
     * Set 人脸框信息
     * @param FaceInfo 人脸框信息
     */
    public void setFaceInfo(FaceInfo FaceInfo) {
        this.FaceInfo = FaceInfo;
    }

    public MaterialFaceList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaterialFaceList(MaterialFaceList source) {
        if (source.FaceId != null) {
            this.FaceId = new String(source.FaceId);
        }
        if (source.FaceInfo != null) {
            this.FaceInfo = new FaceInfo(source.FaceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FaceId", this.FaceId);
        this.setParamObj(map, prefix + "FaceInfo.", this.FaceInfo);

    }
}

