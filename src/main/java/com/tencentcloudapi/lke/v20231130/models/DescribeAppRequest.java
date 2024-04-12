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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAppRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

    /**
    * 应用类型；knowledge_qa-知识问答管理；summary-知识摘要；classifys-知识标签提取
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * 是否发布后的配置
    */
    @SerializedName("IsRelease")
    @Expose
    private Boolean IsRelease;

    /**
     * Get 应用ID 
     * @return AppBizId 应用ID
     */
    public String getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set 应用ID
     * @param AppBizId 应用ID
     */
    public void setAppBizId(String AppBizId) {
        this.AppBizId = AppBizId;
    }

    /**
     * Get 应用类型；knowledge_qa-知识问答管理；summary-知识摘要；classifys-知识标签提取 
     * @return AppType 应用类型；knowledge_qa-知识问答管理；summary-知识摘要；classifys-知识标签提取
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set 应用类型；knowledge_qa-知识问答管理；summary-知识摘要；classifys-知识标签提取
     * @param AppType 应用类型；knowledge_qa-知识问答管理；summary-知识摘要；classifys-知识标签提取
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get 是否发布后的配置 
     * @return IsRelease 是否发布后的配置
     */
    public Boolean getIsRelease() {
        return this.IsRelease;
    }

    /**
     * Set 是否发布后的配置
     * @param IsRelease 是否发布后的配置
     */
    public void setIsRelease(Boolean IsRelease) {
        this.IsRelease = IsRelease;
    }

    public DescribeAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAppRequest(DescribeAppRequest source) {
        if (source.AppBizId != null) {
            this.AppBizId = new String(source.AppBizId);
        }
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
        if (source.IsRelease != null) {
            this.IsRelease = new Boolean(source.IsRelease);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppBizId", this.AppBizId);
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamSimple(map, prefix + "IsRelease", this.IsRelease);

    }
}

