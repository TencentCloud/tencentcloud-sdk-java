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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCallbackResponse extends AbstractModel {

    /**
    * 任务分析完成后回调地址
    */
    @SerializedName("TaskFinishNotifyURL")
    @Expose
    private String TaskFinishNotifyURL;

    /**
    * 媒体导入完成后回调地址
    */
    @SerializedName("MediaFinishNotifyURL")
    @Expose
    private String MediaFinishNotifyURL;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务分析完成后回调地址 
     * @return TaskFinishNotifyURL 任务分析完成后回调地址
     */
    public String getTaskFinishNotifyURL() {
        return this.TaskFinishNotifyURL;
    }

    /**
     * Set 任务分析完成后回调地址
     * @param TaskFinishNotifyURL 任务分析完成后回调地址
     */
    public void setTaskFinishNotifyURL(String TaskFinishNotifyURL) {
        this.TaskFinishNotifyURL = TaskFinishNotifyURL;
    }

    /**
     * Get 媒体导入完成后回调地址 
     * @return MediaFinishNotifyURL 媒体导入完成后回调地址
     */
    public String getMediaFinishNotifyURL() {
        return this.MediaFinishNotifyURL;
    }

    /**
     * Set 媒体导入完成后回调地址
     * @param MediaFinishNotifyURL 媒体导入完成后回调地址
     */
    public void setMediaFinishNotifyURL(String MediaFinishNotifyURL) {
        this.MediaFinishNotifyURL = MediaFinishNotifyURL;
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

    public QueryCallbackResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCallbackResponse(QueryCallbackResponse source) {
        if (source.TaskFinishNotifyURL != null) {
            this.TaskFinishNotifyURL = new String(source.TaskFinishNotifyURL);
        }
        if (source.MediaFinishNotifyURL != null) {
            this.MediaFinishNotifyURL = new String(source.MediaFinishNotifyURL);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskFinishNotifyURL", this.TaskFinishNotifyURL);
        this.setParamSimple(map, prefix + "MediaFinishNotifyURL", this.MediaFinishNotifyURL);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

