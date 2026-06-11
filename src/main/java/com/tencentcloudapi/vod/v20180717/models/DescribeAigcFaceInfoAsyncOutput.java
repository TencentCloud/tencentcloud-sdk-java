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

public class DescribeAigcFaceInfoAsyncOutput extends AbstractModel {

    /**
    * <p>人脸信息。</p>
    */
    @SerializedName("FaceInfoSet")
    @Expose
    private AigcFaceInfo [] FaceInfoSet;

    /**
     * Get <p>人脸信息。</p> 
     * @return FaceInfoSet <p>人脸信息。</p>
     */
    public AigcFaceInfo [] getFaceInfoSet() {
        return this.FaceInfoSet;
    }

    /**
     * Set <p>人脸信息。</p>
     * @param FaceInfoSet <p>人脸信息。</p>
     */
    public void setFaceInfoSet(AigcFaceInfo [] FaceInfoSet) {
        this.FaceInfoSet = FaceInfoSet;
    }

    public DescribeAigcFaceInfoAsyncOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAigcFaceInfoAsyncOutput(DescribeAigcFaceInfoAsyncOutput source) {
        if (source.FaceInfoSet != null) {
            this.FaceInfoSet = new AigcFaceInfo[source.FaceInfoSet.length];
            for (int i = 0; i < source.FaceInfoSet.length; i++) {
                this.FaceInfoSet[i] = new AigcFaceInfo(source.FaceInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FaceInfoSet.", this.FaceInfoSet);

    }
}

