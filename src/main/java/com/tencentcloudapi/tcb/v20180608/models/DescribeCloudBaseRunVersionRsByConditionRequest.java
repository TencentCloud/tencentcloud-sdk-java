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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudBaseRunVersionRsByConditionRequest extends AbstractModel {

    /**
    * 环境ID；EnvId和ClusterId不能同时为空
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 集群ID；EnvId和ClusterId不能同时为空
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 过滤网关服务开关
    */
    @SerializedName("FilterGwSwitch")
    @Expose
    private Boolean FilterGwSwitch;

    /**
     * Get 环境ID；EnvId和ClusterId不能同时为空 
     * @return EnvId 环境ID；EnvId和ClusterId不能同时为空
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID；EnvId和ClusterId不能同时为空
     * @param EnvId 环境ID；EnvId和ClusterId不能同时为空
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 集群ID；EnvId和ClusterId不能同时为空 
     * @return ClusterId 集群ID；EnvId和ClusterId不能同时为空
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID；EnvId和ClusterId不能同时为空
     * @param ClusterId 集群ID；EnvId和ClusterId不能同时为空
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 过滤网关服务开关 
     * @return FilterGwSwitch 过滤网关服务开关
     */
    public Boolean getFilterGwSwitch() {
        return this.FilterGwSwitch;
    }

    /**
     * Set 过滤网关服务开关
     * @param FilterGwSwitch 过滤网关服务开关
     */
    public void setFilterGwSwitch(Boolean FilterGwSwitch) {
        this.FilterGwSwitch = FilterGwSwitch;
    }

    public DescribeCloudBaseRunVersionRsByConditionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudBaseRunVersionRsByConditionRequest(DescribeCloudBaseRunVersionRsByConditionRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.FilterGwSwitch != null) {
            this.FilterGwSwitch = new Boolean(source.FilterGwSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "FilterGwSwitch", this.FilterGwSwitch);

    }
}

