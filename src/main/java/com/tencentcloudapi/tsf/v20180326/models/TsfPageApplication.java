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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TsfPageApplication extends AbstractModel {

    /**
    * 应用总数目
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 应用信息列表
    */
    @SerializedName("Content")
    @Expose
    private ApplicationForPage [] Content;

    /**
    * 获取部署组实例列表返回的原始批次个数
    */
    @SerializedName("SpecTotalCount")
    @Expose
    private Long SpecTotalCount;

    /**
     * Get 应用总数目 
     * @return TotalCount 应用总数目
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 应用总数目
     * @param TotalCount 应用总数目
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 应用信息列表 
     * @return Content 应用信息列表
     */
    public ApplicationForPage [] getContent() {
        return this.Content;
    }

    /**
     * Set 应用信息列表
     * @param Content 应用信息列表
     */
    public void setContent(ApplicationForPage [] Content) {
        this.Content = Content;
    }

    /**
     * Get 获取部署组实例列表返回的原始批次个数 
     * @return SpecTotalCount 获取部署组实例列表返回的原始批次个数
     */
    public Long getSpecTotalCount() {
        return this.SpecTotalCount;
    }

    /**
     * Set 获取部署组实例列表返回的原始批次个数
     * @param SpecTotalCount 获取部署组实例列表返回的原始批次个数
     */
    public void setSpecTotalCount(Long SpecTotalCount) {
        this.SpecTotalCount = SpecTotalCount;
    }

    public TsfPageApplication() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TsfPageApplication(TsfPageApplication source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Content != null) {
            this.Content = new ApplicationForPage[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new ApplicationForPage(source.Content[i]);
            }
        }
        if (source.SpecTotalCount != null) {
            this.SpecTotalCount = new Long(source.SpecTotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "SpecTotalCount", this.SpecTotalCount);

    }
}

