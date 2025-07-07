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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListClsLogTopicsResponse extends AbstractModel {

    /**
    * 上海区域日志集信息
    */
    @SerializedName("Logset")
    @Expose
    private LogSetInfo Logset;

    /**
    * 上海区域日志主题信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topics")
    @Expose
    private TopicInfo [] Topics;

    /**
    * 其他区域日志集信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraLogset")
    @Expose
    private ExtraLogset [] ExtraLogset;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 上海区域日志集信息 
     * @return Logset 上海区域日志集信息
     */
    public LogSetInfo getLogset() {
        return this.Logset;
    }

    /**
     * Set 上海区域日志集信息
     * @param Logset 上海区域日志集信息
     */
    public void setLogset(LogSetInfo Logset) {
        this.Logset = Logset;
    }

    /**
     * Get 上海区域日志主题信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topics 上海区域日志主题信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TopicInfo [] getTopics() {
        return this.Topics;
    }

    /**
     * Set 上海区域日志主题信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topics 上海区域日志主题信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopics(TopicInfo [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get 其他区域日志集信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraLogset 其他区域日志集信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExtraLogset [] getExtraLogset() {
        return this.ExtraLogset;
    }

    /**
     * Set 其他区域日志集信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraLogset 其他区域日志集信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraLogset(ExtraLogset [] ExtraLogset) {
        this.ExtraLogset = ExtraLogset;
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

    public ListClsLogTopicsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListClsLogTopicsResponse(ListClsLogTopicsResponse source) {
        if (source.Logset != null) {
            this.Logset = new LogSetInfo(source.Logset);
        }
        if (source.Topics != null) {
            this.Topics = new TopicInfo[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new TopicInfo(source.Topics[i]);
            }
        }
        if (source.ExtraLogset != null) {
            this.ExtraLogset = new ExtraLogset[source.ExtraLogset.length];
            for (int i = 0; i < source.ExtraLogset.length; i++) {
                this.ExtraLogset[i] = new ExtraLogset(source.ExtraLogset[i]);
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
        this.setParamObj(map, prefix + "Logset.", this.Logset);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);
        this.setParamArrayObj(map, prefix + "ExtraLogset.", this.ExtraLogset);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

