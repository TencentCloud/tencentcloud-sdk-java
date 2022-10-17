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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetLivenessResultResponse extends AbstractModel{

    /**
    * 流程的最终结果
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 流程的最终结果描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 人像截图
    */
    @SerializedName("BestFrame")
    @Expose
    private FileInfo BestFrame;

    /**
    * 检测过程视频
    */
    @SerializedName("Video")
    @Expose
    private FileInfo Video;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 流程的最终结果 
     * @return Result 流程的最终结果
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 流程的最终结果
     * @param Result 流程的最终结果
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 流程的最终结果描述 
     * @return Description 流程的最终结果描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 流程的最终结果描述
     * @param Description 流程的最终结果描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 人像截图 
     * @return BestFrame 人像截图
     */
    public FileInfo getBestFrame() {
        return this.BestFrame;
    }

    /**
     * Set 人像截图
     * @param BestFrame 人像截图
     */
    public void setBestFrame(FileInfo BestFrame) {
        this.BestFrame = BestFrame;
    }

    /**
     * Get 检测过程视频 
     * @return Video 检测过程视频
     */
    public FileInfo getVideo() {
        return this.Video;
    }

    /**
     * Set 检测过程视频
     * @param Video 检测过程视频
     */
    public void setVideo(FileInfo Video) {
        this.Video = Video;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetLivenessResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetLivenessResultResponse(GetLivenessResultResponse source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.BestFrame != null) {
            this.BestFrame = new FileInfo(source.BestFrame);
        }
        if (source.Video != null) {
            this.Video = new FileInfo(source.Video);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "BestFrame.", this.BestFrame);
        this.setParamObj(map, prefix + "Video.", this.Video);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

