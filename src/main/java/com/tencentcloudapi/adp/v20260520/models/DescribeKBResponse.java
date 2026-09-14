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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKBResponse extends AbstractModel {

    /**
    * <p>关联的应用 ID 列表</p>
    */
    @SerializedName("AppIdList")
    @Expose
    private String [] AppIdList;

    /**
    * <p>容量信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CapacityInfo")
    @Expose
    private KBCapacity CapacityInfo;

    /**
    * <p>ES 配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsConfig")
    @Expose
    private ESConfig EsConfig;

    /**
    * <p>模型配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelConfig")
    @Expose
    private KBModelConfig ModelConfig;

    /**
    * <p>所有者信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private Operator Owner;

    /**
    * <p>知识库摘要信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Summary")
    @Expose
    private KBSummary Summary;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>关联的应用 ID 列表</p> 
     * @return AppIdList <p>关联的应用 ID 列表</p>
     */
    public String [] getAppIdList() {
        return this.AppIdList;
    }

    /**
     * Set <p>关联的应用 ID 列表</p>
     * @param AppIdList <p>关联的应用 ID 列表</p>
     */
    public void setAppIdList(String [] AppIdList) {
        this.AppIdList = AppIdList;
    }

    /**
     * Get <p>容量信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CapacityInfo <p>容量信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KBCapacity getCapacityInfo() {
        return this.CapacityInfo;
    }

    /**
     * Set <p>容量信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CapacityInfo <p>容量信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCapacityInfo(KBCapacity CapacityInfo) {
        this.CapacityInfo = CapacityInfo;
    }

    /**
     * Get <p>ES 配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsConfig <p>ES 配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ESConfig getEsConfig() {
        return this.EsConfig;
    }

    /**
     * Set <p>ES 配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsConfig <p>ES 配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsConfig(ESConfig EsConfig) {
        this.EsConfig = EsConfig;
    }

    /**
     * Get <p>模型配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelConfig <p>模型配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KBModelConfig getModelConfig() {
        return this.ModelConfig;
    }

    /**
     * Set <p>模型配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelConfig <p>模型配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelConfig(KBModelConfig ModelConfig) {
        this.ModelConfig = ModelConfig;
    }

    /**
     * Get <p>所有者信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner <p>所有者信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Operator getOwner() {
        return this.Owner;
    }

    /**
     * Set <p>所有者信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner <p>所有者信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(Operator Owner) {
        this.Owner = Owner;
    }

    /**
     * Get <p>知识库摘要信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Summary <p>知识库摘要信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KBSummary getSummary() {
        return this.Summary;
    }

    /**
     * Set <p>知识库摘要信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Summary <p>知识库摘要信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummary(KBSummary Summary) {
        this.Summary = Summary;
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

    public DescribeKBResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKBResponse(DescribeKBResponse source) {
        if (source.AppIdList != null) {
            this.AppIdList = new String[source.AppIdList.length];
            for (int i = 0; i < source.AppIdList.length; i++) {
                this.AppIdList[i] = new String(source.AppIdList[i]);
            }
        }
        if (source.CapacityInfo != null) {
            this.CapacityInfo = new KBCapacity(source.CapacityInfo);
        }
        if (source.EsConfig != null) {
            this.EsConfig = new ESConfig(source.EsConfig);
        }
        if (source.ModelConfig != null) {
            this.ModelConfig = new KBModelConfig(source.ModelConfig);
        }
        if (source.Owner != null) {
            this.Owner = new Operator(source.Owner);
        }
        if (source.Summary != null) {
            this.Summary = new KBSummary(source.Summary);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AppIdList.", this.AppIdList);
        this.setParamObj(map, prefix + "CapacityInfo.", this.CapacityInfo);
        this.setParamObj(map, prefix + "EsConfig.", this.EsConfig);
        this.setParamObj(map, prefix + "ModelConfig.", this.ModelConfig);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamObj(map, prefix + "Summary.", this.Summary);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

