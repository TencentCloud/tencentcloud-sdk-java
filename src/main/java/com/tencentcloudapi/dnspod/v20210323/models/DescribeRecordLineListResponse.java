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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordLineListResponse extends AbstractModel{

    /**
    * 线路列表。
    */
    @SerializedName("LineList")
    @Expose
    private LineInfo [] LineList;

    /**
    * 线路分组列表。
    */
    @SerializedName("LineGroupList")
    @Expose
    private LineGroupInfo [] LineGroupList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 线路列表。 
     * @return LineList 线路列表。
     */
    public LineInfo [] getLineList() {
        return this.LineList;
    }

    /**
     * Set 线路列表。
     * @param LineList 线路列表。
     */
    public void setLineList(LineInfo [] LineList) {
        this.LineList = LineList;
    }

    /**
     * Get 线路分组列表。 
     * @return LineGroupList 线路分组列表。
     */
    public LineGroupInfo [] getLineGroupList() {
        return this.LineGroupList;
    }

    /**
     * Set 线路分组列表。
     * @param LineGroupList 线路分组列表。
     */
    public void setLineGroupList(LineGroupInfo [] LineGroupList) {
        this.LineGroupList = LineGroupList;
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

    public DescribeRecordLineListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordLineListResponse(DescribeRecordLineListResponse source) {
        if (source.LineList != null) {
            this.LineList = new LineInfo[source.LineList.length];
            for (int i = 0; i < source.LineList.length; i++) {
                this.LineList[i] = new LineInfo(source.LineList[i]);
            }
        }
        if (source.LineGroupList != null) {
            this.LineGroupList = new LineGroupInfo[source.LineGroupList.length];
            for (int i = 0; i < source.LineGroupList.length; i++) {
                this.LineGroupList[i] = new LineGroupInfo(source.LineGroupList[i]);
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
        this.setParamArrayObj(map, prefix + "LineList.", this.LineList);
        this.setParamArrayObj(map, prefix + "LineGroupList.", this.LineGroupList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

