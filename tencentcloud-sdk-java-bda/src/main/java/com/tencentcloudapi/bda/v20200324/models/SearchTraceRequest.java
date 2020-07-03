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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchTraceRequest extends AbstractModel{

    /**
    * 希望搜索的人体库ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 人体轨迹信息。
    */
    @SerializedName("Trace")
    @Expose
    private Trace Trace;

    /**
    * 单张被识别的人体轨迹返回的最相似人员数量。
默认值为5，最大值为100。
 例，设MaxPersonNum为8，则返回Top8相似的人员信息。 值越大，需要处理的时间越长。建议不要超过10。
    */
    @SerializedName("MaxPersonNum")
    @Expose
    private Long MaxPersonNum;

    /**
    * 出参Score中，只有超过TraceMatchThreshold值的结果才会返回。
默认为0。范围[0, 100.0]。
    */
    @SerializedName("TraceMatchThreshold")
    @Expose
    private Float TraceMatchThreshold;

    /**
     * Get 希望搜索的人体库ID。 
     * @return GroupId 希望搜索的人体库ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 希望搜索的人体库ID。
     * @param GroupId 希望搜索的人体库ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 人体轨迹信息。 
     * @return Trace 人体轨迹信息。
     */
    public Trace getTrace() {
        return this.Trace;
    }

    /**
     * Set 人体轨迹信息。
     * @param Trace 人体轨迹信息。
     */
    public void setTrace(Trace Trace) {
        this.Trace = Trace;
    }

    /**
     * Get 单张被识别的人体轨迹返回的最相似人员数量。
默认值为5，最大值为100。
 例，设MaxPersonNum为8，则返回Top8相似的人员信息。 值越大，需要处理的时间越长。建议不要超过10。 
     * @return MaxPersonNum 单张被识别的人体轨迹返回的最相似人员数量。
默认值为5，最大值为100。
 例，设MaxPersonNum为8，则返回Top8相似的人员信息。 值越大，需要处理的时间越长。建议不要超过10。
     */
    public Long getMaxPersonNum() {
        return this.MaxPersonNum;
    }

    /**
     * Set 单张被识别的人体轨迹返回的最相似人员数量。
默认值为5，最大值为100。
 例，设MaxPersonNum为8，则返回Top8相似的人员信息。 值越大，需要处理的时间越长。建议不要超过10。
     * @param MaxPersonNum 单张被识别的人体轨迹返回的最相似人员数量。
默认值为5，最大值为100。
 例，设MaxPersonNum为8，则返回Top8相似的人员信息。 值越大，需要处理的时间越长。建议不要超过10。
     */
    public void setMaxPersonNum(Long MaxPersonNum) {
        this.MaxPersonNum = MaxPersonNum;
    }

    /**
     * Get 出参Score中，只有超过TraceMatchThreshold值的结果才会返回。
默认为0。范围[0, 100.0]。 
     * @return TraceMatchThreshold 出参Score中，只有超过TraceMatchThreshold值的结果才会返回。
默认为0。范围[0, 100.0]。
     */
    public Float getTraceMatchThreshold() {
        return this.TraceMatchThreshold;
    }

    /**
     * Set 出参Score中，只有超过TraceMatchThreshold值的结果才会返回。
默认为0。范围[0, 100.0]。
     * @param TraceMatchThreshold 出参Score中，只有超过TraceMatchThreshold值的结果才会返回。
默认为0。范围[0, 100.0]。
     */
    public void setTraceMatchThreshold(Float TraceMatchThreshold) {
        this.TraceMatchThreshold = TraceMatchThreshold;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamObj(map, prefix + "Trace.", this.Trace);
        this.setParamSimple(map, prefix + "MaxPersonNum", this.MaxPersonNum);
        this.setParamSimple(map, prefix + "TraceMatchThreshold", this.TraceMatchThreshold);

    }
}

