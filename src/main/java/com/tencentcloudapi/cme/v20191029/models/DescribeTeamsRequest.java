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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTeamsRequest extends AbstractModel{

    /**
    * 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 团队 ID 列表，限30个。若不填，则默认获取平台下所有团队。
    */
    @SerializedName("TeamIds")
    @Expose
    private String [] TeamIds;

    /**
    * 分页偏移量，默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回记录条数，默认值：20，最大值：30。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。 
     * @return Platform 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     * @param Platform 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 团队 ID 列表，限30个。若不填，则默认获取平台下所有团队。 
     * @return TeamIds 团队 ID 列表，限30个。若不填，则默认获取平台下所有团队。
     */
    public String [] getTeamIds() {
        return this.TeamIds;
    }

    /**
     * Set 团队 ID 列表，限30个。若不填，则默认获取平台下所有团队。
     * @param TeamIds 团队 ID 列表，限30个。若不填，则默认获取平台下所有团队。
     */
    public void setTeamIds(String [] TeamIds) {
        this.TeamIds = TeamIds;
    }

    /**
     * Get 分页偏移量，默认值：0。 
     * @return Offset 分页偏移量，默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认值：0。
     * @param Offset 分页偏移量，默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回记录条数，默认值：20，最大值：30。 
     * @return Limit 返回记录条数，默认值：20，最大值：30。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回记录条数，默认值：20，最大值：30。
     * @param Limit 返回记录条数，默认值：20，最大值：30。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTeamsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTeamsRequest(DescribeTeamsRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.TeamIds != null) {
            this.TeamIds = new String[source.TeamIds.length];
            for (int i = 0; i < source.TeamIds.length; i++) {
                this.TeamIds[i] = new String(source.TeamIds[i]);
            }
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
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamArraySimple(map, prefix + "TeamIds.", this.TeamIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

