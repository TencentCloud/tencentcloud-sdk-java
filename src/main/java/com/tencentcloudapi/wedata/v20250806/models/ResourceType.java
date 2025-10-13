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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceType extends AbstractModel {

    /**
    * 资源组类型

- Schedule --- 调度资源组
- Integration --- 集成资源组
- DataService -- 数据服务资源组
    */
    @SerializedName("ResourceGroupType")
    @Expose
    private String ResourceGroupType;

    /**
    * 集成资源组，细分实时资源组和离线资源组(集成、调度、数据服务资源组不可以同时购买)
    */
    @SerializedName("Integration")
    @Expose
    private IntegrationResource Integration;

    /**
    * 调度资源组(集成、调度、数据服务资源组不可以同时购买)

- s_test(测试规格)
- s_small(基础规格)
- s_medium(普及规格)
- s_large(专业规格)



    */
    @SerializedName("Schedule")
    @Expose
    private ResourceGroupSpecification Schedule;

    /**
    * 数据服务资源组(集成、调度、数据服务资源组不可以同时购买)

- ds_t(测试规格)
- ds_s(基础规格)
- ds_m(普及规格)
- ds_l(专业规格)
    */
    @SerializedName("DataService")
    @Expose
    private ResourceGroupSpecification DataService;

    /**
     * Get 资源组类型

- Schedule --- 调度资源组
- Integration --- 集成资源组
- DataService -- 数据服务资源组 
     * @return ResourceGroupType 资源组类型

- Schedule --- 调度资源组
- Integration --- 集成资源组
- DataService -- 数据服务资源组
     */
    public String getResourceGroupType() {
        return this.ResourceGroupType;
    }

    /**
     * Set 资源组类型

- Schedule --- 调度资源组
- Integration --- 集成资源组
- DataService -- 数据服务资源组
     * @param ResourceGroupType 资源组类型

- Schedule --- 调度资源组
- Integration --- 集成资源组
- DataService -- 数据服务资源组
     */
    public void setResourceGroupType(String ResourceGroupType) {
        this.ResourceGroupType = ResourceGroupType;
    }

    /**
     * Get 集成资源组，细分实时资源组和离线资源组(集成、调度、数据服务资源组不可以同时购买) 
     * @return Integration 集成资源组，细分实时资源组和离线资源组(集成、调度、数据服务资源组不可以同时购买)
     */
    public IntegrationResource getIntegration() {
        return this.Integration;
    }

    /**
     * Set 集成资源组，细分实时资源组和离线资源组(集成、调度、数据服务资源组不可以同时购买)
     * @param Integration 集成资源组，细分实时资源组和离线资源组(集成、调度、数据服务资源组不可以同时购买)
     */
    public void setIntegration(IntegrationResource Integration) {
        this.Integration = Integration;
    }

    /**
     * Get 调度资源组(集成、调度、数据服务资源组不可以同时购买)

- s_test(测试规格)
- s_small(基础规格)
- s_medium(普及规格)
- s_large(专业规格)


 
     * @return Schedule 调度资源组(集成、调度、数据服务资源组不可以同时购买)

- s_test(测试规格)
- s_small(基础规格)
- s_medium(普及规格)
- s_large(专业规格)



     */
    public ResourceGroupSpecification getSchedule() {
        return this.Schedule;
    }

    /**
     * Set 调度资源组(集成、调度、数据服务资源组不可以同时购买)

- s_test(测试规格)
- s_small(基础规格)
- s_medium(普及规格)
- s_large(专业规格)



     * @param Schedule 调度资源组(集成、调度、数据服务资源组不可以同时购买)

- s_test(测试规格)
- s_small(基础规格)
- s_medium(普及规格)
- s_large(专业规格)



     */
    public void setSchedule(ResourceGroupSpecification Schedule) {
        this.Schedule = Schedule;
    }

    /**
     * Get 数据服务资源组(集成、调度、数据服务资源组不可以同时购买)

- ds_t(测试规格)
- ds_s(基础规格)
- ds_m(普及规格)
- ds_l(专业规格) 
     * @return DataService 数据服务资源组(集成、调度、数据服务资源组不可以同时购买)

- ds_t(测试规格)
- ds_s(基础规格)
- ds_m(普及规格)
- ds_l(专业规格)
     */
    public ResourceGroupSpecification getDataService() {
        return this.DataService;
    }

    /**
     * Set 数据服务资源组(集成、调度、数据服务资源组不可以同时购买)

- ds_t(测试规格)
- ds_s(基础规格)
- ds_m(普及规格)
- ds_l(专业规格)
     * @param DataService 数据服务资源组(集成、调度、数据服务资源组不可以同时购买)

- ds_t(测试规格)
- ds_s(基础规格)
- ds_m(普及规格)
- ds_l(专业规格)
     */
    public void setDataService(ResourceGroupSpecification DataService) {
        this.DataService = DataService;
    }

    public ResourceType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceType(ResourceType source) {
        if (source.ResourceGroupType != null) {
            this.ResourceGroupType = new String(source.ResourceGroupType);
        }
        if (source.Integration != null) {
            this.Integration = new IntegrationResource(source.Integration);
        }
        if (source.Schedule != null) {
            this.Schedule = new ResourceGroupSpecification(source.Schedule);
        }
        if (source.DataService != null) {
            this.DataService = new ResourceGroupSpecification(source.DataService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceGroupType", this.ResourceGroupType);
        this.setParamObj(map, prefix + "Integration.", this.Integration);
        this.setParamObj(map, prefix + "Schedule.", this.Schedule);
        this.setParamObj(map, prefix + "DataService.", this.DataService);

    }
}

