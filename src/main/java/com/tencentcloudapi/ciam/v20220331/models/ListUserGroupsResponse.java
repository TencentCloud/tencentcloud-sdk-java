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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListUserGroupsResponse extends AbstractModel{

    /**
    * 用户组列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private UserGroup [] Content;

    /**
    * 总条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 分页
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pageable")
    @Expose
    private Pageable Pageable;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户组列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 用户组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserGroup [] getContent() {
        return this.Content;
    }

    /**
     * Set 用户组列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 用户组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(UserGroup [] Content) {
        this.Content = Content;
    }

    /**
     * Get 总条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 分页
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pageable 分页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Pageable getPageable() {
        return this.Pageable;
    }

    /**
     * Set 分页
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pageable 分页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageable(Pageable Pageable) {
        this.Pageable = Pageable;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ListUserGroupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUserGroupsResponse(ListUserGroupsResponse source) {
        if (source.Content != null) {
            this.Content = new UserGroup[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new UserGroup(source.Content[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Pageable != null) {
            this.Pageable = new Pageable(source.Pageable);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamObj(map, prefix + "Pageable.", this.Pageable);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

