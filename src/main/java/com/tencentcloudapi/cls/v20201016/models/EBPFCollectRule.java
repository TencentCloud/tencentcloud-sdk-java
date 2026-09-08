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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EBPFCollectRule extends AbstractModel {

    /**
    * <p>采集规则名称</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>采集对象</p><p>枚举值：</p><ul><li>1： 所有进程</li></ul>
    */
    @SerializedName("TrackTarget")
    @Expose
    private Long TrackTarget;

    /**
    * <p>三维过滤器</p>
    */
    @SerializedName("Filters")
    @Expose
    private EBPFCollectFilters Filters;

    /**
     * Get <p>采集规则名称</p> 
     * @return RuleName <p>采集规则名称</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>采集规则名称</p>
     * @param RuleName <p>采集规则名称</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>采集对象</p><p>枚举值：</p><ul><li>1： 所有进程</li></ul> 
     * @return TrackTarget <p>采集对象</p><p>枚举值：</p><ul><li>1： 所有进程</li></ul>
     */
    public Long getTrackTarget() {
        return this.TrackTarget;
    }

    /**
     * Set <p>采集对象</p><p>枚举值：</p><ul><li>1： 所有进程</li></ul>
     * @param TrackTarget <p>采集对象</p><p>枚举值：</p><ul><li>1： 所有进程</li></ul>
     */
    public void setTrackTarget(Long TrackTarget) {
        this.TrackTarget = TrackTarget;
    }

    /**
     * Get <p>三维过滤器</p> 
     * @return Filters <p>三维过滤器</p>
     */
    public EBPFCollectFilters getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>三维过滤器</p>
     * @param Filters <p>三维过滤器</p>
     */
    public void setFilters(EBPFCollectFilters Filters) {
        this.Filters = Filters;
    }

    public EBPFCollectRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EBPFCollectRule(EBPFCollectRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.TrackTarget != null) {
            this.TrackTarget = new Long(source.TrackTarget);
        }
        if (source.Filters != null) {
            this.Filters = new EBPFCollectFilters(source.Filters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "TrackTarget", this.TrackTarget);
        this.setParamObj(map, prefix + "Filters.", this.Filters);

    }
}

