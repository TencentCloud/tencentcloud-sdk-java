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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListUserGroupsOfUserRequest extends AbstractModel{

    /**
    * 用户ID，是用户的全局唯一标识。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 模糊查询条件，支持匹配用户组名称（DisplayName）。如果该字段为空，则默认展示该用户所有的用户组。
    */
    @SerializedName("SearchCondition")
    @Expose
    private UserGroupInformationSearchCriteria SearchCondition;

    /**
    * 排序条件集合。可排序的属性支持：用户组名称（DisplayName）、用户组ID（UserGroupId）、创建时间（CreatedDate）。如果该字段为空，则默认按照用户组名称正向排序。
    */
    @SerializedName("Sort")
    @Expose
    private SortCondition Sort;

    /**
    * 分页偏移量，默认为0。Offset 和 Limit 两个字段需配合使用，即其中一个指定了，另一个必须指定。 如果不指定以上参数，则表示不进行分页查询，即只返回最多50个用户组。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页读取数量，默认为50，最大值为100。 Offset 和 Limit 两个字段需配合使用，即其中一个指定了，另一个必须指定。 如果不指定以上参数，则表示不进行分页查询，即只返回最多50个用户组。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 用户ID，是用户的全局唯一标识。 
     * @return UserId 用户ID，是用户的全局唯一标识。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID，是用户的全局唯一标识。
     * @param UserId 用户ID，是用户的全局唯一标识。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 模糊查询条件，支持匹配用户组名称（DisplayName）。如果该字段为空，则默认展示该用户所有的用户组。 
     * @return SearchCondition 模糊查询条件，支持匹配用户组名称（DisplayName）。如果该字段为空，则默认展示该用户所有的用户组。
     */
    public UserGroupInformationSearchCriteria getSearchCondition() {
        return this.SearchCondition;
    }

    /**
     * Set 模糊查询条件，支持匹配用户组名称（DisplayName）。如果该字段为空，则默认展示该用户所有的用户组。
     * @param SearchCondition 模糊查询条件，支持匹配用户组名称（DisplayName）。如果该字段为空，则默认展示该用户所有的用户组。
     */
    public void setSearchCondition(UserGroupInformationSearchCriteria SearchCondition) {
        this.SearchCondition = SearchCondition;
    }

    /**
     * Get 排序条件集合。可排序的属性支持：用户组名称（DisplayName）、用户组ID（UserGroupId）、创建时间（CreatedDate）。如果该字段为空，则默认按照用户组名称正向排序。 
     * @return Sort 排序条件集合。可排序的属性支持：用户组名称（DisplayName）、用户组ID（UserGroupId）、创建时间（CreatedDate）。如果该字段为空，则默认按照用户组名称正向排序。
     */
    public SortCondition getSort() {
        return this.Sort;
    }

    /**
     * Set 排序条件集合。可排序的属性支持：用户组名称（DisplayName）、用户组ID（UserGroupId）、创建时间（CreatedDate）。如果该字段为空，则默认按照用户组名称正向排序。
     * @param Sort 排序条件集合。可排序的属性支持：用户组名称（DisplayName）、用户组ID（UserGroupId）、创建时间（CreatedDate）。如果该字段为空，则默认按照用户组名称正向排序。
     */
    public void setSort(SortCondition Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 分页偏移量，默认为0。Offset 和 Limit 两个字段需配合使用，即其中一个指定了，另一个必须指定。 如果不指定以上参数，则表示不进行分页查询，即只返回最多50个用户组。 
     * @return Offset 分页偏移量，默认为0。Offset 和 Limit 两个字段需配合使用，即其中一个指定了，另一个必须指定。 如果不指定以上参数，则表示不进行分页查询，即只返回最多50个用户组。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认为0。Offset 和 Limit 两个字段需配合使用，即其中一个指定了，另一个必须指定。 如果不指定以上参数，则表示不进行分页查询，即只返回最多50个用户组。
     * @param Offset 分页偏移量，默认为0。Offset 和 Limit 两个字段需配合使用，即其中一个指定了，另一个必须指定。 如果不指定以上参数，则表示不进行分页查询，即只返回最多50个用户组。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页读取数量，默认为50，最大值为100。 Offset 和 Limit 两个字段需配合使用，即其中一个指定了，另一个必须指定。 如果不指定以上参数，则表示不进行分页查询，即只返回最多50个用户组。 
     * @return Limit 分页读取数量，默认为50，最大值为100。 Offset 和 Limit 两个字段需配合使用，即其中一个指定了，另一个必须指定。 如果不指定以上参数，则表示不进行分页查询，即只返回最多50个用户组。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页读取数量，默认为50，最大值为100。 Offset 和 Limit 两个字段需配合使用，即其中一个指定了，另一个必须指定。 如果不指定以上参数，则表示不进行分页查询，即只返回最多50个用户组。
     * @param Limit 分页读取数量，默认为50，最大值为100。 Offset 和 Limit 两个字段需配合使用，即其中一个指定了，另一个必须指定。 如果不指定以上参数，则表示不进行分页查询，即只返回最多50个用户组。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public ListUserGroupsOfUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUserGroupsOfUserRequest(ListUserGroupsOfUserRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.SearchCondition != null) {
            this.SearchCondition = new UserGroupInformationSearchCriteria(source.SearchCondition);
        }
        if (source.Sort != null) {
            this.Sort = new SortCondition(source.Sort);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamObj(map, prefix + "SearchCondition.", this.SearchCondition);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

