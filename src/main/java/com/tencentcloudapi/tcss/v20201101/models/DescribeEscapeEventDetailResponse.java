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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEscapeEventDetailResponse extends AbstractModel{

    /**
    * 事件基本信息
    */
    @SerializedName("EventBaseInfo")
    @Expose
    private RunTimeEventBaseInfo EventBaseInfo;

    /**
    * 进程信息
    */
    @SerializedName("ProcessInfo")
    @Expose
    private ProcessDetailInfo ProcessInfo;

    /**
    * 事件描述
    */
    @SerializedName("EventDetail")
    @Expose
    private EscapeEventDescription EventDetail;

    /**
    * 父进程信息
    */
    @SerializedName("ParentProcessInfo")
    @Expose
    private ProcessBaseInfo ParentProcessInfo;

    /**
    * 祖先进程信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AncestorProcessInfo")
    @Expose
    private ProcessBaseInfo AncestorProcessInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 事件基本信息 
     * @return EventBaseInfo 事件基本信息
     */
    public RunTimeEventBaseInfo getEventBaseInfo() {
        return this.EventBaseInfo;
    }

    /**
     * Set 事件基本信息
     * @param EventBaseInfo 事件基本信息
     */
    public void setEventBaseInfo(RunTimeEventBaseInfo EventBaseInfo) {
        this.EventBaseInfo = EventBaseInfo;
    }

    /**
     * Get 进程信息 
     * @return ProcessInfo 进程信息
     */
    public ProcessDetailInfo getProcessInfo() {
        return this.ProcessInfo;
    }

    /**
     * Set 进程信息
     * @param ProcessInfo 进程信息
     */
    public void setProcessInfo(ProcessDetailInfo ProcessInfo) {
        this.ProcessInfo = ProcessInfo;
    }

    /**
     * Get 事件描述 
     * @return EventDetail 事件描述
     */
    public EscapeEventDescription getEventDetail() {
        return this.EventDetail;
    }

    /**
     * Set 事件描述
     * @param EventDetail 事件描述
     */
    public void setEventDetail(EscapeEventDescription EventDetail) {
        this.EventDetail = EventDetail;
    }

    /**
     * Get 父进程信息 
     * @return ParentProcessInfo 父进程信息
     */
    public ProcessBaseInfo getParentProcessInfo() {
        return this.ParentProcessInfo;
    }

    /**
     * Set 父进程信息
     * @param ParentProcessInfo 父进程信息
     */
    public void setParentProcessInfo(ProcessBaseInfo ParentProcessInfo) {
        this.ParentProcessInfo = ParentProcessInfo;
    }

    /**
     * Get 祖先进程信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AncestorProcessInfo 祖先进程信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProcessBaseInfo getAncestorProcessInfo() {
        return this.AncestorProcessInfo;
    }

    /**
     * Set 祖先进程信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AncestorProcessInfo 祖先进程信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAncestorProcessInfo(ProcessBaseInfo AncestorProcessInfo) {
        this.AncestorProcessInfo = AncestorProcessInfo;
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

    public DescribeEscapeEventDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEscapeEventDetailResponse(DescribeEscapeEventDetailResponse source) {
        if (source.EventBaseInfo != null) {
            this.EventBaseInfo = new RunTimeEventBaseInfo(source.EventBaseInfo);
        }
        if (source.ProcessInfo != null) {
            this.ProcessInfo = new ProcessDetailInfo(source.ProcessInfo);
        }
        if (source.EventDetail != null) {
            this.EventDetail = new EscapeEventDescription(source.EventDetail);
        }
        if (source.ParentProcessInfo != null) {
            this.ParentProcessInfo = new ProcessBaseInfo(source.ParentProcessInfo);
        }
        if (source.AncestorProcessInfo != null) {
            this.AncestorProcessInfo = new ProcessBaseInfo(source.AncestorProcessInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "EventBaseInfo.", this.EventBaseInfo);
        this.setParamObj(map, prefix + "ProcessInfo.", this.ProcessInfo);
        this.setParamObj(map, prefix + "EventDetail.", this.EventDetail);
        this.setParamObj(map, prefix + "ParentProcessInfo.", this.ParentProcessInfo);
        this.setParamObj(map, prefix + "AncestorProcessInfo.", this.AncestorProcessInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

