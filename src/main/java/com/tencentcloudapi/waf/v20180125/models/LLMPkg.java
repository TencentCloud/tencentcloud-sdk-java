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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LLMPkg extends AbstractModel {

    /**
    * <p>资源id</p>
    */
    @SerializedName("ResourceIds")
    @Expose
    private String ResourceIds;

    /**
    * <p>状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private Long Region;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>申请数量</p>
    */
    @SerializedName("InquireNum")
    @Expose
    private Long InquireNum;

    /**
    * <p>计费项标签，如 sv_wsm_waf_llm_prompt_attack</p>
    */
    @SerializedName("InquireKey")
    @Expose
    private String InquireKey;

    /**
     * Get <p>资源id</p> 
     * @return ResourceIds <p>资源id</p>
     */
    public String getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set <p>资源id</p>
     * @param ResourceIds <p>资源id</p>
     */
    public void setResourceIds(String ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get <p>状态</p> 
     * @return Status <p>状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
     * @param Status <p>状态</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public Long getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(Long Region) {
        this.Region = Region;
    }

    /**
     * Get <p>开始时间</p> 
     * @return BeginTime <p>开始时间</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param BeginTime <p>开始时间</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>申请数量</p> 
     * @return InquireNum <p>申请数量</p>
     */
    public Long getInquireNum() {
        return this.InquireNum;
    }

    /**
     * Set <p>申请数量</p>
     * @param InquireNum <p>申请数量</p>
     */
    public void setInquireNum(Long InquireNum) {
        this.InquireNum = InquireNum;
    }

    /**
     * Get <p>计费项标签，如 sv_wsm_waf_llm_prompt_attack</p> 
     * @return InquireKey <p>计费项标签，如 sv_wsm_waf_llm_prompt_attack</p>
     */
    public String getInquireKey() {
        return this.InquireKey;
    }

    /**
     * Set <p>计费项标签，如 sv_wsm_waf_llm_prompt_attack</p>
     * @param InquireKey <p>计费项标签，如 sv_wsm_waf_llm_prompt_attack</p>
     */
    public void setInquireKey(String InquireKey) {
        this.InquireKey = InquireKey;
    }

    public LLMPkg() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMPkg(LLMPkg source) {
        if (source.ResourceIds != null) {
            this.ResourceIds = new String(source.ResourceIds);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Region != null) {
            this.Region = new Long(source.Region);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.InquireNum != null) {
            this.InquireNum = new Long(source.InquireNum);
        }
        if (source.InquireKey != null) {
            this.InquireKey = new String(source.InquireKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceIds", this.ResourceIds);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "InquireNum", this.InquireNum);
        this.setParamSimple(map, prefix + "InquireKey", this.InquireKey);

    }
}

