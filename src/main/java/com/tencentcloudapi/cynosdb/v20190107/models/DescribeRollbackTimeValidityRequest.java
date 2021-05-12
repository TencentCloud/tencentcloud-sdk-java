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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRollbackTimeValidityRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 期望回滚的时间点
    */
    @SerializedName("ExpectTime")
    @Expose
    private String ExpectTime;

    /**
    * 回滚时间点的允许误差范围
    */
    @SerializedName("ExpectTimeThresh")
    @Expose
    private Long ExpectTimeThresh;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 期望回滚的时间点 
     * @return ExpectTime 期望回滚的时间点
     */
    public String getExpectTime() {
        return this.ExpectTime;
    }

    /**
     * Set 期望回滚的时间点
     * @param ExpectTime 期望回滚的时间点
     */
    public void setExpectTime(String ExpectTime) {
        this.ExpectTime = ExpectTime;
    }

    /**
     * Get 回滚时间点的允许误差范围 
     * @return ExpectTimeThresh 回滚时间点的允许误差范围
     */
    public Long getExpectTimeThresh() {
        return this.ExpectTimeThresh;
    }

    /**
     * Set 回滚时间点的允许误差范围
     * @param ExpectTimeThresh 回滚时间点的允许误差范围
     */
    public void setExpectTimeThresh(Long ExpectTimeThresh) {
        this.ExpectTimeThresh = ExpectTimeThresh;
    }

    public DescribeRollbackTimeValidityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRollbackTimeValidityRequest(DescribeRollbackTimeValidityRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ExpectTime != null) {
            this.ExpectTime = new String(source.ExpectTime);
        }
        if (source.ExpectTimeThresh != null) {
            this.ExpectTimeThresh = new Long(source.ExpectTimeThresh);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ExpectTime", this.ExpectTime);
        this.setParamSimple(map, prefix + "ExpectTimeThresh", this.ExpectTimeThresh);

    }
}

