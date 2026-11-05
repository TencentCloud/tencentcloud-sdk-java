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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLoginWhiteLearnEDRRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>显式勾选的规则ID列表，最多 1000 个；与 SelectAll 二选一</p>
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * <p>是否跨页全选：true-删除符合 Filters 的全部规则（此时 Filters 必填） false-仅删除 Ids</p>
    */
    @SerializedName("SelectAll")
    @Expose
    private Boolean SelectAll;

    /**
    * <p>多账号目标账号 AppId 列表，最多 1000 个；为空表示仅当前账号；传入但全部无权限时返回 InvalidParameter</p>
    */
    @SerializedName("TargetAppIDs")
    @Expose
    private Long [] TargetAppIDs;

    /**
    * <p>排除的规则ID列表</p>
    */
    @SerializedName("ExcludeIds")
    @Expose
    private Long [] ExcludeIds;

    /**
    * <p>全选条件下的筛选条件</p>
    */
    @SerializedName("Filters")
    @Expose
    private EDRFilter [] Filters;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>显式勾选的规则ID列表，最多 1000 个；与 SelectAll 二选一</p> 
     * @return Ids <p>显式勾选的规则ID列表，最多 1000 个；与 SelectAll 二选一</p>
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set <p>显式勾选的规则ID列表，最多 1000 个；与 SelectAll 二选一</p>
     * @param Ids <p>显式勾选的规则ID列表，最多 1000 个；与 SelectAll 二选一</p>
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get <p>是否跨页全选：true-删除符合 Filters 的全部规则（此时 Filters 必填） false-仅删除 Ids</p> 
     * @return SelectAll <p>是否跨页全选：true-删除符合 Filters 的全部规则（此时 Filters 必填） false-仅删除 Ids</p>
     */
    public Boolean getSelectAll() {
        return this.SelectAll;
    }

    /**
     * Set <p>是否跨页全选：true-删除符合 Filters 的全部规则（此时 Filters 必填） false-仅删除 Ids</p>
     * @param SelectAll <p>是否跨页全选：true-删除符合 Filters 的全部规则（此时 Filters 必填） false-仅删除 Ids</p>
     */
    public void setSelectAll(Boolean SelectAll) {
        this.SelectAll = SelectAll;
    }

    /**
     * Get <p>多账号目标账号 AppId 列表，最多 1000 个；为空表示仅当前账号；传入但全部无权限时返回 InvalidParameter</p> 
     * @return TargetAppIDs <p>多账号目标账号 AppId 列表，最多 1000 个；为空表示仅当前账号；传入但全部无权限时返回 InvalidParameter</p>
     */
    public Long [] getTargetAppIDs() {
        return this.TargetAppIDs;
    }

    /**
     * Set <p>多账号目标账号 AppId 列表，最多 1000 个；为空表示仅当前账号；传入但全部无权限时返回 InvalidParameter</p>
     * @param TargetAppIDs <p>多账号目标账号 AppId 列表，最多 1000 个；为空表示仅当前账号；传入但全部无权限时返回 InvalidParameter</p>
     */
    public void setTargetAppIDs(Long [] TargetAppIDs) {
        this.TargetAppIDs = TargetAppIDs;
    }

    /**
     * Get <p>排除的规则ID列表</p> 
     * @return ExcludeIds <p>排除的规则ID列表</p>
     */
    public Long [] getExcludeIds() {
        return this.ExcludeIds;
    }

    /**
     * Set <p>排除的规则ID列表</p>
     * @param ExcludeIds <p>排除的规则ID列表</p>
     */
    public void setExcludeIds(Long [] ExcludeIds) {
        this.ExcludeIds = ExcludeIds;
    }

    /**
     * Get <p>全选条件下的筛选条件</p> 
     * @return Filters <p>全选条件下的筛选条件</p>
     */
    public EDRFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>全选条件下的筛选条件</p>
     * @param Filters <p>全选条件下的筛选条件</p>
     */
    public void setFilters(EDRFilter [] Filters) {
        this.Filters = Filters;
    }

    public DeleteLoginWhiteLearnEDRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLoginWhiteLearnEDRRequest(DeleteLoginWhiteLearnEDRRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.SelectAll != null) {
            this.SelectAll = new Boolean(source.SelectAll);
        }
        if (source.TargetAppIDs != null) {
            this.TargetAppIDs = new Long[source.TargetAppIDs.length];
            for (int i = 0; i < source.TargetAppIDs.length; i++) {
                this.TargetAppIDs[i] = new Long(source.TargetAppIDs[i]);
            }
        }
        if (source.ExcludeIds != null) {
            this.ExcludeIds = new Long[source.ExcludeIds.length];
            for (int i = 0; i < source.ExcludeIds.length; i++) {
                this.ExcludeIds[i] = new Long(source.ExcludeIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new EDRFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new EDRFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "SelectAll", this.SelectAll);
        this.setParamArraySimple(map, prefix + "TargetAppIDs.", this.TargetAppIDs);
        this.setParamArraySimple(map, prefix + "ExcludeIds.", this.ExcludeIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

