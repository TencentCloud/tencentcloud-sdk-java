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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationPodsRequest extends AbstractModel{

    /**
    * 环境id
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 应用id
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 单页条数，默认值20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页下标，默认值0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 实例状态 
- Running 
- Pending 
- Error
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例名字
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * 来源渠道
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
     * Get 环境id 
     * @return EnvironmentId 环境id
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境id
     * @param EnvironmentId 环境id
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 应用id 
     * @return ApplicationId 应用id
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用id
     * @param ApplicationId 应用id
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 单页条数，默认值20 
     * @return Limit 单页条数，默认值20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单页条数，默认值20
     * @param Limit 单页条数，默认值20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页下标，默认值0 
     * @return Offset 分页下标，默认值0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页下标，默认值0
     * @param Offset 分页下标，默认值0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 实例状态 
- Running 
- Pending 
- Error 
     * @return Status 实例状态 
- Running 
- Pending 
- Error
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态 
- Running 
- Pending 
- Error
     * @param Status 实例状态 
- Running 
- Pending 
- Error
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例名字 
     * @return PodName 实例名字
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set 实例名字
     * @param PodName 实例名字
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get 来源渠道 
     * @return SourceChannel 来源渠道
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set 来源渠道
     * @param SourceChannel 来源渠道
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    public DescribeApplicationPodsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationPodsRequest(DescribeApplicationPodsRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);

    }
}

