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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInvocationDetailRequest extends AbstractModel {

    /**
    * <p>云桌面实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>任务ID。</p>
    */
    @SerializedName("InvokeId")
    @Expose
    private String InvokeId;

    /**
    * <p>需要返回的任务输出行号起始索引。</p>
    */
    @SerializedName("OutputLinesOffset")
    @Expose
    private Long OutputLinesOffset;

    /**
    * <p>需要返回的任务输出行数。</p>
    */
    @SerializedName("OutputLinesLimit")
    @Expose
    private Long OutputLinesLimit;

    /**
    * <p>任务的输出内容是否合并成一个字符串。默认为true。</p>
    */
    @SerializedName("MergeOutputLines")
    @Expose
    private Boolean MergeOutputLines;

    /**
     * Get <p>云桌面实例ID。</p> 
     * @return InstanceId <p>云桌面实例ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>云桌面实例ID。</p>
     * @param InstanceId <p>云桌面实例ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>任务ID。</p> 
     * @return InvokeId <p>任务ID。</p>
     */
    public String getInvokeId() {
        return this.InvokeId;
    }

    /**
     * Set <p>任务ID。</p>
     * @param InvokeId <p>任务ID。</p>
     */
    public void setInvokeId(String InvokeId) {
        this.InvokeId = InvokeId;
    }

    /**
     * Get <p>需要返回的任务输出行号起始索引。</p> 
     * @return OutputLinesOffset <p>需要返回的任务输出行号起始索引。</p>
     */
    public Long getOutputLinesOffset() {
        return this.OutputLinesOffset;
    }

    /**
     * Set <p>需要返回的任务输出行号起始索引。</p>
     * @param OutputLinesOffset <p>需要返回的任务输出行号起始索引。</p>
     */
    public void setOutputLinesOffset(Long OutputLinesOffset) {
        this.OutputLinesOffset = OutputLinesOffset;
    }

    /**
     * Get <p>需要返回的任务输出行数。</p> 
     * @return OutputLinesLimit <p>需要返回的任务输出行数。</p>
     */
    public Long getOutputLinesLimit() {
        return this.OutputLinesLimit;
    }

    /**
     * Set <p>需要返回的任务输出行数。</p>
     * @param OutputLinesLimit <p>需要返回的任务输出行数。</p>
     */
    public void setOutputLinesLimit(Long OutputLinesLimit) {
        this.OutputLinesLimit = OutputLinesLimit;
    }

    /**
     * Get <p>任务的输出内容是否合并成一个字符串。默认为true。</p> 
     * @return MergeOutputLines <p>任务的输出内容是否合并成一个字符串。默认为true。</p>
     */
    public Boolean getMergeOutputLines() {
        return this.MergeOutputLines;
    }

    /**
     * Set <p>任务的输出内容是否合并成一个字符串。默认为true。</p>
     * @param MergeOutputLines <p>任务的输出内容是否合并成一个字符串。默认为true。</p>
     */
    public void setMergeOutputLines(Boolean MergeOutputLines) {
        this.MergeOutputLines = MergeOutputLines;
    }

    public DescribeInvocationDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInvocationDetailRequest(DescribeInvocationDetailRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InvokeId != null) {
            this.InvokeId = new String(source.InvokeId);
        }
        if (source.OutputLinesOffset != null) {
            this.OutputLinesOffset = new Long(source.OutputLinesOffset);
        }
        if (source.OutputLinesLimit != null) {
            this.OutputLinesLimit = new Long(source.OutputLinesLimit);
        }
        if (source.MergeOutputLines != null) {
            this.MergeOutputLines = new Boolean(source.MergeOutputLines);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InvokeId", this.InvokeId);
        this.setParamSimple(map, prefix + "OutputLinesOffset", this.OutputLinesOffset);
        this.setParamSimple(map, prefix + "OutputLinesLimit", this.OutputLinesLimit);
        this.setParamSimple(map, prefix + "MergeOutputLines", this.MergeOutputLines);

    }
}

