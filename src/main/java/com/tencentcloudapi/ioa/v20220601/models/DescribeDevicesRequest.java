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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDevicesRequest extends AbstractModel {

    /**
    * 过滤条件<br>
<li>Ip - String - 是否必填：否 - 操作符: eq  - 排序支持：否- 按照Ip进行过滤。</li>
<li>MacAddr - String - 是否必填：否 - 操作符: eq  - 排序支持：否- 按照mac地址进行过滤。</li>
<li>IoaUserName - String - 是否必填：否 - 操作符: eq  - 排序支持：否- 按照ioa用户名进行过滤。</li>
分页参数<br>
<li>PageNum 从1开始，小于等于0时使用默认参数。</li>
<li>PageSize 最大值5000，最好不超过100。</li>
    */
    @SerializedName("Condition")
    @Expose
    private Condition Condition;

    /**
    * 私有化默认分组id-名称-操作系统
1	全网终端	Win
2	未分组终端	Win
30000000	服务器	Win
40000101	全网终端	Linux
40000102	未分组终端	Linux
40000103	服务器	Linux
40000201	全网终端	macOS
40000202	未分组终端	macOS
40000203	服务器	macOS
40000401	全网终端	Android
40000402	未分组终端	Android
40000501	全网终端	iOS
40000502	未分组终端	iOS
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 系统类型（0: win，1：linux，2: mac，3: win_srv，4：android，5：ios   默认值0）
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
    * 在线状态 2 在线 0，1 离线
    */
    @SerializedName("OnlineStatus")
    @Expose
    private Long OnlineStatus;

    /**
    * 过滤条件--兼容旧接口,参数同Condition
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序字段--兼容旧接口,参数同Condition
    */
    @SerializedName("Sort")
    @Expose
    private Sort Sort;

    /**
    * 获取第几页--兼容旧接口,参数同Condition(只支持32位)
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 每页获取数--兼容旧接口,参数同Condition(只支持32位)
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 授权状态 4未授权 5已授权
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 过滤条件<br>
<li>Ip - String - 是否必填：否 - 操作符: eq  - 排序支持：否- 按照Ip进行过滤。</li>
<li>MacAddr - String - 是否必填：否 - 操作符: eq  - 排序支持：否- 按照mac地址进行过滤。</li>
<li>IoaUserName - String - 是否必填：否 - 操作符: eq  - 排序支持：否- 按照ioa用户名进行过滤。</li>
分页参数<br>
<li>PageNum 从1开始，小于等于0时使用默认参数。</li>
<li>PageSize 最大值5000，最好不超过100。</li> 
     * @return Condition 过滤条件<br>
<li>Ip - String - 是否必填：否 - 操作符: eq  - 排序支持：否- 按照Ip进行过滤。</li>
<li>MacAddr - String - 是否必填：否 - 操作符: eq  - 排序支持：否- 按照mac地址进行过滤。</li>
<li>IoaUserName - String - 是否必填：否 - 操作符: eq  - 排序支持：否- 按照ioa用户名进行过滤。</li>
分页参数<br>
<li>PageNum 从1开始，小于等于0时使用默认参数。</li>
<li>PageSize 最大值5000，最好不超过100。</li>
     */
    public Condition getCondition() {
        return this.Condition;
    }

    /**
     * Set 过滤条件<br>
<li>Ip - String - 是否必填：否 - 操作符: eq  - 排序支持：否- 按照Ip进行过滤。</li>
<li>MacAddr - String - 是否必填：否 - 操作符: eq  - 排序支持：否- 按照mac地址进行过滤。</li>
<li>IoaUserName - String - 是否必填：否 - 操作符: eq  - 排序支持：否- 按照ioa用户名进行过滤。</li>
分页参数<br>
<li>PageNum 从1开始，小于等于0时使用默认参数。</li>
<li>PageSize 最大值5000，最好不超过100。</li>
     * @param Condition 过滤条件<br>
<li>Ip - String - 是否必填：否 - 操作符: eq  - 排序支持：否- 按照Ip进行过滤。</li>
<li>MacAddr - String - 是否必填：否 - 操作符: eq  - 排序支持：否- 按照mac地址进行过滤。</li>
<li>IoaUserName - String - 是否必填：否 - 操作符: eq  - 排序支持：否- 按照ioa用户名进行过滤。</li>
分页参数<br>
<li>PageNum 从1开始，小于等于0时使用默认参数。</li>
<li>PageSize 最大值5000，最好不超过100。</li>
     */
    public void setCondition(Condition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 私有化默认分组id-名称-操作系统
1	全网终端	Win
2	未分组终端	Win
30000000	服务器	Win
40000101	全网终端	Linux
40000102	未分组终端	Linux
40000103	服务器	Linux
40000201	全网终端	macOS
40000202	未分组终端	macOS
40000203	服务器	macOS
40000401	全网终端	Android
40000402	未分组终端	Android
40000501	全网终端	iOS
40000502	未分组终端	iOS 
     * @return GroupId 私有化默认分组id-名称-操作系统
1	全网终端	Win
2	未分组终端	Win
30000000	服务器	Win
40000101	全网终端	Linux
40000102	未分组终端	Linux
40000103	服务器	Linux
40000201	全网终端	macOS
40000202	未分组终端	macOS
40000203	服务器	macOS
40000401	全网终端	Android
40000402	未分组终端	Android
40000501	全网终端	iOS
40000502	未分组终端	iOS
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 私有化默认分组id-名称-操作系统
1	全网终端	Win
2	未分组终端	Win
30000000	服务器	Win
40000101	全网终端	Linux
40000102	未分组终端	Linux
40000103	服务器	Linux
40000201	全网终端	macOS
40000202	未分组终端	macOS
40000203	服务器	macOS
40000401	全网终端	Android
40000402	未分组终端	Android
40000501	全网终端	iOS
40000502	未分组终端	iOS
     * @param GroupId 私有化默认分组id-名称-操作系统
1	全网终端	Win
2	未分组终端	Win
30000000	服务器	Win
40000101	全网终端	Linux
40000102	未分组终端	Linux
40000103	服务器	Linux
40000201	全网终端	macOS
40000202	未分组终端	macOS
40000203	服务器	macOS
40000401	全网终端	Android
40000402	未分组终端	Android
40000501	全网终端	iOS
40000502	未分组终端	iOS
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 系统类型（0: win，1：linux，2: mac，3: win_srv，4：android，5：ios   默认值0） 
     * @return OsType 系统类型（0: win，1：linux，2: mac，3: win_srv，4：android，5：ios   默认值0）
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set 系统类型（0: win，1：linux，2: mac，3: win_srv，4：android，5：ios   默认值0）
     * @param OsType 系统类型（0: win，1：linux，2: mac，3: win_srv，4：android，5：ios   默认值0）
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    /**
     * Get 在线状态 2 在线 0，1 离线 
     * @return OnlineStatus 在线状态 2 在线 0，1 离线
     */
    public Long getOnlineStatus() {
        return this.OnlineStatus;
    }

    /**
     * Set 在线状态 2 在线 0，1 离线
     * @param OnlineStatus 在线状态 2 在线 0，1 离线
     */
    public void setOnlineStatus(Long OnlineStatus) {
        this.OnlineStatus = OnlineStatus;
    }

    /**
     * Get 过滤条件--兼容旧接口,参数同Condition 
     * @return Filters 过滤条件--兼容旧接口,参数同Condition
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件--兼容旧接口,参数同Condition
     * @param Filters 过滤条件--兼容旧接口,参数同Condition
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段--兼容旧接口,参数同Condition 
     * @return Sort 排序字段--兼容旧接口,参数同Condition
     */
    public Sort getSort() {
        return this.Sort;
    }

    /**
     * Set 排序字段--兼容旧接口,参数同Condition
     * @param Sort 排序字段--兼容旧接口,参数同Condition
     */
    public void setSort(Sort Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 获取第几页--兼容旧接口,参数同Condition(只支持32位) 
     * @return PageNum 获取第几页--兼容旧接口,参数同Condition(只支持32位)
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 获取第几页--兼容旧接口,参数同Condition(只支持32位)
     * @param PageNum 获取第几页--兼容旧接口,参数同Condition(只支持32位)
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 每页获取数--兼容旧接口,参数同Condition(只支持32位) 
     * @return PageSize 每页获取数--兼容旧接口,参数同Condition(只支持32位)
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页获取数--兼容旧接口,参数同Condition(只支持32位)
     * @param PageSize 每页获取数--兼容旧接口,参数同Condition(只支持32位)
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 授权状态 4未授权 5已授权 
     * @return Status 授权状态 4未授权 5已授权
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 授权状态 4未授权 5已授权
     * @param Status 授权状态 4未授权 5已授权
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public DescribeDevicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDevicesRequest(DescribeDevicesRequest source) {
        if (source.Condition != null) {
            this.Condition = new Condition(source.Condition);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
        if (source.OnlineStatus != null) {
            this.OnlineStatus = new Long(source.OnlineStatus);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new Sort(source.Sort);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "OnlineStatus", this.OnlineStatus);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

