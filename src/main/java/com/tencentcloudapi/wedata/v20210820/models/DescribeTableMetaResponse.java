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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTableMetaResponse extends AbstractModel {

    /**
    * 表的元数据信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableMeta")
    @Expose
    private TableMeta TableMeta;

    /**
    * 生命周期信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LifecycleInfo")
    @Expose
    private LifecycleInfo LifecycleInfo;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagVoteSumList")
    @Expose
    private TagVoteSum TagVoteSumList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 表的元数据信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableMeta 表的元数据信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TableMeta getTableMeta() {
        return this.TableMeta;
    }

    /**
     * Set 表的元数据信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableMeta 表的元数据信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableMeta(TableMeta TableMeta) {
        this.TableMeta = TableMeta;
    }

    /**
     * Get 生命周期信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LifecycleInfo 生命周期信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LifecycleInfo getLifecycleInfo() {
        return this.LifecycleInfo;
    }

    /**
     * Set 生命周期信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param LifecycleInfo 生命周期信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifecycleInfo(LifecycleInfo LifecycleInfo) {
        this.LifecycleInfo = LifecycleInfo;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagVoteSumList 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagVoteSum getTagVoteSumList() {
        return this.TagVoteSumList;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagVoteSumList 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagVoteSumList(TagVoteSum TagVoteSumList) {
        this.TagVoteSumList = TagVoteSumList;
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

    public DescribeTableMetaResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableMetaResponse(DescribeTableMetaResponse source) {
        if (source.TableMeta != null) {
            this.TableMeta = new TableMeta(source.TableMeta);
        }
        if (source.LifecycleInfo != null) {
            this.LifecycleInfo = new LifecycleInfo(source.LifecycleInfo);
        }
        if (source.TagVoteSumList != null) {
            this.TagVoteSumList = new TagVoteSum(source.TagVoteSumList);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TableMeta.", this.TableMeta);
        this.setParamObj(map, prefix + "LifecycleInfo.", this.LifecycleInfo);
        this.setParamObj(map, prefix + "TagVoteSumList.", this.TagVoteSumList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

