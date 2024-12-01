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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeZoneConfigImportResultResponse extends AbstractModel {

    /**
    * 本次导入任务的导入状态。取值有：  <li>success：表示配置项导入成功；</li> <li>failure：表示配置项导入失败；</li> <li>doing：表示配置项正在导入中。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 本次导入任务的状态的提示信息。当配置项导入失败时，可通过本字段查看失败原因。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 本次导入任务的配置内容。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 本次导入任务的开始时间。
    */
    @SerializedName("ImportTime")
    @Expose
    private String ImportTime;

    /**
    * 本次导入任务的结束时间。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 本次导入任务的导入状态。取值有：  <li>success：表示配置项导入成功；</li> <li>failure：表示配置项导入失败；</li> <li>doing：表示配置项正在导入中。</li> 
     * @return Status 本次导入任务的导入状态。取值有：  <li>success：表示配置项导入成功；</li> <li>failure：表示配置项导入失败；</li> <li>doing：表示配置项正在导入中。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 本次导入任务的导入状态。取值有：  <li>success：表示配置项导入成功；</li> <li>failure：表示配置项导入失败；</li> <li>doing：表示配置项正在导入中。</li>
     * @param Status 本次导入任务的导入状态。取值有：  <li>success：表示配置项导入成功；</li> <li>failure：表示配置项导入失败；</li> <li>doing：表示配置项正在导入中。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 本次导入任务的状态的提示信息。当配置项导入失败时，可通过本字段查看失败原因。 
     * @return Message 本次导入任务的状态的提示信息。当配置项导入失败时，可通过本字段查看失败原因。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 本次导入任务的状态的提示信息。当配置项导入失败时，可通过本字段查看失败原因。
     * @param Message 本次导入任务的状态的提示信息。当配置项导入失败时，可通过本字段查看失败原因。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 本次导入任务的配置内容。 
     * @return Content 本次导入任务的配置内容。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 本次导入任务的配置内容。
     * @param Content 本次导入任务的配置内容。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 本次导入任务的开始时间。 
     * @return ImportTime 本次导入任务的开始时间。
     */
    public String getImportTime() {
        return this.ImportTime;
    }

    /**
     * Set 本次导入任务的开始时间。
     * @param ImportTime 本次导入任务的开始时间。
     */
    public void setImportTime(String ImportTime) {
        this.ImportTime = ImportTime;
    }

    /**
     * Get 本次导入任务的结束时间。 
     * @return FinishTime 本次导入任务的结束时间。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 本次导入任务的结束时间。
     * @param FinishTime 本次导入任务的结束时间。
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
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

    public DescribeZoneConfigImportResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZoneConfigImportResultResponse(DescribeZoneConfigImportResultResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ImportTime != null) {
            this.ImportTime = new String(source.ImportTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ImportTime", this.ImportTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

