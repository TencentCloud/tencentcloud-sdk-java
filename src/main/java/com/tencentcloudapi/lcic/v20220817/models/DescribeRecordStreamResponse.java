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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordStreamResponse extends AbstractModel {

    /**
    * 学校ID
    */
    @SerializedName("SchoolId")
    @Expose
    private Long SchoolId;

    /**
    * 课堂ID
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * 课堂类型
    */
    @SerializedName("ClassType")
    @Expose
    private Long ClassType;

    /**
    * 用户流信息
    */
    @SerializedName("StreamInfo")
    @Expose
    private SingleStreamInfo [] StreamInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 学校ID 
     * @return SchoolId 学校ID
     */
    public Long getSchoolId() {
        return this.SchoolId;
    }

    /**
     * Set 学校ID
     * @param SchoolId 学校ID
     */
    public void setSchoolId(Long SchoolId) {
        this.SchoolId = SchoolId;
    }

    /**
     * Get 课堂ID 
     * @return ClassId 课堂ID
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set 课堂ID
     * @param ClassId 课堂ID
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get 课堂类型 
     * @return ClassType 课堂类型
     */
    public Long getClassType() {
        return this.ClassType;
    }

    /**
     * Set 课堂类型
     * @param ClassType 课堂类型
     */
    public void setClassType(Long ClassType) {
        this.ClassType = ClassType;
    }

    /**
     * Get 用户流信息 
     * @return StreamInfo 用户流信息
     */
    public SingleStreamInfo [] getStreamInfo() {
        return this.StreamInfo;
    }

    /**
     * Set 用户流信息
     * @param StreamInfo 用户流信息
     */
    public void setStreamInfo(SingleStreamInfo [] StreamInfo) {
        this.StreamInfo = StreamInfo;
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

    public DescribeRecordStreamResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordStreamResponse(DescribeRecordStreamResponse source) {
        if (source.SchoolId != null) {
            this.SchoolId = new Long(source.SchoolId);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.ClassType != null) {
            this.ClassType = new Long(source.ClassType);
        }
        if (source.StreamInfo != null) {
            this.StreamInfo = new SingleStreamInfo[source.StreamInfo.length];
            for (int i = 0; i < source.StreamInfo.length; i++) {
                this.StreamInfo[i] = new SingleStreamInfo(source.StreamInfo[i]);
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
        this.setParamSimple(map, prefix + "SchoolId", this.SchoolId);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ClassType", this.ClassType);
        this.setParamArrayObj(map, prefix + "StreamInfo.", this.StreamInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

