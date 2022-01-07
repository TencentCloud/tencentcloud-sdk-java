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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAttachedUserAllPoliciesRequest extends AbstractModel{

    /**
    * 目标用户ID
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
    * 每页数量，必须大于 0 且小于或等于 200
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
    * 页码，从 1开始，不能大于 200
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 0:返回直接关联和随组关联策略，1:只返回直接关联策略，2:只返回随组关联策略
    */
    @SerializedName("AttachType")
    @Expose
    private Long AttachType;

    /**
    * 策略类型
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * 搜索关键字
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get 目标用户ID 
     * @return TargetUin 目标用户ID
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set 目标用户ID
     * @param TargetUin 目标用户ID
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
    }

    /**
     * Get 每页数量，必须大于 0 且小于或等于 200 
     * @return Rp 每页数量，必须大于 0 且小于或等于 200
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * Set 每页数量，必须大于 0 且小于或等于 200
     * @param Rp 每页数量，必须大于 0 且小于或等于 200
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    /**
     * Get 页码，从 1开始，不能大于 200 
     * @return Page 页码，从 1开始，不能大于 200
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码，从 1开始，不能大于 200
     * @param Page 页码，从 1开始，不能大于 200
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 0:返回直接关联和随组关联策略，1:只返回直接关联策略，2:只返回随组关联策略 
     * @return AttachType 0:返回直接关联和随组关联策略，1:只返回直接关联策略，2:只返回随组关联策略
     */
    public Long getAttachType() {
        return this.AttachType;
    }

    /**
     * Set 0:返回直接关联和随组关联策略，1:只返回直接关联策略，2:只返回随组关联策略
     * @param AttachType 0:返回直接关联和随组关联策略，1:只返回直接关联策略，2:只返回随组关联策略
     */
    public void setAttachType(Long AttachType) {
        this.AttachType = AttachType;
    }

    /**
     * Get 策略类型 
     * @return StrategyType 策略类型
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 策略类型
     * @param StrategyType 策略类型
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get 搜索关键字 
     * @return Keyword 搜索关键字
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 搜索关键字
     * @param Keyword 搜索关键字
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public ListAttachedUserAllPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAttachedUserAllPoliciesRequest(ListAttachedUserAllPoliciesRequest source) {
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
        if (source.Rp != null) {
            this.Rp = new Long(source.Rp);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.AttachType != null) {
            this.AttachType = new Long(source.AttachType);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new Long(source.StrategyType);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "Rp", this.Rp);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "AttachType", this.AttachType);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

