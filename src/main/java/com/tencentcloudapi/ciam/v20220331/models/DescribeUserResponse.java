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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserResponse extends AbstractModel {

    /**
    * 总条数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 分页对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pageable")
    @Expose
    private Pageable Pageable;

    /**
    * 用户列表
    */
    @SerializedName("Content")
    @Expose
    private User [] Content;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总条数 
     * @return Total 总条数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总条数
     * @param Total 总条数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 分页对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pageable 分页对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Pageable getPageable() {
        return this.Pageable;
    }

    /**
     * Set 分页对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pageable 分页对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageable(Pageable Pageable) {
        this.Pageable = Pageable;
    }

    /**
     * Get 用户列表 
     * @return Content 用户列表
     */
    public User [] getContent() {
        return this.Content;
    }

    /**
     * Set 用户列表
     * @param Content 用户列表
     */
    public void setContent(User [] Content) {
        this.Content = Content;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeUserResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserResponse(DescribeUserResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Pageable != null) {
            this.Pageable = new Pageable(source.Pageable);
        }
        if (source.Content != null) {
            this.Content = new User[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new User(source.Content[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamObj(map, prefix + "Pageable.", this.Pageable);
        this.setParamArrayObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

