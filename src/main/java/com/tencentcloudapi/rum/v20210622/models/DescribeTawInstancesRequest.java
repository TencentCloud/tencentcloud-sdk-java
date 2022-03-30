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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTawInstancesRequest extends AbstractModel{

    /**
    * 计费状态
    */
    @SerializedName("ChargeStatuses")
    @Expose
    private Long [] ChargeStatuses;

    /**
    * 计费类型
    */
    @SerializedName("ChargeTypes")
    @Expose
    private Long [] ChargeTypes;

    /**
    * 分页Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 片区Id
    */
    @SerializedName("AreaIds")
    @Expose
    private Long [] AreaIds;

    /**
    * 实例状态(1=创建中，2=运行中，3=异常，4=重启中，5=停止中，6=已停止，7=销毁中，8=已销毁)
    */
    @SerializedName("InstanceStatuses")
    @Expose
    private Long [] InstanceStatuses;

    /**
    * 实例Id
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 过滤参数；demo模式传{"Name": "IsDemo", "Values":["1"]}
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 该参数已废弃，demo模式请在Filters内注明
    */
    @SerializedName("IsDemo")
    @Expose
    private Long IsDemo;

    /**
     * Get 计费状态 
     * @return ChargeStatuses 计费状态
     */
    public Long [] getChargeStatuses() {
        return this.ChargeStatuses;
    }

    /**
     * Set 计费状态
     * @param ChargeStatuses 计费状态
     */
    public void setChargeStatuses(Long [] ChargeStatuses) {
        this.ChargeStatuses = ChargeStatuses;
    }

    /**
     * Get 计费类型 
     * @return ChargeTypes 计费类型
     */
    public Long [] getChargeTypes() {
        return this.ChargeTypes;
    }

    /**
     * Set 计费类型
     * @param ChargeTypes 计费类型
     */
    public void setChargeTypes(Long [] ChargeTypes) {
        this.ChargeTypes = ChargeTypes;
    }

    /**
     * Get 分页Limit 
     * @return Limit 分页Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页Limit
     * @param Limit 分页Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页Offset 
     * @return Offset 分页Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页Offset
     * @param Offset 分页Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 片区Id 
     * @return AreaIds 片区Id
     */
    public Long [] getAreaIds() {
        return this.AreaIds;
    }

    /**
     * Set 片区Id
     * @param AreaIds 片区Id
     */
    public void setAreaIds(Long [] AreaIds) {
        this.AreaIds = AreaIds;
    }

    /**
     * Get 实例状态(1=创建中，2=运行中，3=异常，4=重启中，5=停止中，6=已停止，7=销毁中，8=已销毁) 
     * @return InstanceStatuses 实例状态(1=创建中，2=运行中，3=异常，4=重启中，5=停止中，6=已停止，7=销毁中，8=已销毁)
     */
    public Long [] getInstanceStatuses() {
        return this.InstanceStatuses;
    }

    /**
     * Set 实例状态(1=创建中，2=运行中，3=异常，4=重启中，5=停止中，6=已停止，7=销毁中，8=已销毁)
     * @param InstanceStatuses 实例状态(1=创建中，2=运行中，3=异常，4=重启中，5=停止中，6=已停止，7=销毁中，8=已销毁)
     */
    public void setInstanceStatuses(Long [] InstanceStatuses) {
        this.InstanceStatuses = InstanceStatuses;
    }

    /**
     * Get 实例Id 
     * @return InstanceIds 实例Id
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例Id
     * @param InstanceIds 实例Id
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 过滤参数；demo模式传{"Name": "IsDemo", "Values":["1"]} 
     * @return Filters 过滤参数；demo模式传{"Name": "IsDemo", "Values":["1"]}
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤参数；demo模式传{"Name": "IsDemo", "Values":["1"]}
     * @param Filters 过滤参数；demo模式传{"Name": "IsDemo", "Values":["1"]}
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 该参数已废弃，demo模式请在Filters内注明 
     * @return IsDemo 该参数已废弃，demo模式请在Filters内注明
     */
    public Long getIsDemo() {
        return this.IsDemo;
    }

    /**
     * Set 该参数已废弃，demo模式请在Filters内注明
     * @param IsDemo 该参数已废弃，demo模式请在Filters内注明
     */
    public void setIsDemo(Long IsDemo) {
        this.IsDemo = IsDemo;
    }

    public DescribeTawInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTawInstancesRequest(DescribeTawInstancesRequest source) {
        if (source.ChargeStatuses != null) {
            this.ChargeStatuses = new Long[source.ChargeStatuses.length];
            for (int i = 0; i < source.ChargeStatuses.length; i++) {
                this.ChargeStatuses[i] = new Long(source.ChargeStatuses[i]);
            }
        }
        if (source.ChargeTypes != null) {
            this.ChargeTypes = new Long[source.ChargeTypes.length];
            for (int i = 0; i < source.ChargeTypes.length; i++) {
                this.ChargeTypes[i] = new Long(source.ChargeTypes[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.AreaIds != null) {
            this.AreaIds = new Long[source.AreaIds.length];
            for (int i = 0; i < source.AreaIds.length; i++) {
                this.AreaIds[i] = new Long(source.AreaIds[i]);
            }
        }
        if (source.InstanceStatuses != null) {
            this.InstanceStatuses = new Long[source.InstanceStatuses.length];
            for (int i = 0; i < source.InstanceStatuses.length; i++) {
                this.InstanceStatuses[i] = new Long(source.InstanceStatuses[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.IsDemo != null) {
            this.IsDemo = new Long(source.IsDemo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ChargeStatuses.", this.ChargeStatuses);
        this.setParamArraySimple(map, prefix + "ChargeTypes.", this.ChargeTypes);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "AreaIds.", this.AreaIds);
        this.setParamArraySimple(map, prefix + "InstanceStatuses.", this.InstanceStatuses);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "IsDemo", this.IsDemo);

    }
}

