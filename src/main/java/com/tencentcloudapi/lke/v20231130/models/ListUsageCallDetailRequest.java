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

public class ListUsageCallDetailRequest extends AbstractModel {

    /**
    * 模型标识
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 页码（从1开始）
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页数量(最大值1000)
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * uin列表
    */
    @SerializedName("UinAccount")
    @Expose
    private String [] UinAccount;

    /**
    * 应用ID列表
    */
    @SerializedName("AppBizIds")
    @Expose
    private String [] AppBizIds;

    /**
    * 调用类型列表
    */
    @SerializedName("CallType")
    @Expose
    private String CallType;

    /**
    * 筛选子场景
    */
    @SerializedName("SubScenes")
    @Expose
    private String [] SubScenes;

    /**
    * 应用类型(knowledge_qa应用管理， shared_knowlege 共享知识库)
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * 账单明细对应的自定义tag
    */
    @SerializedName("BillingTag")
    @Expose
    private String BillingTag;

    /**
     * Get 模型标识 
     * @return ModelName 模型标识
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型标识
     * @param ModelName 模型标识
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 页码（从1开始） 
     * @return PageNumber 页码（从1开始）
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码（从1开始）
     * @param PageNumber 页码（从1开始）
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页数量(最大值1000) 
     * @return PageSize 分页数量(最大值1000)
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页数量(最大值1000)
     * @param PageSize 分页数量(最大值1000)
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get uin列表 
     * @return UinAccount uin列表
     */
    public String [] getUinAccount() {
        return this.UinAccount;
    }

    /**
     * Set uin列表
     * @param UinAccount uin列表
     */
    public void setUinAccount(String [] UinAccount) {
        this.UinAccount = UinAccount;
    }

    /**
     * Get 应用ID列表 
     * @return AppBizIds 应用ID列表
     */
    public String [] getAppBizIds() {
        return this.AppBizIds;
    }

    /**
     * Set 应用ID列表
     * @param AppBizIds 应用ID列表
     */
    public void setAppBizIds(String [] AppBizIds) {
        this.AppBizIds = AppBizIds;
    }

    /**
     * Get 调用类型列表 
     * @return CallType 调用类型列表
     */
    public String getCallType() {
        return this.CallType;
    }

    /**
     * Set 调用类型列表
     * @param CallType 调用类型列表
     */
    public void setCallType(String CallType) {
        this.CallType = CallType;
    }

    /**
     * Get 筛选子场景 
     * @return SubScenes 筛选子场景
     */
    public String [] getSubScenes() {
        return this.SubScenes;
    }

    /**
     * Set 筛选子场景
     * @param SubScenes 筛选子场景
     */
    public void setSubScenes(String [] SubScenes) {
        this.SubScenes = SubScenes;
    }

    /**
     * Get 应用类型(knowledge_qa应用管理， shared_knowlege 共享知识库) 
     * @return AppType 应用类型(knowledge_qa应用管理， shared_knowlege 共享知识库)
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set 应用类型(knowledge_qa应用管理， shared_knowlege 共享知识库)
     * @param AppType 应用类型(knowledge_qa应用管理， shared_knowlege 共享知识库)
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get 账单明细对应的自定义tag 
     * @return BillingTag 账单明细对应的自定义tag
     */
    public String getBillingTag() {
        return this.BillingTag;
    }

    /**
     * Set 账单明细对应的自定义tag
     * @param BillingTag 账单明细对应的自定义tag
     */
    public void setBillingTag(String BillingTag) {
        this.BillingTag = BillingTag;
    }

    public ListUsageCallDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUsageCallDetailRequest(ListUsageCallDetailRequest source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.UinAccount != null) {
            this.UinAccount = new String[source.UinAccount.length];
            for (int i = 0; i < source.UinAccount.length; i++) {
                this.UinAccount[i] = new String(source.UinAccount[i]);
            }
        }
        if (source.AppBizIds != null) {
            this.AppBizIds = new String[source.AppBizIds.length];
            for (int i = 0; i < source.AppBizIds.length; i++) {
                this.AppBizIds[i] = new String(source.AppBizIds[i]);
            }
        }
        if (source.CallType != null) {
            this.CallType = new String(source.CallType);
        }
        if (source.SubScenes != null) {
            this.SubScenes = new String[source.SubScenes.length];
            for (int i = 0; i < source.SubScenes.length; i++) {
                this.SubScenes[i] = new String(source.SubScenes[i]);
            }
        }
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
        if (source.BillingTag != null) {
            this.BillingTag = new String(source.BillingTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "UinAccount.", this.UinAccount);
        this.setParamArraySimple(map, prefix + "AppBizIds.", this.AppBizIds);
        this.setParamSimple(map, prefix + "CallType", this.CallType);
        this.setParamArraySimple(map, prefix + "SubScenes.", this.SubScenes);
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamSimple(map, prefix + "BillingTag", this.BillingTag);

    }
}

