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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFileConvertTaskResponse extends AbstractModel {

    /**
    * <p>任务Id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务状态，需要关注的状态</p><p>枚举值：</p><ul><li>0： NeedTranform - 任务已提交</li><li>4： Processing - 文档转换中</li><li>8： TaskEnd - 任务处理完成</li><li>-2： DownloadFailed - 下载失败</li><li>-6： ProcessFailed - 转换失败</li><li>-13： ProcessTimeout - 转换文件超时</li></ul>
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * <p>状态描述，需要关注的状态</p><ul><li> **NeedTranform** : 任务已提交</li><li> **Processing** : 文档转换中</li><li> **TaskEnd** : 任务处理完成</li><li> **DownloadFailed** : 下载失败</li><li> **ProcessFailed** : 转换失败</li><li> **ProcessTimeout** : 转换文件超时</li></ul>
    */
    @SerializedName("TaskMessage")
    @Expose
    private String TaskMessage;

    /**
    * <p>资源Id（即FileId），用于<a href="https://qian.tencent.com/developers/partnerApis/startFlows/ChannelCreateFlowByFiles">用PDF文件创建签署流程</a></p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务Id</p> 
     * @return TaskId <p>任务Id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务Id</p>
     * @param TaskId <p>任务Id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务状态，需要关注的状态</p><p>枚举值：</p><ul><li>0： NeedTranform - 任务已提交</li><li>4： Processing - 文档转换中</li><li>8： TaskEnd - 任务处理完成</li><li>-2： DownloadFailed - 下载失败</li><li>-6： ProcessFailed - 转换失败</li><li>-13： ProcessTimeout - 转换文件超时</li></ul> 
     * @return TaskStatus <p>任务状态，需要关注的状态</p><p>枚举值：</p><ul><li>0： NeedTranform - 任务已提交</li><li>4： Processing - 文档转换中</li><li>8： TaskEnd - 任务处理完成</li><li>-2： DownloadFailed - 下载失败</li><li>-6： ProcessFailed - 转换失败</li><li>-13： ProcessTimeout - 转换文件超时</li></ul>
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>任务状态，需要关注的状态</p><p>枚举值：</p><ul><li>0： NeedTranform - 任务已提交</li><li>4： Processing - 文档转换中</li><li>8： TaskEnd - 任务处理完成</li><li>-2： DownloadFailed - 下载失败</li><li>-6： ProcessFailed - 转换失败</li><li>-13： ProcessTimeout - 转换文件超时</li></ul>
     * @param TaskStatus <p>任务状态，需要关注的状态</p><p>枚举值：</p><ul><li>0： NeedTranform - 任务已提交</li><li>4： Processing - 文档转换中</li><li>8： TaskEnd - 任务处理完成</li><li>-2： DownloadFailed - 下载失败</li><li>-6： ProcessFailed - 转换失败</li><li>-13： ProcessTimeout - 转换文件超时</li></ul>
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>状态描述，需要关注的状态</p><ul><li> **NeedTranform** : 任务已提交</li><li> **Processing** : 文档转换中</li><li> **TaskEnd** : 任务处理完成</li><li> **DownloadFailed** : 下载失败</li><li> **ProcessFailed** : 转换失败</li><li> **ProcessTimeout** : 转换文件超时</li></ul> 
     * @return TaskMessage <p>状态描述，需要关注的状态</p><ul><li> **NeedTranform** : 任务已提交</li><li> **Processing** : 文档转换中</li><li> **TaskEnd** : 任务处理完成</li><li> **DownloadFailed** : 下载失败</li><li> **ProcessFailed** : 转换失败</li><li> **ProcessTimeout** : 转换文件超时</li></ul>
     */
    public String getTaskMessage() {
        return this.TaskMessage;
    }

    /**
     * Set <p>状态描述，需要关注的状态</p><ul><li> **NeedTranform** : 任务已提交</li><li> **Processing** : 文档转换中</li><li> **TaskEnd** : 任务处理完成</li><li> **DownloadFailed** : 下载失败</li><li> **ProcessFailed** : 转换失败</li><li> **ProcessTimeout** : 转换文件超时</li></ul>
     * @param TaskMessage <p>状态描述，需要关注的状态</p><ul><li> **NeedTranform** : 任务已提交</li><li> **Processing** : 文档转换中</li><li> **TaskEnd** : 任务处理完成</li><li> **DownloadFailed** : 下载失败</li><li> **ProcessFailed** : 转换失败</li><li> **ProcessTimeout** : 转换文件超时</li></ul>
     */
    public void setTaskMessage(String TaskMessage) {
        this.TaskMessage = TaskMessage;
    }

    /**
     * Get <p>资源Id（即FileId），用于<a href="https://qian.tencent.com/developers/partnerApis/startFlows/ChannelCreateFlowByFiles">用PDF文件创建签署流程</a></p> 
     * @return ResourceId <p>资源Id（即FileId），用于<a href="https://qian.tencent.com/developers/partnerApis/startFlows/ChannelCreateFlowByFiles">用PDF文件创建签署流程</a></p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源Id（即FileId），用于<a href="https://qian.tencent.com/developers/partnerApis/startFlows/ChannelCreateFlowByFiles">用PDF文件创建签署流程</a></p>
     * @param ResourceId <p>资源Id（即FileId），用于<a href="https://qian.tencent.com/developers/partnerApis/startFlows/ChannelCreateFlowByFiles">用PDF文件创建签署流程</a></p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
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

    public DescribeFileConvertTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileConvertTaskResponse(DescribeFileConvertTaskResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.TaskMessage != null) {
            this.TaskMessage = new String(source.TaskMessage);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskMessage", this.TaskMessage);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

