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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRecordDetails extends AbstractModel{

    /**
    * 部署资源类型
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 部署资源详情列表
    */
    @SerializedName("List")
    @Expose
    private UpdateRecordDetail [] List;

    /**
    * 该部署资源总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 部署资源类型 
     * @return ResourceType 部署资源类型
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 部署资源类型
     * @param ResourceType 部署资源类型
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 部署资源详情列表 
     * @return List 部署资源详情列表
     */
    public UpdateRecordDetail [] getList() {
        return this.List;
    }

    /**
     * Set 部署资源详情列表
     * @param List 部署资源详情列表
     */
    public void setList(UpdateRecordDetail [] List) {
        this.List = List;
    }

    /**
     * Get 该部署资源总数 
     * @return TotalCount 该部署资源总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 该部署资源总数
     * @param TotalCount 该部署资源总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public UpdateRecordDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRecordDetails(UpdateRecordDetails source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.List != null) {
            this.List = new UpdateRecordDetail[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new UpdateRecordDetail(source.List[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

