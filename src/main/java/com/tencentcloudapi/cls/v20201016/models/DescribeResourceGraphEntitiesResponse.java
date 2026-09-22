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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceGraphEntitiesResponse extends AbstractModel {

    /**
    * <p>实体列表</p>
    */
    @SerializedName("EntityInfos")
    @Expose
    private EntityInfo [] EntityInfos;

    /**
    * <p>是否还有下一页</p><p>枚举值：</p><ul><li>0： 没有下一页</li><li>1： 还有下一页</li></ul>
    */
    @SerializedName("HasMore")
    @Expose
    private Long HasMore;

    /**
    * <p>分页的游标，有值则下次分页请求原样带上，无值则表示无下一页</p>
    */
    @SerializedName("NextCursor")
    @Expose
    private String NextCursor;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>实体列表</p> 
     * @return EntityInfos <p>实体列表</p>
     */
    public EntityInfo [] getEntityInfos() {
        return this.EntityInfos;
    }

    /**
     * Set <p>实体列表</p>
     * @param EntityInfos <p>实体列表</p>
     */
    public void setEntityInfos(EntityInfo [] EntityInfos) {
        this.EntityInfos = EntityInfos;
    }

    /**
     * Get <p>是否还有下一页</p><p>枚举值：</p><ul><li>0： 没有下一页</li><li>1： 还有下一页</li></ul> 
     * @return HasMore <p>是否还有下一页</p><p>枚举值：</p><ul><li>0： 没有下一页</li><li>1： 还有下一页</li></ul>
     */
    public Long getHasMore() {
        return this.HasMore;
    }

    /**
     * Set <p>是否还有下一页</p><p>枚举值：</p><ul><li>0： 没有下一页</li><li>1： 还有下一页</li></ul>
     * @param HasMore <p>是否还有下一页</p><p>枚举值：</p><ul><li>0： 没有下一页</li><li>1： 还有下一页</li></ul>
     */
    public void setHasMore(Long HasMore) {
        this.HasMore = HasMore;
    }

    /**
     * Get <p>分页的游标，有值则下次分页请求原样带上，无值则表示无下一页</p> 
     * @return NextCursor <p>分页的游标，有值则下次分页请求原样带上，无值则表示无下一页</p>
     */
    public String getNextCursor() {
        return this.NextCursor;
    }

    /**
     * Set <p>分页的游标，有值则下次分页请求原样带上，无值则表示无下一页</p>
     * @param NextCursor <p>分页的游标，有值则下次分页请求原样带上，无值则表示无下一页</p>
     */
    public void setNextCursor(String NextCursor) {
        this.NextCursor = NextCursor;
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

    public DescribeResourceGraphEntitiesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceGraphEntitiesResponse(DescribeResourceGraphEntitiesResponse source) {
        if (source.EntityInfos != null) {
            this.EntityInfos = new EntityInfo[source.EntityInfos.length];
            for (int i = 0; i < source.EntityInfos.length; i++) {
                this.EntityInfos[i] = new EntityInfo(source.EntityInfos[i]);
            }
        }
        if (source.HasMore != null) {
            this.HasMore = new Long(source.HasMore);
        }
        if (source.NextCursor != null) {
            this.NextCursor = new String(source.NextCursor);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "EntityInfos.", this.EntityInfos);
        this.setParamSimple(map, prefix + "HasMore", this.HasMore);
        this.setParamSimple(map, prefix + "NextCursor", this.NextCursor);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

