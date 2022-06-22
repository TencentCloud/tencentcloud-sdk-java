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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VersionFlowInfo extends AbstractModel{

    /**
    * 版本名
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 是否默认版本
    */
    @SerializedName("IsDefaultPriority")
    @Expose
    private Boolean IsDefaultPriority;

    /**
    * 流量比例
    */
    @SerializedName("FlowRatio")
    @Expose
    private Long FlowRatio;

    /**
    * 测试KV值
    */
    @SerializedName("UrlParam")
    @Expose
    private ObjectKV UrlParam;

    /**
    * 权重
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get 版本名 
     * @return VersionName 版本名
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名
     * @param VersionName 版本名
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 是否默认版本 
     * @return IsDefaultPriority 是否默认版本
     */
    public Boolean getIsDefaultPriority() {
        return this.IsDefaultPriority;
    }

    /**
     * Set 是否默认版本
     * @param IsDefaultPriority 是否默认版本
     */
    public void setIsDefaultPriority(Boolean IsDefaultPriority) {
        this.IsDefaultPriority = IsDefaultPriority;
    }

    /**
     * Get 流量比例 
     * @return FlowRatio 流量比例
     */
    public Long getFlowRatio() {
        return this.FlowRatio;
    }

    /**
     * Set 流量比例
     * @param FlowRatio 流量比例
     */
    public void setFlowRatio(Long FlowRatio) {
        this.FlowRatio = FlowRatio;
    }

    /**
     * Get 测试KV值 
     * @return UrlParam 测试KV值
     */
    public ObjectKV getUrlParam() {
        return this.UrlParam;
    }

    /**
     * Set 测试KV值
     * @param UrlParam 测试KV值
     */
    public void setUrlParam(ObjectKV UrlParam) {
        this.UrlParam = UrlParam;
    }

    /**
     * Get 权重 
     * @return Priority 权重
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 权重
     * @param Priority 权重
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public VersionFlowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VersionFlowInfo(VersionFlowInfo source) {
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.IsDefaultPriority != null) {
            this.IsDefaultPriority = new Boolean(source.IsDefaultPriority);
        }
        if (source.FlowRatio != null) {
            this.FlowRatio = new Long(source.FlowRatio);
        }
        if (source.UrlParam != null) {
            this.UrlParam = new ObjectKV(source.UrlParam);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "IsDefaultPriority", this.IsDefaultPriority);
        this.setParamSimple(map, prefix + "FlowRatio", this.FlowRatio);
        this.setParamObj(map, prefix + "UrlParam.", this.UrlParam);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

