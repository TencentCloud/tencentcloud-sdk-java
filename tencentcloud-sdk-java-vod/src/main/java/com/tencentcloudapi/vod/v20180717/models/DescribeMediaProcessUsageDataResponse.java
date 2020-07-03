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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMediaProcessUsageDataResponse extends AbstractModel{

    /**
    * 视频处理统计数据概览，展示所查询任务的概览以及详细数据。
    */
    @SerializedName("MediaProcessDataSet")
    @Expose
    private TaskStatData [] MediaProcessDataSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 视频处理统计数据概览，展示所查询任务的概览以及详细数据。 
     * @return MediaProcessDataSet 视频处理统计数据概览，展示所查询任务的概览以及详细数据。
     */
    public TaskStatData [] getMediaProcessDataSet() {
        return this.MediaProcessDataSet;
    }

    /**
     * Set 视频处理统计数据概览，展示所查询任务的概览以及详细数据。
     * @param MediaProcessDataSet 视频处理统计数据概览，展示所查询任务的概览以及详细数据。
     */
    public void setMediaProcessDataSet(TaskStatData [] MediaProcessDataSet) {
        this.MediaProcessDataSet = MediaProcessDataSet;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MediaProcessDataSet.", this.MediaProcessDataSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

