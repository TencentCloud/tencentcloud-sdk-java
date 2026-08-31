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

public class AigcHunyuan3DTaskOutput extends AbstractModel {

    /**
    * <p>AIGC 混元 3D 任务的输出文件信息。</p>
    */
    @SerializedName("FileInfos")
    @Expose
    private AigcHunyuan3DTaskOutputFileInfo [] FileInfos;

    /**
     * Get <p>AIGC 混元 3D 任务的输出文件信息。</p> 
     * @return FileInfos <p>AIGC 混元 3D 任务的输出文件信息。</p>
     */
    public AigcHunyuan3DTaskOutputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set <p>AIGC 混元 3D 任务的输出文件信息。</p>
     * @param FileInfos <p>AIGC 混元 3D 任务的输出文件信息。</p>
     */
    public void setFileInfos(AigcHunyuan3DTaskOutputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    public AigcHunyuan3DTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcHunyuan3DTaskOutput(AigcHunyuan3DTaskOutput source) {
        if (source.FileInfos != null) {
            this.FileInfos = new AigcHunyuan3DTaskOutputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new AigcHunyuan3DTaskOutputFileInfo(source.FileInfos[i]);
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

