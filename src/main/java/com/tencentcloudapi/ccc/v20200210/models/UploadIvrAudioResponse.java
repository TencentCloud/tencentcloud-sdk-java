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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadIvrAudioResponse extends AbstractModel {

    /**
    * 上传失败的文件列表
    */
    @SerializedName("FailedFileList")
    @Expose
    private UploadIvrAudioFailedInfo [] FailedFileList;

    /**
    * 上传成功文件列表
    */
    @SerializedName("SuccessFileList")
    @Expose
    private AudioFileInfo [] SuccessFileList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 上传失败的文件列表 
     * @return FailedFileList 上传失败的文件列表
     */
    public UploadIvrAudioFailedInfo [] getFailedFileList() {
        return this.FailedFileList;
    }

    /**
     * Set 上传失败的文件列表
     * @param FailedFileList 上传失败的文件列表
     */
    public void setFailedFileList(UploadIvrAudioFailedInfo [] FailedFileList) {
        this.FailedFileList = FailedFileList;
    }

    /**
     * Get 上传成功文件列表 
     * @return SuccessFileList 上传成功文件列表
     */
    public AudioFileInfo [] getSuccessFileList() {
        return this.SuccessFileList;
    }

    /**
     * Set 上传成功文件列表
     * @param SuccessFileList 上传成功文件列表
     */
    public void setSuccessFileList(AudioFileInfo [] SuccessFileList) {
        this.SuccessFileList = SuccessFileList;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public UploadIvrAudioResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadIvrAudioResponse(UploadIvrAudioResponse source) {
        if (source.FailedFileList != null) {
            this.FailedFileList = new UploadIvrAudioFailedInfo[source.FailedFileList.length];
            for (int i = 0; i < source.FailedFileList.length; i++) {
                this.FailedFileList[i] = new UploadIvrAudioFailedInfo(source.FailedFileList[i]);
            }
        }
        if (source.SuccessFileList != null) {
            this.SuccessFileList = new AudioFileInfo[source.SuccessFileList.length];
            for (int i = 0; i < source.SuccessFileList.length; i++) {
                this.SuccessFileList[i] = new AudioFileInfo(source.SuccessFileList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FailedFileList.", this.FailedFileList);
        this.setParamArrayObj(map, prefix + "SuccessFileList.", this.SuccessFileList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

