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

public class DescribeAigcFaceInfoAsyncInput extends AbstractModel {

    /**
    * <p>需要获取人脸信息的输入视频信息。</p>
    */
    @SerializedName("FileInfos")
    @Expose
    private AigcFaceInputFileInfo [] FileInfos;

    /**
     * Get <p>需要获取人脸信息的输入视频信息。</p> 
     * @return FileInfos <p>需要获取人脸信息的输入视频信息。</p>
     */
    public AigcFaceInputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set <p>需要获取人脸信息的输入视频信息。</p>
     * @param FileInfos <p>需要获取人脸信息的输入视频信息。</p>
     */
    public void setFileInfos(AigcFaceInputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    public DescribeAigcFaceInfoAsyncInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAigcFaceInfoAsyncInput(DescribeAigcFaceInfoAsyncInput source) {
        if (source.FileInfos != null) {
            this.FileInfos = new AigcFaceInputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new AigcFaceInputFileInfo(source.FileInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);

    }
}

