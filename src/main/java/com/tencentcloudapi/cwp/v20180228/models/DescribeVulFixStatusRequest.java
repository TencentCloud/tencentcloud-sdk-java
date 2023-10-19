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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulFixStatusRequest extends AbstractModel {

    /**
    * 任务id 传VulId可以不用传FixId
    */
    @SerializedName("FixId")
    @Expose
    private Long FixId;

    /**
    * 漏洞id 传FixId可以不用传VulId
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 主机quuid 和VulId 组合可查 某主机最近一次修复任务详情
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
     * Get 任务id 传VulId可以不用传FixId 
     * @return FixId 任务id 传VulId可以不用传FixId
     */
    public Long getFixId() {
        return this.FixId;
    }

    /**
     * Set 任务id 传VulId可以不用传FixId
     * @param FixId 任务id 传VulId可以不用传FixId
     */
    public void setFixId(Long FixId) {
        this.FixId = FixId;
    }

    /**
     * Get 漏洞id 传FixId可以不用传VulId 
     * @return VulId 漏洞id 传FixId可以不用传VulId
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set 漏洞id 传FixId可以不用传VulId
     * @param VulId 漏洞id 传FixId可以不用传VulId
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get 主机quuid 和VulId 组合可查 某主机最近一次修复任务详情 
     * @return Quuid 主机quuid 和VulId 组合可查 某主机最近一次修复任务详情
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机quuid 和VulId 组合可查 某主机最近一次修复任务详情
     * @param Quuid 主机quuid 和VulId 组合可查 某主机最近一次修复任务详情
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    public DescribeVulFixStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulFixStatusRequest(DescribeVulFixStatusRequest source) {
        if (source.FixId != null) {
            this.FixId = new Long(source.FixId);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FixId", this.FixId);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);

    }
}

