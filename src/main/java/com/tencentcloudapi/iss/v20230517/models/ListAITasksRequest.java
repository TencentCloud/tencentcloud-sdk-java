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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAITasksRequest extends AbstractModel{

    /**
    * 是否包含通道列表。"true"代表包含通道列表，"false"代表不包含通道列表，默认为 false
    */
    @SerializedName("IsContainChannelList")
    @Expose
    private Boolean IsContainChannelList;

    /**
    * 是否包含AI配置。"true"代表包含任务配置，"false"代表不包含任务配置，默认为 false。
    */
    @SerializedName("IsContainTemplate")
    @Expose
    private Boolean IsContainTemplate;

    /**
    * 页码。默认为1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数量。可选值1～200，默认为20
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 是否包含通道列表。"true"代表包含通道列表，"false"代表不包含通道列表，默认为 false 
     * @return IsContainChannelList 是否包含通道列表。"true"代表包含通道列表，"false"代表不包含通道列表，默认为 false
     */
    public Boolean getIsContainChannelList() {
        return this.IsContainChannelList;
    }

    /**
     * Set 是否包含通道列表。"true"代表包含通道列表，"false"代表不包含通道列表，默认为 false
     * @param IsContainChannelList 是否包含通道列表。"true"代表包含通道列表，"false"代表不包含通道列表，默认为 false
     */
    public void setIsContainChannelList(Boolean IsContainChannelList) {
        this.IsContainChannelList = IsContainChannelList;
    }

    /**
     * Get 是否包含AI配置。"true"代表包含任务配置，"false"代表不包含任务配置，默认为 false。 
     * @return IsContainTemplate 是否包含AI配置。"true"代表包含任务配置，"false"代表不包含任务配置，默认为 false。
     */
    public Boolean getIsContainTemplate() {
        return this.IsContainTemplate;
    }

    /**
     * Set 是否包含AI配置。"true"代表包含任务配置，"false"代表不包含任务配置，默认为 false。
     * @param IsContainTemplate 是否包含AI配置。"true"代表包含任务配置，"false"代表不包含任务配置，默认为 false。
     */
    public void setIsContainTemplate(Boolean IsContainTemplate) {
        this.IsContainTemplate = IsContainTemplate;
    }

    /**
     * Get 页码。默认为1 
     * @return PageNumber 页码。默认为1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码。默认为1
     * @param PageNumber 页码。默认为1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数量。可选值1～200，默认为20 
     * @return PageSize 每页数量。可选值1～200，默认为20
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量。可选值1～200，默认为20
     * @param PageSize 每页数量。可选值1～200，默认为20
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListAITasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAITasksRequest(ListAITasksRequest source) {
        if (source.IsContainChannelList != null) {
            this.IsContainChannelList = new Boolean(source.IsContainChannelList);
        }
        if (source.IsContainTemplate != null) {
            this.IsContainTemplate = new Boolean(source.IsContainTemplate);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsContainChannelList", this.IsContainChannelList);
        this.setParamSimple(map, prefix + "IsContainTemplate", this.IsContainTemplate);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

