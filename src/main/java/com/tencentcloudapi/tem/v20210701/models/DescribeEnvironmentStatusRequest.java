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

public class DescribeEnvironmentStatusRequest extends AbstractModel{

    /**
    * 命名空间id
    */
    @SerializedName("EnvironmentIds")
    @Expose
    private String [] EnvironmentIds;

    /**
    * 来源Channel
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
     * Get 命名空间id 
     * @return EnvironmentIds 命名空间id
     */
    public String [] getEnvironmentIds() {
        return this.EnvironmentIds;
    }

    /**
     * Set 命名空间id
     * @param EnvironmentIds 命名空间id
     */
    public void setEnvironmentIds(String [] EnvironmentIds) {
        this.EnvironmentIds = EnvironmentIds;
    }

    /**
     * Get 来源Channel 
     * @return SourceChannel 来源Channel
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set 来源Channel
     * @param SourceChannel 来源Channel
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    public DescribeEnvironmentStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEnvironmentStatusRequest(DescribeEnvironmentStatusRequest source) {
        if (source.EnvironmentIds != null) {
            this.EnvironmentIds = new String[source.EnvironmentIds.length];
            for (int i = 0; i < source.EnvironmentIds.length; i++) {
                this.EnvironmentIds[i] = new String(source.EnvironmentIds[i]);
            }
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EnvironmentIds.", this.EnvironmentIds);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);

    }
}

