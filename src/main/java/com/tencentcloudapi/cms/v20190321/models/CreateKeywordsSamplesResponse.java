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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateKeywordsSamplesResponse extends AbstractModel{

    /**
    * 添加成功的关键词ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SampleIDs")
    @Expose
    private String [] SampleIDs;

    /**
    * 成功入库关键词列表
    */
    @SerializedName("SuccessInfos")
    @Expose
    private UserKeywordInfo [] SuccessInfos;

    /**
    * 重复关键词列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DupInfos")
    @Expose
    private UserKeywordInfo [] DupInfos;

    /**
    * 无效关键词列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvalidSamples")
    @Expose
    private InvalidSample [] InvalidSamples;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 添加成功的关键词ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SampleIDs 添加成功的关键词ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSampleIDs() {
        return this.SampleIDs;
    }

    /**
     * Set 添加成功的关键词ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SampleIDs 添加成功的关键词ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSampleIDs(String [] SampleIDs) {
        this.SampleIDs = SampleIDs;
    }

    /**
     * Get 成功入库关键词列表 
     * @return SuccessInfos 成功入库关键词列表
     */
    public UserKeywordInfo [] getSuccessInfos() {
        return this.SuccessInfos;
    }

    /**
     * Set 成功入库关键词列表
     * @param SuccessInfos 成功入库关键词列表
     */
    public void setSuccessInfos(UserKeywordInfo [] SuccessInfos) {
        this.SuccessInfos = SuccessInfos;
    }

    /**
     * Get 重复关键词列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DupInfos 重复关键词列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserKeywordInfo [] getDupInfos() {
        return this.DupInfos;
    }

    /**
     * Set 重复关键词列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DupInfos 重复关键词列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDupInfos(UserKeywordInfo [] DupInfos) {
        this.DupInfos = DupInfos;
    }

    /**
     * Get 无效关键词列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvalidSamples 无效关键词列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InvalidSample [] getInvalidSamples() {
        return this.InvalidSamples;
    }

    /**
     * Set 无效关键词列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvalidSamples 无效关键词列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvalidSamples(InvalidSample [] InvalidSamples) {
        this.InvalidSamples = InvalidSamples;
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

    public CreateKeywordsSamplesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateKeywordsSamplesResponse(CreateKeywordsSamplesResponse source) {
        if (source.SampleIDs != null) {
            this.SampleIDs = new String[source.SampleIDs.length];
            for (int i = 0; i < source.SampleIDs.length; i++) {
                this.SampleIDs[i] = new String(source.SampleIDs[i]);
            }
        }
        if (source.SuccessInfos != null) {
            this.SuccessInfos = new UserKeywordInfo[source.SuccessInfos.length];
            for (int i = 0; i < source.SuccessInfos.length; i++) {
                this.SuccessInfos[i] = new UserKeywordInfo(source.SuccessInfos[i]);
            }
        }
        if (source.DupInfos != null) {
            this.DupInfos = new UserKeywordInfo[source.DupInfos.length];
            for (int i = 0; i < source.DupInfos.length; i++) {
                this.DupInfos[i] = new UserKeywordInfo(source.DupInfos[i]);
            }
        }
        if (source.InvalidSamples != null) {
            this.InvalidSamples = new InvalidSample[source.InvalidSamples.length];
            for (int i = 0; i < source.InvalidSamples.length; i++) {
                this.InvalidSamples[i] = new InvalidSample(source.InvalidSamples[i]);
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
        this.setParamArraySimple(map, prefix + "SampleIDs.", this.SampleIDs);
        this.setParamArrayObj(map, prefix + "SuccessInfos.", this.SuccessInfos);
        this.setParamArrayObj(map, prefix + "DupInfos.", this.DupInfos);
        this.setParamArrayObj(map, prefix + "InvalidSamples.", this.InvalidSamples);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

