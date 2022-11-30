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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSpecResponse extends AbstractModel{

    /**
    * zookeeper节点规格描述
    */
    @SerializedName("CommonSpec")
    @Expose
    private ResourceSpec [] CommonSpec;

    /**
    * 数据节点规格描述
    */
    @SerializedName("DataSpec")
    @Expose
    private ResourceSpec [] DataSpec;

    /**
    * 云盘列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachCBSSpec")
    @Expose
    private DiskSpec [] AttachCBSSpec;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get zookeeper节点规格描述 
     * @return CommonSpec zookeeper节点规格描述
     */
    public ResourceSpec [] getCommonSpec() {
        return this.CommonSpec;
    }

    /**
     * Set zookeeper节点规格描述
     * @param CommonSpec zookeeper节点规格描述
     */
    public void setCommonSpec(ResourceSpec [] CommonSpec) {
        this.CommonSpec = CommonSpec;
    }

    /**
     * Get 数据节点规格描述 
     * @return DataSpec 数据节点规格描述
     */
    public ResourceSpec [] getDataSpec() {
        return this.DataSpec;
    }

    /**
     * Set 数据节点规格描述
     * @param DataSpec 数据节点规格描述
     */
    public void setDataSpec(ResourceSpec [] DataSpec) {
        this.DataSpec = DataSpec;
    }

    /**
     * Get 云盘列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachCBSSpec 云盘列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiskSpec [] getAttachCBSSpec() {
        return this.AttachCBSSpec;
    }

    /**
     * Set 云盘列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachCBSSpec 云盘列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachCBSSpec(DiskSpec [] AttachCBSSpec) {
        this.AttachCBSSpec = AttachCBSSpec;
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

    public DescribeSpecResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSpecResponse(DescribeSpecResponse source) {
        if (source.CommonSpec != null) {
            this.CommonSpec = new ResourceSpec[source.CommonSpec.length];
            for (int i = 0; i < source.CommonSpec.length; i++) {
                this.CommonSpec[i] = new ResourceSpec(source.CommonSpec[i]);
            }
        }
        if (source.DataSpec != null) {
            this.DataSpec = new ResourceSpec[source.DataSpec.length];
            for (int i = 0; i < source.DataSpec.length; i++) {
                this.DataSpec[i] = new ResourceSpec(source.DataSpec[i]);
            }
        }
        if (source.AttachCBSSpec != null) {
            this.AttachCBSSpec = new DiskSpec[source.AttachCBSSpec.length];
            for (int i = 0; i < source.AttachCBSSpec.length; i++) {
                this.AttachCBSSpec[i] = new DiskSpec(source.AttachCBSSpec[i]);
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
        this.setParamArrayObj(map, prefix + "CommonSpec.", this.CommonSpec);
        this.setParamArrayObj(map, prefix + "DataSpec.", this.DataSpec);
        this.setParamArrayObj(map, prefix + "AttachCBSSpec.", this.AttachCBSSpec);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

