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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCanNotSeparateMachineRequest extends AbstractModel{

    /**
    * 需要修改的事件id 数组，支持批量
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * 是否更新全部，即是否对所有的事件进行操作，当ids 不为空时，此参数无效
    */
    @SerializedName("UpdateAll")
    @Expose
    private Boolean UpdateAll;

    /**
    * 排除的事件id,当操作全部事件时，需要排除这次id
    */
    @SerializedName("ExcludeId")
    @Expose
    private Long [] ExcludeId;

    /**
    * <li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>FilePath - String - 是否必填：否 - 路径筛选</li>
<li>VirusName - String - 是否必填：否 - 描述筛选</li>
<li>CreateBeginTime - String - 是否必填：否 - 创建时间筛选-开始时间</li>
<li>CreateEndTime - String - 是否必填：否 - 创建时间筛选-结束时间</li>
<li>Status - String - 是否必填：否 - 状态筛选 4待处理,5信任,6已隔离,10隔离中,11恢复隔离中</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get 需要修改的事件id 数组，支持批量 
     * @return Ids 需要修改的事件id 数组，支持批量
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set 需要修改的事件id 数组，支持批量
     * @param Ids 需要修改的事件id 数组，支持批量
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get 是否更新全部，即是否对所有的事件进行操作，当ids 不为空时，此参数无效 
     * @return UpdateAll 是否更新全部，即是否对所有的事件进行操作，当ids 不为空时，此参数无效
     */
    public Boolean getUpdateAll() {
        return this.UpdateAll;
    }

    /**
     * Set 是否更新全部，即是否对所有的事件进行操作，当ids 不为空时，此参数无效
     * @param UpdateAll 是否更新全部，即是否对所有的事件进行操作，当ids 不为空时，此参数无效
     */
    public void setUpdateAll(Boolean UpdateAll) {
        this.UpdateAll = UpdateAll;
    }

    /**
     * Get 排除的事件id,当操作全部事件时，需要排除这次id 
     * @return ExcludeId 排除的事件id,当操作全部事件时，需要排除这次id
     */
    public Long [] getExcludeId() {
        return this.ExcludeId;
    }

    /**
     * Set 排除的事件id,当操作全部事件时，需要排除这次id
     * @param ExcludeId 排除的事件id,当操作全部事件时，需要排除这次id
     */
    public void setExcludeId(Long [] ExcludeId) {
        this.ExcludeId = ExcludeId;
    }

    /**
     * Get <li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>FilePath - String - 是否必填：否 - 路径筛选</li>
<li>VirusName - String - 是否必填：否 - 描述筛选</li>
<li>CreateBeginTime - String - 是否必填：否 - 创建时间筛选-开始时间</li>
<li>CreateEndTime - String - 是否必填：否 - 创建时间筛选-结束时间</li>
<li>Status - String - 是否必填：否 - 状态筛选 4待处理,5信任,6已隔离,10隔离中,11恢复隔离中</li> 
     * @return Filters <li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>FilePath - String - 是否必填：否 - 路径筛选</li>
<li>VirusName - String - 是否必填：否 - 描述筛选</li>
<li>CreateBeginTime - String - 是否必填：否 - 创建时间筛选-开始时间</li>
<li>CreateEndTime - String - 是否必填：否 - 创建时间筛选-结束时间</li>
<li>Status - String - 是否必填：否 - 状态筛选 4待处理,5信任,6已隔离,10隔离中,11恢复隔离中</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>FilePath - String - 是否必填：否 - 路径筛选</li>
<li>VirusName - String - 是否必填：否 - 描述筛选</li>
<li>CreateBeginTime - String - 是否必填：否 - 创建时间筛选-开始时间</li>
<li>CreateEndTime - String - 是否必填：否 - 创建时间筛选-结束时间</li>
<li>Status - String - 是否必填：否 - 状态筛选 4待处理,5信任,6已隔离,10隔离中,11恢复隔离中</li>
     * @param Filters <li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>FilePath - String - 是否必填：否 - 路径筛选</li>
<li>VirusName - String - 是否必填：否 - 描述筛选</li>
<li>CreateBeginTime - String - 是否必填：否 - 创建时间筛选-开始时间</li>
<li>CreateEndTime - String - 是否必填：否 - 创建时间筛选-结束时间</li>
<li>Status - String - 是否必填：否 - 状态筛选 4待处理,5信任,6已隔离,10隔离中,11恢复隔离中</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCanNotSeparateMachineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCanNotSeparateMachineRequest(DescribeCanNotSeparateMachineRequest source) {
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.UpdateAll != null) {
            this.UpdateAll = new Boolean(source.UpdateAll);
        }
        if (source.ExcludeId != null) {
            this.ExcludeId = new Long[source.ExcludeId.length];
            for (int i = 0; i < source.ExcludeId.length; i++) {
                this.ExcludeId[i] = new Long(source.ExcludeId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "UpdateAll", this.UpdateAll);
        this.setParamArraySimple(map, prefix + "ExcludeId.", this.ExcludeId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

