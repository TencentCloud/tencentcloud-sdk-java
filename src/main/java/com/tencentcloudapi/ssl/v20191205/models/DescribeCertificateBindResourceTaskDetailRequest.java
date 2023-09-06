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

public class DescribeCertificateBindResourceTaskDetailRequest extends AbstractModel{

    /**
    * 任务ID，根据任务ID查询绑定云资源结果
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 每页展示数量， 默认10，最大值100; 分页总数为云资源地域下实例总数， 即第一页会拉群每个云资源的地域下面Limit数量实例
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * 当前偏移量
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * 查询资源类型的结果详情， 不传则查询所有
    */
    @SerializedName("ResourceTypes")
    @Expose
    private String [] ResourceTypes;

    /**
    * 查询地域列表的数据，CLB、TKE、WAF、APIGATEWAY、TCB支持地域查询， 其他资源类型不支持
    */
    @SerializedName("Regions")
    @Expose
    private String [] Regions;

    /**
     * Get 任务ID，根据任务ID查询绑定云资源结果 
     * @return TaskId 任务ID，根据任务ID查询绑定云资源结果
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID，根据任务ID查询绑定云资源结果
     * @param TaskId 任务ID，根据任务ID查询绑定云资源结果
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 每页展示数量， 默认10，最大值100; 分页总数为云资源地域下实例总数， 即第一页会拉群每个云资源的地域下面Limit数量实例 
     * @return Limit 每页展示数量， 默认10，最大值100; 分页总数为云资源地域下实例总数， 即第一页会拉群每个云资源的地域下面Limit数量实例
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页展示数量， 默认10，最大值100; 分页总数为云资源地域下实例总数， 即第一页会拉群每个云资源的地域下面Limit数量实例
     * @param Limit 每页展示数量， 默认10，最大值100; 分页总数为云资源地域下实例总数， 即第一页会拉群每个云资源的地域下面Limit数量实例
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 当前偏移量 
     * @return Offset 当前偏移量
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set 当前偏移量
     * @param Offset 当前偏移量
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询资源类型的结果详情， 不传则查询所有 
     * @return ResourceTypes 查询资源类型的结果详情， 不传则查询所有
     */
    public String [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set 查询资源类型的结果详情， 不传则查询所有
     * @param ResourceTypes 查询资源类型的结果详情， 不传则查询所有
     */
    public void setResourceTypes(String [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    /**
     * Get 查询地域列表的数据，CLB、TKE、WAF、APIGATEWAY、TCB支持地域查询， 其他资源类型不支持 
     * @return Regions 查询地域列表的数据，CLB、TKE、WAF、APIGATEWAY、TCB支持地域查询， 其他资源类型不支持
     */
    public String [] getRegions() {
        return this.Regions;
    }

    /**
     * Set 查询地域列表的数据，CLB、TKE、WAF、APIGATEWAY、TCB支持地域查询， 其他资源类型不支持
     * @param Regions 查询地域列表的数据，CLB、TKE、WAF、APIGATEWAY、TCB支持地域查询， 其他资源类型不支持
     */
    public void setRegions(String [] Regions) {
        this.Regions = Regions;
    }

    public DescribeCertificateBindResourceTaskDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertificateBindResourceTaskDetailRequest(DescribeCertificateBindResourceTaskDetailRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.ResourceTypes != null) {
            this.ResourceTypes = new String[source.ResourceTypes.length];
            for (int i = 0; i < source.ResourceTypes.length; i++) {
                this.ResourceTypes[i] = new String(source.ResourceTypes[i]);
            }
        }
        if (source.Regions != null) {
            this.Regions = new String[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new String(source.Regions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "ResourceTypes.", this.ResourceTypes);
        this.setParamArraySimple(map, prefix + "Regions.", this.Regions);

    }
}

