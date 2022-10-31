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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExtensionsRequest extends AbstractModel{

    /**
    * TCCC 实例应用 ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 分页页号（从0开始）
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 筛选分机号列表
    */
    @SerializedName("ExtensionIds")
    @Expose
    private String [] ExtensionIds;

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 模糊查询字段（模糊查询分机号、分机名称、坐席邮箱、坐席名称）
    */
    @SerializedName("FuzzingKeyWord")
    @Expose
    private String FuzzingKeyWord;

    /**
    * 是否需要返回话机当前状态
    */
    @SerializedName("IsNeedStatus")
    @Expose
    private Boolean IsNeedStatus;

    /**
     * Get TCCC 实例应用 ID 
     * @return SdkAppId TCCC 实例应用 ID
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TCCC 实例应用 ID
     * @param SdkAppId TCCC 实例应用 ID
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 分页页号（从0开始） 
     * @return PageNumber 分页页号（从0开始）
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页页号（从0开始）
     * @param PageNumber 分页页号（从0开始）
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 筛选分机号列表 
     * @return ExtensionIds 筛选分机号列表
     */
    public String [] getExtensionIds() {
        return this.ExtensionIds;
    }

    /**
     * Set 筛选分机号列表
     * @param ExtensionIds 筛选分机号列表
     */
    public void setExtensionIds(String [] ExtensionIds) {
        this.ExtensionIds = ExtensionIds;
    }

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 模糊查询字段（模糊查询分机号、分机名称、坐席邮箱、坐席名称） 
     * @return FuzzingKeyWord 模糊查询字段（模糊查询分机号、分机名称、坐席邮箱、坐席名称）
     */
    public String getFuzzingKeyWord() {
        return this.FuzzingKeyWord;
    }

    /**
     * Set 模糊查询字段（模糊查询分机号、分机名称、坐席邮箱、坐席名称）
     * @param FuzzingKeyWord 模糊查询字段（模糊查询分机号、分机名称、坐席邮箱、坐席名称）
     */
    public void setFuzzingKeyWord(String FuzzingKeyWord) {
        this.FuzzingKeyWord = FuzzingKeyWord;
    }

    /**
     * Get 是否需要返回话机当前状态 
     * @return IsNeedStatus 是否需要返回话机当前状态
     */
    public Boolean getIsNeedStatus() {
        return this.IsNeedStatus;
    }

    /**
     * Set 是否需要返回话机当前状态
     * @param IsNeedStatus 是否需要返回话机当前状态
     */
    public void setIsNeedStatus(Boolean IsNeedStatus) {
        this.IsNeedStatus = IsNeedStatus;
    }

    public DescribeExtensionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExtensionsRequest(DescribeExtensionsRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.ExtensionIds != null) {
            this.ExtensionIds = new String[source.ExtensionIds.length];
            for (int i = 0; i < source.ExtensionIds.length; i++) {
                this.ExtensionIds[i] = new String(source.ExtensionIds[i]);
            }
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.FuzzingKeyWord != null) {
            this.FuzzingKeyWord = new String(source.FuzzingKeyWord);
        }
        if (source.IsNeedStatus != null) {
            this.IsNeedStatus = new Boolean(source.IsNeedStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamArraySimple(map, prefix + "ExtensionIds.", this.ExtensionIds);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "FuzzingKeyWord", this.FuzzingKeyWord);
        this.setParamSimple(map, prefix + "IsNeedStatus", this.IsNeedStatus);

    }
}

